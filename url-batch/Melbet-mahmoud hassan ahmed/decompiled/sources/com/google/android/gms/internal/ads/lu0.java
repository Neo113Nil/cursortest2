package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.TrafficStats;
import android.net.Uri;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public class lu0 extends WebViewClient implements tv0 {
    public static final /* synthetic */ int H = 0;
    private cy2 A;
    private boolean B;
    private boolean C;
    private int D;
    private boolean E;
    private final HashSet<String> F;
    private View.OnAttachStateChangeListener G;

    /* renamed from: f, reason: collision with root package name */
    private final eu0 f8072f;

    /* renamed from: g, reason: collision with root package name */
    private final ar f8073g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, List<t70<? super eu0>>> f8074h;

    /* renamed from: i, reason: collision with root package name */
    private final Object f8075i;

    /* renamed from: j, reason: collision with root package name */
    private yu f8076j;

    /* renamed from: k, reason: collision with root package name */
    private z2.q f8077k;

    /* renamed from: l, reason: collision with root package name */
    private rv0 f8078l;

    /* renamed from: m, reason: collision with root package name */
    private sv0 f8079m;

    /* renamed from: n, reason: collision with root package name */
    private s60 f8080n;

    /* renamed from: o, reason: collision with root package name */
    private u60 f8081o;

    /* renamed from: p, reason: collision with root package name */
    private pi1 f8082p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f8083q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f8084r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f8085s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f8086t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8087u;

    /* renamed from: v, reason: collision with root package name */
    private z2.y f8088v;

    /* renamed from: w, reason: collision with root package name */
    private dg0 f8089w;

    /* renamed from: x, reason: collision with root package name */
    private y2.b f8090x;

    /* renamed from: y, reason: collision with root package name */
    private yf0 f8091y;

    /* renamed from: z, reason: collision with root package name */
    protected ml0 f8092z;

    public lu0(eu0 eu0Var, ar arVar, boolean z6) {
        dg0 dg0Var = new dg0(eu0Var, eu0Var.J(), new v00(eu0Var.getContext()));
        this.f8074h = new HashMap<>();
        this.f8075i = new Object();
        this.f8073g = arVar;
        this.f8072f = eu0Var;
        this.f8085s = z6;
        this.f8089w = dg0Var;
        this.f8091y = null;
        this.F = new HashSet<>(Arrays.asList(((String) sw.c().b(m10.f8165b4)).split(",")));
    }

    private static WebResourceResponse f() {
        if (((Boolean) sw.c().b(m10.f8340y0)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    private final WebResourceResponse h(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i7 = 0;
            while (true) {
                i7++;
                if (i7 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                URLConnection openConnection = url.openConnection();
                openConnection.setConnectTimeout(10000);
                openConnection.setReadTimeout(10000);
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    openConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
                if (!(openConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                httpURLConnection = (HttpURLConnection) openConnection;
                y2.t.q().S(this.f8072f.getContext(), this.f8072f.l().f10301f, false, httpURLConnection, false, 60000);
                ho0 ho0Var = new ho0(null);
                ho0Var.c(httpURLConnection, null);
                int responseCode = httpURLConnection.getResponseCode();
                ho0Var.e(httpURLConnection, responseCode);
                if (responseCode < 300 || responseCode >= 400) {
                    break;
                }
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField == null) {
                    throw new IOException("Missing Location header in redirect");
                }
                if (headerField.startsWith("tel:")) {
                    return null;
                }
                URL url2 = new URL(url, headerField);
                String protocol = url2.getProtocol();
                if (protocol == null) {
                    io0.g("Protocol is null");
                    return f();
                }
                if (!protocol.equals("http") && !protocol.equals("https")) {
                    io0.g(protocol.length() != 0 ? "Unsupported scheme: ".concat(protocol) : new String("Unsupported scheme: "));
                    return f();
                }
                io0.b(headerField.length() != 0 ? "Redirecting to ".concat(headerField) : new String("Redirecting to "));
                httpURLConnection.disconnect();
                url = url2;
            }
            y2.t.q();
            return a3.g2.t(httpURLConnection);
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(Map<String, String> map, List<t70<? super eu0>> list, String str) {
        if (a3.r1.m()) {
            a3.r1.k(str.length() != 0 ? "Received GMSG: ".concat(str) : new String("Received GMSG: "));
            for (String str2 : map.keySet()) {
                String str3 = map.get(str2);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str3);
                a3.r1.k(sb.toString());
            }
        }
        Iterator<t70<? super eu0>> it = list.iterator();
        while (it.hasNext()) {
            it.next().a(this.f8072f, map);
        }
    }

    private final void q() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.G;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.f8072f).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(final View view, final ml0 ml0Var, final int i7) {
        if (!ml0Var.h() || i7 <= 0) {
            return;
        }
        ml0Var.c(view);
        if (ml0Var.h()) {
            a3.g2.f72i.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.gu0
                @Override // java.lang.Runnable
                public final void run() {
                    lu0.this.a0(view, ml0Var, i7);
                }
            }, 100L);
        }
    }

    private static final boolean t(boolean z6, eu0 eu0Var) {
        return (!z6 || eu0Var.w().i() || eu0Var.Q0().equals("interstitial_mb")) ? false : true;
    }

    protected final WebResourceResponse C(String str, Map<String, String> map) {
        jq b7;
        try {
            if (c30.f3707a.e().booleanValue() && this.A != null && "oda".equals(Uri.parse(str).getScheme())) {
                this.A.b(str);
                return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
            }
            String c7 = rm0.c(str, this.f8072f.getContext(), this.E);
            if (!c7.equals(str)) {
                return h(c7, map);
            }
            mq c8 = mq.c(Uri.parse(str));
            if (c8 != null && (b7 = y2.t.d().b(c8)) != null && b7.j()) {
                return new WebResourceResponse("", "", b7.h());
            }
            if (ho0.l() && y20.f14512b.e().booleanValue()) {
                return h(str, map);
            }
            return null;
        } catch (Exception | NoClassDefFoundError e7) {
            y2.t.p().s(e7, "AdWebViewClient.interceptRequest");
            return f();
        }
    }

    @Override // com.google.android.gms.internal.ads.yu
    public final void M() {
        yu yuVar = this.f8076j;
        if (yuVar != null) {
            yuVar.M();
        }
    }

    public final void T() {
        if (this.f8078l != null && ((this.B && this.D <= 0) || this.C || this.f8084r)) {
            if (((Boolean) sw.c().b(m10.f8290r1)).booleanValue() && this.f8072f.n() != null) {
                t10.a(this.f8072f.n().a(), this.f8072f.m(), "awfllc");
            }
            rv0 rv0Var = this.f8078l;
            boolean z6 = false;
            if (!this.C && !this.f8084r) {
                z6 = true;
            }
            rv0Var.c(z6);
            this.f8078l = null;
        }
        this.f8072f.P0();
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void T0(boolean z6) {
        synchronized (this.f8075i) {
            this.f8086t = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void V(yu yuVar, s60 s60Var, z2.q qVar, u60 u60Var, z2.y yVar, boolean z6, w70 w70Var, y2.b bVar, fg0 fg0Var, ml0 ml0Var, final o42 o42Var, final cy2 cy2Var, wv1 wv1Var, xw2 xw2Var, u70 u70Var, final pi1 pi1Var) {
        t70<eu0> t70Var;
        y2.b bVar2 = bVar == null ? new y2.b(this.f8072f.getContext(), ml0Var, null) : bVar;
        this.f8091y = new yf0(this.f8072f, fg0Var);
        this.f8092z = ml0Var;
        if (((Boolean) sw.c().b(m10.F0)).booleanValue()) {
            r0("/adMetadata", new r60(s60Var));
        }
        if (u60Var != null) {
            r0("/appEvent", new t60(u60Var));
        }
        r0("/backButton", s70.f11702j);
        r0("/refresh", s70.f11703k);
        r0("/canOpenApp", s70.f11694b);
        r0("/canOpenURLs", s70.f11693a);
        r0("/canOpenIntents", s70.f11695c);
        r0("/close", s70.f11696d);
        r0("/customClose", s70.f11697e);
        r0("/instrument", s70.f11706n);
        r0("/delayPageLoaded", s70.f11708p);
        r0("/delayPageClosed", s70.f11709q);
        r0("/getLocationInfo", s70.f11710r);
        r0("/log", s70.f11699g);
        r0("/mraid", new b80(bVar2, this.f8091y, fg0Var));
        dg0 dg0Var = this.f8089w;
        if (dg0Var != null) {
            r0("/mraidLoaded", dg0Var);
        }
        r0("/open", new f80(bVar2, this.f8091y, o42Var, wv1Var, xw2Var));
        r0("/precache", new us0());
        r0("/touch", s70.f11701i);
        r0("/video", s70.f11704l);
        r0("/videoMeta", s70.f11705m);
        if (o42Var == null || cy2Var == null) {
            r0("/click", s70.a(pi1Var));
            t70Var = s70.f11698f;
        } else {
            r0("/click", new t70() { // from class: com.google.android.gms.internal.ads.qs2
                @Override // com.google.android.gms.internal.ads.t70
                public final void a(Object obj, Map map) {
                    pi1 pi1Var2 = pi1.this;
                    cy2 cy2Var2 = cy2Var;
                    o42 o42Var2 = o42Var;
                    eu0 eu0Var = (eu0) obj;
                    s70.d(map, pi1Var2);
                    String str = (String) map.get("u");
                    if (str == null) {
                        io0.g("URL missing from click GMSG.");
                    } else {
                        rb3.r(s70.b(eu0Var, str), new ss2(eu0Var, cy2Var2, o42Var2), wo0.f13894a);
                    }
                }
            });
            t70Var = new t70() { // from class: com.google.android.gms.internal.ads.rs2
                @Override // com.google.android.gms.internal.ads.t70
                public final void a(Object obj, Map map) {
                    cy2 cy2Var2 = cy2.this;
                    o42 o42Var2 = o42Var;
                    vt0 vt0Var = (vt0) obj;
                    String str = (String) map.get("u");
                    if (str == null) {
                        io0.g("URL missing from httpTrack GMSG.");
                    } else if (vt0Var.A().f11380g0) {
                        o42Var2.i(new q42(y2.t.a().b(), ((cv0) vt0Var).D().f12947b, str, 2));
                    } else {
                        cy2Var2.b(str);
                    }
                }
            };
        }
        r0("/httpTrack", t70Var);
        if (y2.t.o().z(this.f8072f.getContext())) {
            r0("/logScionEvent", new z70(this.f8072f.getContext()));
        }
        if (w70Var != null) {
            r0("/setInterstitialProperties", new v70(w70Var, null));
        }
        if (u70Var != null) {
            if (((Boolean) sw.c().b(m10.A6)).booleanValue()) {
                r0("/inspectorNetworkExtras", u70Var);
            }
        }
        this.f8076j = yuVar;
        this.f8077k = qVar;
        this.f8080n = s60Var;
        this.f8081o = u60Var;
        this.f8088v = yVar;
        this.f8090x = bVar2;
        this.f8082p = pi1Var;
        this.f8083q = z6;
        this.A = cy2Var;
    }

    public final void X(boolean z6) {
        this.E = z6;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void Y0(sv0 sv0Var) {
        this.f8079m = sv0Var;
    }

    final /* synthetic */ void Z() {
        this.f8072f.W();
        z2.o P = this.f8072f.P();
        if (P != null) {
            P.N();
        }
    }

    public final void a(boolean z6) {
        this.f8083q = false;
    }

    final /* synthetic */ void a0(View view, ml0 ml0Var, int i7) {
        s(view, ml0Var, i7 - 1);
    }

    public final void b(String str, t70<? super eu0> t70Var) {
        synchronized (this.f8075i) {
            List<t70<? super eu0>> list = this.f8074h.get(str);
            if (list == null) {
                return;
            }
            list.remove(t70Var);
        }
    }

    public final void b0(z2.f fVar, boolean z6) {
        boolean N0 = this.f8072f.N0();
        boolean t6 = t(N0, this.f8072f);
        boolean z7 = true;
        if (!t6 && z6) {
            z7 = false;
        }
        o0(new AdOverlayInfoParcel(fVar, t6 ? null : this.f8076j, N0 ? null : this.f8077k, this.f8088v, this.f8072f.l(), this.f8072f, z7 ? null : this.f8082p));
    }

    public final void c(String str, v3.m<t70<? super eu0>> mVar) {
        synchronized (this.f8075i) {
            List<t70<? super eu0>> list = this.f8074h.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (t70<? super eu0> t70Var : list) {
                if (mVar.apply(t70Var)) {
                    arrayList.add(t70Var);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final boolean d() {
        boolean z6;
        synchronized (this.f8075i) {
            z6 = this.f8087u;
        }
        return z6;
    }

    public final boolean e() {
        boolean z6;
        synchronized (this.f8075i) {
            z6 = this.f8086t;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void e0() {
        synchronized (this.f8075i) {
            this.f8083q = false;
            this.f8085s = true;
            wo0.f13898e.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fu0
                @Override // java.lang.Runnable
                public final void run() {
                    lu0.this.Z();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void f1(rv0 rv0Var) {
        this.f8078l = rv0Var;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final y2.b g() {
        return this.f8090x;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void i() {
        ar arVar = this.f8073g;
        if (arVar != null) {
            arVar.c(10005);
        }
        this.C = true;
        T();
        this.f8072f.destroy();
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void j() {
        synchronized (this.f8075i) {
        }
        this.D++;
        T();
    }

    public final void j0(a3.x0 x0Var, o42 o42Var, wv1 wv1Var, xw2 xw2Var, String str, String str2, int i7) {
        eu0 eu0Var = this.f8072f;
        o0(new AdOverlayInfoParcel(eu0Var, eu0Var.l(), x0Var, o42Var, wv1Var, xw2Var, str, str2, i7));
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void k() {
        this.D--;
        T();
    }

    public final void k0(boolean z6, int i7, boolean z7) {
        boolean t6 = t(this.f8072f.N0(), this.f8072f);
        boolean z8 = true;
        if (!t6 && z7) {
            z8 = false;
        }
        yu yuVar = t6 ? null : this.f8076j;
        z2.q qVar = this.f8077k;
        z2.y yVar = this.f8088v;
        eu0 eu0Var = this.f8072f;
        o0(new AdOverlayInfoParcel(yuVar, qVar, yVar, eu0Var, z6, i7, eu0Var.l(), z8 ? null : this.f8082p));
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void l() {
        ml0 ml0Var = this.f8092z;
        if (ml0Var != null) {
            WebView L = this.f8072f.L();
            if (androidx.core.view.h.h(L)) {
                s(L, ml0Var, 10);
                return;
            }
            q();
            iu0 iu0Var = new iu0(this, ml0Var);
            this.G = iu0Var;
            ((View) this.f8072f).addOnAttachStateChangeListener(iu0Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void n0(Uri uri) {
        String path = uri.getPath();
        List<t70<? super eu0>> list = this.f8074h.get(path);
        if (path == null || list == null) {
            a3.r1.k("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
            if (!((Boolean) sw.c().b(m10.f8214h5)).booleanValue() || y2.t.p().f() == null) {
                return;
            }
            final String substring = (path == null || path.length() < 2) ? "null" : path.substring(1);
            wo0.f13894a.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.hu0
                @Override // java.lang.Runnable
                public final void run() {
                    String str = substring;
                    int i7 = lu0.H;
                    y2.t.p().f().e(str);
                }
            });
            return;
        }
        String encodedQuery = uri.getEncodedQuery();
        if (((Boolean) sw.c().b(m10.f8157a4)).booleanValue() && this.F.contains(path) && encodedQuery != null) {
            if (encodedQuery.length() >= ((Integer) sw.c().b(m10.f8173c4)).intValue()) {
                a3.r1.k(path.length() != 0 ? "Parsing gmsg query params on BG thread: ".concat(path) : new String("Parsing gmsg query params on BG thread: "));
                rb3.r(y2.t.q().J(uri), new ju0(this, list, path, uri), wo0.f13898e);
                return;
            }
        }
        y2.t.q();
        m(a3.g2.s(uri), list, path);
    }

    public final void o0(AdOverlayInfoParcel adOverlayInfoParcel) {
        z2.f fVar;
        yf0 yf0Var = this.f8091y;
        boolean l7 = yf0Var != null ? yf0Var.l() : false;
        y2.t.k();
        z2.p.a(this.f8072f.getContext(), adOverlayInfoParcel, !l7);
        ml0 ml0Var = this.f8092z;
        if (ml0Var != null) {
            String str = adOverlayInfoParcel.f2420q;
            if (str == null && (fVar = adOverlayInfoParcel.f2409f) != null) {
                str = fVar.f23637g;
            }
            ml0Var.Q(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        a3.r1.k(valueOf.length() != 0 ? "Loading resource: ".concat(valueOf) : new String("Loading resource: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            n0(parse);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        synchronized (this.f8075i) {
            if (this.f8072f.s0()) {
                a3.r1.k("Blank page loaded, 1...");
                this.f8072f.U();
                return;
            }
            this.B = true;
            sv0 sv0Var = this.f8079m;
            if (sv0Var != null) {
                sv0Var.zza();
                this.f8079m = null;
            }
            T();
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i7, String str, String str2) {
        this.f8084r = true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return this.f8072f.O0(renderProcessGoneDetail.didCrash(), renderProcessGoneDetail.rendererPriorityAtExit());
    }

    public final void p0(boolean z6, int i7, String str, boolean z7) {
        boolean N0 = this.f8072f.N0();
        boolean t6 = t(N0, this.f8072f);
        boolean z8 = true;
        if (!t6 && z7) {
            z8 = false;
        }
        yu yuVar = t6 ? null : this.f8076j;
        ku0 ku0Var = N0 ? null : new ku0(this.f8072f, this.f8077k);
        s60 s60Var = this.f8080n;
        u60 u60Var = this.f8081o;
        z2.y yVar = this.f8088v;
        eu0 eu0Var = this.f8072f;
        o0(new AdOverlayInfoParcel(yuVar, ku0Var, s60Var, u60Var, yVar, eu0Var, z6, i7, str, eu0Var.l(), z8 ? null : this.f8082p));
    }

    public final void q0(boolean z6, int i7, String str, String str2, boolean z7) {
        boolean N0 = this.f8072f.N0();
        boolean t6 = t(N0, this.f8072f);
        boolean z8 = true;
        if (!t6 && z7) {
            z8 = false;
        }
        yu yuVar = t6 ? null : this.f8076j;
        ku0 ku0Var = N0 ? null : new ku0(this.f8072f, this.f8077k);
        s60 s60Var = this.f8080n;
        u60 u60Var = this.f8081o;
        z2.y yVar = this.f8088v;
        eu0 eu0Var = this.f8072f;
        o0(new AdOverlayInfoParcel(yuVar, ku0Var, s60Var, u60Var, yVar, eu0Var, z6, i7, str, str2, eu0Var.l(), z8 ? null : this.f8082p));
    }

    @Override // com.google.android.gms.internal.ads.pi1
    public final void r() {
        pi1 pi1Var = this.f8082p;
        if (pi1Var != null) {
            pi1Var.r();
        }
    }

    public final void r0(String str, t70<? super eu0> t70Var) {
        synchronized (this.f8075i) {
            List<t70<? super eu0>> list = this.f8074h.get(str);
            if (list == null) {
                list = new CopyOnWriteArrayList<>();
                this.f8074h.put(str, list);
            }
            list.add(t70Var);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return C(str, Collections.emptyMap());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String valueOf = String.valueOf(str);
        a3.r1.k(valueOf.length() != 0 ? "AdWebView shouldOverrideUrlLoading: ".concat(valueOf) : new String("AdWebView shouldOverrideUrlLoading: "));
        Uri parse = Uri.parse(str);
        if ("gmsg".equalsIgnoreCase(parse.getScheme()) && "mobileads.google.com".equalsIgnoreCase(parse.getHost())) {
            n0(parse);
        } else {
            if (this.f8083q && webView == this.f8072f.L()) {
                String scheme = parse.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    yu yuVar = this.f8076j;
                    if (yuVar != null) {
                        yuVar.M();
                        ml0 ml0Var = this.f8092z;
                        if (ml0Var != null) {
                            ml0Var.Q(str);
                        }
                        this.f8076j = null;
                    }
                    pi1 pi1Var = this.f8082p;
                    if (pi1Var != null) {
                        pi1Var.r();
                        this.f8082p = null;
                    }
                    return super.shouldOverrideUrlLoading(webView, str);
                }
            }
            if (this.f8072f.L().willNotDraw()) {
                String valueOf2 = String.valueOf(str);
                io0.g(valueOf2.length() != 0 ? "AdWebView unable to handle URL: ".concat(valueOf2) : new String("AdWebView unable to handle URL: "));
            } else {
                try {
                    gb I = this.f8072f.I();
                    if (I != null && I.f(parse)) {
                        Context context = this.f8072f.getContext();
                        eu0 eu0Var = this.f8072f;
                        parse = I.a(parse, context, (View) eu0Var, eu0Var.j());
                    }
                } catch (hb unused) {
                    String valueOf3 = String.valueOf(str);
                    io0.g(valueOf3.length() != 0 ? "Unable to append parameter to URL: ".concat(valueOf3) : new String("Unable to append parameter to URL: "));
                }
                y2.b bVar = this.f8090x;
                if (bVar == null || bVar.c()) {
                    b0(new z2.f("android.intent.action.VIEW", parse.toString(), null, null, null, null, null, null), true);
                } else {
                    this.f8090x.b(str);
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void u0(boolean z6) {
        synchronized (this.f8075i) {
            this.f8087u = z6;
        }
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final boolean v() {
        boolean z6;
        synchronized (this.f8075i) {
            z6 = this.f8085s;
        }
        return z6;
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void w0(int i7, int i8, boolean z6) {
        dg0 dg0Var = this.f8089w;
        if (dg0Var != null) {
            dg0Var.h(i7, i8);
        }
        yf0 yf0Var = this.f8091y;
        if (yf0Var != null) {
            yf0Var.j(i7, i8, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.tv0
    public final void x0(int i7, int i8) {
        yf0 yf0Var = this.f8091y;
        if (yf0Var != null) {
            yf0Var.k(i7, i8);
        }
    }

    public final ViewTreeObserver.OnGlobalLayoutListener y() {
        synchronized (this.f8075i) {
        }
        return null;
    }

    public final void y0() {
        ml0 ml0Var = this.f8092z;
        if (ml0Var != null) {
            ml0Var.b();
            this.f8092z = null;
        }
        q();
        synchronized (this.f8075i) {
            this.f8074h.clear();
            this.f8076j = null;
            this.f8077k = null;
            this.f8078l = null;
            this.f8079m = null;
            this.f8080n = null;
            this.f8081o = null;
            this.f8083q = false;
            this.f8085s = false;
            this.f8086t = false;
            this.f8088v = null;
            this.f8090x = null;
            this.f8089w = null;
            yf0 yf0Var = this.f8091y;
            if (yf0Var != null) {
                yf0Var.h(true);
                this.f8091y = null;
            }
            this.A = null;
        }
    }

    public final ViewTreeObserver.OnScrollChangedListener z() {
        synchronized (this.f8075i) {
        }
        return null;
    }
}
