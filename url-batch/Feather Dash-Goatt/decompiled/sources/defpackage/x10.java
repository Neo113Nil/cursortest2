package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class x10 implements v10 {
    public final o5 a;
    public final p5 b;
    public final c51 c;
    public final c20 d;
    public final nq0 e;
    public final l f;

    public x10(o5 o5Var, p5 p5Var) {
        c51 c51Var = y10.a;
        c20 c20Var = new c20(y10.b);
        nq0 nq0Var = new nq0(2);
        this.a = o5Var;
        this.b = p5Var;
        this.c = c51Var;
        this.d = c20Var;
        this.e = nq0Var;
        this.f = new l(3, this);
    }

    public final dk1 a(ak1 ak1Var) {
        c51 c51Var = this.c;
        c cVar = new c(this, 5, ak1Var);
        synchronized (((sc1) c51Var.e)) {
            dk1 dk1Var = (dk1) ((lj0) c51Var.g).a(ak1Var);
            if (dk1Var != null) {
                if (dk1Var.c()) {
                    return dk1Var;
                }
            }
            try {
                dk1 dk1Var2 = (dk1) cVar.invoke(new c(c51Var, 18, ak1Var));
                synchronized (((sc1) c51Var.e)) {
                    if (((lj0) c51Var.g).a(ak1Var) == null && dk1Var2.c()) {
                        ((lj0) c51Var.g).b(ak1Var, dk1Var2);
                    }
                }
                return dk1Var2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }

    public final dk1 b(w10 w10Var, x20 x20Var, int i, int i2) {
        p5 p5Var = this.b;
        p5Var.getClass();
        int i3 = p5Var.d;
        x20 x20Var2 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? x20Var : new x20(b11.c(x20Var.d + i3, 1, 1000));
        this.a.getClass();
        return a(new ak1(w10Var, x20Var2, i, i2, null));
    }
}
