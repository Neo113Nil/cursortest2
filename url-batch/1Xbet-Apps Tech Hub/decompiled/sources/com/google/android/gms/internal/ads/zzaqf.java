package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzaqf extends zzgwm implements zzgxx {
    private static final zzaqf zzb;
    private int zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzgwr zzh = zzaJ();
    private long zzi;

    static {
        zzaqf zzaqfVar = new zzaqf();
        zzb = zzaqfVar;
        zzgwm.zzaU(zzaqf.class, zzaqfVar);
    }

    private zzaqf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003ဇ\u0002\u0004\u0016\u0005ဃ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaqf();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzaqe(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
