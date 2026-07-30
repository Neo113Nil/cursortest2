package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ri0 extends si0 {
    public final tx2 o;

    public ri0(long j, tx2 tx2Var) {
        super(j);
        this.o = tx2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.o.run();
    }

    @Override // defpackage.si0
    public final String toString() {
        return super.toString() + this.o;
    }
}
