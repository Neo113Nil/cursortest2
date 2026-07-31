package V2;

import java.math.BigInteger;

/* renamed from: V2.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1215q extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9562h = C1211o.f9557i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9563g;

    public C1215q(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9562h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192K1FieldElement");
        }
        this.f9563g = AbstractC1213p.c(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1213p.a(this.f9563g, ((C1215q) dVar).f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] e4 = Y2.e.e();
        AbstractC1213p.b(this.f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] e4 = Y2.e.e();
        Y2.b.d(AbstractC1213p.f9559a, ((C1215q) dVar).f9563g, e4);
        AbstractC1213p.d(e4, this.f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public int e() {
        return f9562h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1215q) {
            return Y2.e.j(this.f9563g, ((C1215q) obj).f9563g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] e4 = Y2.e.e();
        Y2.b.d(AbstractC1213p.f9559a, this.f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.e.q(this.f9563g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.e.s(this.f9563g);
    }

    public int hashCode() {
        return f9562h.hashCode() ^ Z2.a.j(this.f9563g, 0, 6);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1213p.d(this.f9563g, ((C1215q) dVar).f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] e4 = Y2.e.e();
        AbstractC1213p.f(this.f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9563g;
        if (Y2.e.s(iArr) || Y2.e.q(iArr)) {
            return this;
        }
        int[] e4 = Y2.e.e();
        AbstractC1213p.i(iArr, e4);
        AbstractC1213p.d(e4, iArr, e4);
        int[] e5 = Y2.e.e();
        AbstractC1213p.i(e4, e5);
        AbstractC1213p.d(e5, iArr, e5);
        int[] e6 = Y2.e.e();
        AbstractC1213p.j(e5, 3, e6);
        AbstractC1213p.d(e6, e5, e6);
        AbstractC1213p.j(e6, 2, e6);
        AbstractC1213p.d(e6, e4, e6);
        AbstractC1213p.j(e6, 8, e4);
        AbstractC1213p.d(e4, e6, e4);
        AbstractC1213p.j(e4, 3, e6);
        AbstractC1213p.d(e6, e5, e6);
        int[] e7 = Y2.e.e();
        AbstractC1213p.j(e6, 16, e7);
        AbstractC1213p.d(e7, e4, e7);
        AbstractC1213p.j(e7, 35, e4);
        AbstractC1213p.d(e4, e7, e4);
        AbstractC1213p.j(e4, 70, e7);
        AbstractC1213p.d(e7, e4, e7);
        AbstractC1213p.j(e7, 19, e4);
        AbstractC1213p.d(e4, e6, e4);
        AbstractC1213p.j(e4, 20, e4);
        AbstractC1213p.d(e4, e6, e4);
        AbstractC1213p.j(e4, 4, e4);
        AbstractC1213p.d(e4, e5, e4);
        AbstractC1213p.j(e4, 6, e4);
        AbstractC1213p.d(e4, e5, e4);
        AbstractC1213p.i(e4, e4);
        AbstractC1213p.i(e4, e5);
        if (Y2.e.j(iArr, e5)) {
            return new C1215q(e4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] e4 = Y2.e.e();
        AbstractC1213p.i(this.f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1213p.k(this.f9563g, ((C1215q) dVar).f9563g, e4);
        return new C1215q(e4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.e.n(this.f9563g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.e.F(this.f9563g);
    }

    protected C1215q(int[] iArr) {
        this.f9563g = iArr;
    }
}
