package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sc1 {
    public zt2 a;
    public final n72 b;
    public final kn2 c;
    public final t21 d;
    public wv2 e;
    public final lz1 f;
    public final lz1 g;
    public t81 h;
    public final lz1 i;
    public yd j;
    public final lz1 k;
    public final lz1 l;
    public final lz1 m;
    public final lz1 n;
    public final lz1 o;
    public boolean p;
    public final lz1 q;
    public final mh r;
    public Function1 s;
    public final d40 t;
    public final d40 u;
    public final vs3 v;
    public long w;
    public final lz1 x;
    public final lz1 y;

    public sc1(zt2 zt2Var, n72 n72Var, kn2 kn2Var) {
        this.a = zt2Var;
        this.b = n72Var;
        this.c = kn2Var;
        t21 t21Var = new t21(14);
        yd ydVar = ae.a;
        long j = jw2.b;
        nv2 nv2Var = new nv2(ydVar, j, (jw2) null);
        t21Var.n = nv2Var;
        t21Var.o = new qf0(ydVar, nv2Var.b);
        this.d = t21Var;
        Boolean bool = Boolean.FALSE;
        this.f = ij2.j(bool);
        this.g = ij2.j(new pc0(0.0f));
        this.i = ij2.j(null);
        this.k = ij2.j(zw0.m);
        this.l = ij2.j(bool);
        this.m = ij2.j(bool);
        this.n = ij2.j(bool);
        this.o = ij2.j(bool);
        this.p = true;
        this.q = ij2.j(Boolean.TRUE);
        this.r = new mh(kn2Var);
        this.s = bl0.A;
        this.t = new d40(this, 5);
        this.u = new d40(this, 4);
        this.v = yj1.e();
        this.w = aw.g;
        this.x = ij2.j(new jw2(j));
        this.y = ij2.j(new jw2(j));
    }

    public final zw0 a() {
        return (zw0) this.k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final t81 c() {
        t81 t81Var = this.h;
        if (t81Var == null || !t81Var.y()) {
            return null;
        }
        return t81Var;
    }

    public final cw2 d() {
        return (cw2) this.i.getValue();
    }

    public final void e(long j) {
        this.y.setValue(new jw2(j));
    }

    public final void f(long j) {
        this.x.setValue(new jw2(j));
    }
}
