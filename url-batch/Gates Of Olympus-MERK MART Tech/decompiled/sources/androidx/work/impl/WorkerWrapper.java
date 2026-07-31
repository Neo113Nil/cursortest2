package androidx.work.impl;

import android.content.Context;
import androidx.core.util.Consumer;
import androidx.work.Clock;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.ForegroundUpdater;
import androidx.work.InputMerger;
import androidx.work.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerExceptionInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkSpecKt;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.WorkerExceptionUtilsKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* compiled from: WorkerWrapper.kt */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0002?@B\u0011\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*J\u000e\u0010,\u001a\u00020-H\u0082@¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0002J\u0010\u00102\u001a\u0002032\u0006\u00104\u001a\u000205H\u0007J\u0010\u00106\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0002J\u0012\u00107\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0002J\b\u00108\u001a\u00020+H\u0002J\u0010\u00109\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0007J\u0010\u0010:\u001a\u0002032\u0006\u0010\f\u001a\u00020\rH\u0002J\u0010\u0010;\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0002J\b\u0010<\u001a\u00020+H\u0002J\u0010\u0010=\u001a\u00020+2\u0006\u00100\u001a\u000201H\u0002J\u0016\u0010>\u001a\u00020\r2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010%\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006A"}, d2 = {"Landroidx/work/impl/WorkerWrapper;", "", "builder", "Landroidx/work/impl/WorkerWrapper$Builder;", "<init>", "(Landroidx/work/impl/WorkerWrapper$Builder;)V", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "appContext", "Landroid/content/Context;", "workSpecId", "", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "builderWorker", "Landroidx/work/ListenableWorker;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "configuration", "Landroidx/work/Configuration;", "clock", "Landroidx/work/Clock;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "tags", "", "workDescription", "workerJob", "Lkotlinx/coroutines/CompletableJob;", "workGenerationalId", "Landroidx/work/impl/model/WorkGenerationalId;", "getWorkGenerationalId", "()Landroidx/work/impl/model/WorkGenerationalId;", "launch", "Lcom/google/common/util/concurrent/ListenableFuture;", "", "runWorker", "Landroidx/work/impl/WorkerWrapper$Resolution;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onWorkFinished", "result", "Landroidx/work/ListenableWorker$Result;", "interrupt", "", "stopReason", "", "resetWorkerStatus", "handleResult", "trySetRunning", "setFailed", "iterativelyFailWorkAndDependents", "reschedule", "resetPeriodic", "setSucceeded", "createWorkDescription", "Resolution", "Builder", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkerWrapper {
    private final Context appContext;
    private final ListenableWorker builderWorker;
    private final Clock clock;
    private final Configuration configuration;
    private final DependencyDao dependencyDao;
    private final ForegroundProcessor foregroundProcessor;
    private final WorkerParameters.RuntimeExtras runtimeExtras;
    private final List<String> tags;
    private final WorkDatabase workDatabase;
    private final String workDescription;
    private final WorkSpec workSpec;
    private final WorkSpecDao workSpecDao;
    private final String workSpecId;
    private final TaskExecutor workTaskExecutor;
    private final CompletableJob workerJob;

    public WorkerWrapper(Builder builder) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(builder, "builder");
        WorkSpec workSpec = builder.getWorkSpec();
        this.workSpec = workSpec;
        this.appContext = builder.getAppContext();
        this.workSpecId = workSpec.id;
        this.runtimeExtras = builder.getRuntimeExtras();
        this.builderWorker = builder.getWorker();
        this.workTaskExecutor = builder.getWorkTaskExecutor();
        Configuration configuration = builder.getConfiguration();
        this.configuration = configuration;
        this.clock = configuration.getClock();
        this.foregroundProcessor = builder.getForegroundProcessor();
        WorkDatabase workDatabase = builder.getWorkDatabase();
        this.workDatabase = workDatabase;
        this.workSpecDao = workDatabase.workSpecDao();
        this.dependencyDao = workDatabase.dependencyDao();
        List<String> tags = builder.getTags();
        this.tags = tags;
        this.workDescription = createWorkDescription(tags);
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.workerJob = Job$default;
    }

    public final WorkSpec getWorkSpec() {
        return this.workSpec;
    }

    public final WorkGenerationalId getWorkGenerationalId() {
        return WorkSpecKt.generationalId(this.workSpec);
    }

    public final ListenableFuture<Boolean> launch() {
        CompletableJob Job$default;
        CoroutineDispatcher taskCoroutineDispatcher = this.workTaskExecutor.getTaskCoroutineDispatcher();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        return ListenableFutureKt.launchFuture$default(taskCoroutineDispatcher.plus(Job$default), null, new WorkerWrapper$launch$1(this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WorkerWrapper.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution;", "", "<init>", "()V", "ResetWorkerStatus", "Failed", "Finished", "Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static abstract class Resolution {
        public /* synthetic */ Resolution(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$ResetWorkerStatus;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "reason", "", "<init>", "(I)V", "getReason", "()I", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class ResetWorkerStatus extends Resolution {
            private final int reason;

            public ResetWorkerStatus() {
                this(0, 1, null);
            }

            public ResetWorkerStatus(int i) {
                super(null);
                this.reason = i;
            }

            public /* synthetic */ ResetWorkerStatus(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this((i2 & 1) != 0 ? -256 : i);
            }

            public final int getReason() {
                return this.reason;
            }
        }

        private Resolution() {
        }

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Failed;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "result", "Landroidx/work/ListenableWorker$Result;", "<init>", "(Landroidx/work/ListenableWorker$Result;)V", "getResult", "()Landroidx/work/ListenableWorker$Result;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Failed extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: Multi-variable type inference failed */
            public Failed() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Failed(ListenableWorker.Result result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public /* synthetic */ Failed(ListenableWorker.Result.Failure failure, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? new ListenableWorker.Result.Failure() : failure);
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }

        /* compiled from: WorkerWrapper.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Resolution$Finished;", "Landroidx/work/impl/WorkerWrapper$Resolution;", "result", "Landroidx/work/ListenableWorker$Result;", "<init>", "(Landroidx/work/ListenableWorker$Result;)V", "getResult", "()Landroidx/work/ListenableWorker$Result;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Finished extends Resolution {
            private final ListenableWorker.Result result;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Finished(ListenableWorker.Result result) {
                super(null);
                Intrinsics.checkNotNullParameter(result, "result");
                this.result = result;
            }

            public final ListenableWorker.Result getResult() {
                return this.result;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runWorker(Continuation<? super Resolution> continuation) {
        WorkerWrapper$runWorker$1 workerWrapper$runWorker$1;
        int i;
        String str;
        Data merge;
        String str2;
        String str3;
        String str4;
        WorkerParameters workerParameters;
        String str5;
        Consumer<WorkerExceptionInfo> workerExecutionExceptionHandler;
        String str6;
        try {
            if (continuation instanceof WorkerWrapper$runWorker$1) {
                workerWrapper$runWorker$1 = (WorkerWrapper$runWorker$1) continuation;
                if ((workerWrapper$runWorker$1.label & Integer.MIN_VALUE) != 0) {
                    workerWrapper$runWorker$1.label -= Integer.MIN_VALUE;
                    Object obj = workerWrapper$runWorker$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = workerWrapper$runWorker$1.label;
                    int i2 = 1;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        final boolean isEnabled = this.configuration.getTracer().isEnabled();
                        final String traceTag = this.workSpec.getTraceTag();
                        if (isEnabled && traceTag != null) {
                            this.configuration.getTracer().beginAsyncSection(traceTag, this.workSpec.hashCode());
                        }
                        int i3 = 0;
                        if (((Boolean) this.workDatabase.runInTransaction(new Callable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda0
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                Boolean runWorker$lambda$1;
                                runWorker$lambda$1 = WorkerWrapper.runWorker$lambda$1(WorkerWrapper.this);
                                return runWorker$lambda$1;
                            }
                        })).booleanValue()) {
                            return new Resolution.ResetWorkerStatus(i3, i2, defaultConstructorMarker);
                        }
                        if (this.workSpec.isPeriodic()) {
                            merge = this.workSpec.input;
                        } else {
                            InputMerger createInputMergerWithDefaultFallback = this.configuration.getInputMergerFactory().createInputMergerWithDefaultFallback(this.workSpec.inputMergerClassName);
                            if (createInputMergerWithDefaultFallback == null) {
                                str2 = WorkerWrapperKt.TAG;
                                Logger.get().error(str2, "Could not create Input Merger " + this.workSpec.inputMergerClassName);
                                return new Resolution.Failed(objArr2 == true ? 1 : 0, i2, objArr == true ? 1 : 0);
                            }
                            merge = createInputMergerWithDefaultFallback.merge(CollectionsKt.plus((Collection) CollectionsKt.listOf(this.workSpec.input), (Iterable) this.workSpecDao.getInputsFromPrerequisites(this.workSpecId)));
                        }
                        WorkerParameters workerParameters2 = new WorkerParameters(UUID.fromString(this.workSpecId), merge, this.tags, this.runtimeExtras, this.workSpec.runAttemptCount, this.workSpec.getGeneration(), this.configuration.getExecutor(), this.configuration.getWorkerCoroutineContext(), this.workTaskExecutor, this.configuration.getWorkerFactory(), new WorkProgressUpdater(this.workDatabase, this.workTaskExecutor), new WorkForegroundUpdater(this.workDatabase, this.foregroundProcessor, this.workTaskExecutor));
                        final ListenableWorker listenableWorker = this.builderWorker;
                        if (listenableWorker == null) {
                            try {
                                listenableWorker = this.configuration.getWorkerFactory().createWorkerWithDefaultFallback(this.appContext, this.workSpec.workerClassName, workerParameters2);
                            } catch (Throwable th) {
                                str3 = WorkerWrapperKt.TAG;
                                Logger.get().error(str3, "Could not create Worker " + this.workSpec.workerClassName);
                                Consumer<WorkerExceptionInfo> workerInitializationExceptionHandler = this.configuration.getWorkerInitializationExceptionHandler();
                                if (workerInitializationExceptionHandler != null) {
                                    WorkerExceptionInfo workerExceptionInfo = new WorkerExceptionInfo(this.workSpec.workerClassName, workerParameters2, th);
                                    str4 = WorkerWrapperKt.TAG;
                                    WorkerExceptionUtilsKt.safeAccept(workerInitializationExceptionHandler, workerExceptionInfo, str4);
                                }
                                return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
                            }
                        }
                        listenableWorker.setUsed();
                        CoroutineContext.Element element = workerWrapper$runWorker$1.getContext().get(Job.INSTANCE);
                        Intrinsics.checkNotNull(element);
                        Job job = (Job) element;
                        job.invokeOnCompletion(new Function1() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit runWorker$lambda$4;
                                runWorker$lambda$4 = WorkerWrapper.runWorker$lambda$4(ListenableWorker.this, isEnabled, traceTag, this, (Throwable) obj2);
                                return runWorker$lambda$4;
                            }
                        });
                        if (!trySetRunning()) {
                            return new Resolution.ResetWorkerStatus(0, 1, null);
                        }
                        int i4 = 0;
                        int i5 = 1;
                        DefaultConstructorMarker defaultConstructorMarker2 = null;
                        if (job.isCancelled()) {
                            return new Resolution.ResetWorkerStatus(i4, i5, defaultConstructorMarker2);
                        }
                        ForegroundUpdater foregroundUpdater = workerParameters2.getForegroundUpdater();
                        Intrinsics.checkNotNullExpressionValue(foregroundUpdater, "getForegroundUpdater(...)");
                        Executor mainThreadExecutor = this.workTaskExecutor.getMainThreadExecutor();
                        Intrinsics.checkNotNullExpressionValue(mainThreadExecutor, "getMainThreadExecutor(...)");
                        try {
                            CoroutineDispatcher from = ExecutorsKt.from(mainThreadExecutor);
                            WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1 = new WorkerWrapper$runWorker$result$1(this, listenableWorker, foregroundUpdater, null);
                            workerWrapper$runWorker$1.L$0 = workerParameters2;
                            workerWrapper$runWorker$1.label = 1;
                            obj = BuildersKt.withContext(from, workerWrapper$runWorker$result$1, workerWrapper$runWorker$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            workerParameters = workerParameters2;
                        } catch (Throwable th2) {
                            th = th2;
                            workerParameters = workerParameters2;
                            str5 = WorkerWrapperKt.TAG;
                            Logger.get().error(str5, this.workDescription + " failed because it threw an exception/error", th);
                            workerExecutionExceptionHandler = this.configuration.getWorkerExecutionExceptionHandler();
                            if (workerExecutionExceptionHandler != null) {
                            }
                            return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        workerParameters = (WorkerParameters) workerWrapper$runWorker$1.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = WorkerWrapperKt.TAG;
                            Logger.get().error(str5, this.workDescription + " failed because it threw an exception/error", th);
                            workerExecutionExceptionHandler = this.configuration.getWorkerExecutionExceptionHandler();
                            if (workerExecutionExceptionHandler != null) {
                                WorkerExceptionInfo workerExceptionInfo2 = new WorkerExceptionInfo(this.workSpec.workerClassName, workerParameters, th);
                                str6 = WorkerWrapperKt.TAG;
                                WorkerExceptionUtilsKt.safeAccept(workerExecutionExceptionHandler, workerExceptionInfo2, str6);
                            }
                            return new Resolution.Failed(null, 1, 0 == true ? 1 : 0);
                        }
                    }
                    ListenableWorker.Result result = (ListenableWorker.Result) obj;
                    Intrinsics.checkNotNull(result);
                    return new Resolution.Finished(result);
                }
            }
            if (i != 0) {
            }
            ListenableWorker.Result result2 = (ListenableWorker.Result) obj;
            Intrinsics.checkNotNull(result2);
            return new Resolution.Finished(result2);
        } catch (CancellationException e) {
            str = WorkerWrapperKt.TAG;
            Logger.get().info(str, this.workDescription + " was cancelled", e);
            throw e;
        }
        workerWrapper$runWorker$1 = new WorkerWrapper$runWorker$1(this, continuation);
        Object obj2 = workerWrapper$runWorker$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = workerWrapper$runWorker$1.label;
        int i22 = 1;
        DefaultConstructorMarker defaultConstructorMarker3 = null;
        Object[] objArr3 = 0;
        Object[] objArr22 = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean runWorker$lambda$1(WorkerWrapper workerWrapper) {
        String str;
        String str2;
        if (workerWrapper.workSpec.state != WorkInfo.State.ENQUEUED) {
            str2 = WorkerWrapperKt.TAG;
            Logger.get().debug(str2, workerWrapper.workSpec.workerClassName + " is not in ENQUEUED state. Nothing more to do");
            return true;
        }
        if ((workerWrapper.workSpec.isPeriodic() || workerWrapper.workSpec.isBackedOff()) && workerWrapper.clock.currentTimeMillis() < workerWrapper.workSpec.calculateNextRunTime()) {
            Logger logger = Logger.get();
            str = WorkerWrapperKt.TAG;
            logger.debug(str, "Delaying execution for " + workerWrapper.workSpec.workerClassName + " because it is being executed before schedule.");
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runWorker$lambda$4(ListenableWorker listenableWorker, boolean z, String str, WorkerWrapper workerWrapper, Throwable th) {
        if (th instanceof WorkerStoppedException) {
            listenableWorker.stop(((WorkerStoppedException) th).getReason());
        }
        if (z && str != null) {
            workerWrapper.configuration.getTracer().endAsyncSection(str, workerWrapper.workSpec.hashCode());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onWorkFinished(ListenableWorker.Result result) {
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        this.workDatabase.workProgressDao().delete(this.workSpecId);
        if (state == null) {
            return false;
        }
        if (state == WorkInfo.State.RUNNING) {
            return handleResult(result);
        }
        if (state.isFinished()) {
            return false;
        }
        return reschedule(WorkInfo.STOP_REASON_UNKNOWN);
    }

    public final void interrupt(int stopReason) {
        this.workerJob.cancel((CancellationException) new WorkerStoppedException(stopReason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean resetWorkerStatus(int stopReason) {
        String str;
        String str2;
        String str3;
        if (Intrinsics.areEqual((Object) this.workSpec.getBackOffOnSystemInterruptions(), (Object) true)) {
            str3 = WorkerWrapperKt.TAG;
            Logger.get().debug(str3, "Worker " + this.workSpec.workerClassName + " was interrupted. Backing off.");
            reschedule(stopReason);
            return true;
        }
        WorkInfo.State state = this.workSpecDao.getState(this.workSpecId);
        if (state == null || state.isFinished()) {
            str = WorkerWrapperKt.TAG;
            Logger.get().debug(str, "Status for " + this.workSpecId + " is " + state + " ; not doing any work");
            return false;
        }
        str2 = WorkerWrapperKt.TAG;
        Logger.get().debug(str2, "Status for " + this.workSpecId + " is " + state + "; not doing any work and rescheduling for later execution");
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setStopReason(this.workSpecId, stopReason);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return true;
    }

    private final boolean handleResult(ListenableWorker.Result result) {
        String str;
        String str2;
        String str3;
        if (result instanceof ListenableWorker.Result.Success) {
            str3 = WorkerWrapperKt.TAG;
            Logger.get().info(str3, "Worker result SUCCESS for " + this.workDescription);
            if (this.workSpec.isPeriodic()) {
                return resetPeriodic();
            }
            return setSucceeded(result);
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            str2 = WorkerWrapperKt.TAG;
            Logger.get().info(str2, "Worker result RETRY for " + this.workDescription);
            return reschedule(-256);
        }
        str = WorkerWrapperKt.TAG;
        Logger.get().info(str, "Worker result FAILURE for " + this.workDescription);
        if (this.workSpec.isPeriodic()) {
            return resetPeriodic();
        }
        if (result == null) {
            result = new ListenableWorker.Result.Failure();
        }
        return setFailed(result);
    }

    private final boolean trySetRunning() {
        Object runInTransaction = this.workDatabase.runInTransaction((Callable<Object>) new Callable() { // from class: androidx.work.impl.WorkerWrapper$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean trySetRunning$lambda$13;
                trySetRunning$lambda$13 = WorkerWrapper.trySetRunning$lambda$13(WorkerWrapper.this);
                return trySetRunning$lambda$13;
            }
        });
        Intrinsics.checkNotNullExpressionValue(runInTransaction, "runInTransaction(...)");
        return ((Boolean) runInTransaction).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean trySetRunning$lambda$13(WorkerWrapper workerWrapper) {
        boolean z;
        if (workerWrapper.workSpecDao.getState(workerWrapper.workSpecId) == WorkInfo.State.ENQUEUED) {
            workerWrapper.workSpecDao.setState(WorkInfo.State.RUNNING, workerWrapper.workSpecId);
            workerWrapper.workSpecDao.incrementWorkSpecRunAttemptCount(workerWrapper.workSpecId);
            workerWrapper.workSpecDao.setStopReason(workerWrapper.workSpecId, -256);
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final boolean setFailed(ListenableWorker.Result result) {
        Intrinsics.checkNotNullParameter(result, "result");
        iterativelyFailWorkAndDependents(this.workSpecId);
        Data outputData = ((ListenableWorker.Result.Failure) result).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "getOutputData(...)");
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        return false;
    }

    private final void iterativelyFailWorkAndDependents(String workSpecId) {
        List mutableListOf = CollectionsKt.mutableListOf(workSpecId);
        while (!mutableListOf.isEmpty()) {
            String str = (String) CollectionsKt.removeLast(mutableListOf);
            if (this.workSpecDao.getState(str) != WorkInfo.State.CANCELLED) {
                this.workSpecDao.setState(WorkInfo.State.FAILED, str);
            }
            mutableListOf.addAll(this.dependencyDao.getDependentWorkIds(str));
        }
    }

    private final boolean reschedule(int stopReason) {
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        this.workSpecDao.setStopReason(this.workSpecId, stopReason);
        return true;
    }

    private final boolean resetPeriodic() {
        this.workSpecDao.setLastEnqueueTime(this.workSpecId, this.clock.currentTimeMillis());
        this.workSpecDao.setState(WorkInfo.State.ENQUEUED, this.workSpecId);
        this.workSpecDao.resetWorkSpecRunAttemptCount(this.workSpecId);
        this.workSpecDao.resetWorkSpecNextScheduleTimeOverride(this.workSpecId, this.workSpec.getNextScheduleTimeOverrideGeneration());
        this.workSpecDao.incrementPeriodCount(this.workSpecId);
        this.workSpecDao.markWorkSpecScheduled(this.workSpecId, -1L);
        return false;
    }

    private final boolean setSucceeded(ListenableWorker.Result result) {
        String str;
        this.workSpecDao.setState(WorkInfo.State.SUCCEEDED, this.workSpecId);
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        Data outputData = ((ListenableWorker.Result.Success) result).getOutputData();
        Intrinsics.checkNotNullExpressionValue(outputData, "getOutputData(...)");
        this.workSpecDao.setOutput(this.workSpecId, outputData);
        long currentTimeMillis = this.clock.currentTimeMillis();
        for (String str2 : this.dependencyDao.getDependentWorkIds(this.workSpecId)) {
            if (this.workSpecDao.getState(str2) == WorkInfo.State.BLOCKED && this.dependencyDao.hasCompletedAllPrerequisites(str2)) {
                str = WorkerWrapperKt.TAG;
                Logger.get().info(str, "Setting status to enqueued for " + str2);
                this.workSpecDao.setState(WorkInfo.State.ENQUEUED, str2);
                this.workSpecDao.setLastEnqueueTime(str2, currentTimeMillis);
            }
        }
        return false;
    }

    private final String createWorkDescription(List<String> tags) {
        return "Work [ id=" + this.workSpecId + ", tags={ " + CollectionsKt.joinToString$default(tags, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    /* compiled from: WorkerWrapper.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001BG\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010.\u001a\u00020\u00002\b\u0010(\u001a\u0004\u0018\u00010)J\u0010\u0010/\u001a\u00020\u00002\u0006\u0010\"\u001a\u00020#H\u0007J\u0006\u00100\u001a\u000201R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u001f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020)X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00062"}, d2 = {"Landroidx/work/impl/WorkerWrapper$Builder;", "", "context", "Landroid/content/Context;", "configuration", "Landroidx/work/Configuration;", "workTaskExecutor", "Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "foregroundProcessor", "Landroidx/work/impl/foreground/ForegroundProcessor;", "workDatabase", "Landroidx/work/impl/WorkDatabase;", "workSpec", "Landroidx/work/impl/model/WorkSpec;", "tags", "", "", "<init>", "(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/foreground/ForegroundProcessor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/model/WorkSpec;Ljava/util/List;)V", "getConfiguration", "()Landroidx/work/Configuration;", "getWorkTaskExecutor", "()Landroidx/work/impl/utils/taskexecutor/TaskExecutor;", "getForegroundProcessor", "()Landroidx/work/impl/foreground/ForegroundProcessor;", "getWorkDatabase", "()Landroidx/work/impl/WorkDatabase;", "getWorkSpec", "()Landroidx/work/impl/model/WorkSpec;", "getTags", "()Ljava/util/List;", "appContext", "getAppContext", "()Landroid/content/Context;", "worker", "Landroidx/work/ListenableWorker;", "getWorker", "()Landroidx/work/ListenableWorker;", "setWorker", "(Landroidx/work/ListenableWorker;)V", "runtimeExtras", "Landroidx/work/WorkerParameters$RuntimeExtras;", "getRuntimeExtras", "()Landroidx/work/WorkerParameters$RuntimeExtras;", "setRuntimeExtras", "(Landroidx/work/WorkerParameters$RuntimeExtras;)V", "withRuntimeExtras", "withWorker", "build", "Landroidx/work/impl/WorkerWrapper;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Builder {
        private final Context appContext;
        private final Configuration configuration;
        private final ForegroundProcessor foregroundProcessor;
        private WorkerParameters.RuntimeExtras runtimeExtras;
        private final List<String> tags;
        private final WorkDatabase workDatabase;
        private final WorkSpec workSpec;
        private final TaskExecutor workTaskExecutor;
        private ListenableWorker worker;

        public Builder(Context context, Configuration configuration, TaskExecutor workTaskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, WorkSpec workSpec, List<String> tags) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(workTaskExecutor, "workTaskExecutor");
            Intrinsics.checkNotNullParameter(foregroundProcessor, "foregroundProcessor");
            Intrinsics.checkNotNullParameter(workDatabase, "workDatabase");
            Intrinsics.checkNotNullParameter(workSpec, "workSpec");
            Intrinsics.checkNotNullParameter(tags, "tags");
            this.configuration = configuration;
            this.workTaskExecutor = workTaskExecutor;
            this.foregroundProcessor = foregroundProcessor;
            this.workDatabase = workDatabase;
            this.workSpec = workSpec;
            this.tags = tags;
            Context applicationContext = context.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.appContext = applicationContext;
            this.runtimeExtras = new WorkerParameters.RuntimeExtras();
        }

        public final Configuration getConfiguration() {
            return this.configuration;
        }

        public final TaskExecutor getWorkTaskExecutor() {
            return this.workTaskExecutor;
        }

        public final ForegroundProcessor getForegroundProcessor() {
            return this.foregroundProcessor;
        }

        public final WorkDatabase getWorkDatabase() {
            return this.workDatabase;
        }

        public final WorkSpec getWorkSpec() {
            return this.workSpec;
        }

        public final List<String> getTags() {
            return this.tags;
        }

        public final Context getAppContext() {
            return this.appContext;
        }

        public final ListenableWorker getWorker() {
            return this.worker;
        }

        public final void setWorker(ListenableWorker listenableWorker) {
            this.worker = listenableWorker;
        }

        public final WorkerParameters.RuntimeExtras getRuntimeExtras() {
            return this.runtimeExtras;
        }

        public final void setRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            Intrinsics.checkNotNullParameter(runtimeExtras, "<set-?>");
            this.runtimeExtras = runtimeExtras;
        }

        public final Builder withRuntimeExtras(WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.runtimeExtras = runtimeExtras;
            }
            return this;
        }

        public final Builder withWorker(ListenableWorker worker) {
            Intrinsics.checkNotNullParameter(worker, "worker");
            this.worker = worker;
            return this;
        }

        public final WorkerWrapper build() {
            return new WorkerWrapper(this);
        }
    }
}
