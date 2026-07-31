package T2;

import S2.f;
import Y2.g;

/* loaded from: classes3.dex */
public class d extends f.b {
    public d(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public f a(f fVar) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (o()) {
            return fVar;
        }
        if (fVar.o()) {
            return this;
        }
        if (this == fVar) {
            return w();
        }
        S2.c g4 = g();
        c cVar = (c) this.f9273b;
        c cVar2 = (c) this.f9274c;
        c cVar3 = (c) this.f9275d[0];
        c cVar4 = (c) fVar.l();
        c cVar5 = (c) fVar.m();
        c cVar6 = (c) fVar.n(0);
        int[] h4 = g.h();
        int[] f4 = g.f();
        int[] f5 = g.f();
        int[] f6 = g.f();
        boolean g5 = cVar3.g();
        if (g5) {
            iArr = cVar4.f9325g;
            iArr2 = cVar5.f9325g;
        } else {
            b.j(cVar3.f9325g, f5);
            b.e(f5, cVar4.f9325g, f4);
            b.e(f5, cVar3.f9325g, f5);
            b.e(f5, cVar5.f9325g, f5);
            iArr = f4;
            iArr2 = f5;
        }
        boolean g6 = cVar6.g();
        if (g6) {
            iArr3 = cVar.f9325g;
            iArr4 = cVar2.f9325g;
        } else {
            b.j(cVar6.f9325g, f6);
            b.e(f6, cVar.f9325g, h4);
            b.e(f6, cVar6.f9325g, f6);
            b.e(f6, cVar2.f9325g, f6);
            iArr3 = h4;
            iArr4 = f6;
        }
        int[] f7 = g.f();
        b.n(iArr3, iArr, f7);
        b.n(iArr4, iArr2, f4);
        if (g.t(f7)) {
            return g.t(f4) ? w() : g4.q();
        }
        int[] f8 = g.f();
        b.j(f7, f8);
        int[] f9 = g.f();
        b.e(f8, f7, f9);
        b.e(f8, iArr3, f5);
        b.g(f9, f9);
        g.w(iArr4, f9, h4);
        b.i(g.b(f5, f5, f9), f9);
        c cVar7 = new c(f6);
        b.j(f4, cVar7.f9325g);
        int[] iArr5 = cVar7.f9325g;
        b.n(iArr5, f9, iArr5);
        c cVar8 = new c(f9);
        b.n(f5, cVar7.f9325g, cVar8.f9325g);
        b.f(cVar8.f9325g, f4, h4);
        b.h(h4, cVar8.f9325g);
        c cVar9 = new c(f7);
        if (!g5) {
            int[] iArr6 = cVar9.f9325g;
            b.e(iArr6, cVar3.f9325g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = cVar9.f9325g;
            b.e(iArr7, cVar6.f9325g, iArr7);
        }
        if (!g5 || !g6) {
            f8 = null;
        }
        return new d(g4, cVar7, cVar8, new S2.d[]{cVar9, x(cVar9, f8)}, this.f9276e);
    }

    @Override // S2.f
    public S2.d n(int i4) {
        return i4 == 1 ? y() : super.n(i4);
    }

    @Override // S2.f
    public f r() {
        return o() ? this : new d(g(), this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public f w() {
        if (o()) {
            return this;
        }
        return this.f9274c.h() ? g().q() : z(true);
    }

    protected c x(c cVar, int[] iArr) {
        c cVar2 = (c) g().k();
        if (cVar.g()) {
            return cVar2;
        }
        c cVar3 = new c();
        if (iArr == null) {
            iArr = cVar3.f9325g;
            b.j(cVar.f9325g, iArr);
        }
        b.j(iArr, cVar3.f9325g);
        int[] iArr2 = cVar3.f9325g;
        b.e(iArr2, cVar2.f9325g, iArr2);
        return cVar3;
    }

    protected c y() {
        S2.d[] dVarArr = this.f9275d;
        c cVar = (c) dVarArr[1];
        if (cVar != null) {
            return cVar;
        }
        c x4 = x((c) dVarArr[0], null);
        dVarArr[1] = x4;
        return x4;
    }

    protected d z(boolean z4) {
        c cVar;
        c cVar2 = (c) this.f9273b;
        c cVar3 = (c) this.f9274c;
        c cVar4 = (c) this.f9275d[0];
        c y4 = y();
        int[] f4 = g.f();
        b.j(cVar2.f9325g, f4);
        b.i(g.b(f4, f4, f4) + g.d(y4.f9325g, f4), f4);
        int[] f5 = g.f();
        b.o(cVar3.f9325g, f5);
        int[] f6 = g.f();
        b.e(f5, cVar3.f9325g, f6);
        int[] f7 = g.f();
        b.e(f6, cVar2.f9325g, f7);
        b.o(f7, f7);
        int[] f8 = g.f();
        b.j(f6, f8);
        b.o(f8, f8);
        c cVar5 = new c(f6);
        b.j(f4, cVar5.f9325g);
        int[] iArr = cVar5.f9325g;
        b.n(iArr, f7, iArr);
        int[] iArr2 = cVar5.f9325g;
        b.n(iArr2, f7, iArr2);
        c cVar6 = new c(f7);
        b.n(f7, cVar5.f9325g, cVar6.f9325g);
        int[] iArr3 = cVar6.f9325g;
        b.e(iArr3, f4, iArr3);
        int[] iArr4 = cVar6.f9325g;
        b.n(iArr4, f8, iArr4);
        c cVar7 = new c(f5);
        if (!g.r(cVar4.f9325g)) {
            int[] iArr5 = cVar7.f9325g;
            b.e(iArr5, cVar4.f9325g, iArr5);
        }
        if (z4) {
            cVar = new c(f8);
            int[] iArr6 = cVar.f9325g;
            b.e(iArr6, y4.f9325g, iArr6);
            int[] iArr7 = cVar.f9325g;
            b.o(iArr7, iArr7);
        } else {
            cVar = null;
        }
        return new d(g(), cVar5, cVar6, new S2.d[]{cVar7, cVar}, this.f9276e);
    }

    public d(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    d(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
