package s7;

import java.util.Objects;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h2 implements Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f8725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q2 f8726e;

    public h2(q2 q2Var, boolean z10) {
        this.f8725d = z10;
        Objects.requireNonNull(q2Var);
        this.f8726e = q2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r3 != r4) goto L19;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        q2 q2Var = this.f8726e;
        q1 q1Var = (q1) q2Var.f1478d;
        boolean c10 = q1Var.c();
        boolean z10 = false;
        boolean z11 = q1Var.M != null && q1Var.M.booleanValue();
        boolean z12 = this.f8725d;
        q1Var.M = Boolean.valueOf(z12);
        if (z11 == z12) {
            v0 v0Var = q1Var.f8937t;
            q1.l(v0Var);
            v0Var.B.b(Boolean.valueOf(z12), "Default data collection state already set to");
        }
        if (q1Var.c() != c10) {
            boolean c11 = q1Var.c();
            if (q1Var.M != null && q1Var.M.booleanValue()) {
                z10 = true;
            }
        }
        v0 v0Var2 = q1Var.f8937t;
        q1.l(v0Var2);
        v0Var2.f9055y.c(Boolean.valueOf(z12), Boolean.valueOf(c10), "Default data collection is different than actual status");
        q2Var.K();
    }
}
