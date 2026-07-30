package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ak0 implements cu1 {
    public int m;
    public int n;

    public /* synthetic */ ak0(int i, int i2) {
        this.m = i;
        this.n = i2;
    }

    @Override // defpackage.cu1
    public int b(int i) {
        if (i >= 0 && i <= this.n) {
            z71.U(i, this.m, i);
        }
        return i;
    }

    @Override // defpackage.cu1
    public int g(int i) {
        if (i >= 0 && i <= this.m) {
            z71.T(i, this.n, i);
        }
        return i;
    }
}
