package c0;

import a0.e0;
import c7.a0;
import d0.a1;
import d0.z0;
import r1.f0;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class q extends s0.n implements r1.k, r1.o, r1.v {
    public boolean A;

    /* renamed from: s, reason: collision with root package name */
    public final p.i f1495s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f1496t;

    /* renamed from: u, reason: collision with root package name */
    public final float f1497u;

    /* renamed from: v, reason: collision with root package name */
    public final z0 f1498v;

    /* renamed from: w, reason: collision with root package name */
    public final a1 f1499w;

    /* renamed from: x, reason: collision with root package name */
    public w f1500x;

    /* renamed from: y, reason: collision with root package name */
    public float f1501y;

    /* renamed from: z, reason: collision with root package name */
    public long f1502z = 0;
    public final i.v B = new i.v();

    public q(p.i iVar, boolean z8, float f9, z0 z0Var, a1 a1Var) {
        this.f1495s = iVar;
        this.f1496t = z8;
        this.f1497u = f9;
        this.f1498v = z0Var;
        this.f1499w = a1Var;
    }

    public abstract void A0(p.l lVar, long j8, float f9);

    public abstract void B0(f0 f0Var);

    public final void C0(p.n nVar) {
        if (nVar instanceof p.l) {
            A0((p.l) nVar, this.f1502z, this.f1501y);
        } else if (nVar instanceof p.m) {
            D0(((p.m) nVar).f6979a);
        } else if (nVar instanceof p.k) {
            D0(((p.k) nVar).f6977a);
        }
    }

    public abstract void D0(p.l lVar);

    @Override // r1.o
    public final void c(f0 f0Var) {
        f0Var.b();
        w wVar = this.f1500x;
        if (wVar != null) {
            wVar.a(f0Var, this.f1501y, this.f1498v.a());
        }
        B0(f0Var);
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    @Override // s0.n
    public final void s0() {
        a0.p(o0(), null, null, new e0(this, (h6.d) null, 3), 3);
    }

    @Override // r1.v
    public final void u(long j8) {
        this.A = true;
        m2.b bVar = r1.f.t(this).f7735v;
        this.f1502z = j1.c.o0(j8);
        float f9 = this.f1497u;
        this.f1501y = Float.isNaN(f9) ? k.a(bVar, this.f1496t, this.f1502z) : bVar.y(f9);
        i.v vVar = this.B;
        Object[] objArr = vVar.f4804a;
        int i7 = vVar.f4805b;
        for (int i8 = 0; i8 < i7; i8++) {
            C0((p.n) objArr[i8]);
        }
        e6.k.c0(0, vVar.f4805b, null, vVar.f4804a);
        vVar.f4805b = 0;
    }
}
