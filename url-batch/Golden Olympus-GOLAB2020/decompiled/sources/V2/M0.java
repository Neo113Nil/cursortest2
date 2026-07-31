package V2;

import com.ironsource.InterfaceC1490j3;
import java.math.BigInteger;

/* loaded from: classes3.dex */
public class M0 extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9503g;

    public M0(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 409) {
            throw new IllegalArgumentException("x value invalid for SecT409FieldElement");
        }
        this.f9503g = L0.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] a4 = Y2.j.a();
        L0.a(this.f9503g, ((M0) dVar).f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] a4 = Y2.j.a();
        L0.c(this.f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return InterfaceC1490j3.a.b.f16794i;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof M0) {
            return Y2.j.c(this.f9503g, ((M0) obj).f9503g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] a4 = Y2.j.a();
        L0.j(this.f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.j.e(this.f9503g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.j.f(this.f9503g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9503g, 0, 7) ^ 4090087;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] a4 = Y2.j.a();
        L0.k(this.f9503g, ((M0) dVar).f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9503g;
        long[] jArr2 = ((M0) dVar).f9503g;
        long[] jArr3 = ((M0) dVar2).f9503g;
        long[] jArr4 = ((M0) dVar3).f9503g;
        long[] j4 = Y2.m.j(13);
        L0.l(jArr, jArr2, j4);
        L0.l(jArr3, jArr4, j4);
        long[] a4 = Y2.j.a();
        L0.m(j4, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] a4 = Y2.j.a();
        L0.o(this.f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] a4 = Y2.j.a();
        L0.p(this.f9503g, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9503g;
        long[] jArr2 = ((M0) dVar).f9503g;
        long[] jArr3 = ((M0) dVar2).f9503g;
        long[] j4 = Y2.m.j(13);
        L0.q(jArr, j4);
        L0.l(jArr2, jArr3, j4);
        long[] a4 = Y2.j.a();
        L0.m(j4, a4);
        return new M0(a4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9503g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.j.g(this.f9503g);
    }

    protected M0(long[] jArr) {
        this.f9503g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
