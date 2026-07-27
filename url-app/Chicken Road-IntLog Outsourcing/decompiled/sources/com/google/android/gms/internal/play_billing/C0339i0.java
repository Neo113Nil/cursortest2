package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0339i0 extends AbstractC0325d1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void B(C0351m0 c0351m0, Thread thread) {
        c0351m0.f5209a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean H(AbstractC0354n0 abstractC0354n0, C0330f0 c0330f0, C0330f0 c0330f02) {
        synchronized (abstractC0354n0) {
            try {
                if (abstractC0354n0.f5217b != c0330f0) {
                    return false;
                }
                abstractC0354n0.f5217b = c0330f02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean L(AbstractC0354n0 abstractC0354n0, Object obj, Object obj2) {
        synchronized (abstractC0354n0) {
            try {
                if (abstractC0354n0.f5216a != obj) {
                    return false;
                }
                abstractC0354n0.f5216a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final boolean N(AbstractC0354n0 abstractC0354n0, C0351m0 c0351m0, C0351m0 c0351m02) {
        synchronized (abstractC0354n0) {
            try {
                if (abstractC0354n0.f5218c != c0351m0) {
                    return false;
                }
                abstractC0354n0.f5218c = c0351m02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0330f0 e(AbstractC0354n0 abstractC0354n0) {
        C0330f0 c0330f0;
        C0330f0 c0330f02 = C0330f0.f5178d;
        synchronized (abstractC0354n0) {
            c0330f0 = abstractC0354n0.f5217b;
            if (c0330f0 != c0330f02) {
                abstractC0354n0.f5217b = c0330f02;
            }
        }
        return c0330f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final C0351m0 r(AbstractC0354n0 abstractC0354n0) {
        C0351m0 c0351m0;
        C0351m0 c0351m02 = C0351m0.f5208c;
        synchronized (abstractC0354n0) {
            c0351m0 = abstractC0354n0.f5218c;
            if (c0351m0 != c0351m02) {
                abstractC0354n0.f5218c = c0351m02;
            }
        }
        return c0351m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0325d1
    public final void z(C0351m0 c0351m0, C0351m0 c0351m02) {
        c0351m0.f5210b = c0351m02;
    }
}
