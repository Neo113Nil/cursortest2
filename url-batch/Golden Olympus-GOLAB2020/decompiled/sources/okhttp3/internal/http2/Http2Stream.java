package okhttp3.internal.http2;

import com.ironsource.C1463f4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okio.B;
import okio.C;
import okio.C3370c;
import okio.C3372e;
import okio.g;
import okio.z;

@Metadata
/* loaded from: classes3.dex */
public final class Http2Stream {

    /* renamed from: o, reason: collision with root package name */
    public static final Companion f43037o = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final int f43038a;

    /* renamed from: b, reason: collision with root package name */
    private final Http2Connection f43039b;

    /* renamed from: c, reason: collision with root package name */
    private long f43040c;

    /* renamed from: d, reason: collision with root package name */
    private long f43041d;

    /* renamed from: e, reason: collision with root package name */
    private long f43042e;

    /* renamed from: f, reason: collision with root package name */
    private long f43043f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayDeque f43044g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f43045h;

    /* renamed from: i, reason: collision with root package name */
    private final FramingSource f43046i;

    /* renamed from: j, reason: collision with root package name */
    private final FramingSink f43047j;

    /* renamed from: k, reason: collision with root package name */
    private final StreamTimeout f43048k;

    /* renamed from: l, reason: collision with root package name */
    private final StreamTimeout f43049l;

    /* renamed from: m, reason: collision with root package name */
    private ErrorCode f43050m;

    /* renamed from: n, reason: collision with root package name */
    private IOException f43051n;

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata
    public final class FramingSink implements z {

        /* renamed from: b, reason: collision with root package name */
        private boolean f43052b;

        /* renamed from: c, reason: collision with root package name */
        private final C3372e f43053c = new C3372e();

        /* renamed from: d, reason: collision with root package name */
        private Headers f43054d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f43055e;

