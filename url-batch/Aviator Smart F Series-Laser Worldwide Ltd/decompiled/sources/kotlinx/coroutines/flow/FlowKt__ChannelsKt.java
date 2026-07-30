package kotlinx.coroutines.flow;

import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i0;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__ChannelsKt {

    public static final class a implements e {
        final /* synthetic */ kotlinx.coroutines.channels.a $this_asFlow$inlined;

        public a(kotlinx.coroutines.channels.a aVar) {
        }

        @Override // kotlinx.coroutines.flow.e, kotlinx.coroutines.flow.a
        public Object collect(f fVar, kotlin.coroutines.c cVar) {
            throw null;
        }
    }

    public static final <T> e asFlow(kotlinx.coroutines.channels.a aVar) {
        return new a(aVar);
    }

    public static final <T> e consumeAsFlow(ReceiveChannel receiveChannel) {
        return new b(receiveChannel, true, null, 0, null, 28, null);
    }

    public static final <T> Object emitAll(f fVar, ReceiveChannel receiveChannel, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object emitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt(fVar, receiveChannel, true, cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return emitAllImpl$FlowKt__ChannelsKt == coroutine_suspended ? emitAllImpl$FlowKt__ChannelsKt : y5.w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:12:0x0036, B:14:0x0062, B:19:0x0077, B:21:0x007f, B:32:0x0054, B:34:0x005e), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0091 -> B:13:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object emitAllImpl$FlowKt__ChannelsKt(f fVar, ReceiveChannel receiveChannel, boolean z7, kotlin.coroutines.c cVar) {
        FlowKt__ChannelsKt$emitAllImpl$1 flowKt__ChannelsKt$emitAllImpl$1;
        Object coroutine_suspended;
        int i8;
        ChannelIterator it;
        ChannelIterator channelIterator;
        f fVar2;
        Object hasNext;
        try {
            if (cVar instanceof FlowKt__ChannelsKt$emitAllImpl$1) {
                flowKt__ChannelsKt$emitAllImpl$1 = (FlowKt__ChannelsKt$emitAllImpl$1) cVar;
                int i9 = flowKt__ChannelsKt$emitAllImpl$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    flowKt__ChannelsKt$emitAllImpl$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = flowKt__ChannelsKt$emitAllImpl$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = flowKt__ChannelsKt$emitAllImpl$1.label;
                    if (i8 != 0) {
                        y5.g.throwOnFailure(obj);
                        g.ensureActive(fVar);
                        it = receiveChannel.iterator();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = fVar;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z7;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext == coroutine_suspended) {
                        }
                    } else if (i8 == 1) {
                        z7 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        fVar2 = (f) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        y5.g.throwOnFailure(obj);
                        if (((Boolean) obj).booleanValue()) {
                        }
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z7 = flowKt__ChannelsKt$emitAllImpl$1.Z$0;
                        channelIterator = (ChannelIterator) flowKt__ChannelsKt$emitAllImpl$1.L$2;
                        receiveChannel = (ReceiveChannel) flowKt__ChannelsKt$emitAllImpl$1.L$1;
                        fVar2 = (f) flowKt__ChannelsKt$emitAllImpl$1.L$0;
                        y5.g.throwOnFailure(obj);
                        it = channelIterator;
                        fVar = fVar2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = fVar;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z7;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        fVar2 = fVar;
                        channelIterator = it;
                        obj = hasNext;
                        if (((Boolean) obj).booleanValue()) {
                            if (z7) {
                                kotlinx.coroutines.channels.g.cancelConsumed(receiveChannel, null);
                            }
                            return y5.w.INSTANCE;
                        }
                        Object next = channelIterator.next();
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = fVar2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = channelIterator;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z7;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 2;
                        if (fVar2.emit(next, flowKt__ChannelsKt$emitAllImpl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator;
                        fVar = fVar2;
                        flowKt__ChannelsKt$emitAllImpl$1.L$0 = fVar;
                        flowKt__ChannelsKt$emitAllImpl$1.L$1 = receiveChannel;
                        flowKt__ChannelsKt$emitAllImpl$1.L$2 = it;
                        flowKt__ChannelsKt$emitAllImpl$1.Z$0 = z7;
                        flowKt__ChannelsKt$emitAllImpl$1.label = 1;
                        hasNext = it.hasNext(flowKt__ChannelsKt$emitAllImpl$1);
                        if (hasNext == coroutine_suspended) {
                        }
                    }
                }
            }
            if (i8 != 0) {
            }
        } finally {
        }
        flowKt__ChannelsKt$emitAllImpl$1 = new FlowKt__ChannelsKt$emitAllImpl$1(cVar);
        Object obj2 = flowKt__ChannelsKt$emitAllImpl$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ChannelsKt$emitAllImpl$1.label;
    }

    public static final <T> ReceiveChannel produceIn(e eVar, i0 i0Var) {
        return kotlinx.coroutines.flow.internal.d.asChannelFlow(eVar).produceImpl(i0Var);
    }

    public static final <T> e receiveAsFlow(ReceiveChannel receiveChannel) {
        return new b(receiveChannel, false, null, 0, null, 28, null);
    }
}
