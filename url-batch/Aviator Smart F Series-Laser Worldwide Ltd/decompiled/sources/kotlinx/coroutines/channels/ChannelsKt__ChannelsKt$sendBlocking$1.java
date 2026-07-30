package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.i0;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__ChannelsKt$sendBlocking$1", f = "Channels.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelsKt__ChannelsKt$sendBlocking$1 extends SuspendLambda implements p {
    final /* synthetic */ Object $element;
    final /* synthetic */ l $this_sendBlocking;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__ChannelsKt$sendBlocking$1(l lVar, Object obj, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_sendBlocking = lVar;
        this.$element = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        return new ChannelsKt__ChannelsKt$sendBlocking$1(this.$this_sendBlocking, this.$element, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            l lVar = this.$this_sendBlocking;
            Object obj2 = this.$element;
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
        return w.INSTANCE;
    }

    @Override // f6.p
    public final Object invoke(i0 i0Var, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__ChannelsKt$sendBlocking$1) create(i0Var, cVar)).invokeSuspend(w.INSTANCE);
    }
}
