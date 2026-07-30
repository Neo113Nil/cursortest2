package kotlinx.coroutines.channels;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.l;
import kotlinx.coroutines.internal.h0;

/* loaded from: classes5.dex */
public interface b extends l, ReceiveChannel {
    public static final int BUFFERED = -2;
    public static final int CONFLATED = -1;
    public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
    public static final C0367b Factory = C0367b.$$INSTANCE;
    public static final int OPTIONAL_CHANNEL = -3;
    public static final int RENDEZVOUS = 0;
    public static final int UNLIMITED = Integer.MAX_VALUE;

    public static final class a {
        public static <E> kotlinx.coroutines.selects.e getOnReceiveOrNull(b bVar) {
            return ReceiveChannel.DefaultImpls.getOnReceiveOrNull(bVar);
        }

        public static <E> boolean offer(b bVar, E e8) {
            return l.a.offer(bVar, e8);
        }

        public static <E> E poll(b bVar) {
            return (E) ReceiveChannel.DefaultImpls.poll(bVar);
        }

        public static <E> Object receiveOrNull(b bVar, kotlin.coroutines.c cVar) {
            return ReceiveChannel.DefaultImpls.receiveOrNull(bVar, cVar);
        }
    }

    /* renamed from: kotlinx.coroutines.channels.b$b, reason: collision with other inner class name */
    public static final class C0367b {
        public static final int BUFFERED = -2;
        public static final int CONFLATED = -1;
        public static final String DEFAULT_BUFFER_PROPERTY_NAME = "kotlinx.coroutines.channels.defaultBuffer";
        public static final int OPTIONAL_CHANNEL = -3;
        public static final int RENDEZVOUS = 0;
        public static final int UNLIMITED = Integer.MAX_VALUE;
        static final /* synthetic */ C0367b $$INSTANCE = new C0367b();
        private static final int CHANNEL_DEFAULT_CAPACITY = h0.systemProp("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private C0367b() {
        }

        public final int getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core() {
            return CHANNEL_DEFAULT_CAPACITY;
        }
    }

    /* synthetic */ void cancel();

    /* synthetic */ void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean close(Throwable th);

    /* synthetic */ kotlinx.coroutines.selects.e getOnReceive();

    /* synthetic */ kotlinx.coroutines.selects.e getOnReceiveCatching();

    /* synthetic */ kotlinx.coroutines.selects.e getOnReceiveOrNull();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ kotlinx.coroutines.selects.g getOnSend();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ void invokeOnClose(f6.l lVar);

    /* synthetic */ boolean isClosedForReceive();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean isClosedForSend();

    /* synthetic */ boolean isEmpty();

    /* synthetic */ ChannelIterator iterator();

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ boolean offer(Object obj);

    /* synthetic */ Object poll();

    /* synthetic */ Object receive(kotlin.coroutines.c cVar);

    /* renamed from: receiveCatching-JP2dKIU */
    /* synthetic */ Object mo1232receiveCatchingJP2dKIU(kotlin.coroutines.c cVar);

    /* synthetic */ Object receiveOrNull(kotlin.coroutines.c cVar);

    @Override // kotlinx.coroutines.channels.l
    /* synthetic */ Object send(Object obj, kotlin.coroutines.c cVar);

    /* renamed from: tryReceive-PtdJZtk */
    /* synthetic */ Object mo1233tryReceivePtdJZtk();

    @Override // kotlinx.coroutines.channels.l
    /* renamed from: trySend-JP2dKIU */
    /* synthetic */ Object mo1234trySendJP2dKIU(Object obj);
}
