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
public final class pr0 implements tl {

    /* renamed from: a, reason: collision with root package name */
    private final im<tl> f10336a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f10337b;

    /* renamed from: c, reason: collision with root package name */
    private final tl f10338c;

    /* renamed from: d, reason: collision with root package name */
    private final String f10339d;

    /* renamed from: e, reason: collision with root package name */
    private final int f10340e;

    /* renamed from: g, reason: collision with root package name */
    private InputStream f10342g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f10343h;

    /* renamed from: i, reason: collision with root package name */
    private Uri f10344i;

    /* renamed from: j, reason: collision with root package name */
    private volatile mq f10345j;

    /* renamed from: r, reason: collision with root package name */
    private final yr0 f10353r;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10346k = false;

    /* renamed from: l, reason: collision with root package name */
    private boolean f10347l = false;

    /* renamed from: m, reason: collision with root package name */
    private boolean f10348m = false;

    /* renamed from: n, reason: collision with root package name */
    private boolean f10349n = false;

    /* renamed from: o, reason: collision with root package name */
    private long f10350o = 0;

    /* renamed from: q, reason: collision with root package name */
    private final AtomicLong f10352q = new AtomicLong(-1);

    /* renamed from: p, reason: collision with root package name */
    private cc3<Long> f10351p = null;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f10341f = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue();

    /* JADX WARN: Multi-variable type inference failed */
    public pr0(Context context, Context context2, tl tlVar, String str, int i7, im<tl> imVar, yr0 yr0Var) {
        this.f10337b = context;
        this.f10338c = context2;
        this.f10336a = i7;
        this.f10353r = imVar;
        this.f10339d = tlVar;
        this.f10340e = str;
    }

    private final void m(vl vlVar) {
        im<tl> imVar = this.f10336a;
        if (imVar != null) {
            ((as0) imVar).k(this, vlVar);
        }
    }

    private final boolean n() {
        if (!this.f10341f) {
            return false;
        }
        if (!((Boolean) sw.c().b(m10.S2)).booleanValue() || this.f10348m) {
            return ((Boolean) sw.c().b(m10.T2)).booleanValue() && !this.f10349n;
        }
        return true;
    }

