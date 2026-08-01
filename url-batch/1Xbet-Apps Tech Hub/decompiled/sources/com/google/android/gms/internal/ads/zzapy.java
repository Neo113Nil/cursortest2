package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzapy extends zzgwm implements zzgxx {
    private static final zzapy zzb;
    private int zzd;
    private long zze = -1;
    private int zzf = 1000;

    static {
        zzapy zzapyVar = new zzapy();
        zzb = zzapyVar;
        zzgwm.zzaU(zzapy.class, zzapyVar);
    }

    private zzapy() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", "zzf", zzaqj.zza});
        }
        if (i2 == 3) {
            return new zzapy();
        }
        zzapf zzapfVar = null;
        if (i2 == 4) {
            return new zzapx(zzapfVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
