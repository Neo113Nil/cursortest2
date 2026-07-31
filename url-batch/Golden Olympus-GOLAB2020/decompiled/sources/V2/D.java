package V2;

import S2.f;

/* loaded from: classes3.dex */
public class D extends f.b {
    public D(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C c4 = (C) this.f9273b;
        C c5 = (C) this.f9274c;
        C c6 = (C) fVar.l();
        C c7 = (C) fVar.m();
        C c8 = (C) this.f9275d[0];
        C c9 = (C) fVar.n(0);
        int[] e4 = Y2.f.e();
        int[] d4 = Y2.f.d();
        int[] d5 = Y2.f.d();
        int[] d6 = Y2.f.d();
        boolean g5 = c8.g();
        if (g5) {
            iArr = c6.f9481g;
            iArr2 = c7.f9481g;
        } else {
            B.j(c8.f9481g, d5);
            B.e(d5, c6.f9481g, d4);
            B.e(d5, c8.f9481g, d5);
            B.e(d5, c7.f9481g, d5);
            iArr = d4;
            iArr2 = d5;
        }
        boolean g6 = c9.g();
        if (g6) {
            iArr3 = c4.f9481g;
            iArr4 = c5.f9481g;
        } else {
            B.j(c9.f9481g, d6);
            B.e(d6, c4.f9481g, e4);
            B.e(d6, c9.f9481g, d6);
            B.e(d6, c5.f9481g, d6);
            iArr3 = e4;
            iArr4 = d6;
        }
        int[] d7 = Y2.f.d();
        B.m(iArr3, iArr, d7);
        B.m(iArr4, iArr2, d4);
        if (Y2.f.k(d7)) {
            return Y2.f.k(d4) ? w() : g4.q();
        }
        B.j(d7, d5);
        int[] d8 = Y2.f.d();
        B.e(d5, d7, d8);
        B.e(d5, iArr3, d5);
        B.g(d8, d8);
        Y2.f.l(iArr4, d8, e4);
        B.i(Y2.f.b(d5, d5, d8), d8);
        C c10 = new C(d6);
        B.j(d4, c10.f9481g);
        int[] iArr5 = c10.f9481g;
        B.m(iArr5, d8, iArr5);
        C c11 = new C(d8);
        B.m(d5, c10.f9481g, c11.f9481g);
        B.f(c11.f9481g, d4, e4);
        B.h(e4, c11.f9481g);
        C c12 = new C(d7);
        if (!g5) {
            int[] iArr6 = c12.f9481g;
            B.e(iArr6, c8.f9481g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = c12.f9481g;
            B.e(iArr7, c9.f9481g, iArr7);
        }
        return new D(g4, c10, c11, new S2.d[]{c12}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new D(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C c4 = (C) this.f9274c;
        if (c4.h()) {
            return g4.q();
        }
        C c5 = (C) this.f9273b;
        C c6 = (C) this.f9275d[0];
        int[] d4 = Y2.f.d();
        int[] d5 = Y2.f.d();
        int[] d6 = Y2.f.d();
        B.j(c4.f9481g, d6);
        int[] d7 = Y2.f.d();
        B.j(d6, d7);
        boolean g5 = c6.g();
        int[] iArr = c6.f9481g;
        if (!g5) {
            B.j(iArr, d5);
            iArr = d5;
        }
        B.m(c5.f9481g, iArr, d4);
        B.a(c5.f9481g, iArr, d5);
        B.e(d5, d4, d5);
        B.i(Y2.f.b(d5, d5, d5), d5);
        B.e(d6, c5.f9481g, d6);
        B.i(Y2.m.F(7, d6, 2, 0), d6);
        B.i(Y2.m.G(7, d7, 3, 0, d4), d4);
        C c7 = new C(d7);
        B.j(d5, c7.f9481g);
        int[] iArr2 = c7.f9481g;
        B.m(iArr2, d6, iArr2);
        int[] iArr3 = c7.f9481g;
        B.m(iArr3, d6, iArr3);
        C c8 = new C(d6);
        B.m(d6, c7.f9481g, c8.f9481g);
        int[] iArr4 = c8.f9481g;
        B.e(iArr4, d5, iArr4);
        int[] iArr5 = c8.f9481g;
        B.m(iArr5, d4, iArr5);
        C c9 = new C(d5);
        B.n(c4.f9481g, c9.f9481g);
        if (!g5) {
            int[] iArr6 = c9.f9481g;
            B.e(iArr6, c6.f9481g, iArr6);
        }
        return new D(g4, c7, c8, new S2.d[]{c9}, this.f9276e);
    }

    public D(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    D(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
