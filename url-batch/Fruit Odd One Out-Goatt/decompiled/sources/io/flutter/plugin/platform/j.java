package io.flutter.plugin.platform;

import android.util.SparseArray;
import android.view.View;
import e0.u;
import io.flutter.embedding.engine.FlutterJNI;
import java.util.HashMap;
import java.util.HashSet;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    public e0.f f514c;

    /* renamed from: d, reason: collision with root package name */
    public u f515d;

    /* renamed from: f, reason: collision with root package name */
    public io.flutter.embedding.engine.renderer.h f517f;

    /* renamed from: g, reason: collision with root package name */
    public io.flutter.plugin.editing.n f518g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.lifecycle.n f519h;
    public final c0.a u;

    /* renamed from: e, reason: collision with root package name */
    public FlutterJNI f516e = null;

    /* renamed from: p, reason: collision with root package name */
    public int f526p = 0;

    /* renamed from: q, reason: collision with root package name */
    public boolean f527q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f528r = true;
    public final androidx.lifecycle.n v = new androidx.lifecycle.n(8, this);

    /* renamed from: b, reason: collision with root package name */
    public final f0.k f513b = new f0.k(2);

    /* renamed from: j, reason: collision with root package name */
    public final HashMap f521j = new HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final a f520i = new a();

    /* renamed from: k, reason: collision with root package name */
    public final HashMap f522k = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    public final SparseArray f524n = new SparseArray();

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f529s = new HashSet();

    /* renamed from: t, reason: collision with root package name */
    public final HashSet f530t = new HashSet();

    /* renamed from: o, reason: collision with root package name */
    public final SparseArray f525o = new SparseArray();

    /* renamed from: l, reason: collision with root package name */
    public final SparseArray f523l = new SparseArray();
    public final SparseArray m = new SparseArray();

    public j() {
        if (c0.a.f63f == null) {
            c0.a.f63f = new c0.a(3);
        }
        this.u = c0.a.f63f;
    }

    public static void a(j jVar, m0.g gVar) {
        int i2 = gVar.f787c;
        if (i2 == 0 || i2 == 1) {
            return;
        }
        throw new IllegalStateException("Trying to create a view with unknown direction value: " + i2 + "(view id: " + gVar.f785a + ")");
    }

    @Override // io.flutter.plugin.platform.h
    public final void b() {
        this.f520i.f488a = null;
    }

    public final void c() {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f524n;
            if (i2 >= sparseArray.size()) {
                return;
            }
            b bVar = (b) sparseArray.valueAt(i2);
            bVar.c();
            bVar.f168a.close();
            i2++;
        }
    }

    public final void d(boolean z2) {
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.f524n;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int keyAt = sparseArray.keyAt(i2);
            b bVar = (b) sparseArray.valueAt(i2);
            if (this.f529s.contains(Integer.valueOf(keyAt))) {
                f0.c cVar = this.f515d.f219i;
                if (cVar != null) {
                    bVar.a(cVar.f269b);
                }
                z2 &= bVar.e();
            } else {
                if (!this.f527q) {
                    bVar.c();
                }
                bVar.setVisibility(8);
                this.f515d.removeView(bVar);
            }
            i2++;
        }
        int i3 = 0;
        while (true) {
            SparseArray sparseArray2 = this.m;
            if (i3 >= sparseArray2.size()) {
                return;
            }
            int keyAt2 = sparseArray2.keyAt(i3);
            View view = (View) sparseArray2.get(keyAt2);
            if (!this.f530t.contains(Integer.valueOf(keyAt2)) || (!z2 && this.f528r)) {
                view.setVisibility(8);
            } else {
                view.setVisibility(0);
            }
            i3++;
        }
    }

    @Override // io.flutter.plugin.platform.h
    public final void e(io.flutter.view.i iVar) {
        this.f520i.f488a = iVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, io.flutter.embedding.engine.renderer.k] */
    public final void f() {
        if (!this.f528r || this.f527q) {
            return;
        }
        u uVar = this.f515d;
        uVar.f215e.b();
        e0.k kVar = uVar.f214d;
        if (kVar == null) {
            e0.k kVar2 = new e0.k(uVar.getContext(), uVar.getWidth(), uVar.getHeight(), 1);
            uVar.f214d = kVar2;
            uVar.addView(kVar2);
        } else {
            kVar.g(uVar.getWidth(), uVar.getHeight());
        }
        uVar.f216f = uVar.f215e;
        e0.k kVar3 = uVar.f214d;
        uVar.f215e = kVar3;
        f0.c cVar = uVar.f219i;
        if (cVar != null) {
            kVar3.a(cVar.f269b);
        }
        this.f527q = true;
    }

    public final int g(double d2) {
        return (int) Math.round(d2 * this.f514c.getResources().getDisplayMetrics().density);
    }

    @Override // io.flutter.plugin.platform.h
    public final boolean k(int i2) {
        return this.f521j.containsKey(Integer.valueOf(i2));
    }

    @Override // io.flutter.plugin.platform.h
    public final void q(int i2) {
        if (k(i2)) {
            ((p) this.f521j.get(Integer.valueOf(i2))).getClass();
        } else {
            if (this.f523l.get(i2) == null) {
                return;
            }
            f0.l.a();
        }
    }
}
