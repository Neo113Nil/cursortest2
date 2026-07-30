package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ee1 extends ie1 {
    public j0 c;
    public int d;
    public int e;

    public ee1(long j, j0 j0Var) {
        super(j);
        this.c = j0Var;
    }

    @Override // defpackage.ie1
    public final void a(ie1 ie1Var) {
        synchronized (yr1.r) {
            ie1Var.getClass();
            this.c = ((ee1) ie1Var).c;
            this.d = ((ee1) ie1Var).d;
            this.e = ((ee1) ie1Var).e;
        }
    }

    @Override // defpackage.ie1
    public final ie1 b(long j) {
        return new ee1(j, this.c);
    }
}
