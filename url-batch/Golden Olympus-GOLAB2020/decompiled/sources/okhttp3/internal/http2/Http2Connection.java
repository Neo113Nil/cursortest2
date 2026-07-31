package okhttp3.internal.http2;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.E;
import kotlin.jvm.internal.G;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http2.Http2Reader;
import okhttp3.internal.platform.Platform;
import okio.C3372e;
import okio.f;
import okio.g;
import okio.h;

@Metadata
/* loaded from: classes3.dex */
public final class Http2Connection implements Closeable, AutoCloseable {

    /* renamed from: D, reason: collision with root package name */
    public static final Companion f42939D = new Companion(null);

    /* renamed from: E, reason: collision with root package name */
    private static final Settings f42940E;

    /* renamed from: A, reason: collision with root package name */
    private final Http2Writer f42941A;

    /* renamed from: B, reason: collision with root package name */
    private final ReaderRunnable f42942B;

    /* renamed from: C, reason: collision with root package name */
    private final Set f42943C;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f42944b;

    /* renamed from: c, reason: collision with root package name */
    private final Listener f42945c;

    /* renamed from: d, reason: collision with root package name */
    private final Map f42946d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42947e;

    /* renamed from: f, reason: collision with root package name */
    private int f42948f;

    /* renamed from: g, reason: collision with root package name */
    private int f42949g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f42950h;

    /* renamed from: i, reason: collision with root package name */
    private final TaskRunner f42951i;

    /* renamed from: j, reason: collision with root package name */
    private final TaskQueue f42952j;

    /* renamed from: k, reason: collision with root package name */
    private final TaskQueue f42953k;

    /* renamed from: l, reason: collision with root package name */
    private final TaskQueue f42954l;

    /* renamed from: m, reason: collision with root package name */
    private final PushObserver f42955m;

    /* renamed from: n, reason: collision with root package name */
    private long f42956n;

    /* renamed from: o, reason: collision with root package name */
    private long f42957o;

    /* renamed from: p, reason: collision with root package name */
    private long f42958p;

    /* renamed from: q, reason: collision with root package name */
    private long f42959q;

    /* renamed from: r, reason: collision with root package name */
    private long f42960r;

    /* renamed from: s, reason: collision with root package name */
    private long f42961s;

    /* renamed from: t, reason: collision with root package name */
    private final Settings f42962t;

    /* renamed from: u, reason: collision with root package name */
    private Settings f42963u;

    /* renamed from: v, reason: collision with root package name */
    private long f42964v;

    /* renamed from: w, reason: collision with root package name */
    private long f42965w;

    /* renamed from: x, reason: collision with root package name */
    private long f42966x;

    /* renamed from: y, reason: collision with root package name */
    private long f42967y;

    /* renamed from: z, reason: collision with root package name */
    private final Socket f42968z;

    @Metadata
    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        private boolean f43003a;

        /* renamed from: b, reason: collision with root package name */
        private final TaskRunner f43004b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f43005c;

        /* renamed from: d, reason: collision with root package name */
        public String f43006d;

        /* renamed from: e, reason: collision with root package name */
        public g f43007e;

        /* renamed from: f, reason: collision with root package name */
        public f f43008f;

        /* renamed from: g, reason: collision with root package name */
        private Listener f43009g;

        /* renamed from: h, reason: collision with root package name */
        private PushObserver f43010h;

        /* renamed from: i, reason: collision with root package name */
        private int f43011i;

        public Builder(boolean z4, TaskRunner taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f43003a = z4;
            this.f43004b = taskRunner;
            this.f43009g = Listener.f43013b;
            this.f43010h = PushObserver.f43081b;
        }

        public final Http2Connection a() {
            return new Http2Connection(this);
        }

        public final boolean b() {
            return this.f43003a;
        }

