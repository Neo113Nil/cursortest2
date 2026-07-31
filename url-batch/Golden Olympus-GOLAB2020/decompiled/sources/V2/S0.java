package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class S0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9515g;

    public S0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 571) {
            throw new IllegalArgumentException("x value invalid for SecT571FieldElement");
        }
        this.f9515g = R0.g(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] a4 = Y2.l.a();
        R0.b(this.f9515g, ((S0) dVar).f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] a4 = Y2.l.a();
        R0.f(this.f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 571;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof S0) {
            return Y2.l.c(this.f9515g, ((S0) obj).f9515g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] a4 = Y2.l.a();
        R0.k(this.f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.l.e(this.f9515g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.l.f(this.f9515g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9515g, 0, 9) ^ 5711052;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] a4 = Y2.l.a();
        R0.l(this.f9515g, ((S0) dVar).f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9515g;
        long[] jArr2 = ((S0) dVar).f9515g;
        long[] jArr3 = ((S0) dVar2).f9515g;
        long[] jArr4 = ((S0) dVar3).f9515g;
        long[] b4 = Y2.l.b();
        R0.m(jArr, jArr2, b4);
        R0.m(jArr3, jArr4, b4);
        long[] a4 = Y2.l.a();
        R0.p(b4, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] a4 = Y2.l.a();
        R0.r(this.f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] a4 = Y2.l.a();
        R0.s(this.f9515g, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9515g;
        long[] jArr2 = ((S0) dVar).f9515g;
        long[] jArr3 = ((S0) dVar2).f9515g;
        long[] b4 = Y2.l.b();
        R0.t(jArr, b4);
        R0.m(jArr2, jArr3, b4);
        long[] a4 = Y2.l.a();
        R0.p(b4, a4);
        return new S0(a4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9515g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.l.g(this.f9515g);
    }

    protected S0(long[] jArr) {
        this.f9515g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
