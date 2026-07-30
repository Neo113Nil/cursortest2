package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rb1 extends ie1 {
    public int c;

    public rb1(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.ie1
    public final void a(ie1 ie1Var) {
        ie1Var.getClass();
        this.c = ((rb1) ie1Var).c;
    }

    @Override // defpackage.ie1
    public final ie1 b(long j) {
        return new rb1(this.c, j);
    }
}
