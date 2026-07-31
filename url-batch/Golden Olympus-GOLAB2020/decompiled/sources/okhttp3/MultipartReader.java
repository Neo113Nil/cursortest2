package okhttp3;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.B;
import okio.C;
import okio.C3372e;
import okio.g;
import okio.h;
import okio.s;

@Metadata
/* loaded from: classes3.dex */
public final class MultipartReader implements Closeable, AutoCloseable {

    /* renamed from: f, reason: collision with root package name */
    public static final Companion f42439f = new Companion(null);

    /* renamed from: g, reason: collision with root package name */
    private static final s f42440g;

    /* renamed from: b, reason: collision with root package name */
    private final g f42441b;

    /* renamed from: c, reason: collision with root package name */
    private final h f42442c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f42443d;

    /* renamed from: e, reason: collision with root package name */
    private PartSource f42444e;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public static final class Part implements Closeable, AutoCloseable {

        /* renamed from: b, reason: collision with root package name */
        private final g f42445b;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f42445b.close();
        }
    }

    @Metadata
    private final class PartSource implements B {

        /* renamed from: b, reason: collision with root package name */
        private final C f42446b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ MultipartReader f42447c;

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (Intrinsics.areEqual(this.f42447c.f42444e, this)) {
                this.f42447c.f42444e = null;
            }
        }

        @Override // okio.B
        public long read(C3372e sink, long j4) {
            long j5;
            Intrinsics.checkNotNullParameter(sink, "sink");
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            if (!Intrinsics.areEqual(this.f42447c.f42444e, this)) {
                throw new IllegalStateException("closed");
            }
            C timeout = this.f42447c.f42441b.timeout();
            C c4 = this.f42446b;
            MultipartReader multipartReader = this.f42447c;
            long timeoutNanos = timeout.timeoutNanos();
            long a4 = C.Companion.a(c4.timeoutNanos(), timeout.timeoutNanos());
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            timeout.timeout(a4, timeUnit);
            if (!timeout.hasDeadline()) {
                if (c4.hasDeadline()) {
                    timeout.deadlineNanoTime(c4.deadlineNanoTime());
                }
                try {
                    long f4 = multipartReader.f(j4);
                    long read = f4 == 0 ? -1L : multipartReader.f42441b.read(sink, f4);
                    timeout.timeout(timeoutNanos, timeUnit);
                    if (c4.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    return read;
                } catch (Throwable th) {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (c4.hasDeadline()) {
                        timeout.clearDeadline();
                    }
                    throw th;
                }
            }
            long deadlineNanoTime = timeout.deadlineNanoTime();
            if (c4.hasDeadline()) {
                j5 = 0;
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), c4.deadlineNanoTime()));
            } else {
                j5 = 0;
            }
            try {
                long f5 = multipartReader.f(j4);
                long read2 = f5 == j5 ? -1L : multipartReader.f42441b.read(sink, f5);
                timeout.timeout(timeoutNanos, timeUnit);
                if (c4.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                return read2;
            } catch (Throwable th2) {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (c4.hasDeadline()) {
                    timeout.deadlineNanoTime(deadlineNanoTime);
                }
                throw th2;
            }
        }

        @Override // okio.B
        public C timeout() {
            return this.f42446b;
        }
    }

    static {
        s.a aVar = s.f43291d;
        h.a aVar2 = h.f43270e;
        f42440g = aVar.d(aVar2.d("\r\n"), aVar2.d("--"), aVar2.d(" "), aVar2.d("\t"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long f(long j4) {
        this.f42441b.O(this.f42442c.v());
        long W3 = this.f42441b.q().W(this.f42442c);
        return W3 == -1 ? Math.min(j4, (this.f42441b.q().l0() - this.f42442c.v()) + 1) : Math.min(j4, W3);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f42443d) {
            return;
        }
        this.f42443d = true;
        this.f42444e = null;
        this.f42441b.close();
    }
}
