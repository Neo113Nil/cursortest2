package V2;

import S2.f;

/* loaded from: classes3.dex */
public class U extends f.b {
    public U(S2.c cVar, S2.d dVar, S2.d dVar2) {
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
        T t4 = (T) this.f9273b;
        T t5 = (T) this.f9274c;
        T t6 = (T) fVar.l();
        T t7 = (T) fVar.m();
        T t8 = (T) this.f9275d[0];
        T t9 = (T) fVar.n(0);
        int[] i4 = Y2.m.i(17);
        int[] i5 = Y2.m.i(17);
        int[] i6 = Y2.m.i(17);
        int[] i7 = Y2.m.i(17);
        boolean g5 = t8.g();
        if (g5) {
            iArr = t6.f9517g;
            iArr2 = t7.f9517g;
        } else {
            S.j(t8.f9517g, i6);
            S.f(i6, t6.f9517g, i5);
            S.f(i6, t8.f9517g, i6);
            S.f(i6, t7.f9517g, i6);
            iArr = i5;
            iArr2 = i6;
        }
        boolean g6 = t9.g();
        if (g6) {
            iArr3 = t4.f9517g;
            iArr4 = t5.f9517g;
            c4 = 0;
        } else {
            c4 = 0;
            S.j(t9.f9517g, i7);
            S.f(i7, t4.f9517g, i4);
            S.f(i7, t9.f9517g, i7);
            S.f(i7, t5.f9517g, i7);
            iArr3 = i4;
            iArr4 = i7;
        }
        int[] i8 = Y2.m.i(17);
        S.l(iArr3, iArr, i8);
        S.l(iArr4, iArr2, i5);
        if (Y2.m.v(17, i8)) {
            return Y2.m.v(17, i5) ? w() : g4.q();
        }
        S.j(i8, i6);
        int[] i9 = Y2.m.i(17);
        S.f(i6, i8, i9);
        S.f(i6, iArr3, i6);
        S.f(iArr4, i9, i4);
        T t10 = new T(i7);
        S.j(i5, t10.f9517g);
        int[] iArr5 = t10.f9517g;
        S.a(iArr5, i9, iArr5);
        int[] iArr6 = t10.f9517g;
        S.l(iArr6, i6, iArr6);
        int[] iArr7 = t10.f9517g;
        S.l(iArr7, i6, iArr7);
        T t11 = new T(i9);
        S.l(i6, t10.f9517g, t11.f9517g);
        S.f(t11.f9517g, i5, i5);
        S.l(i5, i4, t11.f9517g);
        T t12 = new T(i8);
        if (!g5) {
            int[] iArr8 = t12.f9517g;
            S.f(iArr8, t8.f9517g, iArr8);
        }
        if (!g6) {
            int[] iArr9 = t12.f9517g;
            S.f(iArr9, t9.f9517g, iArr9);
        }
        S2.d[] dVarArr = new S2.d[1];
        dVarArr[c4] = t12;
        return new U(g4, t10, t11, dVarArr, this.f9276e);
    }

    @Override // S2.f
    public S2.f r() {
        return o() ? this : new U(this.f9272a, this.f9273b, this.f9274c.l(), this.f9275d, this.f9276e);
    }

    @Override // S2.f
    public S2.f w() {
        if (o()) {
            return this;
        }
        S2.c g4 = g();
        T t4 = (T) this.f9274c;
        if (t4.h()) {
            return g4.q();
        }
        T t5 = (T) this.f9273b;
        T t6 = (T) this.f9275d[0];
        int[] i4 = Y2.m.i(17);
        int[] i5 = Y2.m.i(17);
        int[] i6 = Y2.m.i(17);
        S.j(t4.f9517g, i6);
        int[] i7 = Y2.m.i(17);
        S.j(i6, i7);
        boolean g5 = t6.g();
        int[] iArr = t6.f9517g;
        if (!g5) {
            S.j(iArr, i5);
            iArr = i5;
        }
        S.l(t5.f9517g, iArr, i4);
        S.a(t5.f9517g, iArr, i5);
        S.f(i5, i4, i5);
        Y2.m.c(17, i5, i5, i5);
        S.i(i5);
        S.f(i6, t5.f9517g, i6);
        Y2.m.F(17, i6, 2, 0);
        S.i(i6);
        Y2.m.G(17, i7, 3, 0, i4);
        S.i(i4);
        T t7 = new T(i7);
        S.j(i5, t7.f9517g);
        int[] iArr2 = t7.f9517g;
        S.l(iArr2, i6, iArr2);
        int[] iArr3 = t7.f9517g;
        S.l(iArr3, i6, iArr3);
        T t8 = new T(i6);
        S.l(i6, t7.f9517g, t8.f9517g);
        int[] iArr4 = t8.f9517g;
        S.f(iArr4, i5, iArr4);
        int[] iArr5 = t8.f9517g;
        S.l(iArr5, i4, iArr5);
        T t9 = new T(i5);
        S.m(t4.f9517g, t9.f9517g);
        if (!g5) {
            int[] iArr6 = t9.f9517g;
            S.f(iArr6, t6.f9517g, iArr6);
        }
        return new U(g4, t7, t8, new S2.d[]{t9}, this.f9276e);
    }

    public U(S2.c cVar, S2.d dVar, S2.d dVar2, boolean z4) {
        super(cVar, dVar, dVar2);
        if ((dVar == null) != (dVar2 == null)) {
            throw new IllegalArgumentException("Exactly one of the field elements is null");
        }
        this.f9276e = z4;
    }

    U(S2.c cVar, S2.d dVar, S2.d dVar2, S2.d[] dVarArr, boolean z4) {
        super(cVar, dVar, dVar2, dVarArr);
        this.f9276e = z4;
    }
}
