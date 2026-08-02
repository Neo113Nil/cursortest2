package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0230i0 extends AbstractC0216d1 {
    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean D(AbstractC0245n0 abstractC0245n0, Object obj, Object obj2) {
        synchronized (abstractC0245n0) {
            try {
                if (abstractC0245n0.f2890a != obj) {
                    return false;
                }
                abstractC0245n0.f2890a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean F(AbstractC0245n0 abstractC0245n0, C0242m0 c0242m0, C0242m0 c0242m02) {
        synchronized (abstractC0245n0) {
            try {
                if (abstractC0245n0.f2892c != c0242m0) {
                    return false;
                }
                abstractC0245n0.f2892c = c0242m02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0221f0 d(AbstractC0245n0 abstractC0245n0) {
        C0221f0 c0221f0;
        C0221f0 c0221f02 = C0221f0.f2855d;
        synchronized (abstractC0245n0) {
            c0221f0 = abstractC0245n0.f2891b;
            if (c0221f0 != c0221f02) {
                abstractC0245n0.f2891b = c0221f02;
            }
        }
        return c0221f0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final C0242m0 o(AbstractC0245n0 abstractC0245n0) {
        C0242m0 c0242m0;
        C0242m0 c0242m02 = C0242m0.f2883c;
        synchronized (abstractC0245n0) {
            c0242m0 = abstractC0245n0.f2892c;
            if (c0242m0 != c0242m02) {
                abstractC0245n0.f2892c = c0242m02;
            }
        }
        return c0242m0;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void s(C0242m0 c0242m0, C0242m0 c0242m02) {
        c0242m0.f2885b = c0242m02;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final void u(C0242m0 c0242m0, Thread thread) {
        c0242m0.f2884a = thread;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC0216d1
    public final boolean z(AbstractC0245n0 abstractC0245n0, C0221f0 c0221f0, C0221f0 c0221f02) {
        synchronized (abstractC0245n0) {
            try {
                if (abstractC0245n0.f2891b != c0221f0) {
                    return false;
                }
                abstractC0245n0.f2891b = c0221f02;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
