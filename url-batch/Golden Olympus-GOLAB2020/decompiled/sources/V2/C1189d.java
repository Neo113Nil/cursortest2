package V2;

import S2.f;

/* renamed from: V2.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1189d extends f.b {
    public C1189d(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C1187c c1187c = (C1187c) this.f9273b;
        C1187c c1187c2 = (C1187c) this.f9274c;
        C1187c c1187c3 = (C1187c) fVar.l();
        C1187c c1187c4 = (C1187c) fVar.m();
        C1187c c1187c5 = (C1187c) this.f9275d[0];
        C1187c c1187c6 = (C1187c) fVar.n(0);
        int[] e4 = Y2.c.e();
        int[] c4 = Y2.c.c();
        int[] c5 = Y2.c.c();
        int[] c6 = Y2.c.c();
        boolean g5 = c1187c5.g();
        if (g5) {
            iArr = c1187c3.f9532g;
            iArr2 = c1187c4.f9532g;
        } else {
            AbstractC1185b.j(c1187c5.f9532g, c5);
            AbstractC1185b.e(c5, c1187c3.f9532g, c4);
            AbstractC1185b.e(c5, c1187c5.f9532g, c5);
            AbstractC1185b.e(c5, c1187c4.f9532g, c5);
            iArr = c4;
            iArr2 = c5;
        }
        boolean g6 = c1187c6.g();
        if (g6) {
            iArr3 = c1187c.f9532g;
            iArr4 = c1187c2.f9532g;
        } else {
            AbstractC1185b.j(c1187c6.f9532g, c6);
            AbstractC1185b.e(c6, c1187c.f9532g, e4);
            AbstractC1185b.e(c6, c1187c6.f9532g, c6);
            AbstractC1185b.e(c6, c1187c2.f9532g, c6);
            iArr3 = e4;
            iArr4 = c6;
        }
        int[] c7 = Y2.c.c();
        AbstractC1185b.m(iArr3, iArr, c7);
        AbstractC1185b.m(iArr4, iArr2, c4);
        if (Y2.c.o(c7)) {
            return Y2.c.o(c4) ? w() : g4.q();
        }
        AbstractC1185b.j(c7, c5);
        int[] c8 = Y2.c.c();
        AbstractC1185b.e(c5, c7, c8);
        AbstractC1185b.e(c5, iArr3, c5);
        AbstractC1185b.g(c8, c8);
        Y2.c.q(iArr4, c8, e4);
        AbstractC1185b.i(Y2.c.b(c5, c5, c8), c8);
        C1187c c1187c7 = new C1187c(c6);
        AbstractC1185b.j(c4, c1187c7.f9532g);
        int[] iArr5 = c1187c7.f9532g;
        AbstractC1185b.m(iArr5, c8, iArr5);
        C1187c c1187c8 = new C1187c(c8);
        AbstractC1185b.m(c5, c1187c7.f9532g, c1187c8.f9532g);
        AbstractC1185b.f(c1187c8.f9532g, c4, e4);
        AbstractC1185b.h(e4, c1187c8.f9532g);
        C1187c c1187c9 = new C1187c(c7);
        if (!g5) {
            int[] iArr6 = c1187c9.f9532g;
            AbstractC1185b.e(iArr6, c1187c5.f9532g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = c1187c9.f9532g;
            AbstractC1185b.e(iArr7, c1187c6.f9532g, iArr7);
        }
        return new C1189d(g4, c1187c7, c1187c8, new S2.d[]{c1187c9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new C1189d(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1187c c1187c = (C1187c) this.f9274c;
        if (c1187c.h()) {
            return g4.q();
        }
        C1187c c1187c2 = (C1187c) this.f9273b;
        C1187c c1187c3 = (C1187c) this.f9275d[0];
        int[] c4 = Y2.c.c();
        int[] c5 = Y2.c.c();
        int[] c6 = Y2.c.c();
        AbstractC1185b.j(c1187c.f9532g, c6);
        int[] c7 = Y2.c.c();
        AbstractC1185b.j(c6, c7);
        boolean g5 = c1187c3.g();
        int[] iArr = c1187c3.f9532g;
        if (!g5) {
            AbstractC1185b.j(iArr, c5);
            iArr = c5;
        }
        AbstractC1185b.m(c1187c2.f9532g, iArr, c4);
        AbstractC1185b.a(c1187c2.f9532g, iArr, c5);
        AbstractC1185b.e(c5, c4, c5);
        AbstractC1185b.i(Y2.c.b(c5, c5, c5), c5);
        AbstractC1185b.e(c6, c1187c2.f9532g, c6);
        AbstractC1185b.i(Y2.m.F(4, c6, 2, 0), c6);
        AbstractC1185b.i(Y2.m.G(4, c7, 3, 0, c4), c4);
        C1187c c1187c4 = new C1187c(c7);
        AbstractC1185b.j(c5, c1187c4.f9532g);
        int[] iArr2 = c1187c4.f9532g;
        AbstractC1185b.m(iArr2, c6, iArr2);
        int[] iArr3 = c1187c4.f9532g;
        AbstractC1185b.m(iArr3, c6, iArr3);
        C1187c c1187c5 = new C1187c(c6);
        AbstractC1185b.m(c6, c1187c4.f9532g, c1187c5.f9532g);
        int[] iArr4 = c1187c5.f9532g;
        AbstractC1185b.e(iArr4, c5, iArr4);
        int[] iArr5 = c1187c5.f9532g;
        AbstractC1185b.m(iArr5, c4, iArr5);
        C1187c c1187c6 = new C1187c(c5);
        AbstractC1185b.n(c1187c.f9532g, c1187c6.f9532g);
        if (!g5) {
            int[] iArr6 = c1187c6.f9532g;
            AbstractC1185b.e(iArr6, c1187c3.f9532g, iArr6);
        }
        return new C1189d(g4, c1187c4, c1187c5, new S2.d[]{c1187c6}, this.f9276e);
    }

    public C1189d(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    C1189d(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
