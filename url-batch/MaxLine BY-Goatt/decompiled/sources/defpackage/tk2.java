package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class tk2 extends l1 {
    public long a;
    public fs b;

    @Override // defpackage.l1
    public final boolean a(k1 k1Var) {
        sk2 sk2Var = (sk2) k1Var;
        if (this.a >= 0) {
            return false;
        }
        long j = sk2Var.u;
        if (j < sk2Var.v) {
            sk2Var.v = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.l1
    public final o30[] b(k1 k1Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((sk2) k1Var).v(j);
    }
}
