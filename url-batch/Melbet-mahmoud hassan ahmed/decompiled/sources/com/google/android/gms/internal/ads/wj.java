package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class wj implements xk {

    /* renamed from: f, reason: collision with root package name */
    private final xk[] f13836f;

    public wj(xk[] xkVarArr) {
        this.f13836f = xkVarArr;
    }

    @Override // com.google.android.gms.internal.ads.xk
    public final boolean q(long j7) {
        boolean z6;
        boolean z7 = false;
        do {
            long zza = zza();
            if (zza == Long.MIN_VALUE) {
                break;
            }
            z6 = false;
            for (xk xkVar : this.f13836f) {
                if (xkVar.zza() == zza) {
                    z6 |= xkVar.q(j7);
                }
            }
            z7 |= z6;
        } while (z6);
        return z7;
    }

    @Override // com.google.android.gms.internal.ads.xk
    public final long zza() {
        long j7 = Long.MAX_VALUE;
        for (xk xkVar : this.f13836f) {
            long zza = xkVar.zza();
            if (zza != Long.MIN_VALUE) {
                j7 = Math.min(j7, zza);
            }
        }
        if (j7 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j7;
    }
}
