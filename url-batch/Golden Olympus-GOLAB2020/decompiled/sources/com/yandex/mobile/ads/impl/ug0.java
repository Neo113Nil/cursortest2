package com.yandex.mobile.ads.impl;

import com.ironsource.C1463f4;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okio.C3370c;
import okio.C3372e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ug0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f33098a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ng0 f33099b;

    /* renamed from: c, reason: collision with root package name */
    private long f33100c;

    /* renamed from: d, reason: collision with root package name */
    private long f33101d;

    /* renamed from: e, reason: collision with root package name */
    private long f33102e;

    /* renamed from: f, reason: collision with root package name */
    private long f33103f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final ArrayDeque<ff0> f33104g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f33105h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final b f33106i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final a f33107j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    private final c f33108k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final c f33109l;

    /* renamed from: m, reason: collision with root package name */
    @Nullable
    private i50 f33110m;

    /* renamed from: n, reason: collision with root package name */
    @Nullable
    private IOException f33111n;

    public final class b implements okio.B {

        /* renamed from: a, reason: collision with root package name */
        private final long f33116a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f33117b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final C3372e f33118c = new C3372e();

        /* renamed from: d, reason: collision with root package name */
        @NotNull
        private final C3372e f33119d = new C3372e();

        /* renamed from: e, reason: collision with root package name */
        private boolean f33120e;

        public b(long j4, boolean z4) {
            this.f33116a = j4;
            this.f33117b = z4;
        }

        public final boolean a() {
            return this.f33120e;
        }

        public final boolean b() {
            return this.f33117b;
        }

        public final void c() {
            this.f33117b = true;
        }

        @Override // okio.B, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            long l02;
            ug0 ug0Var = ug0.this;
            synchronized (ug0Var) {
                this.f33120e = true;
                l02 = this.f33119d.l0();
                this.f33119d.m();
                Intrinsics.checkNotNull(ug0Var, "null cannot be cast to non-null type java.lang.Object");
                ug0Var.notifyAll();
                Unit unit = Unit.f41027a;
            }
            if (l02 > 0) {
                a(l02);
            }
            ug0.this.a();
        }

        @Override // okio.B
        public final long read(@NotNull C3372e sink, long j4) {
            IOException iOException;
            boolean z4;
            long j5;
            Intrinsics.checkNotNullParameter(sink, "sink");
            long j6 = 0;
            if (j4 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j4).toString());
            }
            while (true) {
                ug0 ug0Var = ug0.this;
                synchronized (ug0Var) {
                    ug0Var.i().enter();
                    try {
                        if (ug0Var.d() != null) {
                            iOException = ug0Var.e();
                            if (iOException == null) {
                                i50 d4 = ug0Var.d();
                                Intrinsics.checkNotNull(d4);
                                iOException = new o22(d4);
                            }
                        } else {
                            iOException = null;
                        }
                        if (this.f33120e) {
                            throw new IOException("stream closed");
                        }
                        z4 = false;
                        if (this.f33119d.l0() > j6) {
                            C3372e c3372e = this.f33119d;
                            j5 = c3372e.read(sink, Math.min(j4, c3372e.l0()));
                            ug0Var.c(ug0Var.h() + j5);
                            long h4 = ug0Var.h() - ug0Var.g();
                            if (iOException == null && h4 >= ug0Var.c().g().b() / 2) {
                                ug0Var.c().a(ug0Var.f(), h4);
                                ug0Var.b(ug0Var.h());
                            }
                        } else {
                            if (!this.f33117b && iOException == null) {
                                ug0Var.t();
                                z4 = true;
                            }
                            j5 = -1;
                        }
                        ug0Var.i().a();
                        Unit unit = Unit.f41027a;
                    } finally {
                    }
                }
                if (!z4) {
                    if (j5 != -1) {
                        a(j5);
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
        @NotNull
        public final okio.C timeout() {
            return ug0.this.i();
        }

        public final void a(@NotNull okio.g source, long j4) {
            boolean z4;
            boolean z5;
            long j5;
            Intrinsics.checkNotNullParameter(source, "source");
            ug0 ug0Var = ug0.this;
            if (v82.f33555f && Thread.holdsLock(ug0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + ug0Var);
            }
            while (j4 > 0) {
                synchronized (ug0.this) {
                    z4 = this.f33117b;
                    z5 = this.f33119d.l0() + j4 > this.f33116a;
                    Unit unit = Unit.f41027a;
                }
                if (z5) {
                    source.H(j4);
                    ug0.this.a(i50.f27093g);
                    return;
                }
                if (z4) {
                    source.H(j4);
                    return;
                }
                long read = source.read(this.f33118c, j4);
                if (read == -1) {
                    throw new EOFException();
                }
                j4 -= read;
                ug0 ug0Var2 = ug0.this;
                synchronized (ug0Var2) {
                    try {
                        if (this.f33120e) {
                            j5 = this.f33118c.l0();
                            this.f33118c.m();
                        } else {
                            boolean z6 = this.f33119d.l0() == 0;
                            this.f33119d.F(this.f33118c);
                            if (z6) {
                                Intrinsics.checkNotNull(ug0Var2, "null cannot be cast to non-null type java.lang.Object");
                                ug0Var2.notifyAll();
                            }
                            j5 = 0;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (j5 > 0) {
                    a(j5);
                }
            }
        }

        private final void a(long j4) {
            ug0 ug0Var = ug0.this;
            if (v82.f33555f && Thread.holdsLock(ug0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + ug0Var);
            }
            ug0.this.c().b(j4);
        }
    }

    public final class c extends C3370c {
        public c() {
        }

        public final void a() {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.C3370c
        @NotNull
        protected final IOException newTimeoutException(@Nullable IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(C1463f4.f16211f);
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // okio.C3370c
        protected final void timedOut() {
            ug0.this.a(i50.f27095i);
            ug0.this.c().l();
        }
    }

    public ug0(int i4, @NotNull ng0 connection, boolean z4, boolean z5, @Nullable ff0 ff0Var) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.f33098a = i4;
        this.f33099b = connection;
        this.f33103f = connection.h().b();
        ArrayDeque<ff0> arrayDeque = new ArrayDeque<>();
        this.f33104g = arrayDeque;
        this.f33106i = new b(connection.g().b(), z5);
        this.f33107j = new a(z4);
        this.f33108k = new c();
        this.f33109l = new c();
        if (ff0Var == null) {
            if (!p()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (p()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(ff0Var);
        }
    }

    public final void a(long j4) {
        this.f33103f += j4;
        if (j4 > 0) {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        if (this.f33107j.a()) {
            throw new IOException("stream closed");
        }
        if (this.f33107j.b()) {
            throw new IOException("stream finished");
        }
        if (this.f33110m != null) {
            IOException iOException = this.f33111n;
            if (iOException != null) {
                throw iOException;
            }
            i50 i50Var = this.f33110m;
            Intrinsics.checkNotNull(i50Var);
            throw new o22(i50Var);
        }
    }

    @NotNull
    public final ng0 c() {
        return this.f33099b;
    }

    @Nullable
    public final synchronized i50 d() {
        return this.f33110m;
    }

    @Nullable
    public final IOException e() {
        return this.f33111n;
    }

    public final int f() {
        return this.f33098a;
    }

    public final long g() {
        return this.f33101d;
    }

    public final long h() {
        return this.f33100c;
    }

    @NotNull
    public final c i() {
        return this.f33108k;
    }

    @NotNull
    public final a j() {
        synchronized (this) {
            try {
                if (!this.f33105h && !p()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f33107j;
    }

    @NotNull
    public final a k() {
        return this.f33107j;
    }

    @NotNull
    public final b l() {
        return this.f33106i;
    }

    public final long m() {
        return this.f33103f;
    }

    public final long n() {
        return this.f33102e;
    }

    @NotNull
    public final c o() {
        return this.f33109l;
    }

    public final boolean p() {
        return this.f33099b.b() == ((this.f33098a & 1) == 1);
    }

    public final synchronized boolean q() {
        try {
            if (this.f33110m != null) {
                return false;
            }
            if (!this.f33106i.b()) {
                if (this.f33106i.a()) {
                }
                return true;
            }
            if (this.f33107j.b() || this.f33107j.a()) {
                if (this.f33105h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    @NotNull
    public final c r() {
        return this.f33108k;
    }

    @NotNull
    public final synchronized ff0 s() {
        ff0 removeFirst;
        this.f33108k.enter();
        while (this.f33104g.isEmpty() && this.f33110m == null) {
            try {
                t();
            } catch (Throwable th) {
                this.f33108k.a();
                throw th;
            }
        }
        this.f33108k.a();
        if (this.f33104g.isEmpty()) {
            IOException iOException = this.f33111n;
            if (iOException != null) {
                throw iOException;
            }
            i50 i50Var = this.f33110m;
            Intrinsics.checkNotNull(i50Var);
            throw new o22(i50Var);
        }
        removeFirst = this.f33104g.removeFirst();
        Intrinsics.checkNotNullExpressionValue(removeFirst, "removeFirst(...)");
        return removeFirst;
    }

    public final void t() {
        try {
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @NotNull
    public final c u() {
        return this.f33109l;
    }

    public final void c(long j4) {
        this.f33100c = j4;
    }

    public final void d(long j4) {
        this.f33102e = j4;
    }

    public final void a(@NotNull i50 rstStatusCode, @Nullable IOException iOException) {
        Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
        if (b(rstStatusCode, iOException)) {
            this.f33099b.b(this.f33098a, rstStatusCode);
        }
    }

    public final void a(@NotNull i50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (b(errorCode, null)) {
            this.f33099b.c(this.f33098a, errorCode);
        }
    }

    public final synchronized void b(@NotNull i50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f33110m == null) {
            this.f33110m = errorCode;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void a(@NotNull okio.g source, int i4) {
        Intrinsics.checkNotNullParameter(source, "source");
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        this.f33106i.a(source, i4);
    }

    public final void b(long j4) {
        this.f33101d = j4;
    }

    private final boolean b(i50 i50Var, IOException iOException) {
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f33110m != null) {
                return false;
            }
            if (this.f33106i.b() && this.f33107j.b()) {
                return false;
            }
            this.f33110m = i50Var;
            this.f33111n = iOException;
            Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            Unit unit = Unit.f41027a;
            this.f33099b.c(this.f33098a);
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051 A[Catch: all -> 0x0045, TryCatch #0 {all -> 0x0045, blocks: (B:10:0x0038, B:14:0x003f, B:16:0x0051, B:17:0x0056, B:24:0x0047), top: B:9:0x0038 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(@NotNull ff0 headers, boolean z4) {
        boolean q4;
        Intrinsics.checkNotNullParameter(headers, "headers");
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f33105h && z4) {
                    this.f33106i.getClass();
                    if (z4) {
                        this.f33106i.c();
                    }
                    q4 = q();
                    Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                    notifyAll();
                    Unit unit = Unit.f41027a;
                }
                this.f33105h = true;
                this.f33104g.add(headers);
                if (z4) {
                }
                q4 = q();
                Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                Unit unit2 = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (q4) {
            return;
        }
        this.f33099b.c(this.f33098a);
    }

    public final class a implements okio.z {

        /* renamed from: a, reason: collision with root package name */
        private boolean f33112a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final C3372e f33113b = new C3372e();

        /* renamed from: c, reason: collision with root package name */
        private boolean f33114c;

        public a(boolean z4) {
            this.f33112a = z4;
        }

        /* JADX WARN: Finally extract failed */
        private final void a(boolean z4) {
            long min;
            boolean z5;
            ug0 ug0Var = ug0.this;
            synchronized (ug0Var) {
                try {
                    ug0Var.o().enter();
                    while (ug0Var.n() >= ug0Var.m() && !this.f33112a && !this.f33114c && ug0Var.d() == null) {
                        try {
                            ug0Var.t();
                        } catch (Throwable th) {
                            ug0Var.o().a();
                            throw th;
                        }
                    }
                    ug0Var.o().a();
                    ug0Var.b();
                    min = Math.min(ug0Var.m() - ug0Var.n(), this.f33113b.l0());
                    ug0Var.d(ug0Var.n() + min);
                    z5 = z4 && min == this.f33113b.l0();
                    Unit unit = Unit.f41027a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ug0.this.o().enter();
            try {
                ug0.this.c().a(ug0.this.f(), z5, this.f33113b, min);
            } finally {
                ug0.this.o().a();
            }
        }

        public final boolean b() {
            return this.f33112a;
        }

        @Override // okio.z, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            ug0 ug0Var = ug0.this;
            if (v82.f33555f && Thread.holdsLock(ug0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + ug0Var);
            }
            ug0 ug0Var2 = ug0.this;
            synchronized (ug0Var2) {
                if (this.f33114c) {
                    return;
                }
                boolean z4 = ug0Var2.d() == null;
                Unit unit = Unit.f41027a;
                if (!ug0.this.k().f33112a) {
                    if (this.f33113b.l0() > 0) {
                        while (this.f33113b.l0() > 0) {
                            a(true);
                        }
                    } else if (z4) {
                        ug0.this.c().a(ug0.this.f(), true, (C3372e) null, 0L);
                    }
                }
                synchronized (ug0.this) {
                    this.f33114c = true;
                    Unit unit2 = Unit.f41027a;
                }
                ug0.this.c().flush();
                ug0.this.a();
            }
        }

        @Override // okio.z, java.io.Flushable
        public final void flush() {
            ug0 ug0Var = ug0.this;
            if (v82.f33555f && Thread.holdsLock(ug0Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + ug0Var);
            }
            ug0 ug0Var2 = ug0.this;
            synchronized (ug0Var2) {
                ug0Var2.b();
                Unit unit = Unit.f41027a;
            }
            while (this.f33113b.l0() > 0) {
                a(false);
                ug0.this.c().flush();
            }
        }

        @Override // okio.z
        @NotNull
        public final okio.C timeout() {
            return ug0.this.o();
        }

        @Override // okio.z
        public final void write(@NotNull C3372e source, long j4) {
            Intrinsics.checkNotNullParameter(source, "source");
            ug0 ug0Var = ug0.this;
            if (!v82.f33555f || !Thread.holdsLock(ug0Var)) {
                this.f33113b.write(source, j4);
                while (this.f33113b.l0() >= 16384) {
                    a(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + ug0Var);
            }
        }

        public final boolean a() {
            return this.f33114c;
        }
    }

    public final void a() {
        boolean z4;
        boolean q4;
        if (v82.f33555f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f33106i.b() || !this.f33106i.a() || (!this.f33107j.b() && !this.f33107j.a())) {
                    z4 = false;
                    q4 = q();
                    Unit unit = Unit.f41027a;
                }
                z4 = true;
                q4 = q();
                Unit unit2 = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z4) {
            if (q4) {
                return;
            }
            this.f33099b.c(this.f33098a);
        } else {
            i50 rstStatusCode = i50.f27095i;
            Intrinsics.checkNotNullParameter(rstStatusCode, "rstStatusCode");
            if (b(rstStatusCode, null)) {
                this.f33099b.b(this.f33098a, rstStatusCode);
            }
        }
    }
}
