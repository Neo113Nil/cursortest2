package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class O extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9508h = M.f9501i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9509g;

    public O(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9508h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP384R1FieldElement");
        }
        this.f9509g = N.e(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] i4 = Y2.m.i(12);
        N.a(this.f9509g, ((O) dVar).f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] i4 = Y2.m.i(12);
        N.c(this.f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] i4 = Y2.m.i(12);
        Y2.b.d(N.f9504a, ((O) dVar).f9509g, i4);
        N.f(i4, this.f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public int e() {
        return f9508h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof O) {
            return Y2.m.m(12, this.f9509g, ((O) obj).f9509g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] i4 = Y2.m.i(12);
        Y2.b.d(N.f9504a, this.f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.m.u(12, this.f9509g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.m.v(12, this.f9509g);
    }

    public int hashCode() {
        return f9508h.hashCode() ^ Z2.a.j(this.f9509g, 0, 12);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] i4 = Y2.m.i(12);
        N.f(this.f9509g, ((O) dVar).f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] i4 = Y2.m.i(12);
        N.g(this.f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9509g;
        if (Y2.m.v(12, iArr) || Y2.m.u(12, iArr)) {
            return this;
        }
        int[] i4 = Y2.m.i(12);
        int[] i5 = Y2.m.i(12);
        int[] i6 = Y2.m.i(12);
        int[] i7 = Y2.m.i(12);
        N.j(iArr, i4);
        N.f(i4, iArr, i4);
        N.k(i4, 2, i5);
        N.f(i5, i4, i5);
        N.j(i5, i5);
        N.f(i5, iArr, i5);
        N.k(i5, 5, i6);
        N.f(i6, i5, i6);
        N.k(i6, 5, i7);
        N.f(i7, i5, i7);
        N.k(i7, 15, i5);
        N.f(i5, i7, i5);
        N.k(i5, 2, i6);
        N.f(i4, i6, i4);
        N.k(i6, 28, i6);
        N.f(i5, i6, i5);
        N.k(i5, 60, i6);
        N.f(i6, i5, i6);
        N.k(i6, 120, i5);
        N.f(i5, i6, i5);
        N.k(i5, 15, i5);
        N.f(i5, i7, i5);
        N.k(i5, 33, i5);
        N.f(i5, i4, i5);
        N.k(i5, 64, i5);
        N.f(i5, iArr, i5);
        N.k(i5, 30, i4);
        N.j(i4, i5);
        if (Y2.m.m(12, iArr, i5)) {
            return new O(i4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] i4 = Y2.m.i(12);
        N.j(this.f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] i4 = Y2.m.i(12);
        N.m(this.f9509g, ((O) dVar).f9509g, i4);
        return new O(i4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.m.o(this.f9509g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.m.O(12, this.f9509g);
    }

    protected O(int[] iArr) {
        this.f9509g = iArr;
    }
}
