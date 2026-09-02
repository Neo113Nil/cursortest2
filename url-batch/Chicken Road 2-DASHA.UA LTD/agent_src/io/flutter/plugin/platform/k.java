package io.flutter.plugin.platform;

import D.C0012m;
import D.u;
import D.y;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: c, reason: collision with root package name */
    public Activity f666c;

    /* renamed from: d, reason: collision with root package name */
    public y f667d;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f669f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.l f670g;

    /* renamed from: h, reason: collision with root package name */
    public u f671h;
    public final B.a u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f668e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f679p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f680q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f681r = true;

    /* renamed from: v, reason: collision with root package name */
    public final c f684v = new c(1, this);

    /* renamed from: b, reason: collision with root package name */
    public final E.i f665b = new E.i(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f673j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final a f672i = new a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f674k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f677n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f682s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f683t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f678o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f675l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f676m = new SparseArray();

    public k() {
        if (B.a.f0e == null) {
            B.a.f0e = new B.a(2);
        }
        this.u = B.a.f0e;
    }

    public static void a(k kVar, M.h hVar) {
        kVar.getClass();
        int i2 = hVar.f288c;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + hVar.f286a + ")");
    }

    @Override // io.flutter.plugin.platform.i
    public final void b() {
        this.f672i.f639a = null;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f677n;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.d();
            bVar.f89a.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void d(io.flutter.view.h hVar) {
        this.f672i.f639a = hVar;
    }

    public final void e(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f677n;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f682s.contains(Integer.valueOf(keyAt))) {
                E.c cVar = this.f667d.f129j;
                if (cVar != null) {
                    bVar.a(cVar.f149b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f680q) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f667d.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f676m;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f683t.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f681r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void f(int i2) {
        if (h(i2)) {
            ((q) this.f673j.get(Integer.valueOf(i2))).getClass();
        } else if (this.f675l.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void g() {
        if (!this.f681r || this.f680q) {
            return;
        }
        y yVar = this.f667d;
        yVar.f125f.c();
        C0012m c0012m = yVar.f124e;
        if (c0012m == null) {
            C0012m c0012m2 = new C0012m(yVar.getContext(), yVar.getWidth(), yVar.getHeight(), 1);
            yVar.f124e = c0012m2;
            yVar.addView(c0012m2);
        } else {
            c0012m.g(yVar.getWidth(), yVar.getHeight());
        }
        yVar.f126g = yVar.f125f;
        C0012m c0012m3 = yVar.f124e;
        yVar.f125f = c0012m3;
        E.c cVar = yVar.f129j;
        if (cVar != null) {
            c0012m3.a(cVar.f149b);
        }
        this.f680q = true;
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean h(int i2) {
        return this.f673j.containsKey(Integer.valueOf(i2));
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f666c.getResources().getDisplayMetrics().density);
    }
}
