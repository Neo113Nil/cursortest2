package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import android.view.TextureView;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

@TargetApi(16)
/* loaded from: classes.dex */
public final class kr0 extends zp0 implements TextureView.SurfaceTextureListener, iq0 {
    private float A;

    /* renamed from: h, reason: collision with root package name */
    private final tq0 f7591h;

    /* renamed from: i, reason: collision with root package name */
    private final uq0 f7592i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f7593j;

    /* renamed from: k, reason: collision with root package name */
    private final sq0 f7594k;

    /* renamed from: l, reason: collision with root package name */
    private yp0 f7595l;

    /* renamed from: m, reason: collision with root package name */
    private Surface f7596m;

    /* renamed from: n, reason: collision with root package name */
    private jq0 f7597n;

    /* renamed from: o, reason: collision with root package name */
    private String f7598o;

    /* renamed from: p, reason: collision with root package name */
    private String[] f7599p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f7600q;

    /* renamed from: r, reason: collision with root package name */
    private int f7601r;

    /* renamed from: s, reason: collision with root package name */
    private rq0 f7602s;

    /* renamed from: t, reason: collision with root package name */
    private final boolean f7603t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f7604u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f7605v;

    /* renamed from: w, reason: collision with root package name */
    private int f7606w;

    /* renamed from: x, reason: collision with root package name */
    private int f7607x;

    /* renamed from: y, reason: collision with root package name */
    private int f7608y;

    /* renamed from: z, reason: collision with root package name */
    private int f7609z;

    public kr0(Context context, uq0 uq0Var, tq0 tq0Var, boolean z6, boolean z7, sq0 sq0Var) {
        super(context);
        this.f7601r = 1;
        this.f7593j = z7;
        this.f7591h = tq0Var;
        this.f7592i = uq0Var;
        this.f7603t = z6;
        this.f7594k = sq0Var;
        setSurfaceTextureListener(this);
        uq0Var.a(this);
    }

