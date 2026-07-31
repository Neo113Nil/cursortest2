package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import androidx.core.util.Consumer;
import androidx.work.CoroutineWorker;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerFactory;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.ExecutorsKt;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u000b\u001a\u00020\tH\u0082@¢\u0006\u0002\u0010\nJ&\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u0010\u0013R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker;", "Landroidx/work/CoroutineWorker;", "appContext", "Landroid/content/Context;", "workerParameters", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setupAndRunConstraintTrackingWork", "runWorker", "delegate", "Landroidx/work/ListenableWorker;", "workConstraintsTracker", "Landroidx/work/impl/constraints/WorkConstraintsTracker;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "(Landroidx/work/ListenableWorker;Landroidx/work/impl/constraints/WorkConstraintsTracker;Landroidx/work/impl/model/WorkSpec;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ConstraintUnsatisfiedException", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConstraintTrackingWorker extends CoroutineWorker {
    private final WorkerParameters workerParameters;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConstraintTrackingWorker(Context appContext, WorkerParameters workerParameters) {
        super(appContext, workerParameters);
        Intrinsics.checkNotNullParameter(appContext, "appContext");
        Intrinsics.checkNotNullParameter(workerParameters, "workerParameters");
        this.workerParameters = workerParameters;
    }

    @Override // androidx.work.CoroutineWorker
    public Object doWork(Continuation<? super ListenableWorker.Result> continuation) {
        Executor backgroundExecutor = getBackgroundExecutor();
        Intrinsics.checkNotNullExpressionValue(backgroundExecutor, "getBackgroundExecutor(...)");
        return BuildersKt.withContext(ExecutorsKt.from(backgroundExecutor), new ConstraintTrackingWorker$doWork$2(this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.work.ListenableWorker] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object setupAndRunConstraintTrackingWork(Continuation<? super ListenableWorker.Result> continuation) {
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        ?? r2;
        int stopReason;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        try {
            if (continuation instanceof ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) {
                constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = (ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1) continuation;
                if ((constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label & Integer.MIN_VALUE) != 0) {
                    constraintTrackingWorker$setupAndRunConstraintTrackingWork$1.label -= Integer.MIN_VALUE;
                    ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$12 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
                    Object obj = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    r2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.label;
                    if (r2 != 0) {
                        ResultKt.throwOnFailure(obj);
                        String string = getInputData().getString(ConstraintTrackingWorkerKt.ARGUMENT_CLASS_NAME);
                        String str6 = string;
                        if (str6 == null || str6.length() == 0) {
                            str = ConstraintTrackingWorkerKt.TAG;
                            Logger.get().error(str, "No worker to delegate to.");
                            ListenableWorker.Result failure = ListenableWorker.Result.failure();
                            Intrinsics.checkNotNullExpressionValue(failure, "failure(...)");
                            return failure;
                        }
                        WorkManagerImpl workManagerImpl = WorkManagerImpl.getInstance(getApplicationContext());
                        Intrinsics.checkNotNullExpressionValue(workManagerImpl, "getInstance(...)");
                        WorkSpecDao workSpecDao = workManagerImpl.getWorkDatabase().workSpecDao();
                        String uuid = getId().toString();
                        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                        WorkSpec workSpec = workSpecDao.getWorkSpec(uuid);
                        if (workSpec == null) {
                            ListenableWorker.Result failure2 = ListenableWorker.Result.failure();
                            Intrinsics.checkNotNullExpressionValue(failure2, "failure(...)");
                            return failure2;
                        }
                        Trackers trackers = workManagerImpl.getTrackers();
                        Intrinsics.checkNotNullExpressionValue(trackers, "getTrackers(...)");
                        WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(trackers);
                        if (!workConstraintsTracker.areAllConstraintsMet(workSpec)) {
                            str5 = ConstraintTrackingWorkerKt.TAG;
                            Logger.get().debug(str5, "Constraints not met for delegate " + string + ". Requesting retry.");
                            ListenableWorker.Result retry = ListenableWorker.Result.retry();
                            Intrinsics.checkNotNullExpressionValue(retry, "retry(...)");
                            return retry;
                        }
                        str2 = ConstraintTrackingWorkerKt.TAG;
                        Logger.get().debug(str2, "Constraints met for delegate " + string);
                        try {
                            WorkerFactory workerFactory = getWorkerFactory();
                            Context applicationContext = getApplicationContext();
                            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                            ListenableWorker createWorkerWithDefaultFallback = workerFactory.createWorkerWithDefaultFallback(applicationContext, string, this.workerParameters);
                            Executor mainThreadExecutor = this.workerParameters.getTaskExecutor().getMainThreadExecutor();
                            Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor(...)");
                            CoroutineDispatcher from = ExecutorsKt.from(mainThreadExecutor);
                            ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5 constraintTrackingWorker$setupAndRunConstraintTrackingWork$5 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$5(this, createWorkerWithDefaultFallback, workConstraintsTracker, workSpec, null);
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$0 = createWorkerWithDefaultFallback;
                            constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.label = 1;
                            obj = BuildersKt.withContext(from, constraintTrackingWorker$setupAndRunConstraintTrackingWork$5, constraintTrackingWorker$setupAndRunConstraintTrackingWork$12);
                            r2 = createWorkerWithDefaultFallback;
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Throwable th) {
                            str3 = ConstraintTrackingWorkerKt.TAG;
                            Logger.get().debug(str3, "No worker to delegate to.");
                            Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = workManagerImpl.getConfiguration().getWorkerInitializationExceptionHandler();
                            if (workerInitializationExceptionHandler != null) {
                                WorkerExceptionInfo workerExceptionInfo = new WorkerExceptionInfo(string, this.workerParameters, th);
                                str4 = ConstraintTrackingWorkerKt.TAG;
                                WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, workerExceptionInfo, str4);
                            }
                            ListenableWorker.Result failure3 = ListenableWorker.Result.failure();
                            Intrinsics.checkNotNullExpressionValue(failure3, "failure(...)");
                            return failure3;
                        }
                    } else {
                        if (r2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ListenableWorker listenableWorker = (ListenableWorker) constraintTrackingWorker$setupAndRunConstraintTrackingWork$12.L$0;
                        ResultKt.throwOnFailure(obj);
                        r2 = listenableWorker;
                    }
                    return (ListenableWorker.Result) obj;
                }
            }
            if (r2 != 0) {
            }
            return (ListenableWorker.Result) obj;
        } catch (CancellationException e) {
            if (isStopped() || (e instanceof ConstraintUnsatisfiedException)) {
                if (Build.VERSION.SDK_INT < 31) {
                    stopReason = WorkInfo.STOP_REASON_UNKNOWN;
                } else if (isStopped()) {
                    stopReason = getStopReason();
                } else {
                    if (!(e instanceof ConstraintUnsatisfiedException)) {
                        throw new IllegalStateException("Unreachable");
                    }
                    stopReason = ((ConstraintUnsatisfiedException) e).getStopReason();
                }
                r2.stop(stopReason);
            }
            if (!(e instanceof ConstraintUnsatisfiedException)) {
                throw e;
            }
            ListenableWorker.Result retry2 = ListenableWorker.Result.retry();
            Intrinsics.checkNotNull(retry2);
            return retry2;
        }
        constraintTrackingWorker$setupAndRunConstraintTrackingWork$1 = new ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1(this, continuation);
        ConstraintTrackingWorker$setupAndRunConstraintTrackingWork$1 constraintTrackingWorker$setupAndRunConstraintTrackingWork$122 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$1;
        Object obj2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        r2 = constraintTrackingWorker$setupAndRunConstraintTrackingWork$122.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runWorker(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ListenableWorker.Result> continuation) {
        ConstraintTrackingWorker$runWorker$1 constraintTrackingWorker$runWorker$1;
        int i;
        if (continuation instanceof ConstraintTrackingWorker$runWorker$1) {
            constraintTrackingWorker$runWorker$1 = (ConstraintTrackingWorker$runWorker$1) continuation;
            if ((constraintTrackingWorker$runWorker$1.label & Integer.MIN_VALUE) != 0) {
                constraintTrackingWorker$runWorker$1.label -= Integer.MIN_VALUE;
                Object obj = constraintTrackingWorker$runWorker$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = constraintTrackingWorker$runWorker$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(listenableWorker, workConstraintsTracker, workSpec, null);
                    constraintTrackingWorker$runWorker$1.label = 1;
                    obj = CoroutineScopeKt.coroutineScope(constraintTrackingWorker$runWorker$2, constraintTrackingWorker$runWorker$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "coroutineScope(...)");
                return obj;
            }
        }
        constraintTrackingWorker$runWorker$1 = new ConstraintTrackingWorker$runWorker$1(this, continuation);
        Object obj2 = constraintTrackingWorker$runWorker$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = constraintTrackingWorker$runWorker$1.label;
        if (i != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "coroutineScope(...)");
        return obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ConstraintTrackingWorker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/work/impl/workers/ConstraintTrackingWorker$ConstraintUnsatisfiedException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "stopReason", "", "<init>", "(I)V", "getStopReason", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class ConstraintUnsatisfiedException extends CancellationException {
        private final int stopReason;

        public ConstraintUnsatisfiedException(int i) {
            this.stopReason = i;
        }

        public final int getStopReason() {
            return this.stopReason;
        }
    }
}
