package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class q0 extends m90 {
    @Override // defpackage.m90
    public final void G(r0 r0Var, r0 r0Var2) {
        r0Var.b = r0Var2;
    }

    @Override // defpackage.m90
    public final void H(r0 r0Var, Thread thread) {
        r0Var.a = thread;
    }

    @Override // defpackage.m90
    public final boolean s(s0 s0Var, o0 o0Var) {
        o0 o0Var2 = o0.b;
        synchronized (s0Var) {
            try {
                if (s0Var.e != o0Var) {
                    return false;
                }
                s0Var.e = o0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m90
    public final boolean t(s0 s0Var, Object obj, Object obj2) {
        synchronized (s0Var) {
            try {
                if (s0Var.d != obj) {
                    return false;
                }
                s0Var.d = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.m90
    public final boolean u(s0 s0Var, r0 r0Var, r0 r0Var2) {
        synchronized (s0Var) {
            try {
                if (s0Var.g != r0Var) {
                    return false;
                }
                s0Var.g = r0Var2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
