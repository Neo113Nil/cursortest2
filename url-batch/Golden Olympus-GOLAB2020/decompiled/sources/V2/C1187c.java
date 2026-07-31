package V2;

import java.math.BigInteger;

/* renamed from: V2.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1187c extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9531h = C1183a.f9525i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9532g;

    public C1187c(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9531h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP128R1FieldElement");
        }
        this.f9532g = AbstractC1185b.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] c4 = Y2.c.c();
        AbstractC1185b.a(this.f9532g, ((C1187c) dVar).f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] c4 = Y2.c.c();
        AbstractC1185b.b(this.f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] c4 = Y2.c.c();
        Y2.b.d(AbstractC1185b.f9527a, ((C1187c) dVar).f9532g, c4);
        AbstractC1185b.e(c4, this.f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public int e() {
        return f9531h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1187c) {
            return Y2.c.g(this.f9532g, ((C1187c) obj).f9532g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] c4 = Y2.c.c();
        Y2.b.d(AbstractC1185b.f9527a, this.f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.c.m(this.f9532g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.c.o(this.f9532g);
    }

    public int hashCode() {
        return f9531h.hashCode() ^ Z2.a.j(this.f9532g, 0, 4);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] c4 = Y2.c.c();
        AbstractC1185b.e(this.f9532g, ((C1187c) dVar).f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] c4 = Y2.c.c();
        AbstractC1185b.g(this.f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9532g;
        if (Y2.c.o(iArr) || Y2.c.m(iArr)) {
            return this;
        }
        int[] c4 = Y2.c.c();
        AbstractC1185b.j(iArr, c4);
        AbstractC1185b.e(c4, iArr, c4);
        int[] c5 = Y2.c.c();
        AbstractC1185b.k(c4, 2, c5);
        AbstractC1185b.e(c5, c4, c5);
        int[] c6 = Y2.c.c();
        AbstractC1185b.k(c5, 4, c6);
        AbstractC1185b.e(c6, c5, c6);
        AbstractC1185b.k(c6, 2, c5);
        AbstractC1185b.e(c5, c4, c5);
        AbstractC1185b.k(c5, 10, c4);
        AbstractC1185b.e(c4, c5, c4);
        AbstractC1185b.k(c4, 10, c6);
        AbstractC1185b.e(c6, c5, c6);
        AbstractC1185b.j(c6, c5);
        AbstractC1185b.e(c5, iArr, c5);
        AbstractC1185b.k(c5, 95, c5);
        AbstractC1185b.j(c5, c6);
        if (Y2.c.g(iArr, c6)) {
            return new C1187c(c5);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] c4 = Y2.c.c();
        AbstractC1185b.j(this.f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] c4 = Y2.c.c();
        AbstractC1185b.m(this.f9532g, ((C1187c) dVar).f9532g, c4);
        return new C1187c(c4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.c.k(this.f9532g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.c.v(this.f9532g);
    }

    protected C1187c(int[] iArr) {
        this.f9532g = iArr;
    }
}
