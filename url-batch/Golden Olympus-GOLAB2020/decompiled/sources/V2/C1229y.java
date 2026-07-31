package V2;

import java.math.BigInteger;

/* renamed from: V2.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1229y extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9581h = C1226w.f9574i;

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f9582i = {868209154, -587542221, 579297866, -1014948952, -1470801668, 514782679, -1897982644};

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9583g;

    public C1229y(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9581h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP224K1FieldElement");
        }
        this.f9583g = AbstractC1228x.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] d4 = Y2.f.d();
        AbstractC1228x.a(this.f9583g, ((C1229y) dVar).f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] d4 = Y2.f.d();
        AbstractC1228x.b(this.f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] d4 = Y2.f.d();
        Y2.b.d(AbstractC1228x.f9577a, ((C1229y) dVar).f9583g, d4);
        AbstractC1228x.d(d4, this.f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public int e() {
        return f9581h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1229y) {
            return Y2.f.f(this.f9583g, ((C1229y) obj).f9583g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] d4 = Y2.f.d();
        Y2.b.d(AbstractC1228x.f9577a, this.f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.f.j(this.f9583g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.f.k(this.f9583g);
    }

    public int hashCode() {
        return f9581h.hashCode() ^ Z2.a.j(this.f9583g, 0, 7);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] d4 = Y2.f.d();
        AbstractC1228x.d(this.f9583g, ((C1229y) dVar).f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] d4 = Y2.f.d();
        AbstractC1228x.f(this.f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9583g;
        if (Y2.f.k(iArr) || Y2.f.j(iArr)) {
            return this;
        }
        int[] d4 = Y2.f.d();
        AbstractC1228x.i(iArr, d4);
        AbstractC1228x.d(d4, iArr, d4);
        AbstractC1228x.i(d4, d4);
        AbstractC1228x.d(d4, iArr, d4);
        int[] d5 = Y2.f.d();
        AbstractC1228x.i(d4, d5);
        AbstractC1228x.d(d5, iArr, d5);
        int[] d6 = Y2.f.d();
        AbstractC1228x.j(d5, 4, d6);
        AbstractC1228x.d(d6, d5, d6);
        int[] d7 = Y2.f.d();
        AbstractC1228x.j(d6, 3, d7);
        AbstractC1228x.d(d7, d4, d7);
        AbstractC1228x.j(d7, 8, d7);
        AbstractC1228x.d(d7, d6, d7);
        AbstractC1228x.j(d7, 4, d6);
        AbstractC1228x.d(d6, d5, d6);
        AbstractC1228x.j(d6, 19, d5);
        AbstractC1228x.d(d5, d7, d5);
        int[] d8 = Y2.f.d();
        AbstractC1228x.j(d5, 42, d8);
        AbstractC1228x.d(d8, d5, d8);
        AbstractC1228x.j(d8, 23, d5);
        AbstractC1228x.d(d5, d6, d5);
        AbstractC1228x.j(d5, 84, d6);
        AbstractC1228x.d(d6, d8, d6);
        AbstractC1228x.j(d6, 20, d6);
        AbstractC1228x.d(d6, d7, d6);
        AbstractC1228x.j(d6, 3, d6);
        AbstractC1228x.d(d6, iArr, d6);
        AbstractC1228x.j(d6, 2, d6);
        AbstractC1228x.d(d6, iArr, d6);
        AbstractC1228x.j(d6, 4, d6);
        AbstractC1228x.d(d6, d4, d6);
        AbstractC1228x.i(d6, d6);
        AbstractC1228x.i(d6, d8);
        if (Y2.f.f(iArr, d8)) {
            return new C1229y(d6);
        }
        AbstractC1228x.d(d6, f9582i, d6);
        AbstractC1228x.i(d6, d8);
        if (Y2.f.f(iArr, d8)) {
            return new C1229y(d6);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] d4 = Y2.f.d();
        AbstractC1228x.i(this.f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] d4 = Y2.f.d();
        AbstractC1228x.k(this.f9583g, ((C1229y) dVar).f9583g, d4);
        return new C1229y(d4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.f.h(this.f9583g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.f.t(this.f9583g);
    }

    protected C1229y(int[] iArr) {
        this.f9583g = iArr;
    }
}
