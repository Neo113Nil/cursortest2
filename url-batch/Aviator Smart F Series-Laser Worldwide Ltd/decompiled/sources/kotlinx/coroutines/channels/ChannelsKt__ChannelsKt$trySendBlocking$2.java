package kotlinx.coroutines.channels;

import f6.p;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$trySendBlocking$2", f = "Channels.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelsKt__ChannelsKt$trySendBlocking$2 extends SuspendLambda implements p {
    final /* synthetic */ E $element;
    final /* synthetic */ l $this_trySendBlocking;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__ChannelsKt$trySendBlocking$2(l lVar, E e8, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_trySendBlocking = lVar;
        this.$element = e8;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__ChannelsKt$trySendBlocking$2 channelsKt__ChannelsKt$trySendBlocking$2 = new ChannelsKt__ChannelsKt$trySendBlocking$2(this.$this_trySendBlocking, this.$element, cVar);
        channelsKt__ChannelsKt$trySendBlocking$2.L$0 = obj;
        return channelsKt__ChannelsKt$trySendBlocking$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        Object m348constructorimpl;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        try {
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                l lVar = this.$this_trySendBlocking;
                Object obj2 = this.$element;
                Result.a aVar = Result.Companion;
                this.label = 1;
                if (lVar.send(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                y5.g.throwOnFailure(obj);
            }
            m348constructorimpl = Result.m348constructorimpl(w.INSTANCE);
        } catch (Throwable th) {
            Result.a aVar2 = Result.Companion;
            m348constructorimpl = Result.m348constructorimpl(y5.g.createFailure(th));
        }
        return e.m1240boximpl(Result.m355isSuccessimpl(m348constructorimpl) ? e.Companion.m1255successJP2dKIU(w.INSTANCE) : e.Companion.m1253closedJP2dKIU(Result.m351exceptionOrNullimpl(m348constructorimpl)));
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__ChannelsKt$trySendBlocking$2) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
