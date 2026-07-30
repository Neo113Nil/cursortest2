package kotlinx.coroutines.channels;

import f6.p;
import kotlin.collections.c0;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$withIndex$1", f = "Deprecated.kt", i = {0, 0, 1, 1}, l = {370, 371}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$withIndex$1 extends SuspendLambda implements p {
    final /* synthetic */ ReceiveChannel $this_withIndex;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$withIndex$1(ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_withIndex = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1 = new ChannelsKt__DeprecatedKt$withIndex$1(this.$this_withIndex, cVar);
        channelsKt__DeprecatedKt$withIndex$1.L$0 = obj;
        return channelsKt__DeprecatedKt$withIndex$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007f -> B:6:0x0047). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        ChannelIterator it;
        int i8;
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$1;
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$12;
        j jVar2;
        ChannelIterator channelIterator;
        int i9;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i10 = this.label;
        if (i10 == 0) {
            y5.g.throwOnFailure(obj);
            jVar = (j) this.L$0;
            it = this.$this_withIndex.iterator();
            i8 = 0;
            channelsKt__DeprecatedKt$withIndex$1 = this;
        } else if (i10 == 1) {
            i9 = this.I$0;
            channelIterator = (ChannelIterator) this.L$1;
            jVar2 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            channelsKt__DeprecatedKt$withIndex$12 = this;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            int i11 = i9 + 1;
            c0 c0Var = new c0(i9, channelIterator.next());
            channelsKt__DeprecatedKt$withIndex$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$withIndex$12.L$1 = channelIterator;
            channelsKt__DeprecatedKt$withIndex$12.I$0 = i11;
            channelsKt__DeprecatedKt$withIndex$12.label = 2;
            if (jVar2.send(c0Var, channelsKt__DeprecatedKt$withIndex$12) == coroutine_suspended) {
                return coroutine_suspended;
            }
            it = channelIterator;
            jVar = jVar2;
            channelsKt__DeprecatedKt$withIndex$1 = channelsKt__DeprecatedKt$withIndex$12;
            i8 = i11;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.I$0;
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            j jVar3 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar = jVar3;
            channelsKt__DeprecatedKt$withIndex$1 = this;
            i8 = i12;
            it = channelIterator2;
        }
        channelsKt__DeprecatedKt$withIndex$1.L$0 = jVar;
        channelsKt__DeprecatedKt$withIndex$1.L$1 = it;
        channelsKt__DeprecatedKt$withIndex$1.I$0 = i8;
        channelsKt__DeprecatedKt$withIndex$1.label = 1;
        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$withIndex$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelsKt__DeprecatedKt$withIndex$1 channelsKt__DeprecatedKt$withIndex$13 = channelsKt__DeprecatedKt$withIndex$1;
        jVar2 = jVar;
        obj = hasNext;
        channelsKt__DeprecatedKt$withIndex$12 = channelsKt__DeprecatedKt$withIndex$13;
        int i13 = i8;
        channelIterator = it;
        i9 = i13;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$withIndex$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
