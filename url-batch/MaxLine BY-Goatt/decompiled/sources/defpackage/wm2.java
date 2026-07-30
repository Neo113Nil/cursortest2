package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wm2 extends ap2 {
    public long c;

    public wm2(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.ap2
    public final void a(ap2 ap2Var) {
        ap2Var.getClass();
        this.c = ((wm2) ap2Var).c;
    }

    @Override // defpackage.ap2
    public final ap2 b(long j) {
        return new wm2(j, this.c);
    }
}
