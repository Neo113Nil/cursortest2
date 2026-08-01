package io.ktor.websocket;

import io.ktor.util.CryptoKt;
import io.ktor.util.date.DateJvmKt;
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
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;

/* compiled from: PingPong.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1", f = "PingPong.kt", i = {0, 0, 1, 1}, l = {64, 73, 95}, m = "invokeSuspend", n = {"random", "pingIdBytes", "random", "pingIdBytes"}, s = {"L$0", "L$1", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class PingPongKt$pinger$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Channel<Frame.Pong> $channel;
    final /* synthetic */ Function2<CloseReason, Continuation<? super Unit>, Object> $onTimeout;
    final /* synthetic */ SendChannel<Frame> $outgoing;
    final /* synthetic */ long $periodMillis;
    final /* synthetic */ long $timeoutMillis;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    PingPongKt$pinger$1(long j, long j2, Function2<? super CloseReason, ? super Continuation<? super Unit>, ? extends Object> function2, Channel<Frame.Pong> channel, SendChannel<? super Frame> sendChannel, Continuation<? super PingPongKt$pinger$1> continuation) {
        super(2, continuation);
        this.$periodMillis = j;
        this.$timeoutMillis = j2;
        this.$onTimeout = function2;
        this.$channel = channel;
        this.$outgoing = sendChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PingPongKt$pinger$1(this.$periodMillis, this.$timeoutMillis, this.$onTimeout, this.$channel, this.$outgoing, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((PingPongKt$pinger$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d6 A[Catch: CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00fb, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00fb, CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00fb, TRY_LEAVE, TryCatch #0 {CancellationException | ClosedReceiveChannelException | ClosedSendChannelException -> 0x00fb, blocks: (B:7:0x0012, B:14:0x0027, B:14:0x0027, B:14:0x0027, B:16:0x00d2, B:16:0x00d2, B:16:0x00d2, B:18:0x00d6, B:18:0x00d6, B:18:0x00d6, B:22:0x0074, B:22:0x0074, B:22:0x0074, B:26:0x0092, B:26:0x0092, B:26:0x0092, B:31:0x0035, B:31:0x0035, B:31:0x0035), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cf  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00cf -> B:16:0x00d2). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Random Random;
        byte[] bArr;
        PingPongKt$pinger$1 pingPongKt$pinger$1;
        PingPongKt$pinger$1 pingPongKt$pinger$12;
        Random random;
        Object withTimeoutOrNull;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            DefaultWebSocketSessionKt.getLOGGER().trace("Starting WebSocket pinger coroutine with period " + this.$periodMillis + " ms and timeout " + this.$timeoutMillis + " ms");
            Random = RandomKt.Random(DateJvmKt.getTimeMillis());
            bArr = new byte[32];
            pingPongKt$pinger$1 = this;
            pingPongKt$pinger$1.L$0 = Random;
            pingPongKt$pinger$1.L$1 = bArr;
            pingPongKt$pinger$1.label = 1;
            if (TimeoutKt.withTimeoutOrNull(pingPongKt$pinger$1.$periodMillis, new AnonymousClass1(pingPongKt$pinger$1.$channel, null), pingPongKt$pinger$1) != coroutine_suspended) {
            }
        } else if (i == 1) {
            bArr = (byte[]) this.L$1;
            random = (Random) this.L$0;
            ResultKt.throwOnFailure(obj);
            pingPongKt$pinger$12 = this;
            random.nextBytes(bArr);
            String str = "[ping " + CryptoKt.hex(bArr) + " ping]";
            pingPongKt$pinger$12.L$0 = random;
            pingPongKt$pinger$12.L$1 = bArr;
            pingPongKt$pinger$12.label = 2;
            withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(pingPongKt$pinger$12.$timeoutMillis, new PingPongKt$pinger$1$rc$1(pingPongKt$pinger$12.$outgoing, str, pingPongKt$pinger$12.$channel, null), pingPongKt$pinger$12);
            if (withTimeoutOrNull != coroutine_suspended) {
            }
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            bArr = (byte[]) this.L$1;
            random = (Random) this.L$0;
            ResultKt.throwOnFailure(obj);
            PingPongKt$pinger$1 pingPongKt$pinger$13 = this;
            if (((Unit) obj) == null) {
                Random = random;
                pingPongKt$pinger$1 = pingPongKt$pinger$13;
                pingPongKt$pinger$1.L$0 = Random;
                pingPongKt$pinger$1.L$1 = bArr;
                pingPongKt$pinger$1.label = 1;
                if (TimeoutKt.withTimeoutOrNull(pingPongKt$pinger$1.$periodMillis, new AnonymousClass1(pingPongKt$pinger$1.$channel, null), pingPongKt$pinger$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                PingPongKt$pinger$1 pingPongKt$pinger$14 = pingPongKt$pinger$1;
                random = Random;
                pingPongKt$pinger$12 = pingPongKt$pinger$14;
                random.nextBytes(bArr);
                String str2 = "[ping " + CryptoKt.hex(bArr) + " ping]";
                pingPongKt$pinger$12.L$0 = random;
                pingPongKt$pinger$12.L$1 = bArr;
                pingPongKt$pinger$12.label = 2;
                withTimeoutOrNull = TimeoutKt.withTimeoutOrNull(pingPongKt$pinger$12.$timeoutMillis, new PingPongKt$pinger$1$rc$1(pingPongKt$pinger$12.$outgoing, str2, pingPongKt$pinger$12.$channel, null), pingPongKt$pinger$12);
                if (withTimeoutOrNull != coroutine_suspended) {
                    return coroutine_suspended;
                }
                pingPongKt$pinger$13 = pingPongKt$pinger$12;
                obj = withTimeoutOrNull;
                if (((Unit) obj) == null) {
                }
            } else {
                DefaultWebSocketSessionKt.getLOGGER().trace("WebSocket pinger has timed out");
                Function2<CloseReason, Continuation<? super Unit>, Object> function2 = pingPongKt$pinger$13.$onTimeout;
                CloseReason closeReason = new CloseReason(CloseReason.Codes.INTERNAL_ERROR, "Ping timeout");
                pingPongKt$pinger$13.L$0 = null;
                pingPongKt$pinger$13.L$1 = null;
                pingPongKt$pinger$13.label = 3;
                if (function2.invoke(closeReason, pingPongKt$pinger$13) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
    }

    /* compiled from: PingPong.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.PingPongKt$pinger$1$1", f = "PingPong.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: io.ktor.websocket.PingPongKt$pinger$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Channel<Frame.Pong> $channel;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Channel<Frame.Pong> channel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$channel = channel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$channel, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                this.label = 1;
            } while (this.$channel.receive(this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }
}
