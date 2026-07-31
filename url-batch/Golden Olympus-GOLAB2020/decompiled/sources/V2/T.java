package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class T extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9516h = Q.f9511i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9517g;

    public T(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9516h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP521R1FieldElement");
        }
        this.f9517g = S.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] i4 = Y2.m.i(17);
        S.a(this.f9517g, ((T) dVar).f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] i4 = Y2.m.i(17);
        S.b(this.f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] i4 = Y2.m.i(17);
        Y2.b.d(S.f9514a, ((T) dVar).f9517g, i4);
        S.f(i4, this.f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public int e() {
        return f9516h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            return Y2.m.m(17, this.f9517g, ((T) obj).f9517g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] i4 = Y2.m.i(17);
        Y2.b.d(S.f9514a, this.f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.m.u(17, this.f9517g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.m.v(17, this.f9517g);
    }

    public int hashCode() {
        return f9516h.hashCode() ^ Z2.a.j(this.f9517g, 0, 17);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] i4 = Y2.m.i(17);
        S.f(this.f9517g, ((T) dVar).f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] i4 = Y2.m.i(17);
        S.g(this.f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9517g;
        if (Y2.m.v(17, iArr) || Y2.m.u(17, iArr)) {
            return this;
        }
        int[] i4 = Y2.m.i(17);
        int[] i5 = Y2.m.i(17);
        S.k(iArr, 519, i4);
        S.j(i4, i5);
        if (Y2.m.m(17, iArr, i5)) {
            return new T(i4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] i4 = Y2.m.i(17);
        S.j(this.f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] i4 = Y2.m.i(17);
        S.l(this.f9517g, ((T) dVar).f9517g, i4);
        return new T(i4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.m.o(this.f9517g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.m.O(17, this.f9517g);
    }

    protected T(int[] iArr) {
        this.f9517g = iArr;
    }
}