        public final String c() {
            String str = this.f43006d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final Listener d() {
            return this.f43009g;
        }

        public final int e() {
            return this.f43011i;
        }

        public final PushObserver f() {
            return this.f43010h;
        }

        public final f g() {
            f fVar = this.f43008f;
            if (fVar != null) {
                return fVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final Socket h() {
            Socket socket = this.f43005c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final g i() {
            g gVar = this.f43007e;
            if (gVar != null) {
                return gVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final TaskRunner j() {
            return this.f43004b;
        }

        public final Builder k(Listener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f43009g = listener;
            return this;
        }

        public final Builder l(int i4) {
            this.f43011i = i4;
            return this;
        }

        public final void m(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f43006d = str;
        }

        public final void n(f fVar) {
            Intrinsics.checkNotNullParameter(fVar, "<set-?>");
            this.f43008f = fVar;
        }

        public final void o(Socket socket) {
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f43005c = socket;
        }

        public final void p(g gVar) {
            Intrinsics.checkNotNullParameter(gVar, "<set-?>");
            this.f43007e = gVar;
        }

        public final Builder q(Socket socket, String peerName, g source, f sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            o(socket);
            if (this.f43003a) {
                str = Util.f42597i + ' ' + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            m(str);
            p(source);
            n(sink);
            return this;
        }
    }

    @Metadata
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Settings a() {
            return Http2Connection.f42940E;
        }

        private Companion() {
        }
    }

    @Metadata
    public static abstract class Listener {

        /* renamed from: a, reason: collision with root package name */
        public static final Companion f43012a = new Companion(null);

        /* renamed from: b, reason: collision with root package name */
        public static final Listener f43013b = new Listener() { // from class: okhttp3.internal.http2.Http2Connection$Listener$Companion$REFUSE_INCOMING_STREAMS$1
            @Override // okhttp3.internal.http2.Http2Connection.Listener
            public void b(Http2Stream stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.d(ErrorCode.REFUSED_STREAM, null);
            }
        };

        @Metadata
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }
        }

        public void a(Http2Connection connection, Settings settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void b(Http2Stream http2Stream);
    }

    @Metadata
    public final class ReaderRunnable implements Http2Reader.Handler, Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        private final Http2Reader f43014b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Http2Connection f43015c;

        public ReaderRunnable(Http2Connection http2Connection, Http2Reader reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f43015c = http2Connection;
            this.f43014b = reader;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void a() {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void b(final boolean z4, final Settings settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            TaskQueue taskQueue = this.f43015c.f42952j;
            final String str = this.f43015c.f0() + " applyAndAckSettings";
            final boolean z5 = true;
            taskQueue.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$settings$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    this.k(z4, settings);
                    return -1L;
                }
            }, 0L);
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void c(boolean z4, int i4, int i5, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            if (this.f43015c.w0(i4)) {
                this.f43015c.t0(i4, headerBlock, z4);
                return;
            }
            final Http2Connection http2Connection = this.f43015c;
            synchronized (http2Connection) {
                Http2Stream l02 = http2Connection.l0(i4);
                if (l02 != null) {
                    Unit unit = Unit.f41027a;
                    l02.x(Util.P(headerBlock), z4);
                    return;
                }
                if (http2Connection.f42950h) {
                    return;
                }
                if (i4 <= http2Connection.g0()) {
                    return;
                }
                if (i4 % 2 == http2Connection.i0() % 2) {
                    return;
                }
                final Http2Stream http2Stream = new Http2Stream(i4, http2Connection, false, z4, Util.P(headerBlock));
                http2Connection.z0(i4);
                http2Connection.m0().put(Integer.valueOf(i4), http2Stream);
                TaskQueue i6 = http2Connection.f42951i.i();
                final String str = http2Connection.f0() + '[' + i4 + "] onStream";
                final boolean z5 = true;
                i6.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$headers$lambda$2$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        try {
                            http2Connection.h0().b(http2Stream);
                            return -1L;
                        } catch (IOException e4) {
                            Platform.f43120a.g().k("Http2Connection.Listener failure for " + http2Connection.f0(), 4, e4);
                            try {
                                http2Stream.d(ErrorCode.PROTOCOL_ERROR, e4);
                                return -1L;
                            } catch (IOException unused) {
                                return -1L;
                            }
                        }
                    }
                }, 0L);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void d(int i4, long j4) {
            if (i4 == 0) {
                Http2Connection http2Connection = this.f43015c;
                synchronized (http2Connection) {
                    http2Connection.f42967y = http2Connection.n0() + j4;
                    Intrinsics.checkNotNull(http2Connection, "null cannot be cast to non-null type java.lang.Object");
                    http2Connection.notifyAll();
                    Unit unit = Unit.f41027a;
                }
                return;
            }
            Http2Stream l02 = this.f43015c.l0(i4);
            if (l02 != null) {
                synchronized (l02) {
                    l02.a(j4);
                    Unit unit2 = Unit.f41027a;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void e(boolean z4, int i4, g source, int i5) {
            Intrinsics.checkNotNullParameter(source, "source");
            if (this.f43015c.w0(i4)) {
                this.f43015c.s0(i4, source, i5, z4);
                return;
            }
            Http2Stream l02 = this.f43015c.l0(i4);
            if (l02 == null) {
                this.f43015c.J0(i4, ErrorCode.PROTOCOL_ERROR);
                long j4 = i5;
                this.f43015c.E0(j4);
                source.H(j4);
                return;
            }
            l02.w(source, i5);
            if (z4) {
                l02.x(Util.f42590b, true);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void f(boolean z4, final int i4, final int i5) {
            if (!z4) {
                TaskQueue taskQueue = this.f43015c.f42952j;
                final String str = this.f43015c.f0() + " ping";
                final Http2Connection http2Connection = this.f43015c;
                final boolean z5 = true;
                taskQueue.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$ping$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        http2Connection.H0(true, i4, i5);
                        return -1L;
                    }
                }, 0L);
                return;
            }
            Http2Connection http2Connection2 = this.f43015c;
            synchronized (http2Connection2) {
                try {
                    if (i4 == 1) {
                        http2Connection2.f42957o++;
                    } else if (i4 != 2) {
                        if (i4 == 3) {
                            http2Connection2.f42960r++;
                            Intrinsics.checkNotNull(http2Connection2, "null cannot be cast to non-null type java.lang.Object");
                            http2Connection2.notifyAll();
                        }
                        Unit unit = Unit.f41027a;
                    } else {
                        http2Connection2.f42959q++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void g(int i4, int i5, int i6, boolean z4) {
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void h(int i4, ErrorCode errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            if (this.f43015c.w0(i4)) {
                this.f43015c.v0(i4, errorCode);
                return;
            }
            Http2Stream x02 = this.f43015c.x0(i4);
            if (x02 != null) {
                x02.y(errorCode);
            }
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void i(int i4, int i5, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f43015c.u0(i5, requestHeaders);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            l();
            return Unit.f41027a;
        }

        @Override // okhttp3.internal.http2.Http2Reader.Handler
        public void j(int i4, ErrorCode errorCode, h debugData) {
            int i5;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.v();
            Http2Connection http2Connection = this.f43015c;
            synchronized (http2Connection) {
                array = http2Connection.m0().values().toArray(new Http2Stream[0]);
                http2Connection.f42950h = true;
                Unit unit = Unit.f41027a;
            }
            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                if (http2Stream.j() > i4 && http2Stream.t()) {
                    http2Stream.y(ErrorCode.REFUSED_STREAM);
                    this.f43015c.x0(http2Stream.j());
                }
            }
        }

        public final void k(boolean z4, Settings settings) {
            long c4;
            int i4;
            Http2Stream[] http2StreamArr;
            final boolean z5 = true;
            Intrinsics.checkNotNullParameter(settings, "settings");
            final G g4 = new G();
            Http2Writer o02 = this.f43015c.o0();
            final Http2Connection http2Connection = this.f43015c;
            synchronized (o02) {
                synchronized (http2Connection) {
                    try {
                        Settings k02 = http2Connection.k0();
                        if (!z4) {
                            Settings settings2 = new Settings();
                            settings2.g(k02);
                            settings2.g(settings);
                            settings = settings2;
                        }
                        g4.f41132b = settings;
                        c4 = settings.c() - k02.c();
                        if (c4 != 0 && !http2Connection.m0().isEmpty()) {
                            http2StreamArr = (Http2Stream[]) http2Connection.m0().values().toArray(new Http2Stream[0]);
                            http2Connection.A0((Settings) g4.f41132b);
                            TaskQueue taskQueue = http2Connection.f42954l;
                            final String str = http2Connection.f0() + " onSettings";
                            taskQueue.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                                @Override // okhttp3.internal.concurrent.Task
                                public long f() {
                                    http2Connection.h0().a(http2Connection, (Settings) g4.f41132b);
                                    return -1L;
                                }
                            }, 0L);
                            Unit unit = Unit.f41027a;
                        }
                        http2StreamArr = null;
                        http2Connection.A0((Settings) g4.f41132b);
                        TaskQueue taskQueue2 = http2Connection.f42954l;
                        final String str2 = http2Connection.f0() + " onSettings";
                        taskQueue2.i(new Task(str2, z5) { // from class: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda$7$lambda$6$$inlined$execute$default$1
                            @Override // okhttp3.internal.concurrent.Task
                            public long f() {
                                http2Connection.h0().a(http2Connection, (Settings) g4.f41132b);
                                return -1L;
                            }
                        }, 0L);
                        Unit unit2 = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    http2Connection.o0().a((Settings) g4.f41132b);
                } catch (IOException e4) {
                    http2Connection.d0(e4);
                }
                Unit unit3 = Unit.f41027a;
            }
            if (http2StreamArr != null) {
                for (Http2Stream http2Stream : http2StreamArr) {
                    synchronized (http2Stream) {
                        http2Stream.a(c4);
                        Unit unit4 = Unit.f41027a;
                    }
                }
            }
        }

        public void l() {
            ErrorCode errorCode = ErrorCode.INTERNAL_ERROR;
            try {
                try {
                    this.f43014b.o(this);
                    while (this.f43014b.n(false, this)) {
                    }
                    try {
                        this.f43015c.c0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
                        Util.l(this.f43014b);
                    } catch (IOException e4) {
                        e = e4;
                        ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                        this.f43015c.c0(errorCode2, errorCode2, e);
                        Util.l(this.f43014b);
                    }
                } catch (Throwable th) {
                    th = th;
                    this.f43015c.c0(errorCode, errorCode, null);
                    Util.l(this.f43014b);
                    throw th;
                }
            } catch (IOException e5) {
                e = e5;
            } catch (Throwable th2) {
                th = th2;
                this.f43015c.c0(errorCode, errorCode, null);
                Util.l(this.f43014b);
                throw th;
            }
        }
    }

    static {
        Settings settings = new Settings();
        settings.h(7, 65535);
        settings.h(5, 16384);
        f42940E = settings;
    }

    public Http2Connection(Builder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean b4 = builder.b();
        this.f42944b = b4;
        this.f42945c = builder.d();
        this.f42946d = new LinkedHashMap();
        String c4 = builder.c();
        this.f42947e = c4;
        this.f42949g = builder.b() ? 3 : 2;
        TaskRunner j4 = builder.j();
        this.f42951i = j4;
        TaskQueue i4 = j4.i();
        this.f42952j = i4;
        this.f42953k = j4.i();
        this.f42954l = j4.i();
        this.f42955m = builder.f();
        Settings settings = new Settings();
        if (builder.b()) {
            settings.h(7, 16777216);
        }
        this.f42962t = settings;
        this.f42963u = f42940E;
        this.f42967y = r2.c();
        this.f42968z = builder.h();
        this.f42941A = new Http2Writer(builder.g(), b4);
        this.f42942B = new ReaderRunnable(this, new Http2Reader(builder.i(), b4));
        this.f42943C = new LinkedHashSet();
        if (builder.e() != 0) {
            final long nanos = TimeUnit.MILLISECONDS.toNanos(builder.e());
            final String str = c4 + " ping";
            i4.i(new Task(str) { // from class: okhttp3.internal.http2.Http2Connection$special$$inlined$schedule$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    long j5;
                    long j6;
                    boolean z4;
                    synchronized (this) {
                        long j7 = this.f42957o;
                        j5 = this.f42956n;
                        if (j7 < j5) {
                            z4 = true;
                        } else {
                            j6 = this.f42956n;
                            this.f42956n = j6 + 1;
                            z4 = false;
                        }
                    }
                    if (z4) {
                        this.d0(null);
                        return -1L;
                    }
                    this.H0(false, 1, 0);
                    return nanos;
                }
            }, nanos);
        }
    }

    public static /* synthetic */ void D0(Http2Connection http2Connection, boolean z4, TaskRunner taskRunner, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            z4 = true;
        }
        if ((i4 & 2) != 0) {
            taskRunner = TaskRunner.f42718i;
        }
        http2Connection.C0(z4, taskRunner);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d0(IOException iOException) {
        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
        c0(errorCode, errorCode, iOException);
    }

    private final Http2Stream q0(int i4, List list, boolean z4) {
        Throwable th;
        boolean z5 = true;
        boolean z6 = !z4;
        synchronized (this.f42941A) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f42949g > 1073741823) {
                                try {
                                    B0(ErrorCode.REFUSED_STREAM);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (this.f42950h) {
                                    throw new ConnectionShutdownException();
                                }
                                int i5 = this.f42949g;
                                this.f42949g = i5 + 2;
                                Http2Stream http2Stream = new Http2Stream(i5, this, z6, false, null);
                                if (z4 && this.f42966x < this.f42967y && http2Stream.r() < http2Stream.q()) {
                                    z5 = false;
                                }
                                if (http2Stream.u()) {
                                    this.f42946d.put(Integer.valueOf(i5), http2Stream);
                                }
                                Unit unit = Unit.f41027a;
                                if (i4 == 0) {
                                    this.f42941A.N(z6, i5, list);
                                } else {
                                    if (this.f42944b) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f42941A.V(i4, i5, list);
                                }
                                if (z5) {
                                    this.f42941A.flush();
                                }
                                return http2Stream;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    public final void A0(Settings settings) {
        Intrinsics.checkNotNullParameter(settings, "<set-?>");
        this.f42963u = settings;
    }

    public final void B0(ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f42941A) {
            E e4 = new E();
            synchronized (this) {
                if (this.f42950h) {
                    return;
                }
                this.f42950h = true;
                int i4 = this.f42948f;
                e4.f41130b = i4;
                Unit unit = Unit.f41027a;
                this.f42941A.J(i4, statusCode, Util.f42589a);
            }
        }
    }

    public final void C0(boolean z4, TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        if (z4) {
            this.f42941A.m();
            this.f42941A.X(this.f42962t);
            if (this.f42962t.c() != 65535) {
                this.f42941A.Y(0, r5 - 65535);
            }
        }
        TaskQueue i4 = taskRunner.i();
        final String str = this.f42947e;
        final ReaderRunnable readerRunnable = this.f42942B;
        final boolean z5 = true;
        i4.i(new Task(str, z5) { // from class: okhttp3.internal.concurrent.TaskQueue$execute$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                readerRunnable.invoke();
                return -1L;
            }
        }, 0L);
    }

    public final synchronized void E0(long j4) {
        long j5 = this.f42964v + j4;
        this.f42964v = j5;
        long j6 = j5 - this.f42965w;
        if (j6 >= this.f42962t.c() / 2) {
            K0(0, j6);
            this.f42965w += j6;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f42941A.Q());
        r6 = r2;
        r8.f42966x += r6;
        r4 = kotlin.Unit.f41027a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F0(int i4, boolean z4, C3372e c3372e, long j4) {
        int min;
        long j5;
        if (j4 == 0) {
            this.f42941A.n(z4, i4, c3372e, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.f42966x;
                            long j7 = this.f42967y;
                            if (j6 < j7) {
                                break;
                            }
                            if (!this.f42946d.containsKey(Integer.valueOf(i4))) {
                                throw new IOException("stream closed");
                            }
                            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                            wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j4 -= j5;
            this.f42941A.n(z4 && j4 == 0, i4, c3372e, min);
        }
    }

    public final void G0(int i4, boolean z4, List alternating) {
        Intrinsics.checkNotNullParameter(alternating, "alternating");
        this.f42941A.N(z4, i4, alternating);
    }

    public final void H0(boolean z4, int i4, int i5) {
        try {
            this.f42941A.U(z4, i4, i5);
        } catch (IOException e4) {
            d0(e4);
        }
    }

    public final void I0(int i4, ErrorCode statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f42941A.W(i4, statusCode);
    }

    public final void J0(final int i4, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.f42952j;
        final String str = this.f42947e + '[' + i4 + "] writeSynReset";
        final boolean z4 = true;
        taskQueue.i(new Task(str, z4) { // from class: okhttp3.internal.http2.Http2Connection$writeSynResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    this.I0(i4, errorCode);
                    return -1L;
                } catch (IOException e4) {
                    this.d0(e4);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void K0(final int i4, final long j4) {
        TaskQueue taskQueue = this.f42952j;
        final String str = this.f42947e + '[' + i4 + "] windowUpdate";
        final boolean z4 = true;
        taskQueue.i(new Task(str, z4) { // from class: okhttp3.internal.http2.Http2Connection$writeWindowUpdateLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                try {
                    this.o0().Y(i4, j4);
                    return -1L;
                } catch (IOException e4) {
                    this.d0(e4);
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void c0(ErrorCode connectionCode, ErrorCode streamCode, IOException iOException) {
        int i4;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (Util.f42596h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            B0(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f42946d.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f42946d.values().toArray(new Http2Stream[0]);
                    this.f42946d.clear();
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        Http2Stream[] http2StreamArr = (Http2Stream[]) objArr;
        if (http2StreamArr != null) {
            for (Http2Stream http2Stream : http2StreamArr) {
                try {
                    http2Stream.d(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f42941A.close();
        } catch (IOException unused3) {
        }
        try {
            this.f42968z.close();
        } catch (IOException unused4) {
        }
        this.f42952j.n();
        this.f42953k.n();
        this.f42954l.n();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c0(ErrorCode.NO_ERROR, ErrorCode.CANCEL, null);
    }

    public final boolean e0() {
        return this.f42944b;
    }

    public final String f0() {
        return this.f42947e;
    }

    public final void flush() {
        this.f42941A.flush();
    }

    public final int g0() {
        return this.f42948f;
    }

    public final Listener h0() {
        return this.f42945c;
    }

    public final int i0() {
        return this.f42949g;
    }

    public final Settings j0() {
        return this.f42962t;
    }

    public final Settings k0() {
        return this.f42963u;
    }

    public final synchronized Http2Stream l0(int i4) {
        return (Http2Stream) this.f42946d.get(Integer.valueOf(i4));
    }

    public final Map m0() {
        return this.f42946d;
    }

    public final long n0() {
        return this.f42967y;
    }

    public final Http2Writer o0() {
        return this.f42941A;
    }

    public final synchronized boolean p0(long j4) {
        if (this.f42950h) {
            return false;
        }
        if (this.f42959q < this.f42958p) {
            if (j4 >= this.f42961s) {
                return false;
            }
        }
        return true;
    }

    public final Http2Stream r0(List requestHeaders, boolean z4) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        return q0(0, requestHeaders, z4);
    }

    public final void s0(final int i4, g source, final int i5, final boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        final C3372e c3372e = new C3372e();
        long j4 = i5;
        source.O(j4);
        source.read(c3372e, j4);
        TaskQueue taskQueue = this.f42953k;
        final String str = this.f42947e + '[' + i4 + "] onData";
        final boolean z5 = true;
        taskQueue.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$pushDataLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                PushObserver pushObserver;
                Set set;
                try {
                    pushObserver = this.f42955m;
                    boolean d4 = pushObserver.d(i4, c3372e, i5, z4);
                    if (d4) {
                        this.o0().W(i4, ErrorCode.CANCEL);
                    }
                    if (!d4 && !z4) {
                        return -1L;
                    }
                    synchronized (this) {
                        set = this.f42943C;
                        set.remove(Integer.valueOf(i4));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            }
        }, 0L);
    }

    public final void t0(final int i4, final List requestHeaders, final boolean z4) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        TaskQueue taskQueue = this.f42953k;
        final String str = this.f42947e + '[' + i4 + "] onHeaders";
        final boolean z5 = true;
        taskQueue.i(new Task(str, z5) { // from class: okhttp3.internal.http2.Http2Connection$pushHeadersLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.f42955m;
                boolean b4 = pushObserver.b(i4, requestHeaders, z4);
                if (b4) {
                    try {
                        this.o0().W(i4, ErrorCode.CANCEL);
                    } catch (IOException unused) {
                        return -1L;
                    }
                }
                if (!b4 && !z4) {
                    return -1L;
                }
                synchronized (this) {
                    set = this.f42943C;
                    set.remove(Integer.valueOf(i4));
                }
                return -1L;
            }
        }, 0L);
    }

    public final void u0(final int i4, final List requestHeaders) {
        Throwable th;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            try {
                if (this.f42943C.contains(Integer.valueOf(i4))) {
                    try {
                        J0(i4, ErrorCode.PROTOCOL_ERROR);
                        return;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
                this.f42943C.add(Integer.valueOf(i4));
                TaskQueue taskQueue = this.f42953k;
                final String str = this.f42947e + '[' + i4 + "] onRequest";
                final boolean z4 = true;
                taskQueue.i(new Task(str, z4) { // from class: okhttp3.internal.http2.Http2Connection$pushRequestLater$$inlined$execute$default$1
                    @Override // okhttp3.internal.concurrent.Task
                    public long f() {
                        PushObserver pushObserver;
                        Set set;
                        pushObserver = this.f42955m;
                        if (!pushObserver.a(i4, requestHeaders)) {
                            return -1L;
                        }
                        try {
                            this.o0().W(i4, ErrorCode.CANCEL);
                            synchronized (this) {
                                set = this.f42943C;
                                set.remove(Integer.valueOf(i4));
                            }
                            return -1L;
                        } catch (IOException unused) {
                            return -1L;
                        }
                    }
                }, 0L);
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final void v0(final int i4, final ErrorCode errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        TaskQueue taskQueue = this.f42953k;
        final String str = this.f42947e + '[' + i4 + "] onReset";
        final boolean z4 = true;
        taskQueue.i(new Task(str, z4) { // from class: okhttp3.internal.http2.Http2Connection$pushResetLater$$inlined$execute$default$1
            @Override // okhttp3.internal.concurrent.Task
            public long f() {
                PushObserver pushObserver;
                Set set;
                pushObserver = this.f42955m;
                pushObserver.c(i4, errorCode);
                synchronized (this) {
                    set = this.f42943C;
                    set.remove(Integer.valueOf(i4));
                    Unit unit = Unit.f41027a;
                }
                return -1L;
            }
        }, 0L);
    }

    public final boolean w0(int i4) {
        return i4 != 0 && (i4 & 1) == 0;
    }

    public final synchronized Http2Stream x0(int i4) {
        Http2Stream http2Stream;
        http2Stream = (Http2Stream) this.f42946d.remove(Integer.valueOf(i4));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return http2Stream;
    }

    public final void y0() {
        synchronized (this) {
            long j4 = this.f42959q;
            long j5 = this.f42958p;
            if (j4 < j5) {
                return;
            }
            this.f42958p = j5 + 1;
            this.f42961s = System.nanoTime() + 1000000000;
            Unit unit = Unit.f41027a;
            TaskQueue taskQueue = this.f42952j;
            final String str = this.f42947e + " ping";
            final boolean z4 = true;
            taskQueue.i(new Task(str, z4) { // from class: okhttp3.internal.http2.Http2Connection$sendDegradedPingLater$$inlined$execute$default$1
                @Override // okhttp3.internal.concurrent.Task
                public long f() {
                    this.H0(false, 2, 0);
                    return -1L;
                }
            }, 0L);
        }
    }

    public final void z0(int i4) {
        this.f42948f = i4;
    }
}
