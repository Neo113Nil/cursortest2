package q;

import m0.z0;
import r.e1;
import r.f1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o extends r0 {

    /* renamed from: r, reason: collision with root package name */
    public f1 f5881r;

    /* renamed from: s, reason: collision with root package name */
    public z0 f5882s;

    /* renamed from: t, reason: collision with root package name */
    public p f5883t;

    /* renamed from: u, reason: collision with root package name */
    public long f5884u;

    @Override // w1.v
    public final u1.f0 e(w1.n0 n0Var, u1.d0 d0Var, long j7) {
        long j8;
        u1.l0 e8 = d0Var.e(j7);
        if (n0Var.p()) {
            j8 = (e8.f7230d << 32) | (e8.f7231e & 4294967295L);
        } else {
            f1 f1Var = this.f5881r;
            if (f1Var == null) {
                j8 = (e8.f7230d << 32) | (e8.f7231e & 4294967295L);
                this.f5884u = j8;
            } else {
                long j9 = (e8.f7231e & 4294967295L) | (e8.f7230d << 32);
                e1 a8 = f1Var.a(new n(this, j9, 0), new n(this, j9, 1));
                this.f5883t.getClass();
                j8 = ((r2.k) a8.getValue()).f6528a;
                this.f5884u = ((r2.k) a8.getValue()).f6528a;
            }
        }
        return n0Var.e0((int) (j8 >> 32), (int) (4294967295L & j8), d6.v.f2327d, new m(this, e8, j8));
    }

    @Override // y0.l
    public final void l0() {
        this.f5884u = androidx.compose.animation.a.f455a;
    }
}
