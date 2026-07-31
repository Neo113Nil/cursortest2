package V2;

import S2.f;

/* loaded from: classes3.dex */
public class r extends f.b {
    public r(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C1215q c1215q = (C1215q) this.f9273b;
        C1215q c1215q2 = (C1215q) this.f9274c;
        C1215q c1215q3 = (C1215q) fVar.l();
        C1215q c1215q4 = (C1215q) fVar.m();
        C1215q c1215q5 = (C1215q) this.f9275d[0];
        C1215q c1215q6 = (C1215q) fVar.n(0);
        int[] g5 = Y2.e.g();
        int[] e4 = Y2.e.e();
        int[] e5 = Y2.e.e();
        int[] e6 = Y2.e.e();
        boolean g6 = c1215q5.g();
        if (g6) {
            iArr = c1215q3.f9563g;
            iArr2 = c1215q4.f9563g;
        } else {
            AbstractC1213p.i(c1215q5.f9563g, e5);
            AbstractC1213p.d(e5, c1215q3.f9563g, e4);
            AbstractC1213p.d(e5, c1215q5.f9563g, e5);
            AbstractC1213p.d(e5, c1215q4.f9563g, e5);
            iArr = e4;
            iArr2 = e5;
        }
        boolean g7 = c1215q6.g();
        if (g7) {
            iArr3 = c1215q.f9563g;
            iArr4 = c1215q2.f9563g;
        } else {
            AbstractC1213p.i(c1215q6.f9563g, e6);
            AbstractC1213p.d(e6, c1215q.f9563g, g5);
            AbstractC1213p.d(e6, c1215q6.f9563g, e6);
            AbstractC1213p.d(e6, c1215q2.f9563g, e6);
            iArr3 = g5;
            iArr4 = e6;
        }
        int[] e7 = Y2.e.e();
        AbstractC1213p.k(iArr3, iArr, e7);
        AbstractC1213p.k(iArr4, iArr2, e4);
        if (Y2.e.s(e7)) {
            return Y2.e.s(e4) ? w() : g4.q();
        }
        AbstractC1213p.i(e7, e5);
        int[] e8 = Y2.e.e();
        AbstractC1213p.d(e5, e7, e8);
        AbstractC1213p.d(e5, iArr3, e5);
        AbstractC1213p.f(e8, e8);
        Y2.e.v(iArr4, e8, g5);
        AbstractC1213p.h(Y2.e.b(e5, e5, e8), e8);
        C1215q c1215q7 = new C1215q(e6);
        AbstractC1213p.i(e4, c1215q7.f9563g);
        int[] iArr5 = c1215q7.f9563g;
        AbstractC1213p.k(iArr5, e8, iArr5);
        C1215q c1215q8 = new C1215q(e8);
        AbstractC1213p.k(e5, c1215q7.f9563g, c1215q8.f9563g);
        AbstractC1213p.e(c1215q8.f9563g, e4, g5);
        AbstractC1213p.g(g5, c1215q8.f9563g);
        C1215q c1215q9 = new C1215q(e7);
        if (!g6) {
            int[] iArr6 = c1215q9.f9563g;
            AbstractC1213p.d(iArr6, c1215q5.f9563g, iArr6);
        }
        if (!g7) {
            int[] iArr7 = c1215q9.f9563g;
            AbstractC1213p.d(iArr7, c1215q6.f9563g, iArr7);
        }
        return new r(g4, c1215q7, c1215q8, new S2.d[]{c1215q9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new r(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1215q c1215q = (C1215q) this.f9274c;
        if (c1215q.h()) {
            return g4.q();
        }
        C1215q c1215q2 = (C1215q) this.f9273b;
        C1215q c1215q3 = (C1215q) this.f9275d[0];
        int[] e4 = Y2.e.e();
        AbstractC1213p.i(c1215q.f9563g, e4);
        int[] e5 = Y2.e.e();
        AbstractC1213p.i(e4, e5);
        int[] e6 = Y2.e.e();
        AbstractC1213p.i(c1215q2.f9563g, e6);
        AbstractC1213p.h(Y2.e.b(e6, e6, e6), e6);
        AbstractC1213p.d(e4, c1215q2.f9563g, e4);
        AbstractC1213p.h(Y2.m.F(6, e4, 2, 0), e4);
        int[] e7 = Y2.e.e();
        AbstractC1213p.h(Y2.m.G(6, e5, 3, 0, e7), e7);
        C1215q c1215q4 = new C1215q(e5);
        AbstractC1213p.i(e6, c1215q4.f9563g);
        int[] iArr = c1215q4.f9563g;
        AbstractC1213p.k(iArr, e4, iArr);
        int[] iArr2 = c1215q4.f9563g;
        AbstractC1213p.k(iArr2, e4, iArr2);
        C1215q c1215q5 = new C1215q(e4);
        AbstractC1213p.k(e4, c1215q4.f9563g, c1215q5.f9563g);
        int[] iArr3 = c1215q5.f9563g;
        AbstractC1213p.d(iArr3, e6, iArr3);
        int[] iArr4 = c1215q5.f9563g;
        AbstractC1213p.k(iArr4, e7, iArr4);
        C1215q c1215q6 = new C1215q(e6);
        AbstractC1213p.l(c1215q.f9563g, c1215q6.f9563g);
        if (!c1215q3.g()) {
            int[] iArr5 = c1215q6.f9563g;
            AbstractC1213p.d(iArr5, c1215q3.f9563g, iArr5);
        }
        return new r(g4, c1215q4, c1215q5, new S2.d[]{c1215q6}, this.f9276e);
    }

    public r(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    r(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
