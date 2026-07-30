package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ym2 extends ap2 {
    public Object c;

    public ym2(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.ap2
    public final void a(ap2 ap2Var) {
        ap2Var.getClass();
        this.c = ((ym2) ap2Var).c;
    }

    @Override // defpackage.ap2
    public final ap2 b(long j) {
        return new ym2(tm2.k().g(), this.c);
    }
}
