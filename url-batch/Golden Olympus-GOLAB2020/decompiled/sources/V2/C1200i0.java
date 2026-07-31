package V2;

import java.math.BigInteger;

/* renamed from: V2.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1200i0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9546g;

    public C1200i0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 163) {
            throw new IllegalArgumentException("x value invalid for SecT163FieldElement");
        }
        this.f9546g = AbstractC1198h0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.a(this.f9546g, ((C1200i0) dVar).f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.c(this.f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 163;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1200i0) {
            return Y2.e.k(this.f9546g, ((C1200i0) obj).f9546g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.i(this.f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.e.r(this.f9546g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.e.t(this.f9546g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9546g, 0, 3) ^ 163763;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.j(this.f9546g, ((C1200i0) dVar).f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9546g;
        long[] jArr2 = ((C1200i0) dVar).f9546g;
        long[] jArr3 = ((C1200i0) dVar2).f9546g;
        long[] jArr4 = ((C1200i0) dVar3).f9546g;
        long[] h4 = Y2.e.h();
        AbstractC1198h0.k(jArr, jArr2, h4);
        AbstractC1198h0.k(jArr3, jArr4, h4);
        long[] f4 = Y2.e.f();
        AbstractC1198h0.l(h4, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.n(this.f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] f4 = Y2.e.f();
        AbstractC1198h0.o(this.f9546g, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9546g;
        long[] jArr2 = ((C1200i0) dVar).f9546g;
        long[] jArr3 = ((C1200i0) dVar2).f9546g;
        long[] h4 = Y2.e.h();
        AbstractC1198h0.p(jArr, h4);
        AbstractC1198h0.k(jArr2, jArr3, h4);
        long[] f4 = Y2.e.f();
        AbstractC1198h0.l(h4, f4);
        return new C1200i0(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9546g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.e.G(this.f9546g);
    }

    protected C1200i0(long[] jArr) {
        this.f9546g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
