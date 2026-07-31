package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class po1 implements zm1 {

    /* renamed from: a, reason: collision with root package name */
    private final sd0 f10306a;

    /* renamed from: b, reason: collision with root package name */
    private final ob1 f10307b;

    /* renamed from: c, reason: collision with root package name */
    private final ta1 f10308c;

    /* renamed from: d, reason: collision with root package name */
    private final ni1 f10309d;

    /* renamed from: e, reason: collision with root package name */
    private final Context f10310e;

    /* renamed from: f, reason: collision with root package name */
    private final rr2 f10311f;

    /* renamed from: g, reason: collision with root package name */
    private final po0 f10312g;

    /* renamed from: h, reason: collision with root package name */
    private final ks2 f10313h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f10314i = false;

    /* renamed from: j, reason: collision with root package name */
    private boolean f10315j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f10316k = true;

    /* renamed from: l, reason: collision with root package name */
    private final od0 f10317l;

    /* renamed from: m, reason: collision with root package name */
    private final pd0 f10318m;

    public po1(od0 od0Var, pd0 pd0Var, sd0 sd0Var, ob1 ob1Var, ta1 ta1Var, ni1 ni1Var, Context context, rr2 rr2Var, po0 po0Var, ks2 ks2Var, byte[] bArr) {
        this.f10317l = od0Var;
        this.f10318m = pd0Var;
        this.f10306a = sd0Var;
        this.f10307b = ob1Var;
        this.f10308c = ta1Var;
        this.f10309d = ni1Var;
        this.f10310e = context;
        this.f10311f = rr2Var;
        this.f10312g = po0Var;
        this.f10313h = ks2Var;
    }

    private final void u(View view) {
        try {
            sd0 sd0Var = this.f10306a;
            if (sd0Var != null && !sd0Var.G()) {
                this.f10306a.k2(x3.b.B3(view));
                this.f10308c.M();
                if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
                    this.f10309d.r();
                    return;
                }
                return;
            }
            od0 od0Var = this.f10317l;
            if (od0Var != null && !od0Var.w6()) {
                this.f10317l.t6(x3.b.B3(view));
                this.f10308c.M();
                if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
                    this.f10309d.r();
                    return;
                }
                return;
            }
            pd0 pd0Var = this.f10318m;
            if (pd0Var == null || pd0Var.x6()) {
                return;
            }
            this.f10318m.t6(x3.b.B3(view));
            this.f10308c.M();
            if (((Boolean) sw.c().b(m10.m7)).booleanValue()) {
                this.f10309d.r();
            }
        } catch (RemoteException e7) {
            io0.h("Failed to call handleClick", e7);
        }
    }

    private static final HashMap<String, View> v(Map<String, WeakReference<View>> map) {
        HashMap<String, View> hashMap = new HashMap<>();
        if (map == null) {
            return hashMap;
        }
        synchronized (map) {
            for (Map.Entry<String, WeakReference<View>> entry : map.entrySet()) {
                View view = entry.getValue().get();
                if (view != null) {
                    hashMap.put(entry.getKey(), view);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final boolean V() {
        return this.f10311f.I;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final boolean a(Bundle bundle) {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void b(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final JSONObject c(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void d() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void e() {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void f() {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void g(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        try {
            if (!this.f10314i) {
                this.f10314i = y2.t.t().n(this.f10310e, this.f10312g.f10301f, this.f10311f.D.toString(), this.f10313h.f7620f);
            }
            if (this.f10316k) {
                sd0 sd0Var = this.f10306a;
                if (sd0Var != null && !sd0Var.H()) {
                    this.f10306a.N();
                    this.f10307b.zza();
                    return;
                }
                od0 od0Var = this.f10317l;
                if (od0Var != null && !od0Var.x6()) {
                    this.f10317l.q();
                    this.f10307b.zza();
                    return;
                }
                pd0 pd0Var = this.f10318m;
                if (pd0Var == null || pd0Var.y6()) {
                    return;
                }
                this.f10318m.t();
                this.f10307b.zza();
            }
        } catch (RemoteException e7) {
            io0.h("Failed to call recordImpression", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void h(View view, MotionEvent motionEvent, View view2) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void i(jy jyVar) {
        io0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void j(my myVar) {
        io0.g("Mute This Ad is not supported for 3rd party ads");
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void k(String str) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void l(e60 e60Var) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void m(View view, Map<String, WeakReference<View>> map) {
        try {
            x3.a B3 = x3.b.B3(view);
            sd0 sd0Var = this.f10306a;
            if (sd0Var != null) {
                sd0Var.P3(B3);
                return;
            }
            od0 od0Var = this.f10317l;
            if (od0Var != null) {
                od0Var.k2(B3);
                return;
            }
            pd0 pd0Var = this.f10318m;
            if (pd0Var != null) {
                pd0Var.w6(B3);
            }
        } catch (RemoteException e7) {
            io0.h("Failed to call untrackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void n() {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void o(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        if (this.f10315j && this.f10311f.I) {
            return;
        }
        u(view);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void p(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void q(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        String str;
        if (!this.f10315j) {
            str = "Custom click reporting for 3p ads failed. enableCustomClickGesture is not set.";
        } else {
            if (this.f10311f.I) {
                u(view);
                return;
            }
            str = "Custom click reporting for 3p ads failed. Ad unit id not in allow list.";
        }
        io0.g(str);
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void r() {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void r0(Bundle bundle) {
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void s(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, View.OnTouchListener onTouchListener, View.OnClickListener onClickListener) {
        Object obj;
        x3.a m7;
        try {
            x3.a B3 = x3.b.B3(view);
            JSONObject jSONObject = this.f10311f.f11382h0;
            boolean z6 = true;
            if (((Boolean) sw.c().b(m10.f8210h1)).booleanValue() && jSONObject.length() != 0) {
                Map<String, WeakReference<View>> hashMap = map == null ? new HashMap<>() : map;
                Map<String, WeakReference<View>> hashMap2 = map2 == null ? new HashMap<>() : map2;
                HashMap hashMap3 = new HashMap();
                hashMap3.putAll(hashMap);
                hashMap3.putAll(hashMap2);
                Iterator<String> keys = jSONObject.keys();
                loop0: while (keys.hasNext()) {
                    String next = keys.next();
                    JSONArray optJSONArray = jSONObject.optJSONArray(next);
                    if (optJSONArray != null) {
                        WeakReference weakReference = (WeakReference) hashMap3.get(next);
                        if (weakReference != null && (obj = weakReference.get()) != null) {
                            Class<?> cls = obj.getClass();
                            if (((Boolean) sw.c().b(m10.f8218i1)).booleanValue() && next.equals("3010")) {
                                sd0 sd0Var = this.f10306a;
                                Object obj2 = null;
                                if (sd0Var != null) {
                                    try {
                                        m7 = sd0Var.m();
                                    } catch (RemoteException | IllegalArgumentException unused) {
                                    }
                                } else {
                                    od0 od0Var = this.f10317l;
                                    if (od0Var != null) {
                                        m7 = od0Var.r6();
                                    } else {
                                        pd0 pd0Var = this.f10318m;
                                        m7 = pd0Var != null ? pd0Var.k6() : null;
                                    }
                                }
                                if (m7 != null) {
                                    obj2 = x3.b.O0(m7);
                                }
                                if (obj2 != null) {
                                    cls = obj2.getClass();
                                }
                            }
                            try {
                                ArrayList arrayList = new ArrayList();
                                a3.a1.c(optJSONArray, arrayList);
                                y2.t.q();
                                ClassLoader classLoader = this.f10310e.getClassLoader();
                                Iterator it = arrayList.iterator();
                                while (it.hasNext()) {
                                    if (Class.forName((String) it.next(), false, classLoader).isAssignableFrom(cls)) {
                                        break;
                                    }
                                }
                            } catch (JSONException unused2) {
                                continue;
                            }
                        }
                        z6 = false;
                        break;
                    }
                }
            }
            this.f10316k = z6;
            HashMap<String, View> v6 = v(map);
            HashMap<String, View> v7 = v(map2);
            sd0 sd0Var2 = this.f10306a;
            if (sd0Var2 != null) {
                sd0Var2.K5(B3, x3.b.B3(v6), x3.b.B3(v7));
                return;
            }
            od0 od0Var2 = this.f10317l;
            if (od0Var2 != null) {
                od0Var2.v6(B3, x3.b.B3(v6), x3.b.B3(v7));
                this.f10317l.u6(B3);
                return;
            }
            pd0 pd0Var2 = this.f10318m;
            if (pd0Var2 != null) {
                pd0Var2.v6(B3, x3.b.B3(v6), x3.b.B3(v7));
                this.f10318m.u6(B3);
            }
        } catch (RemoteException e7) {
            io0.h("Failed to call trackView", e7);
        }
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final JSONObject t(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zm1
    public final void y() {
        this.f10315j = true;
    }
}
