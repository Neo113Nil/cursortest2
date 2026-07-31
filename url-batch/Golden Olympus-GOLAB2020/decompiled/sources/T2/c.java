package T2;

import Y2.g;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class c extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9323h = a.f9319i;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f9324i = {1242472624, -991028441, -1389370248, 792926214, 1039914919, 726466713, 1338105611, 730014848};

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9325g;

    public c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9323h) >= 0) {
            throw new IllegalArgumentException("x value invalid for Curve25519FieldElement");
        }
        this.f9325g = b.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] f4 = g.f();
        b.a(this.f9325g, ((c) dVar).f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] f4 = g.f();
        b.b(this.f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] f4 = g.f();
        Y2.b.d(b.f9321a, ((c) dVar).f9325g, f4);
        b.e(f4, this.f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public int e() {
        return f9323h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c) {
            return g.k(this.f9325g, ((c) obj).f9325g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] f4 = g.f();
        Y2.b.d(b.f9321a, this.f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public boolean g() {
        return g.r(this.f9325g);
    }

    @Override // S2.d
    public boolean h() {
        return g.t(this.f9325g);
    }

    public int hashCode() {
        return f9323h.hashCode() ^ Z2.a.j(this.f9325g, 0, 8);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] f4 = g.f();
        b.e(this.f9325g, ((c) dVar).f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] f4 = g.f();
        b.g(this.f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9325g;
        if (g.t(iArr) || g.r(iArr)) {
            return this;
        }
        int[] f4 = g.f();
        b.j(iArr, f4);
        b.e(f4, iArr, f4);
        b.j(f4, f4);
        b.e(f4, iArr, f4);
        int[] f5 = g.f();
        b.j(f4, f5);
        b.e(f5, iArr, f5);
        int[] f6 = g.f();
        b.k(f5, 3, f6);
        b.e(f6, f4, f6);
        b.k(f6, 4, f4);
        b.e(f4, f5, f4);
        b.k(f4, 4, f6);
        b.e(f6, f5, f6);
        b.k(f6, 15, f5);
        b.e(f5, f6, f5);
        b.k(f5, 30, f6);
        b.e(f6, f5, f6);
        b.k(f6, 60, f5);
        b.e(f5, f6, f5);
        b.k(f5, 11, f6);
        b.e(f6, f4, f6);
        b.k(f6, 120, f4);
        b.e(f4, f5, f4);
        b.j(f4, f4);
        b.j(f4, f5);
        if (g.k(iArr, f5)) {
            return new c(f4);
        }
        b.e(f4, f9324i, f4);
        b.j(f4, f5);
        if (g.k(iArr, f5)) {
            return new c(f4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] f4 = g.f();
        b.j(this.f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] f4 = g.f();
        b.n(this.f9325g, ((c) dVar).f9325g, f4);
        return new c(f4);
    }

    @Override // S2.d
    public boolean q() {
        return g.o(this.f9325g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return g.H(this.f9325g);
    }

    public c() {
        this.f9325g = g.f();
    }

    protected c(int[] iArr) {
        this.f9325g = iArr;
    }
}
