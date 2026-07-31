package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
final class yu0 extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, eu0 {

    /* renamed from: f0, reason: collision with root package name */
    public static final /* synthetic */ int f14801f0 = 0;
    private Boolean A;
    private boolean B;
    private final String C;
    private bv0 D;
    private boolean E;
    private boolean F;
    private a40 G;
    private y30 H;
    private np I;
    private int J;
    private int K;
    private y10 L;
    private final y10 M;
    private y10 N;
    private final z10 O;
    private int P;
    private int Q;
    private int R;
    private z2.o S;
    private boolean T;
    private final a3.p1 U;
    private int V;
    private int W;

    /* renamed from: a0, reason: collision with root package name */
    private int f14802a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f14803b0;

    /* renamed from: c0, reason: collision with root package name */
    private Map<String, ts0> f14804c0;

    /* renamed from: d0, reason: collision with root package name */
    private final WindowManager f14805d0;

    /* renamed from: e0, reason: collision with root package name */
    private final ar f14806e0;

    /* renamed from: f, reason: collision with root package name */
    private final uv0 f14807f;

    /* renamed from: g, reason: collision with root package name */
    private final gb f14808g;

    /* renamed from: h, reason: collision with root package name */
    private final m20 f14809h;

    /* renamed from: i, reason: collision with root package name */
    private final po0 f14810i;

    /* renamed from: j, reason: collision with root package name */
    private y2.l f14811j;

    /* renamed from: k, reason: collision with root package name */
    private final y2.a f14812k;

    /* renamed from: l, reason: collision with root package name */
    private final DisplayMetrics f14813l;

    /* renamed from: m, reason: collision with root package name */
    private final float f14814m;

    /* renamed from: n, reason: collision with root package name */
    private rr2 f14815n;

    /* renamed from: o, reason: collision with root package name */
    private ur2 f14816o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f14817p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14818q;

    /* renamed from: r, reason: collision with root package name */
    private lu0 f14819r;

    /* renamed from: s, reason: collision with root package name */
    private z2.o f14820s;

    /* renamed from: t, reason: collision with root package name */
    private x3.a f14821t;

    /* renamed from: u, reason: collision with root package name */
    private vv0 f14822u;

    /* renamed from: v, reason: collision with root package name */
    private final String f14823v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f14824w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f14825x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f14826y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f14827z;

