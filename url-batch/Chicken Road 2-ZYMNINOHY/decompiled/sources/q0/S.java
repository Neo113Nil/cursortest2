package q0;

import java.io.IOException;

/* loaded from: classes.dex */
public final class S implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f14878b;

    public S(U u4, int i4) {
        this.f14878b = u4;
        this.f14877a = i4;
    }

    @Override // q0.b0
    public final void a() {
        int i4 = this.f14877a;
        U u4 = this.f14878b;
        u4.f14916u[i4].z();
        u0.n nVar = u4.f14909l;
        int g4 = u4.f14901d.g(u4.f14887E);
        IOException iOException = nVar.f15486c;
        if (iOException != null) {
            throw iOException;
        }
        u0.j jVar = nVar.f15485b;
        if (jVar != null) {
            if (g4 == Integer.MIN_VALUE) {
                g4 = jVar.f15471a;
            }
            IOException iOException2 = jVar.f15475e;
            if (iOException2 != null && jVar.f15476f > g4) {
                throw iOException2;
            }
        }
    }

    @Override // q0.b0
    public final boolean isReady() {
        U u4 = this.f14878b;
        return !u4.G() && u4.f14916u[this.f14877a].x(u4.f14896O);
    }

    @Override // q0.b0
    public final int k(long j4) {
        U u4 = this.f14878b;
        if (u4.G()) {
            return 0;
        }
        int i4 = this.f14877a;
        u4.B(i4);
        a0 a0Var = u4.f14916u[i4];
        int v = a0Var.v(j4, u4.f14896O);
        a0Var.H(v);
        if (v == 0) {
            u4.C(i4);
        }
        return v;
    }

    @Override // q0.b0
    public final int n(l2.e eVar, Z.f fVar, int i4) {
        U u4 = this.f14878b;
        if (u4.G()) {
            return -3;
        }
        int i5 = this.f14877a;
        u4.B(i5);
        int C4 = u4.f14916u[i5].C(eVar, fVar, i4, u4.f14896O);
        if (C4 == -3) {
            u4.C(i5);
        }
        return C4;
    }
}
