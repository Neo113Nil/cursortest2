package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ht0 extends eb1 {

    /* renamed from: e, reason: collision with root package name */
    private final Context f6403e;

    /* renamed from: f, reason: collision with root package name */
    private final he1 f6404f;

    /* renamed from: g, reason: collision with root package name */
    private final String f6405g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6406h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f6407i;

    /* renamed from: j, reason: collision with root package name */
    private InputStream f6408j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6409k;

    /* renamed from: l, reason: collision with root package name */
    private Uri f6410l;

    /* renamed from: m, reason: collision with root package name */
    private volatile mq f6411m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f6412n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f6413o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f6414p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f6415q;

    /* renamed from: r, reason: collision with root package name */
    private long f6416r;

    /* renamed from: s, reason: collision with root package name */
    private cc3<Long> f6417s;

    /* renamed from: t, reason: collision with root package name */
    private final AtomicLong f6418t;

    /* renamed from: u, reason: collision with root package name */
    private final st0 f6419u;

    public ht0(Context context, he1 he1Var, String str, int i7, vt1 vt1Var, st0 st0Var, byte[] bArr) {
        super(false);
        this.f6403e = context;
        this.f6404f = he1Var;
        this.f6419u = st0Var;
        this.f6405g = str;
        this.f6406h = i7;
        this.f6412n = false;
        this.f6413o = false;
        this.f6414p = false;
        this.f6415q = false;
        this.f6416r = 0L;
        this.f6418t = new AtomicLong(-1L);
        this.f6417s = null;
        this.f6407i = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue();
        j(vt1Var);
    }

    private final boolean z() {
        if (!this.f6407i) {
            return false;
        }
        if (!((Boolean) sw.c().b(m10.S2)).booleanValue() || this.f6414p) {
            return ((Boolean) sw.c().b(m10.T2)).booleanValue() && !this.f6415q;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.fc1
    public final int a(byte[] bArr, int i7, int i8) {
        if (!this.f6409k) {
            throw new IOException("Attempt to read closed GcacheDataSource.");
        }
        InputStream inputStream = this.f6408j;
        int read = inputStream != null ? inputStream.read(bArr, i7, i8) : this.f6404f.a(bArr, i7, i8);
        if (!this.f6407i || this.f6408j != null) {
            o(read);
        }
        return read;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final Uri h() {
        return this.f6410l;
    }

    @Override // com.google.android.gms.internal.ads.he1
    public final void i() {
        if (!this.f6409k) {
            throw new IOException("Attempt to close an already closed GcacheDataSource.");
        }
        this.f6409k = false;
        this.f6410l = null;
        boolean z6 = (this.f6407i && this.f6408j == null) ? false : true;
        InputStream inputStream = this.f6408j;
        if (inputStream != null) {
            v3.j.a(inputStream);
            this.f6408j = null;
        } else {
            this.f6404f.i();
        }
        if (z6) {
            p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.he1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long k(li1 li1Var) {
        jq jqVar;
        boolean z6;
        boolean z7;
        long a7;
        yq yqVar;
        String str = "ms";
        if (this.f6409k) {
            throw new IOException("Attempt to open an already open GcacheDataSource.");
        }
        boolean z8 = true;
        this.f6409k = true;
        this.f6410l = li1Var.f7985a;
        if (!this.f6407i) {
            r(li1Var);
        }
        this.f6411m = mq.c(li1Var.f7985a);
        ?? r42 = -1;
        if (!((Boolean) sw.c().b(m10.P2)).booleanValue()) {
            if (this.f6411m != null) {
                this.f6411m.f8680m = li1Var.f7990f;
                this.f6411m.f8681n = b53.c(this.f6405g);
                this.f6411m.f8682o = this.f6406h;
                jqVar = y2.t.d().b(this.f6411m);
            } else {
                jqVar = null;
            }
            if (jqVar != null && jqVar.j()) {
                this.f6412n = jqVar.i();
                this.f6414p = jqVar.l();
                this.f6415q = jqVar.k();
                this.f6416r = jqVar.c();
                this.f6413o = true;
                if (!z()) {
                    this.f6408j = jqVar.h();
                    if (this.f6407i) {
                        r(li1Var);
                    }
                    return -1L;
                }
            }
        } else if (this.f6411m != null) {
            this.f6411m.f8680m = li1Var.f7990f;
            this.f6411m.f8681n = b53.c(this.f6405g);
            this.f6411m.f8682o = this.f6406h;
            long longValue = ((Long) sw.c().b(this.f6411m.f8679l ? m10.R2 : m10.Q2)).longValue();
            long a8 = y2.t.a().a();
            y2.t.e();
            Future<yq> a9 = xq.a(this.f6403e, this.f6411m);
            try {
                try {
                    yqVar = a9.get(longValue, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    th = th;
                    z8 = r42;
                }
            } catch (InterruptedException unused) {
                z7 = false;
            } catch (ExecutionException | TimeoutException unused2) {
                z6 = false;
            } catch (Throwable th2) {
                th = th2;
                z8 = false;
            }
            try {
                this.f6412n = yqVar.d();
                this.f6414p = yqVar.f();
                this.f6415q = yqVar.e();
                this.f6416r = yqVar.a();
            } catch (InterruptedException unused3) {
                z7 = true;
                a9.cancel(true);
                Thread.currentThread().interrupt();
                a7 = y2.t.a().a() - a8;
                this.f6419u.f11963a.e0(z7, a7);
                this.f6413o = z7;
                r42 = new StringBuilder(44);
                r42.append("Cache connection took ");
                r42.append(a7);
                r42.append("ms");
                str = r42.toString();
                a3.r1.k(str);
                this.f6413o = false;
                if (this.f6411m != null) {
                }
                return this.f6404f.k(li1Var);
            } catch (ExecutionException | TimeoutException unused4) {
                z6 = true;
                a9.cancel(true);
                a7 = y2.t.a().a() - a8;
                this.f6419u.f11963a.e0(z6, a7);
                this.f6413o = z6;
                r42 = new StringBuilder(44);
                r42.append("Cache connection took ");
                r42.append(a7);
                r42.append("ms");
                str = r42.toString();
                a3.r1.k(str);
                this.f6413o = false;
                if (this.f6411m != null) {
                }
                return this.f6404f.k(li1Var);
            } catch (Throwable th3) {
                th = th3;
                long a10 = y2.t.a().a() - a8;
                this.f6419u.f11963a.e0(z8, a10);
                this.f6413o = z8;
                StringBuilder sb = new StringBuilder(44);
                sb.append("Cache connection took ");
                sb.append(a10);
                sb.append(str);
                a3.r1.k(sb.toString());
                throw th;
            }
            if (!z()) {
                this.f6408j = yqVar.c();
                if (this.f6407i) {
                    r(li1Var);
                }
                long a11 = y2.t.a().a() - a8;
                this.f6419u.f11963a.e0(true, a11);
                this.f6413o = true;
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Cache connection took ");
                sb2.append(a11);
                sb2.append("ms");
                a3.r1.k(sb2.toString());
                return -1L;
            }
            long a12 = y2.t.a().a() - a8;
            this.f6419u.f11963a.e0(true, a12);
            this.f6413o = true;
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append("Cache connection took ");
            sb3.append(a12);
            sb3.append("ms");
            str = sb3.toString();
            a3.r1.k(str);
        }
        this.f6413o = false;
        if (this.f6411m != null) {
            li1Var = new li1(Uri.parse(this.f6411m.f8673f), null, li1Var.f7989e, li1Var.f7990f, li1Var.f7991g, null, li1Var.f7993i);
        }
        return this.f6404f.k(li1Var);
    }

    public final long s() {
        return this.f6416r;
    }

    public final long t() {
        if (this.f6411m == null) {
            return -1L;
        }
        if (this.f6418t.get() == -1) {
            synchronized (this) {
                if (this.f6417s == null) {
                    this.f6417s = wo0.f13894a.E(new Callable() { // from class: com.google.android.gms.internal.ads.gt0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return ht0.this.u();
                        }
                    });
                }
            }
            if (!this.f6417s.isDone()) {
                return -1L;
            }
            try {
                this.f6418t.compareAndSet(-1L, this.f6417s.get().longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f6418t.get();
    }

    final /* synthetic */ Long u() {
        return Long.valueOf(y2.t.d().a(this.f6411m));
    }

    public final boolean v() {
        return this.f6412n;
    }

    public final boolean w() {
        return this.f6415q;
    }

    public final boolean x() {
        return this.f6414p;
    }

    public final boolean y() {
        return this.f6413o;
    }
}
