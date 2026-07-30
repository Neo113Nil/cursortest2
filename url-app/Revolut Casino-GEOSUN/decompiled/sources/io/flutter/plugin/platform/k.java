package io.flutter.plugin.platform;

import L.Q;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import c0.C0108j;
import h.C0165s;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import m0.C0193c;

/* loaded from: classes.dex */
public final class k implements h {

    /* renamed from: f, reason: collision with root package name */
    public Activity f2478f;

    /* renamed from: g, reason: collision with root package name */
    public c0.r f2479g;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f2481i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.plugin.editing.l f2482j;

    /* renamed from: k, reason: collision with root package name */
    public C0193c f2483k;

    /* renamed from: x, reason: collision with root package name */
    public final Q f2495x;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2480h = null;

    /* renamed from: s, reason: collision with root package name */
    public int f2490s = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2491t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2492u = true;

    /* renamed from: y, reason: collision with root package name */
    public final A.j f2496y = new A.j(26, this);

    /* renamed from: e, reason: collision with root package name */
    public final d0.j f2477e = new d0.j(2);

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f2485m = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final a f2484l = new a();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2486n = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f2489q = new SparseArray();

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f2493v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2494w = new HashSet();
    public final SparseArray r = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f2487o = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f2488p = new SparseArray();

    public k() {
        if (Q.f512h == null) {
            Q.f512h = new Q(8);
        }
        this.f2495x = Q.f512h;
    }

    public static void b(k kVar, C0165s c0165s) {
        kVar.getClass();
        int i2 = c0165s.f2272b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + c0165s.f2271a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a() {
        this.f2484l.f2452a = null;
    }

    @Override // io.flutter.plugin.platform.h
    public final void c(io.flutter.view.h hVar) {
        this.f2484l.f2452a = hVar;
    }

    public final void d() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2489q;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.d();
            bVar.f1713e.close();
            i2++;
        }
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2489q;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f2493v.contains(Integer.valueOf(keyAt))) {
                d0.c cVar = this.f2479g.f1750m;
                if (cVar != null) {
                    bVar.a(cVar.f1789b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f2491t) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f2479g.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2488p;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f2494w.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f2492u)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (g(i2)) {
            ((q) this.f2485m.get(Integer.valueOf(i2))).getClass();
        } else if (this.f2487o.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean g(int i2) {
        return this.f2485m.containsKey(Integer.valueOf(i2));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void h() {
        if (!this.f2492u || this.f2491t) {
            return;
        }
        c0.r rVar = this.f2479g;
        rVar.f1746i.c();
        C0108j c0108j = rVar.f1745h;
        if (c0108j == null) {
            C0108j c0108j2 = new C0108j(rVar.getContext(), rVar.getWidth(), rVar.getHeight(), 1);
            rVar.f1745h = c0108j2;
            rVar.addView(c0108j2);
        } else {
            c0108j.g(rVar.getWidth(), rVar.getHeight());
        }
        rVar.f1747j = rVar.f1746i;
        C0108j c0108j3 = rVar.f1745h;
        rVar.f1746i = c0108j3;
        d0.c cVar = rVar.f1750m;
        if (cVar != null) {
            c0108j3.a(cVar.f1789b);
        }
        this.f2491t = true;
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f2478f.getResources().getDisplayMetrics().density);
    }
}
