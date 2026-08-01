package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzapw extends zzgwm implements zzgxx {
    private static final zzapw zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzapw zzapwVar = new zzapw();
        zzb = zzapwVar;
        zzgwm.zzaU(zzapw.class, zzapwVar);
    }

    private zzapw() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzapl.zza, "zzf"});
        }
        if (i2 == 3) {
            return new zzapw();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapv(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
