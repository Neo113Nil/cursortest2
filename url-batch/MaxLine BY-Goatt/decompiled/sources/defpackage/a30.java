package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class a30 implements o32 {
    public final long a;

    public a30(long j) {
        this.a = j;
    }

    @Override // defpackage.o32
    public final long a(u31 u31Var, long j, u81 u81Var, long j2) {
        int i = u31Var.a;
        long j3 = this.a;
        return yk3.h(yj1.g(i + ((int) (j3 >> 32)), (int) (j2 >> 32), (int) (j >> 32), u81Var == u81.m), yj1.g(u31Var.b + ((int) (j3 & 4294967295L)), (int) (j2 & 4294967295L), (int) (j & 4294967295L), true));
    }
}
