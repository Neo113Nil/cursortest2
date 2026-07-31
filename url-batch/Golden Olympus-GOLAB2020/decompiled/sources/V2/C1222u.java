package V2;

import java.math.BigInteger;

/* renamed from: V2.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1222u extends S2.d {

    /* renamed from: h, reason: collision with root package name */
    public static final BigInteger f9572h = C1218s.f9566i;

    /* renamed from: g, reason: collision with root package name */
    protected int[] f9573g;

    public C1222u(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.compareTo(f9572h) >= 0) {
            throw new IllegalArgumentException("x value invalid for SecP192R1FieldElement");
        }
        this.f9573g = AbstractC1220t.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1220t.a(this.f9573g, ((C1222u) dVar).f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public S2.d b() {
        int[] e4 = Y2.e.e();
        AbstractC1220t.b(this.f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        int[] e4 = Y2.e.e();
        Y2.b.d(AbstractC1220t.f9568a, ((C1222u) dVar).f9573g, e4);
        AbstractC1220t.e(e4, this.f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public int e() {
        return f9572h.bitLength();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1222u) {
            return Y2.e.j(this.f9573g, ((C1222u) obj).f9573g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        int[] e4 = Y2.e.e();
        Y2.b.d(AbstractC1220t.f9568a, this.f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.e.q(this.f9573g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.e.s(this.f9573g);
    }

    public int hashCode() {
        return f9572h.hashCode() ^ Z2.a.j(this.f9573g, 0, 6);
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1220t.e(this.f9573g, ((C1222u) dVar).f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public S2.d l() {
        int[] e4 = Y2.e.e();
        AbstractC1220t.g(this.f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public S2.d m() {
        int[] iArr = this.f9573g;
        if (Y2.e.s(iArr) || Y2.e.q(iArr)) {
            return this;
        }
        int[] e4 = Y2.e.e();
        int[] e5 = Y2.e.e();
        AbstractC1220t.j(iArr, e4);
        AbstractC1220t.e(e4, iArr, e4);
        AbstractC1220t.k(e4, 2, e5);
        AbstractC1220t.e(e5, e4, e5);
        AbstractC1220t.k(e5, 4, e4);
        AbstractC1220t.e(e4, e5, e4);
        AbstractC1220t.k(e4, 8, e5);
        AbstractC1220t.e(e5, e4, e5);
        AbstractC1220t.k(e5, 16, e4);
        AbstractC1220t.e(e4, e5, e4);
        AbstractC1220t.k(e4, 32, e5);
        AbstractC1220t.e(e5, e4, e5);
        AbstractC1220t.k(e5, 64, e4);
        AbstractC1220t.e(e4, e5, e4);
        AbstractC1220t.k(e4, 62, e4);
        AbstractC1220t.j(e4, e5);
        if (Y2.e.j(iArr, e5)) {
            return new C1222u(e4);
        }
        return null;
    }

    @Override // S2.d
    public S2.d n() {
        int[] e4 = Y2.e.e();
        AbstractC1220t.j(this.f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        int[] e4 = Y2.e.e();
        AbstractC1220t.m(this.f9573g, ((C1222u) dVar).f9573g, e4);
        return new C1222u(e4);
    }

    @Override // S2.d
    public boolean q() {
        return Y2.e.n(this.f9573g, 0) == 1;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.e.F(this.f9573g);
    }

    protected C1222u(int[] iArr) {
        this.f9573g = iArr;
    }
}
