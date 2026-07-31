package V2;

import S2.f;

/* loaded from: classes3.dex */
public class L extends f.b {
    public L(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public S2.f a(S2.f fVar) {
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
        K k4 = (K) this.f9273b;
        K k5 = (K) this.f9274c;
        K k6 = (K) fVar.l();
        K k7 = (K) fVar.m();
        K k8 = (K) this.f9275d[0];
        K k9 = (K) fVar.n(0);
        int[] h4 = Y2.g.h();
        int[] f4 = Y2.g.f();
        int[] f5 = Y2.g.f();
        int[] f6 = Y2.g.f();
        boolean g5 = k8.g();
        if (g5) {
            iArr = k6.f9500g;
            iArr2 = k7.f9500g;
        } else {
            J.j(k8.f9500g, f5);
            J.e(f5, k6.f9500g, f4);
            J.e(f5, k8.f9500g, f5);
            J.e(f5, k7.f9500g, f5);
            iArr = f4;
            iArr2 = f5;
        }
        boolean g6 = k9.g();
        if (g6) {
            iArr3 = k4.f9500g;
            iArr4 = k5.f9500g;
        } else {
            J.j(k9.f9500g, f6);
            J.e(f6, k4.f9500g, h4);
            J.e(f6, k9.f9500g, f6);
            J.e(f6, k5.f9500g, f6);
            iArr3 = h4;
            iArr4 = f6;
        }
        int[] f7 = Y2.g.f();
        J.m(iArr3, iArr, f7);
        J.m(iArr4, iArr2, f4);
        if (Y2.g.t(f7)) {
            return Y2.g.t(f4) ? w() : g4.q();
        }
        J.j(f7, f5);
        int[] f8 = Y2.g.f();
        J.e(f5, f7, f8);
        J.e(f5, iArr3, f5);
        J.g(f8, f8);
        Y2.g.w(iArr4, f8, h4);
        J.i(Y2.g.b(f5, f5, f8), f8);
        K k10 = new K(f6);
        J.j(f4, k10.f9500g);
        int[] iArr5 = k10.f9500g;
        J.m(iArr5, f8, iArr5);
        K k11 = new K(f8);
        J.m(f5, k10.f9500g, k11.f9500g);
        J.f(k11.f9500g, f4, h4);
        J.h(h4, k11.f9500g);
        K k12 = new K(f7);
        if (!g5) {
            int[] iArr6 = k12.f9500g;
            J.e(iArr6, k8.f9500g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = k12.f9500g;
            J.e(iArr7, k9.f9500g, iArr7);
        }
        return new L(g4, k10, k11, new S2.d[]{k12}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new L(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        K k4 = (K) this.f9274c;
        if (k4.h()) {
            return g4.q();
        }
        K k5 = (K) this.f9273b;
        K k6 = (K) this.f9275d[0];
        int[] f4 = Y2.g.f();
        int[] f5 = Y2.g.f();
        int[] f6 = Y2.g.f();
        J.j(k4.f9500g, f6);
        int[] f7 = Y2.g.f();
        J.j(f6, f7);
        boolean g5 = k6.g();
        int[] iArr = k6.f9500g;
        if (!g5) {
            J.j(iArr, f5);
            iArr = f5;
        }
        J.m(k5.f9500g, iArr, f4);
        J.a(k5.f9500g, iArr, f5);
        J.e(f5, f4, f5);
        J.i(Y2.g.b(f5, f5, f5), f5);
        J.e(f6, k5.f9500g, f6);
        J.i(Y2.m.F(8, f6, 2, 0), f6);
        J.i(Y2.m.G(8, f7, 3, 0, f4), f4);
        K k7 = new K(f7);
        J.j(f5, k7.f9500g);
        int[] iArr2 = k7.f9500g;
        J.m(iArr2, f6, iArr2);
        int[] iArr3 = k7.f9500g;
        J.m(iArr3, f6, iArr3);
        K k8 = new K(f6);
        J.m(f6, k7.f9500g, k8.f9500g);
        int[] iArr4 = k8.f9500g;
        J.e(iArr4, f5, iArr4);
        int[] iArr5 = k8.f9500g;
        J.m(iArr5, f4, iArr5);
        K k9 = new K(f5);
        J.n(k4.f9500g, k9.f9500g);
        if (!g5) {
            int[] iArr6 = k9.f9500g;
            J.e(iArr6, k6.f9500g, iArr6);
        }
        return new L(g4, k7, k8, new S2.d[]{k9}, this.f9276e);
    }

    public L(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    L(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
