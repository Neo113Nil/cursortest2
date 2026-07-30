package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lD, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3514lD extends AbstractC3406jD {
    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void e(C3784qD c3784qD, Thread thread) {
        c3784qD.f33670a = thread;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final void g(C3784qD c3784qD, C3784qD c3784qD2) {
        c3784qD.f33671b = c3784qD2;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean i(AbstractC3837rD abstractC3837rD, C3784qD c3784qD, C3784qD c3784qD2) {
        synchronized (abstractC3837rD) {
            try {
                if (abstractC3837rD.f33994v != c3784qD) {
                    return false;
                }
                abstractC3837rD.f33994v = c3784qD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean k(AbstractC3354iD abstractC3354iD, C3191fD c3191fD, C3191fD c3191fD2) {
        synchronized (abstractC3354iD) {
            try {
                if (abstractC3354iD.f33993u != c3191fD) {
                    return false;
                }
                abstractC3354iD.f33993u = c3191fD2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3784qD l(AbstractC3354iD abstractC3354iD) {
        C3784qD c3784qD;
        C3784qD c3784qD2 = C3784qD.f33669c;
        synchronized (abstractC3354iD) {
            try {
                c3784qD = abstractC3354iD.f33994v;
                if (c3784qD != c3784qD2) {
                    abstractC3354iD.f33994v = c3784qD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3784qD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final C3191fD n(AbstractC3354iD abstractC3354iD) {
        C3191fD c3191fD;
        C3191fD c3191fD2 = C3191fD.f30633d;
        synchronized (abstractC3354iD) {
            try {
                c3191fD = abstractC3354iD.f33993u;
                if (c3191fD != c3191fD2) {
                    abstractC3354iD.f33993u = c3191fD2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c3191fD;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3406jD
    public final boolean o(AbstractC3837rD abstractC3837rD, Object obj, Object obj2) {
        synchronized (abstractC3837rD) {
            try {
                if (abstractC3837rD.f33992n != obj) {
                    return false;
                }
                abstractC3837rD.f33992n = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
