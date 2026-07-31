package androidx.work.impl.workers;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTrackerImpl;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.futures.SettableFuture;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u001d\u0010\u0014\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\t2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR8\u0010 \u001a&\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\r0\r \u001f*\u0012\u0012\f\u0012\n \u001f*\u0004\u0018\u00010\r0\r\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\"\u001a\u0004\u0018\u00010\u00018G@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/ListenableWorker;", "Landroidx/work/impl/constraints/WorkConstraintsCallback;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "", "setupAndRunConstraintTrackingWork", "()V", "Lcom/google/common/util/concurrent/ListenableFuture;", "Landroidx/work/ListenableWorker$Result;", "startWork", "()Lcom/google/common/util/concurrent/ListenableFuture;", "onStopped", "", "Landroidx/work/impl/model/WorkSpec;", "workSpecs", "onAllConstraintsMet", "(Ljava/util/List;)V", "onAllConstraintsNotMet", "Landroidx/work/WorkerParameters;", "", "lock", "Ljava/lang/Object;", "", "areConstraintsUnmet", "Z", "Landroidx/work/impl/utils/futures/SettableFuture;", "kotlin.jvm.PlatformType", "future", "Landroidx/work/impl/utils/futures/SettableFuture;", "<set-?>", "delegate", "Landroidx/work/ListenableWorker;", "getDelegate", "()Landroidx/work/ListenableWorker;", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@RestrictTo
/* loaded from: classes5.dex */
public final class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {
    private volatile boolean areConstraintsUnmet;
    private ListenableWorker delegate;
    private final SettableFuture future;
    private final Object lock;
    private final WorkerParameters workerParameters;

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsMet(List workSpecs) {
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(@NotNull Context appContext, @NotNull WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
        this.lock = new Object();
        this.future = SettableFuture.create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void startWork$lambda$0(ConstraintTrackingWorker this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.setupAndRunConstraintTrackingWork();
    }

    @Override // androidx.work.ListenableWorker
    public ListenableFuture startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ConstraintTrackingWorker.startWork$lambda$0(ConstraintTrackingWorker.this);
            }
        });
        SettableFuture future = this.future;
        Intrinsics.checkNotNullExpressionValue(future, "future");
        return future;
    }

    private final void setupAndRunConstraintTrackingWork() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (this.future.isCancelled()) {
            return;
        }
        String string = getInputData().getString("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        Logger logger = Logger.get();
        Intrinsics.checkNotNullExpressionValue(logger, "get()");
        if (string == null || string.length() == 0) {
            str = ConstraintTrackingWorkerKt.TAG;
            logger.error(str, "No worker to delegate to.");
            SettableFuture future = this.future;
            Intrinsics.checkNotNullExpressionValue(future, "future");
            ConstraintTrackingWorkerKt.setFailed(future);
            return;
        }
        ListenableWorker createWorkerWithDefaultFallback = getWorkerFactory().createWorkerWithDefaultFallback(getApplicationContext(), string, this.workerParameters);
        this.delegate = createWorkerWithDefaultFallback;
        if (createWorkerWithDefaultFallback == null) {
            str6 = ConstraintTrackingWorkerKt.TAG;
            logger.debug(str6, "No worker to delegate to.");
            SettableFuture future2 = this.future;
            Intrinsics.checkNotNullExpressionValue(future2, "future");
            ConstraintTrackingWorkerKt.setFailed(future2);
            return;
        }
        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
        Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(applicationContext)");
        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
        String uuid = getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "id.toString()");
        WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
        if (workSpec == null) {
            SettableFuture future3 = this.future;
            Intrinsics.checkNotNullExpressionValue(future3, "future");
            ConstraintTrackingWorkerKt.setFailed(future3);
            return;
        }
        Trackers trackers = workManagerImpl.getTrackers();
        Intrinsics.checkNotNullExpressionValue(trackers, "workManagerImpl.trackers");
        WorkConstraintsTrackerImpl workConstraintsTrackerImpl = new WorkConstraintsTrackerImpl(trackers, this);
        workConstraintsTrackerImpl.replace(CollectionsKt.listOf(workSpec));
        String uuid2 = getId().toString();
        Intrinsics.checkNotNullExpressionValue(uuid2, "id.toString()");
        if (workConstraintsTrackerImpl.areAllConstraintsMet(uuid2)) {
            str3 = ConstraintTrackingWorkerKt.TAG;
            logger.debug(str3, "Constraints met for delegate " + string);
            try {
                ListenableWorker listenableWorker = this.delegate;
                Intrinsics.checkNotNull(listenableWorker);
                final ListenableFuture startWork = listenableWorker.startWork();
                Intrinsics.checkNotNullExpressionValue(startWork, "delegate!!.startWork()");
                startWork.addListener(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstraintTrackingWorker.setupAndRunConstraintTrackingWork$lambda$2(ConstraintTrackingWorker.this, startWork);
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                str4 = ConstraintTrackingWorkerKt.TAG;
                logger.debug(str4, "Delegated worker " + string + " threw exception in startWork.", th);
                synchronized (this.lock) {
                    try {
                        if (this.areConstraintsUnmet) {
                            str5 = ConstraintTrackingWorkerKt.TAG;
                            logger.debug(str5, "Constraints were unmet, Retrying.");
                            SettableFuture future4 = this.future;
                            Intrinsics.checkNotNullExpressionValue(future4, "future");
                            ConstraintTrackingWorkerKt.setRetry(future4);
                            return;
                        }
                        SettableFuture future5 = this.future;
                        Intrinsics.checkNotNullExpressionValue(future5, "future");
                        ConstraintTrackingWorkerKt.setFailed(future5);
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        str2 = ConstraintTrackingWorkerKt.TAG;
        logger.debug(str2, "Constraints not met for delegate " + string + ". Requesting retry.");
        SettableFuture future6 = this.future;
        Intrinsics.checkNotNullExpressionValue(future6, "future");
        ConstraintTrackingWorkerKt.setRetry(future6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupAndRunConstraintTrackingWork$lambda$2(ConstraintTrackingWorker this$0, ListenableFuture innerFuture) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(innerFuture, "$innerFuture");
        synchronized (this$0.lock) {
            try {
                if (this$0.areConstraintsUnmet) {
                    SettableFuture future = this$0.future;
                    Intrinsics.checkNotNullExpressionValue(future, "future");
                    ConstraintTrackingWorkerKt.setRetry(future);
                } else {
                    this$0.future.setFuture(innerFuture);
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.delegate;
        if (listenableWorker == null || listenableWorker.isStopped()) {
            return;
        }
        listenableWorker.stop();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void onAllConstraintsNotMet(List workSpecs) {
        String str;
        Intrinsics.checkNotNullParameter(workSpecs, "workSpecs");
        Logger logger = Logger.get();
        str = ConstraintTrackingWorkerKt.TAG;
        logger.debug(str, "Constraints changed for " + workSpecs);
        synchronized (this.lock) {
            this.areConstraintsUnmet = true;
            Unit unit = Unit.INSTANCE;
        }
    }
}
