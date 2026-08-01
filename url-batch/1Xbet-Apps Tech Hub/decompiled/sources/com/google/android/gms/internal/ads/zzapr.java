package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzapr extends zzgwm implements zzgxx {
    private static final zzapr zzb;
    private int zzd;
    private long zze = -1;

    static {
        zzapr zzaprVar = new zzapr();
        zzb = zzaprVar;
        zzgwm.zzaU(zzapr.class, zzaprVar);
    }

    private zzapr() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzapr();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapq(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
