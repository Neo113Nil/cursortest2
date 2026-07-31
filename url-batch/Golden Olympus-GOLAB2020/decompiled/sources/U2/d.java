package U2;

import S2.f;
import Y2.g;
import Y2.m;

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
        c cVar3 = (c) fVar.l();
        c cVar4 = (c) fVar.m();
        c cVar5 = (c) this.f9275d[0];
        c cVar6 = (c) fVar.n(0);
        int[] h4 = g.h();
        int[] f4 = g.f();
        int[] f5 = g.f();
        int[] f6 = g.f();
        boolean g5 = cVar5.g();
        if (g5) {
            iArr = cVar3.f9373g;
            iArr2 = cVar4.f9373g;
        } else {
            b.j(cVar5.f9373g, f5);
            b.e(f5, cVar3.f9373g, f4);
            b.e(f5, cVar5.f9373g, f5);
            b.e(f5, cVar4.f9373g, f5);
            iArr = f4;
            iArr2 = f5;
        }
        boolean g6 = cVar6.g();
        if (g6) {
            iArr3 = cVar.f9373g;
            iArr4 = cVar2.f9373g;
        } else {
            b.j(cVar6.f9373g, f6);
            b.e(f6, cVar.f9373g, h4);
            b.e(f6, cVar6.f9373g, f6);
            b.e(f6, cVar2.f9373g, f6);
            iArr3 = h4;
            iArr4 = f6;
        }
        int[] f7 = g.f();
        b.m(iArr3, iArr, f7);
        b.m(iArr4, iArr2, f4);
        if (g.t(f7)) {
            return g.t(f4) ? w() : g4.q();
        }
        b.j(f7, f5);
        int[] f8 = g.f();
        b.e(f5, f7, f8);
        b.e(f5, iArr3, f5);
        b.g(f8, f8);
        g.w(iArr4, f8, h4);
        b.i(g.b(f5, f5, f8), f8);
        c cVar7 = new c(f6);
        b.j(f4, cVar7.f9373g);
        int[] iArr5 = cVar7.f9373g;
        b.m(iArr5, f8, iArr5);
        c cVar8 = new c(f8);
        b.m(f5, cVar7.f9373g, cVar8.f9373g);
        b.f(cVar8.f9373g, f4, h4);
        b.h(h4, cVar8.f9373g);
        c cVar9 = new c(f7);
        if (!g5) {
            int[] iArr6 = cVar9.f9373g;
            b.e(iArr6, cVar5.f9373g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = cVar9.f9373g;
            b.e(iArr7, cVar6.f9373g, iArr7);
        }
        return new d(g4, cVar7, cVar8, new S2.d[]{cVar9}, this.f9276e);
    }

    @Override // S2.f
    public f r() {
        return o() ? this : new d(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        c cVar = (c) this.f9274c;
        if (cVar.h()) {
            return g4.q();
        }
        c cVar2 = (c) this.f9273b;
        c cVar3 = (c) this.f9275d[0];
        int[] f4 = g.f();
        int[] f5 = g.f();
        int[] f6 = g.f();
        b.j(cVar.f9373g, f6);
        int[] f7 = g.f();
        b.j(f6, f7);
        boolean g5 = cVar3.g();
        int[] iArr = cVar3.f9373g;
        if (!g5) {
            b.j(iArr, f5);
            iArr = f5;
        }
        b.m(cVar2.f9373g, iArr, f4);
        b.a(cVar2.f9373g, iArr, f5);
        b.e(f5, f4, f5);
        b.i(g.b(f5, f5, f5), f5);
        b.e(f6, cVar2.f9373g, f6);
        b.i(m.F(8, f6, 2, 0), f6);
        b.i(m.G(8, f7, 3, 0, f4), f4);
        c cVar4 = new c(f7);
        b.j(f5, cVar4.f9373g);
        int[] iArr2 = cVar4.f9373g;
        b.m(iArr2, f6, iArr2);
        int[] iArr3 = cVar4.f9373g;
        b.m(iArr3, f6, iArr3);
        c cVar5 = new c(f6);
        b.m(f6, cVar4.f9373g, cVar5.f9373g);
        int[] iArr4 = cVar5.f9373g;
        b.e(iArr4, f5, iArr4);
        int[] iArr5 = cVar5.f9373g;
        b.m(iArr5, f4, iArr5);
        c cVar6 = new c(f5);
        b.n(cVar.f9373g, cVar6.f9373g);
        if (!g5) {
            int[] iArr6 = cVar6.f9373g;
            b.e(iArr6, cVar3.f9373g, iArr6);
        }
        return new d(g4, cVar4, cVar5, new S2.d[]{cVar6}, this.f9276e);
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
