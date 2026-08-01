package io.flutter.plugin.platform;

import E.C0011l;
import E.v;
import android.app.Activity;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    public Activity f719c;

    /* renamed from: d, reason: collision with root package name */
    public v f720d;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f722f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.m f723g;

    /* renamed from: h, reason: collision with root package name */
    public B.k f724h;

    /* renamed from: u, reason: collision with root package name */
    public final A.a f736u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f721e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f732p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f733q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f734r = true;

    /* renamed from: v, reason: collision with root package name */
    public final io.flutter.plugin.editing.a f737v = new io.flutter.plugin.editing.a(2, this);

    /* renamed from: b, reason: collision with root package name */
    public final F.i f718b = new F.i(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f726j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final a f725i = new a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f727k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f730n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f735s = new HashSet();
    public final HashSet t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f731o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f728l = new SparseArray();

    /* renamed from: m, reason: collision with root package name */
    public final SparseArray f729m = new SparseArray();

    public j() {
        if (A.a.f0e == null) {
            A.a.f0e = new A.a(2);
        }
        this.f736u = A.a.f0e;
    }

    public static void a(j jVar, M.g gVar) {
        jVar.getClass();
        int i2 = gVar.f346c;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + gVar.f344a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void b() {
        this.f725i.f694a = null;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f730n;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.d();
            bVar.f167a.close();
            i2++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void d(io.flutter.view.g gVar) {
        this.f725i.f694a = gVar;
    }

    public final void e(boolean z) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f730n;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f735s.contains(Integer.valueOf(keyAt))) {
                F.c cVar = this.f720d.f197h;
                if (cVar != null) {
                    bVar.a(cVar.f224b);
                }
                z &= bVar.e();
            } else {
                if (!this.f733q) {
                    bVar.d();
                }
                bVar.setVisibility(8);
                this.f720d.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f729m;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.t.contains(Integer.valueOf(keyAt2)) || (!z && this.f734r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void f(int i2) {
        if (h(i2)) {
            ((p) this.f726j.get(Integer.valueOf(i2))).getClass();
        } else if (this.f728l.get(i2) != null) {
            throw new ClassCastException();
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.j] */
    public final void g() {
        if (!this.f734r || this.f733q) {
            return;
        }
        v vVar = this.f720d;
        vVar.f193d.c();
        C0011l c0011l = vVar.f192c;
        if (c0011l == null) {
            C0011l c0011l2 = new C0011l(vVar.getContext(), vVar.getWidth(), vVar.getHeight(), 1);
            vVar.f192c = c0011l2;
            vVar.addView(c0011l2);
        } else {
            c0011l.g(vVar.getWidth(), vVar.getHeight());
        }
        vVar.f194e = vVar.f193d;
        C0011l c0011l3 = vVar.f192c;
        vVar.f193d = c0011l3;
        F.c cVar = vVar.f197h;
        if (cVar != null) {
            c0011l3.a(cVar.f224b);
        }
        this.f733q = true;
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean h(int i2) {
        return this.f726j.containsKey(Integer.valueOf(i2));
    }

    public final int i(double d2) {
        return (int) Math.round(d2 * this.f719c.getResources().getDisplayMetrics().density);
    }
}
