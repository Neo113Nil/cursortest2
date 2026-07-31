package V2;

import S2.f;

/* renamed from: V2.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1230z extends f.b {
    public C1230z(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C1229y c1229y = (C1229y) this.f9273b;
        C1229y c1229y2 = (C1229y) this.f9274c;
        C1229y c1229y3 = (C1229y) fVar.l();
        C1229y c1229y4 = (C1229y) fVar.m();
        C1229y c1229y5 = (C1229y) this.f9275d[0];
        C1229y c1229y6 = (C1229y) fVar.n(0);
        int[] e4 = Y2.f.e();
        int[] d4 = Y2.f.d();
        int[] d5 = Y2.f.d();
        int[] d6 = Y2.f.d();
        boolean g5 = c1229y5.g();
        if (g5) {
            iArr = c1229y3.f9583g;
            iArr2 = c1229y4.f9583g;
        } else {
            AbstractC1228x.i(c1229y5.f9583g, d5);
            AbstractC1228x.d(d5, c1229y3.f9583g, d4);
            AbstractC1228x.d(d5, c1229y5.f9583g, d5);
            AbstractC1228x.d(d5, c1229y4.f9583g, d5);
            iArr = d4;
            iArr2 = d5;
        }
        boolean g6 = c1229y6.g();
        if (g6) {
            iArr3 = c1229y.f9583g;
            iArr4 = c1229y2.f9583g;
        } else {
            AbstractC1228x.i(c1229y6.f9583g, d6);
            AbstractC1228x.d(d6, c1229y.f9583g, e4);
            AbstractC1228x.d(d6, c1229y6.f9583g, d6);
            AbstractC1228x.d(d6, c1229y2.f9583g, d6);
            iArr3 = e4;
            iArr4 = d6;
        }
        int[] d7 = Y2.f.d();
        AbstractC1228x.k(iArr3, iArr, d7);
        AbstractC1228x.k(iArr4, iArr2, d4);
        if (Y2.f.k(d7)) {
            return Y2.f.k(d4) ? w() : g4.q();
        }
        AbstractC1228x.i(d7, d5);
        int[] d8 = Y2.f.d();
        AbstractC1228x.d(d5, d7, d8);
        AbstractC1228x.d(d5, iArr3, d5);
        AbstractC1228x.f(d8, d8);
        Y2.f.l(iArr4, d8, e4);
        AbstractC1228x.h(Y2.f.b(d5, d5, d8), d8);
        C1229y c1229y7 = new C1229y(d6);
        AbstractC1228x.i(d4, c1229y7.f9583g);
        int[] iArr5 = c1229y7.f9583g;
        AbstractC1228x.k(iArr5, d8, iArr5);
        C1229y c1229y8 = new C1229y(d8);
        AbstractC1228x.k(d5, c1229y7.f9583g, c1229y8.f9583g);
        AbstractC1228x.e(c1229y8.f9583g, d4, e4);
        AbstractC1228x.g(e4, c1229y8.f9583g);
        C1229y c1229y9 = new C1229y(d7);
        if (!g5) {
            int[] iArr6 = c1229y9.f9583g;
            AbstractC1228x.d(iArr6, c1229y5.f9583g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = c1229y9.f9583g;
            AbstractC1228x.d(iArr7, c1229y6.f9583g, iArr7);
        }
        return new C1230z(g4, c1229y7, c1229y8, new S2.d[]{c1229y9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new C1230z(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1229y c1229y = (C1229y) this.f9274c;
        if (c1229y.h()) {
            return g4.q();
        }
        C1229y c1229y2 = (C1229y) this.f9273b;
        C1229y c1229y3 = (C1229y) this.f9275d[0];
        int[] d4 = Y2.f.d();
        AbstractC1228x.i(c1229y.f9583g, d4);
        int[] d5 = Y2.f.d();
        AbstractC1228x.i(d4, d5);
        int[] d6 = Y2.f.d();
        AbstractC1228x.i(c1229y2.f9583g, d6);
        AbstractC1228x.h(Y2.f.b(d6, d6, d6), d6);
        AbstractC1228x.d(d4, c1229y2.f9583g, d4);
        AbstractC1228x.h(Y2.m.F(7, d4, 2, 0), d4);
        int[] d7 = Y2.f.d();
        AbstractC1228x.h(Y2.m.G(7, d5, 3, 0, d7), d7);
        C1229y c1229y4 = new C1229y(d5);
        AbstractC1228x.i(d6, c1229y4.f9583g);
        int[] iArr = c1229y4.f9583g;
        AbstractC1228x.k(iArr, d4, iArr);
        int[] iArr2 = c1229y4.f9583g;
        AbstractC1228x.k(iArr2, d4, iArr2);
        C1229y c1229y5 = new C1229y(d4);
        AbstractC1228x.k(d4, c1229y4.f9583g, c1229y5.f9583g);
        int[] iArr3 = c1229y5.f9583g;
        AbstractC1228x.d(iArr3, d6, iArr3);
        int[] iArr4 = c1229y5.f9583g;
        AbstractC1228x.k(iArr4, d7, iArr4);
        C1229y c1229y6 = new C1229y(d6);
        AbstractC1228x.l(c1229y.f9583g, c1229y6.f9583g);
        if (!c1229y3.g()) {
            int[] iArr5 = c1229y6.f9583g;
            AbstractC1228x.d(iArr5, c1229y3.f9583g, iArr5);
        }
        return new C1230z(g4, c1229y4, c1229y5, new S2.d[]{c1229y6}, this.f9276e);
    }

    public C1230z(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    C1230z(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
