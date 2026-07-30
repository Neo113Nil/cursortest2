package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mg0 implements lg0 {
    public final int m;
    public int n = -1;
    public int o = -1;

    public mg0(int i) {
        this.m = i;
    }

    @Override // defpackage.lg0
    public final boolean d(CharSequence charSequence, int i, int i2, e13 e13Var) {
        int i3 = this.m;
        if (i > i3 || i3 >= i2) {
            return i2 <= i3;
        }
        this.n = i;
        this.o = i2;
        return false;
    }

    @Override // defpackage.lg0
    public final Object a() {
        return this;
    }
}
