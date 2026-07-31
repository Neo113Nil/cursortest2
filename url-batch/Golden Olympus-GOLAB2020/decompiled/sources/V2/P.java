package V2;

import S2.f;

/* loaded from: classes3.dex */
public class P extends f.b {
    public P(S2.c cVar, S2.d dVar, S2.d dVar2) {
        this(cVar, dVar, dVar2, false);
    }

    @Override // S2.f
    public S2.f a(S2.f fVar) {
        int[] iArr;
        int[] iArr2;
        char c4;
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
        O o4 = (O) this.f9273b;
        O o5 = (O) this.f9274c;
        O o6 = (O) fVar.l();
        O o7 = (O) fVar.m();
        O o8 = (O) this.f9275d[0];
        O o9 = (O) fVar.n(0);
        int[] i4 = Y2.m.i(24);
        int[] i5 = Y2.m.i(24);
        int[] i6 = Y2.m.i(12);
        int[] i7 = Y2.m.i(12);
        boolean g5 = o8.g();
        if (g5) {
            iArr = o6.f9509g;
            iArr2 = o7.f9509g;
        } else {
            N.j(o8.f9509g, i6);
            N.f(i6, o6.f9509g, i5);
            N.f(i6, o8.f9509g, i6);
            N.f(i6, o7.f9509g, i6);
            iArr = i5;
            iArr2 = i6;
        }
        boolean g6 = o9.g();
        if (g6) {
            iArr3 = o4.f9509g;
            iArr4 = o5.f9509g;
            c4 = 0;
        } else {
            c4 = 0;
            N.j(o9.f9509g, i7);
            N.f(i7, o4.f9509g, i4);
            N.f(i7, o9.f9509g, i7);
            N.f(i7, o5.f9509g, i7);
            iArr3 = i4;
            iArr4 = i7;
        }
        int[] i8 = Y2.m.i(12);
        N.m(iArr3, iArr, i8);
        int[] i9 = Y2.m.i(12);
        N.m(iArr4, iArr2, i9);
        if (Y2.m.v(12, i8)) {
            return Y2.m.v(12, i9) ? w() : g4.q();
        }
        N.j(i8, i6);
        int[] i10 = Y2.m.i(12);
        N.f(i6, i8, i10);
        N.f(i6, iArr3, i6);
        N.g(i10, i10);
        Y2.i.a(iArr4, i10, i4);
        N.i(Y2.m.c(12, i6, i6, i10), i10);
        O o10 = new O(i7);
        N.j(i9, o10.f9509g);
        int[] iArr5 = o10.f9509g;
        N.m(iArr5, i10, iArr5);
        O o11 = new O(i10);
        N.m(i6, o10.f9509g, o11.f9509g);
        Y2.i.a(o11.f9509g, i9, i5);
        N.b(i4, i5, i4);
        N.h(i4, o11.f9509g);
        O o12 = new O(i8);
        if (!g5) {
            int[] iArr6 = o12.f9509g;
            N.f(iArr6, o8.f9509g, iArr6);
        }
        if (!g6) {
            int[] iArr7 = o12.f9509g;
            N.f(iArr7, o9.f9509g, iArr7);
        }
        S2.d[] dVarArr = new S2.d[1];
        dVarArr[c4] = o12;
        return new P(g4, o10, o11, dVarArr, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new P(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        O o4 = (O) this.f9274c;
        if (o4.h()) {
            return g4.q();
        }
        O o5 = (O) this.f9273b;
        O o6 = (O) this.f9275d[0];
        int[] i4 = Y2.m.i(12);
        int[] i5 = Y2.m.i(12);
        int[] i6 = Y2.m.i(12);
        N.j(o4.f9509g, i6);
        int[] i7 = Y2.m.i(12);
        N.j(i6, i7);
        boolean g5 = o6.g();
        int[] iArr = o6.f9509g;
        if (!g5) {
            N.j(iArr, i5);
            iArr = i5;
        }
        N.m(o5.f9509g, iArr, i4);
        N.a(o5.f9509g, iArr, i5);
        N.f(i5, i4, i5);
        N.i(Y2.m.c(12, i5, i5, i5), i5);
        N.f(i6, o5.f9509g, i6);
        N.i(Y2.m.F(12, i6, 2, 0), i6);
        N.i(Y2.m.G(12, i7, 3, 0, i4), i4);
        O o7 = new O(i7);
        N.j(i5, o7.f9509g);
        int[] iArr2 = o7.f9509g;
        N.m(iArr2, i6, iArr2);
        int[] iArr3 = o7.f9509g;
        N.m(iArr3, i6, iArr3);
        O o8 = new O(i6);
        N.m(i6, o7.f9509g, o8.f9509g);
        int[] iArr4 = o8.f9509g;
        N.f(iArr4, i5, iArr4);
        int[] iArr5 = o8.f9509g;
        N.m(iArr5, i4, iArr5);
        O o9 = new O(i5);
        N.n(o4.f9509g, o9.f9509g);
        if (!g5) {
            int[] iArr6 = o9.f9509g;
            N.f(iArr6, o6.f9509g, iArr6);
        }
        return new P(g4, o7, o8, new S2.d[]{o9}, this.f9276e);
    }

    public P(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    P(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
