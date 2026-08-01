package io.ktor.websocket;

import io.ktor.util.cio.ChannelIOException;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.websocket.CloseReason;
import io.ktor.websocket.Frame;
import java.io.EOFException;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$readerJob$1", f = "RawWebSocketCommon.kt", i = {2, 3}, l = {88, 92, 95, 99}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class RawWebSocketCommon$readerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$readerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$readerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$readerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RawWebSocketCommon$readerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(2:63|(1:(2:67|(1:(8:70|71|72|45|38|28|29|30)(2:73|74))(8:75|76|77|37|38|28|29|30))(1:66))(7:82|83|12|13|(3:15|(1:17)(1:19)|18)|20|(1:22)(4:23|6|7|(1:9)(6:11|12|13|(0)|20|(0)(0)))))(1:4)|5|6|7|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0161, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0162, code lost:
    
        r11 = r0;
        r0 = r13;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x012a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012b, code lost:
    
        r11 = r0;
        r0 = r13;
        r13 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013a, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x013b, code lost:
    
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0103, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0104, code lost:
    
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f0, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
    
        r0 = r13;
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        r0 = r13;
        r13 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008d A[Catch: all -> 0x00b7, ChannelIOException -> 0x00b9, EOFException | ClosedReceiveChannelException -> 0x00bb, CancellationException -> 0x00bd, ProtocolViolationException -> 0x00bf, FrameTooBigException -> 0x00c4, TryCatch #7 {ChannelIOException -> 0x00b9, FrameTooBigException -> 0x00c4, ProtocolViolationException -> 0x00bf, EOFException | ClosedReceiveChannelException -> 0x00bb, CancellationException -> 0x00bd, all -> 0x00b7, blocks: (B:13:0x0081, B:15:0x008d, B:18:0x009f, B:19:0x0097, B:20:0x00a2), top: B:12:0x0081 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0161 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x007c A[RETURN] */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00b4 -> B:6:0x005f). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Channel channel;
        RawWebSocketCommon$readerJob$1 rawWebSocketCommon$readerJob$1;
        RawWebSocketCommon$readerJob$1 rawWebSocketCommon$readerJob$12;
        Object obj2;
        ProtocolViolationException protocolViolationException;
        FrameTooBigException frameTooBigException;
        Channel channel2;
        Channel channel3;
        Channel channel4;
        RawWebSocketCommon rawWebSocketCommon;
        Channel channel5;
        Channel channel6;
        Channel channel7;
        Channel channel8;
        Object obj3;
        ByteReadChannel byteReadChannel;
        int i;
        Object readFrame;
        RawWebSocketCommon$readerJob$1 coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        try {
            try {
                if (i2 != 0) {
                    try {
                    } catch (ChannelIOException unused) {
                        rawWebSocketCommon$readerJob$12 = this;
                        channel7 = rawWebSocketCommon$readerJob$12.this$0._incoming;
                        ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel7, (CancellationException) null, 1, (Object) null);
                        rawWebSocketCommon = rawWebSocketCommon$readerJob$12.this$0;
                        channel6 = rawWebSocketCommon._incoming;
                        SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (FrameTooBigException e) {
                        obj2 = coroutine_suspended;
                        frameTooBigException = e;
                        rawWebSocketCommon$readerJob$12 = this;
                        rawWebSocketCommon$readerJob$12.L$0 = frameTooBigException;
                        rawWebSocketCommon$readerJob$12.label = 3;
                        if (rawWebSocketCommon$readerJob$12.this$0.getOutgoing().send(new Frame.Close(new CloseReason(CloseReason.Codes.TOO_BIG, frameTooBigException.getMessage())), rawWebSocketCommon$readerJob$12) == obj2) {
                        }
                    } catch (ProtocolViolationException e2) {
                        obj2 = coroutine_suspended;
                        protocolViolationException = e2;
                        rawWebSocketCommon$readerJob$12 = this;
                        rawWebSocketCommon$readerJob$12.L$0 = protocolViolationException;
                        rawWebSocketCommon$readerJob$12.label = 4;
                        if (rawWebSocketCommon$readerJob$12.this$0.getOutgoing().send(new Frame.Close(new CloseReason(CloseReason.Codes.PROTOCOL_ERROR, protocolViolationException.getMessage())), rawWebSocketCommon$readerJob$12) == obj2) {
                        }
                    } catch (EOFException | ClosedReceiveChannelException unused2) {
                        rawWebSocketCommon$readerJob$12 = this;
                        rawWebSocketCommon = rawWebSocketCommon$readerJob$12.this$0;
                        channel6 = rawWebSocketCommon._incoming;
                        SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (CancellationException e3) {
                        e = e3;
                        rawWebSocketCommon$readerJob$1 = this;
                        channel3 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                        channel3.cancel(e);
                        rawWebSocketCommon = rawWebSocketCommon$readerJob$1.this$0;
                        channel6 = rawWebSocketCommon._incoming;
                        SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        th = th2;
                        rawWebSocketCommon$readerJob$1 = this;
                        channel2 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                        channel2.close(th);
                        throw th;
                    }
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        obj2 = coroutine_suspended;
                        rawWebSocketCommon$readerJob$1 = this;
                        try {
                            Frame frame = (Frame) obj;
                            if (!frame.getFrameType().getControlFrame()) {
                                rawWebSocketCommon$readerJob$1.this$0.lastOpcode = frame.getFin() ? 0 : frame.getFrameType().getOpcode();
                            }
                            channel8 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                            rawWebSocketCommon$readerJob$1.label = 2;
                            if (channel8.send(frame, rawWebSocketCommon$readerJob$1) != obj2) {
                                return obj2;
                            }
                            rawWebSocketCommon$readerJob$12 = rawWebSocketCommon$readerJob$1;
                            obj3 = obj2;
                            byteReadChannel = rawWebSocketCommon$readerJob$12.this$0.input;
                            long maxFrameSize = rawWebSocketCommon$readerJob$12.this$0.getMaxFrameSize();
                            i = rawWebSocketCommon$readerJob$12.this$0.lastOpcode;
                            rawWebSocketCommon$readerJob$12.label = 1;
                            readFrame = RawWebSocketCommonKt.readFrame(byteReadChannel, maxFrameSize, i, rawWebSocketCommon$readerJob$12);
                            if (readFrame != obj3) {
                                return obj3;
                            }
                            Object obj4 = obj3;
                            rawWebSocketCommon$readerJob$1 = rawWebSocketCommon$readerJob$12;
                            obj = readFrame;
                            obj2 = obj4;
                            Frame frame2 = (Frame) obj;
                            if (!frame2.getFrameType().getControlFrame()) {
                            }
                            channel8 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                            rawWebSocketCommon$readerJob$1.label = 2;
                            if (channel8.send(frame2, rawWebSocketCommon$readerJob$1) != obj2) {
                            }
                        } catch (ChannelIOException unused3) {
                            rawWebSocketCommon$readerJob$12 = rawWebSocketCommon$readerJob$1;
                            channel7 = rawWebSocketCommon$readerJob$12.this$0._incoming;
                            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel7, (CancellationException) null, 1, (Object) null);
                            rawWebSocketCommon = rawWebSocketCommon$readerJob$12.this$0;
                            channel6 = rawWebSocketCommon._incoming;
                            SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                            return Unit.INSTANCE;
                        } catch (FrameTooBigException e4) {
                            RawWebSocketCommon$readerJob$1 rawWebSocketCommon$readerJob$13 = rawWebSocketCommon$readerJob$1;
                            frameTooBigException = e4;
                            rawWebSocketCommon$readerJob$12 = rawWebSocketCommon$readerJob$13;
                            rawWebSocketCommon$readerJob$12.L$0 = frameTooBigException;
                            rawWebSocketCommon$readerJob$12.label = 3;
                            if (rawWebSocketCommon$readerJob$12.this$0.getOutgoing().send(new Frame.Close(new CloseReason(CloseReason.Codes.TOO_BIG, frameTooBigException.getMessage())), rawWebSocketCommon$readerJob$12) == obj2) {
                            }
                        } catch (ProtocolViolationException e5) {
                            RawWebSocketCommon$readerJob$1 rawWebSocketCommon$readerJob$14 = rawWebSocketCommon$readerJob$1;
                            protocolViolationException = e5;
                            rawWebSocketCommon$readerJob$12 = rawWebSocketCommon$readerJob$14;
                            rawWebSocketCommon$readerJob$12.L$0 = protocolViolationException;
                            rawWebSocketCommon$readerJob$12.label = 4;
                            if (rawWebSocketCommon$readerJob$12.this$0.getOutgoing().send(new Frame.Close(new CloseReason(CloseReason.Codes.PROTOCOL_ERROR, protocolViolationException.getMessage())), rawWebSocketCommon$readerJob$12) == obj2) {
                            }
                        } catch (EOFException | ClosedReceiveChannelException unused4) {
                            rawWebSocketCommon$readerJob$12 = rawWebSocketCommon$readerJob$1;
                            rawWebSocketCommon = rawWebSocketCommon$readerJob$12.this$0;
                            channel6 = rawWebSocketCommon._incoming;
                            SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                            return Unit.INSTANCE;
                        } catch (CancellationException e6) {
                            e = e6;
                            channel3 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                            channel3.cancel(e);
                            rawWebSocketCommon = rawWebSocketCommon$readerJob$1.this$0;
                            channel6 = rawWebSocketCommon._incoming;
                            SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            channel2 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                            channel2.close(th);
                            throw th;
                        }
                    } else {
                        if (i2 != 2) {
                            try {
                                if (i2 == 3) {
                                    FrameTooBigException frameTooBigException2 = (FrameTooBigException) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    FrameTooBigException frameTooBigException3 = frameTooBigException2;
                                    rawWebSocketCommon$readerJob$1 = this;
                                    channel5 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                                    channel5.close(frameTooBigException3);
                                    rawWebSocketCommon = rawWebSocketCommon$readerJob$1.this$0;
                                    channel6 = rawWebSocketCommon._incoming;
                                    SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                                    return Unit.INSTANCE;
                                }
                                if (i2 != 4) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                ProtocolViolationException protocolViolationException2 = (ProtocolViolationException) this.L$0;
                                ResultKt.throwOnFailure(obj);
                                ProtocolViolationException protocolViolationException3 = protocolViolationException2;
                                rawWebSocketCommon$readerJob$1 = this;
                                channel4 = rawWebSocketCommon$readerJob$1.this$0._incoming;
                                channel4.close(protocolViolationException3);
                                rawWebSocketCommon = rawWebSocketCommon$readerJob$1.this$0;
                                channel6 = rawWebSocketCommon._incoming;
                                SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                                return Unit.INSTANCE;
                            } catch (Throwable th4) {
                                th = th4;
                                coroutine_suspended = this;
                                channel = coroutine_suspended.this$0._incoming;
                                SendChannel.DefaultImpls.close$default(channel, null, 1, null);
                                throw th;
                            }
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
                rawWebSocketCommon$readerJob$12 = this;
                obj3 = coroutine_suspended;
                byteReadChannel = rawWebSocketCommon$readerJob$12.this$0.input;
                long maxFrameSize2 = rawWebSocketCommon$readerJob$12.this$0.getMaxFrameSize();
                i = rawWebSocketCommon$readerJob$12.this$0.lastOpcode;
                rawWebSocketCommon$readerJob$12.label = 1;
                readFrame = RawWebSocketCommonKt.readFrame(byteReadChannel, maxFrameSize2, i, rawWebSocketCommon$readerJob$12);
                if (readFrame != obj3) {
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            coroutine_suspended = obj;
            th = th6;
        }
    }
}
