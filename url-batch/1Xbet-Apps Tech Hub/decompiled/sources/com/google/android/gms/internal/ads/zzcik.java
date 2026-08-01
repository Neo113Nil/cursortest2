package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcik {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcik(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzcik zza() {
        return new zzcik(0, 0, 0);
    }

    public static zzcik zzb(int i, int i2) {
        return new zzcik(1, i, i2);
    }

    public static zzcik zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        return zzqVar.zzd ? new zzcik(3, 0, 0) : zzqVar.zzi ? new zzcik(2, 0, 0) : zzqVar.zzh ? zza() : zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzcik zzd() {
        return new zzcik(5, 0, 0);
    }

    public static zzcik zze() {
        return new zzcik(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
