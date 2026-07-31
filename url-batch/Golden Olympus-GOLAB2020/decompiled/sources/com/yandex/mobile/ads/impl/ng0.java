package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import com.yandex.mobile.ads.impl.tg0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ng0 implements Closeable, AutoCloseable {

    /* renamed from: C, reason: collision with root package name */
    @NotNull
    private static final ox1 f29568C;

    /* renamed from: A, reason: collision with root package name */
    @NotNull
    private final c f29569A;

    /* renamed from: B, reason: collision with root package name */
    @NotNull
    private final LinkedHashSet f29570B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29571a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final b f29572b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f29573c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f29574d;

    /* renamed from: e, reason: collision with root package name */
    private int f29575e;

    /* renamed from: f, reason: collision with root package name */
    private int f29576f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f29577g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    private final a42 f29578h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final z32 f29579i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final z32 f29580j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final z32 f29581k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final wm1 f29582l;

    /* renamed from: m, reason: collision with root package name */
    private long f29583m;

    /* renamed from: n, reason: collision with root package name */
    private long f29584n;

    /* renamed from: o, reason: collision with root package name */
    private long f29585o;

    /* renamed from: p, reason: collision with root package name */
    private long f29586p;

    /* renamed from: q, reason: collision with root package name */
    private long f29587q;

    /* renamed from: r, reason: collision with root package name */
    private long f29588r;

    /* renamed from: s, reason: collision with root package name */
    @NotNull
    private final ox1 f29589s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private ox1 f29590t;

    /* renamed from: u, reason: collision with root package name */
    private long f29591u;

    /* renamed from: v, reason: collision with root package name */
    private long f29592v;

    /* renamed from: w, reason: collision with root package name */
    private long f29593w;

    /* renamed from: x, reason: collision with root package name */
    private long f29594x;

    /* renamed from: y, reason: collision with root package name */
    @NotNull
    private final Socket f29595y;

    /* renamed from: z, reason: collision with root package name */
    @NotNull
    private final vg0 f29596z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f29597a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final a42 f29598b;

        /* renamed from: c, reason: collision with root package name */
        public Socket f29599c;

        /* renamed from: d, reason: collision with root package name */
        public String f29600d;

        /* renamed from: e, reason: collision with root package name */
        public okio.g f29601e;

        /* renamed from: f, reason: collision with root package name */
        public okio.f f29602f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private b f29603g;

        /* renamed from: h, reason: collision with root package name */
        @NotNull
        private wm1 f29604h;

        /* renamed from: i, reason: collision with root package name */
        private int f29605i;

        public a(@NotNull a42 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f29597a = true;
            this.f29598b = taskRunner;
            this.f29603g = b.f29606a;
            this.f29604h = wm1.f34129a;
        }

        public final boolean a() {
            return this.f29597a;
        }

        @NotNull
        public final String b() {
            String str = this.f29600d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        @NotNull
        public final b c() {
            return this.f29603g;
        }

        public final int d() {
            return this.f29605i;
        }

        @NotNull
        public final wm1 e() {
            return this.f29604h;
        }

        @NotNull
        public final okio.f f() {
            okio.f fVar = this.f29602f;
            if (fVar != null) {
                return fVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        @NotNull
        public final Socket g() {
            Socket socket = this.f29599c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        @NotNull
        public final okio.g h() {
            okio.g gVar = this.f29601e;
            if (gVar != null) {
                return gVar;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        @NotNull
        public final a42 i() {
            return this.f29598b;
        }

        @NotNull
        public final a j() {
            this.f29605i = 0;
            return this;
        }

        @NotNull
        public final a a(@NotNull b listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f29603g = listener;
            return this;
        }

        @NotNull
        public final a a(@NotNull Socket socket, @NotNull String peerName, @NotNull okio.g source, @NotNull okio.f sink) {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.f29599c = socket;
            if (this.f29597a) {
                str = v82.f33556g + " " + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.f29600d = str;
            Intrinsics.checkNotNullParameter(source, "<set-?>");
            this.f29601e = source;
            Intrinsics.checkNotNullParameter(sink, "<set-?>");
            this.f29602f = sink;
            return this;
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        public static final a f29606a = new a();

        public static final class a extends b {
            a() {
            }

            @Override // com.yandex.mobile.ads.impl.ng0.b
            public final void a(@NotNull ug0 stream) {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.a(i50.f27094h, (IOException) null);
            }
        }

        public void a(@NotNull ng0 connection, @NotNull ox1 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void a(@NotNull ug0 ug0Var);
    }

    public static final class d extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29611e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29612f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f29613g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, ng0 ng0Var, int i4, List list, boolean z4) {
            super(str, true);
            this.f29611e = ng0Var;
            this.f29612f = i4;
            this.f29613g = list;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            wm1 wm1Var = this.f29611e.f29582l;
            List responseHeaders = this.f29613g;
            ((vm1) wm1Var).getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            try {
                this.f29611e.k().a(this.f29612f, i50.f27095i);
                synchronized (this.f29611e) {
                    this.f29611e.f29570B.remove(Integer.valueOf(this.f29612f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class e extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29614e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29615f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f29616g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ng0 ng0Var, int i4, List list) {
            super(str, true);
            this.f29614e = ng0Var;
            this.f29615f = i4;
            this.f29616g = list;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            wm1 wm1Var = this.f29614e.f29582l;
            List requestHeaders = this.f29616g;
            ((vm1) wm1Var).getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            try {
                this.f29614e.k().a(this.f29615f, i50.f27095i);
                synchronized (this.f29614e) {
                    this.f29614e.f29570B.remove(Integer.valueOf(this.f29615f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class f extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29617e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29618f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i50 f29619g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, ng0 ng0Var, int i4, i50 i50Var) {
            super(str, true);
            this.f29617e = ng0Var;
            this.f29618f = i4;
            this.f29619g = i50Var;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            wm1 wm1Var = this.f29617e.f29582l;
            i50 errorCode = this.f29619g;
            ((vm1) wm1Var).getClass();
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            synchronized (this.f29617e) {
                this.f29617e.f29570B.remove(Integer.valueOf(this.f29618f));
                Unit unit = Unit.f41027a;
            }
            return -1L;
        }
    }

    public static final class g extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29620e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, ng0 ng0Var) {
            super(str, true);
            this.f29620e = ng0Var;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            this.f29620e.a(2, 0, false);
            return -1L;
        }
    }

    public static final class h extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29621e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ long f29622f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, ng0 ng0Var, long j4) {
            super(str);
            this.f29621e = ng0Var;
            this.f29622f = j4;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            boolean z4;
            synchronized (this.f29621e) {
                if (this.f29621e.f29584n < this.f29621e.f29583m) {
                    z4 = true;
                } else {
                    this.f29621e.f29583m++;
                    z4 = false;
                }
            }
            if (z4) {
                ng0.a(this.f29621e, (IOException) null);
                return -1L;
            }
            this.f29621e.a(1, 0, false);
            return this.f29622f;
        }
    }

    public static final class i extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29623e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29624f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ i50 f29625g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, ng0 ng0Var, int i4, i50 i50Var) {
            super(str, true);
            this.f29623e = ng0Var;
            this.f29624f = i4;
            this.f29625g = i50Var;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            try {
                this.f29623e.b(this.f29624f, this.f29625g);
                return -1L;
            } catch (IOException e4) {
                ng0.a(this.f29623e, e4);
                return -1L;
            }
        }
    }

    public static final class j extends w32 {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ ng0 f29626e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ int f29627f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f29628g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, ng0 ng0Var, int i4, long j4) {
            super(str, true);
            this.f29626e = ng0Var;
            this.f29627f = i4;
            this.f29628g = j4;
        }

        @Override // com.yandex.mobile.ads.impl.w32
        public final long e() {
            try {
                this.f29626e.k().a(this.f29627f, this.f29628g);
                return -1L;
            } catch (IOException e4) {
                ng0.a(this.f29626e, e4);
                return -1L;
            }
        }
    }

    static {
        ox1 ox1Var = new ox1();
        ox1Var.a(7, 65535);
        ox1Var.a(5, 16384);
        f29568C = ox1Var;
    }

    public ng0(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean a4 = builder.a();
        this.f29571a = a4;
        this.f29572b = builder.c();
        this.f29573c = new LinkedHashMap();
        String b4 = builder.b();
        this.f29574d = b4;
        this.f29576f = builder.a() ? 3 : 2;
        a42 i4 = builder.i();
        this.f29578h = i4;
        z32 e4 = i4.e();
        this.f29579i = e4;
        this.f29580j = i4.e();
        this.f29581k = i4.e();
        this.f29582l = builder.e();
        ox1 ox1Var = new ox1();
        if (builder.a()) {
            ox1Var.a(7, 16777216);
        }
        this.f29589s = ox1Var;
        this.f29590t = f29568C;
        this.f29594x = r2.b();
        this.f29595y = builder.g();
        this.f29596z = new vg0(builder.f(), a4);
        this.f29569A = new c(this, new tg0(builder.h(), a4));
        this.f29570B = new LinkedHashSet();
        if (builder.d() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.d());
            e4.a(new h(b4 + " ping", this, nanos), nanos);
        }
    }

    public static final void a(ng0 ng0Var, IOException iOException) {
        ng0Var.getClass();
        i50 i50Var = i50.f27091e;
        ng0Var.a(i50Var, i50Var, iOException);
    }

    public static boolean b(int i4) {
        return i4 != 0 && (i4 & 1) == 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(i50.f27090d, i50.f27095i, (IOException) null);
    }

    public final void flush() {
        this.f29596z.flush();
    }

    public final void l() {
        synchronized (this) {
            long j4 = this.f29586p;
            long j5 = this.f29585o;
            if (j4 < j5) {
                return;
            }
            this.f29585o = j5 + 1;
            this.f29588r = System.nanoTime() + 1000000000;
            Unit unit = Unit.f41027a;
            this.f29579i.a(new g(this.f29574d + " ping", this), 0L);
        }
    }

    public final int f() {
        return this.f29576f;
    }

    @NotNull
    public final ox1 g() {
        return this.f29589s;
    }

    @NotNull
    public final ox1 h() {
        return this.f29590t;
    }

    @NotNull
    public final LinkedHashMap i() {
        return this.f29573c;
    }

    public final long j() {
        return this.f29594x;
    }

    @NotNull
    public final vg0 k() {
        return this.f29596z;
    }

    @NotNull
    public final String c() {
        return this.f29574d;
    }

    public final int d() {
        return this.f29575e;
    }

    @NotNull
    public final b e() {
        return this.f29572b;
    }

    public final boolean b() {
        return this.f29571a;
    }

    @Nullable
    public final synchronized ug0 c(int i4) {
        ug0 ug0Var;
        ug0Var = (ug0) this.f29573c.remove(Integer.valueOf(i4));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return ug0Var;
    }

    public final void d(int i4) {
        this.f29575e = i4;
    }

    public final void a(@NotNull i50 connectionCode, @NotNull i50 streamCode, @Nullable IOException iOException) {
        int i4;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            a(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            try {
                if (this.f29573c.isEmpty()) {
                    objArr = null;
                } else {
                    objArr = this.f29573c.values().toArray(new ug0[0]);
                    this.f29573c.clear();
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        ug0[] ug0VarArr = (ug0[]) objArr;
        if (ug0VarArr != null) {
            for (ug0 ug0Var : ug0VarArr) {
                try {
                    ug0Var.a(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.f29596z.close();
        } catch (IOException unused3) {
        }
        try {
            this.f29595y.close();
        } catch (IOException unused4) {
        }
        this.f29579i.j();
        this.f29580j.j();
        this.f29581k.j();
    }

    public final synchronized void b(long j4) {
        long j5 = this.f29591u + j4;
        this.f29591u = j5;
        long j6 = j5 - this.f29592v;
        if (j6 >= this.f29589s.b() / 2) {
            a(0, j6);
            this.f29592v += j6;
        }
    }

    public final void c(int i4, @NotNull i50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f29579i.a(new i(this.f29574d + b9.i.f15550d + i4 + "] writeSynReset", this, i4, errorCode), 0L);
    }

    public static void l(ng0 ng0Var) {
        a42 taskRunner = a42.f23152h;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        ng0Var.f29596z.a();
        ng0Var.f29596z.b(ng0Var.f29589s);
        if (ng0Var.f29589s.b() != 65535) {
            ng0Var.f29596z.a(0, r1 - 65535);
        }
        taskRunner.e().a(new y32(ng0Var.f29574d, ng0Var.f29569A), 0L);
    }

    public final void b(int i4, @NotNull i50 statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.f29596z.a(i4, statusCode);
    }

    @Nullable
    public final synchronized ug0 a(int i4) {
        return (ug0) this.f29573c.get(Integer.valueOf(i4));
    }

    public final synchronized boolean a(long j4) {
        if (this.f29577g) {
            return false;
        }
        if (this.f29586p < this.f29585o) {
            if (j4 >= this.f29588r) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final ug0 a(@NotNull ArrayList requestHeaders, boolean z4) {
        Throwable th;
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        boolean z5 = true;
        boolean z6 = !z4;
        synchronized (this.f29596z) {
            try {
                try {
                    synchronized (this) {
                        try {
                            if (this.f29576f > 1073741823) {
                                try {
                                    a(i50.f27094h);
                                } catch (Throwable th2) {
                                    th = th2;
                                    throw th;
                                }
                            }
                            try {
                                if (!this.f29577g) {
                                    int i4 = this.f29576f;
                                    this.f29576f = i4 + 2;
                                    ug0 ug0Var = new ug0(i4, this, z6, false, null);
                                    if (z4 && this.f29593w < this.f29594x && ug0Var.n() < ug0Var.m()) {
                                        z5 = false;
                                    }
                                    if (ug0Var.q()) {
                                        this.f29573c.put(Integer.valueOf(i4), ug0Var);
                                    }
                                    Unit unit = Unit.f41027a;
                                    this.f29596z.a(i4, requestHeaders, z6);
                                    if (z5) {
                                        this.f29596z.flush();
                                    }
                                    return ug0Var;
                                }
                                throw new dr();
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

    public final class c implements tg0.c, Function0<Unit> {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final tg0 f29607b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ng0 f29608c;

        public static final class a extends w32 {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ ng0 f29609e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.G f29610f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, ng0 ng0Var, kotlin.jvm.internal.G g4) {
                super(str, true);
                this.f29609e = ng0Var;
                this.f29610f = g4;
            }

            @Override // com.yandex.mobile.ads.impl.w32
            public final long e() {
                this.f29609e.e().a(this.f29609e, (ox1) this.f29610f.f41132b);
                return -1L;
            }
        }

        public c(ng0 ng0Var, @NotNull tg0 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.f29608c = ng0Var;
            this.f29607b = reader;
        }

        public final void a(boolean z4, @NotNull ox1 settings) {
            long b4;
            int i4;
            ug0[] ug0VarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            kotlin.jvm.internal.G g4 = new kotlin.jvm.internal.G();
            vg0 k4 = this.f29608c.k();
            ng0 ng0Var = this.f29608c;
            synchronized (k4) {
                synchronized (ng0Var) {
                    try {
                        ox1 h4 = ng0Var.h();
                        if (!z4) {
                            ox1 ox1Var = new ox1();
                            ox1Var.a(h4);
                            ox1Var.a(settings);
                            settings = ox1Var;
                        }
                        g4.f41132b = settings;
                        b4 = settings.b() - h4.b();
                        if (b4 != 0 && !ng0Var.i().isEmpty()) {
                            ug0VarArr = (ug0[]) ng0Var.i().values().toArray(new ug0[0]);
                            ng0Var.a((ox1) g4.f41132b);
                            ng0Var.f29581k.a(new a(ng0Var.c() + " onSettings", ng0Var, g4), 0L);
                            Unit unit = Unit.f41027a;
                        }
                        ug0VarArr = null;
                        ng0Var.a((ox1) g4.f41132b);
                        ng0Var.f29581k.a(new a(ng0Var.c() + " onSettings", ng0Var, g4), 0L);
                        Unit unit2 = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                try {
                    ng0Var.k().a((ox1) g4.f41132b);
                } catch (IOException e4) {
                    ng0.a(ng0Var, e4);
                }
                Unit unit3 = Unit.f41027a;
            }
            if (ug0VarArr != null) {
                for (ug0 ug0Var : ug0VarArr) {
                    synchronized (ug0Var) {
                        ug0Var.a(b4);
                        Unit unit4 = Unit.f41027a;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.i50] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            Throwable th;
            i50 i50Var;
            i50 i50Var2 = i50.f27092f;
            IOException e4 = null;
            try {
                try {
                    this.f29607b.a(this);
                    while (this.f29607b.a(false, this)) {
                    }
                    i50 i50Var3 = i50.f27090d;
                    try {
                        this.f29608c.a(i50Var3, i50.f27095i, (IOException) null);
                        v82.a(this.f29607b);
                        i50Var = i50Var3;
                    } catch (IOException e5) {
                        e4 = e5;
                        i50 i50Var4 = i50.f27091e;
                        ng0 ng0Var = this.f29608c;
                        ng0Var.a(i50Var4, i50Var4, e4);
                        v82.a(this.f29607b);
                        i50Var = ng0Var;
                        i50Var2 = Unit.f41027a;
                        return i50Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f29608c.a(i50Var, i50Var2, e4);
                    v82.a(this.f29607b);
                    throw th;
                }
            } catch (IOException e6) {
                e4 = e6;
            } catch (Throwable th3) {
                th = th3;
                i50Var = i50Var2;
                this.f29608c.a(i50Var, i50Var2, e4);
                v82.a(this.f29607b);
                throw th;
            }
            i50Var2 = Unit.f41027a;
            return i50Var2;
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, int i5, @NotNull okio.g source, boolean z4) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f29608c.getClass();
            if (ng0.b(i4)) {
                this.f29608c.a(i4, i5, source, z4);
                return;
            }
            ug0 a4 = this.f29608c.a(i4);
            if (a4 == null) {
                this.f29608c.c(i4, i50.f27091e);
                long j4 = i5;
                this.f29608c.b(j4);
                source.H(j4);
                return;
            }
            a4.a(source, i5);
            if (z4) {
                a4.a(v82.f33551b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, @NotNull i50 errorCode, @NotNull okio.h debugData) {
            int i5;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.v();
            ng0 ng0Var = this.f29608c;
            synchronized (ng0Var) {
                array = ng0Var.i().values().toArray(new ug0[0]);
                ng0Var.f29577g = true;
                Unit unit = Unit.f41027a;
            }
            for (ug0 ug0Var : (ug0[]) array) {
                if (ug0Var.f() > i4 && ug0Var.p()) {
                    ug0Var.b(i50.f27094h);
                    this.f29608c.c(ug0Var.f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(boolean z4, int i4, @NotNull List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            this.f29608c.getClass();
            if (ng0.b(i4)) {
                this.f29608c.a(i4, (List<af0>) headerBlock, z4);
                return;
            }
            ng0 ng0Var = this.f29608c;
            synchronized (ng0Var) {
                ug0 a4 = ng0Var.a(i4);
                if (a4 == null) {
                    if (ng0Var.f29577g) {
                        return;
                    }
                    if (i4 <= ng0Var.d()) {
                        return;
                    }
                    if (i4 % 2 == ng0Var.f() % 2) {
                        return;
                    }
                    ug0 ug0Var = new ug0(i4, ng0Var, false, z4, v82.a((List<af0>) headerBlock));
                    ng0Var.d(i4);
                    ng0Var.i().put(Integer.valueOf(i4), ug0Var);
                    ng0Var.f29578h.e().a(new og0(ng0Var.c() + b9.i.f15550d + i4 + "] onStream", ng0Var, ug0Var), 0L);
                    return;
                }
                Unit unit = Unit.f41027a;
                a4.a(v82.a((List<af0>) headerBlock), z4);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, int i5, boolean z4) {
            if (!z4) {
                this.f29608c.f29579i.a(new pg0(this.f29608c.c() + " ping", this.f29608c, i4, i5), 0L);
                return;
            }
            ng0 ng0Var = this.f29608c;
            synchronized (ng0Var) {
                try {
                    if (i4 == 1) {
                        ng0Var.f29584n++;
                    } else if (i4 == 2) {
                        ng0Var.f29586p++;
                    } else {
                        if (i4 == 3) {
                            ng0Var.f29587q++;
                            Intrinsics.checkNotNull(ng0Var, "null cannot be cast to non-null type java.lang.Object");
                            ng0Var.notifyAll();
                        }
                        Unit unit = Unit.f41027a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, @NotNull List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.f29608c.a(i4, (List<af0>) requestHeaders);
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, @NotNull i50 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.f29608c.getClass();
            if (ng0.b(i4)) {
                this.f29608c.a(i4, errorCode);
                return;
            }
            ug0 c4 = this.f29608c.c(i4);
            if (c4 != null) {
                c4.b(errorCode);
            }
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(@NotNull ox1 settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f29608c.f29579i.a(new qg0(this.f29608c.c() + " applyAndAckSettings", this, settings), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.tg0.c
        public final void a(int i4, long j4) {
            if (i4 == 0) {
                ng0 ng0Var = this.f29608c;
                synchronized (ng0Var) {
                    ng0Var.f29594x = ng0Var.j() + j4;
                    Intrinsics.checkNotNull(ng0Var, "null cannot be cast to non-null type java.lang.Object");
                    ng0Var.notifyAll();
                    Unit unit = Unit.f41027a;
                }
                return;
            }
            ug0 a4 = this.f29608c.a(i4);
            if (a4 != null) {
                synchronized (a4) {
                    a4.a(j4);
                    Unit unit2 = Unit.f41027a;
                }
            }
        }
    }

    public final void a(int i4, int i5, @NotNull okio.g source, boolean z4) {
        Intrinsics.checkNotNullParameter(source, "source");
        C3372e c3372e = new C3372e();
        long j4 = i5;
        source.O(j4);
        source.read(c3372e, j4);
        this.f29580j.a(new rg0(this.f29574d + b9.i.f15550d + i4 + "] onData", this, i4, c3372e, i5, z4), 0L);
    }

    public final void a(int i4, @NotNull List<af0> requestHeaders, boolean z4) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.f29580j.a(new d(this.f29574d + b9.i.f15550d + i4 + "] onHeaders", this, i4, requestHeaders, z4), 0L);
    }

    public final void a(int i4, @NotNull List<af0> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.f29570B.contains(Integer.valueOf(i4))) {
                c(i4, i50.f27091e);
                return;
            }
            this.f29570B.add(Integer.valueOf(i4));
            this.f29580j.a(new e(this.f29574d + b9.i.f15550d + i4 + "] onRequest", this, i4, requestHeaders), 0L);
        }
    }

    public final void a(int i4, @NotNull i50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.f29580j.a(new f(this.f29574d + b9.i.f15550d + i4 + "] onReset", this, i4, errorCode), 0L);
    }

    public final void a(@NotNull ox1 ox1Var) {
        Intrinsics.checkNotNullParameter(ox1Var, "<set-?>");
        this.f29590t = ox1Var;
    }

    public final void a(@NotNull i50 statusCode) {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.f29596z) {
            kotlin.jvm.internal.E e4 = new kotlin.jvm.internal.E();
            synchronized (this) {
                if (this.f29577g) {
                    return;
                }
                this.f29577g = true;
                int i4 = this.f29575e;
                e4.f41130b = i4;
                Unit unit = Unit.f41027a;
                this.f29596z.a(i4, statusCode, v82.f33550a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f29596z.b());
        r6 = r2;
        r8.f29593w += r6;
        r4 = kotlin.Unit.f41027a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(int i4, boolean z4, @Nullable C3372e c3372e, long j4) {
        int min;
        long j5;
        if (j4 == 0) {
            this.f29596z.a(z4, i4, c3372e, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j6 = this.f29593w;
                            long j7 = this.f29594x;
                            if (j6 < j7) {
                                break;
                            }
                            if (this.f29573c.containsKey(Integer.valueOf(i4))) {
                                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                                wait();
                            } else {
                                throw new IOException("stream closed");
                            }
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
            this.f29596z.a(z4 && j4 == 0, i4, c3372e, min);
        }
    }

    public final void a(int i4, int i5, boolean z4) {
        try {
            this.f29596z.a(i4, i5, z4);
        } catch (IOException e4) {
            i50 i50Var = i50.f27091e;
            a(i50Var, i50Var, e4);
        }
    }

    public final void a(int i4, long j4) {
        this.f29579i.a(new j(this.f29574d + b9.i.f15550d + i4 + "] windowUpdate", this, i4, j4), 0L);
    }
}
