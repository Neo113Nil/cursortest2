package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcz {
    private static final String zzA;
    private static final String zzB;
    private static final String zzC;
    private static final String zzD;
    private static final String zzE;
    private static final String zzF;
    public static final zzn zzb;
    private static final zzbs zzs;
    private static final String zzt;
    private static final String zzu;
    private static final String zzv;
    private static final String zzw;
    private static final String zzx;
    private static final String zzy;
    private static final String zzz;

    @Deprecated
    public Object zzd;
    public long zzf;
    public long zzg;
    public long zzh;
    public boolean zzi;
    public boolean zzj;

    @Deprecated
    public boolean zzk;
    public zzbi zzl;
    public boolean zzm;
    public long zzn;
    public long zzo;
    public int zzp;
    public int zzq;
    public static final Object zza = new Object();
    private static final Object zzr = new Object();
    public Object zzc = zza;
    public zzbs zze = zzs;

    static {
        zzau zzauVar = new zzau();
        zzauVar.zza("androidx.media3.common.Timeline");
        zzauVar.zzb(Uri.EMPTY);
        zzs = zzauVar.zzc();
        zzt = Integer.toString(1, 36);
        zzu = Integer.toString(2, 36);
        zzv = Integer.toString(3, 36);
        zzw = Integer.toString(4, 36);
        zzx = Integer.toString(5, 36);
        zzy = Integer.toString(6, 36);
        zzz = Integer.toString(7, 36);
        zzA = Integer.toString(8, 36);
        zzB = Integer.toString(9, 36);
        zzC = Integer.toString(10, 36);
        zzD = Integer.toString(11, 36);
        zzE = Integer.toString(12, 36);
        zzF = Integer.toString(13, 36);
        zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcy
        };
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass().equals(obj.getClass())) {
            zzcz zzczVar = (zzcz) obj;
            if (zzfs.zzF(this.zzc, zzczVar.zzc) && zzfs.zzF(this.zze, zzczVar.zze) && zzfs.zzF(null, null) && zzfs.zzF(this.zzl, zzczVar.zzl) && this.zzf == zzczVar.zzf && this.zzg == zzczVar.zzg && this.zzh == zzczVar.zzh && this.zzi == zzczVar.zzi && this.zzj == zzczVar.zzj && this.zzm == zzczVar.zzm && this.zzo == zzczVar.zzo && this.zzp == zzczVar.zzp && this.zzq == zzczVar.zzq) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = ((this.zzc.hashCode() + 217) * 31) + this.zze.hashCode();
        zzbi zzbiVar = this.zzl;
        int hashCode2 = ((hashCode * 961) + (zzbiVar == null ? 0 : zzbiVar.hashCode())) * 31;
        long j = this.zzf;
        int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.zzg;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.zzh;
        int i3 = ((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.zzi ? 1 : 0)) * 31) + (this.zzj ? 1 : 0)) * 31) + (this.zzm ? 1 : 0);
        long j4 = this.zzo;
        return ((((((i3 * 961) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.zzp) * 31) + this.zzq) * 31;
    }

    public final zzcz zza(Object obj, zzbs zzbsVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, zzbi zzbiVar, long j4, long j5, int i, int i2, long j6) {
        this.zzc = obj;
        this.zze = zzbsVar == null ? zzs : zzbsVar;
        this.zzd = null;
        this.zzf = -9223372036854775807L;
        this.zzg = -9223372036854775807L;
        this.zzh = -9223372036854775807L;
        this.zzi = z;
        this.zzj = z2;
        this.zzk = zzbiVar != null;
        this.zzl = zzbiVar;
        this.zzn = 0L;
        this.zzo = j5;
        this.zzp = 0;
        this.zzq = 0;
        this.zzm = false;
        return this;
    }

    public final boolean zzb() {
        zzef.zzf(this.zzk == (this.zzl != null));
        return this.zzl != null;
    }
}
