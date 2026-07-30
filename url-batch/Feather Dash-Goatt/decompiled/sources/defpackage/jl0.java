package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class jl0 implements u61 {
    public final d0 a;
    public final fl1 b;
    public final rw c;

    public jl0(fl1 fl1Var, rw rwVar, d0 d0Var) {
        this.b = fl1Var;
        rwVar.getClass();
        this.c = rwVar;
        this.a = d0Var;
    }

    @Override // defpackage.u61
    public final int a(m40 m40Var) {
        this.b.getClass();
        return m40Var.unknownFields.hashCode();
    }

    @Override // defpackage.u61
    public final void b(Object obj, Object obj2) {
        x61.k(this.b, obj, obj2);
    }

    @Override // defpackage.u61
    public final void c(Object obj) {
        this.b.getClass();
        el1 el1Var = ((m40) obj).unknownFields;
        if (el1Var.e) {
            el1Var.e = false;
        }
        this.c.getClass();
        qy0.u(obj);
        throw null;
    }

    @Override // defpackage.u61
    public final int d(m40 m40Var) {
        this.b.getClass();
        el1 el1Var = m40Var.unknownFields;
        int i = el1Var.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < el1Var.a; i3++) {
            int i4 = el1Var.b[i3] >>> 3;
            i2 += wh.f(3, (ff) el1Var.c[i3]) + wh.i(i4) + wh.h(2) + (wh.h(1) * 2);
        }
        el1Var.d = i2;
        return i2;
    }

    @Override // defpackage.u61
    public final boolean e(Object obj) {
        this.c.getClass();
        qy0.u(obj);
        throw null;
    }

    @Override // defpackage.u61
    public final boolean f(m40 m40Var, m40 m40Var2) {
        this.b.getClass();
        return m40Var.unknownFields.equals(m40Var2.unknownFields);
    }

    @Override // defpackage.u61
    public final void g(Object obj, s40 s40Var) {
        this.c.getClass();
        qy0.u(obj);
        throw null;
    }

    @Override // defpackage.u61
    public final void h(Object obj, uh uhVar, qw qwVar) {
        this.b.getClass();
        fl1.a(obj);
        this.c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.u61
    public final m40 i() {
        d0 d0Var = this.a;
        return d0Var instanceof m40 ? ((m40) d0Var).i() : ((k40) ((m40) d0Var).c(5)).b();
    }
}
