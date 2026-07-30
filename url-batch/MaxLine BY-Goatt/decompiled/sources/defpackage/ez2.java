package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ez2 implements so2 {
    public final /* synthetic */ fz2 A;
    public final k03 m;
    public final lz1 n;
    public final lz1 o;
    public final lz1 p;
    public kg2 q;
    public bt2 r;
    public final lz1 s;
    public final hz1 t;
    public boolean u;
    public final lz1 v;
    public sd w;
    public final jz1 x;
    public boolean y;
    public final eo2 z;

    public ez2(fz2 fz2Var, Object obj, sd sdVar, k03 k03Var) {
        this.A = fz2Var;
        this.m = k03Var;
        lz1 j = ij2.j(obj);
        this.n = j;
        Object obj2 = null;
        this.o = ij2.j(bd3.G(7, null));
        this.p = ij2.j(new bt2(b(), k03Var, obj, j.getValue(), sdVar));
        this.s = ij2.j(Boolean.TRUE);
        this.t = new hz1(-1.0f);
        this.v = ij2.j(obj);
        this.w = sdVar;
        this.x = new jz1(a().c());
        Float f = (Float) f63.a.get(k03Var);
        if (f != null) {
            float floatValue = f.floatValue();
            sd sdVar2 = (sd) k03Var.a.invoke(obj);
            int b = sdVar2.b();
            for (int i = 0; i < b; i++) {
                sdVar2.e(i, floatValue);
            }
            obj2 = this.m.b.invoke(sdVar2);
        }
        this.z = bd3.G(3, obj2);
    }

    public final bt2 a() {
        return (bt2) this.p.getValue();
    }

    public final bm0 b() {
        return (bm0) this.o.getValue();
    }

    public final void d(long j) {
        if (this.t.h() == -1.0f) {
            this.y = true;
            if (Intrinsics.b(a().c, a().d)) {
                f(a().c);
            } else {
                f(a().b(j));
                this.w = a().f(j);
            }
        }
    }

    public final void f(Object obj) {
        this.v.setValue(obj);
    }

    public final void g(Object obj, boolean z) {
        bt2 bt2Var = this.r;
        Object obj2 = bt2Var != null ? bt2Var.c : null;
        lz1 lz1Var = this.n;
        boolean b = Intrinsics.b(obj2, lz1Var.getValue());
        jz1 jz1Var = this.x;
        lz1 lz1Var2 = this.p;
        if (b) {
            lz1Var2.setValue(new bt2(this.z, this.m, obj, obj, this.w.c()));
            this.u = true;
            jz1Var.i(a().c());
            return;
        }
        bm0 b2 = (!z || this.y) ? b() : b() instanceof eo2 ? b() : this.z;
        fz2 fz2Var = this.A;
        long e = fz2Var.e();
        lz1 lz1Var3 = fz2Var.h;
        lz1Var2.setValue(new bt2(e <= 0 ? b2 : new mo2(b2, fz2Var.e()), this.m, obj, lz1Var.getValue(), this.w));
        jz1Var.i(a().c());
        this.u = false;
        lz1Var3.setValue(Boolean.TRUE);
        if (fz2Var.g()) {
            fn2 fn2Var = fz2Var.i;
            int size = fn2Var.size();
            long j = 0;
            for (int i = 0; i < size; i++) {
                ez2 ez2Var = (ez2) fn2Var.get(i);
                j = Math.max(j, ez2Var.x.h());
                ez2Var.d(0L);
            }
            lz1Var3.setValue(Boolean.FALSE);
        }
    }

    @Override // defpackage.so2
    public final Object getValue() {
        return this.v.getValue();
    }

    public final void h(Object obj, Object obj2, bm0 bm0Var) {
        this.n.setValue(obj2);
        this.o.setValue(bm0Var);
        if (Intrinsics.b(a().d, obj) && Intrinsics.b(a().c, obj2)) {
            return;
        }
        g(obj, false);
    }

    public final void i(Object obj, bm0 bm0Var) {
        if (this.u) {
            bt2 bt2Var = this.r;
            if (Intrinsics.b(obj, bt2Var != null ? bt2Var.c : null)) {
                return;
            }
        }
        lz1 lz1Var = this.n;
        boolean b = Intrinsics.b(lz1Var.getValue(), obj);
        hz1 hz1Var = this.t;
        if (b && hz1Var.h() == -1.0f) {
            return;
        }
        lz1Var.setValue(obj);
        this.o.setValue(bm0Var);
        Object value = hz1Var.h() == -3.0f ? obj : this.v.getValue();
        lz1 lz1Var2 = this.s;
        g(value, !((Boolean) lz1Var2.getValue()).booleanValue());
        lz1Var2.setValue(Boolean.valueOf(hz1Var.h() == -3.0f));
        if (hz1Var.h() >= 0.0f) {
            f(a().b((long) (hz1Var.h() * a().c())));
        } else if (hz1Var.h() == -3.0f) {
            f(obj);
        }
        this.u = false;
        hz1Var.i(-1.0f);
    }

    public final String toString() {
        return "current value: " + this.v.getValue() + ", target: " + this.n.getValue() + ", spec: " + b();
    }
}
