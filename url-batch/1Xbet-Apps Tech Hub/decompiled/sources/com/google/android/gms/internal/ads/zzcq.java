package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcq {
    public final Object zzf;
    public final int zzg;
    public final zzbs zzh;
    public final Object zzi;
    public final int zzj;
    public final long zzk;
    public final long zzl;
    public final int zzm;
    public final int zzn;
    static final String zza = Integer.toString(0, 36);
    private static final String zzo = Integer.toString(1, 36);
    static final String zzb = Integer.toString(2, 36);
    static final String zzc = Integer.toString(3, 36);
    static final String zzd = Integer.toString(4, 36);
    private static final String zzp = Integer.toString(5, 36);
    private static final String zzq = Integer.toString(6, 36);
    public static final zzn zze = new zzn() { // from class: com.google.android.gms.internal.ads.zzcp
    };

    public zzcq(Object obj, int i, zzbs zzbsVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zzf = obj;
        this.zzg = i;
        this.zzh = zzbsVar;
        this.zzi = obj2;
        this.zzj = i2;
        this.zzk = j;
        this.zzl = j2;
        this.zzm = i3;
        this.zzn = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzcq zzcqVar = (zzcq) obj;
            if (this.zzg == zzcqVar.zzg && this.zzj == zzcqVar.zzj && this.zzk == zzcqVar.zzk && this.zzl == zzcqVar.zzl && this.zzm == zzcqVar.zzm && this.zzn == zzcqVar.zzn && zzftt.zza(this.zzh, zzcqVar.zzh) && zzftt.zza(this.zzf, zzcqVar.zzf) && zzftt.zza(this.zzi, zzcqVar.zzi)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zzf, Integer.valueOf(this.zzg), this.zzh, this.zzi, Integer.valueOf(this.zzj), Long.valueOf(this.zzk), Long.valueOf(this.zzl), Integer.valueOf(this.zzm), Integer.valueOf(this.zzn)});
    }
}
