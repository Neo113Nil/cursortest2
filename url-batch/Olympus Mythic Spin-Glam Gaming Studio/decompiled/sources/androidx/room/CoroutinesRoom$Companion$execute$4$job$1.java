package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CoroutinesRoom.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "androidx.room.CoroutinesRoom$Companion$execute$4$job$1", f = "CoroutinesRoom.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes14.dex */
final class CoroutinesRoom$Companion$execute$4$job$1 extends SuspendLambda implements Function2 {
    final /* synthetic */ Callable<Object> $callable;
    final /* synthetic */ CancellableContinuation $continuation;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$4$job$1(Callable<Object> callable, CancellableContinuation cancellableContinuation, Continuation continuation) {
        super(2, continuation);
        this.$callable = callable;
        this.$continuation = cancellableContinuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new CoroutinesRoom$Companion$execute$4$job$1(this.$callable, this.$continuation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((CoroutinesRoom$Companion$execute$4$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        try {
            this.$continuation.resumeWith(Result.m8023constructorimpl(this.$callable.call()));
        } catch (Throwable th) {
            CancellableContinuation cancellableContinuation = this.$continuation;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m8023constructorimpl(ResultKt.createFailure(th)));
        }
        return Unit.INSTANCE;
    }
}
