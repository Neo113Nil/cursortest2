package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;
import p2.C4856a;
import q2.C4896j0;
import q2.C4907p;
import q2.InterfaceC4900l0;
import u2.C5107a;

/* renamed from: com.google.android.gms.internal.ads.dm, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3109dm implements InterfaceC4079vm {

    /* renamed from: A, reason: collision with root package name */
    public final C3808qk f30197A;

    /* renamed from: B, reason: collision with root package name */
    public final C2507Cl f30198B;

    /* renamed from: C, reason: collision with root package name */
    public final Ut f30199C;

    /* renamed from: D, reason: collision with root package name */
    public final C5107a f30200D;

    /* renamed from: E, reason: collision with root package name */
    public final C3226fu f30201E;

    /* renamed from: F, reason: collision with root package name */
    public final C2895Zi f30202F;

    /* renamed from: G, reason: collision with root package name */
    public final ViewOnClickListenerC2542Em f30203G;

    /* renamed from: H, reason: collision with root package name */
    public final S2.a f30204H;

    /* renamed from: I, reason: collision with root package name */
    public final C2490Bl f30205I;
    public final Av J;

    /* renamed from: K, reason: collision with root package name */
    public final C2679Mn f30206K;

    /* renamed from: L, reason: collision with root package name */
    public final Yu f30207L;

    /* renamed from: M, reason: collision with root package name */
    public final BinderC2949aq f30208M;

    /* renamed from: O, reason: collision with root package name */
    public boolean f30210O;

    /* renamed from: V, reason: collision with root package name */
    public C4896j0 f30217V;

    /* renamed from: W, reason: collision with root package name */
    public final C2744Qk f30218W;

    /* renamed from: X, reason: collision with root package name */
    public final C2508Cm f30219X;
    public final C4856a Y;

    /* renamed from: Z, reason: collision with root package name */
    public final C3270gk f30220Z;

    /* renamed from: n, reason: collision with root package name */
    public final Context f30221n;

    /* renamed from: u, reason: collision with root package name */
    public final C4133wm f30222u;

    /* renamed from: v, reason: collision with root package name */
    public final JSONObject f30223v;

    /* renamed from: w, reason: collision with root package name */
    public final C4026un f30224w;

    /* renamed from: x, reason: collision with root package name */
    public final C3917sm f30225x;

    /* renamed from: y, reason: collision with root package name */
    public final C3348i7 f30226y;

    /* renamed from: z, reason: collision with root package name */
    public final C2489Bk f30227z;

    /* renamed from: N, reason: collision with root package name */
    public boolean f30209N = false;

    /* renamed from: P, reason: collision with root package name */
    public boolean f30211P = false;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f30212Q = false;

    /* renamed from: R, reason: collision with root package name */
    public Point f30213R = new Point();

    /* renamed from: S, reason: collision with root package name */
    public Point f30214S = new Point();

    /* renamed from: T, reason: collision with root package name */
    public long f30215T = 0;

    /* renamed from: U, reason: collision with root package name */
    public long f30216U = 0;

    public C3109dm(Context context, C4133wm c4133wm, JSONObject jSONObject, C4026un c4026un, C3917sm c3917sm, C3348i7 c3348i7, C2489Bk c2489Bk, C3808qk c3808qk, C2507Cl c2507Cl, Ut ut, C5107a c5107a, C3226fu c3226fu, C2895Zi c2895Zi, ViewOnClickListenerC2542Em viewOnClickListenerC2542Em, S2.a aVar, C2490Bl c2490Bl, Av av, Yu yu, BinderC2949aq binderC2949aq, C2679Mn c2679Mn, C2508Cm c2508Cm, C2744Qk c2744Qk, C4856a c4856a, C3270gk c3270gk) {
        this.f30221n = context;
        this.f30222u = c4133wm;
        this.f30223v = jSONObject;
        this.f30224w = c4026un;
        this.f30225x = c3917sm;
        this.f30226y = c3348i7;
        this.f30227z = c2489Bk;
        this.f30197A = c3808qk;
        this.f30198B = c2507Cl;
        this.f30199C = ut;
        this.f30200D = c5107a;
        this.f30201E = c3226fu;
        this.f30202F = c2895Zi;
        this.f30203G = viewOnClickListenerC2542Em;
        this.f30204H = aVar;
        this.f30205I = c2490Bl;
        this.J = av;
        this.f30207L = yu;
        this.f30208M = binderC2949aq;
        this.f30206K = c2679Mn;
        this.f30219X = c2508Cm;
        this.f30218W = c2744Qk;
        this.Y = c4856a;
        this.f30220Z = c3270gk;
    }

    public final String A(View view) {
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31783s4)).booleanValue()) {
            return null;
        }
        try {
            return this.f30226y.f31319b.i(this.f30221n, view, null);
        } catch (Exception unused) {
            int i = t2.C.f40822b;
            u2.i.c("Exception getting data.");
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:2|3|(1:5)(1:81)|6|(1:80)(1:10)|11|8f|16|(2:99|(21:23|24|(1:28)|29|(1:33)|(1:35)|36|(1:38)|39|40|41|(1:43)|44|45|(1:49)|50|(1:54)|55|(3:57|(1:59)|(1:61))|62|63))|74|24|(2:26|28)|29|(2:31|33)|(0)|36|(0)|39|40|41|(0)|44|45|(2:47|49)|50|(2:52|54)|55|(0)|62|63) */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0103, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0117, code lost:
    
        r8 = t2.C.f40822b;
        u2.i.d("Exception obtaining click signals", r0);
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00de A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fd A[Catch: Exception -> 0x0103, TryCatch #3 {Exception -> 0x0103, blocks: (B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:40:0x00f7, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018e A[Catch: JSONException -> 0x0086, TryCatch #2 {JSONException -> 0x0086, blocks: (B:3:0x000a, B:6:0x0050, B:8:0x007e, B:11:0x008a, B:12:0x008f, B:15:0x0092, B:16:0x0093, B:18:0x0099, B:21:0x009c, B:24:0x00a7, B:26:0x00b0, B:28:0x00b8, B:29:0x00bd, B:31:0x00cd, B:33:0x00d7, B:35:0x00de, B:36:0x00e3, B:39:0x00f2, B:45:0x011f, B:47:0x0139, B:49:0x013f, B:50:0x0144, B:52:0x0154, B:54:0x015a, B:55:0x015f, B:57:0x018e, B:59:0x0196, B:61:0x019e, B:62:0x01a3, B:68:0x0117, B:73:0x00a6, B:79:0x01b6, B:20:0x009a, B:14:0x0090, B:41:0x00f7, B:43:0x00fd, B:44:0x0106), top: B:2:0x000a, inners: #0, #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z8, boolean z9) {
        List list;
        boolean z10;
        C3151ea c3151ea;
        q2.r rVar;
        JSONObject optJSONObject;
        q2.L0 l02;
        S2.a aVar = this.f30204H;
        C3917sm c3917sm = this.f30225x;
        JSONObject jSONObject7 = this.f30223v;
        try {
            x();
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("ad", jSONObject7);
            jSONObject8.put("asset_view_signal", jSONObject2);
            jSONObject8.put("ad_view_signal", jSONObject);
            jSONObject8.put("click_signal", jSONObject5);
            jSONObject8.put("scroll_view_signal", jSONObject3);
            jSONObject8.put("lock_screen_signal", jSONObject4);
            C4133wm c4133wm = this.f30222u;
            jSONObject8.put("has_custom_click_handler", ((InterfaceC2514Db) c4133wm.f35067g.getOrDefault(c3917sm.g(), null)) != null);
            jSONObject8.put("provided_signals", jSONObject6);
            JSONObject jSONObject9 = new JSONObject();
            jSONObject9.put("asset_id", str);
            jSONObject9.put("template", c3917sm.q());
            jSONObject9.put("view_aware_api_used", z8);
            C3261gb c3261gb = this.f30201E.f30906j;
            jSONObject9.put("custom_mute_requested", c3261gb != null && c3261gb.f31029z);
            synchronized (c3917sm) {
                list = c3917sm.f34280f;
            }
            if (!list.isEmpty()) {
                synchronized (c3917sm) {
                    l02 = c3917sm.f34281g;
                }
                if (l02 != null) {
                    z10 = true;
                    jSONObject9.put("custom_mute_enabled", z10);
                    if (this.f30203G.f24815v != null && jSONObject7.optBoolean("custom_one_point_five_click_enabled", false)) {
                        jSONObject9.put("custom_one_point_five_click_eligible", true);
                    }
                    aVar.getClass();
                    jSONObject9.put(com.anythink.expressad.foundation.d.d.f18754u, System.currentTimeMillis());
                    if (this.f30212Q && this.f30223v.optBoolean("allow_custom_click_gesture", false)) {
                        jSONObject9.put("custom_click_gesture_eligible", true);
                    }
                    if (z9) {
                        jSONObject9.put("is_custom_click_gesture", true);
                    }
                    jSONObject9.put("has_custom_click_handler", ((InterfaceC2514Db) c4133wm.f35067g.getOrDefault(c3917sm.g(), null)) != null);
                    optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
                    if (optJSONObject == null) {
                        optJSONObject = new JSONObject();
                    }
                    String str2 = this.f30226y.f31319b.h(this.f30221n, optJSONObject.optString("click_string"), view);
                    jSONObject9.put("click_signals", str2);
                    jSONObject9.put("open_chrome_custom_tab", true);
                    c3151ea = AbstractC3368ia.R9;
                    rVar = q2.r.f40116e;
                    if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue() && S2.b.g()) {
                        jSONObject9.put("try_fallback_for_deep_link", true);
                    }
                    if (((Boolean) rVar.f40119c.a(AbstractC3368ia.S9)).booleanValue() && S2.b.g()) {
                        jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
                    }
                    jSONObject8.put("click", jSONObject9);
                    JSONObject jSONObject10 = new JSONObject();
                    aVar.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    jSONObject10.put("time_from_last_touch_down", currentTimeMillis - this.f30215T);
                    jSONObject10.put("time_from_last_touch", currentTimeMillis - this.f30216U);
                    jSONObject8.put("touch_signal", jSONObject10);
                    if (this.f30199C.b()) {
                        JSONObject jSONObject11 = (JSONObject) jSONObject7.get("tracking_urls_and_actions");
                        String string = jSONObject11 != null ? jSONObject11.getString("gws_query_id") : null;
                        if (string != null) {
                            this.f30208M.G3(string, c3917sm);
                        }
                    }
                    AbstractC2720Pd.g(this.f30224w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3212fg.f30745h);
                }
            }
            z10 = false;
            jSONObject9.put("custom_mute_enabled", z10);
            if (this.f30203G.f24815v != null) {
                jSONObject9.put("custom_one_point_five_click_eligible", true);
            }
            aVar.getClass();
            jSONObject9.put(com.anythink.expressad.foundation.d.d.f18754u, System.currentTimeMillis());
            if (this.f30212Q) {
                jSONObject9.put("custom_click_gesture_eligible", true);
            }
            if (z9) {
            }
            jSONObject9.put("has_custom_click_handler", ((InterfaceC2514Db) c4133wm.f35067g.getOrDefault(c3917sm.g(), null)) != null);
            optJSONObject = jSONObject7.optJSONObject("tracking_urls_and_actions");
            if (optJSONObject == null) {
            }
            String str22 = this.f30226y.f31319b.h(this.f30221n, optJSONObject.optString("click_string"), view);
            jSONObject9.put("click_signals", str22);
            jSONObject9.put("open_chrome_custom_tab", true);
            c3151ea = AbstractC3368ia.R9;
            rVar = q2.r.f40116e;
            if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
                jSONObject9.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) rVar.f40119c.a(AbstractC3368ia.S9)).booleanValue()) {
                jSONObject9.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject8.put("click", jSONObject9);
            JSONObject jSONObject102 = new JSONObject();
            aVar.getClass();
            long currentTimeMillis2 = System.currentTimeMillis();
            jSONObject102.put("time_from_last_touch_down", currentTimeMillis2 - this.f30215T);
            jSONObject102.put("time_from_last_touch", currentTimeMillis2 - this.f30216U);
            jSONObject8.put("touch_signal", jSONObject102);
            if (this.f30199C.b()) {
            }
            AbstractC2720Pd.g(this.f30224w.a("google.afma.nativeAds.handleClick", jSONObject8), "Error during performing handleClick", AbstractC3212fg.f30745h);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to create click JSON.", e6);
        }
    }

    public final void C() {
        try {
            C4896j0 c4896j0 = this.f30217V;
            if (c4896j0 != null) {
                c4896j0.G0(c4896j0.A0(), 1);
            }
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void E(String str) {
        B(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void L() {
        C4026un c4026un = this.f30224w;
        synchronized (c4026un) {
            C3999uD c3999uD = c4026un.f34661m;
            if (c3999uD == null) {
                return;
            }
            C3431jl c3431jl = new C3431jl(20);
            c3999uD.c(new MD(0, c3999uD, c3431jl), c4026un.f34654e);
            c4026un.f34661m = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void Y() {
        z(null, null, null, null, null, null, false, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void a(View view) {
        if (!this.f30223v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = t2.C.f40822b;
            u2.i.f("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        } else {
            if (view == null) {
                return;
            }
            ViewOnClickListenerC2542Em viewOnClickListenerC2542Em = this.f30203G;
            view.setOnClickListener(viewOnClickListenerC2542Em);
            view.setClickable(true);
            viewOnClickListenerC2542Em.f24819z = new WeakReference(view);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void b(C2633Kb c2633Kb) {
        if (!this.f30223v.optBoolean("custom_one_point_five_click_enabled", false)) {
            int i = t2.C.f40822b;
            u2.i.f("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        ViewOnClickListenerC2542Em viewOnClickListenerC2542Em = this.f30203G;
        viewOnClickListenerC2542Em.f24815v = c2633Kb;
        C2871Yb c2871Yb = viewOnClickListenerC2542Em.f24816w;
        C4026un c4026un = viewOnClickListenerC2542Em.f24813n;
        if (c2871Yb != null) {
            c4026un.c("/unconfirmedClick", c2871Yb);
        }
        C2871Yb c2871Yb2 = new C2871Yb(4, viewOnClickListenerC2542Em, c2633Kb);
        viewOnClickListenerC2542Em.f24816w = c2871Yb2;
        c4026un.b("/unconfirmedClick", c2871Yb2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void c(InterfaceC4900l0 interfaceC4900l0) {
        q2.L0 l02;
        q2.L0 l03;
        try {
            if (this.f30211P) {
                return;
            }
            Yu yu = this.f30207L;
            Ut ut = this.f30199C;
            Av av = this.J;
            if (interfaceC4900l0 == null) {
                C3917sm c3917sm = this.f30225x;
                synchronized (c3917sm) {
                    l02 = c3917sm.f34281g;
                }
                if (l02 != null) {
                    this.f30211P = true;
                    synchronized (c3917sm) {
                        l03 = c3917sm.f34281g;
                    }
                    av.b(l03.f39971u, ut.f28184x0, yu, null);
                    C();
                    return;
                }
            }
            this.f30211P = true;
            av.b(interfaceC4900l0.f(), ut.f28184x0, yu, null);
            C();
        } catch (RemoteException e6) {
            int i = t2.C.f40822b;
            u2.i.i("#007 Could not call remote method.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final JSONObject d(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30221n;
        JSONObject r9 = w8.a.r(context, map, map2, view, scaleType);
        JSONObject o9 = w8.a.o(context, view);
        JSONObject p6 = w8.a.p(view);
        JSONObject q6 = w8.a.q(context, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", r9);
            jSONObject.put("ad_view_signal", o9);
            jSONObject.put("scroll_view_signal", p6);
            jSONObject.put("lock_screen_signal", q6);
            return jSONObject;
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to create native ad view signals JSON.", e6);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void e() {
        this.f30212Q = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void f(Bundle bundle) {
        if (bundle == null) {
            int i = t2.C.f40822b;
            u2.i.a("Click data is null. No click is reported.");
            return;
        }
        if (!o("click_reporting")) {
            int i4 = t2.C.f40822b;
            u2.i.c("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
            return;
        }
        Bundle bundle2 = bundle.getBundle("click_signal");
        JSONObject jSONObject = null;
        String string = bundle2 != null ? bundle2.getString("asset_id") : null;
        u2.d dVar = C4907p.f40108g.f40109a;
        dVar.getClass();
        try {
            jSONObject = dVar.m(bundle);
        } catch (JSONException e6) {
            u2.i.d("Error converting Bundle to JSON", e6);
        }
        B(null, null, null, null, null, string, null, jSONObject, false, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final boolean g() {
        return this.f30223v.optBoolean("allow_custom_click_gesture", false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void h(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType) {
        Context context = this.f30221n;
        JSONObject r9 = w8.a.r(context, map, map2, view2, scaleType);
        JSONObject o9 = w8.a.o(context, view2);
        JSONObject p6 = w8.a.p(view2);
        JSONObject q6 = w8.a.q(context, view2);
        String t9 = t(view, map);
        B(true == ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31847z4)).booleanValue() ? view2 : view, o9, r9, p6, q6, t9, w8.a.s(t9, context, this.f30214S, this.f30213R), null, z8, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void i(View view) {
        this.f30213R = new Point();
        this.f30214S = new Point();
        if (view != null) {
            C2490Bl c2490Bl = this.f30205I;
            synchronized (c2490Bl) {
                WeakHashMap weakHashMap = c2490Bl.f24066v;
                if (weakHashMap.containsKey(view)) {
                    ((ViewOnAttachStateChangeListenerC3779q8) weakHashMap.get(view)).f33652E.remove(c2490Bl);
                    weakHashMap.remove(view);
                }
            }
        }
        this.f30210O = false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final JSONObject j(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        JSONObject d2 = d(view, map, map2, scaleType);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f30212Q && this.f30223v.optBoolean("allow_custom_click_gesture", false)) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (d2 != null) {
                jSONObject.put("nas", d2);
                return jSONObject;
            }
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to create native click meta data JSON.", e6);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void k(View view, Map map, Map map2, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm, InterfaceViewOnClickListenerC2678Mm interfaceViewOnClickListenerC2678Mm2) {
        this.f30213R = new Point();
        this.f30214S = new Point();
        if (!this.f30210O) {
            this.f30205I.v1(view);
            this.f30210O = true;
        }
        view.setOnTouchListener(interfaceViewOnClickListenerC2678Mm);
        view.setClickable(true);
        view.setOnClickListener(interfaceViewOnClickListenerC2678Mm2);
        C2895Zi c2895Zi = this.f30202F;
        c2895Zi.getClass();
        c2895Zi.f29046C = new WeakReference(this);
        boolean n9 = w8.a.n(this.f30200D.f41219v);
        if (map != null) {
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = (View) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (view2 != null) {
                    if (n9) {
                        view2.setOnTouchListener(interfaceViewOnClickListenerC2678Mm);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(interfaceViewOnClickListenerC2678Mm2);
                }
            }
        }
        if (map2 != null) {
            Iterator it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = (View) ((WeakReference) ((Map.Entry) it2.next()).getValue()).get();
                if (view3 != null) {
                    if (n9) {
                        view3.setOnTouchListener(interfaceViewOnClickListenerC2678Mm);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0028  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(View view, View view2, Map map, Map map2, boolean z8, ImageView.ScaleType scaleType, int i) {
        boolean z9;
        boolean z10;
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f30223v;
        if (jSONObject2.optBoolean("allow_sdk_custom_click_gesture", false)) {
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
                z9 = true;
                if (!z9) {
                    if (!this.f30212Q) {
                        int i4 = t2.C.f40822b;
                        u2.i.a("Custom click reporting failed. enableCustomClickGesture is not set.");
                        return;
                    } else if (!jSONObject2.optBoolean("allow_custom_click_gesture", false)) {
                        int i9 = t2.C.f40822b;
                        u2.i.a("Custom click reporting failed. Ad unit id not in the allow list.");
                        return;
                    }
                }
                Context context = this.f30221n;
                JSONObject r9 = w8.a.r(context, map, map2, view2, scaleType);
                JSONObject o9 = w8.a.o(context, view2);
                JSONObject p6 = w8.a.p(view2);
                z10 = z9;
                JSONObject q6 = w8.a.q(context, view2);
                String t9 = t(view, map);
                JSONObject s3 = w8.a.s(t9, context, this.f30214S, this.f30213R);
                if (z10) {
                    try {
                        Point point = this.f30214S;
                        Point point2 = this.f30213R;
                        try {
                            jSONObject = new JSONObject();
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                JSONObject jSONObject4 = new JSONObject();
                                if (point != null) {
                                    jSONObject3.put("x", point.x);
                                    jSONObject3.put("y", point.y);
                                }
                                if (point2 != null) {
                                    jSONObject4.put("x", point2.x);
                                    jSONObject4.put("y", point2.y);
                                }
                                jSONObject.put("start_point", jSONObject3);
                                jSONObject.put("end_point", jSONObject4);
                                jSONObject.put("duration_ms", i);
                            } catch (Exception e6) {
                                e = e6;
                                int i10 = t2.C.f40822b;
                                u2.i.d("Error occurred while grabbing custom click gesture signals.", e);
                                jSONObject2.put("custom_click_gesture_signal", jSONObject);
                                B(view2, o9, r9, p6, q6, t9, s3, null, z8, true);
                            }
                        } catch (Exception e9) {
                            e = e9;
                            jSONObject = null;
                        }
                        jSONObject2.put("custom_click_gesture_signal", jSONObject);
                    } catch (JSONException e10) {
                        int i11 = t2.C.f40822b;
                        u2.i.d("Error occurred while adding CustomClickGestureSignals to adJson.", e10);
                        p2.j.f39798C.f39808h.d("FirstPartyNativeAdCore.performCustomClickGesture", e10);
                    }
                }
                B(view2, o9, r9, p6, q6, t9, s3, null, z8, true);
            }
        }
        z9 = false;
        if (!z9) {
        }
        Context context2 = this.f30221n;
        JSONObject r92 = w8.a.r(context2, map, map2, view2, scaleType);
        JSONObject o92 = w8.a.o(context2, view2);
        JSONObject p62 = w8.a.p(view2);
        z10 = z9;
        JSONObject q62 = w8.a.q(context2, view2);
        String t92 = t(view, map);
        JSONObject s32 = w8.a.s(t92, context2, this.f30214S, this.f30213R);
        if (z10) {
        }
        B(view2, o92, r92, p62, q62, t92, s32, null, z8, true);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void m() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f30223v);
            AbstractC2720Pd.g(this.f30224w.a("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression", AbstractC3212fg.f30745h);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void n(Bundle bundle) {
        if (bundle == null) {
            int i = t2.C.f40822b;
            u2.i.a("Touch event data is null. No touch event is reported.");
        } else {
            if (!o("touch_reporting")) {
                int i4 = t2.C.f40822b;
                u2.i.c("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
                return;
            }
            this.f30226y.f31319b.a((int) bundle.getFloat("x"), (int) bundle.getFloat("y"), bundle.getInt("duration_ms"));
            x();
        }
    }

    public final boolean o(String str) {
        JSONObject optJSONObject = this.f30223v.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void p(C4896j0 c4896j0) {
        this.f30217V = c4896j0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void q(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30221n;
        JSONObject r9 = w8.a.r(context, map, map2, view, scaleType);
        JSONObject o9 = w8.a.o(context, view);
        JSONObject p6 = w8.a.p(view);
        JSONObject q6 = w8.a.q(context, view);
        boolean t9 = w8.a.t(context, this.f30199C);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f30223v);
            jSONObject.put("asset_view_signal", r9);
            jSONObject.put("ad_view_signal", o9);
            jSONObject.put("scroll_view_signal", p6);
            jSONObject.put("lock_screen_signal", q6);
            if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.f31783s4)).booleanValue()) {
                jSONObject.put("view_signals", A(view));
            }
            jSONObject.put("policy_validator_enabled", t9);
            jSONObject.put("screen", w8.a.u(context));
            AbstractC2720Pd.g(this.f30224w.a("google.afma.nativeAds.handleNativeAdSignalsLogging", jSONObject), "Error during performing handleNativeAdSignalsLogging", AbstractC3212fg.f30745h);
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to create native ad signals logging JSON.", e6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void r(View view, Map map, Map map2, ImageView.ScaleType scaleType) {
        Context context = this.f30221n;
        z(w8.a.o(context, view), w8.a.r(context, map, map2, view, scaleType), w8.a.p(view), w8.a.q(context, view), A(view), null, w8.a.t(context, this.f30199C), view);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b  */
    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s(Bundle bundle) {
        JSONObject m8;
        if (!o("impression_reporting")) {
            int i = t2.C.f40822b;
            u2.i.c("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
            return false;
        }
        u2.d dVar = C4907p.f40108g.f40109a;
        dVar.getClass();
        if (bundle != null) {
            try {
                m8 = dVar.m(bundle);
            } catch (JSONException e6) {
                u2.i.d("Error converting Bundle to JSON", e6);
            }
            return z(null, null, null, null, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Qc)).booleanValue() ? A(null) : null, m8, false, null);
        }
        m8 = null;
        return z(null, null, null, null, ((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Qc)).booleanValue() ? A(null) : null, m8, false, null);
    }

    public final String t(View view, Map map) {
        if (map != null && view != null) {
            for (Map.Entry entry : map.entrySet()) {
                if (view.equals((View) ((WeakReference) entry.getValue()).get())) {
                    return (String) entry.getKey();
                }
            }
        }
        int q6 = this.f30225x.q();
        if (q6 == 1) {
            return "1099";
        }
        if (q6 == 2) {
            return "2099";
        }
        if (q6 != 6) {
            return null;
        }
        return "3099";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final int u() {
        C3261gb c3261gb = this.f30201E.f30906j;
        if (c3261gb == null) {
            return 0;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
            return c3261gb.f31020B;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final boolean v() {
        if (u() == 0) {
            return true;
        }
        if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.Xc)).booleanValue()) {
            return this.f30201E.f30906j.f31021C;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void w(View view, MotionEvent motionEvent) {
        int[] iArr = new int[2];
        if (view != null) {
            view.getLocationOnScreen(iArr);
        }
        this.f30213R = new Point(((int) motionEvent.getRawX()) - iArr[0], ((int) motionEvent.getRawY()) - iArr[1]);
        this.f30204H.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        this.f30216U = currentTimeMillis;
        if (motionEvent.getAction() == 0) {
            this.f30206K.f26374a = motionEvent;
            this.f30215T = currentTimeMillis;
            this.f30214S = this.f30213R;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f30213R;
        obtain.setLocation(point.x, point.y);
        this.f30226y.f31319b.b(obtain);
        obtain.recycle();
        x();
    }

    public final void x() {
        C4856a c4856a;
        if (!((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ff)).booleanValue() || (c4856a = this.Y) == null) {
            return;
        }
        c4856a.f39758b = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4079vm
    public final void y() {
        View view;
        if (this.f30223v.optBoolean("custom_one_point_five_click_enabled", false)) {
            ViewOnClickListenerC2542Em viewOnClickListenerC2542Em = this.f30203G;
            if (viewOnClickListenerC2542Em.f24815v == null || viewOnClickListenerC2542Em.f24818y == null) {
                return;
            }
            viewOnClickListenerC2542Em.f24817x = null;
            viewOnClickListenerC2542Em.f24818y = null;
            WeakReference weakReference = viewOnClickListenerC2542Em.f24819z;
            if (weakReference != null && (view = (View) weakReference.get()) != null) {
                view.setClickable(false);
                view.setOnClickListener(null);
                viewOnClickListenerC2542Em.f24819z = null;
            }
            try {
                C2633Kb c2633Kb = viewOnClickListenerC2542Em.f24815v;
                c2633Kb.G0(c2633Kb.A0(), 2);
            } catch (RemoteException e6) {
                u2.i.i("#007 Could not call remote method.", e6);
            }
        }
    }

    public final boolean z(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z8, View view) {
        C3270gk c3270gk;
        Ut ut = this.f30199C;
        Context context = this.f30221n;
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f30223v);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            C3151ea c3151ea = AbstractC3368ia.f31783s4;
            q2.r rVar = q2.r.f40116e;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2 = rVar.f40119c;
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z8);
            jSONObject6.put("screen", w8.a.u(context));
            if (((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.hf)).booleanValue() && (c3270gk = this.f30220Z) != null) {
                AtomicLong atomicLong = c3270gk.f31098a;
                if (atomicLong.get() > 0) {
                    jSONObject6.put("placement_id", atomicLong.get());
                }
            }
            boolean booleanValue = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga2.a(AbstractC3368ia.N9)).booleanValue();
            C4026un c4026un = this.f30224w;
            if (booleanValue) {
                c4026un.b("/clickRecorded", new C3000bm(this, 1));
            } else {
                c4026un.b("/logScionEvent", new C3000bm(this, 0));
            }
            c4026un.b("/nativeImpression", new C2871Yb(this, view));
            c4026un.b("/nativeImpressionFlowControl", new C3054cm(this, this.J, ut.f28184x0, this.f30207L));
            AbstractC2720Pd.g(c4026un.a("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression", AbstractC3212fg.f30745h);
            if (!this.f30209N) {
                this.f30209N = p2.j.f39798C.f39814o.d(context, this.f30200D.f41217n, ut.f28111C.toString(), this.f30201E.f30904g);
            }
            return true;
        } catch (JSONException e6) {
            int i = t2.C.f40822b;
            u2.i.d("Unable to create impression JSON.", e6);
            return false;
        }
    }
}
