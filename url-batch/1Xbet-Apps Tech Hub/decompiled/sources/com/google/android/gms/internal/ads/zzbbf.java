package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbbf extends zzgwm implements zzgxx {
    private static final zzbbf zzb;
    private int zzd;
    private int zze = 1000;
    private int zzf = 1000;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private zzbbh zzo;

    static {
        zzbbf zzbbfVar = new zzbbf();
        zzb = zzbbfVar;
        zzgwm.zzaU(zzbbf.class, zzbbfVar);
    }

    private zzbbf() {
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgwq zzgwqVar = zzbac.zza;
            return zzaR(zzb, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bဉ\n", new Object[]{"zzd", "zze", zzgwqVar, "zzf", zzgwqVar, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo"});
        }
        if (i2 == 3) {
            return new zzbbf();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbbe(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
