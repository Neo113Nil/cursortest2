package c0;

import android.view.ViewGroup;
import androidx.lifecycle.r0;
import g0.g1;
import g0.t0;
import g0.u1;
import g0.z0;
import java.util.LinkedHashMap;
import m.h0;
import r1.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class a implements u1, m, h0 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f1437f;

    /* renamed from: g, reason: collision with root package name */
    public final w f1438g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1439h;

    /* renamed from: i, reason: collision with root package name */
    public final float f1440i;

    /* renamed from: j, reason: collision with root package name */
    public final z0 f1441j;

    /* renamed from: k, reason: collision with root package name */
    public final z0 f1442k;

    /* renamed from: l, reason: collision with root package name */
    public final ViewGroup f1443l;

    /* renamed from: m, reason: collision with root package name */
    public l f1444m;

    /* renamed from: n, reason: collision with root package name */
    public final g1 f1445n;

    /* renamed from: o, reason: collision with root package name */
    public final g1 f1446o;

    /* renamed from: p, reason: collision with root package name */
    public long f1447p;

    /* renamed from: q, reason: collision with root package name */
    public int f1448q;

    /* renamed from: r, reason: collision with root package name */
    public final r0 f1449r;

    public a(boolean z8, float f9, z0 z0Var, z0 z0Var2, ViewGroup viewGroup) {
        this.f1437f = z8;
        this.f1438g = new w(new o(z0Var2, 0), z8);
        this.f1439h = z8;
        this.f1440i = f9;
        this.f1441j = z0Var;
        this.f1442k = z0Var2;
        this.f1443l = viewGroup;
        t0 t0Var = t0.f3903k;
        this.f1445n = g0.d.J(null, t0Var);
        this.f1446o = g0.d.J(Boolean.TRUE, t0Var);
        this.f1447p = 0L;
        this.f1448q = -1;
        this.f1449r = new r0(2, this);
    }

    @Override // g0.u1
    public final void b() {
        l lVar = this.f1444m;
        if (lVar != null) {
            d0();
            androidx.room.c cVar = lVar.f1483i;
            n nVar = (n) ((LinkedHashMap) cVar.f1069g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1069g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f1482h.add(nVar);
            }
        }
    }

    @Override // g0.u1
    public final void c() {
        l lVar = this.f1444m;
        if (lVar != null) {
            d0();
            androidx.room.c cVar = lVar.f1483i;
            n nVar = (n) ((LinkedHashMap) cVar.f1069g).get(this);
            if (nVar != null) {
                nVar.c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.f1069g;
                n nVar2 = (n) linkedHashMap.get(this);
                if (nVar2 != null) {
                }
                linkedHashMap.remove(this);
                lVar.f1482h.add(nVar);
            }
        }
    }

    @Override // c0.m
    public final void d0() {
        this.f1445n.setValue(null);
    }

    @Override // m.h0
    public final void e(f0 f0Var) {
        b1.c cVar = f0Var.f7767f;
        this.f1447p = cVar.d();
        float f9 = this.f1440i;
        this.f1448q = Float.isNaN(f9) ? t6.a.O(k.a(f0Var, this.f1439h, cVar.d())) : cVar.K(f9);
        long j8 = ((z0.u) this.f1441j.getValue()).f10059a;
        float f10 = ((f) this.f1442k.getValue()).f1457d;
        f0Var.b();
        this.f1438g.a(f0Var, Float.isNaN(f9) ? k.a(f0Var, this.f1437f, cVar.d()) : f0Var.y(f9), j8);
        z0.r k8 = cVar.f1234g.k();
        ((Boolean) this.f1446o.getValue()).booleanValue();
        n nVar = (n) this.f1445n.getValue();
        if (nVar != null) {
            nVar.e(f10, cVar.d(), j8);
            nVar.draw(z0.e.a(k8));
        }
    }

    @Override // g0.u1
    public final void a() {
    }
}
