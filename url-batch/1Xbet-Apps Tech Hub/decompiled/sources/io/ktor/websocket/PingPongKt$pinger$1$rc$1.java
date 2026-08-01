package io.ktor.websocket;

import io.ktor.utils.io.charsets.CharsetJVMKt;
import io.ktor.websocket.Frame;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: PingPong.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$rc$1", f = "PingPong.kt", i = {}, l = {75, 79}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class PingPongKt$pinger$1$rc$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<Frame.Pong> $channel;
    final /* synthetic */ SendChannel<Frame> $outgoing;
    final /* synthetic */ String $pingMessage;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1$rc$1(SendChannel<? super Frame> sendChannel, String str, Channel<Frame.Pong> channel, Continuation<? super PingPongKt$pinger$1$rc$1> continuation) {
        super(2, continuation);
        this.$outgoing = sendChannel;
        this.$pingMessage = str;
        this.$channel = channel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PingPongKt$pinger$1$rc$1(this.$outgoing, this.$pingMessage, this.$channel, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PingPongKt$pinger$1$rc$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0074 -> B:6:0x0078). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        byte[] encodeToByteArray;
        PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$1;
        Object receive;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: sending ping frame");
            SendChannel<Frame> sendChannel = this.$outgoing;
            String str = this.$pingMessage;
            Charset charset = Charsets.ISO_8859_1;
            if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
                encodeToByteArray = StringsKt.encodeToByteArray(str);
            } else {
                CharsetEncoder newEncoder = charset.newEncoder();
                Intrinsics.checkNotNullExpressionValue(newEncoder, "newEncoder(...)");
                encodeToByteArray = CharsetJVMKt.encodeToByteArray(newEncoder, str, 0, str.length());
            }
            this.label = 1;
            if (sendChannel.send(new Frame.Ping(encodeToByteArray), this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else if (i == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Object obj2 = coroutine_suspended;
            PingPongKt$pinger$1$rc$1 pingPongKt$pinger$1$rc$12 = this;
            Frame.Pong pong = (Frame.Pong) obj;
            byte[] data = pong.getData();
            if (!Intrinsics.areEqual(new String(data, 0, data.length, Charsets.ISO_8859_1), pingPongKt$pinger$1$rc$12.$pingMessage)) {
                DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received valid pong frame " + pong);
                return Unit.INSTANCE;
            }
            DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket Pinger: received invalid pong frame " + pong + ", continue waiting");
            pingPongKt$pinger$1$rc$1 = pingPongKt$pinger$1$rc$12;
            coroutine_suspended = obj2;
            pingPongKt$pinger$1$rc$1.label = 2;
            receive = pingPongKt$pinger$1$rc$1.$channel.receive(pingPongKt$pinger$1$rc$1);
            if (receive != coroutine_suspended) {
                return coroutine_suspended;
            }
            Object obj3 = coroutine_suspended;
            pingPongKt$pinger$1$rc$12 = pingPongKt$pinger$1$rc$1;
            obj = receive;
            obj2 = obj3;
            Frame.Pong pong2 = (Frame.Pong) obj;
            byte[] data2 = pong2.getData();
            if (!Intrinsics.areEqual(new String(data2, 0, data2.length, Charsets.ISO_8859_1), pingPongKt$pinger$1$rc$12.$pingMessage)) {
            }
        }
        pingPongKt$pinger$1$rc$1 = this;
        pingPongKt$pinger$1$rc$1.label = 2;
        receive = pingPongKt$pinger$1$rc$1.$channel.receive(pingPongKt$pinger$1$rc$1);
        if (receive != coroutine_suspended) {
        }
    }
}
