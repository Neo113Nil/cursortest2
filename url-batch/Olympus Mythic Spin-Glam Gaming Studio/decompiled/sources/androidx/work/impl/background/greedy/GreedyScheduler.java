package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.StartStopToken;
import androidx.work.impl.StartStopTokens;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.ProcessUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@RestrictTo
/* loaded from: classes12.dex */
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {
    private static final String TAG = Logger.tagWithPrefix("GreedyScheduler");
    private final Context mContext;
    private DelayedWorkTracker mDelayedWorkTracker;
    Boolean mInDefaultProcess;
    private boolean mRegisteredExecutionListener;
    private final WorkConstraintsTracker mWorkConstraintsTracker;
    private final WorkManagerImpl mWorkManagerImpl;
    private final Set mConstrainedWorkSpecs = new HashSet();
    private final StartStopTokens mStartStopTokens = new StartStopTokens();
    private final Object mLock = new Object();

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return false;
    }

    public GreedyScheduler(Context context, Configuration configuration, Trackers trackers, WorkManagerImpl workManagerImpl) {
        this.mContext = context;
        this.mWorkManagerImpl = workManagerImpl;
        this.mWorkConstraintsTracker = new WorkConstraintsTrackerImpl(trackers, this);
        this.mDelayedWorkTracker = new DelayedWorkTracker(this, configuration.getRunnableScheduler());
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(WorkSpec... workSpecArr) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in a secondary process");
            return;
        }
        registerExecutionListenerIfNeeded();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                long calculateNextRunTime = workSpec.calculateNextRunTime();
                long currentTimeMillis = System.currentTimeMillis();
                if (workSpec.state == WorkInfo.State.ENQUEUED) {
                    if (currentTimeMillis < calculateNextRunTime) {
                        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
                        if (delayedWorkTracker != null) {
                            delayedWorkTracker.schedule(workSpec);
                        }
                    } else if (workSpec.hasConstraints()) {
                        if (workSpec.constraints.getRequiresDeviceIdle()) {
                            Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires device idle.");
                        } else if (workSpec.constraints.hasContentUriTriggers()) {
                            Logger.get().debug(TAG, "Ignoring " + workSpec + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(workSpec);
                            hashSet2.add(workSpec.id);
                        }
                    } else if (!this.mStartStopTokens.contains(WorkSpecKt.generationalId(workSpec))) {
                        Logger.get().debug(TAG, "Starting work for " + workSpec.id);
                        this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(workSpec));
                    }
                }
            }
        }
        synchronized (this.mLock) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.get().debug(TAG, "Starting tracking for " + TextUtils.join(StringUtils.COMMA, hashSet2));
                    this.mConstrainedWorkSpecs.addAll(hashSet);
                    this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void checkDefaultProcess() {
        this.mInDefaultProcess = Boolean.valueOf(ProcessUtils.isDefaultProcess(this.mContext, this.mWorkManagerImpl.getConfiguration()));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(String str) {
        if (this.mInDefaultProcess == null) {
            checkDefaultProcess();
        }
        if (!this.mInDefaultProcess.booleanValue()) {
            Logger.get().info(TAG, "Ignoring schedule request in non-main process");
            return;
        }
        registerExecutionListenerIfNeeded();
        Logger.get().debug(TAG, "Cancelling work ID " + str);
        DelayedWorkTracker delayedWorkTracker = this.mDelayedWorkTracker;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.unschedule(str);
        }
        Iterator it = this.mStartStopTokens.remove(str).iterator();
        while (it.hasNext()) {
            this.mWorkManagerImpl.stopWork((StartStopToken) it.next());
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkGenerationalId generationalId = WorkSpecKt.generationalId((WorkSpec) it.next());
            if (!this.mStartStopTokens.contains(generationalId)) {
                Logger.get().debug(TAG, "Constraints met: Scheduling work ID " + generationalId);
                this.mWorkManagerImpl.startWork(this.mStartStopTokens.tokenFor(generationalId));
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkGenerationalId generationalId = WorkSpecKt.generationalId((WorkSpec) it.next());
            Logger.get().debug(TAG, "Constraints not met: Cancelling work ID " + generationalId);
            StartStopToken remove = this.mStartStopTokens.remove(generationalId);
            if (remove != null) {
                this.mWorkManagerImpl.stopWork(remove);
            }
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    /* renamed from: onExecuted */
    public void lambda$runOnExecuted$1(WorkGenerationalId workGenerationalId, boolean z) {
        this.mStartStopTokens.remove(workGenerationalId);
        removeConstraintTrackingFor(workGenerationalId);
    }

    private void removeConstraintTrackingFor(WorkGenerationalId workGenerationalId) {
        synchronized (this.mLock) {
            try {
                Iterator it = this.mConstrainedWorkSpecs.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WorkSpec workSpec = (WorkSpec) it.next();
                    if (WorkSpecKt.generationalId(workSpec).equals(workGenerationalId)) {
                        Logger.get().debug(TAG, "Stopping tracking for " + workGenerationalId);
                        this.mConstrainedWorkSpecs.remove(workSpec);
                        this.mWorkConstraintsTracker.replace(this.mConstrainedWorkSpecs);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void registerExecutionListenerIfNeeded() {
        if (this.mRegisteredExecutionListener) {
            return;
        }
        this.mWorkManagerImpl.getProcessor().addExecutionListener(this);
        this.mRegisteredExecutionListener = true;
    }
}
