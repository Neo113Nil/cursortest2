package okio;

import com.ironsource.C1463f4;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: okio.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C3370c extends C {

    @NotNull
    public static final a Companion = new a(null);
    private static final long IDLE_TIMEOUT_MILLIS;
    private static final long IDLE_TIMEOUT_NANOS;
    private static final int TIMEOUT_WRITE_SIZE = 65536;

    @NotNull
    private static final Condition condition;

    @Nullable
    private static C3370c head;

    @NotNull
    private static final ReentrantLock lock;
    private boolean inQueue;

    @Nullable
    private C3370c next;
    private long timeoutAt;

    /* renamed from: okio.c$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(C3370c c3370c) {
            ReentrantLock f4 = C3370c.Companion.f();
            f4.lock();
            try {
                if (!c3370c.inQueue) {
                    return false;
                }
                c3370c.inQueue = false;
                for (C3370c c3370c2 = C3370c.head; c3370c2 != null; c3370c2 = c3370c2.next) {
                    if (c3370c2.next == c3370c) {
                        c3370c2.next = c3370c.next;
                        c3370c.next = null;
                        return false;
                    }
                }
                f4.unlock();
                return true;
            } finally {
                f4.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void g(C3370c c3370c, long j4, boolean z4) {
            ReentrantLock f4 = C3370c.Companion.f();
            f4.lock();
            try {
                if (c3370c.inQueue) {
                    throw new IllegalStateException("Unbalanced enter/exit");
                }
                c3370c.inQueue = true;
                if (C3370c.head == null) {
                    C3370c.head = new C3370c();
                    new b().start();
                }
                long nanoTime = System.nanoTime();
                if (j4 != 0 && z4) {
                    c3370c.timeoutAt = Math.min(j4, c3370c.deadlineNanoTime() - nanoTime) + nanoTime;
                } else if (j4 != 0) {
                    c3370c.timeoutAt = j4 + nanoTime;
                } else {
                    if (!z4) {
                        throw new AssertionError();
                    }
                    c3370c.timeoutAt = c3370c.deadlineNanoTime();
                }
                long a4 = c3370c.a(nanoTime);
                C3370c c3370c2 = C3370c.head;
                Intrinsics.checkNotNull(c3370c2);
                while (c3370c2.next != null) {
                    C3370c c3370c3 = c3370c2.next;
                    Intrinsics.checkNotNull(c3370c3);
                    if (a4 < c3370c3.a(nanoTime)) {
                        break;
                    }
                    c3370c2 = c3370c2.next;
                    Intrinsics.checkNotNull(c3370c2);
                }
                c3370c.next = c3370c2.next;
                c3370c2.next = c3370c;
                if (c3370c2 == C3370c.head) {
                    C3370c.Companion.e().signal();
                }
                Unit unit = Unit.f41027a;
                f4.unlock();
            } catch (Throwable th) {
                f4.unlock();
                throw th;
            }
        }

        public final C3370c c() {
            C3370c c3370c = C3370c.head;
            Intrinsics.checkNotNull(c3370c);
            C3370c c3370c2 = c3370c.next;
            if (c3370c2 == null) {
                long nanoTime = System.nanoTime();
                e().await(C3370c.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
                C3370c c3370c3 = C3370c.head;
                Intrinsics.checkNotNull(c3370c3);
                if (c3370c3.next != null || System.nanoTime() - nanoTime < C3370c.IDLE_TIMEOUT_NANOS) {
                    return null;
                }
                return C3370c.head;
            }
            long a4 = c3370c2.a(System.nanoTime());
            if (a4 > 0) {
                e().await(a4, TimeUnit.NANOSECONDS);
                return null;
            }
            C3370c c3370c4 = C3370c.head;
            Intrinsics.checkNotNull(c3370c4);
            c3370c4.next = c3370c2.next;
            c3370c2.next = null;
            return c3370c2;
        }

        public final Condition e() {
            return C3370c.condition;
        }

        public final ReentrantLock f() {
            return C3370c.lock;
        }

        private a() {
        }
    }

    /* renamed from: okio.c$b */
    private static final class b extends Thread {
        public b() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            ReentrantLock f4;
            C3370c c4;
            while (true) {
                try {
                    a aVar = C3370c.Companion;
                    f4 = aVar.f();
                    f4.lock();
                    try {
                        c4 = aVar.c();
                    } finally {
                        f4.unlock();
                    }
                } catch (InterruptedException unused) {
                }
                if (c4 == C3370c.head) {
                    C3370c.head = null;
                    return;
                }
                Unit unit = Unit.f41027a;
                f4.unlock();
                if (c4 != null) {
                    c4.timedOut();
                }
            }
        }
    }

    /* renamed from: okio.c$c, reason: collision with other inner class name */
    public static final class C0244c implements z {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ z f43257c;

        C0244c(z zVar) {
            this.f43257c = zVar;
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3370c c3370c = C3370c.this;
            z zVar = this.f43257c;
            c3370c.enter();
            try {
                zVar.close();
                Unit unit = Unit.f41027a;
                if (c3370c.exit()) {
                    throw c3370c.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c3370c.exit()) {
                    throw e4;
                }
                throw c3370c.access$newTimeoutException(e4);
            } finally {
                c3370c.exit();
            }
        }

        @Override // okio.z, java.io.Flushable
        public void flush() {
            C3370c c3370c = C3370c.this;
            z zVar = this.f43257c;
            c3370c.enter();
            try {
                zVar.flush();
                Unit unit = Unit.f41027a;
                if (c3370c.exit()) {
                    throw c3370c.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c3370c.exit()) {
                    throw e4;
                }
                throw c3370c.access$newTimeoutException(e4);
            } finally {
                c3370c.exit();
            }
        }

        @Override // okio.z
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3370c timeout() {
            return C3370c.this;
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f43257c + ')';
        }

        @Override // okio.z
        public void write(C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            AbstractC3369b.b(source.l0(), 0L, j4);
            while (true) {
                long j5 = 0;
                if (j4 <= 0) {
                    return;
                }
                w wVar = source.f43260b;
                Intrinsics.checkNotNull(wVar);
                while (true) {
                    if (j5 >= 65536) {
                        break;
                    }
                    j5 += wVar.f43306c - wVar.f43305b;
                    if (j5 >= j4) {
                        j5 = j4;
                        break;
                    } else {
                        wVar = wVar.f43309f;
                        Intrinsics.checkNotNull(wVar);
                    }
                }
                C3370c c3370c = C3370c.this;
                z zVar = this.f43257c;
                c3370c.enter();
                try {
                    try {
                        zVar.write(source, j5);
                        Unit unit = Unit.f41027a;
                        if (c3370c.exit()) {
                            throw c3370c.access$newTimeoutException(null);
                        }
                        j4 -= j5;
                    } catch (IOException e4) {
                        if (!c3370c.exit()) {
                            throw e4;
                        }
                        throw c3370c.access$newTimeoutException(e4);
                    }
                } catch (Throwable th) {
                    c3370c.exit();
                    throw th;
                }
            }
        }
    }

    /* renamed from: okio.c$d */
    public static final class d implements B {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ B f43259c;

        d(B b4) {
            this.f43259c = b4;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            C3370c c3370c = C3370c.this;
            B b4 = this.f43259c;
            c3370c.enter();
            try {
                b4.close();
                Unit unit = Unit.f41027a;
                if (c3370c.exit()) {
                    throw c3370c.access$newTimeoutException(null);
                }
            } catch (IOException e4) {
                if (!c3370c.exit()) {
                    throw e4;
                }
                throw c3370c.access$newTimeoutException(e4);
            } finally {
                c3370c.exit();
            }
        }

        @Override // okio.B
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3370c timeout() {
            return C3370c.this;
        }

        @Override // okio.B
        public long read(C3372e sink, long j4) {
            Intrinsics.checkNotNullParameter(sink, "sink");
            C3370c c3370c = C3370c.this;
            B b4 = this.f43259c;
            c3370c.enter();
            try {
                long read = b4.read(sink, j4);
                if (c3370c.exit()) {
                    throw c3370c.access$newTimeoutException(null);
                }
                return read;
            } catch (IOException e4) {
                if (c3370c.exit()) {
                    throw c3370c.access$newTimeoutException(e4);
                }
                throw e4;
            } finally {
                c3370c.exit();
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f43259c + ')';
        }
    }

    static {
        ReentrantLock reentrantLock = new ReentrantLock();
        lock = reentrantLock;
        Condition newCondition = reentrantLock.newCondition();
        Intrinsics.checkNotNullExpressionValue(newCondition, "newCondition(...)");
        condition = newCondition;
        long millis = TimeUnit.SECONDS.toMillis(60L);
        IDLE_TIMEOUT_MILLIS = millis;
        IDLE_TIMEOUT_NANOS = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long a(long j4) {
        return this.timeoutAt - j4;
    }

    @NotNull
    public final IOException access$newTimeoutException(@Nullable IOException iOException) {
        return newTimeoutException(iOException);
    }

    public final void enter() {
        long timeoutNanos = timeoutNanos();
        boolean hasDeadline = hasDeadline();
        if (timeoutNanos != 0 || hasDeadline) {
            Companion.g(this, timeoutNanos, hasDeadline);
        }
    }

    public final boolean exit() {
        return Companion.d(this);
    }

    @NotNull
    protected IOException newTimeoutException(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException(C1463f4.f16211f);
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    @NotNull
    public final z sink(@NotNull z sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        return new C0244c(sink);
    }

    @NotNull
    public final B source(@NotNull B source) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new d(source);
    }

    protected void timedOut() {
    }

    public final <T> T withTimeout(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        enter();
        try {
            try {
                T t4 = (T) block.invoke();
                kotlin.jvm.internal.q.b(1);
                if (exit()) {
                    throw access$newTimeoutException(null);
                }
                kotlin.jvm.internal.q.a(1);
                return t4;
            } catch (IOException e4) {
                if (exit()) {
                    throw access$newTimeoutException(e4);
                }
                throw e4;
            }
        } catch (Throwable th) {
            kotlin.jvm.internal.q.b(1);
            exit();
            kotlin.jvm.internal.q.a(1);
            throw th;
        }
    }
}
