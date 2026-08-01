package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzbat extends zzgwm implements zzgxx {
    private static final zzbat zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzbat zzbatVar = new zzbat();
        zzb = zzbatVar;
        zzgwm.zzaU(zzbat.class, zzbatVar);
    }

    private zzbat() {
    }

    public static zzbam zza() {
        return (zzbam) zzb.zzaA();
    }

    public static zzbat zzd() {
        return zzb;
    }

    static /* synthetic */ void zzi(zzbat zzbatVar, int i) {
        zzbatVar.zze = i - 1;
        zzbatVar.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzbat zzbatVar, int i) {
        zzbatVar.zzf = i - 1;
        zzbatVar.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.ads.zzgwm
    protected final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzbar.zza, "zzf", zzbao.zza});
        }
        if (i2 == 3) {
            return new zzbat();
        }
        zzayw zzaywVar = null;
        if (i2 == 4) {
            return new zzbam(zzaywVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzbap.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzbas.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
