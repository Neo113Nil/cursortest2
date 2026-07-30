package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class j11 extends h0 {
    public final w0 n;
    public final int o;
    public final int p;

    public j11(w0 w0Var, int i, int i2) {
        this.n = w0Var;
        this.o = i;
        yj1.o(i, i2, w0Var.size());
        this.p = i2 - i;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        yj1.m(i, this.p);
        return this.n.get(this.o + i);
    }

    @Override // defpackage.h0, java.util.List
    public final List subList(int i, int i2) {
        yj1.o(i, i2, this.p);
        int i3 = this.o;
        return new j11(this.n, i + i3, i3 + i2);
    }
}
