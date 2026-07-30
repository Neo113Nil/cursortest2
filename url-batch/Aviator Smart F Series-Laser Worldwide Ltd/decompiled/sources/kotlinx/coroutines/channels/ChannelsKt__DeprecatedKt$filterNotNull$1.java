package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$filterNotNull$1", f = "Deprecated.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$filterNotNull$1 extends SuspendLambda implements p {
    /* synthetic */ Object L$0;
    int label;

    ChannelsKt__DeprecatedKt$filterNotNull$1(kotlin.coroutines.c cVar) {
        super(2, cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$filterNotNull$1 channelsKt__DeprecatedKt$filterNotNull$1 = new ChannelsKt__DeprecatedKt$filterNotNull$1(cVar);
        channelsKt__DeprecatedKt$filterNotNull$1.L$0 = obj;
        return channelsKt__DeprecatedKt$filterNotNull$1;
    }

    @Override // f6.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((ChannelsKt__DeprecatedKt$filterNotNull$1) obj, (kotlin.coroutines.c) obj2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        y5.g.throwOnFailure(obj);
        return kotlin.coroutines.jvm.internal.a.boxBoolean(this.L$0 != null);
    }

    public final Object invoke(E e8, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$filterNotNull$1) create(e8, cVar)).invokeSuspend(w.INSTANCE);
    }
}
