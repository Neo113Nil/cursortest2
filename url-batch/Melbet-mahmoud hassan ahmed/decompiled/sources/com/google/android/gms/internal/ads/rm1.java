package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.view.View;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class rm1 {

    /* renamed from: a, reason: collision with root package name */
    private int f11228a;

    /* renamed from: b, reason: collision with root package name */
    private cz f11229b;

    /* renamed from: c, reason: collision with root package name */
    private g40 f11230c;

    /* renamed from: d, reason: collision with root package name */
    private View f11231d;

    /* renamed from: e, reason: collision with root package name */
    private List<?> f11232e;

    /* renamed from: g, reason: collision with root package name */
    private wz f11234g;

    /* renamed from: h, reason: collision with root package name */
    private Bundle f11235h;

    /* renamed from: i, reason: collision with root package name */
    private eu0 f11236i;

    /* renamed from: j, reason: collision with root package name */
    private eu0 f11237j;

    /* renamed from: k, reason: collision with root package name */
    private eu0 f11238k;

    /* renamed from: l, reason: collision with root package name */
    private x3.a f11239l;

    /* renamed from: m, reason: collision with root package name */
    private View f11240m;

    /* renamed from: n, reason: collision with root package name */
    private View f11241n;

    /* renamed from: o, reason: collision with root package name */
    private x3.a f11242o;

    /* renamed from: p, reason: collision with root package name */
    private double f11243p;

    /* renamed from: q, reason: collision with root package name */
    private n40 f11244q;

    /* renamed from: r, reason: collision with root package name */
    private n40 f11245r;

    /* renamed from: s, reason: collision with root package name */
    private String f11246s;

    /* renamed from: v, reason: collision with root package name */
    private float f11249v;

    /* renamed from: w, reason: collision with root package name */
    private String f11250w;

    /* renamed from: t, reason: collision with root package name */
    private final h.e<String, z30> f11247t = new h.e<>();

    /* renamed from: u, reason: collision with root package name */
    private final h.e<String, String> f11248u = new h.e<>();

    /* renamed from: f, reason: collision with root package name */
    private List<wz> f11233f = Collections.emptyList();

    public static rm1 C(od0 od0Var) {
        try {
            qm1 G = G(od0Var.C3(), null);
            g40 o42 = od0Var.o4();
            View view = (View) I(od0Var.k6());
            String n7 = od0Var.n();
            List<?> s62 = od0Var.s6();
            String o7 = od0Var.o();
            Bundle d7 = od0Var.d();
            String m7 = od0Var.m();
            View view2 = (View) I(od0Var.r6());
            x3.a k7 = od0Var.k();
            String r7 = od0Var.r();
            String l7 = od0Var.l();
            double b7 = od0Var.b();
            n40 C5 = od0Var.C5();
            rm1 rm1Var = new rm1();
            rm1Var.f11228a = 2;
            rm1Var.f11229b = G;
            rm1Var.f11230c = o42;
            rm1Var.f11231d = view;
            rm1Var.u("headline", n7);
            rm1Var.f11232e = s62;
            rm1Var.u("body", o7);
            rm1Var.f11235h = d7;
            rm1Var.u("call_to_action", m7);
            rm1Var.f11240m = view2;
            rm1Var.f11242o = k7;
            rm1Var.u("store", r7);
            rm1Var.u("price", l7);
            rm1Var.f11243p = b7;
            rm1Var.f11244q = C5;
            return rm1Var;
        } catch (RemoteException e7) {
            io0.h("Failed to get native ad from app install ad mapper", e7);
            return null;
        }
    }

    public static rm1 D(pd0 pd0Var) {
        try {
            qm1 G = G(pd0Var.C3(), null);
            g40 o42 = pd0Var.o4();
            View view = (View) I(pd0Var.h());
            String n7 = pd0Var.n();
            List<?> s62 = pd0Var.s6();
            String o7 = pd0Var.o();
            Bundle b7 = pd0Var.b();
            String m7 = pd0Var.m();
            View view2 = (View) I(pd0Var.k6());
            x3.a r62 = pd0Var.r6();
            String k7 = pd0Var.k();
            n40 C5 = pd0Var.C5();
            rm1 rm1Var = new rm1();
            rm1Var.f11228a = 1;
            rm1Var.f11229b = G;
            rm1Var.f11230c = o42;
            rm1Var.f11231d = view;
            rm1Var.u("headline", n7);
            rm1Var.f11232e = s62;
            rm1Var.u("body", o7);
            rm1Var.f11235h = b7;
            rm1Var.u("call_to_action", m7);
            rm1Var.f11240m = view2;
            rm1Var.f11242o = r62;
            rm1Var.u("advertiser", k7);
            rm1Var.f11245r = C5;
            return rm1Var;
        } catch (RemoteException e7) {
            io0.h("Failed to get native ad from content ad mapper", e7);
            return null;
        }
    }

    public static rm1 E(od0 od0Var) {
        try {
            return H(G(od0Var.C3(), null), od0Var.o4(), (View) I(od0Var.k6()), od0Var.n(), od0Var.s6(), od0Var.o(), od0Var.d(), od0Var.m(), (View) I(od0Var.r6()), od0Var.k(), od0Var.r(), od0Var.l(), od0Var.b(), od0Var.C5(), null, 0.0f);
        } catch (RemoteException e7) {
            io0.h("Failed to get native ad assets from app install ad mapper", e7);
            return null;
        }
    }

    public static rm1 F(pd0 pd0Var) {
        try {
            return H(G(pd0Var.C3(), null), pd0Var.o4(), (View) I(pd0Var.h()), pd0Var.n(), pd0Var.s6(), pd0Var.o(), pd0Var.b(), pd0Var.m(), (View) I(pd0Var.k6()), pd0Var.r6(), null, null, -1.0d, pd0Var.C5(), pd0Var.k(), 0.0f);
        } catch (RemoteException e7) {
            io0.h("Failed to get native ad assets from content ad mapper", e7);
            return null;
        }
    }

    private static qm1 G(cz czVar, sd0 sd0Var) {
        if (czVar == null) {
            return null;
        }
        return new qm1(czVar, sd0Var);
    }

    private static rm1 H(cz czVar, g40 g40Var, View view, String str, List list, String str2, Bundle bundle, String str3, View view2, x3.a aVar, String str4, String str5, double d7, n40 n40Var, String str6, float f7) {
        rm1 rm1Var = new rm1();
        rm1Var.f11228a = 6;
        rm1Var.f11229b = czVar;
        rm1Var.f11230c = g40Var;
        rm1Var.f11231d = view;
        rm1Var.u("headline", str);
        rm1Var.f11232e = list;
        rm1Var.u("body", str2);
        rm1Var.f11235h = bundle;
        rm1Var.u("call_to_action", str3);
        rm1Var.f11240m = view2;
        rm1Var.f11242o = aVar;
        rm1Var.u("store", str4);
        rm1Var.u("price", str5);
        rm1Var.f11243p = d7;
        rm1Var.f11244q = n40Var;
        rm1Var.u("advertiser", str6);
        rm1Var.p(f7);
        return rm1Var;
    }

    private static <T> T I(x3.a aVar) {
        if (aVar == null) {
            return null;
        }
        return (T) x3.b.O0(aVar);
    }

    public static rm1 a0(sd0 sd0Var) {
        try {
            return H(G(sd0Var.i(), sd0Var), sd0Var.j(), (View) I(sd0Var.o()), sd0Var.p(), sd0Var.x(), sd0Var.r(), sd0Var.h(), sd0Var.t(), (View) I(sd0Var.m()), sd0Var.n(), sd0Var.y(), sd0Var.q(), sd0Var.b(), sd0Var.k(), sd0Var.l(), sd0Var.d());
        } catch (RemoteException e7) {
            io0.h("Failed to get native ad assets from unified ad mapper", e7);
            return null;
        }
    }

    public final synchronized double A() {
        return this.f11243p;
    }

    public final synchronized void B(x3.a aVar) {
        this.f11239l = aVar;
    }

    public final synchronized float J() {
        return this.f11249v;
    }

    public final synchronized int K() {
        return this.f11228a;
    }

    public final synchronized Bundle L() {
        if (this.f11235h == null) {
            this.f11235h = new Bundle();
        }
        return this.f11235h;
    }

    public final synchronized View M() {
        return this.f11231d;
    }

    public final synchronized View N() {
        return this.f11240m;
    }

    public final synchronized View O() {
        return this.f11241n;
    }

    public final synchronized h.e<String, z30> P() {
        return this.f11247t;
    }

    public final synchronized h.e<String, String> Q() {
        return this.f11248u;
    }

    public final synchronized cz R() {
        return this.f11229b;
    }

    public final synchronized wz S() {
        return this.f11234g;
    }

    public final synchronized g40 T() {
        return this.f11230c;
    }

    public final n40 U() {
        List<?> list = this.f11232e;
        if (list != null && list.size() != 0) {
            Object obj = this.f11232e.get(0);
            if (obj instanceof IBinder) {
                return m40.s6((IBinder) obj);
            }
        }
        return null;
    }

    public final synchronized n40 V() {
        return this.f11244q;
    }

    public final synchronized n40 W() {
        return this.f11245r;
    }

    public final synchronized eu0 X() {
        return this.f11237j;
    }

    public final synchronized eu0 Y() {
        return this.f11238k;
    }

    public final synchronized eu0 Z() {
        return this.f11236i;
    }

    public final synchronized String a() {
        return this.f11250w;
    }

    public final synchronized String b() {
        return d("price");
    }

    public final synchronized x3.a b0() {
        return this.f11242o;
    }

    public final synchronized String c() {
        return d("store");
    }

    public final synchronized x3.a c0() {
        return this.f11239l;
    }

    public final synchronized String d(String str) {
        return this.f11248u.get(str);
    }

    public final synchronized String d0() {
        return d("advertiser");
    }

    public final synchronized List<?> e() {
        return this.f11232e;
    }

    public final synchronized String e0() {
        return d("body");
    }

    public final synchronized List<wz> f() {
        return this.f11233f;
    }

    public final synchronized String f0() {
        return d("call_to_action");
    }

    public final synchronized void g() {
        eu0 eu0Var = this.f11236i;
        if (eu0Var != null) {
            eu0Var.destroy();
            this.f11236i = null;
        }
        eu0 eu0Var2 = this.f11237j;
        if (eu0Var2 != null) {
            eu0Var2.destroy();
            this.f11237j = null;
        }
        eu0 eu0Var3 = this.f11238k;
        if (eu0Var3 != null) {
            eu0Var3.destroy();
            this.f11238k = null;
        }
        this.f11239l = null;
        this.f11247t.clear();
        this.f11248u.clear();
        this.f11229b = null;
        this.f11230c = null;
        this.f11231d = null;
        this.f11232e = null;
        this.f11235h = null;
        this.f11240m = null;
        this.f11241n = null;
        this.f11242o = null;
        this.f11244q = null;
        this.f11245r = null;
        this.f11246s = null;
    }

    public final synchronized String g0() {
        return this.f11246s;
    }

    public final synchronized void h(g40 g40Var) {
        this.f11230c = g40Var;
    }

    public final synchronized String h0() {
        return d("headline");
    }

    public final synchronized void i(String str) {
        this.f11246s = str;
    }

    public final synchronized void j(wz wzVar) {
        this.f11234g = wzVar;
    }

    public final synchronized void k(n40 n40Var) {
        this.f11244q = n40Var;
    }

    public final synchronized void l(String str, z30 z30Var) {
        if (z30Var == null) {
            this.f11247t.remove(str);
        } else {
            this.f11247t.put(str, z30Var);
        }
    }

    public final synchronized void m(eu0 eu0Var) {
        this.f11237j = eu0Var;
    }

    public final synchronized void n(List<z30> list) {
        this.f11232e = list;
    }

    public final synchronized void o(n40 n40Var) {
        this.f11245r = n40Var;
    }

    public final synchronized void p(float f7) {
        this.f11249v = f7;
    }

    public final synchronized void q(List<wz> list) {
        this.f11233f = list;
    }

    public final synchronized void r(eu0 eu0Var) {
        this.f11238k = eu0Var;
    }

    public final synchronized void s(String str) {
        this.f11250w = str;
    }

    public final synchronized void t(double d7) {
        this.f11243p = d7;
    }

    public final synchronized void u(String str, String str2) {
        if (str2 == null) {
            this.f11248u.remove(str);
        } else {
            this.f11248u.put(str, str2);
        }
    }

    public final synchronized void v(int i7) {
        this.f11228a = i7;
    }

    public final synchronized void w(cz czVar) {
        this.f11229b = czVar;
    }

    public final synchronized void x(View view) {
        this.f11240m = view;
    }

    public final synchronized void y(eu0 eu0Var) {
        this.f11236i = eu0Var;
    }

    public final synchronized void z(View view) {
        this.f11241n = view;
    }
}
