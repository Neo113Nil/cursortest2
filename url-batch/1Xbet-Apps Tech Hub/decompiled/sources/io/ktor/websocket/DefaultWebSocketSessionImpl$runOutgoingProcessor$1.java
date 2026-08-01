package io.ktor.websocket;

import io.ktor.util.cio.ChannelIOException;
import io.ktor.websocket.CloseReason;
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
import kotlinx.coroutines.ExceptionsKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ClosedReceiveChannelException;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import kotlinx.coroutines.channels.ReceiveChannel;

/* compiled from: DefaultWebSocketSession.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.DefaultWebSocketSessionImpl$runOutgoingProcessor$1", f = "DefaultWebSocketSession.kt", i = {}, l = {236, 247, 247, 247, 240, 247, 247, 244, 247, 247}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class DefaultWebSocketSessionImpl$runOutgoingProcessor$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ DefaultWebSocketSessionImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DefaultWebSocketSessionImpl$runOutgoingProcessor$1(DefaultWebSocketSessionImpl defaultWebSocketSessionImpl, Continuation<? super DefaultWebSocketSessionImpl$runOutgoingProcessor$1> continuation) {
        super(2, continuation);
        this.this$0 = defaultWebSocketSessionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new DefaultWebSocketSessionImpl$runOutgoingProcessor$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((DefaultWebSocketSessionImpl$runOutgoingProcessor$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Channel channel;
        WebSocketSession webSocketSession;
        Channel channel2;
        WebSocketSession webSocketSession2;
        Channel channel3;
        WebSocketSession webSocketSession3;
        Channel channel4;
        WebSocketSession webSocketSession4;
        Channel channel5;
        WebSocketSession webSocketSession5;
        Channel channel6;
        WebSocketSession webSocketSession6;
        Channel channel7;
        WebSocketSession webSocketSession7;
        Object outgoingProcessorLoop;
        Channel channel8;
        WebSocketSession webSocketSession8;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            try {
            } catch (ChannelIOException unused) {
                channel4 = this.this$0.outgoingToBeProcessed;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel4, (CancellationException) null, 1, (Object) null);
                webSocketSession4 = this.this$0.raw;
                this.label = 7;
                if (WebSocketSessionKt.close$default(webSocketSession4, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (CancellationException unused2) {
                this.label = 5;
                if (DefaultWebSocketSessionImpl.sendCloseSequence$default(this.this$0, new CloseReason(CloseReason.Codes.NORMAL, ""), null, this, 2, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (ClosedReceiveChannelException unused3) {
                channel3 = this.this$0.outgoingToBeProcessed;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel3, (CancellationException) null, 1, (Object) null);
                webSocketSession3 = this.this$0.raw;
                this.label = 4;
                if (WebSocketSessionKt.close$default(webSocketSession3, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (ClosedSendChannelException unused4) {
                channel2 = this.this$0.outgoingToBeProcessed;
                ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel2, (CancellationException) null, 1, (Object) null);
                webSocketSession2 = this.this$0.raw;
                this.label = 3;
                if (WebSocketSessionKt.close$default(webSocketSession2, null, this, 1, null) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th) {
                channel = this.this$0.outgoingToBeProcessed;
                channel.cancel(ExceptionsKt.CancellationException("Failed to send frame", th));
                webSocketSession = this.this$0.raw;
                this.label = 8;
                if (WebSocketSessionKt.closeExceptionally(webSocketSession, th, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    this.label = 1;
                    outgoingProcessorLoop = this.this$0.outgoingProcessorLoop(this);
                    if (outgoingProcessorLoop == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    channel8 = this.this$0.outgoingToBeProcessed;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel8, (CancellationException) null, 1, (Object) null);
                    webSocketSession8 = this.this$0.raw;
                    this.label = 2;
                    if (WebSocketSessionKt.close$default(webSocketSession8, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    ResultKt.throwOnFailure(obj);
                    channel8 = this.this$0.outgoingToBeProcessed;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel8, (CancellationException) null, 1, (Object) null);
                    webSocketSession8 = this.this$0.raw;
                    this.label = 2;
                    if (WebSocketSessionKt.close$default(webSocketSession8, null, this, 1, null) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                case 2:
                case 3:
                case 4:
                case 6:
                case 7:
                case 9:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    channel6 = this.this$0.outgoingToBeProcessed;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel6, (CancellationException) null, 1, (Object) null);
                    webSocketSession6 = this.this$0.raw;
                    this.label = 6;
                    if (WebSocketSessionKt.close$default(webSocketSession6, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 8:
                    ResultKt.throwOnFailure(obj);
                    channel7 = this.this$0.outgoingToBeProcessed;
                    ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel7, (CancellationException) null, 1, (Object) null);
                    webSocketSession7 = this.this$0.raw;
                    this.label = 9;
                    if (WebSocketSessionKt.close$default(webSocketSession7, null, this, 1, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 10:
                    Throwable th2 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th3) {
            channel5 = this.this$0.outgoingToBeProcessed;
            ReceiveChannel.DefaultImpls.cancel$default((ReceiveChannel) channel5, (CancellationException) null, 1, (Object) null);
            webSocketSession5 = this.this$0.raw;
            this.L$0 = th3;
            this.label = 10;
            if (WebSocketSessionKt.close$default(webSocketSession5, null, this, 1, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
            throw th3;
        }
    }
}
