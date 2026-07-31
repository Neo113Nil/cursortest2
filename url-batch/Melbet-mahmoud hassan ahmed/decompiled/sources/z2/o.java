package z2;

import a3.g2;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.ar;
import com.google.android.gms.internal.ads.eg0;
import com.google.android.gms.internal.ads.eu0;
import com.google.android.gms.internal.ads.io0;
import com.google.android.gms.internal.ads.jb1;
import com.google.android.gms.internal.ads.m10;
import com.google.android.gms.internal.ads.pi1;
import com.google.android.gms.internal.ads.po0;
import com.google.android.gms.internal.ads.ru0;
import com.google.android.gms.internal.ads.rv0;
import com.google.android.gms.internal.ads.s33;
import com.google.android.gms.internal.ads.s60;
import com.google.android.gms.internal.ads.sw;
import com.google.android.gms.internal.ads.tv0;
import com.google.android.gms.internal.ads.u60;
import com.google.android.gms.internal.ads.vv0;
import com.google.android.gms.internal.ads.w42;
import com.google.android.gms.internal.ads.yg0;
import com.google.android.gms.internal.ads.yu;
import java.util.Collections;

/* loaded from: classes.dex */
public class o extends yg0 implements b {

    /* renamed from: z, reason: collision with root package name */
    static final int f23657z = Color.argb(0, 0, 0, 0);

    /* renamed from: f, reason: collision with root package name */
    protected final Activity f23658f;

    /* renamed from: g, reason: collision with root package name */
    AdOverlayInfoParcel f23659g;

    /* renamed from: h, reason: collision with root package name */
    eu0 f23660h;

    /* renamed from: i, reason: collision with root package name */
    k f23661i;

    /* renamed from: j, reason: collision with root package name */
    t f23662j;

    /* renamed from: l, reason: collision with root package name */
    FrameLayout f23664l;

    /* renamed from: m, reason: collision with root package name */
    WebChromeClient.CustomViewCallback f23665m;

    /* renamed from: p, reason: collision with root package name */
    j f23668p;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f23671s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f23672t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f23673u;

    /* renamed from: k, reason: collision with root package name */
    boolean f23663k = false;

    /* renamed from: n, reason: collision with root package name */
    boolean f23666n = false;

    /* renamed from: o, reason: collision with root package name */
    boolean f23667o = false;

    /* renamed from: q, reason: collision with root package name */
    boolean f23669q = false;

    /* renamed from: y, reason: collision with root package name */
    int f23677y = 1;

    /* renamed from: r, reason: collision with root package name */
    private final Object f23670r = new Object();

    /* renamed from: v, reason: collision with root package name */
    private boolean f23674v = false;

    /* renamed from: w, reason: collision with root package name */
    private boolean f23675w = false;

    /* renamed from: x, reason: collision with root package name */
    private boolean f23676x = true;

    public o(Activity activity) {
        this.f23658f = activity;
    }

    private final void v6(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        y2.j jVar;
        y2.j jVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23659g;
        boolean z6 = true;
        boolean z7 = false;
        boolean z8 = (adOverlayInfoParcel2 == null || (jVar2 = adOverlayInfoParcel2.f2423t) == null || !jVar2.f23414g) ? false : true;
        boolean o7 = y2.t.r().o(this.f23658f, configuration);
        if ((this.f23667o && !z8) || o7) {
            z6 = false;
        } else if (Build.VERSION.SDK_INT >= 19 && (adOverlayInfoParcel = this.f23659g) != null && (jVar = adOverlayInfoParcel.f2423t) != null && jVar.f23419l) {
            z7 = true;
        }
        Window window = this.f23658f.getWindow();
        if (((Boolean) sw.c().b(m10.S0)).booleanValue() && Build.VERSION.SDK_INT >= 19) {
            window.getDecorView().setSystemUiVisibility(z6 ? z7 ? 5894 : 5380 : 256);
            return;
        }
        if (!z6) {
            window.addFlags(2048);
            window.clearFlags(1024);
            return;
        }
        window.addFlags(1024);
        window.clearFlags(2048);
        if (Build.VERSION.SDK_INT < 19 || !z7) {
            return;
        }
        window.getDecorView().setSystemUiVisibility(4098);
    }

