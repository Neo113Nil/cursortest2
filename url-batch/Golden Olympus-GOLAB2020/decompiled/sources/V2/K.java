package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class K extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9499h = I.f9494i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9500g;

    public K(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9499h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256R1FieldElement");
        }
        this.f9500g = J.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] f4 = Y2.g.f();
        J.a(this.f9500g, ((K) dVar).f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] f4 = Y2.g.f();
        J.b(this.f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] f4 = Y2.g.f();
        Y2.b.d(J.f9496a, ((K) dVar).f9500g, f4);
        J.e(f4, this.f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public int e() {
        return f9499h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof K) {
            return Y2.g.k(this.f9500g, ((K) obj).f9500g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] f4 = Y2.g.f();
        Y2.b.d(J.f9496a, this.f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.g.r(this.f9500g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.g.t(this.f9500g);
    }

    public int hashCode() {
        return f9499h.hashCode() ^ Z2.a.j(this.f9500g, 0, 8);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] f4 = Y2.g.f();
        J.e(this.f9500g, ((K) dVar).f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] f4 = Y2.g.f();
        J.g(this.f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9500g;
        if (Y2.g.t(iArr) || Y2.g.r(iArr)) {
            return this;
        }
        int[] f4 = Y2.g.f();
        int[] f5 = Y2.g.f();
        J.j(iArr, f4);
        J.e(f4, iArr, f4);
        J.k(f4, 2, f5);
        J.e(f5, f4, f5);
        J.k(f5, 4, f4);
        J.e(f4, f5, f4);
        J.k(f4, 8, f5);
        J.e(f5, f4, f5);
        J.k(f5, 16, f4);
        J.e(f4, f5, f4);
        J.k(f4, 32, f4);
        J.e(f4, iArr, f4);
        J.k(f4, 96, f4);
        J.e(f4, iArr, f4);
        J.k(f4, 94, f4);
        J.j(f4, f5);
        if (Y2.g.k(iArr, f5)) {
            return new K(f4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] f4 = Y2.g.f();
        J.j(this.f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] f4 = Y2.g.f();
        J.m(this.f9500g, ((K) dVar).f9500g, f4);
        return new K(f4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.g.o(this.f9500g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.g.H(this.f9500g);
    }

    protected K(int[] iArr) {
        this.f9500g = iArr;
    }
}
