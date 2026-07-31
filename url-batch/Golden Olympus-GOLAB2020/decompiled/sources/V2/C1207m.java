package V2;

import java.math.BigInteger;

/* renamed from: V2.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1207m extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9554h = C1203k.f9548i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9555g;

    public C1207m(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9554h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R2FieldElement");
        }
        this.f9555g = AbstractC1205l.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1205l.a(this.f9555g, ((C1207m) dVar).f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] c4 = Y2.d.c();
        AbstractC1205l.b(this.f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] c4 = Y2.d.c();
        Y2.b.d(AbstractC1205l.f9550a, ((C1207m) dVar).f9555g, c4);
        AbstractC1205l.d(c4, this.f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public int e() {
        return f9554h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1207m) {
            return Y2.d.e(this.f9555g, ((C1207m) obj).f9555g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] c4 = Y2.d.c();
        Y2.b.d(AbstractC1205l.f9550a, this.f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.d.i(this.f9555g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.d.j(this.f9555g);
    }

    public int hashCode() {
        return f9554h.hashCode() ^ Z2.a.j(this.f9555g, 0, 5);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1205l.d(this.f9555g, ((C1207m) dVar).f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] c4 = Y2.d.c();
        AbstractC1205l.f(this.f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9555g;
        if (Y2.d.j(iArr) || Y2.d.i(iArr)) {
            return this;
        }
        int[] c4 = Y2.d.c();
        AbstractC1205l.i(iArr, c4);
        AbstractC1205l.d(c4, iArr, c4);
        int[] c5 = Y2.d.c();
        AbstractC1205l.i(c4, c5);
        AbstractC1205l.d(c5, iArr, c5);
        int[] c6 = Y2.d.c();
        AbstractC1205l.i(c5, c6);
        AbstractC1205l.d(c6, iArr, c6);
        int[] c7 = Y2.d.c();
        AbstractC1205l.j(c6, 3, c7);
        AbstractC1205l.d(c7, c5, c7);
        AbstractC1205l.j(c7, 7, c6);
        AbstractC1205l.d(c6, c7, c6);
        AbstractC1205l.j(c6, 3, c7);
        AbstractC1205l.d(c7, c5, c7);
        int[] c8 = Y2.d.c();
        AbstractC1205l.j(c7, 14, c8);
        AbstractC1205l.d(c8, c6, c8);
        AbstractC1205l.j(c8, 31, c6);
        AbstractC1205l.d(c6, c8, c6);
        AbstractC1205l.j(c6, 62, c8);
        AbstractC1205l.d(c8, c6, c8);
        AbstractC1205l.j(c8, 3, c6);
        AbstractC1205l.d(c6, c5, c6);
        AbstractC1205l.j(c6, 18, c6);
        AbstractC1205l.d(c6, c7, c6);
        AbstractC1205l.j(c6, 2, c6);
        AbstractC1205l.d(c6, iArr, c6);
        AbstractC1205l.j(c6, 3, c6);
        AbstractC1205l.d(c6, c4, c6);
        AbstractC1205l.j(c6, 6, c6);
        AbstractC1205l.d(c6, c5, c6);
        AbstractC1205l.j(c6, 2, c6);
        AbstractC1205l.d(c6, iArr, c6);
        AbstractC1205l.i(c6, c4);
        if (Y2.d.e(iArr, c4)) {
            return new C1207m(c6);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] c4 = Y2.d.c();
        AbstractC1205l.i(this.f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1205l.k(this.f9555g, ((C1207m) dVar).f9555g, c4);
        return new C1207m(c4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.d.g(this.f9555g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.d.t(this.f9555g);
    }

    protected C1207m(int[] iArr) {
        this.f9555g = iArr;
    }
}
