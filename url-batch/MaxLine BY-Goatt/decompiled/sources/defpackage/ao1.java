package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ao1 extends rp3 {
    public final lz1 n;
    public final lz1 o;

    public ao1(Enum r2) {
        super(3);
        this.n = ij2.j(r2);
        this.o = ij2.j(r2);
    }

    @Override // defpackage.rp3
    public final Object j() {
        return this.n.getValue();
    }

    @Override // defpackage.rp3
    public final Object k() {
        return this.o.getValue();
    }

    @Override // defpackage.rp3
    public final void m(Object obj) {
        this.n.setValue(obj);
    }

    @Override // defpackage.rp3
    public final void o() {
    }

    @Override // defpackage.rp3
    public final void n(fz2 fz2Var) {
    }
}
