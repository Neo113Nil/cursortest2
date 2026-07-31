package U2;

import Y2.g;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class c extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9372h = a.f9368i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9373g;

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9372h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SM2P256V1FieldElement");
        }
        this.f9373g = b.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] f4 = g.f();
        b.a(this.f9373g, ((c) dVar).f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] f4 = g.f();
        b.b(this.f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] f4 = g.f();
        Y2.b.d(b.f9370a, ((c) dVar).f9373g, f4);
        b.e(f4, this.f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public int e() {
        return f9372h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return g.k(this.f9373g, ((c) obj).f9373g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] f4 = g.f();
        Y2.b.d(b.f9370a, this.f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public boolean g() {
        return g.r(this.f9373g);
    }

    @Override // S2.d
    public boolean h() {
        return g.t(this.f9373g);
    }

    public int hashCode() {
        return f9372h.hashCode() ^ Z2.a.j(this.f9373g, 0, 8);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] f4 = g.f();
        b.e(this.f9373g, ((c) dVar).f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] f4 = g.f();
        b.g(this.f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9373g;
        if (g.t(iArr) || g.r(iArr)) {
            return this;
        }
        int[] f4 = g.f();
        b.j(iArr, f4);
        b.e(f4, iArr, f4);
        int[] f5 = g.f();
        b.k(f4, 2, f5);
        b.e(f5, f4, f5);
        int[] f6 = g.f();
        b.k(f5, 2, f6);
        b.e(f6, f4, f6);
        b.k(f6, 6, f4);
        b.e(f4, f6, f4);
        int[] f7 = g.f();
        b.k(f4, 12, f7);
        b.e(f7, f4, f7);
        b.k(f7, 6, f4);
        b.e(f4, f6, f4);
        b.j(f4, f6);
        b.e(f6, iArr, f6);
        b.k(f6, 31, f7);
        b.e(f7, f6, f4);
        b.k(f7, 32, f7);
        b.e(f7, f4, f7);
        b.k(f7, 62, f7);
        b.e(f7, f4, f7);
        b.k(f7, 4, f7);
        b.e(f7, f5, f7);
        b.k(f7, 32, f7);
        b.e(f7, iArr, f7);
        b.k(f7, 62, f7);
        b.j(f7, f5);
        if (g.k(iArr, f5)) {
            return new c(f7);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] f4 = g.f();
        b.j(this.f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] f4 = g.f();
        b.m(this.f9373g, ((c) dVar).f9373g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public boolean q() {
        return g.o(this.f9373g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return g.H(this.f9373g);
    }

    protected c(int[] iArr) {
        this.f9373g = iArr;
    }
}
