package com.google.android.gms.internal.play_billing;

/* loaded from: classes.dex */
public final class K extends O3.d {
    @Override // O3.d
    public final H K(Z z) {
        H h2;
        H h4 = H.f5845d;
        synchronized (z) {
            try {
                h2 = z.f5892b;
                if (h2 != h4) {
                    z.f5892b = h4;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h2;
    }

    @Override // O3.d
    public final M M(Z z) {
        M m4;
        M m5 = M.f5873c;
        synchronized (z) {
            try {
                m4 = z.f5893c;
                if (m4 != m5) {
                    z.f5893c = m5;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return m4;
    }

    @Override // O3.d
    public final void O(M m4, M m5) {
        m4.f5875b = m5;
    }

    @Override // O3.d
    public final void P(M m4, Thread thread) {
        m4.f5874a = thread;
    }

    @Override // O3.d
    public final boolean Q(Z z, H h2, H h4) {
        synchronized (z) {
            try {
                if (z.f5892b != h2) {
                    return false;
                }
                z.f5892b = h4;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O3.d
    public final boolean R(N n, Object obj, Object obj2) {
        synchronized (n) {
            try {
                if (n.f5891a != obj) {
                    return false;
                }
                n.f5891a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // O3.d
    public final boolean S(N n, M m4, M m5) {
        synchronized (n) {
            try {
                if (n.f5893c != m4) {
                    return false;
                }
                n.f5893c = m5;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
