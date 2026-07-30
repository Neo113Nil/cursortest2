package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$flatMap$1", f = "Deprecated.kt", i = {0, 1, 2}, l = {321, 322, 322}, m = "invokeSuspend", n = {"$this$produce", "$this$produce", "$this$produce"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$flatMap$1 extends SuspendLambda implements p {
    final /* synthetic */ ReceiveChannel $this_flatMap;
    final /* synthetic */ p $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$flatMap$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_flatMap = receiveChannel;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1 = new ChannelsKt__DeprecatedKt$flatMap$1(this.$this_flatMap, this.$transform, cVar);
        channelsKt__DeprecatedKt$flatMap$1.L$0 = obj;
        return channelsKt__DeprecatedKt$flatMap$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0091 -> B:8:0x0054). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ChannelIterator it;
        j jVar;
        j jVar2;
        ChannelIterator channelIterator;
        Object obj2;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$1;
        ChannelsKt__DeprecatedKt$flatMap$1 channelsKt__DeprecatedKt$flatMap$12;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        if (i8 == 0) {
            y5.g.throwOnFailure(obj);
            j jVar3 = (j) this.L$0;
            it = this.$this_flatMap.iterator();
            jVar = jVar3;
        } else if (i8 == 1) {
            ChannelIterator channelIterator2 = (ChannelIterator) this.L$1;
            j jVar4 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar4;
            channelIterator = channelIterator2;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            if (((Boolean) obj).booleanValue()) {
            }
        } else if (i8 == 2) {
            ChannelIterator channelIterator3 = (ChannelIterator) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar2 = jVar5;
            channelIterator = channelIterator3;
            obj2 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = this;
            channelsKt__DeprecatedKt$flatMap$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$flatMap$1.label = 3;
            if (g.toChannel((ReceiveChannel) obj, jVar2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$flatMap$12 = channelsKt__DeprecatedKt$flatMap$1;
            coroutine_suspended = obj2;
            it = channelIterator;
            jVar = jVar2;
            channelsKt__DeprecatedKt$flatMap$12.L$0 = jVar;
            channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
            channelsKt__DeprecatedKt$flatMap$12.label = 1;
            hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
            if (hasNext != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            channelsKt__DeprecatedKt$flatMap$1 = channelsKt__DeprecatedKt$flatMap$12;
            obj = hasNext;
            jVar2 = jVar;
            channelIterator = it;
            obj2 = obj3;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = channelIterator.next();
            p pVar = channelsKt__DeprecatedKt$flatMap$1.$transform;
            channelsKt__DeprecatedKt$flatMap$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$flatMap$1.label = 2;
            obj = pVar.invoke(next, channelsKt__DeprecatedKt$flatMap$1);
            if (obj == obj2) {
                return obj2;
            }
            channelsKt__DeprecatedKt$flatMap$1.L$0 = jVar2;
            channelsKt__DeprecatedKt$flatMap$1.L$1 = channelIterator;
            channelsKt__DeprecatedKt$flatMap$1.label = 3;
            if (g.toChannel((ReceiveChannel) obj, jVar2, channelsKt__DeprecatedKt$flatMap$1) != obj2) {
            }
        } else {
            if (i8 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (ChannelIterator) this.L$1;
            jVar = (j) this.L$0;
            y5.g.throwOnFailure(obj);
        }
        channelsKt__DeprecatedKt$flatMap$12 = this;
        channelsKt__DeprecatedKt$flatMap$12.L$0 = jVar;
        channelsKt__DeprecatedKt$flatMap$12.L$1 = it;
        channelsKt__DeprecatedKt$flatMap$12.label = 1;
        hasNext = it.hasNext(channelsKt__DeprecatedKt$flatMap$12);
        if (hasNext != coroutine_suspended) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$flatMap$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
