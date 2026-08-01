package io.ktor.websocket;

import io.ktor.util.cio.ByteBufferPoolKt;
import io.ktor.utils.io.ByteReadChannel;
import io.ktor.utils.io.ByteWriteChannel;
import io.ktor.utils.io.pool.ObjectPool;
import io.ktor.websocket.WebSocketSession;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import org.jacoco.core.runtime.AgentOptions;

/* compiled from: RawWebSocketJvm.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u000fJ\u0011\u00108\u001a\u000209H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u000209H\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00140\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR+\u0010\b\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R+\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00078V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00190+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00104\u001a\u000205X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b6\u00107\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006<"}, d2 = {"Lio/ktor/websocket/RawWebSocketJvm;", "Lio/ktor/websocket/WebSocketSession;", "input", "Lio/ktor/utils/io/ByteReadChannel;", AgentOptions.OUTPUT, "Lio/ktor/utils/io/ByteWriteChannel;", "maxFrameSize", "", "masking", "", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "pool", "Lio/ktor/utils/io/pool/ObjectPool;", "Ljava/nio/ByteBuffer;", "(Lio/ktor/utils/io/ByteReadChannel;Lio/ktor/utils/io/ByteWriteChannel;JZLkotlin/coroutines/CoroutineContext;Lio/ktor/utils/io/pool/ObjectPool;)V", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "extensions", "", "Lio/ktor/websocket/WebSocketExtension;", "getExtensions", "()Ljava/util/List;", "filtered", "Lkotlinx/coroutines/channels/Channel;", "Lio/ktor/websocket/Frame;", "incoming", "Lkotlinx/coroutines/channels/ReceiveChannel;", "getIncoming", "()Lkotlinx/coroutines/channels/ReceiveChannel;", "<set-?>", "getMasking", "()Z", "setMasking", "(Z)V", "masking$delegate", "Lkotlin/properties/ReadWriteProperty;", "getMaxFrameSize", "()J", "setMaxFrameSize", "(J)V", "maxFrameSize$delegate", "outgoing", "Lkotlinx/coroutines/channels/SendChannel;", "getOutgoing", "()Lkotlinx/coroutines/channels/SendChannel;", "reader", "Lio/ktor/websocket/WebSocketReader;", "getReader$ktor_websockets", "()Lio/ktor/websocket/WebSocketReader;", "socketJob", "Lkotlinx/coroutines/CompletableJob;", "writer", "Lio/ktor/websocket/WebSocketWriter;", "getWriter$ktor_websockets", "()Lio/ktor/websocket/WebSocketWriter;", "flush", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "terminate", "ktor-websockets"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RawWebSocketJvm implements WebSocketSession {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(RawWebSocketJvm.class, "maxFrameSize", "getMaxFrameSize()J", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(RawWebSocketJvm.class, "masking", "getMasking()Z", 0))};
    private final CoroutineContext coroutineContext;
    private final Channel<Frame> filtered;

    /* renamed from: masking$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty masking;

    /* renamed from: maxFrameSize$delegate, reason: from kotlin metadata */
    private final ReadWriteProperty maxFrameSize;
    private final WebSocketReader reader;
    private final CompletableJob socketJob;
    private final WebSocketWriter writer;

    public RawWebSocketJvm(ByteReadChannel input, ByteWriteChannel output, long j, boolean z, CoroutineContext coroutineContext, ObjectPool<ByteBuffer> pool) {
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(output, "output");
        Intrinsics.checkNotNullParameter(coroutineContext, "coroutineContext");
        Intrinsics.checkNotNullParameter(pool, "pool");
        CompletableJob Job = JobKt.Job((Job) coroutineContext.get(Job.INSTANCE));
        this.socketJob = Job;
        this.filtered = ChannelKt.Channel$default(0, null, null, 6, null);
        this.coroutineContext = coroutineContext.plus(Job).plus(new CoroutineName("raw-ws"));
        Delegates delegates = Delegates.INSTANCE;
        final Long valueOf = Long.valueOf(j);
        this.maxFrameSize = new ObservableProperty<Long>(valueOf) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Long oldValue, Long newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                long longValue = newValue.longValue();
                oldValue.longValue();
                this.getReader().setMaxFrameSize(longValue);
            }
        };
        Delegates delegates2 = Delegates.INSTANCE;
        final Boolean valueOf2 = Boolean.valueOf(z);
        this.masking = new ObservableProperty<Boolean>(valueOf2) { // from class: io.ktor.websocket.RawWebSocketJvm$special$$inlined$observable$2
            @Override // kotlin.properties.ObservableProperty
            protected void afterChange(KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean booleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.getWriter().setMasking(booleanValue);
            }
        };
        this.writer = new WebSocketWriter(output, getCoroutineContext(), z, pool);
        this.reader = new WebSocketReader(input, getCoroutineContext(), j, pool);
        BuildersKt__Builders_commonKt.launch$default(this, null, null, new AnonymousClass1(null), 3, null);
        Job.complete();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object send(Frame frame, Continuation<? super Unit> continuation) {
        return WebSocketSession.DefaultImpls.send(this, frame, continuation);
    }

    public /* synthetic */ RawWebSocketJvm(ByteReadChannel byteReadChannel, ByteWriteChannel byteWriteChannel, long j, boolean z, CoroutineContext coroutineContext, ObjectPool objectPool, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(byteReadChannel, byteWriteChannel, (i & 4) != 0 ? 2147483647L : j, (i & 8) != 0 ? false : z, coroutineContext, (i & 32) != 0 ? ByteBufferPoolKt.getKtorDefaultPool() : objectPool);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public ReceiveChannel<Frame> getIncoming() {
        return this.filtered;
    }

    @Override // io.ktor.websocket.WebSocketSession
    public SendChannel<Frame> getOutgoing() {
        return this.writer.getOutgoing();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public List<WebSocketExtension<?>> getExtensions() {
        return CollectionsKt.emptyList();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public long getMaxFrameSize() {
        return ((Number) this.maxFrameSize.getValue(this, $$delegatedProperties[0])).longValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMaxFrameSize(long j) {
        this.maxFrameSize.setValue(this, $$delegatedProperties[0], Long.valueOf(j));
    }

    @Override // io.ktor.websocket.WebSocketSession
    public boolean getMasking() {
        return ((Boolean) this.masking.getValue(this, $$delegatedProperties[1])).booleanValue();
    }

    @Override // io.ktor.websocket.WebSocketSession
    public void setMasking(boolean z) {
        this.masking.setValue(this, $$delegatedProperties[1], Boolean.valueOf(z));
    }

    /* renamed from: getWriter$ktor_websockets, reason: from getter */
    public final WebSocketWriter getWriter() {
        return this.writer;
    }

    /* renamed from: getReader$ktor_websockets, reason: from getter */
    public final WebSocketReader getReader() {
        return this.reader;
    }

    /* compiled from: RawWebSocketJvm.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "io.ktor.websocket.RawWebSocketJvm$1", f = "RawWebSocketJvm.kt", i = {2, 3}, l = {67, 68, 71, 74}, m = "invokeSuspend", n = {"cause", "cause"}, s = {"L$0", "L$0"})
    /* renamed from: io.ktor.websocket.RawWebSocketJvm$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RawWebSocketJvm.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(2:40|(1:(7:43|44|45|35|22|23|24)(2:46|47))(7:48|49|50|30|22|23|24))(3:6|7|8))(8:55|56|57|16|(2:18|(1:20)(4:21|10|11|(1:13)(3:15|16|(0))))|22|23|24))(2:58|59)|9|10|11|(0)(0)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0095, code lost:
        
            r12 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x00f6, code lost:
        
            r0 = r12;
            r1.L$0 = r0;
            r1.label = 3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x011a, code lost:
        
            if (r1.this$0.getOutgoing().send(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.TOO_BIG, r0.getMessage())), r1) == r0) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x011c, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0093, code lost:
        
            r12 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x00c1, code lost:
        
            r0 = r12;
            r1.L$0 = r0;
            r1.label = 4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00e5, code lost:
        
            if (r1.this$0.getOutgoing().send(new io.ktor.websocket.Frame.Close(new io.ktor.websocket.CloseReason(io.ktor.websocket.CloseReason.Codes.PROTOCOL_ERROR, r0.getMessage())), r1) == r0) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e7, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0091, code lost:
        
            r12 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x00b1, code lost:
        
            r1.this$0.getReader().getIncoming().cancel(r12);
         */
        /* JADX WARN: Code restructure failed: missing block: B:38:0x008f, code lost:
        
            r12 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x0099, code lost:
        
            r1.this$0.filtered.close(r12);
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0067 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x0073 A[Catch: all -> 0x008f, CancellationException -> 0x0091, ProtocolViolationException -> 0x0093, FrameTooBigException -> 0x0095, TRY_LEAVE, TryCatch #5 {FrameTooBigException -> 0x0095, ProtocolViolationException -> 0x0093, CancellationException -> 0x0091, all -> 0x008f, blocks: (B:11:0x005a, B:16:0x006b, B:18:0x0073), top: B:10:0x005a }] */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x008d -> B:10:0x005a). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            AnonymousClass1 anonymousClass1;
            ChannelIterator<Frame> it;
            Object hasNext;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            AnonymousClass1 anonymousClass12 = this.label;
            try {
                try {
                } catch (Throwable th) {
                    th = th;
                }
            } catch (FrameTooBigException e) {
                e = e;
                anonymousClass1 = this;
            } catch (ProtocolViolationException e2) {
                e = e2;
                anonymousClass1 = this;
            } catch (CancellationException e3) {
                e = e3;
                anonymousClass1 = this;
            } catch (Throwable th2) {
                th = th2;
                anonymousClass1 = this;
            }
            if (anonymousClass12 == 0) {
                ResultKt.throwOnFailure(obj);
                it = RawWebSocketJvm.this.getReader().getIncoming().iterator();
            } else {
                if (anonymousClass12 == 1) {
                    ChannelIterator<Frame> channelIterator = (ChannelIterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ChannelIterator<Frame> channelIterator2 = channelIterator;
                    anonymousClass1 = this;
                    if (((Boolean) obj).booleanValue()) {
                        Frame next = channelIterator2.next();
                        anonymousClass1.L$0 = channelIterator2;
                        anonymousClass1.label = 2;
                        if (RawWebSocketJvm.this.filtered.send(next, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        it = channelIterator2;
                        anonymousClass1.L$0 = it;
                        anonymousClass1.label = 1;
                        hasNext = it.hasNext(anonymousClass1);
                        if (hasNext != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        channelIterator2 = it;
                        obj = hasNext;
                        if (((Boolean) obj).booleanValue()) {
                        }
                    }
                    SendChannel.DefaultImpls.close$default(RawWebSocketJvm.this.filtered, null, 1, null);
                    return Unit.INSTANCE;
                }
                if (anonymousClass12 != 2) {
                    try {
                        if (anonymousClass12 == 3) {
                            FrameTooBigException frameTooBigException = (FrameTooBigException) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            anonymousClass1 = this;
                            RawWebSocketJvm.this.filtered.close(frameTooBigException);
                            SendChannel.DefaultImpls.close$default(RawWebSocketJvm.this.filtered, null, 1, null);
                            return Unit.INSTANCE;
                        }
                        if (anonymousClass12 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ProtocolViolationException protocolViolationException = (ProtocolViolationException) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        anonymousClass1 = this;
                        RawWebSocketJvm.this.filtered.close(protocolViolationException);
                        SendChannel.DefaultImpls.close$default(RawWebSocketJvm.this.filtered, null, 1, null);
                        return Unit.INSTANCE;
                    } catch (Throwable th3) {
                        th = th3;
                        anonymousClass12 = this;
                        SendChannel.DefaultImpls.close$default(RawWebSocketJvm.this.filtered, null, 1, null);
                        throw th;
                    }
                }
                ChannelIterator<Frame> channelIterator3 = (ChannelIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                it = channelIterator3;
            }
            anonymousClass1 = this;
            anonymousClass1.L$0 = it;
            anonymousClass1.label = 1;
            hasNext = it.hasNext(anonymousClass1);
            if (hasNext != coroutine_suspended) {
            }
        }
    }

    @Override // io.ktor.websocket.WebSocketSession
    public Object flush(Continuation<? super Unit> continuation) {
        Object flush = this.writer.flush(continuation);
        return flush == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? flush : Unit.INSTANCE;
    }

    @Override // io.ktor.websocket.WebSocketSession
    @Deprecated(level = DeprecationLevel.ERROR, message = "Use cancel() instead.", replaceWith = @ReplaceWith(expression = "cancel()", imports = {"kotlinx.coroutines.cancel"}))
    public void terminate() {
        SendChannel.DefaultImpls.close$default(getOutgoing(), null, 1, null);
        this.socketJob.complete();
    }
}
