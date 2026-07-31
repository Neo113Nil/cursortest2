package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class G0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9492g;

    public G0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 283) {
            throw new IllegalArgumentException("x value invalid for SecT283FieldElement");
        }
        this.f9492g = F0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] a4 = Y2.h.a();
        F0.a(this.f9492g, ((G0) dVar).f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] a4 = Y2.h.a();
        F0.c(this.f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 283;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0) {
            return Y2.h.c(this.f9492g, ((G0) obj).f9492g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] a4 = Y2.h.a();
        F0.j(this.f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.h.e(this.f9492g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.h.f(this.f9492g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9492g, 0, 5) ^ 2831275;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] a4 = Y2.h.a();
        F0.k(this.f9492g, ((G0) dVar).f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9492g;
        long[] jArr2 = ((G0) dVar).f9492g;
        long[] jArr3 = ((G0) dVar2).f9492g;
        long[] jArr4 = ((G0) dVar3).f9492g;
        long[] j4 = Y2.m.j(9);
        F0.l(jArr, jArr2, j4);
        F0.l(jArr3, jArr4, j4);
        long[] a4 = Y2.h.a();
        F0.m(j4, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] a4 = Y2.h.a();
        F0.o(this.f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] a4 = Y2.h.a();
        F0.p(this.f9492g, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9492g;
        long[] jArr2 = ((G0) dVar).f9492g;
        long[] jArr3 = ((G0) dVar2).f9492g;
        long[] j4 = Y2.m.j(9);
        F0.q(jArr, j4);
        F0.l(jArr2, jArr3, j4);
        long[] a4 = Y2.h.a();
        F0.m(j4, a4);
        return new G0(a4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9492g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.h.g(this.f9492g);
    }

    protected G0(long[] jArr) {
        this.f9492g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
