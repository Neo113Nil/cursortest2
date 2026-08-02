package okio;

import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.time.DurationKt;

/* loaded from: classes3.dex */
public final class Pipe$sink$1 implements Sink {
    public final /* synthetic */ int $r8$classId;
    public final Object this$0;
    public final Timeout timeout;

    public Pipe$sink$1(Pipe pipe) {
        this.$r8$classId = 0;
        this.this$0 = pipe;
        this.timeout = new Timeout();
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                Pipe pipe = (Pipe) obj;
                ReentrantLock reentrantLock = pipe.lock;
                reentrantLock.lock();
                try {
                    if (pipe.sinkClosed) {
                        reentrantLock.unlock();
                        return;
                    }
                    BufferedSink bufferedSink = pipe.foldedSink;
                    if (bufferedSink == null) {
                        if (pipe.sourceClosed && pipe.buffer.size > 0) {
                            throw new IOException("source is closed");
                        }
                        pipe.sinkClosed = true;
                        pipe.condition.signalAll();
                        bufferedSink = null;
                    }
                    if (bufferedSink != null) {
                        Timeout timeout = bufferedSink.timeout();
                        Timeout timeout2 = pipe.sink.timeout;
                        long timeoutNanos = timeout.timeoutNanos();
                        long j = timeout2.timeoutNanos;
                        long timeoutNanos2 = timeout.timeoutNanos();
                        if (j == 0 || (timeoutNanos2 != 0 && j >= timeoutNanos2)) {
                            j = timeoutNanos2;
                        }
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(j, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                bufferedSink.close();
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            bufferedSink.close();
                            if (z2) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        }
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                ((OutputStream) obj).close();
                return;
        }
    }

    @Override // okio.Sink, java.io.Flushable
    public final void flush() {
        boolean z;
        boolean z2;
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                Pipe pipe = (Pipe) obj;
                ReentrantLock reentrantLock = pipe.lock;
                reentrantLock.lock();
                try {
                    if (pipe.sinkClosed) {
                        throw new IllegalStateException("closed");
                    }
                    BufferedSink bufferedSink = pipe.foldedSink;
                    if (bufferedSink == null) {
                        if (pipe.sourceClosed && pipe.buffer.size > 0) {
                            throw new IOException("source is closed");
                        }
                        bufferedSink = null;
                    }
                    if (bufferedSink != null) {
                        Timeout timeout = bufferedSink.timeout();
                        Timeout timeout2 = pipe.sink.timeout;
                        long timeoutNanos = timeout.timeoutNanos();
                        long j = timeout2.timeoutNanos;
                        long timeoutNanos2 = timeout.timeoutNanos();
                        if (j == 0 || (timeoutNanos2 != 0 && j >= timeoutNanos2)) {
                            j = timeoutNanos2;
                        }
                        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                        timeout.timeout(j, timeUnit);
                        if (!timeout.hasDeadline()) {
                            if (timeout2.hasDeadline) {
                                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                            }
                            try {
                                bufferedSink.flush();
                                if (z) {
                                    return;
                                } else {
                                    return;
                                }
                            } finally {
                                timeout.timeout(timeoutNanos, timeUnit);
                                if (timeout2.hasDeadline) {
                                    timeout.clearDeadline();
                                }
                            }
                        }
                        long deadlineNanoTime = timeout.deadlineNanoTime();
                        if (timeout2.hasDeadline) {
                            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                        }
                        try {
                            bufferedSink.flush();
                            if (z2) {
                                return;
                            } else {
                                return;
                            }
                        } finally {
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline) {
                                timeout.deadlineNanoTime(deadlineNanoTime);
                            }
                        }
                    }
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            default:
                ((OutputStream) obj).flush();
                return;
        }
    }

    @Override // okio.Sink
    public final Timeout timeout() {
        int i = this.$r8$classId;
        return this.timeout;
    }

