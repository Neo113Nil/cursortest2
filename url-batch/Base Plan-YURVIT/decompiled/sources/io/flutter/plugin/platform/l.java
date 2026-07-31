package io.flutter.plugin.platform;

import B0.E;
import N.P;
import android.util.SparseArray;
import android.view.View;
import i.C0172t;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import k0.AbstractActivityC0187d;
import k0.C0191h;
import o0.C0211b;

/* loaded from: classes.dex */
public final class l implements h {

    /* renamed from: f, reason: collision with root package name */
    public AbstractActivityC0187d f2481f;

    /* renamed from: g, reason: collision with root package name */
    public k0.o f2482g;

    /* renamed from: i, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.i f2484i;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.plugin.editing.l f2485j;

    /* renamed from: k, reason: collision with root package name */
    public C0211b f2486k;

    /* renamed from: x, reason: collision with root package name */
    public final P f2498x;

    /* renamed from: h, reason: collision with root package name */
    public FlutterJNI f2483h = null;

    /* renamed from: s, reason: collision with root package name */
    public int f2494s = 0;
    public boolean t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2495u = true;

    /* renamed from: y, reason: collision with root package name */
    public final E f2499y = new E(24, this);

    /* renamed from: e, reason: collision with root package name */
    public final l0.h f2480e = new l0.h(1);

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f2488m = new HashMap();

    /* renamed from: l, reason: collision with root package name */
    public final a f2487l = new a();

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f2489n = new HashMap();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f2492q = new SparseArray();

    /* renamed from: v, reason: collision with root package name */
    public final HashSet f2496v = new HashSet();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f2497w = new HashSet();

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f2493r = new SparseArray();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f2490o = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f2491p = new SparseArray();

    public l() {
        if (P.f695h == null) {
            P.f695h = new P(13);
        }
        this.f2498x = P.f695h;
    }

    public static void b(l lVar, C0172t c0172t) {
        int i2 = c0172t.f2311b;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + c0172t.f2310a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void a(io.flutter.view.i iVar) {
        this.f2487l.f2456a = iVar;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2492q;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.a();
            bVar.f2690e.close();
            i2++;
        }
    }

    public final void d(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f2492q;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f2496v.contains(Integer.valueOf(keyAt))) {
                l0.c cVar = this.f2482g.f2728n;
                if (cVar != null) {
                    bVar.c(cVar.f2776b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.t) {
                    bVar.a();
                }
                bVar.setVisibility(8);
                this.f2482g.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f2491p;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f2497w.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f2495u)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean e(int i2) {
        return this.f2488m.containsKey(Integer.valueOf(i2));
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (e(i2)) {
            ((r) this.f2488m.get(Integer.valueOf(i2))).getClass();
        } else if (this.f2490o.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void g() {
        this.f2487l.f2456a = null;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.l] */
    public final void h() {
        if (!this.f2495u || this.t) {
            return;
        }
        k0.o oVar = this.f2482g;
        oVar.f2724j.d();
        C0191h c0191h = oVar.f2723i;
        if (c0191h == null) {
            C0191h c0191h2 = new C0191h(oVar.getContext(), oVar.getWidth(), oVar.getHeight(), 1);
            oVar.f2723i = c0191h2;
            oVar.addView(c0191h2);
        } else {
            c0191h.g(oVar.getWidth(), oVar.getHeight());
        }
        oVar.f2725k = oVar.f2724j;
        C0191h c0191h3 = oVar.f2723i;
        oVar.f2724j = c0191h3;
        l0.c cVar = oVar.f2728n;
        if (cVar != null) {
            c0191h3.c(cVar.f2776b);
        }
        this.t = true;
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f2481f.getResources().getDisplayMetrics().density);
    }
}
