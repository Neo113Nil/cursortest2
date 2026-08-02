package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class E1 extends U.i {
    @Override // U.i
    public final void H(F1 f12, F1 f13) {
        f12.f5833b = f13;
    }

    @Override // U.i
    public final void J(F1 f12, Thread thread) {
        f12.f5832a = thread;
    }

    @Override // U.i
    public final boolean K(G1 g12, U0 u02, U0 u03) {
        synchronized (g12) {
            try {
                if (g12.f5843b != u02) {
                    return false;
                }
                g12.f5843b = u03;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U.i
    public final boolean M(G1 g12, Object obj, Object obj2) {
        synchronized (g12) {
            try {
                if (g12.f5842a != obj) {
                    return false;
                }
                g12.f5842a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // U.i
    public final boolean N(G1 g12, F1 f12, F1 f13) {
        synchronized (g12) {
            try {
                if (g12.f5844c != f12) {
                    return false;
                }
                g12.f5844c = f13;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
