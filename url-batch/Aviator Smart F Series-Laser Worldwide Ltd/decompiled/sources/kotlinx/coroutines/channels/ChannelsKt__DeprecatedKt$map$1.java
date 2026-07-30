package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements p {
    final /* synthetic */ ReceiveChannel $this_map;
    final /* synthetic */ p $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$map$1(ReceiveChannel receiveChannel, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$this_map = receiveChannel;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, cVar);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: all -> 0x0028, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0022, B:10:0x0079, B:15:0x008e, B:17:0x0096, B:34:0x00cc, B:45:0x0061, B:48:0x0071), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cc A[Catch: all -> 0x0028, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0028, blocks: (B:8:0x0022, B:10:0x0079, B:15:0x008e, B:17:0x0096, B:34:0x00cc, B:45:0x0061, B:48:0x0071), top: B:2:0x000a }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00c6 -> B:10:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ReceiveChannel receiveChannel;
        j jVar;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1;
        p pVar;
        ChannelIterator it;
        ReceiveChannel receiveChannel2;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$12;
        j jVar2;
        p pVar2;
        ChannelIterator channelIterator;
        j jVar3;
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$13;
        j jVar4;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        try {
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                jVar = (j) this.L$0;
                receiveChannel = this.$this_map;
                channelsKt__DeprecatedKt$map$1 = this;
                pVar = this.$transform;
                it = receiveChannel.iterator();
            } else if (i8 == 1) {
                it = (ChannelIterator) this.L$3;
                receiveChannel = (ReceiveChannel) this.L$2;
                pVar = (p) this.L$1;
                jVar4 = (j) this.L$0;
                y5.g.throwOnFailure(obj);
                channelsKt__DeprecatedKt$map$13 = this;
                if (((Boolean) obj).booleanValue()) {
                    w wVar = w.INSTANCE;
                    g.cancelConsumed(receiveChannel, null);
                    return w.INSTANCE;
                }
                Object next = it.next();
                channelsKt__DeprecatedKt$map$13.L$0 = jVar4;
                channelsKt__DeprecatedKt$map$13.L$1 = pVar;
                channelsKt__DeprecatedKt$map$13.L$2 = receiveChannel;
                channelsKt__DeprecatedKt$map$13.L$3 = it;
                channelsKt__DeprecatedKt$map$13.L$4 = jVar4;
                channelsKt__DeprecatedKt$map$13.label = 2;
                obj = pVar.invoke(next, channelsKt__DeprecatedKt$map$13);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                channelsKt__DeprecatedKt$map$12 = channelsKt__DeprecatedKt$map$13;
                jVar2 = jVar4;
                pVar2 = pVar;
                receiveChannel2 = receiveChannel;
                channelIterator = it;
                jVar3 = jVar2;
                channelsKt__DeprecatedKt$map$12.L$0 = jVar2;
                channelsKt__DeprecatedKt$map$12.L$1 = pVar2;
                channelsKt__DeprecatedKt$map$12.L$2 = receiveChannel2;
                channelsKt__DeprecatedKt$map$12.L$3 = channelIterator;
                channelsKt__DeprecatedKt$map$12.L$4 = null;
                channelsKt__DeprecatedKt$map$12.label = 3;
                if (jVar3.send(obj, channelsKt__DeprecatedKt$map$12) != coroutine_suspended) {
                }
            } else if (i8 == 2) {
                jVar3 = (j) this.L$4;
                channelIterator = (ChannelIterator) this.L$3;
                receiveChannel2 = (ReceiveChannel) this.L$2;
                pVar2 = (p) this.L$1;
                jVar2 = (j) this.L$0;
                try {
                    y5.g.throwOnFailure(obj);
                    channelsKt__DeprecatedKt$map$12 = this;
                    channelsKt__DeprecatedKt$map$12.L$0 = jVar2;
                    channelsKt__DeprecatedKt$map$12.L$1 = pVar2;
                    channelsKt__DeprecatedKt$map$12.L$2 = receiveChannel2;
                    channelsKt__DeprecatedKt$map$12.L$3 = channelIterator;
                    channelsKt__DeprecatedKt$map$12.L$4 = null;
                    channelsKt__DeprecatedKt$map$12.label = 3;
                    if (jVar3.send(obj, channelsKt__DeprecatedKt$map$12) != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    it = channelIterator;
                    receiveChannel = receiveChannel2;
                    pVar = pVar2;
                    jVar = jVar2;
                    channelsKt__DeprecatedKt$map$1 = channelsKt__DeprecatedKt$map$12;
                } catch (Throwable th) {
                    th = th;
                    receiveChannel = receiveChannel2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        g.cancelConsumed(receiveChannel, th);
                        throw th2;
                    }
                }
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (ChannelIterator) this.L$3;
                receiveChannel = (ReceiveChannel) this.L$2;
                pVar = (p) this.L$1;
                j jVar5 = (j) this.L$0;
                y5.g.throwOnFailure(obj);
                jVar = jVar5;
                channelsKt__DeprecatedKt$map$1 = this;
            }
            channelsKt__DeprecatedKt$map$1.L$0 = jVar;
            channelsKt__DeprecatedKt$map$1.L$1 = pVar;
            channelsKt__DeprecatedKt$map$1.L$2 = receiveChannel;
            channelsKt__DeprecatedKt$map$1.L$3 = it;
            channelsKt__DeprecatedKt$map$1.label = 1;
            Object hasNext = it.hasNext(channelsKt__DeprecatedKt$map$1);
            if (hasNext == coroutine_suspended) {
                return coroutine_suspended;
            }
            ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$14 = channelsKt__DeprecatedKt$map$1;
            jVar4 = jVar;
            obj = hasNext;
            channelsKt__DeprecatedKt$map$13 = channelsKt__DeprecatedKt$map$14;
            if (((Boolean) obj).booleanValue()) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