    private static final void w6(x3.a aVar, View view) {
        if (aVar == null || view == null) {
            return;
        }
        y2.t.i().l0(aVar, view);
    }

    public final void A6(boolean z6) {
        j jVar;
        int i7;
        if (z6) {
            jVar = this.f23668p;
            i7 = 0;
        } else {
            jVar = this.f23668p;
            i7 = -16777216;
        }
        jVar.setBackgroundColor(i7);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void L(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.f23666n);
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final boolean M() {
        this.f23677y = 1;
        if (this.f23660h == null) {
            return true;
        }
        if (((Boolean) sw.c().b(m10.A6)).booleanValue() && this.f23660h.canGoBack()) {
            this.f23660h.goBack();
            return false;
        }
        boolean d02 = this.f23660h.d0();
        if (!d02) {
            this.f23660h.t("onbackblocked", Collections.emptyMap());
        }
        return d02;
    }

    public final void N() {
        this.f23668p.removeView(this.f23662j);
        x6(true);
    }

    @Override // z2.b
    public final void O0() {
        this.f23677y = 2;
        this.f23658f.finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0071 A[Catch: i -> 0x00f5, TryCatch #0 {i -> 0x00f5, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0030, B:15:0x0038, B:16:0x0046, B:18:0x004d, B:21:0x005a, B:23:0x005e, B:25:0x0063, B:27:0x0071, B:29:0x0075, B:31:0x007b, B:32:0x007e, B:34:0x0084, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x0094, B:42:0x009a, B:43:0x009d, B:50:0x00cc, B:53:0x00d0, B:54:0x00d7, B:55:0x00d8, B:57:0x00dc, B:59:0x00e9, B:61:0x0054, B:63:0x0058, B:64:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:7:0x0017 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e9 A[Catch: i -> 0x00f5, TryCatch #0 {i -> 0x00f5, blocks: (B:8:0x0017, B:10:0x0025, B:12:0x002e, B:13:0x0030, B:15:0x0038, B:16:0x0046, B:18:0x004d, B:21:0x005a, B:23:0x005e, B:25:0x0063, B:27:0x0071, B:29:0x0075, B:31:0x007b, B:32:0x007e, B:34:0x0084, B:35:0x0087, B:37:0x008d, B:39:0x0091, B:40:0x0094, B:42:0x009a, B:43:0x009d, B:50:0x00cc, B:53:0x00d0, B:54:0x00d7, B:55:0x00d8, B:57:0x00dc, B:59:0x00e9, B:61:0x0054, B:63:0x0058, B:64:0x006d, B:65:0x00ed, B:66:0x00f4), top: B:7:0x0017 }] */
    @Override // com.google.android.gms.internal.ads.zg0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void P2(Bundle bundle) {
        int i7;
        this.f23658f.requestWindowFeature(1);
        this.f23666n = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            AdOverlayInfoParcel c7 = AdOverlayInfoParcel.c(this.f23658f.getIntent());
            this.f23659g = c7;
            if (c7 == null) {
                throw new i("Could not get info for ad overlay.");
            }
            if (c7.f2421r.f10303h > 7500000) {
                this.f23677y = 4;
            }
            if (this.f23658f.getIntent() != null) {
                this.f23676x = this.f23658f.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
            y2.j jVar = adOverlayInfoParcel.f2423t;
            if (jVar != null) {
                boolean z6 = jVar.f23413f;
                this.f23667o = z6;
                if (z6) {
                    if (adOverlayInfoParcel.f2419p != 5 && jVar.f23418k != -1) {
                        new n(this, null).b();
                    }
                }
                if (bundle == null) {
                    if (this.f23676x) {
                        jb1 jb1Var = this.f23659g.C;
                        if (jb1Var != null) {
                            jb1Var.g();
                        }
                        q qVar = this.f23659g.f2411h;
                        if (qVar != null) {
                            qVar.a();
                        }
                    }
                    AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23659g;
                    if (adOverlayInfoParcel2.f2419p != 1) {
                        yu yuVar = adOverlayInfoParcel2.f2410g;
                        if (yuVar != null) {
                            yuVar.M();
                        }
                        pi1 pi1Var = this.f23659g.D;
                        if (pi1Var != null) {
                            pi1Var.r();
                        }
                    }
                }
                Activity activity = this.f23658f;
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f23659g;
                j jVar2 = new j(activity, adOverlayInfoParcel3.f2422s, adOverlayInfoParcel3.f2421r.f10301f, adOverlayInfoParcel3.B);
                this.f23668p = jVar2;
                jVar2.setId(1000);
                y2.t.r().q(this.f23658f);
                AdOverlayInfoParcel adOverlayInfoParcel4 = this.f23659g;
                i7 = adOverlayInfoParcel4.f2419p;
                if (i7 == 1) {
                    u6(false);
                    return;
                }
                if (i7 == 2) {
                    this.f23661i = new k(adOverlayInfoParcel4.f2412i);
                    u6(false);
                    return;
                } else if (i7 == 3) {
                    u6(true);
                    return;
                } else {
                    if (i7 != 5) {
                        throw new i("Could not determine ad overlay type.");
                    }
                    u6(false);
                    return;
                }
            }
            if (adOverlayInfoParcel.f2419p == 5) {
                this.f23667o = true;
                if (adOverlayInfoParcel.f2419p != 5) {
                    new n(this, null).b();
                }
                if (bundle == null) {
                }
                Activity activity2 = this.f23658f;
                AdOverlayInfoParcel adOverlayInfoParcel32 = this.f23659g;
                j jVar22 = new j(activity2, adOverlayInfoParcel32.f2422s, adOverlayInfoParcel32.f2421r.f10301f, adOverlayInfoParcel32.B);
                this.f23668p = jVar22;
                jVar22.setId(1000);
                y2.t.r().q(this.f23658f);
                AdOverlayInfoParcel adOverlayInfoParcel42 = this.f23659g;
                i7 = adOverlayInfoParcel42.f2419p;
                if (i7 == 1) {
                }
            } else {
                this.f23667o = false;
                if (bundle == null) {
                }
                Activity activity22 = this.f23658f;
                AdOverlayInfoParcel adOverlayInfoParcel322 = this.f23659g;
                j jVar222 = new j(activity22, adOverlayInfoParcel322.f2422s, adOverlayInfoParcel322.f2421r.f10301f, adOverlayInfoParcel322.B);
                this.f23668p = jVar222;
                jVar222.setId(1000);
                y2.t.r().q(this.f23658f);
                AdOverlayInfoParcel adOverlayInfoParcel422 = this.f23659g;
                i7 = adOverlayInfoParcel422.f2419p;
                if (i7 == 1) {
                }
            }
        } catch (i e7) {
            io0.g(e7.getMessage());
            this.f23677y = 4;
            this.f23658f.finish();
        }
    }

    public final void a() {
        this.f23677y = 3;
        this.f23658f.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.f2419p != 5) {
            return;
        }
        this.f23658f.overridePendingTransition(0, 0);
    }

    protected final void b() {
        this.f23660h.K0();
    }

    final void c() {
        eu0 eu0Var;
        q qVar;
        if (this.f23675w) {
            return;
        }
        this.f23675w = true;
        eu0 eu0Var2 = this.f23660h;
        if (eu0Var2 != null) {
            this.f23668p.removeView(eu0Var2.c0());
            k kVar = this.f23661i;
            if (kVar != null) {
                this.f23660h.F0(kVar.f23653d);
                this.f23660h.Y(false);
                ViewGroup viewGroup = this.f23661i.f23652c;
                View c02 = this.f23660h.c0();
                k kVar2 = this.f23661i;
                viewGroup.addView(c02, kVar2.f23650a, kVar2.f23651b);
                this.f23661i = null;
            } else if (this.f23658f.getApplicationContext() != null) {
                this.f23660h.F0(this.f23658f.getApplicationContext());
            }
            this.f23660h = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f2411h) != null) {
            qVar.E(this.f23677y);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23659g;
        if (adOverlayInfoParcel2 == null || (eu0Var = adOverlayInfoParcel2.f2412i) == null) {
            return;
        }
        w6(eu0Var.i0(), this.f23659g.f2412i.c0());
    }

    public final void d() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel != null && this.f23663k) {
            z6(adOverlayInfoParcel.f2418o);
        }
        if (this.f23664l != null) {
            this.f23658f.setContentView(this.f23668p);
            this.f23673u = true;
            this.f23664l.removeAllViews();
            this.f23664l = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.f23665m;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.f23665m = null;
        }
        this.f23663k = false;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void d0(x3.a aVar) {
        v6((Configuration) x3.b.O0(aVar));
    }

