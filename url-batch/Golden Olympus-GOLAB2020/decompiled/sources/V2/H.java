package V2;

import S2.f;

/* loaded from: classes3.dex */
public class H extends f.b {
    public H(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        G g5 = (G) this.f9273b;
        G g6 = (G) this.f9274c;
        G g7 = (G) fVar.l();
        G g8 = (G) fVar.m();
        G g9 = (G) this.f9275d[0];
        G g10 = (G) fVar.n(0);
        int[] h4 = Y2.g.h();
        int[] f4 = Y2.g.f();
        int[] f5 = Y2.g.f();
        int[] f6 = Y2.g.f();
        boolean g11 = g9.g();
        if (g11) {
            iArr = g7.f9491g;
            iArr2 = g8.f9491g;
        } else {
            F.i(g9.f9491g, f5);
            F.d(f5, g7.f9491g, f4);
            F.d(f5, g9.f9491g, f5);
            F.d(f5, g8.f9491g, f5);
            iArr = f4;
            iArr2 = f5;
        }
        boolean g12 = g10.g();
        if (g12) {
            iArr3 = g5.f9491g;
            iArr4 = g6.f9491g;
        } else {
            F.i(g10.f9491g, f6);
            F.d(f6, g5.f9491g, h4);
            F.d(f6, g10.f9491g, f6);
            F.d(f6, g6.f9491g, f6);
            iArr3 = h4;
            iArr4 = f6;
        }
        int[] f7 = Y2.g.f();
        F.k(iArr3, iArr, f7);
        F.k(iArr4, iArr2, f4);
        if (Y2.g.t(f7)) {
            return Y2.g.t(f4) ? w() : g4.q();
        }
        F.i(f7, f5);
        int[] f8 = Y2.g.f();
        F.d(f5, f7, f8);
        F.d(f5, iArr3, f5);
        F.f(f8, f8);
        Y2.g.w(iArr4, f8, h4);
        F.h(Y2.g.b(f5, f5, f8), f8);
        G g13 = new G(f6);
        F.i(f4, g13.f9491g);
        int[] iArr5 = g13.f9491g;
        F.k(iArr5, f8, iArr5);
        G g14 = new G(f8);
        F.k(f5, g13.f9491g, g14.f9491g);
        F.e(g14.f9491g, f4, h4);
        F.g(h4, g14.f9491g);
        G g15 = new G(f7);
        if (!g11) {
            int[] iArr6 = g15.f9491g;
            F.d(iArr6, g9.f9491g, iArr6);
        }
        if (!g12) {
            int[] iArr7 = g15.f9491g;
            F.d(iArr7, g10.f9491g, iArr7);
        }
        return new H(g4, g13, g14, new S2.d[]{g15}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new H(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        G g5 = (G) this.f9274c;
        if (g5.h()) {
            return g4.q();
        }
        G g6 = (G) this.f9273b;
        G g7 = (G) this.f9275d[0];
        int[] f4 = Y2.g.f();
        F.i(g5.f9491g, f4);
        int[] f5 = Y2.g.f();
        F.i(f4, f5);
        int[] f6 = Y2.g.f();
        F.i(g6.f9491g, f6);
        F.h(Y2.g.b(f6, f6, f6), f6);
        F.d(f4, g6.f9491g, f4);
        F.h(Y2.m.F(8, f4, 2, 0), f4);
        int[] f7 = Y2.g.f();
        F.h(Y2.m.G(8, f5, 3, 0, f7), f7);
        G g8 = new G(f5);
        F.i(f6, g8.f9491g);
        int[] iArr = g8.f9491g;
        F.k(iArr, f4, iArr);
        int[] iArr2 = g8.f9491g;
        F.k(iArr2, f4, iArr2);
        G g9 = new G(f4);
        F.k(f4, g8.f9491g, g9.f9491g);
        int[] iArr3 = g9.f9491g;
        F.d(iArr3, f6, iArr3);
        int[] iArr4 = g9.f9491g;
        F.k(iArr4, f7, iArr4);
        G g10 = new G(f6);
        F.l(g5.f9491g, g10.f9491g);
        if (!g7.g()) {
            int[] iArr5 = g10.f9491g;
            F.d(iArr5, g7.f9491g, iArr5);
        }
        return new H(g4, g8, g9, new S2.d[]{g10}, this.f9276e);
    }

    public H(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    H(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
