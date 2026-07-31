package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class C0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9482g;

    public C0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 239) {
            throw new IllegalArgumentException("x value invalid for SecT239FieldElement");
        }
        this.f9482g = B0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] g4 = Y2.g.g();
        B0.a(this.f9482g, ((C0) dVar).f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] g4 = Y2.g.g();
        B0.c(this.f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 239;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0) {
            return Y2.g.l(this.f9482g, ((C0) obj).f9482g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] g4 = Y2.g.g();
        B0.j(this.f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.g.s(this.f9482g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.g.u(this.f9482g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9482g, 0, 4) ^ 23900158;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] g4 = Y2.g.g();
        B0.k(this.f9482g, ((C0) dVar).f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9482g;
        long[] jArr2 = ((C0) dVar).f9482g;
        long[] jArr3 = ((C0) dVar2).f9482g;
        long[] jArr4 = ((C0) dVar3).f9482g;
        long[] i4 = Y2.g.i();
        B0.l(jArr, jArr2, i4);
        B0.l(jArr3, jArr4, i4);
        long[] g4 = Y2.g.g();
        B0.m(i4, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] g4 = Y2.g.g();
        B0.o(this.f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] g4 = Y2.g.g();
        B0.p(this.f9482g, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9482g;
        long[] jArr2 = ((C0) dVar).f9482g;
        long[] jArr3 = ((C0) dVar2).f9482g;
        long[] i4 = Y2.g.i();
        B0.q(jArr, i4);
        B0.l(jArr2, jArr3, i4);
        long[] g4 = Y2.g.g();
        B0.m(i4, g4);
        return new C0(g4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9482g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.g.I(this.f9482g);
    }

    protected C0(long[] jArr) {
        this.f9482g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
