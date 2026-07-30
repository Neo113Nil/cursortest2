package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xl2 implements Iterable, k71 {
    public final wl2 m;
    public final int n;
    public final int o;

    public xl2(wl2 wl2Var, int i, int i2) {
        this.m = wl2Var;
        this.n = i;
        this.o = i2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        wl2 wl2Var = this.m;
        if (wl2Var.t != this.o) {
            yl2.e();
        }
        int i = this.n;
        wl2Var.f(i);
        return new qw0(wl2Var, i + 1, wl2Var.m[(i * 5) + 3] + i);
    }
}
