package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class aa1 implements rs {
    public final ca1 d;
    public final long e;
    public final Object g;
    public final tf h;

    public aa1(ca1 ca1Var, long j, Object obj, tf tfVar) {
        this.d = ca1Var;
        this.e = j;
        this.g = obj;
        this.h = tfVar;
    }

    @Override // defpackage.rs
    public final void a() {
        ca1 ca1Var = this.d;
        synchronized (ca1Var) {
            if (this.e < ca1Var.o()) {
                return;
            }
            Object[] objArr = ca1Var.l;
            objArr.getClass();
            long j = this.e;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            la0.u(objArr, j, la0.t);
            ca1Var.j();
        }
    }
}
