package okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class q0 {
    private final c buffer = new c();
    private boolean canceled;
    private v0 foldedSink;
    private final long maxBufferSize;
    private final v0 sink;
    private boolean sinkClosed;
    private final x0 source;
    private boolean sourceClosed;

    public static final class a implements v0 {
        private final y0 timeout = new y0();

        a() {
        }

        @Override // okio.v0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            c buffer$okio = q0.this.getBuffer$okio();
            q0 q0Var = q0.this;
            synchronized (buffer$okio) {
                try {
                    if (q0Var.getSinkClosed$okio()) {
                        return;
                    }
                    v0 foldedSink$okio = q0Var.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (q0Var.getSourceClosed$okio() && q0Var.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        q0Var.setSinkClosed$okio(true);
                        q0Var.getBuffer$okio().notifyAll();
                        foldedSink$okio = null;
                    }
                    y5.w wVar = y5.w.INSTANCE;
                    if (foldedSink$okio == null) {
                        return;
                    }
                    q0 q0Var2 = q0.this;
                    y0 timeout = foldedSink$okio.timeout();
                    y0 timeout2 = q0Var2.sink().timeout();
                    long timeoutNanos = timeout.timeoutNanos();
                    long minTimeout = y0.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    timeout.timeout(minTimeout, timeUnit);
                    if (!timeout.hasDeadline()) {
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                        }
                        try {
                            foldedSink$okio.close();
                            timeout.timeout(timeoutNanos, timeUnit);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                                return;
                            }
                            return;
                        } catch (Throwable th) {
                            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                            if (timeout2.hasDeadline()) {
                                timeout.clearDeadline();
                            }
                            throw th;
                        }
                    }
                    long deadlineNanoTime = timeout.deadlineNanoTime();
                    if (timeout2.hasDeadline()) {
                        timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
                    }
                    try {
                        foldedSink$okio.close();
                        timeout.timeout(timeoutNanos, timeUnit);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                    } catch (Throwable th2) {
                        timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                        if (timeout2.hasDeadline()) {
                            timeout.deadlineNanoTime(deadlineNanoTime);
                        }
                        throw th2;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // okio.v0, java.io.Flushable
        public void flush() {
            v0 foldedSink$okio;
            c buffer$okio = q0.this.getBuffer$okio();
            q0 q0Var = q0.this;
            synchronized (buffer$okio) {
                try {
                    if (!(!q0Var.getSinkClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (q0Var.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    foldedSink$okio = q0Var.getFoldedSink$okio();
                    if (foldedSink$okio == null) {
                        if (q0Var.getSourceClosed$okio() && q0Var.getBuffer$okio().size() > 0) {
                            throw new IOException("source is closed");
                        }
                        foldedSink$okio = null;
                    }
                    y5.w wVar = y5.w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (foldedSink$okio == null) {
                return;
            }
            q0 q0Var2 = q0.this;
            y0 timeout = foldedSink$okio.timeout();
            y0 timeout2 = q0Var2.sink().timeout();
            long timeoutNanos = timeout.timeoutNanos();
            long minTimeout = y0.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(minTimeout, timeUnit);
            if (!timeout.hasDeadline()) {
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    foldedSink$okio.flush();
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (timeout2.hasDeadline()) {
                        timeout.clearDeadline();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th2;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                foldedSink$okio.flush();
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
            } catch (Throwable th3) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th3;
            }
        }

        @Override // okio.v0
        public y0 timeout() {
            return this.timeout;
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x0077, code lost:
        
            r1 = y5.w.INSTANCE;
         */
        @Override // okio.v0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void write(c source, long j8) {
            v0 v0Var;
            kotlin.jvm.internal.s.checkNotNullParameter(source, "source");
            c buffer$okio = q0.this.getBuffer$okio();
            q0 q0Var = q0.this;
            synchronized (buffer$okio) {
                try {
                    if (!(!q0Var.getSinkClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (!q0Var.getCanceled$okio()) {
                        while (true) {
                            if (j8 <= 0) {
                                v0Var = null;
                                break;
                            }
                            v0Var = q0Var.getFoldedSink$okio();
                            if (v0Var != null) {
                                break;
                            }
                            if (q0Var.getSourceClosed$okio()) {
                                throw new IOException("source is closed");
                            }
                            long maxBufferSize$okio = q0Var.getMaxBufferSize$okio() - q0Var.getBuffer$okio().size();
                            if (maxBufferSize$okio == 0) {
                                this.timeout.waitUntilNotified(q0Var.getBuffer$okio());
                                if (q0Var.getCanceled$okio()) {
                                    throw new IOException("canceled");
                                }
                            } else {
                                long min = Math.min(maxBufferSize$okio, j8);
                                q0Var.getBuffer$okio().write(source, min);
                                j8 -= min;
                                q0Var.getBuffer$okio().notifyAll();
                            }
                        }
                    } else {
                        throw new IOException("canceled");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v0Var == null) {
                return;
            }
            q0 q0Var2 = q0.this;
            y0 timeout = v0Var.timeout();
            y0 timeout2 = q0Var2.sink().timeout();
            long timeoutNanos = timeout.timeoutNanos();
            long minTimeout = y0.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(minTimeout, timeUnit);
            if (!timeout.hasDeadline()) {
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    v0Var.write(source, j8);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (timeout2.hasDeadline()) {
                        timeout.clearDeadline();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th2;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                v0Var.write(source, j8);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
            } catch (Throwable th3) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th3;
            }
        }
    }

    public static final class b implements x0 {
        private final y0 timeout = new y0();

        b() {
        }

        @Override // okio.x0, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            c buffer$okio = q0.this.getBuffer$okio();
            q0 q0Var = q0.this;
            synchronized (buffer$okio) {
                q0Var.setSourceClosed$okio(true);
                q0Var.getBuffer$okio().notifyAll();
                y5.w wVar = y5.w.INSTANCE;
            }
        }

        @Override // okio.x0
        public long read(c sink, long j8) {
            kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
            c buffer$okio = q0.this.getBuffer$okio();
            q0 q0Var = q0.this;
            synchronized (buffer$okio) {
                try {
                    if (!(!q0Var.getSourceClosed$okio())) {
                        throw new IllegalStateException("closed".toString());
                    }
                    if (q0Var.getCanceled$okio()) {
                        throw new IOException("canceled");
                    }
                    while (q0Var.getBuffer$okio().size() == 0) {
                        if (q0Var.getSinkClosed$okio()) {
                            return -1L;
                        }
                        this.timeout.waitUntilNotified(q0Var.getBuffer$okio());
                        if (q0Var.getCanceled$okio()) {
                            throw new IOException("canceled");
                        }
                    }
                    long read = q0Var.getBuffer$okio().read(sink, j8);
                    q0Var.getBuffer$okio().notifyAll();
                    return read;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okio.x0
        public y0 timeout() {
            return this.timeout;
        }
    }

    public q0(long j8) {
        this.maxBufferSize = j8;
        if (!(j8 >= 1)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("maxBufferSize < 1: ", Long.valueOf(getMaxBufferSize$okio())).toString());
        }
        this.sink = new a();
        this.source = new b();
    }

    private final void forward(v0 v0Var, f6.l lVar) {
        y0 timeout = v0Var.timeout();
        y0 timeout2 = sink().timeout();
        long timeoutNanos = timeout.timeoutNanos();
        long minTimeout = y0.Companion.minTimeout(timeout2.timeoutNanos(), timeout.timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout.timeout(minTimeout, timeUnit);
        if (!timeout.hasDeadline()) {
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
            }
            try {
                lVar.invoke(v0Var);
                y5.w wVar = y5.w.INSTANCE;
                kotlin.jvm.internal.r.finallyStart(1);
                timeout.timeout(timeoutNanos, timeUnit);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.r.finallyEnd(1);
                return;
            } catch (Throwable th) {
                kotlin.jvm.internal.r.finallyStart(1);
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.hasDeadline()) {
                    timeout.clearDeadline();
                }
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th;
            }
        }
        long deadlineNanoTime = timeout.deadlineNanoTime();
        if (timeout2.hasDeadline()) {
            timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
        }
        try {
            lVar.invoke(v0Var);
            y5.w wVar2 = y5.w.INSTANCE;
            kotlin.jvm.internal.r.finallyStart(1);
            timeout.timeout(timeoutNanos, timeUnit);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.r.finallyStart(1);
            timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (timeout2.hasDeadline()) {
                timeout.deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
            throw th2;
        }
    }

    /* renamed from: -deprecated_sink, reason: not valid java name */
    public final v0 m1460deprecated_sink() {
        return this.sink;
    }

    /* renamed from: -deprecated_source, reason: not valid java name */
    public final x0 m1461deprecated_source() {
        return this.source;
    }

    public final void cancel() {
        synchronized (this.buffer) {
            setCanceled$okio(true);
            getBuffer$okio().clear();
            getBuffer$okio().notifyAll();
            y5.w wVar = y5.w.INSTANCE;
        }
    }

    public final void fold(v0 sink) {
        boolean sinkClosed$okio;
        c cVar;
        kotlin.jvm.internal.s.checkNotNullParameter(sink, "sink");
        while (true) {
            synchronized (this.buffer) {
                if (!(getFoldedSink$okio() == null)) {
                    throw new IllegalStateException("sink already folded".toString());
                }
                if (getCanceled$okio()) {
                    setFoldedSink$okio(sink);
                    throw new IOException("canceled");
                }
                if (getBuffer$okio().exhausted()) {
                    setSourceClosed$okio(true);
                    setFoldedSink$okio(sink);
                    return;
                } else {
                    sinkClosed$okio = getSinkClosed$okio();
                    cVar = new c();
                    cVar.write(getBuffer$okio(), getBuffer$okio().size());
                    getBuffer$okio().notifyAll();
                    y5.w wVar = y5.w.INSTANCE;
                }
            }
            try {
                sink.write(cVar, cVar.size());
                if (sinkClosed$okio) {
                    sink.close();
                } else {
                    sink.flush();
                }
            } catch (Throwable th) {
                synchronized (this.buffer) {
                    setSourceClosed$okio(true);
                    getBuffer$okio().notifyAll();
                    y5.w wVar2 = y5.w.INSTANCE;
                    throw th;
                }
            }
        }
    }

    public final c getBuffer$okio() {
        return this.buffer;
    }

    public final boolean getCanceled$okio() {
        return this.canceled;
    }

    public final v0 getFoldedSink$okio() {
        return this.foldedSink;
    }

    public final long getMaxBufferSize$okio() {
        return this.maxBufferSize;
    }

    public final boolean getSinkClosed$okio() {
        return this.sinkClosed;
    }

    public final boolean getSourceClosed$okio() {
        return this.sourceClosed;
    }

    public final void setCanceled$okio(boolean z7) {
        this.canceled = z7;
    }

    public final void setFoldedSink$okio(v0 v0Var) {
        this.foldedSink = v0Var;
    }

    public final void setSinkClosed$okio(boolean z7) {
        this.sinkClosed = z7;
    }

    public final void setSourceClosed$okio(boolean z7) {
        this.sourceClosed = z7;
    }

    public final v0 sink() {
        return this.sink;
    }

    public final x0 source() {
        return this.source;
    }
}
