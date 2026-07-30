package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class kt2 {
    public final ys3 a = new ys3();

    public final void a(Object obj) {
        this.a.q(obj);
    }

    public final boolean b(Exception exc) {
        ys3 ys3Var = this.a;
        ys3Var.getClass();
        ll3.w(exc, "Exception must not be null");
        synchronized (ys3Var.a) {
            try {
                if (ys3Var.c) {
                    return false;
                }
                ys3Var.c = true;
                ys3Var.f = exc;
                ys3Var.b.g(ys3Var);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(Object obj) {
        ys3 ys3Var = this.a;
        synchronized (ys3Var.a) {
            try {
                if (ys3Var.c) {
                    return;
                }
                ys3Var.c = true;
                ys3Var.e = obj;
                ys3Var.b.g(ys3Var);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
