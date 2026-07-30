package m;

import r1.n1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z extends r1.m implements x0.c, n1, r1.p, x0.o {

    /* renamed from: u, reason: collision with root package name */
    public x0.q f6284u;

    /* renamed from: v, reason: collision with root package name */
    public final y f6285v;

    /* renamed from: w, reason: collision with root package name */
    public final a0 f6286w;

    /* renamed from: x, reason: collision with root package name */
    public final b0 f6287x;

    public z(p.j jVar) {
        y yVar = new y();
        yVar.f6282s = jVar;
        A0(yVar);
        this.f6285v = yVar;
        a0 a0Var = new a0();
        A0(a0Var);
        this.f6286w = a0Var;
        b0 b0Var = new b0();
        A0(b0Var);
        this.f6287x = b0Var;
        A0(new x0.r());
    }

    public final void D0(p.j jVar) {
        p.d dVar;
        y yVar = this.f6285v;
        if (r6.k.a(yVar.f6282s, jVar)) {
            return;
        }
        p.j jVar2 = yVar.f6282s;
        if (jVar2 != null && (dVar = yVar.f6283t) != null) {
            jVar2.c(new p.e(dVar));
        }
        yVar.f6283t = null;
        yVar.f6282s = jVar;
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        x0.q qVar = this.f6284u;
        boolean z8 = false;
        if (qVar != null && qVar.a()) {
            z8 = true;
        }
        x6.e[] eVarArr = y1.r.f9886a;
        y1.s sVar = y1.p.f9869k;
        x6.e eVar = y1.r.f9886a[4];
        sVar.a(iVar, Boolean.valueOf(z8));
        iVar.m(y1.h.f9826u, new y1.a(null, new androidx.lifecycle.r0(20, this)));
    }

    @Override // r1.p
    public final void V(r1.a1 a1Var) {
        this.f6287x.V(a1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // x0.c
    public final void m0(x0.q qVar) {
        c0 A0;
        if (r6.k.a(this.f6284u, qVar)) {
            return;
        }
        boolean a3 = qVar.a();
        s.u uVar = null;
        Object[] objArr = 0;
        if (a3) {
            c7.a0.p(o0(), null, null, new f4.c(this, objArr == true ? 1 : 0, 6), 3);
        }
        if (this.f8116r) {
            r1.f.o(this);
        }
        y yVar = this.f6285v;
        p.j jVar = yVar.f6282s;
        if (jVar != null) {
            if (a3) {
                p.d dVar = yVar.f6283t;
                if (dVar != null) {
                    yVar.A0(jVar, new p.e(dVar));
                    yVar.f6283t = null;
                }
                p.d dVar2 = new p.d();
                yVar.A0(jVar, dVar2);
                yVar.f6283t = dVar2;
            } else {
                p.d dVar3 = yVar.f6283t;
                if (dVar3 != null) {
                    yVar.A0(jVar, new p.e(dVar3));
                    yVar.f6283t = null;
                }
            }
        }
        b0 b0Var = this.f6287x;
        if (a3 != b0Var.f6118s) {
            if (a3) {
                r1.a1 a1Var = b0Var.f6119t;
                if (a1Var != null && a1Var.M0().f8116r && (A0 = b0Var.A0()) != null) {
                    A0.A0(b0Var.f6119t);
                }
            } else {
                c0 A02 = b0Var.A0();
                if (A02 != null) {
                    A02.A0(null);
                }
            }
            b0Var.f6118s = a3;
        }
        a0 a0Var = this.f6286w;
        if (a3) {
            a0Var.getClass();
            r6.v vVar = new r6.v();
            r1.f.q(a0Var, new a0.b1(vVar, 4, a0Var));
            s.u uVar2 = (s.u) vVar.f7968f;
            if (uVar2 != null) {
                uVar2.a();
                uVar = uVar2;
            }
            a0Var.f6105s = uVar;
        } else {
            s.u uVar3 = a0Var.f6105s;
            if (uVar3 != null) {
                uVar3.b();
            }
            a0Var.f6105s = null;
        }
        a0Var.f6106t = a3;
        this.f6284u = qVar;
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }
}
