package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class mm1 extends v61 {
    private final Context A;
    private final om1 B;
    private final pc2 C;
    private final Map<String, Boolean> D;
    private final List<ao> E;
    private final bo F;

    /* renamed from: i, reason: collision with root package name */
    private final Executor f8618i;

    /* renamed from: j, reason: collision with root package name */
    private final rm1 f8619j;

    /* renamed from: k, reason: collision with root package name */
    private final zm1 f8620k;

    /* renamed from: l, reason: collision with root package name */
    private final rn1 f8621l;

    /* renamed from: m, reason: collision with root package name */
    private final wm1 f8622m;

    /* renamed from: n, reason: collision with root package name */
    private final cn1 f8623n;

    /* renamed from: o, reason: collision with root package name */
    private final ev3<vq1> f8624o;

    /* renamed from: p, reason: collision with root package name */
    private final ev3<tq1> f8625p;

    /* renamed from: q, reason: collision with root package name */
    private final ev3<ar1> f8626q;

    /* renamed from: r, reason: collision with root package name */
    private final ev3<qq1> f8627r;

    /* renamed from: s, reason: collision with root package name */
    private final ev3<yq1> f8628s;

    /* renamed from: t, reason: collision with root package name */
    private mo1 f8629t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f8630u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f8631v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8632w;

    /* renamed from: x, reason: collision with root package name */
    private final xl0 f8633x;

    /* renamed from: y, reason: collision with root package name */
    private final gb f8634y;

    /* renamed from: z, reason: collision with root package name */
    private final po0 f8635z;

    public mm1(u61 u61Var, Executor executor, rm1 rm1Var, zm1 zm1Var, rn1 rn1Var, wm1 wm1Var, cn1 cn1Var, ev3<vq1> ev3Var, ev3<tq1> ev3Var2, ev3<ar1> ev3Var3, ev3<qq1> ev3Var4, ev3<yq1> ev3Var5, xl0 xl0Var, gb gbVar, po0 po0Var, Context context, om1 om1Var, pc2 pc2Var, bo boVar) {
        super(u61Var);
        this.f8618i = executor;
        this.f8619j = rm1Var;
        this.f8620k = zm1Var;
        this.f8621l = rn1Var;
        this.f8622m = wm1Var;
        this.f8623n = cn1Var;
        this.f8624o = ev3Var;
        this.f8625p = ev3Var2;
        this.f8626q = ev3Var3;
        this.f8627r = ev3Var4;
        this.f8628s = ev3Var5;
        this.f8633x = xl0Var;
        this.f8634y = gbVar;
        this.f8635z = po0Var;
        this.A = context;
        this.B = om1Var;
        this.C = pc2Var;
        this.D = new HashMap();
        this.E = new ArrayList();
        this.F = boVar;
    }

    public static /* synthetic */ void G(mm1 mm1Var) {
        try {
            int K = mm1Var.f8619j.K();
            if (K == 1) {
                if (mm1Var.f8623n.b() != null) {
                    mm1Var.J("Google", true);
                    mm1Var.f8623n.b().d5(mm1Var.f8624o.a());
                    return;
                }
                return;
            }
            if (K == 2) {
                if (mm1Var.f8623n.a() != null) {
                    mm1Var.J("Google", true);
                    mm1Var.f8623n.a().z2(mm1Var.f8625p.a());
                    return;
                }
                return;
            }
            if (K == 3) {
                if (mm1Var.f8623n.d(mm1Var.f8619j.g0()) != null) {
                    if (mm1Var.f8619j.Z() != null) {
                        mm1Var.J("Google", true);
                    }
                    mm1Var.f8623n.d(mm1Var.f8619j.g0()).G1(mm1Var.f8628s.a());
                    return;
                }
                return;
            }
            if (K == 6) {
                if (mm1Var.f8623n.f() != null) {
                    mm1Var.J("Google", true);
                    mm1Var.f8623n.f().y1(mm1Var.f8626q.a());
                    return;
                }
                return;
            }
            if (K != 7) {
                io0.d("Wrong native template id!");
            } else if (mm1Var.f8623n.g() != null) {
                mm1Var.f8623n.g().v1(mm1Var.f8627r.a());
            }
        } catch (RemoteException e7) {
            io0.e("RemoteException when notifyAdLoad is called", e7);
        }
    }

    public static boolean w(View view) {
        if (!((Boolean) sw.c().b(m10.d7)).booleanValue()) {
            return view.isShown() && view.getGlobalVisibleRect(new Rect(), null);
        }
        y2.t.q();
        long a7 = a3.g2.a(view);
        if (view.isShown() && view.getGlobalVisibleRect(new Rect(), null)) {
            if (a7 >= ((Integer) sw.c().b(m10.e7)).intValue()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final synchronized void M(mo1 mo1Var) {
        Iterator<String> keys;
        View view;
        cb c7;
        if (this.f8630u) {
            return;
        }
        this.f8629t = mo1Var;
        this.f8621l.e(mo1Var);
        this.f8620k.s(mo1Var.d(), mo1Var.o(), mo1Var.m(), mo1Var, mo1Var);
        if (((Boolean) sw.c().b(m10.Q1)).booleanValue() && (c7 = this.f8634y.c()) != null) {
            c7.b(mo1Var.d());
        }
        if (((Boolean) sw.c().b(m10.f8250m1)).booleanValue()) {
            rr2 rr2Var = this.f13139b;
            if (rr2Var.f11384i0 && (keys = rr2Var.f11382h0.keys()) != null) {
                while (keys.hasNext()) {
                    String next = keys.next();
                    WeakReference<View> weakReference = this.f8629t.k().get(next);
                    this.D.put(next, Boolean.FALSE);
                    if (weakReference != null && (view = weakReference.get()) != null) {
                        ao aoVar = new ao(this.A, view);
                        this.E.add(aoVar);
                        aoVar.c(new lm1(this, next));
                    }
                }
            }
        }
        if (mo1Var.h() != null) {
            mo1Var.h().c(this.f8633x);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void N(mo1 mo1Var) {
        this.f8620k.m(mo1Var.d(), mo1Var.k());
        if (mo1Var.f() != null) {
            mo1Var.f().setClickable(false);
            mo1Var.f().removeAllViews();
        }
        if (mo1Var.h() != null) {
            mo1Var.h().e(this.f8633x);
        }
        this.f8629t = null;
    }

    public final om1 A() {
        return this.B;
    }

    public final String C() {
        return this.f8622m.a();
    }

    public final synchronized JSONObject E(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f8620k.c(view, map, map2);
    }

    public final synchronized JSONObject F(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2) {
        return this.f8620k.t(view, map, map2);
    }

    public final void H(View view) {
        x3.a c02 = this.f8619j.c0();
        if (!this.f8622m.c() || c02 == null || view == null) {
            return;
        }
        y2.t.i().h0(c02, view);
    }

    public final synchronized void I() {
        this.f8620k.e();
    }

    public final void J(String str, boolean z6) {
        String str2;
        ug0 ug0Var;
        vg0 vg0Var;
        if (!this.f8622m.c() || TextUtils.isEmpty(str)) {
            return;
        }
        eu0 Y = this.f8619j.Y();
        eu0 Z = this.f8619j.Z();
        if (Y == null && Z == null) {
            return;
        }
        if (Y != null) {
            str2 = null;
        } else {
            str2 = "javascript";
            Y = Z;
        }
        String str3 = str2;
        if (!y2.t.i().k0(this.A)) {
            io0.g("Failed to initialize omid in InternalNativeAd");
            return;
        }
        po0 po0Var = this.f8635z;
        int i7 = po0Var.f10302g;
        int i8 = po0Var.f10303h;
        StringBuilder sb = new StringBuilder(23);
        sb.append(i7);
        sb.append(".");
        sb.append(i8);
        String sb2 = sb.toString();
        if (Z != null) {
            ug0Var = ug0.VIDEO;
            vg0Var = vg0.DEFINED_BY_JAVASCRIPT;
        } else {
            ug0Var = ug0.NATIVE_DISPLAY;
            vg0Var = this.f8619j.K() == 3 ? vg0.UNSPECIFIED : vg0.ONE_PIXEL;
        }
        x3.a j02 = y2.t.i().j0(sb2, Y.L(), "", "javascript", str3, str, vg0Var, ug0Var, this.f13139b.f11386j0);
        if (j02 == null) {
            io0.g("Failed to create omid session in InternalNativeAd");
            return;
        }
        this.f8619j.B(j02);
        Y.B0(j02);
        if (Z != null) {
            y2.t.i().l0(j02, Z.c0());
            this.f8632w = true;
        }
        if (z6) {
            y2.t.i().g0(j02);
            Y.t("onSdkLoaded", new h.a());
        }
    }

    final /* synthetic */ void K() {
        this.f8620k.f();
        this.f8619j.g();
    }

    final /* synthetic */ void L(boolean z6) {
        this.f8620k.q(this.f8629t.d(), this.f8629t.k(), this.f8629t.o(), z6);
    }

    public final synchronized void O(View view, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        if (this.f8631v) {
            return;
        }
        if (((Boolean) sw.c().b(m10.f8250m1)).booleanValue() && this.f13139b.f11384i0) {
            Iterator<String> it = this.D.keySet().iterator();
            while (it.hasNext()) {
                if (!this.D.get(it.next()).booleanValue()) {
                    return;
                }
            }
        }
        if (z6) {
            this.f8621l.d(this.f8629t);
            this.f8620k.g(view, map, map2);
            this.f8631v = true;
            return;
        }
        if (((Boolean) sw.c().b(m10.f8335x2)).booleanValue() && map != null) {
            Iterator<Map.Entry<String, WeakReference<View>>> it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                View view2 = it2.next().getValue().get();
                if (view2 != null && w(view2)) {
                    this.f8621l.d(this.f8629t);
                    this.f8620k.g(view, map, map2);
                    this.f8631v = true;
                    return;
                }
            }
        }
    }

    public final synchronized void P(my myVar) {
        this.f8620k.j(myVar);
    }

    public final synchronized void Q(View view, View view2, Map<String, WeakReference<View>> map, Map<String, WeakReference<View>> map2, boolean z6) {
        this.f8621l.c(this.f8629t);
        this.f8620k.o(view, view2, map, map2, z6);
        if (this.f8632w && this.f8619j.Z() != null) {
            this.f8619j.Z().t("onSdkAdUserInteractionClick", new h.a());
        }
    }

    public final synchronized void R(String str) {
        this.f8620k.k(str);
    }

    public final synchronized void S(Bundle bundle) {
        this.f8620k.b(bundle);
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final synchronized void a() {
        this.f8630u = true;
        this.f8618i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.fm1
            @Override // java.lang.Runnable
            public final void run() {
                mm1.this.K();
            }
        });
        super.a();
    }

    @Override // com.google.android.gms.internal.ads.v61
    public final void b() {
        this.f8618i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.gm1
            @Override // java.lang.Runnable
            public final void run() {
                mm1.G(mm1.this);
            }
        });
        if (this.f8619j.K() != 7) {
            Executor executor = this.f8618i;
            final zm1 zm1Var = this.f8620k;
            zm1Var.getClass();
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.km1
                @Override // java.lang.Runnable
                public final void run() {
                    zm1.this.n();
                }
            });
        }
        super.b();
    }

    public final synchronized void h() {
        mo1 mo1Var = this.f8629t;
        if (mo1Var == null) {
            io0.b("Ad should be associated with an ad view before calling recordCustomClickGesture()");
        } else {
            final boolean z6 = mo1Var instanceof kn1;
            this.f8618i.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.jm1
                @Override // java.lang.Runnable
                public final void run() {
                    mm1.this.L(z6);
                }
            });
        }
    }

    public final synchronized void i() {
        if (this.f8631v) {
            return;
        }
        this.f8620k.r();
    }

    public final void j(View view) {
        x3.a c02 = this.f8619j.c0();
        eu0 Y = this.f8619j.Y();
        if (!this.f8622m.c() || c02 == null || Y == null || view == null) {
            return;
        }
        y2.t.i().l0(c02, view);
    }

    public final synchronized void k(View view, MotionEvent motionEvent, View view2) {
        this.f8620k.h(view, motionEvent, view2);
    }

    public final synchronized void l(Bundle bundle) {
        this.f8620k.r0(bundle);
    }

    public final synchronized void m(View view) {
        this.f8620k.p(view);
    }

    public final synchronized void n() {
        this.f8620k.y();
    }

    public final synchronized void o(jy jyVar) {
        this.f8620k.i(jyVar);
    }

    public final synchronized void p(wy wyVar) {
        this.C.a(wyVar);
    }

    public final synchronized void q(e60 e60Var) {
        this.f8620k.l(e60Var);
    }

    public final synchronized void r(final mo1 mo1Var) {
        if (((Boolean) sw.c().b(m10.f8234k1)).booleanValue()) {
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.hm1
                @Override // java.lang.Runnable
                public final void run() {
                    mm1.this.M(mo1Var);
                }
            });
        } else {
            M(mo1Var);
        }
    }

    public final synchronized void s(final mo1 mo1Var) {
        if (((Boolean) sw.c().b(m10.f8234k1)).booleanValue()) {
            a3.g2.f72i.post(new Runnable() { // from class: com.google.android.gms.internal.ads.im1
                @Override // java.lang.Runnable
                public final void run() {
                    mm1.this.N(mo1Var);
                }
            });
        } else {
            N(mo1Var);
        }
    }

    public final boolean t() {
        return this.f8622m.d();
    }

    public final synchronized boolean u() {
        return this.f8620k.V();
    }

    public final boolean v() {
        return this.f8622m.c();
    }

    public final synchronized boolean x(Bundle bundle) {
        if (this.f8631v) {
            return true;
        }
        boolean a7 = this.f8620k.a(bundle);
        this.f8631v = a7;
        return a7;
    }
}
