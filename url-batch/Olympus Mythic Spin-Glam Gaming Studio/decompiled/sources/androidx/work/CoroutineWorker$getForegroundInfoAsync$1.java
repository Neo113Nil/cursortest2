package androidx.work;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutineWorker.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.work.CoroutineWorker$getForegroundInfoAsync$1", f = "CoroutineWorker.kt", l = {134}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class CoroutineWorker$getForegroundInfoAsync$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ JobListenableFuture<ForegroundInfo> $jobFuture;
    Object L$0;
    int label;
    final /* synthetic */ CoroutineWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutineWorker$getForegroundInfoAsync$1(JobListenableFuture<ForegroundInfo> jobListenableFuture, CoroutineWorker coroutineWorker, Continuation continuation) {
        super(2, continuation);
        this.$jobFuture = jobListenableFuture;
        this.this$0 = coroutineWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new CoroutineWorker$getForegroundInfoAsync$1(this.$jobFuture, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((CoroutineWorker$getForegroundInfoAsync$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        JobListenableFuture<ForegroundInfo> jobListenableFuture;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            JobListenableFuture<ForegroundInfo> jobListenableFuture2 = this.$jobFuture;
            CoroutineWorker coroutineWorker = this.this$0;
            this.L$0 = jobListenableFuture2;
            this.label = 1;
            Object foregroundInfo = coroutineWorker.getForegroundInfo(this);
            if (foregroundInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jobListenableFuture = jobListenableFuture2;
            obj = foregroundInfo;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jobListenableFuture = (JobListenableFuture) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        jobListenableFuture.complete(obj);
        return Unit.INSTANCE;
    }
}
