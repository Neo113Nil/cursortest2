package kotlinx.coroutines.channels;

import f6.p;
import f6.q;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$mapIndexed$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {344, 345, 345}, m = "invokeSuspend", n = {"$this$produce", "index", "$this$produce", "index", "$this$produce", "index"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$mapIndexed$1 extends SuspendLambda implements p {
    final /* synthetic */ ReceiveChannel $this_mapIndexed;
    final /* synthetic */ q $transform;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$mapIndexed$1(ReceiveChannel receiveChannel, q qVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_mapIndexed = receiveChannel;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1 = new ChannelsKt__DeprecatedKt$mapIndexed$1(this.$this_mapIndexed, this.$transform, cVar);
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = obj;
        return channelsKt__DeprecatedKt$mapIndexed$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00af  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ab -> B:7:0x005c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        j jVar;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$1;
        ChannelIterator it;
        int i8;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$12;
        j jVar2;
        ChannelIterator channelIterator;
        j jVar3;
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$13;
        j jVar4;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i9 = this.label;
        if (i9 == 0) {
            y5.g.throwOnFailure(obj);
            jVar = (j) this.L$0;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
            it = this.$this_mapIndexed.iterator();
            i8 = 0;
        } else if (i9 == 1) {
            i8 = this.I$0;
            it = (ChannelIterator) this.L$1;
            jVar4 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$13 = this;
            if (((Boolean) obj).booleanValue()) {
                return w.INSTANCE;
            }
            Object next = it.next();
            q qVar = channelsKt__DeprecatedKt$mapIndexed$13.$transform;
            int i10 = i8 + 1;
            Integer boxInt = kotlin.coroutines.jvm.internal.a.boxInt(i8);
            channelsKt__DeprecatedKt$mapIndexed$13.L$0 = jVar4;
            channelsKt__DeprecatedKt$mapIndexed$13.L$1 = it;
            channelsKt__DeprecatedKt$mapIndexed$13.L$2 = jVar4;
            channelsKt__DeprecatedKt$mapIndexed$13.I$0 = i10;
            channelsKt__DeprecatedKt$mapIndexed$13.label = 2;
            obj = qVar.invoke(boxInt, next, channelsKt__DeprecatedKt$mapIndexed$13);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            channelsKt__DeprecatedKt$mapIndexed$12 = channelsKt__DeprecatedKt$mapIndexed$13;
            i8 = i10;
            jVar2 = jVar4;
            channelIterator = it;
            jVar3 = jVar2;
            channelsKt__DeprecatedKt$mapIndexed$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
            channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i8;
            channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
            if (jVar3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
            }
        } else if (i9 == 2) {
            i8 = this.I$0;
            jVar3 = (j) this.L$2;
            channelIterator = (ChannelIterator) this.L$1;
            jVar2 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            channelsKt__DeprecatedKt$mapIndexed$12 = this;
            channelsKt__DeprecatedKt$mapIndexed$12.L$0 = jVar2;
            channelsKt__DeprecatedKt$mapIndexed$12.L$1 = channelIterator;
            channelsKt__DeprecatedKt$mapIndexed$12.L$2 = null;
            channelsKt__DeprecatedKt$mapIndexed$12.I$0 = i8;
            channelsKt__DeprecatedKt$mapIndexed$12.label = 3;
            if (jVar3.send(obj, channelsKt__DeprecatedKt$mapIndexed$12) != coroutine_suspended) {
                return coroutine_suspended;
            }
            it = channelIterator;
            jVar = jVar2;
            channelsKt__DeprecatedKt$mapIndexed$1 = channelsKt__DeprecatedKt$mapIndexed$12;
        } else {
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = this.I$0;
            it = (ChannelIterator) this.L$1;
            j jVar5 = (j) this.L$0;
            y5.g.throwOnFailure(obj);
            jVar = jVar5;
            channelsKt__DeprecatedKt$mapIndexed$1 = this;
        }
        channelsKt__DeprecatedKt$mapIndexed$1.L$0 = jVar;
        channelsKt__DeprecatedKt$mapIndexed$1.L$1 = it;
        channelsKt__DeprecatedKt$mapIndexed$1.I$0 = i8;
        channelsKt__DeprecatedKt$mapIndexed$1.label = 1;
        Object hasNext = it.hasNext(channelsKt__DeprecatedKt$mapIndexed$1);
        if (hasNext == coroutine_suspended) {
            return coroutine_suspended;
        }
        ChannelsKt__DeprecatedKt$mapIndexed$1 channelsKt__DeprecatedKt$mapIndexed$14 = channelsKt__DeprecatedKt$mapIndexed$1;
        jVar4 = jVar;
        obj = hasNext;
        channelsKt__DeprecatedKt$mapIndexed$13 = channelsKt__DeprecatedKt$mapIndexed$14;
        if (((Boolean) obj).booleanValue()) {
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$mapIndexed$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
