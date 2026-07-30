package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class zd3 implements Runnable {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ long n;
    public final /* synthetic */ bg3 o;

    public zd3(se3 se3Var, long j) {
        this.n = j;
        Objects.requireNonNull(se3Var);
        this.o = se3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.m;
        long j = this.n;
        bg3 bg3Var = this.o;
        switch (i) {
            case 0:
                ((se3) bg3Var).C(j);
                break;
            default:
                dn3 dn3Var = (dn3) bg3Var;
                se3 se3Var = ((pj3) dn3Var.m).z;
                pj3.j(se3Var);
                se3Var.z(j);
                dn3Var.q = null;
                break;
        }
    }

    public zd3(dn3 dn3Var, long j) {
        this.n = j;
        Objects.requireNonNull(dn3Var);
        this.o = dn3Var;
    }
}
