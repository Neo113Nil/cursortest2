package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class il1 implements se2 {
    public final q0 a;
    public final e23 b;
    public final xj0 c;

    public il1(e23 e23Var, xj0 xj0Var, q0 q0Var) {
        this.b = e23Var;
        xj0Var.getClass();
        this.c = xj0Var;
        this.a = q0Var;
    }

    @Override // defpackage.se2
    public final int a(vu0 vu0Var) {
        this.b.getClass();
        return vu0Var.unknownFields.hashCode();
    }

    @Override // defpackage.se2
    public final void b(Object obj, Object obj2) {
        ve2.k(this.b, obj, obj2);
    }

    @Override // defpackage.se2
    public final void c(Object obj) {
        this.b.getClass();
        d23 d23Var = ((vu0) obj).unknownFields;
        if (d23Var.e) {
            d23Var.e = false;
        }
        this.c.getClass();
        q40.t(obj);
        throw null;
    }

    @Override // defpackage.se2
    public final int d(vu0 vu0Var) {
        this.b.getClass();
        d23 d23Var = vu0Var.unknownFields;
        int i = d23Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < d23Var.a; i3++) {
            int i4 = d23Var.b[i3] >>> 3;
            i2 += kv.f(3, (er) d23Var.c[i3]) + kv.i(i4) + kv.h(2) + (kv.h(1) * 2);
        }
        d23Var.d = i2;
        return i2;
    }

    @Override // defpackage.se2
    public final void e(Object obj, gn gnVar, wj0 wj0Var) {
        this.b.getClass();
        e23.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.se2
    public final boolean f(Object obj) {
        this.c.getClass();
        q40.t(obj);
        throw null;
    }

    @Override // defpackage.se2
    public final boolean g(vu0 vu0Var, vu0 vu0Var2) {
        this.b.getClass();
        return vu0Var.unknownFields.equals(vu0Var2.unknownFields);
    }

    @Override // defpackage.se2
    public final vu0 h() {
        q0 q0Var = this.a;
        return q0Var instanceof vu0 ? ((vu0) q0Var).i() : ((tu0) ((vu0) q0Var).c(5)).b();
    }

    @Override // defpackage.se2
    public final void i(Object obj, ar0 ar0Var) {
        this.c.getClass();
        q40.t(obj);
        throw null;
    }
}