    protected final void e0() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        q qVar;
        if (!this.f23658f.isFinishing() || this.f23674v) {
            return;
        }
        this.f23674v = true;
        eu0 eu0Var = this.f23660h;
        if (eu0Var != null) {
            eu0Var.t0(this.f23677y - 1);
            synchronized (this.f23670r) {
                if (!this.f23672t && this.f23660h.l0()) {
                    if (((Boolean) sw.c().b(m10.f8284q3)).booleanValue() && !this.f23675w && (adOverlayInfoParcel = this.f23659g) != null && (qVar = adOverlayInfoParcel.f2411h) != null) {
                        qVar.B3();
                    }
                    Runnable runnable = new Runnable() { // from class: z2.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            o.this.c();
                        }
                    };
                    this.f23671s = runnable;
                    g2.f72i.postDelayed(runnable, ((Long) sw.c().b(m10.L0)).longValue());
                    return;
                }
            }
        }
        c();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void f() {
        this.f23677y = 1;
    }

    public final void g() {
        this.f23668p.f23649g = true;
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void j5(int i7, int i8, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void k() {
        eu0 eu0Var = this.f23660h;
        if (eu0Var != null) {
            try {
                this.f23668p.removeView(eu0Var.c0());
            } catch (NullPointerException unused) {
            }
        }
        e0();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void l() {
        q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f2411h) != null) {
            qVar.o4();
        }
        v6(this.f23658f.getResources().getConfiguration());
        if (((Boolean) sw.c().b(m10.f8300s3)).booleanValue()) {
            return;
        }
        eu0 eu0Var = this.f23660h;
        if (eu0Var == null || eu0Var.s0()) {
            io0.g("The webview does not exist. Ignoring action.");
        } else {
            this.f23660h.onResume();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void m() {
        q qVar;
        d();
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel != null && (qVar = adOverlayInfoParcel.f2411h) != null) {
            qVar.k6();
        }
        if (!((Boolean) sw.c().b(m10.f8300s3)).booleanValue() && this.f23660h != null && (!this.f23658f.isFinishing() || this.f23661i == null)) {
            this.f23660h.onPause();
        }
        e0();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void n() {
    }

    public final void o() {
        if (this.f23669q) {
            this.f23669q = false;
            b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void p() {
        if (((Boolean) sw.c().b(m10.f8300s3)).booleanValue() && this.f23660h != null && (!this.f23658f.isFinishing() || this.f23661i == null)) {
            this.f23660h.onPause();
        }
        e0();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void q() {
        q qVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
        if (adOverlayInfoParcel == null || (qVar = adOverlayInfoParcel.f2411h) == null) {
            return;
        }
        qVar.b();
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void t() {
        if (((Boolean) sw.c().b(m10.f8300s3)).booleanValue()) {
            eu0 eu0Var = this.f23660h;
            if (eu0Var == null || eu0Var.s0()) {
                io0.g("The webview does not exist. Ignoring action.");
            } else {
                this.f23660h.onResume();
            }
        }
    }

    public final void t6(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.f23658f);
        this.f23664l = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        this.f23664l.addView(view, -1, -1);
        this.f23658f.setContentView(this.f23664l);
        this.f23673u = true;
        this.f23665m = customViewCallback;
        this.f23663k = true;
    }

    public final void u3() {
        synchronized (this.f23670r) {
            this.f23672t = true;
            Runnable runnable = this.f23671s;
            if (runnable != null) {
                s33 s33Var = g2.f72i;
                s33Var.removeCallbacks(runnable);
                s33Var.post(this.f23671s);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r27.f23658f.getResources().getConfiguration().orientation == 1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r27.f23669q = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r27.f23658f.getResources().getConfiguration().orientation == 2) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final void u6(boolean z6) {
        j jVar;
        int i7;
        if (!this.f23673u) {
            this.f23658f.requestWindowFeature(1);
        }
        Window window = this.f23658f.getWindow();
        if (window == null) {
            throw new i("Invalid activity, no window available.");
        }
        eu0 eu0Var = this.f23659g.f2412i;
        tv0 E0 = eu0Var != null ? eu0Var.E0() : null;
        boolean z7 = false;
        boolean z8 = E0 != null && E0.v();
        this.f23669q = false;
        if (z8) {
            int i8 = this.f23659g.f2418o;
            if (i8 != 6) {
                if (i8 == 7) {
                }
            }
        }
        StringBuilder sb = new StringBuilder(46);
        sb.append("Delay onShow to next orientation change: ");
        sb.append(z7);
        io0.b(sb.toString());
        z6(this.f23659g.f2418o);
        window.setFlags(16777216, 16777216);
        io0.b("Hardware acceleration on the AdActivity window enabled.");
        if (this.f23667o) {
            jVar = this.f23668p;
            i7 = f23657z;
        } else {
            jVar = this.f23668p;
            i7 = -16777216;
        }
        jVar.setBackgroundColor(i7);
        this.f23658f.setContentView(this.f23668p);
        this.f23673u = true;
        if (z6) {
            try {
                y2.t.A();
                Activity activity = this.f23658f;
                eu0 eu0Var2 = this.f23659g.f2412i;
                vv0 w6 = eu0Var2 != null ? eu0Var2.w() : null;
                eu0 eu0Var3 = this.f23659g.f2412i;
                String Q0 = eu0Var3 != null ? eu0Var3.Q0() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.f23659g;
                po0 po0Var = adOverlayInfoParcel.f2421r;
                eu0 eu0Var4 = adOverlayInfoParcel.f2412i;
                eu0 a7 = ru0.a(activity, w6, Q0, true, z8, null, null, po0Var, null, null, eu0Var4 != null ? eu0Var4.o() : null, ar.a(), null, null);
                this.f23660h = a7;
                tv0 E02 = a7.E0();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.f23659g;
                s60 s60Var = adOverlayInfoParcel2.f2424u;
                u60 u60Var = adOverlayInfoParcel2.f2413j;
                y yVar = adOverlayInfoParcel2.f2417n;
                eu0 eu0Var5 = adOverlayInfoParcel2.f2412i;
                E02.V(null, s60Var, null, u60Var, yVar, true, null, eu0Var5 != null ? eu0Var5.E0().g() : null, null, null, null, null, null, null, null, null);
                this.f23660h.E0().f1(new rv0() { // from class: z2.g
                    @Override // com.google.android.gms.internal.ads.rv0
                    public final void c(boolean z9) {
                        eu0 eu0Var6 = o.this.f23660h;
                        if (eu0Var6 != null) {
                            eu0Var6.K0();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.f23659g;
                String str = adOverlayInfoParcel3.f2420q;
                if (str != null) {
                    this.f23660h.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.f2416m;
                    if (str2 == null) {
                        throw new i("No URL or HTML to display in ad overlay.");
                    }
                    this.f23660h.loadDataWithBaseURL(adOverlayInfoParcel3.f2414k, str2, "text/html", "UTF-8", null);
                }
                eu0 eu0Var6 = this.f23659g.f2412i;
                if (eu0Var6 != null) {
                    eu0Var6.e1(this);
                }
            } catch (Exception e7) {
                io0.e("Error obtaining webview.", e7);
                throw new i("Could not obtain webview for the overlay.");
            }
        } else {
            eu0 eu0Var7 = this.f23659g.f2412i;
            this.f23660h = eu0Var7;
            eu0Var7.F0(this.f23658f);
        }
        this.f23660h.G(this);
        eu0 eu0Var8 = this.f23659g.f2412i;
        if (eu0Var8 != null) {
            w6(eu0Var8.i0(), this.f23668p);
        }
        if (this.f23659g.f2419p != 5) {
            ViewParent parent = this.f23660h.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f23660h.c0());
            }
            if (this.f23667o) {
                this.f23660h.H();
            }
            this.f23668p.addView(this.f23660h.c0(), -1, -1);
        }
        if (!z6 && !this.f23669q) {
            b();
        }
        AdOverlayInfoParcel adOverlayInfoParcel4 = this.f23659g;
        if (adOverlayInfoParcel4.f2419p == 5) {
            w42.v6(this.f23658f, this, adOverlayInfoParcel4.f2429z, adOverlayInfoParcel4.f2426w, adOverlayInfoParcel4.f2427x, adOverlayInfoParcel4.f2428y, adOverlayInfoParcel4.f2425v, adOverlayInfoParcel4.A);
            return;
        }
        x6(z8);
        if (this.f23660h.C0()) {
            y6(z8, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zg0
    public final void x() {
        this.f23673u = true;
    }

    public final void x6(boolean z6) {
        int intValue = ((Integer) sw.c().b(m10.f8315u3)).intValue();
        boolean z7 = ((Boolean) sw.c().b(m10.O0)).booleanValue() || z6;
        s sVar = new s();
        sVar.f23682d = 50;
        sVar.f23679a = true != z7 ? 0 : intValue;
        sVar.f23680b = true != z7 ? intValue : 0;
        sVar.f23681c = intValue;
        this.f23662j = new t(this.f23658f, sVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z7 ? 9 : 11);
        y6(z6, this.f23659g.f2415l);
        this.f23668p.addView(this.f23662j, layoutParams);
    }

    public final void y6(boolean z6, boolean z7) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        y2.j jVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        y2.j jVar2;
        boolean z8 = true;
        boolean z9 = ((Boolean) sw.c().b(m10.M0)).booleanValue() && (adOverlayInfoParcel2 = this.f23659g) != null && (jVar2 = adOverlayInfoParcel2.f2423t) != null && jVar2.f23420m;
        boolean z10 = ((Boolean) sw.c().b(m10.N0)).booleanValue() && (adOverlayInfoParcel = this.f23659g) != null && (jVar = adOverlayInfoParcel.f2423t) != null && jVar.f23421n;
        if (z6 && z7 && z9 && !z10) {
            new eg0(this.f23660h, "useCustomClose").c("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        t tVar = this.f23662j;
        if (tVar != null) {
            if (!z10 && (!z7 || z9)) {
                z8 = false;
            }
            tVar.b(z8);
        }
    }

    public final void z6(int i7) {
        if (this.f23658f.getApplicationInfo().targetSdkVersion >= ((Integer) sw.c().b(m10.f8309t4)).intValue()) {
            if (this.f23658f.getApplicationInfo().targetSdkVersion <= ((Integer) sw.c().b(m10.f8316u4)).intValue()) {
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= ((Integer) sw.c().b(m10.f8323v4)).intValue()) {
                    if (i8 <= ((Integer) sw.c().b(m10.f8330w4)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.f23658f.setRequestedOrientation(i7);
        } catch (Throwable th) {
            y2.t.p().r(th, "AdOverlay.setRequestedOrientation");
        }
    }
}
