package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xm3 implements Runnable {
    public final /* synthetic */ int m;
    public final /* synthetic */ dn3 n;

    public xm3(dn3 dn3Var, int i) {
        this.m = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(dn3Var);
                this.n = dn3Var;
                break;
            default:
                Objects.requireNonNull(dn3Var);
                this.n = dn3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        dn3 dn3Var = this.n;
        switch (i) {
            case 0:
                dn3Var.q = dn3Var.v;
                break;
            default:
                dn3Var.v = null;
                break;
        }
    }
}
