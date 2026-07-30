package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xg3 extends bg3 {
    public boolean n;

    public xg3(pj3 pj3Var) {
        super(pj3Var);
        ((pj3) this.m).M++;
    }

    public final void x() {
        if (this.n) {
            return;
        }
        lh.g("Not initialized");
    }

    public final void y() {
        if (this.n) {
            lh.g("Can't initialize twice");
        } else {
            if (z()) {
                return;
            }
            ((pj3) this.m).O.incrementAndGet();
            this.n = true;
        }
    }

    public abstract boolean z();
}
