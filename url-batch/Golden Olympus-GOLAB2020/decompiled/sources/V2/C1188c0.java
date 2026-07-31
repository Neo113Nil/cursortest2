package V2;

import java.math.BigInteger;

/* renamed from: V2.c0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1188c0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9533g;

    public C1188c0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 131) {
            throw new IllegalArgumentException("x value invalid for SecT131FieldElement");
        }
        this.f9533g = AbstractC1186b0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.a(this.f9533g, ((C1188c0) dVar).f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.c(this.f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 131;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1188c0) {
            return Y2.e.k(this.f9533g, ((C1188c0) obj).f9533g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.i(this.f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.e.r(this.f9533g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.e.t(this.f9533g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9533g, 0, 3) ^ 131832;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.j(this.f9533g, ((C1188c0) dVar).f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9533g;
        long[] jArr2 = ((C1188c0) dVar).f9533g;
        long[] jArr3 = ((C1188c0) dVar2).f9533g;
        long[] jArr4 = ((C1188c0) dVar3).f9533g;
        long[] j4 = Y2.m.j(5);
        AbstractC1186b0.k(jArr, jArr2, j4);
        AbstractC1186b0.k(jArr3, jArr4, j4);
        long[] f4 = Y2.e.f();
        AbstractC1186b0.l(j4, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.n(this.f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] f4 = Y2.e.f();
        AbstractC1186b0.o(this.f9533g, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9533g;
        long[] jArr2 = ((C1188c0) dVar).f9533g;
        long[] jArr3 = ((C1188c0) dVar2).f9533g;
        long[] j4 = Y2.m.j(5);
        AbstractC1186b0.p(jArr, j4);
        AbstractC1186b0.k(jArr2, jArr3, j4);
        long[] f4 = Y2.e.f();
        AbstractC1186b0.l(j4, f4);
        return new C1188c0(f4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9533g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.e.G(this.f9533g);
    }

    protected C1188c0(long[] jArr) {
        this.f9533g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
