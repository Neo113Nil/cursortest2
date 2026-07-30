package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.consent_sdk.C4313b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;
import q2.C4907p;
import q2.InterfaceC4877a;
import s2.BinderC4996d;
import s2.C4997e;
import s2.InterfaceC4995c;
import t0.AbstractC5051n;
import t2.C5067a;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.Dh, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC2520Dh extends WebView implements DownloadListener, ViewTreeObserver.OnGlobalLayoutListener, InterfaceC3858rh {

    /* renamed from: I0, reason: collision with root package name */
    public static final /* synthetic */ int f24460I0 = 0;

    /* renamed from: A, reason: collision with root package name */
    public final DisplayMetrics f24461A;

    /* renamed from: A0, reason: collision with root package name */
    public int f24462A0;

    /* renamed from: B, reason: collision with root package name */
    public final float f24463B;

    /* renamed from: B0, reason: collision with root package name */
    public int f24464B0;

    /* renamed from: C, reason: collision with root package name */
    public Ut f24465C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public Wt f24466D;

    /* renamed from: D0, reason: collision with root package name */
    public int f24467D0;

    /* renamed from: E, reason: collision with root package name */
    public boolean f24468E;

    /* renamed from: E0, reason: collision with root package name */
    public HashMap f24469E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f24470F;

    /* renamed from: F0, reason: collision with root package name */
    public final WindowManager f24471F0;

    /* renamed from: G, reason: collision with root package name */
    public C2588Hh f24472G;

    /* renamed from: G0, reason: collision with root package name */
    public final C2914a9 f24473G0;

    /* renamed from: H, reason: collision with root package name */
    public BinderC4996d f24474H;

    /* renamed from: H0, reason: collision with root package name */
    public boolean f24475H0;

    /* renamed from: I, reason: collision with root package name */
    public C3330hq f24476I;
    public C3276gq J;

    /* renamed from: K, reason: collision with root package name */
    public W2.b f24477K;

    /* renamed from: L, reason: collision with root package name */
    public final String f24478L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f24479M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f24480N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f24481O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f24482P;

    /* renamed from: Q, reason: collision with root package name */
    public Boolean f24483Q;

    /* renamed from: R, reason: collision with root package name */
    public boolean f24484R;

    /* renamed from: S, reason: collision with root package name */
    public final String f24485S;

    /* renamed from: T, reason: collision with root package name */
    public BinderC2554Fh f24486T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f24487U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f24488V;

    /* renamed from: W, reason: collision with root package name */
    public InterfaceC3152eb f24489W;

    /* renamed from: n, reason: collision with root package name */
    public final C2707Oh f24490n;

    /* renamed from: n0, reason: collision with root package name */
    public ViewTreeObserverOnGlobalLayoutListenerC3433jn f24491n0;

    /* renamed from: o0, reason: collision with root package name */
    public F8 f24492o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f24493p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f24494q0;

    /* renamed from: r0, reason: collision with root package name */
    public C3528la f24495r0;

    /* renamed from: s0, reason: collision with root package name */
    public final C3528la f24496s0;

    /* renamed from: t0, reason: collision with root package name */
    public C3528la f24497t0;

    /* renamed from: u, reason: collision with root package name */
    public final C3348i7 f24498u;

    /* renamed from: u0, reason: collision with root package name */
    public final C2881Yl f24499u0;

    /* renamed from: v, reason: collision with root package name */
    public final C3280gu f24500v;

    /* renamed from: v0, reason: collision with root package name */
    public int f24501v0;

    /* renamed from: w, reason: collision with root package name */
    public final C4175xa f24502w;

    /* renamed from: w0, reason: collision with root package name */
    public BinderC4996d f24503w0;

    /* renamed from: x, reason: collision with root package name */
    public final C5107a f24504x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f24505x0;

    /* renamed from: y, reason: collision with root package name */
    public C3761pr f24506y;

    /* renamed from: y0, reason: collision with root package name */
    public final b8.j f24507y0;

    /* renamed from: z, reason: collision with root package name */
    public final S0.s f24508z;

    /* renamed from: z0, reason: collision with root package name */
    public int f24509z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewTreeObserverOnGlobalLayoutListenerC2520Dh(C2707Oh c2707Oh, W2.b bVar, String str, boolean z8, C3348i7 c3348i7, C4175xa c4175xa, C5107a c5107a, C3761pr c3761pr, S0.s sVar, C2914a9 c2914a9, Ut ut, Wt wt, C3280gu c3280gu) {
        super(c2707Oh);
        Wt wt2;
        String str2;
        C4313b a9;
        int i = 3;
        this.f24468E = false;
        this.f24470F = false;
        this.f24484R = true;
        this.f24485S = "";
        this.f24509z0 = -1;
        this.f24462A0 = -1;
        this.f24464B0 = -1;
        this.C0 = -1;
        this.f24467D0 = -1;
        this.f24490n = c2707Oh;
        this.f24477K = bVar;
        this.f24478L = str;
        this.f24481O = z8;
        this.f24498u = c3348i7;
        this.f24500v = c3280gu;
        this.f24502w = c4175xa;
        this.f24504x = c5107a;
        this.f24506y = c3761pr;
        this.f24508z = sVar;
        WindowManager windowManager = (WindowManager) getContext().getSystemService("window");
        this.f24471F0 = windowManager;
        t2.G g9 = p2.j.f39798C.f39803c;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        this.f24461A = displayMetrics;
        this.f24463B = displayMetrics.density;
        this.f24473G0 = c2914a9;
        this.f24465C = ut;
        this.f24466D = wt;
        this.f24507y0 = new b8.j(c2707Oh.f26730a, this, this);
        this.f24475H0 = false;
        setBackgroundColor(0);
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ad)).booleanValue()) {
            setSoundEffectsEnabled(false);
        }
        WebSettings settings = getSettings();
        settings.setAllowFileAccess(false);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (NullPointerException e6) {
            int i4 = t2.C.f40822b;
            u2.i.d("Unable to enable Javascript.", e6);
        }
        settings.setSavePassword(false);
        settings.setSupportMultipleWindows(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        C3151ea c3151ea = AbstractC3368ia.Zc;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            settings.setMixedContentMode(1);
        } else {
            settings.setMixedContentMode(2);
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.Ge)).booleanValue()) {
            settings.setGeolocationEnabled(false);
        }
        p2.j jVar = p2.j.f39798C;
        settings.setUserAgentString(jVar.f39803c.E(c2707Oh, c5107a.f41217n));
        Context context = getContext();
        K3.b.G(context, new B2.y(i, settings, context));
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMediaPlaybackRequiresUserGesture(false);
        setDownloadListener(this);
        F();
        addJavascriptInterface(new C2571Gh(this, new Vx(15, this)), "googleAdsJsInterface");
        removeJavascriptInterface("accessibility");
        removeJavascriptInterface("accessibilityTraversal");
        C2881Yl c2881Yl = this.f24499u0;
        if (c2881Yl != null && (a9 = jVar.f39808h.a()) != null) {
            ((ArrayBlockingQueue) a9.f35811a).offer((C3636na) c2881Yl.f28863v);
        }
        C3636na c3636na = new C3636na(this.f24478L);
        C2881Yl c2881Yl2 = new C2881Yl(c3636na);
        this.f24499u0 = c2881Yl2;
        synchronized (c3636na.f32867c) {
        }
        if (((Boolean) rVar.f40119c.a(AbstractC3368ia.f31828x2)).booleanValue() && (wt2 = this.f24466D) != null && (str2 = wt2.f28491b) != null) {
            c3636na.c("gqi", str2);
        }
        C3528la d2 = C3636na.d();
        this.f24496s0 = d2;
        ((HashMap) c2881Yl2.f28862u).put("native:view_create", d2);
        Context context2 = null;
        this.f24497t0 = null;
        this.f24495r0 = null;
        if (T7.v.f3168c == null) {
            T7.v.f3168c = new T7.v();
        }
        T7.v vVar = T7.v.f3168c;
        vVar.getClass();
        t2.C.k("Updating user agent.");
        String defaultUserAgent = WebSettings.getDefaultUserAgent(c2707Oh);
        if (!defaultUserAgent.equals(vVar.f3170b)) {
            AtomicBoolean atomicBoolean = L2.h.f1727a;
            try {
                context2 = c2707Oh.createPackageContext("com.google.android.gms", 3);
            } catch (PackageManager.NameNotFoundException unused) {
            }
            if (context2 == null) {
                c2707Oh.getSharedPreferences("admob_user_agent", 0).edit().putString("user_agent", WebSettings.getDefaultUserAgent(c2707Oh)).apply();
            }
            vVar.f3170b = defaultUserAgent;
        }
        t2.C.k("User agent is updated.");
        jVar.f39808h.f29021k.incrementAndGet();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3725p8
    public final void A(C3671o8 c3671o8) {
        boolean z8;
        synchronized (this) {
            z8 = c3671o8.f33111j;
            this.f24487U = z8;
        }
        K(z8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void A0(Context context) {
        C2707Oh c2707Oh = this.f24490n;
        c2707Oh.setBaseContext(context);
        this.f24507y0.f5604f = c2707Oh.f26730a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final ArrayList B() {
        return new ArrayList();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void B0(String str, AbstractC2791Tg abstractC2791Tg) {
        try {
            if (this.f24469E0 == null) {
                this.f24469E0 = new HashMap();
            }
            this.f24469E0.put(str, abstractC2791Tg);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void C() {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            c2588Hh.C();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized BinderC4996d C0() {
        return this.f24503w0;
    }

    public final /* synthetic */ void D() {
        super.loadUrl(com.anythink.core.common.res.d.f16373a);
    }

    public final synchronized void E() {
        try {
            t2.G.f40858l.post(new RunnableC2469Ah(this, 3));
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("AdWebViewImpl.loadUrlUnsafe", th);
            int i = t2.C.f40822b;
            u2.i.g("Could not call loadUrl in destroy(). ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void E0(String str, InterfaceC2990bc interfaceC2990bc) {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            synchronized (c2588Hh.f25409w) {
                try {
                    List list = (List) c2588Hh.f25408v.get(str);
                    if (list == null) {
                        return;
                    }
                    list.remove(interfaceC2990bc);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final synchronized void F() {
        try {
            Ut ut = this.f24465C;
            if (ut != null && ut.m0) {
                int i = t2.C.f40822b;
                u2.i.a("Disabling hardware acceleration on an overlay.");
                synchronized (this) {
                    try {
                        if (!this.f24482P) {
                            setLayerType(1, null);
                        }
                        this.f24482P = true;
                    } finally {
                    }
                }
                return;
            }
            if (!this.f24481O && !this.f24477K.b()) {
                int i4 = t2.C.f40822b;
                u2.i.a("Enabling hardware acceleration on an AdView.");
                synchronized (this) {
                    try {
                        if (this.f24482P) {
                            setLayerType(0, null);
                        }
                        this.f24482P = false;
                    } finally {
                    }
                }
                return;
            }
            int i9 = t2.C.f40822b;
            u2.i.a("Enabling hardware acceleration on an overlay.");
            synchronized (this) {
                try {
                    if (this.f24482P) {
                        setLayerType(0, null);
                    }
                    this.f24482P = false;
                } finally {
                }
            }
            return;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized C3276gq F0() {
        return this.J;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final int G() {
        return getMeasuredHeight();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized boolean G0() {
        return this.f24481O;
    }

    public final synchronized void H() {
        if (this.f24505x0) {
            return;
        }
        this.f24505x0 = true;
        p2.j.f39798C.f39808h.f29021k.decrementAndGet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void H0(int i, boolean z8, boolean z9) {
        InterfaceC4877a interfaceC4877a;
        InterfaceC2524Dl interfaceC2524Dl;
        BinderC2949aq binderC2949aq;
        int i4;
        InterfaceC4877a interfaceC4877a2;
        boolean z10;
        C2588Hh c2588Hh = this.f24472G;
        C2486Bh c2486Bh = c2588Hh.f25405n;
        boolean x3 = C2588Hh.x(c2486Bh.f24059n.G0(), c2486Bh);
        boolean z11 = true;
        if (!x3 && z9) {
            z11 = false;
        }
        if (x3) {
            interfaceC4877a = null;
            interfaceC2524Dl = null;
        } else {
            interfaceC4877a = c2588Hh.f25410x;
            interfaceC2524Dl = null;
        }
        s2.l lVar = c2588Hh.f25411y;
        InterfaceC2524Dl interfaceC2524Dl2 = interfaceC2524Dl;
        InterfaceC4995c interfaceC4995c = c2588Hh.f25393N;
        C5107a c5107a = c2486Bh.f24059n.f24504x;
        InterfaceC2524Dl interfaceC2524Dl3 = z11 ? interfaceC2524Dl2 : c2588Hh.f25384D;
        if (C2588Hh.v(c2486Bh)) {
            binderC2949aq = c2588Hh.f25404Z;
            i4 = i;
            z10 = z8;
            interfaceC4877a2 = interfaceC4877a;
        } else {
            binderC2949aq = interfaceC2524Dl2;
            i4 = i;
            interfaceC4877a2 = interfaceC4877a;
            z10 = z8;
        }
        c2588Hh.a(new AdOverlayInfoParcel(interfaceC4877a2, lVar, interfaceC4995c, c2486Bh, z10, i4, c5107a, interfaceC2524Dl3, binderC2949aq));
    }

    public final synchronized void I() {
        try {
            HashMap hashMap = this.f24469E0;
            if (hashMap != null) {
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    ((AbstractC2791Tg) it.next()).a();
                }
            }
            this.f24469E0 = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void I0(int i) {
        this.f24501v0 = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Ut J() {
        return this.f24465C;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void J0(W2.b bVar) {
        this.f24477K = bVar;
        requestLayout();
    }

    public final void K(boolean z8) {
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != z8 ? "0" : "1");
        a("onAdVisibilityChanged", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void K0(String str, Rx rx) {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            synchronized (c2588Hh.f25409w) {
                try {
                    List<InterfaceC2990bc> list = (List) c2588Hh.f25408v.get(str);
                    if (list == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (InterfaceC2990bc interfaceC2990bc : list) {
                        if ((interfaceC2990bc instanceof C2600Ic) && ((C2600Ic) interfaceC2990bc).f25576n.equals((InterfaceC2990bc) rx.f27448u)) {
                            arrayList.add(interfaceC2990bc);
                        }
                    }
                    list.removeAll(arrayList);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2524Dl
    public final void L() {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            c2588Hh.L();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void L0(boolean z8) {
        BinderC4996d binderC4996d;
        int i = this.f24493p0 + (true != z8 ? -1 : 1);
        this.f24493p0 = i;
        if (i > 0 || (binderC4996d = this.f24474H) == null) {
            return;
        }
        synchronized (binderC4996d.f40445H) {
            try {
                binderC4996d.f40447K = true;
                q2.R0 r02 = binderC4996d.J;
                if (r02 != null) {
                    t2.D d2 = t2.G.f40858l;
                    d2.removeCallbacks(r02);
                    d2.post(binderC4996d.J);
                }
            } finally {
            }
        }
    }

    public final synchronized String M() {
        return this.f24485S;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void M0(long j9, boolean z8) {
        HashMap hashMap = new HashMap(2);
        hashMap.put("success", true != z8 ? "0" : "1");
        hashMap.put("duration", Long.toString(j9));
        a("onCacheAccessComplete", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void N0(String str, InterfaceC2990bc interfaceC2990bc) {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            c2588Hh.b(str, interfaceC2990bc);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void O(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void O0(boolean z8, int i, String str, boolean z9, boolean z10) {
        C2588Hh c2588Hh = this.f24472G;
        C2486Bh c2486Bh = c2588Hh.f25405n;
        boolean G02 = c2486Bh.f24059n.G0();
        boolean x3 = C2588Hh.x(G02, c2486Bh);
        boolean z11 = true;
        if (!x3 && z9) {
            z11 = false;
        }
        InterfaceC4877a interfaceC4877a = x3 ? null : c2588Hh.f25410x;
        C4074vh c4074vh = G02 ? null : new C4074vh(c2486Bh, c2588Hh.f25411y);
        InterfaceC2769Sb interfaceC2769Sb = c2588Hh.f25382B;
        BinderC2949aq binderC2949aq = null;
        InterfaceC2786Tb interfaceC2786Tb = c2588Hh.f25383C;
        boolean z12 = z11;
        C4074vh c4074vh2 = c4074vh;
        InterfaceC4995c interfaceC4995c = c2588Hh.f25393N;
        C5107a c5107a = c2486Bh.f24059n.f24504x;
        InterfaceC2524Dl interfaceC2524Dl = z12 ? null : c2588Hh.f25384D;
        if (C2588Hh.v(c2486Bh)) {
            binderC2949aq = c2588Hh.f25404Z;
        }
        c2588Hh.a(new AdOverlayInfoParcel(interfaceC4877a, c4074vh2, interfaceC2769Sb, interfaceC2786Tb, interfaceC4995c, c2486Bh, z8, i, str, c5107a, interfaceC2524Dl, binderC2949aq, z10));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized String P() {
        return this.f24478L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void P0() {
        setBackgroundColor(0);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void Q0(Ut ut, Wt wt) {
        this.f24465C = ut;
        this.f24466D = wt;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void S() {
        ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn = this.f24491n0;
        if (viewTreeObserverOnGlobalLayoutListenerC3433jn != null) {
            t2.G.f40858l.post(new RunnableC3376ij(8, viewTreeObserverOnGlobalLayoutListenerC3433jn));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3348i7 S0() {
        return this.f24498u;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void T0(int i) {
        C3528la c3528la = this.f24496s0;
        C2881Yl c2881Yl = this.f24499u0;
        if (i == 0) {
            AbstractC2655Lg.j((C3636na) c2881Yl.f28863v, c3528la, "aebb2");
        }
        AbstractC2655Lg.j((C3636na) c2881Yl.f28863v, c3528la, "aeh2");
        c2881Yl.getClass();
        ((C3636na) c2881Yl.f28863v).c("close_type", String.valueOf(i));
        HashMap hashMap = new HashMap(2);
        hashMap.put("closetype", String.valueOf(i));
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f24504x.f41217n);
        a("onhide", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final boolean U0() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void V0(C4997e c4997e, boolean z8, boolean z9, String str) {
        this.f24472G.F(c4997e, z8, z9, str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C3280gu W0() {
        return this.f24500v;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final r X0() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void Y0(boolean z8) {
        this.f24472G.f25403X = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized C3330hq Z() {
        return this.f24476I;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized boolean Z0() {
        return this.f24493p0 > 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    public final void a(String str, Map map) {
        try {
            c(str, C4907p.f40108g.f40109a.l(map));
        } catch (JSONException unused) {
            int i = t2.C.f40822b;
            u2.i.f("Could not convert parameters to JSON.");
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized InterfaceC3152eb a1() {
        return this.f24489W;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void b(String str, JSONObject jSONObject) {
        i(str, jSONObject.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final View b0() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void b1() {
        this.f24475H0 = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2566Gc
    public final void c(String str, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        String jSONObject2 = jSONObject.toString();
        StringBuilder sb = new StringBuilder("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(jSONObject2);
        sb.append(");");
        String sb2 = sb.toString();
        int i = t2.C.f40822b;
        u2.i.a("Dispatching AFMA event: ".concat(sb2));
        q(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void c0(ViewTreeObserverOnGlobalLayoutListenerC3433jn viewTreeObserverOnGlobalLayoutListenerC3433jn) {
        this.f24491n0 = viewTreeObserverOnGlobalLayoutListenerC3433jn;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void c1() {
        boolean z8;
        HashMap hashMap = new HashMap(3);
        p2.j jVar = p2.j.f39798C;
        C5067a c5067a = jVar.i;
        synchronized (c5067a) {
            z8 = c5067a.f40873a;
        }
        hashMap.put("app_muted", String.valueOf(z8));
        hashMap.put("app_volume", String.valueOf(jVar.i.a()));
        hashMap.put("device_volume", String.valueOf(C5067a.b(getContext())));
        a("volume", hashMap);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void d(String str) {
        q(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void d0(boolean z8, int i, String str, String str2, boolean z9) {
        C2588Hh c2588Hh = this.f24472G;
        C2486Bh c2486Bh = c2588Hh.f25405n;
        boolean G02 = c2486Bh.f24059n.G0();
        boolean x3 = C2588Hh.x(G02, c2486Bh);
        boolean z10 = true;
        if (!x3 && z9) {
            z10 = false;
        }
        InterfaceC4877a interfaceC4877a = x3 ? null : c2588Hh.f25410x;
        C4074vh c4074vh = G02 ? null : new C4074vh(c2486Bh, c2588Hh.f25411y);
        InterfaceC2769Sb interfaceC2769Sb = c2588Hh.f25382B;
        BinderC2949aq binderC2949aq = null;
        InterfaceC2786Tb interfaceC2786Tb = c2588Hh.f25383C;
        boolean z11 = z10;
        C4074vh c4074vh2 = c4074vh;
        InterfaceC4995c interfaceC4995c = c2588Hh.f25393N;
        C5107a c5107a = c2486Bh.f24059n.f24504x;
        InterfaceC2524Dl interfaceC2524Dl = z11 ? null : c2588Hh.f25384D;
        if (C2588Hh.v(c2486Bh)) {
            binderC2949aq = c2588Hh.f25404Z;
        }
        c2588Hh.a(new AdOverlayInfoParcel(interfaceC4877a, c4074vh2, interfaceC2769Sb, interfaceC2786Tb, interfaceC4995c, c2486Bh, z8, i, str, str2, c5107a, interfaceC2524Dl, binderC2949aq));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void d1(boolean z8) {
        try {
            boolean z9 = this.f24481O;
            this.f24481O = z8;
            F();
            if (z8 != z9) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31843z0)).booleanValue()) {
                    if (!this.f24477K.b()) {
                    }
                }
                try {
                    c("onStateChanged", new JSONObject().put(com.anythink.core.express.b.a.f17684b, true != z8 ? com.anythink.core.express.b.a.f17688f : com.anythink.core.express.b.a.f17689g));
                } catch (JSONException e6) {
                    int i = t2.C.f40822b;
                    u2.i.d("Error occurred while dispatching state change.", e6);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0041 A[Catch: all -> 0x0059, TryCatch #0 {all -> 0x0059, blocks: (B:3:0x0001, B:6:0x001b, B:9:0x004a, B:11:0x004e, B:12:0x005b, B:17:0x0074, B:19:0x0093, B:21:0x0099, B:23:0x009f, B:26:0x00a9, B:29:0x00b8, B:32:0x0028, B:34:0x002c, B:39:0x0041, B:40:0x0048, B:41:0x0033, B:43:0x0039, B:44:0x0006, B:46:0x0010), top: B:2:0x0001 }] */
    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void destroy() {
        C4313b a9;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        try {
            C2881Yl c2881Yl = this.f24499u0;
            if (c2881Yl != null && (a9 = p2.j.f39798C.f39808h.a()) != null) {
                ((ArrayBlockingQueue) a9.f35811a).offer((C3636na) c2881Yl.f28863v);
            }
            b8.j jVar = this.f24507y0;
            jVar.f5602d = false;
            Activity activity = (Activity) jVar.f5604f;
            if (activity != null && jVar.f5600b) {
                Window window = activity.getWindow();
                if (window != null && (decorView = window.getDecorView()) != null) {
                    viewTreeObserver = decorView.getViewTreeObserver();
                    if (viewTreeObserver != null) {
                        viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) jVar.f5605g);
                    }
                    jVar.f5600b = false;
                }
                viewTreeObserver = null;
                if (viewTreeObserver != null) {
                }
                jVar.f5600b = false;
            }
            BinderC4996d binderC4996d = this.f24474H;
            if (binderC4996d != null) {
                binderC4996d.z();
                this.f24474H.y();
                this.f24474H = null;
            }
            this.f24476I = null;
            this.J = null;
            this.f24472G.d();
            this.f24492o0 = null;
            this.f24506y = null;
            setOnClickListener(null);
            setOnTouchListener(null);
            if (this.f24480N) {
                return;
            }
            p2.j.f39798C.f39799A.a(this);
            I();
            this.f24480N = true;
            if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.hc)).booleanValue()) {
                t2.C.k("Destroying the WebView immediately...");
                l();
                return;
            }
            Activity activity2 = this.f24490n.f26730a;
            if (activity2 != null && activity2.isDestroyed()) {
                t2.C.k("Destroying the WebView immediately...");
                l();
            } else {
                t2.C.k("Initiating WebView self destruct sequence in 3...");
                t2.C.k("Loading blank page in WebView, 2...");
                E();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized W2.b e0() {
        return this.f24477K;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void e1(BinderC2554Fh binderC2554Fh) {
        if (this.f24486T == null) {
            this.f24486T = binderC2554Fh;
        } else {
            int i = t2.C.f40822b;
            u2.i.c("Attempt to create multiple AdWebViewVideoControllers.");
        }
    }

    @Override // android.webkit.WebView
    public final synchronized void evaluateJavascript(String str, ValueCallback valueCallback) {
        if (r0()) {
            int i = t2.C.f40822b;
            u2.i.i("#004 The webview is destroyed. Ignoring action.", null);
            if (valueCallback != null) {
                valueCallback.onReceiveValue(null);
                return;
            }
            return;
        }
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ic)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
            super.evaluateJavascript(str, valueCallback);
        } else {
            AbstractC3212fg.f30743f.a(new RunnableC3771q0(this, str, valueCallback, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void f0(C3276gq c3276gq) {
        this.J = c3276gq;
    }

    public final void finalize() {
        try {
            synchronized (this) {
                try {
                    if (!this.f24480N) {
                        this.f24472G.d();
                        p2.j.f39798C.f39799A.a(this);
                        I();
                        H();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized BinderC2554Fh g() {
        return this.f24486T;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Context g0() {
        return this.f24490n.f26732c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized boolean g1() {
        return this.f24484R;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Activity h() {
        return this.f24490n.f26730a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void h0(int i) {
        BinderC4996d binderC4996d = this.f24474H;
        if (binderC4996d != null) {
            binderC4996d.N3(i);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void h1(boolean z8) {
        this.f24484R = z8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2651Lc
    public final void i(String str, String str2) {
        q(com.anythink.basead.b.c.i.q(new StringBuilder(AbstractC5051n.a(1, String.valueOf(str2).length(), str) + 2), str, "(", str2, ");"));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void i0(String str, String str2) {
        C2588Hh c2588Hh = this.f24472G;
        c2588Hh.getClass();
        C2486Bh c2486Bh = c2588Hh.f25405n;
        c2588Hh.a(new AdOverlayInfoParcel(c2486Bh, c2486Bh.f24059n.f24504x, str, str2, c2588Hh.f25404Z));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized boolean i1() {
        return this.f24479M;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final S0.s j() {
        return this.f24508z;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final /* synthetic */ C2588Hh j0() {
        return this.f24472G;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void j1(InterfaceC3152eb interfaceC3152eb) {
        this.f24489W = interfaceC3152eb;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void k() {
        BinderC4996d w02 = w0();
        if (w02 != null) {
            w02.f40442E.f40475u = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void k0(F8 f82) {
        this.f24492o0 = f82;
    }

    public final synchronized void l() {
        t2.C.k("Destroying WebView!");
        H();
        t2.G.f40858l.post(new RunnableC2469Ah(this));
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized F8 l0() {
        return this.f24492o0;
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void loadData(String str, String str2, String str3) {
        if (!r0()) {
            super.loadData(str, str2, str3);
        } else {
            int i = t2.C.f40822b;
            u2.i.f("#004 The webview is destroyed. Ignoring action.");
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            try {
                if (!r0()) {
                    super.loadDataWithBaseURL(str, str2, str3, str4, str5);
                } else {
                    int i = t2.C.f40822b;
                    u2.i.f("#004 The webview is destroyed. Ignoring action.");
                }
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void loadUrl(String str) {
        if (r0()) {
            int i = t2.C.f40822b;
            u2.i.f("#004 The webview is destroyed. Ignoring action.");
            return;
        }
        try {
            t2.G.f40858l.post(new MD(17, this, str));
        } catch (Throwable th) {
            p2.j.f39798C.f39808h.d("AdWebViewImpl.loadUrl", th);
            int i4 = t2.C.f40822b;
            u2.i.g("Could not call loadUrl. ", th);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final int m() {
        return getMeasuredWidth();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C2881Yl n() {
        return this.f24499u0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void n0() {
        if (this.f24495r0 == null) {
            C2881Yl c2881Yl = this.f24499u0;
            AbstractC2655Lg.j((C3636na) c2881Yl.f28863v, this.f24496s0, "aes2");
            C3528la d2 = C3636na.d();
            this.f24495r0 = d2;
            ((HashMap) c2881Yl.f28862u).put("native:view_show", d2);
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(com.anythink.expressad.foundation.g.a.i, this.f24504x.f41217n);
        a("onshow", hashMap);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r10.f24467D0 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00af, code lost:
    
        if (r10.f24467D0 != r9) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o() {
        boolean z8;
        int i;
        int i4;
        C2588Hh c2588Hh = this.f24472G;
        synchronized (c2588Hh.f25409w) {
            z8 = c2588Hh.J;
        }
        boolean z9 = false;
        if (z8 || this.f24472G.A()) {
            u2.d dVar = C4907p.f40108g.f40109a;
            DisplayMetrics displayMetrics = this.f24461A;
            int round = Math.round(displayMetrics.widthPixels / displayMetrics.density);
            int round2 = Math.round(displayMetrics.heightPixels / displayMetrics.density);
            Activity activity = this.f24490n.f26730a;
            if (activity == null || activity.getWindow() == null) {
                i = round;
                i4 = round2;
            } else {
                t2.G g9 = p2.j.f39798C.f39803c;
                int[] p6 = t2.G.p(activity);
                i = Math.round(p6[0] / displayMetrics.density);
                i4 = Math.round(p6[1] / displayMetrics.density);
            }
            t2.G g10 = p2.j.f39798C.f39803c;
            int rotation = this.f24471F0.getDefaultDisplay().getRotation();
            if (this.f24462A0 == round && this.f24509z0 == round2 && this.f24464B0 == i && this.C0 == i4) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31401B0)).booleanValue()) {
                }
            }
            if (this.f24462A0 == round && this.f24509z0 == round2) {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31401B0)).booleanValue()) {
                }
                this.f24462A0 = round;
                this.f24509z0 = round2;
                this.f24464B0 = i;
                this.C0 = i4;
                this.f24467D0 = rotation;
                new C2881Yl(17, this, "").w(round, round2, i, i4, displayMetrics.density, rotation);
                return z9;
            }
            z9 = true;
            this.f24462A0 = round;
            this.f24509z0 = round2;
            this.f24464B0 = i;
            this.C0 = i4;
            this.f24467D0 = rotation;
            new C2881Yl(17, this, "").w(round, round2, i, i4, displayMetrics.density, rotation);
            return z9;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void o0(C3330hq c3330hq) {
        this.f24476I = c3330hq;
    }

    @Override // q2.InterfaceC4877a
    public final void onAdClicked() {
        C2588Hh c2588Hh = this.f24472G;
        if (c2588Hh != null) {
            c2588Hh.onAdClicked();
        }
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public final synchronized void onAttachedToWindow() {
        try {
            super.onAttachedToWindow();
            boolean z8 = true;
            if (!r0()) {
                b8.j jVar = this.f24507y0;
                jVar.f5601c = true;
                if (jVar.f5602d) {
                    jVar.d();
                }
            }
            if (this.f24475H0) {
                onResume();
                this.f24475H0 = false;
            }
            boolean z9 = this.f24487U;
            C2588Hh c2588Hh = this.f24472G;
            if (c2588Hh == null || !c2588Hh.A()) {
                z8 = z9;
            } else {
                if (!this.f24488V) {
                    synchronized (this.f24472G.f25409w) {
                    }
                    synchronized (this.f24472G.f25409w) {
                    }
                    this.f24488V = true;
                }
                o();
            }
            K(z8);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:3:0x0001, B:5:0x0008, B:8:0x0013, B:10:0x0017, B:15:0x002c, B:16:0x0033, B:17:0x001e, B:19:0x0024, B:20:0x0038, B:22:0x003f, B:24:0x0043, B:26:0x0049, B:28:0x004f, B:30:0x0059, B:31:0x005d, B:34:0x005f, B:35:0x0063, B:38:0x0065, B:42:0x006a, B:47:0x006d, B:48:0x006e, B:37:0x0064, B:33:0x005e), top: B:2:0x0001, inners: #1, #2 }] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDetachedFromWindow() {
        C2588Hh c2588Hh;
        View decorView;
        ViewTreeObserver viewTreeObserver;
        synchronized (this) {
            try {
                if (!r0()) {
                    b8.j jVar = this.f24507y0;
                    jVar.f5601c = false;
                    Activity activity = (Activity) jVar.f5604f;
                    if (activity != null && jVar.f5600b) {
                        Window window = activity.getWindow();
                        if (window != null && (decorView = window.getDecorView()) != null) {
                            viewTreeObserver = decorView.getViewTreeObserver();
                            if (viewTreeObserver != null) {
                                viewTreeObserver.removeOnGlobalLayoutListener((ViewTreeObserverOnGlobalLayoutListenerC2520Dh) jVar.f5605g);
                            }
                            jVar.f5600b = false;
                        }
                        viewTreeObserver = null;
                        if (viewTreeObserver != null) {
                        }
                        jVar.f5600b = false;
                    }
                }
                super.onDetachedFromWindow();
                if (this.f24488V && (c2588Hh = this.f24472G) != null && c2588Hh.A() && getViewTreeObserver() != null && getViewTreeObserver().isAlive()) {
                    synchronized (this.f24472G.f25409w) {
                    }
                    synchronized (this.f24472G.f25409w) {
                    }
                    this.f24488V = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        K(false);
    }

    @Override // android.webkit.DownloadListener
    public final void onDownloadStart(String str, String str2, String str3, String str4, long j9) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(Uri.parse(str), str4);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.wc)).booleanValue() && getContext() != null) {
                intent.setPackage(getContext().getPackageName());
            }
            t2.G g9 = p2.j.f39798C.f39803c;
            t2.G.s(getContext(), intent);
        } catch (ActivityNotFoundException e6) {
            String q6 = com.anythink.basead.b.c.i.q(new StringBuilder(String.valueOf(str).length() + 51 + String.valueOf(str4).length()), "Couldn't find an Activity to view url/mimetype: ", str, " / ", str4);
            int i = t2.C.f40822b;
            u2.i.a(q6);
            p2.j.f39798C.f39808h.d("AdWebViewImpl.onDownloadStart: ".concat(String.valueOf(str)), e6);
        }
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (r0()) {
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
        boolean o9 = o();
        BinderC4996d w02 = w0();
        if (w02 != null && o9 && w02.f40443F) {
            w02.f40443F = false;
            w02.f40457w.n0();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[Catch: all -> 0x000f, TRY_ENTER, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0148 A[Catch: all -> 0x000f, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x000a, B:10:0x0012, B:12:0x0018, B:14:0x001c, B:19:0x0027, B:24:0x002f, B:26:0x0041, B:29:0x0046, B:31:0x004d, B:34:0x0057, B:37:0x005c, B:40:0x006d, B:41:0x0085, B:45:0x0074, B:48:0x0079, B:54:0x0095, B:56:0x00a7, B:59:0x00ac, B:61:0x00c8, B:62:0x00d0, B:65:0x00cc, B:66:0x00d5, B:68:0x00db, B:71:0x00e6, B:78:0x010a, B:80:0x0111, B:83:0x0118, B:85:0x012a, B:87:0x0138, B:90:0x0145, B:93:0x0148, B:95:0x01bc, B:96:0x01bf, B:98:0x01c6, B:103:0x01d3, B:105:0x01d9, B:106:0x01dc, B:108:0x01e0, B:109:0x01e9, B:115:0x01f4), top: B:3:0x0003 }] */
    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onMeasure(int i, int i4) {
        W2.b bVar;
        int i9;
        int i10;
        boolean z8;
        int i11;
        int i12;
        int i13 = 8;
        synchronized (this) {
            int i14 = 0;
            if (r0()) {
                setMeasuredDimension(0, 0);
                return;
            }
            if (!isInEditMode() && !this.f24481O && (i9 = (bVar = this.f24477K).f3423a) != 0) {
                if (i9 == 5) {
                    super.onMeasure(i, i4);
                    return;
                }
                if (i9 == 4) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31469J4)).booleanValue()) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    BinderC2554Fh g9 = g();
                    float m8 = g9 != null ? g9.m() : 0.0f;
                    if (m8 == 0.0f) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    int size = View.MeasureSpec.getSize(i);
                    int size2 = View.MeasureSpec.getSize(i4);
                    float f6 = size2 * m8;
                    int i15 = (int) (size / m8);
                    if (size2 == 0) {
                        if (i15 != 0) {
                            i12 = (int) (i15 * m8);
                            i14 = size;
                            i11 = i15;
                            setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                            return;
                        }
                        size2 = 0;
                    }
                    int i16 = (int) f6;
                    if (size != 0) {
                        i14 = size;
                    } else if (i16 != 0) {
                        i15 = (int) (i16 / m8);
                        i11 = size2;
                        i12 = i16;
                        i14 = i12;
                        setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                        return;
                    }
                    i11 = size2;
                    i12 = i16;
                    setMeasuredDimension(Math.min(i12, i14), Math.min(i15, i11));
                    return;
                }
                if (i9 == 2) {
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31539R4)).booleanValue()) {
                        super.onMeasure(i, i4);
                        return;
                    }
                    N0("/contentHeight", new C2752Rb(i13, this));
                    q("(function() {  var height = -1;  if (document.body) {    height = document.body.offsetHeight;  } else if (document.documentElement) {    height = document.documentElement.offsetHeight;  }  var url = 'gmsg://mobileads.google.com/contentHeight?';  url += 'height=' + height;  try {    window.googleAdsJsInterface.notify(url);  } catch (e) {    var frame = document.getElementById('afma-notify-fluid');    if (!frame) {      frame = document.createElement('IFRAME');      frame.id = 'afma-notify-fluid';      frame.style.display = 'none';      var body = document.body || document.documentElement;      body.appendChild(frame);    }    frame.src = url;  }})();");
                    float f9 = this.f24461A.density;
                    int size3 = View.MeasureSpec.getSize(i);
                    int i17 = this.f24494q0;
                    setMeasuredDimension(size3, i17 != -1 ? (int) (i17 * f9) : View.MeasureSpec.getSize(i4));
                    return;
                }
                if (bVar.b()) {
                    DisplayMetrics displayMetrics = this.f24461A;
                    setMeasuredDimension(displayMetrics.widthPixels, displayMetrics.heightPixels);
                    return;
                }
                int mode = View.MeasureSpec.getMode(i);
                int size4 = View.MeasureSpec.getSize(i);
                int mode2 = View.MeasureSpec.getMode(i4);
                int size5 = View.MeasureSpec.getSize(i4);
                if (mode != Integer.MIN_VALUE && mode != 1073741824) {
                    i10 = Integer.MAX_VALUE;
                    int i18 = (mode2 != Integer.MIN_VALUE || mode2 == 1073741824) ? size5 : Integer.MAX_VALUE;
                    W2.b bVar2 = this.f24477K;
                    z8 = bVar2.f3425c <= i10 || bVar2.f3424b > i18;
                    if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31804u6)).booleanValue()) {
                        W2.b bVar3 = this.f24477K;
                        float f10 = bVar3.f3425c;
                        float f11 = this.f24463B;
                        z8 &= f10 / f11 <= ((float) i10) / f11 && ((float) bVar3.f3424b) / f11 <= ((float) i18) / f11;
                    }
                    if (z8) {
                        if (getVisibility() != 8) {
                            setVisibility(0);
                        }
                        if (!this.f24470F) {
                            this.f24473G0.b(10002);
                            this.f24470F = true;
                        }
                        W2.b bVar4 = this.f24477K;
                        setMeasuredDimension(bVar4.f3425c, bVar4.f3424b);
                        return;
                    }
                    float f12 = this.f24477K.f3425c;
                    float f13 = this.f24463B;
                    int i19 = (int) (f12 / f13);
                    int i20 = (int) (r1.f3424b / f13);
                    int i21 = (int) (size4 / f13);
                    int i22 = (int) (size5 / f13);
                    StringBuilder sb = new StringBuilder(String.valueOf(i19).length() + 36 + String.valueOf(i20).length() + 18 + String.valueOf(i21).length() + 1 + String.valueOf(i22).length() + 4);
                    sb.append("Not enough space to show ad. Needs ");
                    sb.append(i19);
                    sb.append("x");
                    sb.append(i20);
                    sb.append(" dp, but only has ");
                    sb.append(i21);
                    sb.append("x");
                    sb.append(i22);
                    sb.append(" dp.");
                    String sb2 = sb.toString();
                    int i23 = t2.C.f40822b;
                    u2.i.f(sb2);
                    if (getVisibility() != 8) {
                        setVisibility(4);
                    }
                    setMeasuredDimension(0, 0);
                    if (this.f24468E) {
                        return;
                    }
                    this.f24473G0.b(com.anythink.core.common.u.g.f16708a);
                    this.f24468E = true;
                    return;
                }
                i10 = size4;
                if (mode2 != Integer.MIN_VALUE) {
                }
                W2.b bVar22 = this.f24477K;
                if (bVar22.f3425c <= i10) {
                }
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31804u6)).booleanValue()) {
                }
                if (z8) {
                }
            }
            super.onMeasure(i, i4);
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void onPause() {
        if (r0()) {
            return;
        }
        try {
            super.onPause();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ae)).booleanValue() && com.bumptech.glide.h.s("MUTE_AUDIO")) {
                int i = t2.C.f40822b;
                u2.i.a("Muting webview");
                int i4 = H0.e.f1207a;
                if (!I0.m.f1242h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f37858u).setAudioMuted(true);
            }
        } catch (Exception e6) {
            int i9 = t2.C.f40822b;
            u2.i.d("Could not pause webview.", e6);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.de)).booleanValue()) {
                p2.j.f39798C.f39808h.d("AdWebViewImpl.onPause", e6);
            }
        }
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void onResume() {
        if (r0()) {
            return;
        }
        try {
            super.onResume();
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ae)).booleanValue() && com.bumptech.glide.h.s("MUTE_AUDIO")) {
                int i = t2.C.f40822b;
                u2.i.a("Unmuting webview");
                int i4 = H0.e.f1207a;
                if (!I0.m.f1242h.b()) {
                    throw I0.m.a();
                }
                ((WebViewProviderBoundaryInterface) H0.e.c(this).f37858u).setAudioMuted(false);
            }
        } catch (Exception e6) {
            int i9 = t2.C.f40822b;
            u2.i.d("Could not resume webview.", e6);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.de)).booleanValue()) {
                p2.j.f39798C.f39808h.d("AdWebViewImpl.onResume", e6);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x004c  */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z8;
        boolean z9;
        boolean z10;
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31774r4)).booleanValue()) {
            C2588Hh c2588Hh = this.f24472G;
            synchronized (c2588Hh.f25409w) {
                z10 = c2588Hh.f25391L;
            }
            if (z10) {
                z8 = true;
                if (this.f24472G.A()) {
                    C2588Hh c2588Hh2 = this.f24472G;
                    synchronized (c2588Hh2.f25409w) {
                        z9 = c2588Hh2.f25392M;
                    }
                    if (z9) {
                    }
                    synchronized (this) {
                        try {
                            InterfaceC3152eb interfaceC3152eb = this.f24489W;
                            if (interfaceC3152eb != null) {
                                interfaceC3152eb.h(motionEvent);
                            }
                        } finally {
                        }
                    }
                    if (r0()) {
                        return super.onTouchEvent(motionEvent);
                    }
                    return false;
                }
                if (!z8) {
                    C3348i7 c3348i7 = this.f24498u;
                    if (c3348i7 != null) {
                        c3348i7.f31319b.b(motionEvent);
                    }
                    C4175xa c4175xa = this.f24502w;
                    if (c4175xa != null) {
                        if (motionEvent.getAction() == 1 && motionEvent.getEventTime() > c4175xa.f35183a.getEventTime()) {
                            c4175xa.f35183a = MotionEvent.obtain(motionEvent);
                        } else if (motionEvent.getAction() == 0 && motionEvent.getEventTime() > c4175xa.f35184b.getEventTime()) {
                            c4175xa.f35184b = MotionEvent.obtain(motionEvent);
                        }
                    }
                    if (r0()) {
                    }
                }
                synchronized (this) {
                }
            }
        }
        z8 = false;
        if (this.f24472G.A()) {
        }
        if (!z8) {
        }
        synchronized (this) {
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized String p() {
        Wt wt = this.f24466D;
        if (wt == null) {
            return null;
        }
        return wt.f28491b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void p0(BinderC4996d binderC4996d) {
        this.f24474H = binderC4996d;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(String str) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        synchronized (this) {
            bool = this.f24483Q;
        }
        if (bool == null) {
            synchronized (this) {
                C2892Zf c2892Zf = p2.j.f39798C.f39808h;
                synchronized (c2892Zf.f29012a) {
                    bool3 = c2892Zf.f29020j;
                }
                this.f24483Q = bool3;
                if (bool3 == null) {
                    try {
                        evaluateJavascript("(function(){})()", null);
                        u(Boolean.TRUE);
                    } catch (IllegalStateException unused) {
                        u(Boolean.FALSE);
                    }
                }
            }
            if (!bool2.booleanValue()) {
                synchronized (this) {
                    if (r0()) {
                        int i = t2.C.f40822b;
                        u2.i.f("#004 The webview is destroyed. Ignoring action.");
                    } else {
                        evaluateJavascript(str, null);
                    }
                }
                return;
            }
            String concat = "javascript:".concat(str);
            synchronized (this) {
                if (r0()) {
                    int i4 = t2.C.f40822b;
                    u2.i.f("#004 The webview is destroyed. Ignoring action.");
                } else {
                    loadUrl(concat);
                }
            }
            return;
        }
        synchronized (this) {
            bool2 = this.f24483Q;
            if (!bool2.booleanValue()) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void q0(BinderC4996d binderC4996d) {
        this.f24503w0 = binderC4996d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized int r() {
        return this.f24501v0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized boolean r0() {
        return this.f24480N;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final WebView s() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final J3.a s0() {
        C4175xa c4175xa = this.f24502w;
        return c4175xa == null ? OD.f26665u : (JD) C3686oN.w(JD.s(OD.f26665u), ((Long) AbstractC2615Ja.f25772c.r()).longValue(), TimeUnit.MILLISECONDS, c4175xa.f35185c);
    }

    @Override // android.webkit.WebView, com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void setWebViewClient(WebViewClient webViewClient) {
        super.setWebViewClient(webViewClient);
        if (webViewClient instanceof C2588Hh) {
            this.f24472G = (C2588Hh) webViewClient;
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        if (r0()) {
            return;
        }
        try {
            super.stopLoading();
        } catch (Exception e6) {
            int i = t2.C.f40822b;
            u2.i.d("Could not stop loading webview.", e6);
        }
    }

    @Override // p2.g
    public final synchronized void t() {
        C3761pr c3761pr = this.f24506y;
        if (c3761pr != null) {
            c3761pr.t();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void t0(boolean z8) {
        boolean z9;
        BinderC4996d binderC4996d = this.f24474H;
        if (binderC4996d == null) {
            this.f24479M = z8;
            return;
        }
        C2588Hh c2588Hh = this.f24472G;
        synchronized (c2588Hh.f25409w) {
            z9 = c2588Hh.J;
        }
        binderC4996d.L3(z9, z8);
    }

    public final void u(Boolean bool) {
        synchronized (this) {
            this.f24483Q = bool;
        }
        C2892Zf c2892Zf = p2.j.f39798C.f39808h;
        synchronized (c2892Zf.f29012a) {
            c2892Zf.f29020j = bool;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void v0(int i, boolean z8) {
        if (z8) {
            try {
                setBackgroundColor(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        BinderC4996d binderC4996d = this.f24474H;
        if (binderC4996d != null) {
            binderC4996d.M3(i, z8);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final C5107a w() {
        return this.f24504x;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized BinderC4996d w0() {
        return this.f24474H;
    }

    public final /* synthetic */ void x(String str, ValueCallback valueCallback) {
        super.evaluateJavascript(str, valueCallback);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final Wt x0() {
        return this.f24466D;
    }

    @Override // p2.g
    public final synchronized void y() {
        C3761pr c3761pr = this.f24506y;
        if (c3761pr != null) {
            c3761pr.y();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final void y0() {
        t2.C.k("Cannot add text view to inner AdWebView");
    }

    public final /* synthetic */ void z(String str) {
        super.loadUrl(str);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3858rh
    public final synchronized void z0(String str, String str2) {
        Throwable th;
        String str3;
        try {
            try {
                if (r0()) {
                    int i = t2.C.f40822b;
                    u2.i.f("#004 The webview is destroyed. Ignoring action.");
                    return;
                }
                String str4 = (String) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31835y0);
                JSONObject jSONObject = new JSONObject();
                try {
                    try {
                        jSONObject.put(com.anythink.expressad.foundation.g.a.i, str4);
                        jSONObject.put("sdk", "Google Mobile Ads");
                        jSONObject.put("sdkVersion", "12.4.51-000");
                        str3 = "<script>Object.defineProperty(window,'MRAID_ENV',{get:function(){return " + jSONObject.toString() + "}});</script>";
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } catch (JSONException e6) {
                    int i4 = t2.C.f40822b;
                    u2.i.g("Unable to build MRAID_ENV", e6);
                    str3 = null;
                }
                super.loadDataWithBaseURL(str, AbstractC2622Jh.a(str2, str3), "text/html", "UTF-8", null);
            } catch (Throwable th3) {
                th = th3;
                th = th;
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            th = th;
            throw th;
        }
    }
}
