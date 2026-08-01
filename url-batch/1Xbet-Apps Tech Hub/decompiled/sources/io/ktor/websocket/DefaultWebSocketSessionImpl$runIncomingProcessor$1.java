package io.ktor.websocket;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import io.ktor.utils.io.core.BytePacketBuilder;
import io.ktor.utils.io.core.Output;
import io.ktor.utils.io.core.OutputKt;
import io.ktor.utils.io.core.StringsKt;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.objectweb.asm.Opcodes;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runIncomingProcessor$1", f = "DefaultWebSocketSession.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7}, l = {352, Opcodes.IRETURN, 226, Opcodes.GETSTATIC, Opcodes.PUTSTATIC, Opcodes.PUTFIELD, 196, 211, 226, 226, 226, 226}, m = "invokeSuspend", n = {"$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", TypedValues.AttributesType.S_FRAME, "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv", "$this$launch", "firstFrame", "frameBody", "closeFramePresented", "$this$consume$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6", "L$8", "L$0", "L$1", "L$2", "L$3", "L$6", "L$0", "L$1", "L$2", "L$3", "L$6"})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$runIncomingProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SendChannel<Frame.Ping> $ponger;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    DefaultWebSocketSessionImpl$runIncomingProcessor$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, SendChannel<? super Frame.Ping> sendChannel, Continuation<? super DefaultWebSocketSessionImpl$runIncomingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
        this.$ponger = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1 = new DefaultWebSocketSessionImpl$runIncomingProcessor$1(this.this$0, this.$ponger, continuation);
        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = obj;
        return defaultWebSocketSessionImpl$runIncomingProcessor$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultWebSocketSessionImpl$runIncomingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x03bf, code lost:
    
        r5 = r11.element;
        kotlin.jvm.internal.Intrinsics.checkNotNull(r5);
        io.ktor.utils.io.core.OutputKt.writeFully$default((io.ktor.utils.io.core.Output) r5, r0.getData(), 0, 0, 6, (java.lang.Object) null);
        r0 = r13;
        r13 = r4;
        r29 = r12;
        r12 = r6;
        r6 = r29;
        r30 = r11;
        r11 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0335, code lost:
    
        r0 = r6;
        r6 = r7;
        r7 = r8;
        r8 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r12;
        r12 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x017a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018e A[Catch: all -> 0x0418, TryCatch #6 {all -> 0x0418, blocks: (B:24:0x0186, B:26:0x018e, B:28:0x01bc, B:30:0x01c6, B:32:0x01d4, B:33:0x01d8, B:36:0x01f6, B:49:0x0247, B:51:0x024b, B:53:0x0251, B:56:0x026b, B:57:0x026e, B:59:0x0272, B:62:0x0299, B:98:0x03c9), top: B:23:0x0186 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02c9 A[Catch: all -> 0x03c3, TryCatch #1 {all -> 0x03c3, blocks: (B:67:0x02c3, B:69:0x02c9, B:71:0x02cd, B:72:0x02cf, B:74:0x02d3, B:75:0x02dc, B:77:0x0304, B:79:0x0308, B:83:0x0338), top: B:66:0x02c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0304 A[Catch: all -> 0x03c3, TryCatch #1 {all -> 0x03c3, blocks: (B:67:0x02c3, B:69:0x02c9, B:71:0x02cd, B:72:0x02cf, B:74:0x02d3, B:75:0x02dc, B:77:0x0304, B:79:0x0308, B:83:0x0338), top: B:66:0x02c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03c9 A[Catch: all -> 0x0418, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x0418, blocks: (B:24:0x0186, B:26:0x018e, B:28:0x01bc, B:30:0x01c6, B:32:0x01d4, B:33:0x01d8, B:36:0x01f6, B:49:0x0247, B:51:0x024b, B:53:0x0251, B:56:0x026b, B:57:0x026e, B:59:0x0272, B:62:0x0299, B:98:0x03c9), top: B:23:0x0186 }] */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v50, types: [T, io.ktor.websocket.Frame] */
    /* JADX WARN: Type inference failed for: r0v87 */
    /* JADX WARN: Type inference failed for: r5v19, types: [T, io.ktor.utils.io.core.BytePacketBuilder] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Type inference failed for: r7v9, types: [kotlinx.coroutines.channels.SendChannel] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x024f -> B:16:0x028c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0289 -> B:16:0x028c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Channel channel;
        Channel channel2;
        Channel channel3;
        Channel channel4;
        ReceiveChannel<Frame> receiveChannel;
        CoroutineScope coroutineScope;
        Ref.ObjectRef objectRef;
        Ref.ObjectRef objectRef2;
        Ref.BooleanRef booleanRef;
        WebSocketSession webSocketSession;
        ReceiveChannel<Frame> incoming;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl;
        SendChannel<Frame.Ping> sendChannel;
        ChannelIterator<Frame> it;
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$1;
        ChannelIterator<Frame> channelIterator;
        Ref.ObjectRef objectRef3;
        CoroutineScope coroutineScope2;
        Object obj2;
        ?? r7;
        ChannelIterator<Frame> channelIterator2;
        SendChannel<Frame.Ping> sendChannel2;
        DefaultWebSocketSessionImpl defaultWebSocketSessionImpl2;
        Ref.BooleanRef booleanRef2;
        Ref.ObjectRef objectRef4;
        Ref.ObjectRef objectRef5;
        CoroutineScope coroutineScope3;
        DefaultWebSocketSessionImpl$runIncomingProcessor$1 defaultWebSocketSessionImpl$runIncomingProcessor$12;
        Throwable th2;
        ?? r0;
        Channel channel5;
        Frame processIncomingExtensions;
        Channel channel6;
        Frame processIncomingExtensions2;
        BytePacketBuilder bytePacketBuilder;
        Channel channel7;
        Channel channel8;
        Object checkMaxFrameSize;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = 1;
        Object obj3 = null;
        try {
            try {
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (ClosedSendChannelException unused) {
        } catch (Throwable th4) {
            th = th4;
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                objectRef = new Ref.ObjectRef();
                objectRef2 = new Ref.ObjectRef();
                booleanRef = new Ref.BooleanRef();
                try {
                    webSocketSession = this.this$0.raw;
                    incoming = webSocketSession.getIncoming();
                    defaultWebSocketSessionImpl = this.this$0;
                    sendChannel = this.$ponger;
                    try {
                        it = incoming.iterator();
                        defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                        try {
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                            obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                        } catch (Throwable th5) {
                            th = th5;
                            receiveChannel = incoming;
                            try {
                                throw th;
                            } catch (Throwable th6) {
                                ChannelsKt.cancelConsumed(receiveChannel, th);
                                throw th6;
                            }
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        receiveChannel = incoming;
                        throw th;
                    }
                } catch (ClosedSendChannelException unused2) {
                    SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                    BytePacketBuilder bytePacketBuilder2 = (BytePacketBuilder) objectRef2.element;
                    if (bytePacketBuilder2 != null) {
                        bytePacketBuilder2.release();
                        Unit unit = Unit.INSTANCE;
                    }
                    channel4 = this.this$0.filtered;
                    SendChannel.DefaultImpls.close$default(channel4, null, 1, null);
                    if (!booleanRef.element) {
                        this.L$0 = null;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.label = 10;
                        if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th8) {
                    th = th8;
                    try {
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        channel2 = this.this$0.filtered;
                        channel2.close(th);
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        BytePacketBuilder bytePacketBuilder3 = (BytePacketBuilder) objectRef2.element;
                        if (bytePacketBuilder3 != null) {
                            bytePacketBuilder3.release();
                            Unit unit2 = Unit.INSTANCE;
                        }
                        channel3 = this.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel3, null, 1, null);
                        if (!booleanRef.element) {
                            this.L$0 = null;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.L$4 = null;
                            this.L$5 = null;
                            this.L$6 = null;
                            this.L$7 = null;
                            this.L$8 = null;
                            this.label = 11;
                            if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    } catch (Throwable th9) {
                        SendChannel.DefaultImpls.close$default(this.$ponger, null, 1, null);
                        BytePacketBuilder bytePacketBuilder4 = (BytePacketBuilder) objectRef2.element;
                        if (bytePacketBuilder4 != null) {
                            bytePacketBuilder4.release();
                            Unit unit3 = Unit.INSTANCE;
                        }
                        channel = this.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                        if (booleanRef.element) {
                            throw th9;
                        }
                        this.L$0 = th9;
                        this.L$1 = null;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.L$4 = null;
                        this.L$5 = null;
                        this.L$6 = null;
                        this.L$7 = null;
                        this.L$8 = null;
                        this.label = 12;
                        if (WebSocketSessionKt.close(this.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th9;
                    }
                }
                if (obj2 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ChannelIterator<Frame> channelIterator3 = it;
                coroutineScope2 = coroutineScope;
                channelIterator = channelIterator3;
                SendChannel<Frame.Ping> sendChannel3 = sendChannel;
                objectRef3 = objectRef;
                receiveChannel = incoming;
                r7 = sendChannel3;
                try {
                    if (((Boolean) obj2).booleanValue()) {
                        Unit unit4 = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        SendChannel.DefaultImpls.close$default(defaultWebSocketSessionImpl$runIncomingProcessor$1.$ponger, null, 1, null);
                        BytePacketBuilder bytePacketBuilder5 = (BytePacketBuilder) objectRef2.element;
                        if (bytePacketBuilder5 != null) {
                            bytePacketBuilder5.release();
                            Unit unit5 = Unit.INSTANCE;
                        }
                        channel8 = defaultWebSocketSessionImpl$runIncomingProcessor$1.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel8, null, 1, null);
                        if (!booleanRef.element) {
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 9;
                            if (WebSocketSessionKt.close(defaultWebSocketSessionImpl$runIncomingProcessor$1.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), defaultWebSocketSessionImpl$runIncomingProcessor$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    Frame next = channelIterator.next();
                    DefaultWebSocketSessionKt.getLOGGER().trace("WebSocketSession(" + coroutineScope2 + ") receiving frame " + next);
                    if (next instanceof Frame.Close) {
                        if (!defaultWebSocketSessionImpl.getOutgoing().isClosedForSend()) {
                            SendChannel<Frame> outgoing = defaultWebSocketSessionImpl.getOutgoing();
                            CloseReason readReason = FrameCommonKt.readReason((Frame.Close) next);
                            if (readReason == null) {
                                readReason = DefaultWebSocketSessionKt.NORMAL_CLOSE;
                            }
                            Frame.Close close = new Frame.Close(readReason);
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = objectRef2;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = booleanRef;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = receiveChannel;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = null;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 2;
                            if (outgoing.send(close, defaultWebSocketSessionImpl$runIncomingProcessor$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                        booleanRef.element = true;
                        Unit unit6 = Unit.INSTANCE;
                        ChannelsKt.cancelConsumed(receiveChannel, null);
                        SendChannel.DefaultImpls.close$default(defaultWebSocketSessionImpl$runIncomingProcessor$1.$ponger, null, 1, null);
                        bytePacketBuilder = (BytePacketBuilder) objectRef2.element;
                        if (bytePacketBuilder != null) {
                            bytePacketBuilder.release();
                            Unit unit7 = Unit.INSTANCE;
                        }
                        channel7 = defaultWebSocketSessionImpl$runIncomingProcessor$1.this$0.filtered;
                        SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                        if (!booleanRef.element) {
                            return unit6;
                        }
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = unit6;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = null;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 3;
                        return WebSocketSessionKt.close(defaultWebSocketSessionImpl$runIncomingProcessor$1.this$0, new CloseReason(CloseReason.Codes.CLOSED_ABNORMALLY, "Connection was closed without close frame"), defaultWebSocketSessionImpl$runIncomingProcessor$1) == coroutine_suspended ? coroutine_suspended : unit6;
                    }
                    if (next instanceof Frame.Pong) {
                        SendChannel sendChannel4 = (SendChannel) defaultWebSocketSessionImpl.pinger;
                        if (sendChannel4 != null) {
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope2;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef3;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = r7;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = receiveChannel;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = channelIterator;
                            defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 4;
                            if (sendChannel4.send(next, defaultWebSocketSessionImpl$runIncomingProcessor$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Unit unit8 = Unit.INSTANCE;
                        }
                    } else if (next instanceof Frame.Ping) {
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope2;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef3;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = r7;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = receiveChannel;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = channelIterator;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 5;
                        if (r7.send(next, defaultWebSocketSessionImpl$runIncomingProcessor$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        BytePacketBuilder bytePacketBuilder6 = (BytePacketBuilder) objectRef2.element;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope2;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef3;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = r7;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = receiveChannel;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = channelIterator;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = next;
                        defaultWebSocketSessionImpl$runIncomingProcessor$1.label = 6;
                        checkMaxFrameSize = defaultWebSocketSessionImpl.checkMaxFrameSize(bytePacketBuilder6, next, defaultWebSocketSessionImpl$runIncomingProcessor$1);
                        if (checkMaxFrameSize == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        defaultWebSocketSessionImpl$runIncomingProcessor$12 = defaultWebSocketSessionImpl$runIncomingProcessor$1;
                        coroutineScope3 = coroutineScope2;
                        objectRef5 = objectRef3;
                        objectRef4 = objectRef2;
                        booleanRef2 = booleanRef;
                        defaultWebSocketSessionImpl2 = defaultWebSocketSessionImpl;
                        sendChannel2 = r7;
                        incoming = receiveChannel;
                        channelIterator2 = channelIterator;
                        r0 = next;
                        try {
                            if (r0.getFin()) {
                                if (objectRef5.element == null) {
                                    channel6 = defaultWebSocketSessionImpl2.filtered;
                                    processIncomingExtensions2 = defaultWebSocketSessionImpl2.processIncomingExtensions(r0);
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$0 = coroutineScope3;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$1 = objectRef5;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$2 = objectRef4;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$3 = booleanRef2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$4 = defaultWebSocketSessionImpl2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$5 = sendChannel2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$6 = incoming;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$7 = channelIterator2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$8 = null;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.label = 7;
                                    if (channel6.send(processIncomingExtensions2, defaultWebSocketSessionImpl$runIncomingProcessor$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelIterator = channelIterator2;
                                    receiveChannel = incoming;
                                    r7 = sendChannel2;
                                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                    booleanRef = booleanRef2;
                                    objectRef2 = objectRef4;
                                    objectRef3 = objectRef5;
                                    coroutineScope2 = coroutineScope3;
                                } else {
                                    Object obj4 = objectRef4.element;
                                    Intrinsics.checkNotNull(obj4);
                                    OutputKt.writeFully$default((Output) obj4, r0.getData(), 0, 0, 6, (Object) null);
                                    Frame.Companion companion = Frame.INSTANCE;
                                    Object obj5 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj5);
                                    FrameType frameType = ((Frame) obj5).getFrameType();
                                    Object obj6 = objectRef4.element;
                                    Intrinsics.checkNotNull(obj6);
                                    byte[] readBytes$default = StringsKt.readBytes$default(((BytePacketBuilder) obj6).build(), 0, 1, null);
                                    Object obj7 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj7);
                                    boolean rsv1 = ((Frame) obj7).getRsv1();
                                    Object obj8 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj8);
                                    boolean rsv2 = ((Frame) obj8).getRsv2();
                                    Object obj9 = objectRef5.element;
                                    Intrinsics.checkNotNull(obj9);
                                    Frame byType = companion.byType(true, frameType, readBytes$default, rsv1, rsv2, ((Frame) obj9).getRsv3());
                                    objectRef5.element = null;
                                    channel5 = defaultWebSocketSessionImpl2.filtered;
                                    processIncomingExtensions = defaultWebSocketSessionImpl2.processIncomingExtensions(byType);
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$0 = coroutineScope3;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$1 = objectRef5;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$2 = objectRef4;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$3 = booleanRef2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$4 = defaultWebSocketSessionImpl2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$5 = sendChannel2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$6 = incoming;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$7 = channelIterator2;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.L$8 = null;
                                    defaultWebSocketSessionImpl$runIncomingProcessor$12.label = 8;
                                    if (channel5.send(processIncomingExtensions, defaultWebSocketSessionImpl$runIncomingProcessor$12) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    channelIterator = channelIterator2;
                                    receiveChannel = incoming;
                                    r7 = sendChannel2;
                                    defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                    booleanRef = booleanRef2;
                                    objectRef2 = objectRef4;
                                    objectRef3 = objectRef5;
                                    coroutineScope2 = coroutineScope3;
                                }
                                defaultWebSocketSessionImpl$runIncomingProcessor$1 = defaultWebSocketSessionImpl$runIncomingProcessor$12;
                            } else {
                                if (objectRef5.element == null) {
                                    objectRef5.element = r0;
                                }
                                if (objectRef4.element == null) {
                                    objectRef4.element = new BytePacketBuilder(null, 1, null);
                                }
                                Object obj10 = objectRef4.element;
                                Intrinsics.checkNotNull(obj10);
                                OutputKt.writeFully$default((Output) obj10, r0.getData(), 0, 0, 6, (Object) null);
                                coroutineScope = coroutineScope3;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1 = defaultWebSocketSessionImpl$runIncomingProcessor$12;
                                Ref.ObjectRef objectRef6 = objectRef5;
                                it = channelIterator2;
                                objectRef = objectRef6;
                                Ref.ObjectRef objectRef7 = objectRef4;
                                sendChannel = sendChannel2;
                                defaultWebSocketSessionImpl = defaultWebSocketSessionImpl2;
                                booleanRef = booleanRef2;
                                objectRef2 = objectRef7;
                                i = 1;
                                obj3 = null;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                                defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                                obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                                if (obj2 == coroutine_suspended) {
                                }
                            }
                        } catch (Throwable th10) {
                            th2 = th10;
                            receiveChannel = incoming;
                            th = th2;
                            throw th;
                        }
                    }
                    CoroutineScope coroutineScope4 = coroutineScope2;
                    it = channelIterator;
                    coroutineScope = coroutineScope4;
                    SendChannel<Frame.Ping> sendChannel5 = r7;
                    incoming = receiveChannel;
                    objectRef = objectRef3;
                    sendChannel = sendChannel5;
                    i = 1;
                    obj3 = null;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                    defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                    obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                    if (obj2 == coroutine_suspended) {
                    }
                } catch (Throwable th11) {
                    th2 = th11;
                    th = th2;
                    throw th;
                }
                break;
            case 1:
                channelIterator = (ChannelIterator) this.L$7;
                receiveChannel = (ReceiveChannel) this.L$6;
                SendChannel sendChannel6 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef = (Ref.BooleanRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = obj;
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                r7 = sendChannel6;
                if (((Boolean) obj2).booleanValue()) {
                }
                break;
            case 2:
                receiveChannel = (ReceiveChannel) this.L$2;
                booleanRef = (Ref.BooleanRef) this.L$1;
                objectRef2 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                booleanRef.element = true;
                Unit unit62 = Unit.INSTANCE;
                ChannelsKt.cancelConsumed(receiveChannel, null);
                SendChannel.DefaultImpls.close$default(defaultWebSocketSessionImpl$runIncomingProcessor$1.$ponger, null, 1, null);
                bytePacketBuilder = (BytePacketBuilder) objectRef2.element;
                if (bytePacketBuilder != null) {
                }
                channel7 = defaultWebSocketSessionImpl$runIncomingProcessor$1.this$0.filtered;
                SendChannel.DefaultImpls.close$default(channel7, null, 1, null);
                if (!booleanRef.element) {
                }
                break;
            case 3:
                Unit unit9 = (Unit) this.L$0;
                ResultKt.throwOnFailure(obj);
                return unit9;
            case 4:
                channelIterator = (ChannelIterator) this.L$7;
                receiveChannel = (ReceiveChannel) this.L$6;
                r7 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef = (Ref.BooleanRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                Unit unit10 = Unit.INSTANCE;
                CoroutineScope coroutineScope42 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope42;
                SendChannel<Frame.Ping> sendChannel52 = r7;
                incoming = receiveChannel;
                objectRef = objectRef3;
                sendChannel = sendChannel52;
                i = 1;
                obj3 = null;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                if (obj2 == coroutine_suspended) {
                }
                break;
            case 5:
                channelIterator = (ChannelIterator) this.L$7;
                receiveChannel = (ReceiveChannel) this.L$6;
                r7 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef = (Ref.BooleanRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = this;
                CoroutineScope coroutineScope422 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope422;
                SendChannel<Frame.Ping> sendChannel522 = r7;
                incoming = receiveChannel;
                objectRef = objectRef3;
                sendChannel = sendChannel522;
                i = 1;
                obj3 = null;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                if (obj2 == coroutine_suspended) {
                }
                break;
            case 6:
                Frame frame = (Frame) this.L$8;
                channelIterator2 = (ChannelIterator) this.L$7;
                incoming = (ReceiveChannel) this.L$6;
                sendChannel2 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl2 = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef2 = (Ref.BooleanRef) this.L$3;
                objectRef4 = (Ref.ObjectRef) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    defaultWebSocketSessionImpl$runIncomingProcessor$12 = this;
                    r0 = frame;
                    if (r0.getFin()) {
                    }
                } catch (Throwable th12) {
                    th = th12;
                    receiveChannel = incoming;
                    throw th;
                }
                break;
            case 7:
                channelIterator = (ChannelIterator) this.L$7;
                receiveChannel = (ReceiveChannel) this.L$6;
                SendChannel sendChannel7 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef = (Ref.BooleanRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                r7 = sendChannel7;
                defaultWebSocketSessionImpl$runIncomingProcessor$12 = this;
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = defaultWebSocketSessionImpl$runIncomingProcessor$12;
                CoroutineScope coroutineScope4222 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope4222;
                SendChannel<Frame.Ping> sendChannel5222 = r7;
                incoming = receiveChannel;
                objectRef = objectRef3;
                sendChannel = sendChannel5222;
                i = 1;
                obj3 = null;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                if (obj2 == coroutine_suspended) {
                }
                break;
            case 8:
                channelIterator = (ChannelIterator) this.L$7;
                receiveChannel = (ReceiveChannel) this.L$6;
                SendChannel sendChannel8 = (SendChannel) this.L$5;
                defaultWebSocketSessionImpl = (DefaultWebSocketSessionImpl) this.L$4;
                booleanRef = (Ref.BooleanRef) this.L$3;
                objectRef2 = (Ref.ObjectRef) this.L$2;
                objectRef3 = (Ref.ObjectRef) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                r7 = sendChannel8;
                defaultWebSocketSessionImpl$runIncomingProcessor$12 = this;
                defaultWebSocketSessionImpl$runIncomingProcessor$1 = defaultWebSocketSessionImpl$runIncomingProcessor$12;
                CoroutineScope coroutineScope42222 = coroutineScope2;
                it = channelIterator;
                coroutineScope = coroutineScope42222;
                SendChannel<Frame.Ping> sendChannel52222 = r7;
                incoming = receiveChannel;
                objectRef = objectRef3;
                sendChannel = sendChannel52222;
                i = 1;
                obj3 = null;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$0 = coroutineScope;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$1 = objectRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$2 = objectRef2;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$3 = booleanRef;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$4 = defaultWebSocketSessionImpl;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$5 = sendChannel;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$6 = incoming;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$7 = it;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.L$8 = obj3;
                defaultWebSocketSessionImpl$runIncomingProcessor$1.label = i;
                obj2 = it.hasNext(defaultWebSocketSessionImpl$runIncomingProcessor$1);
                if (obj2 == coroutine_suspended) {
                }
                break;
            case 9:
            case 10:
            case 11:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            case 12:
                Throwable th13 = (Throwable) this.L$0;
                ResultKt.throwOnFailure(obj);
                throw th13;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
