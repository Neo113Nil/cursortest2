package V2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class W extends S2.d {

    /* renamed from: g, reason: collision with root package name */
    protected long[] f9522g;

    public W(BigInteger bigInteger) {
        if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > 113) {
            throw new IllegalArgumentException("x value invalid for SecT113FieldElement");
        }
        this.f9522g = V.d(bigInteger);
    }

    @Override // S2.d
    public S2.d a(S2.d dVar) {
        long[] d4 = Y2.c.d();
        V.a(this.f9522g, ((W) dVar).f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d b() {
        long[] d4 = Y2.c.d();
        V.c(this.f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d d(S2.d dVar) {
        return i(dVar.f());
    }

    @Override // S2.d
    public int e() {
        return 113;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W) {
            return Y2.c.h(this.f9522g, ((W) obj).f9522g);
        }
        return false;
    }

    @Override // S2.d
    public S2.d f() {
        long[] d4 = Y2.c.d();
        V.h(this.f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public boolean g() {
        return Y2.c.n(this.f9522g);
    }

    @Override // S2.d
    public boolean h() {
        return Y2.c.p(this.f9522g);
    }

    public int hashCode() {
        return Z2.a.k(this.f9522g, 0, 2) ^ 113009;
    }

    @Override // S2.d
    public S2.d i(S2.d dVar) {
        long[] d4 = Y2.c.d();
        V.i(this.f9522g, ((W) dVar).f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d j(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        return k(dVar, dVar2, dVar3);
    }

    @Override // S2.d
    public S2.d k(S2.d dVar, S2.d dVar2, S2.d dVar3) {
        long[] jArr = this.f9522g;
        long[] jArr2 = ((W) dVar).f9522g;
        long[] jArr3 = ((W) dVar2).f9522g;
        long[] jArr4 = ((W) dVar3).f9522g;
        long[] f4 = Y2.c.f();
        V.j(jArr, jArr2, f4);
        V.j(jArr3, jArr4, f4);
        long[] d4 = Y2.c.d();
        V.k(f4, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d m() {
        long[] d4 = Y2.c.d();
        V.m(this.f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d n() {
        long[] d4 = Y2.c.d();
        V.n(this.f9522g, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d o(S2.d dVar, S2.d dVar2) {
        long[] jArr = this.f9522g;
        long[] jArr2 = ((W) dVar).f9522g;
        long[] jArr3 = ((W) dVar2).f9522g;
        long[] f4 = Y2.c.f();
        V.o(jArr, f4);
        V.j(jArr2, jArr3, f4);
        long[] d4 = Y2.c.d();
        V.k(f4, d4);
        return new W(d4);
    }

    @Override // S2.d
    public S2.d p(S2.d dVar) {
        return a(dVar);
    }

    @Override // S2.d
    public boolean q() {
        return (this.f9522g[0] & 1) != 0;
    }

    @Override // S2.d
    public BigInteger r() {
        return Y2.c.w(this.f9522g);
    }

    protected W(long[] jArr) {
        this.f9522g = jArr;
    }

    @Override // S2.d
    public S2.d l() {
        return this;
    }
}
