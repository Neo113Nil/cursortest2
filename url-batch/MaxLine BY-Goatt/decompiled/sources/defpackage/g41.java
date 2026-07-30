package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class g41 {
    public final int a;
    public final int b;
    public final fb1 c;

    public g41(int i, int i2, fb1 fb1Var) {
        this.a = i;
        this.b = i2;
        this.c = fb1Var;
        if (i < 0) {
            lh.c(in1.k(i, "startIndex should be >= 0, but was "));
            throw null;
        }
        if (i2 > 0) {
            return;
        }
        lh.c(in1.k(i2, "size should be >0, but was "));
        throw null;
    }
}
