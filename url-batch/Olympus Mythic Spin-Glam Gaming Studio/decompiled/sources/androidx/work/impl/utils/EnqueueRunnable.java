package androidx.work.impl.utils;

import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.ExistingWorkPolicy;
import androidx.work.Logger;
import androidx.work.Operation;
import androidx.work.WorkInfo;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.Schedulers;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.model.Dependency;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkName;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@RestrictTo
/* loaded from: classes15.dex */
public class EnqueueRunnable implements Runnable {
    private static final String TAG = Logger.tagWithPrefix("EnqueueRunnable");
    private final OperationImpl mOperation;
    private final WorkContinuationImpl mWorkContinuation;

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl) {
        this(workContinuationImpl, new OperationImpl());
    }

    public EnqueueRunnable(WorkContinuationImpl workContinuationImpl, OperationImpl operationImpl) {
        this.mWorkContinuation = workContinuationImpl;
        this.mOperation = operationImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.mWorkContinuation.hasCycles()) {
                throw new IllegalStateException("WorkContinuation has cycles (" + this.mWorkContinuation + ")");
            }
            if (addToDatabase()) {
                PackageManagerHelper.setComponentEnabled(this.mWorkContinuation.getWorkManagerImpl().getApplicationContext(), RescheduleReceiver.class, true);
                scheduleWorkInBackground();
            }
            this.mOperation.markState(Operation.SUCCESS);
        } catch (Throwable th) {
            this.mOperation.markState(new Operation.State.FAILURE(th));
        }
    }

    public Operation getOperation() {
        return this.mOperation;
    }

    public boolean addToDatabase() {
        WorkDatabase workDatabase = this.mWorkContinuation.getWorkManagerImpl().getWorkDatabase();
        workDatabase.beginTransaction();
        try {
            boolean processContinuation = processContinuation(this.mWorkContinuation);
            workDatabase.setTransactionSuccessful();
            return processContinuation;
        } finally {
            workDatabase.endTransaction();
        }
    }

    public void scheduleWorkInBackground() {
        WorkManagerImpl workManagerImpl = this.mWorkContinuation.getWorkManagerImpl();
        Schedulers.schedule(workManagerImpl.getConfiguration(), workManagerImpl.getWorkDatabase(), workManagerImpl.getSchedulers());
    }

    private static boolean processContinuation(WorkContinuationImpl workContinuationImpl) {
        List<WorkContinuationImpl> parents = workContinuationImpl.getParents();
        boolean z = false;
        if (parents != null) {
            for (WorkContinuationImpl workContinuationImpl2 : parents) {
                if (!workContinuationImpl2.isEnqueued()) {
                    z |= processContinuation(workContinuationImpl2);
                } else {
                    Logger.get().warning(TAG, "Already enqueued work ids (" + TextUtils.join(", ", workContinuationImpl2.getIds()) + ")");
                }
            }
        }
        return enqueueContinuation(workContinuationImpl) | z;
    }

    private static boolean enqueueContinuation(WorkContinuationImpl workContinuationImpl) {
        boolean enqueueWorkWithPrerequisites = enqueueWorkWithPrerequisites(workContinuationImpl.getWorkManagerImpl(), workContinuationImpl.getWork(), (String[]) WorkContinuationImpl.prerequisitesFor(workContinuationImpl).toArray(new String[0]), workContinuationImpl.getName(), workContinuationImpl.getExistingWorkPolicy());
        workContinuationImpl.markEnqueued();
        return enqueueWorkWithPrerequisites;
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean enqueueWorkWithPrerequisites(WorkManagerImpl workManagerImpl, List list, String[] strArr, String str, ExistingWorkPolicy existingWorkPolicy) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Iterator it;
        DependencyDao dependencyDao;
        String[] strArr2 = strArr;
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase = workManagerImpl.getWorkDatabase();
        boolean z5 = strArr2 != null && strArr2.length > 0;
        if (z5) {
            z = false;
            z2 = false;
            z3 = true;
            for (String str2 : strArr2) {
                WorkSpec workSpec = workDatabase.workSpecDao().getWorkSpec(str2);
                if (workSpec == null) {
                    Logger.get().error(TAG, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    return false;
                }
                WorkInfo.State state = workSpec.state;
                z3 &= state == WorkInfo.State.SUCCEEDED;
                if (state == WorkInfo.State.FAILED) {
                    z2 = true;
                } else if (state == WorkInfo.State.CANCELLED) {
                    z = true;
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = true;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z5) {
            List<WorkSpec.IdAndState> workSpecIdAndStatesForName = workDatabase.workSpecDao().getWorkSpecIdAndStatesForName(str);
            if (!workSpecIdAndStatesForName.isEmpty()) {
                if (existingWorkPolicy == ExistingWorkPolicy.APPEND || existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE) {
                    DependencyDao dependencyDao2 = workDatabase.dependencyDao();
                    List arrayList = new ArrayList();
                    for (WorkSpec.IdAndState idAndState : workSpecIdAndStatesForName) {
                        if (dependencyDao2.hasDependents(idAndState.id)) {
                            dependencyDao = dependencyDao2;
                        } else {
                            WorkInfo.State state2 = idAndState.state;
                            dependencyDao = dependencyDao2;
                            boolean z6 = (state2 == WorkInfo.State.SUCCEEDED) & z3;
                            if (state2 == WorkInfo.State.FAILED) {
                                z2 = true;
                            } else if (state2 == WorkInfo.State.CANCELLED) {
                                z = true;
                            }
                            arrayList.add(idAndState.id);
                            z3 = z6;
                        }
                        dependencyDao2 = dependencyDao;
                    }
                    if (existingWorkPolicy == ExistingWorkPolicy.APPEND_OR_REPLACE && (z || z2)) {
                        WorkSpecDao workSpecDao = workDatabase.workSpecDao();
                        Iterator it2 = workSpecDao.getWorkSpecIdAndStatesForName(str).iterator();
                        while (it2.hasNext()) {
                            workSpecDao.delete(((WorkSpec.IdAndState) it2.next()).id);
                        }
                        arrayList = Collections.emptyList();
                        z = false;
                        z2 = false;
                    }
                    strArr2 = (String[]) arrayList.toArray(strArr2);
                    z5 = strArr2.length > 0;
                    z4 = false;
                    it = list.iterator();
                    while (it.hasNext()) {
                        WorkRequest workRequest = (WorkRequest) it.next();
                        WorkSpec workSpec2 = workRequest.getWorkSpec();
                        if (!z5 || z3) {
                            workSpec2.lastEnqueueTime = currentTimeMillis;
                        } else if (z2) {
                            workSpec2.state = WorkInfo.State.FAILED;
                        } else if (z) {
                            workSpec2.state = WorkInfo.State.CANCELLED;
                        } else {
                            workSpec2.state = WorkInfo.State.BLOCKED;
                        }
                        Iterator it3 = it;
                        if (workSpec2.state == WorkInfo.State.ENQUEUED) {
                            z4 = true;
                        }
                        workDatabase.workSpecDao().insertWorkSpec(EnqueueUtilsKt.wrapInConstraintTrackingWorkerIfNeeded(workManagerImpl.getSchedulers(), workSpec2));
                        if (z5) {
                            int length = strArr2.length;
                            int i = 0;
                            while (i < length) {
                                workDatabase.dependencyDao().insertDependency(new Dependency(workRequest.getStringId(), strArr2[i]));
                                i++;
                                length = length;
                                strArr2 = strArr2;
                            }
                        }
                        String[] strArr3 = strArr2;
                        workDatabase.workTagDao().insertTags(workRequest.getStringId(), workRequest.getTags());
                        if (!isEmpty) {
                            workDatabase.workNameDao().insert(new WorkName(str, workRequest.getStringId()));
                        }
                        it = it3;
                        strArr2 = strArr3;
                    }
                    return z4;
                }
                if (existingWorkPolicy == ExistingWorkPolicy.KEEP) {
                    Iterator it4 = workSpecIdAndStatesForName.iterator();
                    while (it4.hasNext()) {
                        WorkInfo.State state3 = ((WorkSpec.IdAndState) it4.next()).state;
                        if (state3 == WorkInfo.State.ENQUEUED || state3 == WorkInfo.State.RUNNING) {
                            return false;
                        }
                    }
                }
                CancelWorkRunnable.forName(str, workManagerImpl, false).run();
                WorkSpecDao workSpecDao2 = workDatabase.workSpecDao();
                Iterator it5 = workSpecIdAndStatesForName.iterator();
                while (it5.hasNext()) {
                    workSpecDao2.delete(((WorkSpec.IdAndState) it5.next()).id);
                }
                z4 = true;
                it = list.iterator();
                while (it.hasNext()) {
                }
                return z4;
            }
        }
        z4 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        return z4;
    }
}
