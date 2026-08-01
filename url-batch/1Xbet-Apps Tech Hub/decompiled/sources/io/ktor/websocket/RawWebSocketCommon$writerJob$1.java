package io.ktor.websocket;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.ktor.util.cio.ChannelWriteException;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.ByteWriteChannelKt;
import io.ktor.websocket.Frame;
import io.ktor.websocket.RawWebSocketCommon;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: RawWebSocketCommon.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.RawWebSocketCommon$writerJob$1", f = "RawWebSocketCommon.kt", i = {1}, l = {58, 60}, m = "invokeSuspend", n = {PglCryptUtils.KEY_MESSAGE}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RawWebSocketCommon$writerJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ RawWebSocketCommon this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RawWebSocketCommon$writerJob$1(RawWebSocketCommon rawWebSocketCommon, Continuation<? super RawWebSocketCommon$writerJob$1> continuation) {
        super(2, continuation);
        this.this$0 = rawWebSocketCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RawWebSocketCommon$writerJob$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RawWebSocketCommon$writerJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x00c6, ChannelWriteException -> 0x00c8, TRY_LEAVE, TryCatch #7 {ChannelWriteException -> 0x00c8, all -> 0x00c6, blocks: (B:11:0x004a, B:13:0x004e, B:44:0x00a1, B:46:0x00a5, B:47:0x00ad, B:48:0x00c5), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007c A[Catch: all -> 0x00ca, ChannelWriteException -> 0x00f1, TRY_LEAVE, TryCatch #5 {ChannelWriteException -> 0x00f1, all -> 0x00ca, blocks: (B:18:0x006f, B:5:0x0032, B:20:0x007c), top: B:17:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0119 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[Catch: all -> 0x00c6, ChannelWriteException -> 0x00c8, TRY_ENTER, TryCatch #7 {ChannelWriteException -> 0x00c8, all -> 0x00c6, blocks: (B:11:0x004a, B:13:0x004e, B:44:0x00a1, B:46:0x00a5, B:47:0x00ad, B:48:0x00c5), top: B:10:0x004a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0045 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0046  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v9, types: [io.ktor.websocket.RawWebSocketCommon$writerJob$1] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x007a -> B:5:0x0032). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00a5 -> B:5:0x0032). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel channel;
        ByteWriteChannel byteWriteChannel;
        RawWebSocketCommon$writerJob$1 rawWebSocketCommon$writerJob$1;
        Object obj2;
        RawWebSocketCommon$writerJob$1 rawWebSocketCommon$writerJob$12;
        Channel channel2;
        Channel channel3;
        ByteWriteChannel byteWriteChannel2;
        Channel channel4;
        Channel channel5;
        Object m2111getOrNullimpl;
        ByteWriteChannel byteWriteChannel3;
        Channel channel6;
        Object obj3;
        ByteWriteChannel byteWriteChannel4;
        Channel channel7;
        Object receive;
        RawWebSocketCommon$writerJob$1 coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        try {
            if (i != 0) {
                try {
                } catch (ChannelWriteException e) {
                    e = e;
                    rawWebSocketCommon$writerJob$1 = this;
                    channel4 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                    channel4.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                    coroutine_suspended = rawWebSocketCommon$writerJob$1;
                    channel3 = coroutine_suspended.this$0._outgoing;
                    channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                    byteWriteChannel2 = coroutine_suspended.this$0.output;
                    ByteWriteChannelKt.close(byteWriteChannel2);
                    rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                    while (true) {
                        channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                        m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                        if (m2111getOrNullimpl != null) {
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    rawWebSocketCommon$writerJob$1 = this;
                    channel2 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                    channel2.close(th);
                    coroutine_suspended = rawWebSocketCommon$writerJob$1;
                    channel3 = coroutine_suspended.this$0._outgoing;
                    channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                    byteWriteChannel2 = coroutine_suspended.this$0.output;
                    ByteWriteChannelKt.close(byteWriteChannel2);
                    rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                    while (true) {
                        channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                        m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                        if (m2111getOrNullimpl != null) {
                        }
                    }
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    obj2 = coroutine_suspended;
                    rawWebSocketCommon$writerJob$1 = this;
                    if (obj instanceof Frame) {
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj4 = this.L$0;
                    ResultKt.throwOnFailure(obj);
                    rawWebSocketCommon$writerJob$12 = this;
                    Object obj5 = coroutine_suspended;
                    try {
                        byteWriteChannel3 = rawWebSocketCommon$writerJob$12.this$0.output;
                        byteWriteChannel3.flush();
                        obj3 = obj5;
                    } catch (ChannelWriteException e2) {
                        rawWebSocketCommon$writerJob$1 = rawWebSocketCommon$writerJob$12;
                        e = e2;
                        channel4 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                        channel4.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                        coroutine_suspended = rawWebSocketCommon$writerJob$1;
                        channel3 = coroutine_suspended.this$0._outgoing;
                        channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                        byteWriteChannel2 = coroutine_suspended.this$0.output;
                        ByteWriteChannelKt.close(byteWriteChannel2);
                        rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                        while (true) {
                            channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                            if (m2111getOrNullimpl != null) {
                            }
                        }
                    } catch (Throwable th2) {
                        rawWebSocketCommon$writerJob$1 = rawWebSocketCommon$writerJob$12;
                        th = th2;
                        channel2 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                        channel2.close(th);
                        coroutine_suspended = rawWebSocketCommon$writerJob$1;
                        channel3 = coroutine_suspended.this$0._outgoing;
                        channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                        byteWriteChannel2 = coroutine_suspended.this$0.output;
                        ByteWriteChannelKt.close(byteWriteChannel2);
                        rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                        while (true) {
                            channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                            if (m2111getOrNullimpl != null) {
                            }
                        }
                    }
                    if (obj4 instanceof Frame.Close) {
                        channel6 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                        SendChannel.DefaultImpls.close$default(channel6, null, 1, null);
                        while (true) {
                            channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                            if (m2111getOrNullimpl != null) {
                                if (m2111getOrNullimpl instanceof RawWebSocketCommon.FlushRequest) {
                                    ((RawWebSocketCommon.FlushRequest) m2111getOrNullimpl).complete();
                                }
                            } else {
                                return Unit.INSTANCE;
                            }
                        }
                    }
                    channel7 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                    rawWebSocketCommon$writerJob$12.L$0 = null;
                    rawWebSocketCommon$writerJob$12.label = 1;
                    receive = channel7.receive(rawWebSocketCommon$writerJob$12);
                    if (receive != obj3) {
                        return obj3;
                    }
                    Object obj6 = obj3;
                    rawWebSocketCommon$writerJob$1 = rawWebSocketCommon$writerJob$12;
                    obj = receive;
                    obj2 = obj6;
                    try {
                        if (obj instanceof Frame) {
                            byteWriteChannel4 = rawWebSocketCommon$writerJob$1.this$0.output;
                            rawWebSocketCommon$writerJob$1.L$0 = obj;
                            rawWebSocketCommon$writerJob$1.label = 2;
                            if (RawWebSocketCommonKt.writeFrame(byteWriteChannel4, (Frame) obj, rawWebSocketCommon$writerJob$1.this$0.getMasking(), rawWebSocketCommon$writerJob$1) == obj2) {
                                return obj2;
                            }
                            Object obj7 = obj2;
                            obj4 = obj;
                            rawWebSocketCommon$writerJob$12 = rawWebSocketCommon$writerJob$1;
                            obj5 = obj7;
                            byteWriteChannel3 = rawWebSocketCommon$writerJob$12.this$0.output;
                            byteWriteChannel3.flush();
                            obj3 = obj5;
                            if (obj4 instanceof Frame.Close) {
                            }
                            channel7 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            rawWebSocketCommon$writerJob$12.L$0 = null;
                            rawWebSocketCommon$writerJob$12.label = 1;
                            receive = channel7.receive(rawWebSocketCommon$writerJob$12);
                            if (receive != obj3) {
                            }
                        } else if (obj instanceof RawWebSocketCommon.FlushRequest) {
                            ((RawWebSocketCommon.FlushRequest) obj).complete();
                            rawWebSocketCommon$writerJob$12 = rawWebSocketCommon$writerJob$1;
                            obj3 = obj2;
                            channel7 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            rawWebSocketCommon$writerJob$12.L$0 = null;
                            rawWebSocketCommon$writerJob$12.label = 1;
                            receive = channel7.receive(rawWebSocketCommon$writerJob$12);
                            if (receive != obj3) {
                            }
                        } else {
                            throw new IllegalArgumentException("unknown message " + obj);
                        }
                    } catch (ChannelWriteException e3) {
                        e = e3;
                        channel4 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                        channel4.close(ExceptionsKt.CancellationException("Failed to write to WebSocket.", e));
                        coroutine_suspended = rawWebSocketCommon$writerJob$1;
                        channel3 = coroutine_suspended.this$0._outgoing;
                        channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                        byteWriteChannel2 = coroutine_suspended.this$0.output;
                        ByteWriteChannelKt.close(byteWriteChannel2);
                        rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                        while (true) {
                            channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                            if (m2111getOrNullimpl != null) {
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        channel2 = rawWebSocketCommon$writerJob$1.this$0._outgoing;
                        channel2.close(th);
                        coroutine_suspended = rawWebSocketCommon$writerJob$1;
                        channel3 = coroutine_suspended.this$0._outgoing;
                        channel3.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
                        byteWriteChannel2 = coroutine_suspended.this$0.output;
                        ByteWriteChannelKt.close(byteWriteChannel2);
                        rawWebSocketCommon$writerJob$12 = coroutine_suspended;
                        while (true) {
                            channel5 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                            m2111getOrNullimpl = ChannelResult.m2111getOrNullimpl(channel5.mo2101tryReceivePtdJZtk());
                            if (m2111getOrNullimpl != null) {
                            }
                        }
                    }
                }
            } else {
                ResultKt.throwOnFailure(obj);
                rawWebSocketCommon$writerJob$12 = this;
                obj3 = coroutine_suspended;
                channel7 = rawWebSocketCommon$writerJob$12.this$0._outgoing;
                rawWebSocketCommon$writerJob$12.L$0 = null;
                rawWebSocketCommon$writerJob$12.label = 1;
                receive = channel7.receive(rawWebSocketCommon$writerJob$12);
                if (receive != obj3) {
                }
            }
        } finally {
            channel = coroutine_suspended.this$0._outgoing;
            channel.close(ExceptionsKt.CancellationException("WebSocket closed.", null));
            byteWriteChannel = coroutine_suspended.this$0.output;
            ByteWriteChannelKt.close(byteWriteChannel);
        }
    }
}
