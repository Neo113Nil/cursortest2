package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class jl3 implements Runnable {
    public final /* synthetic */ boolean m;
    public final /* synthetic */ jm3 n;

    public jl3(jm3 jm3Var, boolean z) {
        this.m = z;
        Objects.requireNonNull(jm3Var);
        this.n = jm3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        jm3 jm3Var = this.n;
        pj3 pj3Var = (pj3) jm3Var.m;
        boolean b = pj3Var.b();
        boolean z = false;
        boolean z2 = pj3Var.K != null && pj3Var.K.booleanValue();
        boolean z3 = this.m;
        pj3Var.K = Boolean.valueOf(z3);
        if (z2 == z3) {
            vh3 vh3Var = pj3Var.r;
            pj3.m(vh3Var);
            vh3Var.z.c(Boolean.valueOf(z3), "Default data collection state already set to");
        }
        if (pj3Var.b() != b) {
            boolean b2 = pj3Var.b();
            if (pj3Var.K != null && pj3Var.K.booleanValue()) {
                z = true;
            }
        }
        vh3 vh3Var2 = pj3Var.r;
        pj3.m(vh3Var2);
        vh3Var2.w.d(Boolean.valueOf(z3), Boolean.valueOf(b), "Default data collection is different than actual status");
        jm3Var.O();
    }
}