    private static String R(String str, Exception exc) {
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

    private final void S() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.L(true);
        }
    }

    private final void T() {
        if (this.f7604u) {
            return;
        }
        this.f7604u = true;
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.br0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.H();
            }
        });
        m();
        this.f7592i.b();
        if (this.f7605v) {
            s();
        }
    }

    private final void U(boolean z6) {
        String str;
        if ((this.f7597n != null && !z6) || this.f7598o == null || this.f7596m == null) {
            return;
        }
        if (z6) {
            if (!c0()) {
                str = "No valid ExoPlayerAdapter exists when switch source.";
                io0.g(str);
                return;
            } else {
                this.f7597n.P();
                W();
            }
        }
        if (this.f7598o.startsWith("cache:")) {
            ts0 D0 = this.f7591h.D0(this.f7598o);
            if (D0 instanceof ct0) {
                jq0 w6 = ((ct0) D0).w();
                this.f7597n = w6;
                if (!w6.Q()) {
                    str = "Precached video player has been released.";
                    io0.g(str);
                    return;
                }
            } else {
                if (!(D0 instanceof zs0)) {
                    String valueOf = String.valueOf(this.f7598o);
                    io0.g(valueOf.length() != 0 ? "Stream cache miss: ".concat(valueOf) : new String("Stream cache miss: "));
                    return;
                }
                zs0 zs0Var = (zs0) D0;
                String E = E();
                ByteBuffer y6 = zs0Var.y();
                boolean z7 = zs0Var.z();
                String w7 = zs0Var.w();
                if (w7 == null) {
                    str = "Stream cache URL is null.";
                    io0.g(str);
                    return;
                } else {
                    jq0 D = D();
                    this.f7597n = D;
                    D.C(new Uri[]{Uri.parse(w7)}, E, y6, z7);
                }
            }
        } else {
            this.f7597n = D();
            String E2 = E();
            Uri[] uriArr = new Uri[this.f7599p.length];
            int i7 = 0;
            while (true) {
                String[] strArr = this.f7599p;
                if (i7 >= strArr.length) {
                    break;
                }
                uriArr[i7] = Uri.parse(strArr[i7]);
                i7++;
            }
            this.f7597n.B(uriArr, E2);
        }
        this.f7597n.H(this);
        Y(this.f7596m, false);
        if (this.f7597n.Q()) {
            int U = this.f7597n.U();
            this.f7601r = U;
            if (U == 3) {
                T();
            }
        }
    }

    private final void V() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.L(false);
        }
    }

    private final void W() {
        if (this.f7597n != null) {
            Y(null, true);
            jq0 jq0Var = this.f7597n;
            if (jq0Var != null) {
                jq0Var.H(null);
                this.f7597n.D();
                this.f7597n = null;
            }
            this.f7601r = 1;
            this.f7600q = false;
            this.f7604u = false;
            this.f7605v = false;
        }
    }

    private final void X(float f7, boolean z6) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var == null) {
            io0.g("Trying to set volume before player is initialized.");
            return;
        }
        try {
            jq0Var.O(f7, z6);
        } catch (IOException e7) {
            io0.h("", e7);
        }
    }

    private final void Y(Surface surface, boolean z6) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var == null) {
            io0.g("Trying to set surface before player is initialized.");
            return;
        }
        try {
            jq0Var.N(surface, z6);
        } catch (IOException e7) {
            io0.h("", e7);
        }
    }

    private final void Z() {
        a0(this.f7606w, this.f7607x);
    }

    private final void a0(int i7, int i8) {
        float f7 = i8 > 0 ? i7 / i8 : 1.0f;
        if (this.A != f7) {
            this.A = f7;
            requestLayout();
        }
    }

    private final boolean b0() {
        return c0() && this.f7601r != 1;
    }

    private final boolean c0() {
        jq0 jq0Var = this.f7597n;
        return (jq0Var == null || !jq0Var.Q() || this.f7600q) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void A(int i7) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.G(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void B(int i7) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.I(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void C(int i7) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.J(i7);
        }
    }

    final jq0 D() {
        return this.f7594k.f11930m ? new ut0(this.f7591h.getContext(), this.f7594k, this.f7591h) : new as0(this.f7591h.getContext(), this.f7594k, this.f7591h);
    }

    final String E() {
        return y2.t.q().L(this.f7591h.getContext(), this.f7591h.l().f10301f);
    }

    final /* synthetic */ void F(String str) {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.a("ExoPlayerAdapter error", str);
        }
    }

    final /* synthetic */ void G() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.zza();
        }
    }

    final /* synthetic */ void H() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.d();
        }
    }

    final /* synthetic */ void I(boolean z6, long j7) {
        this.f7591h.k0(z6, j7);
    }

    final /* synthetic */ void J(String str) {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.z0("ExoPlayerAdapter exception", str);
        }
    }

    final /* synthetic */ void K() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.e();
        }
    }

    final /* synthetic */ void L() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.f();
        }
    }

    final /* synthetic */ void M() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.h();
        }
    }

    final /* synthetic */ void N(int i7, int i8) {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.c(i7, i8);
        }
    }

    final /* synthetic */ void O(int i7) {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.onWindowVisibilityChanged(i7);
        }
    }

    final /* synthetic */ void P() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.g();
        }
    }

    final /* synthetic */ void Q() {
        yp0 yp0Var = this.f7595l;
        if (yp0Var != null) {
            yp0Var.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void a(int i7) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.M(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void b(String str, Exception exc) {
        final String R = R("onLoadException", exc);
        io0.g(R.length() != 0 ? "ExoPlayerAdapter exception: ".concat(R) : new String("ExoPlayerAdapter exception: "));
        y2.t.p().r(exc, "AdExoPlayerView.onException");
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zq0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.J(R);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void c(final boolean z6, final long j7) {
        if (this.f7591h != null) {
            wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.ar0
                @Override // java.lang.Runnable
                public final void run() {
                    kr0.this.I(z6, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void d(int i7, int i8) {
        this.f7606w = i7;
        this.f7607x = i8;
        Z();
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void e(String str, Exception exc) {
        final String R = R(str, exc);
        io0.g(R.length() != 0 ? "ExoPlayerAdapter error: ".concat(R) : new String("ExoPlayerAdapter error: "));
        this.f7600q = true;
        if (this.f7594k.f11918a) {
            V();
        }
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.jr0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.F(R);
            }
        });
        y2.t.p().r(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void f(String str, String[] strArr) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f7599p = new String[]{str};
        } else {
            this.f7599p = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f7598o;
        boolean z6 = this.f7594k.f11931n && str2 != null && !str.equals(str2) && this.f7601r == 4;
        this.f7598o = str;
        U(z6);
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int g() {
        if (b0()) {
            return (int) this.f7597n.Z();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int h() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            return jq0Var.S();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int i() {
        if (b0()) {
            return (int) this.f7597n.a0();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int j() {
        return this.f7607x;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final int k() {
        return this.f7606w;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long l() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            return jq0Var.Y();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zp0, com.google.android.gms.internal.ads.wq0
    public final void m() {
        X(this.f15217g.a(), false);
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void n(int i7) {
        if (this.f7601r != i7) {
            this.f7601r = i7;
            if (i7 == 3) {
                T();
                return;
            }
            if (i7 != 4) {
                return;
            }
            if (this.f7594k.f11918a) {
                V();
            }
            this.f7592i.e();
            this.f15217g.c();
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.yq0
                @Override // java.lang.Runnable
                public final void run() {
                    kr0.this.G();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long o() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            return jq0Var.b0();
        }
        return -1L;
    }

    @Override // android.view.View
    protected final void onMeasure(int i7, int i8) {
        int i9;
        super.onMeasure(i7, i8);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f7 = this.A;
        if (f7 != 0.0f && this.f7602s == null) {
            float f8 = measuredWidth;
            float f9 = f8 / measuredHeight;
            if (f7 > f9) {
                measuredHeight = (int) (f8 / f7);
            }
            if (f7 < f9) {
                measuredWidth = (int) (measuredHeight * f7);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        rq0 rq0Var = this.f7602s;
        if (rq0Var != null) {
            rq0Var.b(measuredWidth, measuredHeight);
        }
        if (Build.VERSION.SDK_INT == 16) {
            int i10 = this.f7608y;
            if (((i10 > 0 && i10 != measuredWidth) || ((i9 = this.f7609z) > 0 && i9 != measuredHeight)) && this.f7593j && c0() && this.f7597n.Z() > 0 && !this.f7597n.R()) {
                X(0.0f, true);
                this.f7597n.K(true);
                long Z = this.f7597n.Z();
                long b7 = y2.t.a().b();
                while (c0() && this.f7597n.Z() == Z && y2.t.a().b() - b7 <= 250) {
                }
                this.f7597n.K(false);
                m();
            }
            this.f7608y = measuredWidth;
            this.f7609z = measuredHeight;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i7, int i8) {
        if (this.f7603t) {
            rq0 rq0Var = new rq0(getContext());
            this.f7602s = rq0Var;
            rq0Var.c(surfaceTexture, i7, i8);
            this.f7602s.start();
            SurfaceTexture a7 = this.f7602s.a();
            if (a7 != null) {
                surfaceTexture = a7;
            } else {
                this.f7602s.d();
                this.f7602s = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f7596m = surface;
        if (this.f7597n == null) {
            U(false);
        } else {
            Y(surface, true);
            if (!this.f7594k.f11918a) {
                S();
            }
        }
        if (this.f7606w == 0 || this.f7607x == 0) {
            a0(i7, i8);
        } else {
            Z();
        }
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.dr0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.L();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        r();
        rq0 rq0Var = this.f7602s;
        if (rq0Var != null) {
            rq0Var.d();
            this.f7602s = null;
        }
        if (this.f7597n != null) {
            V();
            Surface surface = this.f7596m;
            if (surface != null) {
                surface.release();
            }
            this.f7596m = null;
            Y(null, true);
        }
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.er0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.M();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i7, final int i8) {
        rq0 rq0Var = this.f7602s;
        if (rq0Var != null) {
            rq0Var.b(i7, i8);
        }
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.ir0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.N(i7, i8);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f7592i.f(this);
        this.f15216f.a(surfaceTexture, this.f7595l);
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(final int i7) {
        StringBuilder sb = new StringBuilder(57);
        sb.append("AdExoPlayerView3 window visibility changed to ");
        sb.append(i7);
        a3.r1.k(sb.toString());
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hr0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.O(i7);
            }
        });
        super.onWindowVisibilityChanged(i7);
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final long p() {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            return jq0Var.c0();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final String q() {
        String str = true != this.f7603t ? "" : " spherical";
        return str.length() != 0 ? "ExoPlayer/3".concat(str) : new String("ExoPlayer/3");
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void r() {
        if (b0()) {
            if (this.f7594k.f11918a) {
                V();
            }
            this.f7597n.K(false);
            this.f7592i.e();
            this.f15217g.c();
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.fr0
                @Override // java.lang.Runnable
                public final void run() {
                    kr0.this.P();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void s() {
        if (!b0()) {
            this.f7605v = true;
            return;
        }
        if (this.f7594k.f11918a) {
            S();
        }
        this.f7597n.K(true);
        this.f7592i.c();
        this.f15217g.b();
        this.f15216f.b();
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.gr0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.Q();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void t(int i7) {
        if (b0()) {
            this.f7597n.E(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void u(yp0 yp0Var) {
        this.f7595l = yp0Var;
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void v(String str) {
        if (str != null) {
            f(str, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void w() {
        if (c0()) {
            this.f7597n.P();
            W();
        }
        this.f7592i.e();
        this.f15217g.c();
        this.f7592i.d();
    }

    @Override // com.google.android.gms.internal.ads.iq0
    public final void x() {
        a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.cr0
            @Override // java.lang.Runnable
            public final void run() {
                kr0.this.K();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void y(float f7, float f8) {
        rq0 rq0Var = this.f7602s;
        if (rq0Var != null) {
            rq0Var.e(f7, f8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zp0
    public final void z(int i7) {
        jq0 jq0Var = this.f7597n;
        if (jq0Var != null) {
            jq0Var.F(i7);
        }
    }
}
