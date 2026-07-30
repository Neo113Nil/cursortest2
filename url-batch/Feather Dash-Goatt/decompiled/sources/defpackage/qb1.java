package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class qb1 extends ie1 {
    public float c;

    public qb1(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.ie1
    public final void a(ie1 ie1Var) {
        ie1Var.getClass();
        this.c = ((qb1) ie1Var).c;
    }

    @Override // defpackage.ie1
    public final ie1 b(long j) {
        return new qb1(this.c, j);
    }
}