    protected yu0(uv0 uv0Var, vv0 vv0Var, String str, boolean z6, boolean z7, gb gbVar, m20 m20Var, po0 po0Var, b20 b20Var, y2.l lVar, y2.a aVar, ar arVar, rr2 rr2Var, ur2 ur2Var) {
        super(uv0Var);
        ur2 ur2Var2;
        this.f14817p = false;
        this.f14818q = false;
        this.B = true;
        this.C = "";
        this.V = -1;
        this.W = -1;
        this.f14802a0 = -1;
        this.f14803b0 = -1;
        this.f14807f = uv0Var;
        this.f14822u = vv0Var;
        this.f14823v = str;
        this.f14826y = z6;
        this.f14808g = gbVar;
        this.f14809h = m20Var;
        this.f14810i = po0Var;
        this.f14811j = lVar;
        this.f14812k = aVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f14805d0 = windowManager;
        y2.t.q();
        DisplayMetrics g02 = a3.g2.g0(windowManager);
        this.f14813l = g02;
        this.f14814m = g02.density;
        this.f14806e0 = arVar;
        this.f14815n = rr2Var;
        this.f14816o = ur2Var;
        this.U = new a3.p1(uv0Var.a(), this, this, null);
        setBackgroundColor(0);
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e7) {
            io0.e("Unable to enable Javascript.", e7);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        settings.setUserAgentString(y2.t.q().L(uv0Var, po0Var.f10301f));
        y2.t.r().f(getContext(), settings);
        setDownloadListener(this);
        q1();
        if (v3.l.c()) {
            addJavascriptInterface(new fv0(this, new dv0(this), null), "googleAdsJsInterface");
        }
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        y1();
        z10 z10Var = new z10(new b20(true, "make_wv", this.f14823v));
        this.O = z10Var;
        z10Var.a().c(null);
        if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue() && (ur2Var2 = this.f14816o) != null && ur2Var2.f12947b != null) {
            z10Var.a().d("gqi", this.f14816o.f12947b);
        }
        z10Var.a();
        y10 f7 = b20.f();
        this.M = f7;
        z10Var.b("native:view_create", f7);
        this.N = null;
        this.L = null;
        y2.t.r().e(uv0Var);
        y2.t.p().p();
    }

    private final synchronized void q1() {
        rr2 rr2Var = this.f14815n;
        if (rr2Var != null && rr2Var.f11388k0) {
            io0.b("Disabling hardware acceleration on an overlay.");
            s1();
            return;
        }
        if (!this.f14826y && !this.f14822u.i()) {
            if (Build.VERSION.SDK_INT < 18) {
                io0.b("Disabling hardware acceleration on an AdView.");
                s1();
                return;
            } else {
                io0.b("Enabling hardware acceleration on an AdView.");
                u1();
                return;
            }
        }
        io0.b("Enabling hardware acceleration on an overlay.");
        u1();
    }

    private final synchronized void r1() {
        if (this.T) {
            return;
        }
        this.T = true;
        y2.t.p().o();
    }

    private final synchronized void s1() {
        if (!this.f14827z) {
            setLayerType(1, null);
        }
        this.f14827z = true;
    }

    private final void t1(boolean z6) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z6 ? "0" : "1");
        t("onAdVisibilityChanged", hashMap);
    }

    private final synchronized void u1() {
        if (this.f14827z) {
            setLayerType(0, null);
        }
        this.f14827z = false;
    }

    private final synchronized void v1(String str) {
        try {
            super.loadUrl("about:blank");
        } catch (Throwable th) {
            y2.t.p().s(th, "AdWebViewImpl.loadUrlUnsafe");
            io0.h("Could not call loadUrl in destroy(). ", th);
        }
    }

    private final void w1() {
        t10.a(this.O.a(), this.M, "aeh2");
    }

    private final synchronized void x1() {
        Map<String, ts0> map = this.f14804c0;
        if (map != null) {
            Iterator<ts0> it = map.values().iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
        this.f14804c0 = null;
    }

    private final void y1() {
        z10 z10Var = this.O;
        if (z10Var == null) {
            return;
        }
        b20 a7 = z10Var.a();
        r10 f7 = y2.t.p().f();
        if (f7 != null) {
            f7.f(a7);
        }
    }

    private final synchronized void z1() {
        Boolean k7 = y2.t.p().k();
        this.A = k7;
        if (k7 == null) {
            try {
                evaluateJavascript("(function(){})()", null);
                o1(Boolean.TRUE);
            } catch (IllegalStateException unused) {
                o1(Boolean.FALSE);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.vt0
    public final rr2 A() {
        return this.f14815n;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final cc3<String> A0() {
        m20 m20Var = this.f14809h;
        return m20Var == null ? rb3.i(null) : m20Var.a();
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final synchronized void B(String str, ts0 ts0Var) {
        if (this.f14804c0 == null) {
            this.f14804c0 = new HashMap();
        }
        this.f14804c0.put(str, ts0Var);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void B0(x3.a aVar) {
        this.f14821t = aVar;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized void C() {
        y30 y30Var = this.H;
        if (y30Var != null) {
            final qq1 qq1Var = (qq1) y30Var;
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.oq1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        qq1.this.g();
                    } catch (RemoteException e7) {
                        io0.i("#007 Could not call remote method.", e7);
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized boolean C0() {
        return this.f14824w;
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.cv0
    public final ur2 D() {
        return this.f14816o;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized ts0 D0(String str) {
        Map<String, ts0> map = this.f14804c0;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void E(z2.f fVar, boolean z6) {
        this.f14819r.b0(fVar, z6);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final /* synthetic */ tv0 E0() {
        return this.f14819r;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void F(boolean z6) {
        z2.o oVar;
        int i7 = this.J + (true != z6 ? -1 : 1);
        this.J = i7;
        if (i7 > 0 || (oVar = this.f14820s) == null) {
            return;
        }
        oVar.u3();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void F0(Context context) {
        this.f14807f.setBaseContext(context);
        this.U.e(this.f14807f.a());
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void G(z2.o oVar) {
        this.f14820s = oVar;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void G0(String str, t70<? super eu0> t70Var) {
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null) {
            lu0Var.r0(str, t70Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void H() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void H0(String str, t70<? super eu0> t70Var) {
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null) {
            lu0Var.b(str, t70Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.nv0
    public final gb I() {
        return this.f14808g;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void I0(int i7) {
        z2.o oVar = this.f14820s;
        if (oVar != null) {
            oVar.z6(i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final Context J() {
        return this.f14807f.b();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void J0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized np K() {
        return this.I;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void K0() {
        if (this.L == null) {
            t10.a(this.O.a(), this.M, "aes2");
            this.O.a();
            y10 f7 = b20.f();
            this.L = f7;
            this.O.b("native:view_show", f7);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14810i.f10301f);
        t("onshow", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final WebView L() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void L0(boolean z6) {
        z2.o oVar = this.f14820s;
        if (oVar != null) {
            oVar.y6(this.f14819r.v(), z6);
        } else {
            this.f14824w = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null) {
            lu0Var.M();
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void M0(int i7) {
        this.Q = i7;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void N(rr2 rr2Var, ur2 ur2Var) {
        this.f14815n = rr2Var;
        this.f14816o = ur2Var;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized boolean N0() {
        return this.f14826y;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void O(String str, v3.m<t70<? super eu0>> mVar) {
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null) {
            lu0Var.c(str, mVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean O0(final boolean z6, final int i7) {
        destroy();
        this.f14806e0.b(new zq() { // from class: com.google.android.gms.internal.ads.vu0
            @Override // com.google.android.gms.internal.ads.zq
            public final void a(ps psVar) {
                boolean z7 = z6;
                int i8 = i7;
                int i9 = yu0.f14801f0;
                wu F = xu.F();
                if (F.t() != z7) {
                    F.r(z7);
                }
                F.s(i8);
                psVar.A(F.o());
            }
        });
        this.f14806e0.c(10003);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized z2.o P() {
        return this.f14820s;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void P0() {
        if (this.N == null) {
            this.O.a();
            y10 f7 = b20.f();
            this.N = f7;
            this.O.b("native:view_load", f7);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized String Q0() {
        return this.f14823v;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void R(np npVar) {
        this.I = npVar;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void R0(boolean z6, int i7, String str, String str2, boolean z7) {
        this.f14819r.q0(z6, i7, str, str2, z7);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void S(String str, String str2, String str3) {
        String str4;
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        String[] strArr = new String[1];
        String str5 = (String) sw.c().b(m10.K);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("version", str5);
            jSONObject.put("sdk", "Google Mobile Ads");
            jSONObject.put("sdkVersion", "12.4.51-000");
            str4 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
        } catch (JSONException e7) {
            io0.h("Unable to build MRAID_ENV", e7);
            str4 = null;
        }
        strArr[0] = str4;
        super.loadDataWithBaseURL(str, lv0.a(str2, strArr), "text/html", "UTF-8", null);
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void S0(boolean z6, int i7, String str, boolean z7) {
        this.f14819r.p0(z6, i7, str, z7);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void T(int i7) {
        this.R = i7;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void U() {
        a3.r1.k("Destroying WebView!");
        r1();
        a3.g2.f72i.post(new xu0(this));
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void V0(a40 a40Var) {
        this.G = a40Var;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void W() {
        this.U.b();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void W0(boolean z6) {
        this.B = z6;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void X0(y30 y30Var) {
        this.H = y30Var;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void Y(boolean z6) {
        boolean z7 = this.f14826y;
        this.f14826y = z6;
        q1();
        if (z6 != z7) {
            if (!((Boolean) sw.c().b(m10.L)).booleanValue() || !this.f14822u.i()) {
                new eg0(this, "").g(true != z6 ? "default" : "expanded");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void Z(boolean z6) {
        this.f14819r.a(false);
    }

    @Override // y2.l
    public final synchronized void Z0() {
        y2.l lVar = this.f14811j;
        if (lVar != null) {
            lVar.Z0();
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void a(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        m1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void a0() {
        z2.o P = P();
        if (P != null) {
            P.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final boolean a1() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void b(String str) {
        throw null;
    }

    @Override // y2.l
    public final synchronized void b0() {
        y2.l lVar = this.f14811j;
        if (lVar != null) {
            lVar.b0();
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void b1(String str, JSONObject jSONObject) {
        a(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.pv0
    public final View c0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void c1(a3.x0 x0Var, o42 o42Var, wv1 wv1Var, xw2 xw2Var, String str, String str2, int i7) {
        this.f14819r.j0(x0Var, o42Var, wv1Var, xw2Var, str, str2, i7);
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int d() {
        return this.R;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized boolean d0() {
        return this.B;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void d1(boolean z6) {
        this.f14819r.X(z6);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final synchronized void destroy() {
        y1();
        this.U.a();
        z2.o oVar = this.f14820s;
        if (oVar != null) {
            oVar.a();
            this.f14820s.k();
            this.f14820s = null;
        }
        this.f14821t = null;
        this.f14819r.y0();
        this.I = null;
        this.f14811j = null;
        setOnClickListener(null);
        setOnTouchListener(null);
        if (this.f14825x) {
            return;
        }
        y2.t.z().l(this);
        x1();
        this.f14825x = true;
        if (!((Boolean) sw.c().b(m10.n7)).booleanValue()) {
            a3.r1.k("Destroying the WebView immediately...");
            U();
        } else {
            a3.r1.k("Initiating WebView self destruct sequence in 3...");
            a3.r1.k("Loading blank page in WebView, 2...");
            v1("about:blank");
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int e() {
        return this.Q;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void e1(z2.o oVar) {
        this.S = oVar;
    }

    @Override // android.webkit.WebView
    @TargetApi(19)
    public final synchronized void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        if (!s0()) {
            super.evaluateJavascript(str, valueCallback);
            return;
        }
        io0.i("#004 The webview is destroyed. Ignoring action.", null);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized int f() {
        return this.P;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized a40 f0() {
        return this.G;
    }

    protected final void finalize() {
        try {
            synchronized (this) {
                if (!this.f14825x) {
                    this.f14819r.y0();
                    y2.t.z().l(this);
                    x1();
                    r1();
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void g0() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int h() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void h0(vv0 vv0Var) {
        this.f14822u = vv0Var;
        requestLayout();
    }

    public final lu0 h1() {
        return this.f14819r;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final int i() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized x3.a i0() {
        return this.f14821t;
    }

    final synchronized Boolean i1() {
        return this.A;
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.gv0, com.google.android.gms.internal.ads.tq0
    public final Activity j() {
        return this.f14807f.a();
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized void j0(int i7) {
        this.P = i7;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void k0(boolean z6, long j7) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z6 ? "0" : "1");
        hashMap.put("duration", Long.toString(j7));
        t("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.ov0, com.google.android.gms.internal.ads.tq0
    public final po0 l() {
        return this.f14810i;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized boolean l0() {
        return this.J > 0;
    }

    @TargetApi(19)
    protected final synchronized void l1(String str, ValueCallback<String> valueCallback) {
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            evaluateJavascript(str, null);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final synchronized void loadData(String str, String str2, String str3) {
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadData(str, str2, str3);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final synchronized void loadUrl(String str) {
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            super.loadUrl(str);
        } catch (Throwable th) {
            y2.t.p().s(th, "AdWebViewImpl.loadUrl");
            io0.h("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final y10 m() {
        return this.M;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized void m0(boolean z6) {
        if (z6) {
            setBackgroundColor(0);
        }
        z2.o oVar = this.f14820s;
        if (oVar != null) {
            oVar.A6(z6);
        }
    }

    protected final void m1(String str) {
        if (!v3.l.e()) {
            n1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
            return;
        }
        if (i1() == null) {
            z1();
        }
        if (i1().booleanValue()) {
            l1(str, null);
        } else {
            n1(str.length() != 0 ? "javascript:".concat(str) : new String("javascript:"));
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final z10 n() {
        return this.O;
    }

    protected final synchronized void n1(String str) {
        if (s0()) {
            io0.g("#004 The webview is destroyed. Ignoring action.");
        } else {
            loadUrl(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final y2.a o() {
        return this.f14812k;
    }

    @Override // com.google.android.gms.internal.ads.zn
    public final void o0(xn xnVar) {
        boolean z6;
        synchronized (this) {
            z6 = xnVar.f14258j;
            this.E = z6;
        }
        t1(z6);
    }

    final void o1(Boolean bool) {
        synchronized (this) {
            this.A = bool;
        }
        y2.t.p().t(bool);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected final synchronized void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!s0()) {
            this.U.c();
        }
        boolean z6 = this.E;
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null && lu0Var.e()) {
            if (!this.F) {
                this.f14819r.y();
                this.f14819r.z();
                this.F = true;
            }
            p1();
            z6 = true;
        }
        t1(z6);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        lu0 lu0Var;
        synchronized (this) {
            if (!s0()) {
                this.U.d();
            }
            super.onDetachedFromWindow();
            if (this.F && (lu0Var = this.f14819r) != null && lu0Var.e() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                this.f14819r.y();
                this.f14819r.z();
                this.F = false;
            }
        }
        t1(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j7) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            y2.t.q();
            a3.g2.q(getContext(), intent);
        } catch (ActivityNotFoundException unused) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length());
            sb.append("Couldn't find an Activity to view url/mimetype: ");
            sb.append(str);
            sb.append(" / ");
            sb.append(str4);
            io0.b(sb.toString());
        }
    }

    @Override // android.webkit.WebView, android.view.View
    @TargetApi(21)
    protected final void onDraw(Canvas canvas) {
        if (s0()) {
            return;
        }
        if (Build.VERSION.SDK_INT == 21 && canvas.isHardwareAccelerated() && !isAttachedToWindow()) {
            return;
        }
        super.onDraw(canvas);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float axisValue = motionEvent.getAxisValue(9);
        float axisValue2 = motionEvent.getAxisValue(10);
        if (motionEvent.getActionMasked() == 8) {
            if (axisValue > 0.0f && !canScrollVertically(-1)) {
                return false;
            }
            if (axisValue < 0.0f && !canScrollVertically(1)) {
                return false;
            }
            if (axisValue2 > 0.0f && !canScrollHorizontally(-1)) {
                return false;
            }
            if (axisValue2 < 0.0f && !canScrollHorizontally(1)) {
                return false;
            }
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean p12 = p1();
        z2.o P = P();
        if (P == null || !p12) {
            return;
        }
        P.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01c7 A[Catch: all -> 0x01ed, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0088, B:46:0x0082, B:49:0x0095, B:51:0x009d, B:53:0x00af, B:56:0x00b6, B:58:0x00d2, B:59:0x00db, B:62:0x00d7, B:63:0x00e0, B:66:0x00e5, B:68:0x00ed, B:71:0x00f8, B:78:0x011e, B:80:0x0125, B:84:0x012d, B:86:0x013f, B:88:0x014d, B:97:0x0162, B:99:0x01af, B:100:0x01b3, B:102:0x01ba, B:107:0x01c7, B:109:0x01cd, B:110:0x01d0, B:112:0x01d4, B:113:0x01dd, B:119:0x01e8), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x013f A[Catch: all -> 0x01ed, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0088, B:46:0x0082, B:49:0x0095, B:51:0x009d, B:53:0x00af, B:56:0x00b6, B:58:0x00d2, B:59:0x00db, B:62:0x00d7, B:63:0x00e0, B:66:0x00e5, B:68:0x00ed, B:71:0x00f8, B:78:0x011e, B:80:0x0125, B:84:0x012d, B:86:0x013f, B:88:0x014d, B:97:0x0162, B:99:0x01af, B:100:0x01b3, B:102:0x01ba, B:107:0x01c7, B:109:0x01cd, B:110:0x01d0, B:112:0x01d4, B:113:0x01dd, B:119:0x01e8), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0162 A[Catch: all -> 0x01ed, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0008, B:9:0x000d, B:11:0x0013, B:13:0x0017, B:16:0x0021, B:18:0x0029, B:21:0x002e, B:23:0x0036, B:25:0x0048, B:28:0x004d, B:30:0x0054, B:33:0x005e, B:36:0x0063, B:39:0x0076, B:40:0x0088, B:46:0x0082, B:49:0x0095, B:51:0x009d, B:53:0x00af, B:56:0x00b6, B:58:0x00d2, B:59:0x00db, B:62:0x00d7, B:63:0x00e0, B:66:0x00e5, B:68:0x00ed, B:71:0x00f8, B:78:0x011e, B:80:0x0125, B:84:0x012d, B:86:0x013f, B:88:0x014d, B:97:0x0162, B:99:0x01af, B:100:0x01b3, B:102:0x01ba, B:107:0x01c7, B:109:0x01cd, B:110:0x01d0, B:112:0x01d4, B:113:0x01dd, B:119:0x01e8), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    @SuppressLint({"DrawAllocation"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized void onMeasure(int i7, int i8) {
        int i9;
        vv0 vv0Var;
        boolean z6;
        int i10 = 0;
        if (s0()) {
            setMeasuredDimension(0, 0);
            return;
        }
        if (!isInEditMode() && !this.f14826y && !this.f14822u.f()) {
            if (this.f14822u.h()) {
                super.onMeasure(i7, i8);
                return;
            }
            if (this.f14822u.j()) {
                if (((Boolean) sw.c().b(m10.f8321v2)).booleanValue()) {
                    super.onMeasure(i7, i8);
                    return;
                }
                bv0 p7 = p();
                float b7 = p7 != null ? p7.b() : 0.0f;
                if (b7 == 0.0f) {
                    super.onMeasure(i7, i8);
                    return;
                }
                int size = View.MeasureSpec.getSize(i7);
                int size2 = View.MeasureSpec.getSize(i8);
                int i11 = (int) (size2 * b7);
                int i12 = (int) (size / b7);
                if (size2 == 0) {
                    if (i12 != 0) {
                        i11 = (int) (i12 * b7);
                        i10 = size;
                        size2 = i12;
                        setMeasuredDimension(Math.min(i11, i10), Math.min(i12, size2));
                        return;
                    }
                    size2 = 0;
                }
                if (size != 0) {
                    i10 = size;
                } else if (i11 != 0) {
                    i12 = (int) (i11 / b7);
                    i10 = i11;
                }
                setMeasuredDimension(Math.min(i11, i10), Math.min(i12, size2));
                return;
            }
            if (this.f14822u.g()) {
                if (!((Boolean) sw.c().b(m10.f8349z2)).booleanValue() && v3.l.c()) {
                    G0("/contentHeight", new wu0(this));
                    m1("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f7 = this.f14813l.density;
                    int size3 = View.MeasureSpec.getSize(i7);
                    int i13 = this.K;
                    setMeasuredDimension(size3, i13 != -1 ? (int) (i13 * f7) : View.MeasureSpec.getSize(i8));
                    return;
                }
                super.onMeasure(i7, i8);
                return;
            }
            if (this.f14822u.i()) {
                DisplayMetrics displayMetrics = this.f14813l;
                setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                return;
            }
            int mode = View.MeasureSpec.getMode(i7);
            int size4 = View.MeasureSpec.getSize(i7);
            int mode2 = View.MeasureSpec.getMode(i8);
            int size5 = View.MeasureSpec.getSize(i8);
            if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                i9 = Integer.MAX_VALUE;
                int i14 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                vv0Var = this.f14822u;
                if (vv0Var.f13512c <= i9 && vv0Var.f13511b <= i14) {
                    z6 = false;
                    if (((Boolean) sw.c().b(m10.R3)).booleanValue()) {
                        vv0 vv0Var2 = this.f14822u;
                        int i15 = vv0Var2.f13512c;
                        float f8 = this.f14814m;
                        boolean z7 = ((float) i15) / f8 <= ((float) i9) / f8 && ((float) vv0Var2.f13511b) / f8 <= ((float) i14) / f8;
                        if (true == z6) {
                            z6 = z7;
                        }
                    }
                    if (z6) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.f14818q) {
                            this.f14806e0.c(10002);
                            this.f14818q = true;
                        }
                        vv0 vv0Var3 = this.f14822u;
                        setMeasuredDimension(vv0Var3.f13512c, vv0Var3.f13511b);
                        return;
                    }
                    vv0 vv0Var4 = this.f14822u;
                    int i16 = vv0Var4.f13512c;
                    float f9 = this.f14814m;
                    int i17 = vv0Var4.f13511b;
                    StringBuilder sb = new StringBuilder(103);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append((int) (i16 / f9));
                    sb.append("x");
                    sb.append((int) (i17 / f9));
                    sb.append(" dp, but only has ");
                    sb.append((int) (size4 / f9));
                    sb.append("x");
                    sb.append((int) (size5 / f9));
                    sb.append(" dp.");
                    io0.g(sb.toString());
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.f14817p) {
                        return;
                    }
                    this.f14806e0.c(10001);
                    this.f14817p = true;
                    return;
                }
                z6 = true;
                if (((Boolean) sw.c().b(m10.R3)).booleanValue()) {
                }
                if (z6) {
                }
            }
            i9 = size4;
            if (mode2 != Integer.MIN_VALUE) {
            }
            vv0Var = this.f14822u;
            if (vv0Var.f13512c <= i9) {
                z6 = false;
                if (((Boolean) sw.c().b(m10.R3)).booleanValue()) {
                }
                if (z6) {
                }
            }
            z6 = true;
            if (((Boolean) sw.c().b(m10.R3)).booleanValue()) {
            }
            if (z6) {
            }
        }
        super.onMeasure(i7, i8);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final void onPause() {
        if (s0()) {
            return;
        }
        try {
            super.onPause();
        } catch (Exception e7) {
            io0.e("Could not pause webview.", e7);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final void onResume() {
        if (s0()) {
            return;
        }
        try {
            super.onResume();
        } catch (Exception e7) {
            io0.e("Could not resume webview.", e7);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f14819r.e() || this.f14819r.d()) {
            gb gbVar = this.f14808g;
            if (gbVar != null) {
                gbVar.d(motionEvent);
            }
            m20 m20Var = this.f14809h;
            if (m20Var != null) {
                m20Var.b(motionEvent);
            }
        } else {
            synchronized (this) {
                a40 a40Var = this.G;
                if (a40Var != null) {
                    a40Var.b(motionEvent);
                }
            }
        }
        if (s0()) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final synchronized bv0 p() {
        return this.D;
    }

    @Override // com.google.android.gms.internal.ads.kv0
    public final void p0(boolean z6, int i7, boolean z7) {
        this.f14819r.k0(z6, i7, z7);
    }

    public final boolean p1() {
        int i7;
        int i8;
        if (!this.f14819r.v() && !this.f14819r.e()) {
            return false;
        }
        qw.b();
        DisplayMetrics displayMetrics = this.f14813l;
        int q7 = bo0.q(displayMetrics, displayMetrics.widthPixels);
        qw.b();
        DisplayMetrics displayMetrics2 = this.f14813l;
        int q8 = bo0.q(displayMetrics2, displayMetrics2.heightPixels);
        Activity a7 = this.f14807f.a();
        if (a7 == null || a7.getWindow() == null) {
            i7 = q7;
            i8 = q8;
        } else {
            y2.t.q();
            int[] u6 = a3.g2.u(a7);
            qw.b();
            int q9 = bo0.q(this.f14813l, u6[0]);
            qw.b();
            i8 = bo0.q(this.f14813l, u6[1]);
            i7 = q9;
        }
        int i9 = this.W;
        if (i9 == q7 && this.V == q8 && this.f14802a0 == i7 && this.f14803b0 == i8) {
            return false;
        }
        boolean z6 = (i9 == q7 && this.V == q8) ? false : true;
        this.W = q7;
        this.V = q8;
        this.f14802a0 = i7;
        this.f14803b0 = i8;
        new eg0(this, "").e(q7, q8, i7, i8, this.f14813l.density, this.f14805d0.getDefaultDisplay().getRotation());
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized String q() {
        ur2 ur2Var = this.f14816o;
        if (ur2Var == null) {
            return null;
        }
        return ur2Var.f12947b;
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        lu0 lu0Var = this.f14819r;
        if (lu0Var != null) {
            lu0Var.r();
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void s(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        io0.b(sb2.length() != 0 ? "Dispatching AFMA event: ".concat(sb2) : new String("Dispatching AFMA event: "));
        m1(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized boolean s0() {
        return this.f14825x;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.eu0
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof lu0) {
            this.f14819r = (lu0) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (s0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e7) {
            io0.e("Could not stop loading webview.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void t(String str, Map<String, ?> map) {
        try {
            s(str, y2.t.q().N(map));
        } catch (JSONException unused) {
            io0.g("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void t0(int i7) {
        if (i7 == 0) {
            t10.a(this.O.a(), this.M, "aebb2");
        }
        w1();
        this.O.a();
        this.O.a().d("close_type", String.valueOf(i7));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i7));
        hashMap.put("version", this.f14810i.f10301f);
        t("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final synchronized z2.o u() {
        return this.S;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final WebViewClient v() {
        return this.f14819r;
    }

    @Override // com.google.android.gms.internal.ads.eu0
    public final void v0() {
        w1();
        HashMap hashMap = new HashMap(1);
        hashMap.put("version", this.f14810i.f10301f);
        t("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.mv0
    public final synchronized vv0 w() {
        return this.f14822u;
    }

    @Override // com.google.android.gms.internal.ads.eu0, com.google.android.gms.internal.ads.tq0
    public final synchronized void x(bv0 bv0Var) {
        if (this.D != null) {
            io0.d("Attempt to create multiple AdWebViewVideoControllers.");
        } else {
            this.D = bv0Var;
        }
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final synchronized String y() {
        return this.C;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final hq0 y0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.tq0
    public final void z0(int i7) {
    }
}
