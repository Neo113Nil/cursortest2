package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public class ng1 {
    public final zu1 a = new zu1();

    public final void a(Object obj) {
        this.a.m(obj);
    }

    public final boolean b(Exception exc) {
        zu1 zu1Var = this.a;
        zu1Var.getClass();
        y90.j(exc, "Exception must not be null");
        synchronized (zu1Var.a) {
            try {
                if (zu1Var.c) {
                    return false;
                }
                zu1Var.c = true;
                zu1Var.f = exc;
                zu1Var.b.d(zu1Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        zu1 zu1Var = this.a;
        synchronized (zu1Var.a) {
            try {
                if (zu1Var.c) {
                    return;
                }
                zu1Var.c = true;
                zu1Var.e = obj;
                zu1Var.b.d(zu1Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
