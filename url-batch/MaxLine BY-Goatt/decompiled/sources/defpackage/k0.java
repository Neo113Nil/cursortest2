package defpackage;

import defpackage.h0;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k0 extends h0 implements RandomAccess {
    public final h0 n;
    public final int o;
    public final int p;

    public k0(h0 h0Var, int i, int i2) {
        this.n = h0Var;
        this.o = i;
        h0.a aVar = h0.m;
        int a = h0Var.a();
        aVar.getClass();
        h0.a.c(i, i2, a);
        this.p = i2 - i;
    }

    @Override // defpackage.b0
    public final int a() {
        return this.p;
    }

    @Override // java.util.List
    public final Object get(int i) {
        h0.m.getClass();
        h0.a.a(i, this.p);
        return this.n.get(this.o + i);
    }

    @Override // defpackage.h0, java.util.List
    public final List subList(int i, int i2) {
        h0.m.getClass();
        h0.a.c(i, i2, this.p);
        int i3 = this.o;
        return new k0(this.n, i + i3, i3 + i2);
    }
}
