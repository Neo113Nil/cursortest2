package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class vp3 extends lp3 {
    public boolean o;

    public vp3(oq3 oq3Var) {
        super(oq3Var);
        this.n.D++;
    }

    public final void x() {
        if (this.o) {
            return;
        }
        lh.g("Not initialized");
    }

    public final void y() {
        if (this.o) {
            lh.g("Can't initialize twice");
            return;
        }
        z();
        this.n.E++;
        this.o = true;
    }

    public abstract void z();
}
