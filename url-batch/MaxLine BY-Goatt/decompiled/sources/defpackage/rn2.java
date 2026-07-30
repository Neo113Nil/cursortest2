package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class rn2 implements Iterable, k71 {
    public final wl2 m;
    public final int n;
    public final n6 o;

    public rn2(wl2 wl2Var, int i, rw0 rw0Var, n6 n6Var) {
        this.m = wl2Var;
        this.n = i;
        this.o = n6Var;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new qw0(this.m, this.n, null, this.o);
    }
}
