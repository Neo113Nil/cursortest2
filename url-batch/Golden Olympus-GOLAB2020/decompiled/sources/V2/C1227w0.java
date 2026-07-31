package V2;

import java.math.BigInteger;

/* renamed from: V2.w0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1227w0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9576g;

    public C1227w0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 233) {
            throw new IllegalArgumentException("x value invalid for SecT233FieldElement");
        }
        this.f9576g = AbstractC1225v0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.a(this.f9576g, ((C1227w0) dVar).f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.c(this.f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 233;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1227w0) {
            return Y2.g.l(this.f9576g, ((C1227w0) obj).f9576g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.j(this.f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.g.s(this.f9576g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.g.u(this.f9576g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9576g, 0, 4) ^ 2330074;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.k(this.f9576g, ((C1227w0) dVar).f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9576g;
        long[] jArr2 = ((C1227w0) dVar).f9576g;
        long[] jArr3 = ((C1227w0) dVar2).f9576g;
        long[] jArr4 = ((C1227w0) dVar3).f9576g;
        long[] i4 = Y2.g.i();
        AbstractC1225v0.l(jArr, jArr2, i4);
        AbstractC1225v0.l(jArr3, jArr4, i4);
        long[] g4 = Y2.g.g();
        AbstractC1225v0.m(i4, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.o(this.f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] g4 = Y2.g.g();
        AbstractC1225v0.p(this.f9576g, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9576g;
        long[] jArr2 = ((C1227w0) dVar).f9576g;
        long[] jArr3 = ((C1227w0) dVar2).f9576g;
        long[] i4 = Y2.g.i();
        AbstractC1225v0.q(jArr, i4);
        AbstractC1225v0.l(jArr2, jArr3, i4);
        long[] g4 = Y2.g.g();
        AbstractC1225v0.m(i4, g4);
        return new C1227w0(g4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9576g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.g.I(this.f9576g);
    }

    protected C1227w0(long[] jArr) {
        this.f9576g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
