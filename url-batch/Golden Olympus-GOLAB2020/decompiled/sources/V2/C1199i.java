package V2;

import java.math.BigInteger;

/* renamed from: V2.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1199i extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9544h = C1195g.f9538i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9545g;

    public C1199i(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9544h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP160R1FieldElement");
        }
        this.f9545g = AbstractC1197h.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1197h.a(this.f9545g, ((C1199i) dVar).f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] c4 = Y2.d.c();
        AbstractC1197h.b(this.f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] c4 = Y2.d.c();
        Y2.b.d(AbstractC1197h.f9540a, ((C1199i) dVar).f9545g, c4);
        AbstractC1197h.d(c4, this.f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public int e() {
        return f9544h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1199i) {
            return Y2.d.e(this.f9545g, ((C1199i) obj).f9545g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] c4 = Y2.d.c();
        Y2.b.d(AbstractC1197h.f9540a, this.f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.d.i(this.f9545g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.d.j(this.f9545g);
    }

    public int hashCode() {
        return f9544h.hashCode() ^ Z2.a.j(this.f9545g, 0, 5);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1197h.d(this.f9545g, ((C1199i) dVar).f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] c4 = Y2.d.c();
        AbstractC1197h.f(this.f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9545g;
        if (Y2.d.j(iArr) || Y2.d.i(iArr)) {
            return this;
        }
        int[] c4 = Y2.d.c();
        AbstractC1197h.i(iArr, c4);
        AbstractC1197h.d(c4, iArr, c4);
        int[] c5 = Y2.d.c();
        AbstractC1197h.j(c4, 2, c5);
        AbstractC1197h.d(c5, c4, c5);
        AbstractC1197h.j(c5, 4, c4);
        AbstractC1197h.d(c4, c5, c4);
        AbstractC1197h.j(c4, 8, c5);
        AbstractC1197h.d(c5, c4, c5);
        AbstractC1197h.j(c5, 16, c4);
        AbstractC1197h.d(c4, c5, c4);
        AbstractC1197h.j(c4, 32, c5);
        AbstractC1197h.d(c5, c4, c5);
        AbstractC1197h.j(c5, 64, c4);
        AbstractC1197h.d(c4, c5, c4);
        AbstractC1197h.i(c4, c5);
        AbstractC1197h.d(c5, iArr, c5);
        AbstractC1197h.j(c5, 29, c5);
        AbstractC1197h.i(c5, c4);
        if (Y2.d.e(iArr, c4)) {
            return new C1199i(c5);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] c4 = Y2.d.c();
        AbstractC1197h.i(this.f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] c4 = Y2.d.c();
        AbstractC1197h.k(this.f9545g, ((C1199i) dVar).f9545g, c4);
        return new C1199i(c4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.d.g(this.f9545g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.d.t(this.f9545g);
    }

    protected C1199i(int[] iArr) {
        this.f9545g = iArr;
    }
}
