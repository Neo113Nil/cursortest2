package com.yandex.mobile.ads.impl;

import W1.AbstractC1233c;
import com.ironsource.C1463f4;
import com.yandex.mobile.ads.impl.jh1;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.C3370c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class tn1 implements wm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final td1 f32515a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final pp1 f32516b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f32517c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final wn1 f32518d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final m50 f32519e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final c f32520f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f32521g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    private Object f32522h;

    /* renamed from: i, reason: collision with root package name */
    @Nullable
    private t50 f32523i;

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    private un1 f32524j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32525k;

    /* renamed from: l, reason: collision with root package name */
    @Nullable
    private r50 f32526l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f32527m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f32528n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f32529o;

    /* renamed from: p, reason: collision with root package name */
    private volatile boolean f32530p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    private volatile r50 f32531q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    private volatile un1 f32532r;

    public static final class b extends WeakReference<tn1> {

        /* renamed from: a, reason: collision with root package name */
        @Nullable
        private final Object f32536a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull tn1 referent, @Nullable Object obj) {
            super(referent);
            Intrinsics.checkNotNullParameter(referent, "referent");
            this.f32536a = obj;
        }

        @Nullable
        public final Object a() {
            return this.f32536a;
        }
    }

    public static final class c extends C3370c {
        c() {
        }

        @Override // okio.C3370c
        protected final void timedOut() {
            tn1.this.a();
        }
    }

    public tn1(@NotNull td1 client, @NotNull pp1 originalRequest, boolean z4) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(originalRequest, "originalRequest");
        this.f32515a = client;
        this.f32516b = originalRequest;
        this.f32517c = z4;
        this.f32518d = client.f().a();
        this.f32519e = client.k().a(this);
        c cVar = new c();
        cVar.timeout(0, TimeUnit.MILLISECONDS);
        this.f32520f = cVar;
        this.f32521g = new AtomicBoolean();
        this.f32529o = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String o() {
        return (this.f32530p ? "canceled " : "") + (this.f32517c ? "web socket" : "call") + " to " + this.f32516b.g().j();
    }

    @NotNull
    public final td1 c() {
        return this.f32515a;
    }

    public final Object clone() {
        return new tn1(this.f32515a, this.f32516b, this.f32517c);
    }

    @Nullable
    public final un1 d() {
        return this.f32524j;
    }

    @NotNull
    public final m50 e() {
        return this.f32519e;
    }

    public final boolean f() {
        return this.f32517c;
    }

    @Nullable
    public final r50 g() {
        return this.f32526l;
    }

    @NotNull
    public final pp1 h() {
        return this.f32516b;
    }

    @NotNull
    public final oq1 i() {
        ArrayList arrayList = new ArrayList();
        CollectionsKt.addAll(arrayList, this.f32515a.p());
        arrayList.add(new fr1(this.f32515a));
        arrayList.add(new C2099ml(this.f32515a.h()));
        this.f32515a.getClass();
        arrayList.add(new mm());
        arrayList.add(ar.f23420a);
        if (!this.f32517c) {
            CollectionsKt.addAll(arrayList, this.f32515a.q());
        }
        arrayList.add(new xm(this.f32517c));
        boolean z4 = false;
        try {
            try {
                oq1 a4 = new xn1(this, arrayList, 0, null, this.f32516b, this.f32515a.e(), this.f32515a.u(), this.f32515a.z()).a(this.f32516b);
                if (this.f32530p) {
                    v82.a((Closeable) a4);
                    throw new IOException("Canceled");
                }
                b((IOException) null);
                return a4;
            } catch (IOException e4) {
                z4 = true;
                IOException b4 = b(e4);
                Intrinsics.checkNotNull(b4, "null cannot be cast to non-null type kotlin.Throwable");
                throw b4;
            }
        } catch (Throwable th) {
            if (!z4) {
                b((IOException) null);
            }
            throw th;
        }
    }

    public final boolean j() {
        return this.f32530p;
    }

    @NotNull
    public final String k() {
        return this.f32516b.g().j();
    }

    @Nullable
    public final Socket l() {
        un1 un1Var = this.f32524j;
        Intrinsics.checkNotNull(un1Var);
        if (v82.f33555f && !Thread.holdsLock(un1Var)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + un1Var);
        }
        ArrayList b4 = un1Var.b();
        int size = b4.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                i4 = -1;
                break;
            }
            Object obj = b4.get(i5);
            i5++;
            if (Intrinsics.areEqual(((Reference) obj).get(), this)) {
                break;
            }
            i4++;
        }
        if (i4 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        b4.remove(i4);
        this.f32524j = null;
        if (b4.isEmpty()) {
            un1Var.a(System.nanoTime());
            if (this.f32518d.a(un1Var)) {
                return un1Var.m();
            }
        }
        return null;
    }

    public final boolean m() {
        t50 t50Var = this.f32523i;
        Intrinsics.checkNotNull(t50Var);
        return t50Var.b();
    }

    public final void n() {
        if (this.f32525k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f32525k = true;
        this.f32520f.exit();
    }

    public final void a(@NotNull un1 connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        if (!v82.f33555f || Thread.holdsLock(connection)) {
            if (this.f32524j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f32524j = connection;
            connection.b().add(new b(this, this.f32522h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    @NotNull
    public final oq1 b() {
        if (!this.f32521g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f32520f.enter();
        this.f32522h = jh1.f27655a.b();
        this.f32519e.getClass();
        Intrinsics.checkNotNullParameter(this, "call");
        try {
            this.f32515a.i().a(this);
            return i();
        } finally {
            this.f32515a.i().b(this);
        }
    }

    public final void a() {
        if (this.f32530p) {
            return;
        }
        this.f32530p = true;
        r50 r50Var = this.f32531q;
        if (r50Var != null) {
            r50Var.a();
        }
        un1 un1Var = this.f32532r;
        if (un1Var != null) {
            un1Var.a();
        }
        this.f32519e.getClass();
        Intrinsics.checkNotNullParameter(this, "call");
    }

    public final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final en f32533b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private volatile AtomicInteger f32534c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ tn1 f32535d;

        public a(tn1 tn1Var, @NotNull en responseCallback) {
            Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
            this.f32535d = tn1Var;
            this.f32533b = responseCallback;
            this.f32534c = new AtomicInteger(0);
        }

        public final void a(@NotNull ExecutorService executorService) {
            Intrinsics.checkNotNullParameter(executorService, "executorService");
            h10 i4 = this.f32535d.c().i();
            if (v82.f33555f && Thread.holdsLock(i4)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + i4);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e4) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e4);
                    this.f32535d.b(interruptedIOException);
                    this.f32533b.a(interruptedIOException);
                    this.f32535d.c().i().b(this);
                }
            } catch (Throwable th) {
                this.f32535d.c().i().b(this);
                throw th;
            }
        }

        @NotNull
        public final AtomicInteger b() {
            return this.f32534c;
        }

        @NotNull
        public final String c() {
            return this.f32535d.h().g().g();
        }

        @Override // java.lang.Runnable
        public final void run() {
            h10 i4;
            String str = "OkHttp " + this.f32535d.k();
            tn1 tn1Var = this.f32535d;
            Thread currentThread = Thread.currentThread();
            String name = currentThread.getName();
            currentThread.setName(str);
            try {
                tn1Var.f32520f.enter();
                boolean z4 = false;
                try {
                    try {
                    } catch (Throwable th) {
                        tn1Var.c().i().b(this);
                        throw th;
                    }
                } catch (IOException e4) {
                    e = e4;
                } catch (Throwable th2) {
                    th = th2;
                }
                try {
                    this.f32533b.a(tn1Var.i());
                    i4 = tn1Var.c().i();
                } catch (IOException e5) {
                    e = e5;
                    z4 = true;
                    if (z4) {
                        int i5 = jh1.f27657c;
                        jh1 a4 = jh1.a.a();
                        String str2 = "Callback failure for " + tn1Var.o();
                        a4.getClass();
                        jh1.a(4, str2, e);
                    } else {
                        this.f32533b.a(e);
                    }
                    i4 = tn1Var.c().i();
                    i4.b(this);
                } catch (Throwable th3) {
                    th = th3;
                    z4 = true;
                    tn1Var.a();
                    if (!z4) {
                        IOException iOException = new IOException("canceled due to " + th);
                        AbstractC1233c.a(iOException, th);
                        this.f32533b.a(iOException);
                    }
                    throw th;
                }
                i4.b(this);
            } finally {
                currentThread.setName(name);
            }
        }

        @NotNull
        public final tn1 a() {
            return this.f32535d;
        }

        public final void a(@NotNull a other) {
            Intrinsics.checkNotNullParameter(other, "other");
            this.f32534c = other.f32534c;
        }
    }

    @Nullable
    public final IOException b(@Nullable IOException iOException) {
        boolean z4;
        synchronized (this) {
            try {
                z4 = false;
                if (this.f32529o) {
                    this.f32529o = false;
                    if (!this.f32527m && !this.f32528n) {
                        z4 = true;
                    }
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z4 ? a((tn1) iOException) : iOException;
    }

    public final void a(@NotNull en responseCallback) {
        Intrinsics.checkNotNullParameter(responseCallback, "responseCallback");
        if (this.f32521g.compareAndSet(false, true)) {
            this.f32522h = jh1.f27655a.b();
            this.f32519e.getClass();
            Intrinsics.checkNotNullParameter(this, "call");
            this.f32515a.i().a(new a(this, responseCallback));
            return;
        }
        throw new IllegalStateException("Already Executed");
    }

    public final void b(@Nullable un1 un1Var) {
        this.f32532r = un1Var;
    }

    public final void a(@NotNull pp1 request, boolean z4) {
        SSLSocketFactory sSLSocketFactory;
        sd1 sd1Var;
        on onVar;
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f32526l == null) {
            synchronized (this) {
                if (!this.f32528n) {
                    if (!this.f32527m) {
                        Unit unit = Unit.f41027a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                }
            }
            if (z4) {
                wn1 wn1Var = this.f32518d;
                mh0 g4 = request.g();
                if (g4.h()) {
                    sSLSocketFactory = this.f32515a.x();
                    sd1Var = this.f32515a.o();
                    onVar = this.f32515a.d();
                } else {
                    sSLSocketFactory = null;
                    sd1Var = null;
                    onVar = null;
                }
                String g5 = g4.g();
                int i4 = g4.i();
                f30 j4 = this.f32515a.j();
                SocketFactory w4 = this.f32515a.w();
                InterfaceC2164ph s4 = this.f32515a.s();
                this.f32515a.getClass();
                this.f32523i = new t50(wn1Var, new C2202ra(g5, i4, j4, w4, sSLSocketFactory, sd1Var, onVar, s4, this.f32515a.r(), this.f32515a.g(), this.f32515a.t()), this, this.f32519e);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final void a(boolean z4) {
        r50 r50Var;
        synchronized (this) {
            if (this.f32529o) {
                Unit unit = Unit.f41027a;
            } else {
                throw new IllegalStateException("released");
            }
        }
        if (z4 && (r50Var = this.f32531q) != null) {
            r50Var.b();
        }
        this.f32526l = null;
    }

    @NotNull
    public final r50 a(@NotNull xn1 chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        synchronized (this) {
            if (this.f32529o) {
                if (!this.f32528n) {
                    if (!this.f32527m) {
                        Unit unit = Unit.f41027a;
                    } else {
                        throw new IllegalStateException("Check failed.");
                    }
                } else {
                    throw new IllegalStateException("Check failed.");
                }
            } else {
                throw new IllegalStateException("released");
            }
        }
        t50 t50Var = this.f32523i;
        Intrinsics.checkNotNull(t50Var);
        r50 r50Var = new r50(this, this.f32519e, t50Var, t50Var.a(this.f32515a, chain));
        this.f32526l = r50Var;
        this.f32531q = r50Var;
        synchronized (this) {
            this.f32527m = true;
            this.f32528n = true;
        }
        if (this.f32530p) {
            throw new IOException("Canceled");
        }
        return r50Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:42:0x0012, B:10:0x0021, B:12:0x0025, B:13:0x0027, B:15:0x002c, B:19:0x0035, B:21:0x0039, B:25:0x0042, B:7:0x001b), top: B:41:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <E extends IOException> E a(@NotNull r50 exchange, boolean z4, boolean z5, E e4) {
        boolean z6;
        boolean z7;
        boolean z8;
        Intrinsics.checkNotNullParameter(exchange, "exchange");
        if (Intrinsics.areEqual(exchange, this.f32531q)) {
            synchronized (this) {
                z6 = false;
                if (z4) {
                    try {
                        if (!this.f32527m) {
                        }
                        if (z4) {
                            this.f32527m = false;
                        }
                        if (z5) {
                            this.f32528n = false;
                        }
                        z8 = this.f32527m;
                        boolean z9 = z8 && !this.f32528n;
                        if (!z8 && !this.f32528n && !this.f32529o) {
                            z6 = true;
                        }
                        z7 = z6;
                        z6 = z9;
                        Unit unit = Unit.f41027a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (!z5 || !this.f32528n) {
                    z7 = false;
                    Unit unit2 = Unit.f41027a;
                }
                if (z4) {
                }
                if (z5) {
                }
                z8 = this.f32527m;
                if (z8) {
                }
                if (!z8) {
                    z6 = true;
                }
                z7 = z6;
                z6 = z9;
                Unit unit22 = Unit.f41027a;
            }
            if (z6) {
                this.f32531q = null;
                un1 un1Var = this.f32524j;
                if (un1Var != null) {
                    un1Var.g();
                }
            }
            if (z7) {
                return (E) a((tn1) e4);
            }
        }
        return e4;
    }

    private final <E extends IOException> E a(E e4) {
        E e5;
        Socket l4;
        boolean z4 = v82.f33555f;
        if (z4 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        un1 un1Var = this.f32524j;
        if (un1Var != null) {
            if (z4 && Thread.holdsLock(un1Var)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + un1Var);
            }
            synchronized (un1Var) {
                l4 = l();
            }
            if (this.f32524j == null) {
                if (l4 != null) {
                    v82.a(l4);
                }
                this.f32519e.getClass();
                m50.a(this, un1Var);
            } else if (l4 != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (!this.f32525k && this.f32520f.exit()) {
            e5 = new InterruptedIOException(C1463f4.f16211f);
            if (e4 != null) {
                e5.initCause(e4);
            }
        } else {
            e5 = e4;
        }
        if (e4 != null) {
            m50 m50Var = this.f32519e;
            Intrinsics.checkNotNull(e5);
            m50Var.getClass();
            m50.a(this, e5);
            return e5;
        }
        this.f32519e.getClass();
        m50.a((wm) this);
        return e5;
    }
}
