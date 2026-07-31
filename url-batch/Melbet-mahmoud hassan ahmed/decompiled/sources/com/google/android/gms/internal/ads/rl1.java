package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class rl1 implements zm1 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f11198a;

    /* renamed from: b, reason: collision with root package name */
    private final cn1 f11199b;

    /* renamed from: c, reason: collision with root package name */
    private final JSONObject f11200c;

    /* renamed from: d, reason: collision with root package name */
    private final rr1 f11201d;

    /* renamed from: e, reason: collision with root package name */
    private final rm1 f11202e;

    /* renamed from: f, reason: collision with root package name */
    private final gb f11203f;

    /* renamed from: g, reason: collision with root package name */
    private final ob1 f11204g;

    /* renamed from: h, reason: collision with root package name */
    private final ta1 f11205h;

    /* renamed from: i, reason: collision with root package name */
    private final ni1 f11206i;

    /* renamed from: j, reason: collision with root package name */
    private final rr2 f11207j;

    /* renamed from: k, reason: collision with root package name */
    private final po0 f11208k;

    /* renamed from: l, reason: collision with root package name */
    private final ks2 f11209l;

    /* renamed from: m, reason: collision with root package name */
    private final b31 f11210m;

    /* renamed from: n, reason: collision with root package name */
    private final un1 f11211n;

    /* renamed from: o, reason: collision with root package name */
    private final v3.d f11212o;

    /* renamed from: p, reason: collision with root package name */
    private final ji1 f11213p;

    /* renamed from: q, reason: collision with root package name */
    private final cy2 f11214q;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11216s;

    /* renamed from: z, reason: collision with root package name */
    private jy f11223z;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11215r = false;

    /* renamed from: t, reason: collision with root package name */
    private boolean f11217t = false;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11218u = false;

    /* renamed from: v, reason: collision with root package name */
    private Point f11219v = new Point();

    /* renamed from: w, reason: collision with root package name */
    private Point f11220w = new Point();

    /* renamed from: x, reason: collision with root package name */
    private long f11221x = 0;

    /* renamed from: y, reason: collision with root package name */
    private long f11222y = 0;

    public rl1(Context context, cn1 cn1Var, JSONObject jSONObject, rr1 rr1Var, rm1 rm1Var, gb gbVar, ob1 ob1Var, ta1 ta1Var, ni1 ni1Var, rr2 rr2Var, po0 po0Var, ks2 ks2Var, b31 b31Var, un1 un1Var, v3.d dVar, ji1 ji1Var, cy2 cy2Var) {
        this.f11198a = context;
        this.f11199b = cn1Var;
        this.f11200c = jSONObject;
        this.f11201d = rr1Var;
        this.f11202e = rm1Var;
        this.f11203f = gbVar;
        this.f11204g = ob1Var;
        this.f11205h = ta1Var;
        this.f11206i = ni1Var;
        this.f11207j = rr2Var;
        this.f11208k = po0Var;
        this.f11209l = ks2Var;
        this.f11210m = b31Var;
        this.f11211n = un1Var;
        this.f11212o = dVar;
        this.f11213p = ji1Var;
        this.f11214q = cy2Var;
    }

    private final String u(View view, Map<String, WeakReference<View>> map) {
        if (map != null && view != null) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                if (view.equals(entry.getValue().get())) {
                    return entry.getKey();
                }
            }
        }
        int K = this.f11202e.K();
        if (K == 1) {
            return "1099";
        }
        if (K == 2) {
            return "2099";
        }
        if (K != 6) {
            return null;
        }
        return "3099";
    }

    private final boolean v(String str) {
        JSONObject optJSONObject = this.f11200c.optJSONObject("allow_pub_event_reporting");
        return optJSONObject != null && optJSONObject.optBoolean(str, false);
    }

    private final boolean w() {
        return this.f11200c.optBoolean("allow_custom_click_gesture", false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean x(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, boolean z6) {
        rr1 rr1Var;
        t70<Object> ll1Var;
        String str2;
        r3.o.e("recordImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("ad", this.f11200c);
            jSONObject6.put("asset_view_signal", jSONObject2);
            jSONObject6.put("ad_view_signal", jSONObject);
            jSONObject6.put("scroll_view_signal", jSONObject3);
            jSONObject6.put("lock_screen_signal", jSONObject4);
            jSONObject6.put("provided_signals", jSONObject5);
            if (((Boolean) sw.c().b(m10.f8211h2)).booleanValue()) {
                jSONObject6.put("view_signals", str);
            }
            jSONObject6.put("policy_validator_enabled", z6);
            Context context = this.f11198a;
            JSONObject jSONObject7 = new JSONObject();
            y2.t.q();
            DisplayMetrics g02 = a3.g2.g0((WindowManager) context.getSystemService("window"));
            ml1 ml1Var = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            try {
                jSONObject7.put("width", qw.b().b(context, g02.widthPixels));
                jSONObject7.put("height", qw.b().b(context, g02.heightPixels));
            } catch (JSONException unused) {
                jSONObject7 = null;
            }
            jSONObject6.put("screen", jSONObject7);
            if (((Boolean) sw.c().b(m10.f8239k6)).booleanValue()) {
                rr1Var = this.f11201d;
                ll1Var = new nl1(this, ml1Var);
                str2 = "/clickRecorded";
            } else {
                rr1Var = this.f11201d;
                ll1Var = new ll1(this, objArr == true ? 1 : 0);
                str2 = "/logScionEvent";
            }
            rr1Var.i(str2, ll1Var);
            this.f11201d.i("/nativeImpression", new ql1(this, objArr2 == true ? 1 : 0));
            zo0.a(this.f11201d.d("google.afma.nativeAds.handleImpression", jSONObject6), "Error during performing handleImpression");
            if (this.f11215r) {
                return true;
            }
            this.f11215r = y2.t.t().n(this.f11198a, this.f11208k.f10301f, this.f11207j.D.toString(), this.f11209l.f7620f);
            return true;
        } catch (JSONException e7) {
            io0.e("Unable to create impression JSON.", e7);
            return false;
        }
    }

    protected final void C(View view, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, String str, JSONObject jSONObject5, JSONObject jSONObject6, boolean z6, boolean z7) {
        String str2;
        r3.o.e("performClick must be called on the main UI thread.");
        try {
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("ad", this.f11200c);
            jSONObject7.put("asset_view_signal", jSONObject2);
            jSONObject7.put("ad_view_signal", jSONObject);
            jSONObject7.put("click_signal", jSONObject5);
            jSONObject7.put("scroll_view_signal", jSONObject3);
            jSONObject7.put("lock_screen_signal", jSONObject4);
            jSONObject7.put("has_custom_click_handler", this.f11199b.c(this.f11202e.g0()) != null);
            jSONObject7.put("provided_signals", jSONObject6);
            JSONObject jSONObject8 = new JSONObject();
            jSONObject8.put("asset_id", str);
            jSONObject8.put("template", this.f11202e.K());
            jSONObject8.put("view_aware_api_used", z6);
            b40 b40Var = this.f11209l.f7623i;
            jSONObject8.put("custom_mute_requested", b40Var != null && b40Var.f3208l);
            jSONObject8.put("custom_mute_enabled", (this.f11202e.f().isEmpty() || this.f11202e.S() == null) ? false : true);
            if (this.f11211n.a() != null && this.f11200c.optBoolean("custom_one_point_five_click_enabled", false)) {
                jSONObject8.put("custom_one_point_five_click_eligible", true);
            }
            jSONObject8.put("timestamp", this.f11212o.b());
            if (this.f11218u && w()) {
                jSONObject8.put("custom_click_gesture_eligible", true);
            }
            if (z7) {
                jSONObject8.put("is_custom_click_gesture", true);
            }
            jSONObject8.put("has_custom_click_handler", this.f11199b.c(this.f11202e.g0()) != null);
            try {
                JSONObject optJSONObject = this.f11200c.optJSONObject("tracking_urls_and_actions");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                }
                str2 = this.f11203f.c().f(this.f11198a, optJSONObject.optString("click_string"), view);
            } catch (Exception e7) {
                io0.e("Exception obtaining click signals", e7);
                str2 = null;
            }
            jSONObject8.put("click_signals", str2);
            if (((Boolean) sw.c().b(m10.f8196f3)).booleanValue()) {
                jSONObject8.put("open_chrome_custom_tab", true);
            }
            if (((Boolean) sw.c().b(m10.f8271o6)).booleanValue() && v3.l.k()) {
                jSONObject8.put("try_fallback_for_deep_link", true);
            }
            if (((Boolean) sw.c().b(m10.f8279p6)).booleanValue() && v3.l.k()) {
                jSONObject8.put("in_app_link_handling_for_android_11_enabled", true);
            }
            jSONObject7.put("click", jSONObject8);
            JSONObject jSONObject9 = new JSONObject();
            long b7 = this.f11212o.b();
            jSONObject9.put("time_from_last_touch_down", b7 - this.f11221x);
            jSONObject9.put("time_from_last_touch", b7 - this.f11222y);
            jSONObject7.put("touch_signal", jSONObject9);
            zo0.a(this.f11201d.d("google.afma.nativeAds.handleClick", jSONObject7), "Error during performing handleClick");
        } catch (JSONException e8) {
            io0.e("Unable to create click JSON.", e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final boolean V() {
        return w();
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final boolean a(Bundle bundle) {
        if (v("impression_reporting")) {
            return x(null, null, null, null, null, y2.t.q().O(bundle, null), false);
        }
        io0.d("The ad slot cannot handle external impression events. You must be in the allow list to be able to report your impression events.");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void b(Bundle bundle) {
        if (bundle == null) {
            io0.b("Click data is null. No click is reported.");
        } else if (!v("click_reporting")) {
            io0.d("The ad slot cannot handle external click events. You must be part of the allow list to be able to report your click events.");
        } else {
            Bundle bundle2 = bundle.getBundle("click_signal");
            C(null, null, null, null, null, bundle2 != null ? bundle2.getString("asset_id") : null, null, y2.t.q().O(bundle, null), false, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final JSONObject c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject d7 = a3.e1.d(this.f11198a, map, map2, view);
        JSONObject g7 = a3.e1.g(this.f11198a, view);
        JSONObject f7 = a3.e1.f(view);
        JSONObject e7 = a3.e1.e(this.f11198a, view);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("asset_view_signal", d7);
            jSONObject.put("ad_view_signal", g7);
            jSONObject.put("scroll_view_signal", f7);
            jSONObject.put("lock_screen_signal", e7);
            return jSONObject;
        } catch (JSONException e8) {
            io0.e("Unable to create native ad view signals JSON.", e8);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void d() {
        try {
            jy jyVar = this.f11223z;
            if (jyVar != null) {
                jyVar.b();
            }
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void e() {
        if (this.f11200c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11211n.b();
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void f() {
        this.f11201d.f();
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        String c7;
        JSONObject d7 = a3.e1.d(this.f11198a, map, map2, view);
        JSONObject g7 = a3.e1.g(this.f11198a, view);
        JSONObject f7 = a3.e1.f(view);
        JSONObject e7 = a3.e1.e(this.f11198a, view);
        if (((Boolean) sw.c().b(m10.f8211h2)).booleanValue()) {
            try {
                c7 = this.f11203f.c().c(this.f11198a, view, null);
            } catch (Exception unused) {
                io0.d("Exception getting data.");
            }
            x(g7, d7, f7, e7, c7, null, a3.e1.h(this.f11198a, this.f11207j));
        }
        c7 = null;
        x(g7, d7, f7, e7, c7, null, a3.e1.h(this.f11198a, this.f11207j));
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void h(View view, MotionEvent motionEvent, View view2) {
        this.f11219v = a3.e1.a(motionEvent, view2);
        long b7 = this.f11212o.b();
        this.f11222y = b7;
        if (motionEvent.getAction() == 0) {
            this.f11221x = b7;
            this.f11220w = this.f11219v;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        Point point = this.f11219v;
        obtain.setLocation(point.x, point.y);
        this.f11203f.d(obtain);
        obtain.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void i(jy jyVar) {
        this.f11223z = jyVar;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void j(my myVar) {
        try {
            if (this.f11217t) {
                return;
            }
            if (myVar == null && this.f11202e.S() != null) {
                this.f11217t = true;
                this.f11214q.b(this.f11202e.S().d());
                d();
                return;
            }
            this.f11217t = true;
            this.f11214q.b(myVar.d());
            d();
        } catch (RemoteException e7) {
            io0.i("#007 Could not call remote method.", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void k(String str) {
        C(null, null, null, null, null, str, null, null, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void l(e60 e60Var) {
        if (this.f11200c.optBoolean("custom_one_point_five_click_enabled", false)) {
            this.f11211n.c(e60Var);
        } else {
            io0.g("setUnconfirmedClickListener: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void m(View view, Map<String, WeakReference<View>> map) {
        this.f11219v = new Point();
        this.f11220w = new Point();
        if (view != null) {
            this.f11213p.U0(view);
        }
        this.f11216s = false;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void n() {
        r3.o.e("recordDownloadedImpression must be called on the main UI thread.");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad", this.f11200c);
            zo0.a(this.f11201d.d("google.afma.nativeAds.handleDownloadedImpression", jSONObject), "Error during performing handleDownloadedImpression");
        } catch (JSONException e7) {
            io0.e("", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        JSONObject d7 = a3.e1.d(this.f11198a, map, map2, view2);
        JSONObject g7 = a3.e1.g(this.f11198a, view2);
        JSONObject f7 = a3.e1.f(view2);
        JSONObject e7 = a3.e1.e(this.f11198a, view2);
        String u6 = u(view, map);
        C(true == ((Boolean) sw.c().b(m10.f8219i2)).booleanValue() ? view2 : view, g7, d7, f7, e7, u6, a3.e1.c(u6, this.f11198a, this.f11220w, this.f11219v), null, z6, false);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void p(View view) {
        if (!this.f11200c.optBoolean("custom_one_point_five_click_enabled", false)) {
            io0.g("setClickConfirmingView: Your account need to be in the allow list to use this feature.\nContact your account manager for more information.");
            return;
        }
        un1 un1Var = this.f11211n;
        if (view == null) {
            return;
        }
        view.setOnClickListener(un1Var);
        view.setClickable(true);
        un1Var.f12877l = new WeakReference<>(view);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        if (!this.f11218u) {
            io0.b("Custom click reporting failed. enableCustomClickGesture is not set.");
            return;
        }
        if (!w()) {
            io0.b("Custom click reporting failed. Ad unit id not in the allow list.");
            return;
        }
        JSONObject d7 = a3.e1.d(this.f11198a, map, map2, view);
        JSONObject g7 = a3.e1.g(this.f11198a, view);
        JSONObject f7 = a3.e1.f(view);
        JSONObject e7 = a3.e1.e(this.f11198a, view);
        String u6 = u(null, map);
        C(view, g7, d7, f7, e7, u6, a3.e1.c(u6, this.f11198a, this.f11220w, this.f11219v), null, z6, true);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void r() {
        x(null, null, null, null, null, null, false);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void r0(Bundle bundle) {
        if (bundle == null) {
            io0.b("Touch event data is null. No touch event is reported.");
            return;
        }
        if (!v("touch_reporting")) {
            io0.d("The ad slot cannot handle external touch events. You must be in the allow list to be able to report your touch events.");
            return;
        }
        float f7 = bundle.getFloat("x");
        float f8 = bundle.getFloat("y");
        this.f11203f.c().e((int) f7, (int) f8, bundle.getInt("duration_ms"));
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        this.f11219v = new Point();
        this.f11220w = new Point();
        if (!this.f11216s) {
            this.f11213p.S0(view);
            this.f11216s = true;
        }
        view.setOnTouchListener(onTouchListener);
        view.setClickable(true);
        view.setOnClickListener(onClickListener);
        this.f11210m.e(this);
        boolean i7 = a3.e1.i(this.f11208k.f10303h);
        if (map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                View view2 = it.next().getValue().get();
                if (view2 != null) {
                    if (i7) {
                        view2.setOnTouchListener(onTouchListener);
                    }
                    view2.setClickable(true);
                    view2.setOnClickListener(onClickListener);
                }
            }
        }
        if (map2 != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map2.entrySet().iterator();
            while (it2.hasNext()) {
                View view3 = it2.next().getValue().get();
                if (view3 != null) {
                    if (i7) {
                        view3.setOnTouchListener(onTouchListener);
                    }
                    view3.setClickable(false);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final JSONObject t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        JSONObject c7 = c(view, map, map2);
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f11218u && w()) {
                jSONObject.put("custom_click_gesture_eligible", true);
            }
            if (c7 != null) {
                jSONObject.put("nas", c7);
            }
        } catch (JSONException e7) {
            io0.e("Unable to create native click meta data JSON.", e7);
        }
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void y() {
        this.f11218u = true;
    }
}
