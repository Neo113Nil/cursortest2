package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class k40 implements Cloneable {
    public final m40 d;
    public m40 e;

    public k40(m40 m40Var) {
        this.d = m40Var;
        if (m40Var.g()) {
            dd0.e("Default instance must be immutable.");
            throw null;
        }
        this.e = m40Var.i();
    }

    public final m40 a() {
        m40 b = b();
        b.getClass();
        if (m40.f(b, true)) {
            return b;
        }
        throw new bl1();
    }

    public final m40 b() {
        boolean g = this.e.g();
        m40 m40Var = this.e;
        if (!g) {
            return m40Var;
        }
        m40Var.getClass();
        i01 i01Var = i01.c;
        i01Var.getClass();
        i01Var.a(m40Var.getClass()).c(m40Var);
        m40Var.h();
        return this.e;
    }

    public final void c() {
        if (this.e.g()) {
            return;
        }
        m40 i = this.d.i();
        m40 m40Var = this.e;
        i01 i01Var = i01.c;
        i01Var.getClass();
        i01Var.a(i.getClass()).b(i, m40Var);
        this.e = i;
    }

    public final Object clone() {
        k40 k40Var = (k40) this.d.c(5);
        k40Var.e = b();
        return k40Var;
    }
}
