package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbck extends zzgwm implements zzgxx {
    private static final zzbck zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbck zzbckVar = new zzbck();
        zzb = zzbckVar;
        zzgwm.zzaU(zzbck.class, zzbckVar);
    }

    private zzbck() {
    }

    public static zzbcj zza() {
        return (zzbcj) zzb.zzaA();
    }

    static /* synthetic */ void zzd(zzbck zzbckVar, boolean z) {
        zzbckVar.zzd |= 1;
        zzbckVar.zze = z;
    }

    static /* synthetic */ void zze(zzbck zzbckVar, int i) {
        zzbckVar.zzd |= 2;
        zzbckVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbck();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbcj(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
