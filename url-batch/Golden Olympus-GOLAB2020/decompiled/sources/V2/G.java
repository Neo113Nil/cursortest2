package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class G extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9490h = E.f9484i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9491g;

    public G(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9490h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP256K1FieldElement");
        }
        this.f9491g = F.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] f4 = Y2.g.f();
        F.a(this.f9491g, ((G) dVar).f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] f4 = Y2.g.f();
        F.b(this.f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] f4 = Y2.g.f();
        Y2.b.d(F.f9486a, ((G) dVar).f9491g, f4);
        F.d(f4, this.f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public int e() {
        return f9490h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G) {
            return Y2.g.k(this.f9491g, ((G) obj).f9491g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] f4 = Y2.g.f();
        Y2.b.d(F.f9486a, this.f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.g.r(this.f9491g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.g.t(this.f9491g);
    }

    public int hashCode() {
        return f9490h.hashCode() ^ Z2.a.j(this.f9491g, 0, 8);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] f4 = Y2.g.f();
        F.d(this.f9491g, ((G) dVar).f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] f4 = Y2.g.f();
        F.f(this.f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9491g;
        if (Y2.g.t(iArr) || Y2.g.r(iArr)) {
            return this;
        }
        int[] f4 = Y2.g.f();
        F.i(iArr, f4);
        F.d(f4, iArr, f4);
        int[] f5 = Y2.g.f();
        F.i(f4, f5);
        F.d(f5, iArr, f5);
        int[] f6 = Y2.g.f();
        F.j(f5, 3, f6);
        F.d(f6, f5, f6);
        F.j(f6, 3, f6);
        F.d(f6, f5, f6);
        F.j(f6, 2, f6);
        F.d(f6, f4, f6);
        int[] f7 = Y2.g.f();
        F.j(f6, 11, f7);
        F.d(f7, f6, f7);
        F.j(f7, 22, f6);
        F.d(f6, f7, f6);
        int[] f8 = Y2.g.f();
        F.j(f6, 44, f8);
        F.d(f8, f6, f8);
        int[] f9 = Y2.g.f();
        F.j(f8, 88, f9);
        F.d(f9, f8, f9);
        F.j(f9, 44, f8);
        F.d(f8, f6, f8);
        F.j(f8, 3, f6);
        F.d(f6, f5, f6);
        F.j(f6, 23, f6);
        F.d(f6, f7, f6);
        F.j(f6, 6, f6);
        F.d(f6, f4, f6);
        F.j(f6, 2, f6);
        F.i(f6, f4);
        if (Y2.g.k(iArr, f4)) {
            return new G(f6);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] f4 = Y2.g.f();
        F.i(this.f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] f4 = Y2.g.f();
        F.k(this.f9491g, ((G) dVar).f9491g, f4);
        return new G(f4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.g.o(this.f9491g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.g.H(this.f9491g);
    }

    protected G(int[] iArr) {
        this.f9491g = iArr;
    }
}
