package kotlinx.coroutines.channels;

import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.j0;
import kotlinx.coroutines.n;

/* loaded from: classes5.dex */
public abstract class BufferedChannelKt {
    public static final g0 BUFFERED;
    private static final long BUFFER_END_RENDEZVOUS = 0;
    private static final long BUFFER_END_UNLIMITED = Long.MAX_VALUE;
    private static final g0 CHANNEL_CLOSED;
    private static final g0 CLOSE_HANDLER_CLOSED;
    private static final g0 CLOSE_HANDLER_INVOKED;
    private static final int CLOSE_STATUS_ACTIVE = 0;
    private static final int CLOSE_STATUS_CANCELLATION_STARTED = 1;
    private static final int CLOSE_STATUS_CANCELLED = 3;
    private static final int CLOSE_STATUS_CLOSED = 2;
    private static final g0 DONE_RCV;
    private static final long EB_COMPLETED_COUNTER_MASK = 4611686018427387903L;
    private static final long EB_COMPLETED_PAUSE_EXPAND_BUFFERS_BIT = 4611686018427387904L;
    private static final int EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
    private static final g0 FAILED;
    private static final g0 INTERRUPTED_RCV;
    private static final g0 INTERRUPTED_SEND;
    private static final g0 IN_BUFFER;
    private static final g0 NO_CLOSE_CAUSE;
    private static final g0 NO_RECEIVE_RESULT;
    private static final f NULL_SEGMENT = new f(-1, null, null, 0);
    private static final g0 POISONED;
    private static final int RESULT_BUFFERED = 1;
    private static final int RESULT_CLOSED = 4;
    private static final int RESULT_FAILED = 5;
    private static final int RESULT_RENDEZVOUS = 0;
    private static final int RESULT_SUSPEND = 2;
    private static final int RESULT_SUSPEND_NO_WAITER = 3;
    private static final g0 RESUMING_BY_EB;
    private static final g0 RESUMING_BY_RCV;
    public static final int SEGMENT_SIZE;
    private static final int SENDERS_CLOSE_STATUS_SHIFT = 60;
    private static final long SENDERS_COUNTER_MASK = 1152921504606846975L;
    private static final g0 SUSPEND;
    private static final g0 SUSPEND_NO_WAITER;

    static {
        int systemProp$default;
        int systemProp$default2;
        systemProp$default = j0.systemProp$default("kotlinx.coroutines.bufferedChannel.segmentSize", 32, 0, 0, 12, (Object) null);
        SEGMENT_SIZE = systemProp$default;
        systemProp$default2 = j0.systemProp$default("kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations", 10000, 0, 0, 12, (Object) null);
        EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS = systemProp$default2;
        BUFFERED = new g0("BUFFERED");
        IN_BUFFER = new g0("SHOULD_BUFFER");
        RESUMING_BY_RCV = new g0("S_RESUMING_BY_RCV");
        RESUMING_BY_EB = new g0("RESUMING_BY_EB");
        POISONED = new g0("POISONED");
        DONE_RCV = new g0("DONE_RCV");
        INTERRUPTED_SEND = new g0("INTERRUPTED_SEND");
        INTERRUPTED_RCV = new g0("INTERRUPTED_RCV");
        CHANNEL_CLOSED = new g0("CHANNEL_CLOSED");
        SUSPEND = new g0("SUSPEND");
        SUSPEND_NO_WAITER = new g0("SUSPEND_NO_WAITER");
        FAILED = new g0("FAILED");
        NO_RECEIVE_RESULT = new g0("NO_RECEIVE_RESULT");
        CLOSE_HANDLER_CLOSED = new g0("CLOSE_HANDLER_CLOSED");
        CLOSE_HANDLER_INVOKED = new g0("CLOSE_HANDLER_INVOKED");
        NO_CLOSE_CAUSE = new g0("NO_CLOSE_CAUSE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructEBCompletedAndPauseFlag(long j8, boolean z7) {
        return (z7 ? 4611686018427387904L : 0L) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long constructSendersAndCloseStatus(long j8, int i8) {
        return (i8 << 60) + j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <E> f createSegment(long j8, f fVar) {
        return new f(j8, fVar, fVar.getChannel(), 0);
    }

    public static final <E> kotlin.reflect.h createSegmentFunction() {
        return BufferedChannelKt$createSegmentFunction$1.INSTANCE;
    }

    public static final g0 getCHANNEL_CLOSED() {
        return CHANNEL_CLOSED;
    }

    private static final long getEbCompletedCounter(long j8) {
        return j8 & 4611686018427387903L;
    }

    private static final boolean getEbPauseExpandBuffers(long j8) {
        return (j8 & 4611686018427387904L) != 0;
    }

    private static final int getSendersCloseStatus(long j8) {
        return (int) (j8 >> 60);
    }

    private static final long getSendersCounter(long j8) {
        return j8 & SENDERS_COUNTER_MASK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long initialBufferEnd(int i8) {
        if (i8 == 0) {
            return 0L;
        }
        if (i8 != Integer.MAX_VALUE) {
            return i8;
        }
        return Long.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean tryResume0(n nVar, T t7, f6.l lVar) {
        Object tryResume = nVar.tryResume(t7, null, lVar);
        if (tryResume == null) {
            return false;
        }
        nVar.completeResume(tryResume);
        return true;
    }

    static /* synthetic */ boolean tryResume0$default(n nVar, Object obj, f6.l lVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            lVar = null;
        }
        return tryResume0(nVar, obj, lVar);
    }
}
