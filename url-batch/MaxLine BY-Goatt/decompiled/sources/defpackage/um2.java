package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class um2 extends ap2 {
    public float c;

    public um2(long j, float f) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.ap2
    public final void a(ap2 ap2Var) {
        ap2Var.getClass();
        this.c = ((um2) ap2Var).c;
    }

    @Override // defpackage.ap2
    public final ap2 b(long j) {
        return new um2(j, this.c);
    }
}
