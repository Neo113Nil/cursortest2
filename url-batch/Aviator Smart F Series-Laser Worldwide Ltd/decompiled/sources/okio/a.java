package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class a extends y0 {
    public static final C0381a Companion = new C0381a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;
    private static a head;
    private boolean inQueue;
    private a next;
    private long timeoutAt;

    /* renamed from: okio.a$a, reason: collision with other inner class name */
    public static final class C0381a {
        private C0381a() {
        }

        public /* synthetic */ C0381a(kotlin.jvm.internal.o oVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean cancelScheduledTimeout(a aVar) {
            synchronized (a.class) {
                if (!aVar.inQueue) {
                    return false;
                }
                aVar.inQueue = false;
                for (a aVar2 = a.head; aVar2 != null; aVar2 = aVar2.next) {
                    if (aVar2.next == aVar) {
                        aVar2.next = aVar.next;
                        aVar.next = null;
                        return false;
                    }
                }
                return true;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void scheduleTimeout(a aVar, long j8, boolean z7) {
            synchronized (a.class) {
                try {
                    if (!(!aVar.inQueue)) {
                        throw new IllegalStateException("Unbalanced enter/exit".toString());
                    }
                    aVar.inQueue = true;
                    if (a.head == null) {
                        a.head = new a();
                        new b().start();
                    }
                    long nanoTime = System.nanoTime();
                    if (j8 != 0 && z7) {
                        aVar.timeoutAt = Math.min(j8, aVar.deadlineNanoTime() - nanoTime) + nanoTime;
                    } else if (j8 != 0) {
                        aVar.timeoutAt = j8 + nanoTime;
                    } else {
                        if (!z7) {
                            throw new AssertionError();
                        }
                        aVar.timeoutAt = aVar.deadlineNanoTime();
                    }
                    long remainingNanos = aVar.remainingNanos(nanoTime);
                    a aVar2 = a.head;
                    kotlin.jvm.internal.s.checkNotNull(aVar2);
                    while (aVar2.next != null) {
                        a aVar3 = aVar2.next;
                        kotlin.jvm.internal.s.checkNotNull(aVar3);
                        if (remainingNanos < aVar3.remainingNanos(nanoTime)) {
                            break;
                        }
                        aVar2 = aVar2.next;
                        kotlin.jvm.internal.s.checkNotNull(aVar2);
                    }
                    aVar.next = aVar2.next;
                    aVar2.next = aVar;
                    if (aVar2 == a.head) {
                        a.class.notify();
                    }
                    y5.w wVar = y5.w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final a awaitTimeout$okio() {
            a aVar = a.head;
            kotlin.jvm.internal.s.checkNotNull(aVar);
            a aVar2 = aVar.next;
            if (aVar2 == null) {
                long nanoTime = System.nanoTime();
                a.class.wait(a.IDLE_TIMEOUT_MILLIS);
                a aVar3 = a.head;
                kotlin.jvm.internal.s.checkNotNull(aVar3);
                if (aVar3.next != null || System.nanoTime() - nanoTime < a.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return a.head;
            }
            long remainingNanos = aVar2.remainingNanos(System.nanoTime());
            if (remainingNanos > 0) {
                long j8 = remainingNanos / 1000000;
                a.class.wait(j8, (int) (remainingNanos - (1000000 * j8)));
                return null;
            }
            a aVar4 = a.head;
            kotlin.jvm.internal.s.checkNotNull(aVar4);
            aVar4.next = aVar2.next;
            aVar2.next = null;
            return aVar2;
        }
    }

    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a awaitTimeout$okio;
            while (true) {
                try {
                    synchronized (a.class) {
                        awaitTimeout$okio = a.Companion.awaitTimeout$okio();
                        if (awaitTimeout$okio == a.head) {
                            a.head = null;
                            return;
                        }
                        y5.w wVar = y5.w.INSTANCE;
                    }
                    if (awaitTimeout$okio != null) {
                        awaitTimeout$okio.timedOut();
                    }
                } catch (InterruptedException unused) {
                    continue;
                }
            }
        }
    }

    public static final class c implements v0 {
        final /* synthetic */ v0 $sink;

        c(v0 v0Var) {
            this.$sink = v0Var;
        }

        @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            v0 v0Var = this.$sink;
            aVar.enter();
            try {
                v0Var.close();
                y5.w wVar = y5.w.INSTANCE;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException(null);
                }
            } catch (IOException e8) {
                if (!aVar.exit()) {
                    throw e8;
                }
                throw aVar.access$newTimeoutException(e8);
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.v0, java.io.Flushable
        public void flush() {
            a aVar = a.this;
            v0 v0Var = this.$sink;
            aVar.enter();
            try {
                v0Var.flush();
                y5.w wVar = y5.w.INSTANCE;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException(null);
                }
            } catch (IOException e8) {
                if (!aVar.exit()) {
                    throw e8;
                }
                throw aVar.access$newTimeoutException(e8);
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.v0
        public a timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.$sink + ')';
        }

        @Override // okio.v0
        public void write(okio.c source, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            d1.checkOffsetAndCount(source.size(), 0L, j8);
            while (true) {
                long j9 = 0;
                if (j8 <= 0) {
                    return;
                }
                t0 t0Var = source.head;
                kotlin.jvm.internal.s.checkNotNull(t0Var);
                while (true) {
                    if (j9 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j9 += t0Var.limit - t0Var.pos;
                    if (j9 >= j8) {
                        j9 = j8;
                        break;
                    } else {
                        t0Var = t0Var.next;
                        kotlin.jvm.internal.s.checkNotNull(t0Var);
                    }
                }
                a aVar = a.this;
                v0 v0Var = this.$sink;
                aVar.enter();
                try {
                    v0Var.write(source, j9);
                    y5.w wVar = y5.w.INSTANCE;
                    if (aVar.exit()) {
                        throw aVar.access$newTimeoutException(null);
                    }
                    j8 -= j9;
                } catch (IOException e8) {
                    if (!aVar.exit()) {
                        throw e8;
                    }
                    throw aVar.access$newTimeoutException(e8);
                } finally {
                    aVar.exit();
                }
            }
        }
    }

    public static final class d implements x0 {
        final /* synthetic */ x0 $source;

        d(x0 x0Var) {
            this.$source = x0Var;
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a aVar = a.this;
            x0 x0Var = this.$source;
            aVar.enter();
            try {
                x0Var.close();
                y5.w wVar = y5.w.INSTANCE;
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException(null);
                }
            } catch (IOException e8) {
                if (!aVar.exit()) {
                    throw e8;
                }
                throw aVar.access$newTimeoutException(e8);
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.x0
        public long read(okio.c sink, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            a aVar = a.this;
            x0 x0Var = this.$source;
            aVar.enter();
            try {
                long read = x0Var.read(sink, j8);
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e8) {
                if (aVar.exit()) {
                    throw aVar.access$newTimeoutException(e8);
                }
                throw e8;
            } finally {
                aVar.exit();
            }
        }

        @Override // okio.x0
        public a timeout() {
            return a.this;
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.$source + ')';
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long remainingNanos(long j8) {
        return this.timeoutAt - j8;
    }

    public final IOException access$newTimeoutException(IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.scheduleTimeout(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.cancelScheduledTimeout(this);
    }

    protected IOException newTimeoutException(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final v0 sink(v0 sink) {
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        return new c(sink);
    }

    public final x0 source(x0 source) {
        kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
        return new d(source);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(f6.a block) {
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T t7 = (T) block.invoke();
                kotlin.jvm.internal.r.finallyStart(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.r.finallyEnd(1);
                return t7;
            } catch (IOException e8) {
                if (exit()) {
                    throw access$newTimeoutException(e8);
                }
                throw e8;
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.r.finallyStart(1);
            exit();
            kotlin.jvm.internal.r.finallyEnd(1);
            throw th;
        }
    }
}