    public String toString() {
        switch (this.$r8$classId) {
            case 1:
                return "sink(" + ((OutputStream) this.this$0) + ')';
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x009d, code lost:
    
        if (r15 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        r12 = r15.timeout();
        r14 = r1.sink.timeout;
        r4 = r12.timeoutNanos();
        r0 = r14.timeoutNanos;
        r6 = r12.timeoutNanos();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:
    
        if (r0 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        if (r6 != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00bd, code lost:
    
        if (r0 >= r6) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c1, code lost:
    
        r2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        r12.timeout(r0, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        if (r12.hasDeadline() == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00cc, code lost:
    
        r6 = r12.deadlineNanoTime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        if (r14.hasDeadline == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        r12.deadlineNanoTime(java.lang.Math.min(r12.deadlineNanoTime(), r14.deadlineNanoTime()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e3, code lost:
    
        r15.write(r13, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e6, code lost:
    
        r12.timeout(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00eb, code lost:
    
        if (r14.hasDeadline == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00ed, code lost:
    
        r12.deadlineNanoTime(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0100, code lost:
    
        if (r14.hasDeadline == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0102, code lost:
    
        r12.deadlineNanoTime(r14.deadlineNanoTime());
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0109, code lost:
    
        r15.write(r13, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010c, code lost:
    
        r12.timeout(r4, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0111, code lost:
    
        if (r14.hasDeadline == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0113, code lost:
    
        r12.clearDeadline();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0117, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x00c0, code lost:
    
        r0 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0124, code lost:
    
        return;
     */
    @Override // okio.Sink
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void write(Buffer buffer, long j) {
        BufferedSink bufferedSink;
        int i = this.$r8$classId;
        Object obj = this.this$0;
        Timeout timeout = this.timeout;
        switch (i) {
            case 0:
                long j2 = j;
                buffer.getClass();
                Pipe pipe = (Pipe) obj;
                ReentrantLock reentrantLock = pipe.lock;
                reentrantLock.lock();
                try {
                    boolean z = pipe.sinkClosed;
                    Condition condition = pipe.condition;
                    Buffer buffer2 = pipe.buffer;
                    if (!z) {
                        while (true) {
                            if (j2 <= 0) {
                                bufferedSink = null;
                                break;
                            } else {
                                bufferedSink = pipe.foldedSink;
                                if (bufferedSink != null) {
                                    break;
                                } else {
                                    if (pipe.sourceClosed) {
                                        throw new IOException("source is closed");
                                    }
                                    long j3 = 1048576 - buffer2.size;
                                    if (j3 == 0) {
                                        timeout.awaitSignal(condition);
                                    } else {
                                        long min = Math.min(j3, j2);
                                        buffer2.write(buffer, min);
                                        j2 -= min;
                                        condition.signalAll();
                                    }
                                }
                            }
                        }
                    } else {
                        throw new IllegalStateException("closed");
                    }
                } finally {
                    reentrantLock.unlock();
                }
            default:
                buffer.getClass();
                DurationKt.checkOffsetAndCount(buffer.size, 0L, j);
                while (j > 0) {
                    timeout.throwIfReached();
                    Segment segment = buffer.head;
                    segment.getClass();
                    int min2 = (int) Math.min(j, segment.limit - segment.pos);
                    ((OutputStream) obj).write(segment.data, segment.pos, min2);
                    int i2 = segment.pos + min2;
                    segment.pos = i2;
                    long j4 = min2;
                    j -= j4;
                    buffer.size -= j4;
                    if (i2 == segment.limit) {
                        buffer.head = segment.pop();
                        SegmentPool.recycle(segment);
                    }
                }
                return;
        }
    }

    public Pipe$sink$1(OutputStream outputStream, Timeout timeout) {
        this.$r8$classId = 1;
        outputStream.getClass();
        this.this$0 = outputStream;
        this.timeout = timeout;
    }
}