        public FramingSink(boolean z4) {
            this.f43052b = z4;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean z4) {
            long min;
            boolean z5;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                try {
                    http2Stream.s().enter();
                    while (http2Stream.r() >= http2Stream.q() && !this.f43052b && !this.f43055e && http2Stream.h() == null) {
                        try {
                            http2Stream.D();
                        } catch (Throwable th) {
                            http2Stream.s().b();
                            throw th;
                        }
                    }
                    http2Stream.s().b();
                    http2Stream.c();
                    min = Math.min(http2Stream.q() - http2Stream.r(), this.f43053c.l0());
                    http2Stream.B(http2Stream.r() + min);
                    z5 = z4 && min == this.f43053c.l0();
                    Unit unit = Unit.f41027a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            Http2Stream.this.s().enter();
            try {
                Http2Stream.this.g().F0(Http2Stream.this.j(), z5, this.f43053c, min);
            } finally {
                Http2Stream.this.s().b();
            }
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f42596h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                if (this.f43055e) {
                    return;
                }
                boolean z4 = http2Stream2.h() == null;
                Unit unit = Unit.f41027a;
                if (!Http2Stream.this.o().f43052b) {
                    boolean z5 = this.f43053c.l0() > 0;
                    if (this.f43054d != null) {
                        while (this.f43053c.l0() > 0) {
                            a(false);
                        }
                        Http2Connection g4 = Http2Stream.this.g();
                        int j4 = Http2Stream.this.j();
                        Headers headers = this.f43054d;
                        Intrinsics.checkNotNull(headers);
                        g4.G0(j4, z4, Util.O(headers));
                    } else if (z5) {
                        while (this.f43053c.l0() > 0) {
                            a(true);
                        }
                    } else if (z4) {
                        Http2Stream.this.g().F0(Http2Stream.this.j(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.f43055e = true;
                    Unit unit2 = Unit.f41027a;
                }
                Http2Stream.this.g().flush();
                Http2Stream.this.b();
            }
        }

        @Override // okio.z, java.io.Flushable
        public void flush() {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f42596h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            Http2Stream http2Stream2 = Http2Stream.this;
            synchronized (http2Stream2) {
                http2Stream2.c();
                Unit unit = Unit.f41027a;
            }
            while (this.f43053c.l0() > 0) {
                a(false);
                Http2Stream.this.g().flush();
            }
        }

        public final boolean m() {
            return this.f43055e;
        }

        public final boolean n() {
            return this.f43052b;
        }

        @Override // okio.z
        public C timeout() {
            return Http2Stream.this.s();
        }

        @Override // okio.z
        public void write(C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42596h || !Thread.holdsLock(http2Stream)) {
                this.f43053c.write(source, j4);
                while (this.f43053c.l0() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
        }
    }

    @Metadata
    public final class FramingSource implements B {

        /* renamed from: b, reason: collision with root package name */
        private final long f43057b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f43058c;

        /* renamed from: d, reason: collision with root package name */
        private final C3372e f43059d = new C3372e();

        /* renamed from: e, reason: collision with root package name */
        private final C3372e f43060e = new C3372e();

        /* renamed from: f, reason: collision with root package name */
        private Headers f43061f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f43062g;

        public FramingSource(long j4, boolean z4) {
            this.f43057b = j4;
            this.f43058c = z4;
        }

        private final void N(long j4) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.f42596h || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.g().E0(j4);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
        }

        public final void J(Headers headers) {
            this.f43061f = headers;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long l02;
            Http2Stream http2Stream = Http2Stream.this;
            synchronized (http2Stream) {
                this.f43062g = true;
                l02 = this.f43060e.l0();
                this.f43060e.m();
                Intrinsics.checkNotNull(http2Stream, "null cannot be cast to non-null type java.lang.Object");
                http2Stream.notifyAll();
                Unit unit = Unit.f41027a;
            }
            if (l02 > 0) {
                N(l02);
            }
            Http2Stream.this.b();
        }

        public final boolean m() {
            return this.f43062g;
        }

        public final boolean n() {
            return this.f43058c;
        }

        public final void o(g source, long j4) {
            boolean z4;
            boolean z5;
            Intrinsics.checkNotNullParameter(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.f42596h && Thread.holdsLock(http2Stream)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + http2Stream);
            }
            long j5 = j4;
            while (j5 > 0) {
                synchronized (Http2Stream.this) {
                    z4 = this.f43058c;
                    z5 = this.f43060e.l0() + j5 > this.f43057b;
                    Unit unit = Unit.f41027a;
                }
                if (z5) {
                    source.H(j5);
                    Http2Stream.this.f(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z4) {
                    source.H(j5);
                    return;
                }
                long read = source.read(this.f43059d, j5);
                if (read == -1) {
                    throw new EOFException();
                }
                j5 -= read;
                Http2Stream http2Stream2 = Http2Stream.this;
                synchronized (http2Stream2) {
                    try {
                        if (this.f43062g) {
                            this.f43059d.m();
                        } else {
                            boolean z6 = this.f43060e.l0() == 0;
                            this.f43060e.F(this.f43059d);
                            if (z6) {
                                Intrinsics.checkNotNull(http2Stream2, "null cannot be cast to non-null type java.lang.Object");
                                http2Stream2.notifyAll();
                            }
                        }
                    } finally {
                    }
                }
            }
            N(j4);
        }

        public final void p(boolean z4) {
            this.f43058c = z4;
        }

        @Override // okio.B
        public long read(C3372e sink, long j4) {
            IOException iOException;
            boolean z4;
            long j5;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j6 = 0;
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            while (true) {
                Http2Stream http2Stream = Http2Stream.this;
                synchronized (http2Stream) {
                    http2Stream.m().enter();
                    try {
                        if (http2Stream.h() == null || this.f43058c) {
                            iOException = null;
                        } else {
                            iOException = http2Stream.i();
                            if (iOException == null) {
                                ErrorCode h4 = http2Stream.h();
                                Intrinsics.checkNotNull(h4);
                                iOException = new StreamResetException(h4);
                            }
                        }
                        if (this.f43062g) {
                            throw new IOException("stream closed");
                        }
                        z4 = false;
                        if (this.f43060e.l0() > j6) {
                            C3372e c3372e = this.f43060e;
                            j5 = c3372e.read(sink, Math.min(j4, c3372e.l0()));
                            http2Stream.A(http2Stream.l() + j5);
                            long l4 = http2Stream.l() - http2Stream.k();
                            if (iOException == null && l4 >= http2Stream.g().j0().c() / 2) {
                                http2Stream.g().K0(http2Stream.j(), l4);
                                http2Stream.z(http2Stream.l());
                            }
                        } else {
                            if (!this.f43058c && iOException == null) {
                                http2Stream.D();
                                z4 = true;
                            }
                            j5 = -1;
                        }
                        http2Stream.m().b();
                        Unit unit = Unit.f41027a;
                    } finally {
                    }
                }
                if (!z4) {
                    if (j5 != -1) {
                        return j5;
                    }
                    if (iOException == null) {
                        return -1L;
                    }
                    throw iOException;
                }
                j6 = 0;
            }
        }

        @Override // okio.B
        public C timeout() {
            return Http2Stream.this.m();
        }
    }

    @Metadata
    public final class StreamTimeout extends C3370c {
        public StreamTimeout() {
        }

        public final void b() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.C3370c
        protected IOException newTimeoutException(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C1463f4.f16211f);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C3370c
        protected void timedOut() {
            Http2Stream.this.f(ErrorCode.CANCEL);
            Http2Stream.this.g().y0();
        }
    }

    public Http2Stream(int i4, Http2Connection connection, boolean z4, boolean z5, Headers headers) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f43038a = i4;
        this.f43039b = connection;
        this.f43043f = connection.k0().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f43044g = arrayDeque;
        this.f43046i = new FramingSource(connection.j0().c(), z5);
        this.f43047j = new FramingSink(z4);
        this.f43048k = new StreamTimeout();
        this.f43049l = new StreamTimeout();
        if (headers == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(headers);
        }
    }

    private final boolean e(ErrorCode errorCode, IOException iOException) {
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f43050m != null) {
                return false;
            }
            this.f43050m = errorCode;
            this.f43051n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f43046i.n() && this.f43047j.n()) {
                return false;
            }
            Unit unit = Unit.f41027a;
            this.f43039b.x0(this.f43038a);
            return true;
        }
    }

    public final void A(long j4) {
        this.f43040c = j4;
    }

    public final void B(long j4) {
        this.f43042e = j4;
    }

    public final synchronized Headers C() {
        Object removeFirst;
        this.f43048k.enter();
        while (this.f43044g.isEmpty() && this.f43050m == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f43048k.b();
                throw th;
            }
        }
        this.f43048k.b();
        if (this.f43044g.isEmpty()) {
            IOException iOException = this.f43051n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f43050m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
        removeFirst = this.f43044g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "headersQueue.removeFirst()");
        return (Headers) removeFirst;
    }

    public final void D() {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final C E() {
        return this.f43049l;
    }

    public final void a(long j4) {
        this.f43043f += j4;
        if (j4 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z4;
        boolean u4;
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f43046i.n() || !this.f43046i.m() || (!this.f43047j.n() && !this.f43047j.m())) {
                    z4 = false;
                    u4 = u();
                    Unit unit = Unit.f41027a;
                }
                z4 = true;
                u4 = u();
                Unit unit2 = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            d(ErrorCode.CANCEL, null);
        } else {
            if (u4) {
                return;
            }
            this.f43039b.x0(this.f43038a);
        }
    }

    public final void c() {
        if (this.f43047j.m()) {
            throw new IOException("stream closed");
        }
        if (this.f43047j.n()) {
            throw new IOException("stream finished");
        }
        if (this.f43050m != null) {
            IOException iOException = this.f43051n;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.f43050m;
            Intrinsics.checkNotNull(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void d(ErrorCode rstStatusCode, IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f43039b.I0(this.f43038a, rstStatusCode);
        }
    }

    public final void f(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f43039b.J0(this.f43038a, errorCode);
        }
    }

    public final Http2Connection g() {
        return this.f43039b;
    }

    public final synchronized ErrorCode h() {
        return this.f43050m;
    }

    public final IOException i() {
        return this.f43051n;
    }

    public final int j() {
        return this.f43038a;
    }

    public final long k() {
        return this.f43041d;
    }

    public final long l() {
        return this.f43040c;
    }

    public final StreamTimeout m() {
        return this.f43048k;
    }

    public final z n() {
        synchronized (this) {
            try {
                if (!this.f43045h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f43047j;
    }

    public final FramingSink o() {
        return this.f43047j;
    }

    public final FramingSource p() {
        return this.f43046i;
    }

    public final long q() {
        return this.f43043f;
    }

    public final long r() {
        return this.f43042e;
    }

    public final StreamTimeout s() {
        return this.f43049l;
    }

    public final boolean t() {
        return this.f43039b.e0() == ((this.f43038a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f43050m != null) {
                return false;
            }
            if (!this.f43046i.n()) {
                if (this.f43046i.m()) {
                }
                return true;
            }
            if (this.f43047j.n() || this.f43047j.m()) {
                if (this.f43045h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final C v() {
        return this.f43048k;
    }

    public final void w(g source, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (!Util.f42596h || !Thread.holdsLock(this)) {
            this.f43046i.o(source, i4);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0046, TryCatch #0 {all -> 0x0046, blocks: (B:10:0x0038, B:14:0x0040, B:16:0x0051, B:17:0x0056, B:24:0x0048), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x(Headers headers, boolean z4) {
        boolean u4;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f43045h && z4) {
                    this.f43046i.J(headers);
                    if (z4) {
                        this.f43046i.p(true);
                    }
                    u4 = u();
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                    Unit unit = Unit.f41027a;
                }
                this.f43045h = true;
                this.f43044g.add(headers);
                if (z4) {
                }
                u4 = u();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit2 = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (u4) {
            return;
        }
        this.f43039b.x0(this.f43038a);
    }

    public final synchronized void y(ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f43050m == null) {
            this.f43050m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j4) {
        this.f43041d = j4;
    }
}
