package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.Uri;
import java.io.IOException;

@TargetApi(16)
/* loaded from: classes.dex */
public final class ct0 extends ts0 implements iq0 {

    /* renamed from: i, reason: collision with root package name */
    private jq0 f3937i;

    /* renamed from: j, reason: collision with root package name */
    private String f3938j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f3939k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f3940l;

    /* renamed from: m, reason: collision with root package name */
    private ks0 f3941m;

    /* renamed from: n, reason: collision with root package name */
    private long f3942n;

    /* renamed from: o, reason: collision with root package name */
    private long f3943o;

    public ct0(tq0 tq0Var, sq0 sq0Var) {
        super(tq0Var);
        Context context = tq0Var.getContext();
        jq0 ut0Var = sq0Var.f11930m ? new ut0(context, sq0Var, this.f12369h.get()) : new as0(context, sq0Var, this.f12369h.get());
        this.f3937i = ut0Var;
        ut0Var.H(this);
    }

    private static String A(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        int length = String.valueOf(canonicalName).length();
        StringBuilder sb = new StringBuilder(str.length() + 2 + length + String.valueOf(message).length());
        sb.append(str);
        sb.append("/");
        sb.append(canonicalName);
        sb.append(":");
        sb.append(message);
        return sb.toString();
    }

    private final void B(long j7) {
        a3.g2.f72i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.bt0
            @Override // java.lang.Runnable
            public final void run() {
                ct0.this.y();
            }
        }, j7);
    }

    protected static final String z(String str) {
        String valueOf = String.valueOf(bo0.e(str));
        return valueOf.length() != 0 ? "cache:".concat(valueOf) : new String("cache:");
    }

    @Override // com.google.android.gms.internal.ads.ts0, p3.h
    public final void a() {
        jq0 jq0Var = this.f3937i;
        if (jq0Var != null) {
            jq0Var.H(null);
            this.f3937i.D();
        }
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void b(String str, Exception exc) {
        io0.h("Precache exception", exc);
        y2.t.p().r(exc, "VideoStreamExoPlayerCache.onException");
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void c(final boolean z6, final long j7) {
        final tq0 tq0Var = this.f12369h.get();
        if (tq0Var != null) {
            wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.at0
                @Override // java.lang.Runnable
                public final void run() {
                    tq0.this.k0(z6, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void d(int i7, int i8) {
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void e(String str, Exception exc) {
        io0.h("Precache error", exc);
        y2.t.p().r(exc, "VideoStreamExoPlayerCache.onError");
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void g() {
        synchronized (this) {
            this.f3939k = true;
            notify();
            a();
        }
        String str = this.f3938j;
        if (str != null) {
            h(this.f3938j, z(str), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void n(int i7) {
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void o(int i7) {
        this.f3937i.F(i7);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void q(int i7) {
        this.f3937i.G(i7);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void r(int i7) {
        this.f3937i.I(i7);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final void s(int i7) {
        this.f3937i.J(i7);
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final boolean t(String str) {
        return u(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v37 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.google.android.gms.internal.ads.ts0] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [int] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.StringBuilder] */
    @Override // com.google.android.gms.internal.ads.ts0
    public final boolean u(String str, String[] strArr) {
        ?? r62;
        String str2;
        ?? r52;
        long j7;
        long j8;
        long j9;
        ?? r12;
        long j10;
        String str3;
        long j11;
        long j12;
        long j13;
        ct0 ct0Var = this;
        String str4 = str;
        ct0Var.f3938j = str4;
        String z6 = z(str);
        String str5 = "error";
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            ct0Var.f3937i.B(uriArr, ct0Var.f12368g);
            tq0 tq0Var = ct0Var.f12369h.get();
            if (tq0Var != null) {
                tq0Var.B(z6, ct0Var);
            }
            v3.d a7 = y2.t.a();
            long b7 = a7.b();
            long longValue = ((Long) sw.c().b(m10.f8304t)).longValue();
            long longValue2 = ((Long) sw.c().b(m10.f8296s)).longValue() * 1000;
            long intValue = ((Integer) sw.c().b(m10.f8288r)).intValue();
            boolean booleanValue = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue();
            long j14 = -1;
            long j15 = intValue;
            while (true) {
                synchronized (this) {
                    try {
                        if (a7.b() - b7 > longValue2) {
                            long j16 = longValue2;
                            StringBuilder sb = new StringBuilder(47);
                            sb.append("Timeout reached. Limit: ");
                            sb.append(j16);
                            sb.append(" ms");
                            throw new IOException(sb.toString());
                        }
                        if (ct0Var.f3939k) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (ct0Var.f3940l) {
                            break;
                        }
                        if (!ct0Var.f3937i.Q()) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long a02 = ct0Var.f3937i.a0();
                        if (a02 > 0) {
                            long W = ct0Var.f3937i.W();
                            if (W != j14) {
                                try {
                                    j7 = j15;
                                    j13 = a02;
                                    j8 = longValue2;
                                    j10 = longValue;
                                    str3 = z6;
                                } catch (Throwable th) {
                                    th = th;
                                    r52 = this;
                                    r62 = str;
                                    str2 = z6;
                                }
                                try {
                                    m(str, z6, W, j13, W > 0, booleanValue ? ct0Var.f3937i.b0() : -1L, booleanValue ? ct0Var.f3937i.Y() : -1L, booleanValue ? ct0Var.f3937i.c0() : -1L, jq0.T(), jq0.V());
                                    j12 = W;
                                    j11 = a02;
                                    r62 = j13;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r52 = this;
                                    r62 = str;
                                    str2 = str3;
                                    try {
                                        throw th;
                                    } catch (Exception e7) {
                                        e = e7;
                                        String str6 = str5;
                                        String message = e.getMessage();
                                        ?? sb2 = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
                                        sb2.append("Failed to preload url ");
                                        sb2.append(r62);
                                        sb2.append(" Exception: ");
                                        sb2.append(message);
                                        io0.g(sb2.toString());
                                        y2.t.p().r(e, "VideoStreamExoPlayerCache.preload");
                                        a();
                                        r52.h(r62, str2, str6, A(str6, e));
                                        return false;
                                    }
                                }
                            } else {
                                j7 = j15;
                                j8 = longValue2;
                                j10 = longValue;
                                str3 = z6;
                                j11 = a02;
                                j12 = j14;
                                r62 = j15;
                            }
                            r52 = (W > j11 ? 1 : (W == j11 ? 0 : -1));
                            if (r52 >= 0) {
                                j(str, str3, j11);
                                break;
                            }
                            try {
                                ct0 ct0Var2 = this;
                                r62 = str;
                                str2 = str3;
                                if (ct0Var2.f3937i.X() >= j7 && W > 0) {
                                    break;
                                }
                                j9 = j10;
                                r12 = j12;
                                r52 = ct0Var2;
                            } catch (Throwable th3) {
                                th = th3;
                                throw th;
                            }
                        } else {
                            j7 = j15;
                            j8 = longValue2;
                            r62 = str4;
                            str2 = z6;
                            r52 = ct0Var;
                            j9 = longValue;
                            r12 = j14;
                        }
                        try {
                            try {
                                r52.wait(j9);
                            } catch (InterruptedException unused) {
                                throw new IOException("Wait interrupted.");
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str5 = r12;
                            throw th;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        r62 = str4;
                        str2 = z6;
                        r52 = ct0Var;
                    }
                }
                longValue = j9;
                ct0Var = r52;
                str4 = r62;
                z6 = str2;
                j15 = j7;
                longValue2 = j8;
                j14 = r12;
            }
            return true;
        } catch (Exception e8) {
            e = e8;
            r62 = str4;
            str2 = z6;
            r52 = ct0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.ts0
    public final boolean v(String str, String[] strArr, ks0 ks0Var) {
        this.f3938j = str;
        this.f3941m = ks0Var;
        String z6 = z(str);
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i7 = 0; i7 < strArr.length; i7++) {
                uriArr[i7] = Uri.parse(strArr[i7]);
            }
            this.f3937i.B(uriArr, this.f12368g);
            tq0 tq0Var = this.f12369h.get();
            if (tq0Var != null) {
                tq0Var.B(z6, this);
            }
            this.f3942n = y2.t.a().b();
            this.f3943o = -1L;
            B(0L);
            return true;
        } catch (Exception e7) {
            String message = e7.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length());
            sb.append("Failed to preload url ");
            sb.append(str);
            sb.append(" Exception: ");
            sb.append(message);
            io0.g(sb.toString());
            y2.t.p().r(e7, "VideoStreamExoPlayerCache.preload");
            a();
            h(str, z6, "error", A("error", e7));
            return false;
        }
    }

    public final jq0 w() {
        synchronized (this) {
            this.f3940l = true;
            notify();
        }
        this.f3937i.H(null);
        jq0 jq0Var = this.f3937i;
        this.f3937i = null;
        return jq0Var;
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void x() {
        io0.g("Precache onRenderedFirstFrame");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22, types: [com.google.android.gms.internal.ads.ct0, com.google.android.gms.internal.ads.ts0] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26, types: [com.google.android.gms.internal.ads.ct0] */
    /* JADX WARN: Type inference failed for: r2v30 */
    final /* synthetic */ void y() {
        String str;
        ct0 ct0Var;
        ct0 ct0Var2;
        k10 c7;
        long longValue;
        long intValue;
        ct0 ct0Var3;
        long j7;
        long j8;
        String str2;
        long j9;
        String z6 = z(this.f3938j);
        String str3 = "error";
        try {
            e10<Long> e10Var = m10.f8296s;
            c7 = sw.c();
            longValue = ((Long) c7.b(e10Var)).longValue() * 1000;
            intValue = ((Integer) sw.c().b(m10.f8288r)).intValue();
            ct0Var = ((Boolean) sw.c().b(m10.f8290r1)).booleanValue();
            try {
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e7) {
            e = e7;
            str = z6;
            ct0Var = this;
        }
        synchronized (this) {
            try {
                int i7 = ((y2.t.a().b() - this.f3942n) > longValue ? 1 : ((y2.t.a().b() - this.f3942n) == longValue ? 0 : -1));
                if (i7 <= 0) {
                    try {
                        if (this.f3939k) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (!this.f3940l) {
                            if (!this.f3937i.Q()) {
                                throw new IOException("ExoPlayer was released during preloading.");
                            }
                            long a02 = this.f3937i.a0();
                            if (a02 > 0) {
                                long W = this.f3937i.W();
                                if (W != this.f3943o) {
                                    try {
                                        j8 = intValue;
                                        str2 = z6;
                                        try {
                                            m(this.f3938j, z6, W, a02, W > 0, ct0Var != 0 ? this.f3937i.b0() : -1L, ct0Var != 0 ? this.f3937i.Y() : -1L, ct0Var != 0 ? this.f3937i.c0() : -1L, jq0.T(), jq0.V());
                                            ct0Var = this;
                                            j7 = W;
                                            try {
                                                ct0Var.f3943o = j7;
                                                j9 = a02;
                                                ct0Var = ct0Var;
                                            } catch (Throwable th2) {
                                                th = th2;
                                                str = str2;
                                                throw th;
                                            }
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ct0Var = this;
                                            str = str2;
                                            throw th;
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                        ct0Var = this;
                                        str = z6;
                                    }
                                } else {
                                    j7 = W;
                                    j8 = intValue;
                                    str2 = z6;
                                    ct0Var = this;
                                    j9 = a02;
                                }
                                if (j7 >= j9) {
                                    ct0Var.j(ct0Var.f3938j, str2, j9);
                                } else {
                                    long X = ct0Var.f3937i.X();
                                    ct0Var3 = ct0Var;
                                    if (X >= j8) {
                                        ct0Var3 = ct0Var;
                                        if (j7 > 0) {
                                        }
                                    }
                                }
                                ct0Var2 = ct0Var;
                            } else {
                                ct0Var3 = this;
                            }
                            ct0Var3.B(((Long) sw.c().b(m10.f8304t)).longValue());
                            return;
                        }
                        ct0Var2 = this;
                        y2.t.z().k(ct0Var2.f3941m);
                    } catch (Throwable th5) {
                        th = th5;
                        str3 = c7;
                        str = i7;
                    }
                } else {
                    str = z6;
                    ct0Var = this;
                    try {
                        StringBuilder sb = new StringBuilder(47);
                        sb.append("Timeout reached. Limit: ");
                        sb.append(longValue);
                        sb.append(" ms");
                        throw new IOException(sb.toString());
                    } catch (Throwable th6) {
                        th = th6;
                        str3 = "downloadTimeout";
                    }
                }
            } catch (Throwable th7) {
                th = th7;
                str = z6;
                ct0Var = this;
            }
            try {
                throw th;
            } catch (Exception e8) {
                e = e8;
                String str4 = str3;
                String str5 = ct0Var.f3938j;
                String message = e.getMessage();
                StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + String.valueOf(message).length());
                sb2.append("Failed to preload url ");
                sb2.append(str5);
                sb2.append(" Exception: ");
                sb2.append(message);
                io0.g(sb2.toString());
                y2.t.p().r(e, "VideoStreamExoPlayerCache.preload");
                a();
                ct0Var.h(ct0Var.f3938j, str, str4, A(str4, e));
                ct0Var2 = ct0Var;
                y2.t.z().k(ct0Var2.f3941m);
            }
        }
    }
}