    public final long a() {
        return this.f10350o;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final Uri c() {
        return this.f10344i;
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final int d(byte[] bArr, int i7, int i8) {
        im<tl> imVar;
        if (!this.f10343h) {
            throw new IOException("Attempt to read closed CacheDataSource.");
        }
        InputStream inputStream = this.f10342g;
        int read = inputStream != null ? inputStream.read(bArr, i7, i8) : this.f10338c.d(bArr, i7, i8);
        if ((!this.f10341f || this.f10342g != null) && (imVar = this.f10336a) != null) {
            ((as0) imVar).i0(this, read);
        }
        return read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01e0  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.tl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long e(vl vlVar) {
        jq jqVar;
        boolean z6;
        boolean z7;
        long a7;
        yq yqVar;
        String str = "ms";
        if (this.f10343h) {
            throw new IOException("Attempt to open an already open CacheDataSource.");
        }
        boolean z8 = true;
        this.f10343h = true;
        this.f10344i = vlVar.f13430a;
        if (!this.f10341f) {
            m(vlVar);
        }
        this.f10345j = mq.c(vlVar.f13430a);
        ?? r42 = -1;
        if (!((Boolean) sw.c().b(m10.P2)).booleanValue()) {
            if (this.f10345j != null) {
                this.f10345j.f8680m = vlVar.f13432c;
                this.f10345j.f8681n = b53.c(this.f10339d);
                this.f10345j.f8682o = this.f10340e;
                jqVar = y2.t.d().b(this.f10345j);
            } else {
                jqVar = null;
            }
            if (jqVar != null && jqVar.j()) {
                this.f10346k = jqVar.i();
                this.f10348m = jqVar.l();
                this.f10349n = jqVar.k();
                this.f10350o = jqVar.c();
                this.f10347l = true;
                if (!n()) {
                    this.f10342g = jqVar.h();
                    if (this.f10341f) {
                        m(vlVar);
                    }
                    return -1L;
                }
            }
        } else if (this.f10345j != null) {
            this.f10345j.f8680m = vlVar.f13432c;
            this.f10345j.f8681n = b53.c(this.f10339d);
            this.f10345j.f8682o = this.f10340e;
            long longValue = ((Long) sw.c().b(this.f10345j.f8679l ? m10.R2 : m10.Q2)).longValue();
            long a8 = y2.t.a().a();
            y2.t.e();
            Future<yq> a9 = xq.a(this.f10337b, this.f10345j);
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
                this.f10346k = yqVar.d();
                this.f10348m = yqVar.f();
                this.f10349n = yqVar.e();
                this.f10350o = yqVar.a();
            } catch (InterruptedException unused3) {
                z7 = true;
                a9.cancel(true);
                Thread.currentThread().interrupt();
                a7 = y2.t.a().a() - a8;
                this.f10353r.f14794a.h0(z7, a7);
                this.f10347l = z7;
                r42 = new StringBuilder(44);
                r42.append("Cache connection took ");
                r42.append(a7);
                r42.append("ms");
                str = r42.toString();
                a3.r1.k(str);
                this.f10347l = false;
                if (this.f10345j != null) {
                }
                return this.f10338c.e(vlVar);
            } catch (ExecutionException | TimeoutException unused4) {
                z6 = true;
                a9.cancel(true);
                a7 = y2.t.a().a() - a8;
                this.f10353r.f14794a.h0(z6, a7);
                this.f10347l = z6;
                r42 = new StringBuilder(44);
                r42.append("Cache connection took ");
                r42.append(a7);
                r42.append("ms");
                str = r42.toString();
                a3.r1.k(str);
                this.f10347l = false;
                if (this.f10345j != null) {
                }
                return this.f10338c.e(vlVar);
            } catch (Throwable th3) {
                th = th3;
                long a10 = y2.t.a().a() - a8;
                this.f10353r.f14794a.h0(z8, a10);
                this.f10347l = z8;
                StringBuilder sb = new StringBuilder(44);
                sb.append("Cache connection took ");
                sb.append(a10);
                sb.append(str);
                a3.r1.k(sb.toString());
                throw th;
            }
            if (!n()) {
                this.f10342g = yqVar.c();
                if (this.f10341f) {
                    m(vlVar);
                }
                long a11 = y2.t.a().a() - a8;
                this.f10353r.f14794a.h0(true, a11);
                this.f10347l = true;
                StringBuilder sb2 = new StringBuilder(44);
                sb2.append("Cache connection took ");
                sb2.append(a11);
                sb2.append("ms");
                a3.r1.k(sb2.toString());
                return -1L;
            }
            long a12 = y2.t.a().a() - a8;
            this.f10353r.f14794a.h0(true, a12);
            this.f10347l = true;
            StringBuilder sb3 = new StringBuilder(44);
            sb3.append("Cache connection took ");
            sb3.append(a12);
            sb3.append("ms");
            str = sb3.toString();
            a3.r1.k(str);
        }
        this.f10347l = false;
        if (this.f10345j != null) {
            vlVar = new vl(Uri.parse(this.f10345j.f8673f), null, vlVar.f13431b, vlVar.f13432c, vlVar.f13433d, null, 0);
        }
        return this.f10338c.e(vlVar);
    }

    public final long f() {
        if (this.f10345j == null) {
            return -1L;
        }
        if (this.f10352q.get() == -1) {
            synchronized (this) {
                if (this.f10351p == null) {
                    this.f10351p = wo0.f13894a.E(new Callable() { // from class: com.google.android.gms.internal.ads.or0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return pr0.this.h();
                        }
                    });
                }
            }
            if (!this.f10351p.isDone()) {
                return -1L;
            }
            try {
                this.f10352q.compareAndSet(-1L, this.f10351p.get().longValue());
            } catch (InterruptedException | ExecutionException unused) {
                return -1L;
            }
        }
        return this.f10352q.get();
    }

    @Override // com.google.android.gms.internal.ads.tl
    public final void g() {
        if (!this.f10343h) {
            throw new IOException("Attempt to close an already closed CacheDataSource.");
        }
        this.f10343h = false;
        this.f10344i = null;
        InputStream inputStream = this.f10342g;
        if (inputStream == null) {
            this.f10338c.g();
        } else {
            v3.j.a(inputStream);
            this.f10342g = null;
        }
    }

    final /* synthetic */ Long h() {
        return Long.valueOf(y2.t.d().a(this.f10345j));
    }

    public final boolean i() {
        return this.f10346k;
    }

    public final boolean j() {
        return this.f10349n;
    }

    public final boolean k() {
        return this.f10348m;
    }

    public final boolean l() {
        return this.f10347l;
    }
}
