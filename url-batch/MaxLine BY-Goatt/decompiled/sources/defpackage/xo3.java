package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xo3 implements Runnable {
    public final long m;
    public final long n;
    public final /* synthetic */ tt1 o;

    public xo3(tt1 tt1Var, long j, long j2) {
        Objects.requireNonNull(tt1Var);
        this.o = tt1Var;
        this.m = j;
        this.n = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        lj3 lj3Var = ((pj3) ((ep3) this.o.o).m).s;
        pj3.m(lj3Var);
        lj3Var.F(new r7(21, this));
    }
}
