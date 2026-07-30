package kotlinx.coroutines.channels;

import f6.p;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import y5.w;

@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$zip$2", f = "Deprecated.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, l = {487, 469, 471}, m = "invokeSuspend", n = {"$this$produce", "otherIterator", "$this$consume$iv$iv", "$this$produce", "otherIterator", "$this$consume$iv$iv", "element1", "$this$produce", "otherIterator", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$5", "L$0", "L$1", "L$3"})
/* loaded from: classes5.dex */
final class ChannelsKt__DeprecatedKt$zip$2 extends SuspendLambda implements p {
    final /* synthetic */ ReceiveChannel $other;
    final /* synthetic */ ReceiveChannel $this_zip;
    final /* synthetic */ p $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$zip$2(ReceiveChannel receiveChannel, ReceiveChannel receiveChannel2, p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.$other = receiveChannel;
        this.$this_zip = receiveChannel2;
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.c create(Object obj, kotlin.coroutines.c cVar) {
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2 = new ChannelsKt__DeprecatedKt$zip$2(this.$other, this.$this_zip, this.$transform, cVar);
        channelsKt__DeprecatedKt$zip$2.L$0 = obj;
        return channelsKt__DeprecatedKt$zip$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0 A[Catch: all -> 0x005d, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x00b8, B:18:0x00c0, B:39:0x0118, B:50:0x0051), top: B:49:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e8 A[Catch: all -> 0x010d, TRY_LEAVE, TryCatch #2 {all -> 0x010d, blocks: (B:23:0x00e0, B:25:0x00e8), top: B:22:0x00e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0118 A[Catch: all -> 0x005d, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x005d, blocks: (B:16:0x00b8, B:18:0x00c0, B:39:0x0118, B:50:0x0051), top: B:49:0x0051 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0105 -> B:10:0x0107). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0110 -> B:11:0x009a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended;
        ReceiveChannel receiveChannel;
        p pVar;
        j jVar;
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$2;
        ChannelIterator channelIterator;
        ChannelIterator it;
        ReceiveChannel receiveChannel2;
        j jVar2;
        ChannelIterator channelIterator2;
        p pVar2;
        ReceiveChannel receiveChannel3;
        Object obj2;
        ChannelIterator channelIterator3;
        Object obj3;
        ChannelsKt__DeprecatedKt$zip$2 channelsKt__DeprecatedKt$zip$22;
        j jVar3;
        ChannelIterator channelIterator4;
        p pVar3;
        Object hasNext;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        int i8 = this.label;
        try {
            if (i8 == 0) {
                y5.g.throwOnFailure(obj);
                j jVar4 = (j) this.L$0;
                ChannelIterator it2 = this.$other.iterator();
                receiveChannel = this.$this_zip;
                pVar = this.$transform;
                jVar = jVar4;
                channelsKt__DeprecatedKt$zip$2 = this;
                channelIterator = it2;
                it = receiveChannel.iterator();
                channelsKt__DeprecatedKt$zip$2.L$0 = jVar;
                channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                channelsKt__DeprecatedKt$zip$2.L$2 = pVar;
                channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                channelsKt__DeprecatedKt$zip$2.L$4 = it;
                channelsKt__DeprecatedKt$zip$2.L$5 = null;
                channelsKt__DeprecatedKt$zip$2.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                if (hasNext != coroutine_suspended) {
                }
            } else if (i8 == 1) {
                ChannelIterator channelIterator5 = (ChannelIterator) this.L$4;
                ReceiveChannel receiveChannel4 = (ReceiveChannel) this.L$3;
                p pVar4 = (p) this.L$2;
                ChannelIterator channelIterator6 = (ChannelIterator) this.L$1;
                j jVar5 = (j) this.L$0;
                y5.g.throwOnFailure(obj);
                jVar3 = jVar5;
                channelIterator4 = channelIterator6;
                pVar3 = pVar4;
                receiveChannel2 = receiveChannel4;
                channelIterator3 = channelIterator5;
                obj3 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = this;
                if (((Boolean) obj).booleanValue()) {
                }
            } else if (i8 == 2) {
                Object obj4 = this.L$5;
                channelIterator3 = (ChannelIterator) this.L$4;
                receiveChannel2 = (ReceiveChannel) this.L$3;
                p pVar5 = (p) this.L$2;
                ChannelIterator channelIterator7 = (ChannelIterator) this.L$1;
                j jVar6 = (j) this.L$0;
                try {
                    y5.g.throwOnFailure(obj);
                    jVar2 = jVar6;
                    channelIterator2 = channelIterator7;
                    pVar2 = pVar5;
                    receiveChannel3 = receiveChannel2;
                    obj2 = obj4;
                    obj3 = coroutine_suspended;
                    channelsKt__DeprecatedKt$zip$22 = this;
                    if (((Boolean) obj).booleanValue()) {
                    }
                } catch (Throwable th) {
                    th = th;
                    receiveChannel = receiveChannel2;
                    throw th;
                }
            } else {
                if (i8 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ChannelIterator channelIterator8 = (ChannelIterator) this.L$4;
                ReceiveChannel receiveChannel5 = (ReceiveChannel) this.L$3;
                pVar = (p) this.L$2;
                ChannelIterator channelIterator9 = (ChannelIterator) this.L$1;
                jVar = (j) this.L$0;
                y5.g.throwOnFailure(obj);
                channelIterator2 = channelIterator9;
                receiveChannel3 = receiveChannel5;
                channelIterator3 = channelIterator8;
                obj3 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = this;
                channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                coroutine_suspended = obj3;
                it = channelIterator3;
                receiveChannel = receiveChannel3;
                channelIterator = channelIterator2;
                channelsKt__DeprecatedKt$zip$2.L$0 = jVar;
                channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                channelsKt__DeprecatedKt$zip$2.L$2 = pVar;
                channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                channelsKt__DeprecatedKt$zip$2.L$4 = it;
                channelsKt__DeprecatedKt$zip$2.L$5 = null;
                channelsKt__DeprecatedKt$zip$2.label = 1;
                hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                if (hasNext != coroutine_suspended) {
                    return coroutine_suspended;
                }
                Object obj5 = coroutine_suspended;
                channelsKt__DeprecatedKt$zip$22 = channelsKt__DeprecatedKt$zip$2;
                obj = hasNext;
                jVar3 = jVar;
                channelIterator4 = channelIterator;
                pVar3 = pVar;
                receiveChannel2 = receiveChannel;
                channelIterator3 = it;
                obj3 = obj5;
                if (((Boolean) obj).booleanValue()) {
                    w wVar = w.INSTANCE;
                    g.cancelConsumed(receiveChannel2, null);
                    return w.INSTANCE;
                }
                Object next = channelIterator3.next();
                channelsKt__DeprecatedKt$zip$22.L$0 = jVar3;
                channelsKt__DeprecatedKt$zip$22.L$1 = channelIterator4;
                channelsKt__DeprecatedKt$zip$22.L$2 = pVar3;
                channelsKt__DeprecatedKt$zip$22.L$3 = receiveChannel2;
                channelsKt__DeprecatedKt$zip$22.L$4 = channelIterator3;
                channelsKt__DeprecatedKt$zip$22.L$5 = next;
                channelsKt__DeprecatedKt$zip$22.label = 2;
                Object hasNext2 = channelIterator4.hasNext(channelsKt__DeprecatedKt$zip$22);
                if (hasNext2 == obj3) {
                    return obj3;
                }
                ReceiveChannel receiveChannel6 = receiveChannel2;
                obj2 = next;
                obj = hasNext2;
                jVar2 = jVar3;
                channelIterator2 = channelIterator4;
                pVar2 = pVar3;
                receiveChannel3 = receiveChannel6;
                try {
                    if (((Boolean) obj).booleanValue()) {
                        channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                        coroutine_suspended = obj3;
                        it = channelIterator3;
                        receiveChannel = receiveChannel3;
                        pVar = pVar2;
                        channelIterator = channelIterator2;
                        jVar = jVar2;
                        channelsKt__DeprecatedKt$zip$2.L$0 = jVar;
                        channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                        channelsKt__DeprecatedKt$zip$2.L$2 = pVar;
                        channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                        channelsKt__DeprecatedKt$zip$2.L$4 = it;
                        channelsKt__DeprecatedKt$zip$2.L$5 = null;
                        channelsKt__DeprecatedKt$zip$2.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                        if (hasNext != coroutine_suspended) {
                        }
                    } else {
                        Object invoke = pVar2.invoke(obj2, channelIterator2.next());
                        channelsKt__DeprecatedKt$zip$22.L$0 = jVar2;
                        channelsKt__DeprecatedKt$zip$22.L$1 = channelIterator2;
                        channelsKt__DeprecatedKt$zip$22.L$2 = pVar2;
                        channelsKt__DeprecatedKt$zip$22.L$3 = receiveChannel3;
                        channelsKt__DeprecatedKt$zip$22.L$4 = channelIterator3;
                        channelsKt__DeprecatedKt$zip$22.L$5 = null;
                        channelsKt__DeprecatedKt$zip$22.label = 3;
                        if (jVar2.send(invoke, channelsKt__DeprecatedKt$zip$22) == obj3) {
                            return obj3;
                        }
                        pVar = pVar2;
                        jVar = jVar2;
                        channelsKt__DeprecatedKt$zip$2 = channelsKt__DeprecatedKt$zip$22;
                        coroutine_suspended = obj3;
                        it = channelIterator3;
                        receiveChannel = receiveChannel3;
                        channelIterator = channelIterator2;
                        channelsKt__DeprecatedKt$zip$2.L$0 = jVar;
                        channelsKt__DeprecatedKt$zip$2.L$1 = channelIterator;
                        channelsKt__DeprecatedKt$zip$2.L$2 = pVar;
                        channelsKt__DeprecatedKt$zip$2.L$3 = receiveChannel;
                        channelsKt__DeprecatedKt$zip$2.L$4 = it;
                        channelsKt__DeprecatedKt$zip$2.L$5 = null;
                        channelsKt__DeprecatedKt$zip$2.label = 1;
                        hasNext = it.hasNext(channelsKt__DeprecatedKt$zip$2);
                        if (hasNext != coroutine_suspended) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel = receiveChannel3;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        g.cancelConsumed(receiveChannel, th);
                        throw th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // f6.p
    public final Object invoke(j jVar, kotlin.coroutines.c cVar) {
        return ((ChannelsKt__DeprecatedKt$zip$2) create(jVar, cVar)).invokeSuspend(w.INSTANCE);
    }
}
