package V2;

import S2.f;

/* renamed from: V2.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1201j extends f.b {
    public C1201j(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        C1199i c1199i = (C1199i) this.f9273b;
        C1199i c1199i2 = (C1199i) this.f9274c;
        C1199i c1199i3 = (C1199i) fVar.l();
        C1199i c1199i4 = (C1199i) fVar.m();
        C1199i c1199i5 = (C1199i) this.f9275d[0];
        C1199i c1199i6 = (C1199i) fVar.n(0);
        int[] d4 = Y2.d.d();
        int[] c4 = Y2.d.c();
        int[] c5 = Y2.d.c();
        int[] c6 = Y2.d.c();
        boolean g5 = c1199i5.g();
        if (g5) {
            iArr = c1199i3.f9545g;
            iArr2 = c1199i4.f9545g;
        } else {
            AbstractC1197h.i(c1199i5.f9545g, c5);
            AbstractC1197h.d(c5, c1199i3.f9545g, c4);
            AbstractC1197h.d(c5, c1199i5.f9545g, c5);
            AbstractC1197h.d(c5, c1199i4.f9545g, c5);
            iArr = c4;
            iArr2 = c5;
        }
        boolean g6 = c1199i6.g();
        if (g6) {
            iArr3 = c1199i.f9545g;
            iArr4 = c1199i2.f9545g;
        } else {
            AbstractC1197h.i(c1199i6.f9545g, c6);
            AbstractC1197h.d(c6, c1199i.f9545g, d4);
            AbstractC1197h.d(c6, c1199i6.f9545g, c6);
            AbstractC1197h.d(c6, c1199i2.f9545g, c6);
            iArr3 = d4;
            iArr4 = c6;
        }
        int[] c7 = Y2.d.c();
        AbstractC1197h.k(iArr3, iArr, c7);
        AbstractC1197h.k(iArr4, iArr2, c4);
        if (Y2.d.j(c7)) {
            return Y2.d.j(c4) ? w() : g4.q();
        }
        AbstractC1197h.i(c7, c5);
        int[] c8 = Y2.d.c();
        AbstractC1197h.d(c5, c7, c8);
        AbstractC1197h.d(c5, iArr3, c5);
        AbstractC1197h.f(c8, c8);
        Y2.d.k(iArr4, c8, d4);
        AbstractC1197h.h(Y2.d.b(c5, c5, c8), c8);
        C1199i c1199i7 = new C1199i(c6);
        AbstractC1197h.i(c4, c1199i7.f9545g);
        int[] iArr5 = c1199i7.f9545g;
        AbstractC1197h.k(iArr5, c8, iArr5);
        C1199i c1199i8 = new C1199i(c8);
        AbstractC1197h.k(c5, c1199i7.f9545g, c1199i8.f9545g);
        AbstractC1197h.e(c1199i8.f9545g, c4, d4);
        AbstractC1197h.g(d4, c1199i8.f9545g);
        C1199i c1199i9 = new C1199i(c7);
        if (!g5) {
            int[] iArr6 = c1199i9.f9545g;
            AbstractC1197h.d(iArr6, c1199i5.f9545g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = c1199i9.f9545g;
            AbstractC1197h.d(iArr7, c1199i6.f9545g, iArr7);
        }
        return new C1201j(g4, c1199i7, c1199i8, new S2.d[]{c1199i9}, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new C1201j(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        C1199i c1199i = (C1199i) this.f9274c;
        if (c1199i.h()) {
            return g4.q();
        }
        C1199i c1199i2 = (C1199i) this.f9273b;
        C1199i c1199i3 = (C1199i) this.f9275d[0];
        int[] c4 = Y2.d.c();
        int[] c5 = Y2.d.c();
        int[] c6 = Y2.d.c();
        AbstractC1197h.i(c1199i.f9545g, c6);
        int[] c7 = Y2.d.c();
        AbstractC1197h.i(c6, c7);
        boolean g5 = c1199i3.g();
        int[] iArr = c1199i3.f9545g;
        if (!g5) {
            AbstractC1197h.i(iArr, c5);
            iArr = c5;
        }
        AbstractC1197h.k(c1199i2.f9545g, iArr, c4);
        AbstractC1197h.a(c1199i2.f9545g, iArr, c5);
        AbstractC1197h.d(c5, c4, c5);
        AbstractC1197h.h(Y2.d.b(c5, c5, c5), c5);
        AbstractC1197h.d(c6, c1199i2.f9545g, c6);
        AbstractC1197h.h(Y2.m.F(5, c6, 2, 0), c6);
        AbstractC1197h.h(Y2.m.G(5, c7, 3, 0, c4), c4);
        C1199i c1199i4 = new C1199i(c7);
        AbstractC1197h.i(c5, c1199i4.f9545g);
        int[] iArr2 = c1199i4.f9545g;
        AbstractC1197h.k(iArr2, c6, iArr2);
        int[] iArr3 = c1199i4.f9545g;
        AbstractC1197h.k(iArr3, c6, iArr3);
        C1199i c1199i5 = new C1199i(c6);
        AbstractC1197h.k(c6, c1199i4.f9545g, c1199i5.f9545g);
        int[] iArr4 = c1199i5.f9545g;
        AbstractC1197h.d(iArr4, c5, iArr4);
        int[] iArr5 = c1199i5.f9545g;
        AbstractC1197h.k(iArr5, c4, iArr5);
        C1199i c1199i6 = new C1199i(c5);
        AbstractC1197h.l(c1199i.f9545g, c1199i6.f9545g);
        if (!g5) {
            int[] iArr6 = c1199i6.f9545g;
            AbstractC1197h.d(iArr6, c1199i3.f9545g, iArr6);
        }
        return new C1201j(g4, c1199i4, c1199i5, new S2.d[]{c1199i6}, this.f9276e);
    }

    public C1201j(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    C1201j(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
