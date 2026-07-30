package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class yw0 implements o32 {
    public final f6 a;
    public final du1 b;
    public long c = 0;

    public yw0(f6 f6Var, du1 du1Var) {
        this.a = f6Var;
        this.b = du1Var;
    }

    @Override // defpackage.o32
    public final long a(u31 u31Var, long j, u81 u81Var, long j2) {
        long a = this.b.a();
        if (!ap.D(a)) {
            a = this.c;
        }
        this.c = a;
        return s31.c(s31.c((u31Var.b & 4294967295L) | (u31Var.a << 32), yk3.R(a)), this.a.a(j2, 0L, u81Var));
    }
}
