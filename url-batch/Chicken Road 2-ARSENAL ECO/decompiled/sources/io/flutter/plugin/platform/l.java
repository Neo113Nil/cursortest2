package io.flutter.plugin.platform;

import D3.AbstractActivityC0117e;
import D3.C0122j;
import D3.t;
import android.util.SparseArray;
import android.view.View;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;
import u0.C0675e;

/* loaded from: classes.dex */
public final class l implements i {

    /* renamed from: g, reason: collision with root package name */
    public AbstractActivityC0117e f4576g;

    /* renamed from: h, reason: collision with root package name */
    public t f4577h;

    /* renamed from: j, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f4579j;

    /* renamed from: k, reason: collision with root package name */
    public io.flutter.plugin.editing.i f4580k;

    /* renamed from: l, reason: collision with root package name */
    public J1.c f4581l;
    public final C0675e y;

    /* renamed from: i, reason: collision with root package name */
    public FlutterJNI f4578i = null;

    /* renamed from: t, reason: collision with root package name */
    public int f4589t = 0;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4590u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f4591v = true;

    /* renamed from: z, reason: collision with root package name */
    public final V5.g f4594z = new V5.g(9, this);

    /* renamed from: f, reason: collision with root package name */
    public final E3.j f4575f = new E3.j(1);

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f4583n = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final a f4582m = new a();

    /* renamed from: o, reason: collision with root package name */
    public final HashMap f4584o = new HashMap();

    /* renamed from: r, reason: collision with root package name */
    public final SparseArray f4587r = new SparseArray();

    /* renamed from: w, reason: collision with root package name */
    public final HashSet f4592w = new HashSet();

    /* renamed from: x, reason: collision with root package name */
    public final HashSet f4593x = new HashSet();

    /* renamed from: s, reason: collision with root package name */
    public final SparseArray f4588s = new SparseArray();

    /* renamed from: p, reason: collision with root package name */
    public final SparseArray f4585p = new SparseArray();

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f4586q = new SparseArray();

    public l() {
        if (C0675e.f5972d == null) {
            C0675e.f5972d = new C0675e(2);
        }
        this.y = C0675e.f5972d;
    }

    public static void a(l lVar, D4.h hVar) {
        int i7 = hVar.f528b;
        if (i7 == 0 || i7 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i7 + "(view id: " + hVar.f527a + ")");
    }

    public final void b() {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f4587r;
            if (i7 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i7);
            bVar.a();
            bVar.f437f.close();
            i7++;
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void c(io.flutter.view.i iVar) {
        this.f4582m.f4549a = iVar;
    }

    public final void d(boolean z5) {
        int i7 = 0;
        while (true) {
            SparseArray sparseArray = this.f4587r;
            if (i7 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i7);
            b bVar = (b) sparseArray.valueAt(i7);
            if (this.f4592w.contains(Integer.valueOf(keyAt))) {
                E3.c cVar = this.f4577h.f479n;
                if (cVar != null) {
                    bVar.c(cVar.f601b);
                }
                z5 &= bVar.e();
            } else {
                if (!this.f4590u) {
                    bVar.a();
                }
                bVar.setVisibility(8);
                this.f4577h.removeView(bVar);
            }
            i7++;
        }
        int i8 = 0;
        while (true) {
            SparseArray sparseArray2 = this.f4586q;
            if (i8 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i8);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f4593x.contains(Integer.valueOf(keyAt2)) || (!z5 && this.f4591v)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i8++;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void e() {
        if (!this.f4591v || this.f4590u) {
            return;
        }
        t tVar = this.f4577h;
        tVar.f475j.d();
        C0122j c0122j = tVar.f474i;
        if (c0122j == null) {
            C0122j c0122j2 = new C0122j(tVar.getContext(), tVar.getWidth(), tVar.getHeight(), 1);
            tVar.f474i = c0122j2;
            tVar.addView(c0122j2);
        } else {
            c0122j.g(tVar.getWidth(), tVar.getHeight());
        }
        tVar.f476k = tVar.f475j;
        C0122j c0122j3 = tVar.f474i;
        tVar.f475j = c0122j3;
        E3.c cVar = tVar.f479n;
        if (cVar != null) {
            c0122j3.c(cVar.f601b);
        }
        this.f4590u = true;
    }

    public final int f(double d7) {
        return (int) Math.round(d7 * this.f4576g.getResources().getDisplayMetrics().density);
    }

    @Override // io.flutter.plugin.platform.i
    public final boolean g(int i7) {
        return this.f4583n.containsKey(Integer.valueOf(i7));
    }

    @Override // io.flutter.plugin.platform.i
    public final void i(int i7) {
        if (g(i7)) {
            ((r) this.f4583n.get(Integer.valueOf(i7))).getClass();
        } else if (this.f4585p.get(i7) != null) {
            throw new ClassCastException();
        }
    }

    @Override // io.flutter.plugin.platform.i
    public final void k() {
        this.f4582m.f4549a = null;
    }
}
