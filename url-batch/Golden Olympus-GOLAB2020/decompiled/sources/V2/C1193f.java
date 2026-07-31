package V2;

import S2.f;

/* renamed from: V2.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1193f extends f.b {
    public C1193f(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C1207m c1207m = (C1207m) this.f9273b;
        C1207m c1207m2 = (C1207m) this.f9274c;
        C1207m c1207m3 = (C1207m) fVar.l();
        C1207m c1207m4 = (C1207m) fVar.m();
        C1207m c1207m5 = (C1207m) this.f9275d[0];
        C1207m c1207m6 = (C1207m) fVar.n(0);
        int[] d4 = Y2.d.d();
        int[] c4 = Y2.d.c();
        int[] c5 = Y2.d.c();
        int[] c6 = Y2.d.c();
        boolean g5 = c1207m5.g();
        if (g5) {
            iArr = c1207m3.f9555g;
            iArr2 = c1207m4.f9555g;
        } else {
            AbstractC1205l.i(c1207m5.f9555g, c5);
            AbstractC1205l.d(c5, c1207m3.f9555g, c4);
            AbstractC1205l.d(c5, c1207m5.f9555g, c5);
            AbstractC1205l.d(c5, c1207m4.f9555g, c5);
            iArr = c4;
            iArr2 = c5;
        }
        boolean g6 = c1207m6.g();
        if (g6) {
            iArr3 = c1207m.f9555g;
            iArr4 = c1207m2.f9555g;
        } else {
            AbstractC1205l.i(c1207m6.f9555g, c6);
            AbstractC1205l.d(c6, c1207m.f9555g, d4);
            AbstractC1205l.d(c6, c1207m6.f9555g, c6);
            AbstractC1205l.d(c6, c1207m2.f9555g, c6);
            iArr3 = d4;
            iArr4 = c6;
        }
        int[] c7 = Y2.d.c();
        AbstractC1205l.k(iArr3, iArr, c7);
        AbstractC1205l.k(iArr4, iArr2, c4);
        if (Y2.d.j(c7)) {
            return Y2.d.j(c4) ? w() : g4.q();
        }
        AbstractC1205l.i(c7, c5);
        int[] c8 = Y2.d.c();
        AbstractC1205l.d(c5, c7, c8);
        AbstractC1205l.d(c5, iArr3, c5);
        AbstractC1205l.f(c8, c8);
        Y2.d.k(iArr4, c8, d4);
        AbstractC1205l.h(Y2.d.b(c5, c5, c8), c8);
        C1207m c1207m7 = new C1207m(c6);
        AbstractC1205l.i(c4, c1207m7.f9555g);
        int[] iArr5 = c1207m7.f9555g;
        AbstractC1205l.k(iArr5, c8, iArr5);
        C1207m c1207m8 = new C1207m(c8);
        AbstractC1205l.k(c5, c1207m7.f9555g, c1207m8.f9555g);
        AbstractC1205l.e(c1207m8.f9555g, c4, d4);
        AbstractC1205l.g(d4, c1207m8.f9555g);
        C1207m c1207m9 = new C1207m(c7);
        if (!g5) {
            int[] iArr6 = c1207m9.f9555g;
            AbstractC1205l.d(iArr6, c1207m5.f9555g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = c1207m9.f9555g;
            AbstractC1205l.d(iArr7, c1207m6.f9555g, iArr7);
        }
        return new C1193f(g4, c1207m7, c1207m8, new S2.d[]{c1207m9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new C1193f(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1207m c1207m = (C1207m) this.f9274c;
        if (c1207m.h()) {
            return g4.q();
        }
        C1207m c1207m2 = (C1207m) this.f9273b;
        C1207m c1207m3 = (C1207m) this.f9275d[0];
        int[] c4 = Y2.d.c();
        AbstractC1205l.i(c1207m.f9555g, c4);
        int[] c5 = Y2.d.c();
        AbstractC1205l.i(c4, c5);
        int[] c6 = Y2.d.c();
        AbstractC1205l.i(c1207m2.f9555g, c6);
        AbstractC1205l.h(Y2.d.b(c6, c6, c6), c6);
        AbstractC1205l.d(c4, c1207m2.f9555g, c4);
        AbstractC1205l.h(Y2.m.F(5, c4, 2, 0), c4);
        int[] c7 = Y2.d.c();
        AbstractC1205l.h(Y2.m.G(5, c5, 3, 0, c7), c7);
        C1207m c1207m4 = new C1207m(c5);
        AbstractC1205l.i(c6, c1207m4.f9555g);
        int[] iArr = c1207m4.f9555g;
        AbstractC1205l.k(iArr, c4, iArr);
        int[] iArr2 = c1207m4.f9555g;
        AbstractC1205l.k(iArr2, c4, iArr2);
        C1207m c1207m5 = new C1207m(c4);
        AbstractC1205l.k(c4, c1207m4.f9555g, c1207m5.f9555g);
        int[] iArr3 = c1207m5.f9555g;
        AbstractC1205l.d(iArr3, c6, iArr3);
        int[] iArr4 = c1207m5.f9555g;
        AbstractC1205l.k(iArr4, c7, iArr4);
        C1207m c1207m6 = new C1207m(c6);
        AbstractC1205l.l(c1207m.f9555g, c1207m6.f9555g);
        if (!c1207m3.g()) {
            int[] iArr5 = c1207m6.f9555g;
            AbstractC1205l.d(iArr5, c1207m3.f9555g, iArr5);
        }
        return new C1193f(g4, c1207m4, c1207m5, new S2.d[]{c1207m6}, this.f9276e);
    }

    public C1193f(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    C1193f(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
