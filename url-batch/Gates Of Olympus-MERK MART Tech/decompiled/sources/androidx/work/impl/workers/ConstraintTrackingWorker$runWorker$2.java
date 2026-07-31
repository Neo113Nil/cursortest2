package androidx.work.impl.workers;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: ConstraintTrackingWorker.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2", f = "ConstraintTrackingWorker.kt", i = {0, 0, 0}, l = {134}, m = "invokeSuspend", n = {"atomicReason", "future", "constraintTrackingJob"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class ConstraintTrackingWorker$runWorker$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
    final /* synthetic */ ListenableWorker $delegate;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ WorkSpec $workSpec;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2(ListenableWorker listenableWorker, WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, Continuation<? super ConstraintTrackingWorker$runWorker$2> continuation) {
        super(2, continuation);
        this.$delegate = listenableWorker;
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = workSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ConstraintTrackingWorker$runWorker$2 constraintTrackingWorker$runWorker$2 = new ConstraintTrackingWorker$runWorker$2(this.$delegate, this.$workConstraintsTracker, this.$workSpec, continuation);
        constraintTrackingWorker$runWorker$2.L$0 = obj;
        return constraintTrackingWorker$runWorker$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ListenableWorker.Result> continuation) {
        return ((ConstraintTrackingWorker$runWorker$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ec A[Catch: all -> 0x00ed, TRY_LEAVE, TryCatch #2 {all -> 0x00ed, blocks: (B:27:0x0080, B:28:0x00a4, B:14:0x00a9, B:17:0x00da, B:20:0x00e2, B:21:0x00eb, B:23:0x00ec), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d9  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int, kotlinx.coroutines.Job] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        Throwable th;
        AtomicInteger atomicInteger;
        ListenableFuture<ListenableWorker.Result> listenableFuture;
        Job job;
        String str;
        String str2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r1 = this.label;
        try {
            if (r1 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                AtomicInteger atomicInteger2 = new AtomicInteger(-256);
                ListenableFuture<ListenableWorker.Result> startWork = this.$delegate.startWork();
                Intrinsics.checkNotNullExpressionValue(startWork, "startWork(...)");
                launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, atomicInteger2, startWork, null), 3, null);
                try {
                    this.L$0 = atomicInteger2;
                    this.L$1 = startWork;
                    this.L$2 = launch$default;
                    this.label = 1;
                    Object await = ListenableFutureKt.await(startWork, this);
                    if (await == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    listenableFuture = startWork;
                    obj = await;
                    atomicInteger = atomicInteger2;
                    job = launch$default;
                } catch (CancellationException e) {
                    e = e;
                    atomicInteger = atomicInteger2;
                    listenableFuture = startWork;
                    CancellationException cancellationException = e;
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str2, "Delegated worker " + this.$delegate.getClass() + " was cancelled", cancellationException);
                    if (atomicInteger.get() == -256) {
                    }
                    if (listenableFuture.isCancelled()) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    str = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str, "Delegated worker " + this.$delegate.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            } else {
                if (r1 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                job = (Job) this.L$2;
                listenableFuture = (ListenableFuture) this.L$1;
                atomicInteger = (AtomicInteger) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e2) {
                    e = e2;
                    CancellationException cancellationException2 = e;
                    str2 = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str2, "Delegated worker " + this.$delegate.getClass() + " was cancelled", cancellationException2);
                    boolean z = atomicInteger.get() == -256;
                    if (listenableFuture.isCancelled()) {
                        throw cancellationException2;
                    }
                    if (z) {
                        throw new ConstraintTrackingWorker.ConstraintUnsatisfiedException(atomicInteger.get());
                    }
                    throw cancellationException2;
                } catch (Throwable th3) {
                    th = th3;
                    str = ConstraintTrackingWorkerKt.TAG;
                    Logger.get().debug(str, "Delegated worker " + this.$delegate.getClass() + " threw exception in startWork.", th);
                    throw th;
                }
            }
            ListenableWorker.Result result = (ListenableWorker.Result) obj;
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            return result;
        } catch (Throwable th4) {
            Job.DefaultImpls.cancel$default((Job) r1, (CancellationException) null, 1, (Object) null);
            throw th4;
        }
    }
}
