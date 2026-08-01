package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzxq extends zzxs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final boolean zzm;

    /* JADX WARN: Multi-variable type inference failed */
    public zzxq(int i, zzdc zzdcVar, int i2, zzxk zzxkVar, int i3, String str) {
        super(i, zzdcVar, i2);
        int i4;
        int i5 = 0;
        this.zzf = zzxw.zzn(i3, false);
        int i6 = this.zzd.zze;
        int i7 = zzxkVar.zzy;
        this.zzg = 1 == (i6 & 1);
        this.zzh = (i6 & 2) != 0;
        zzfwu zzm = zzxkVar.zzw.isEmpty() ? zzfwu.zzm("") : zzxkVar.zzw;
        int i8 = 0;
        while (true) {
            if (i8 >= zzm.size()) {
                i8 = Integer.MAX_VALUE;
                i4 = 0;
                break;
            }
            zzam zzamVar = this.zzd;
            String str2 = (String) zzm.get(i8);
            boolean z = zzxkVar.zzz;
            i4 = zzxw.zza(zzamVar, str2, false);
            if (i4 > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.zzi = i8;
        this.zzj = i4;
        int i9 = this.zzd.zzf;
        int i10 = zzxkVar.zzx;
        int bitCount = Integer.bitCount(0);
        this.zzk = bitCount;
        int i11 = this.zzd.zzf;
        this.zzm = false;
        int zza = zzxw.zza(this.zzd, str, zzxw.zzg(str) == null);
        this.zzl = zza;
        boolean z2 = i4 > 0 || (zzxkVar.zzw.isEmpty() && bitCount > 0) || this.zzg || (this.zzh && zza > 0);
        if (zzxw.zzn(i3, zzxkVar.zzS) && z2) {
            i5 = 1;
        }
        this.zze = i5;
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxq zzxqVar) {
        zzfwj zzb = zzfwj.zzj().zzd(this.zzf, zzxqVar.zzf).zzc(Integer.valueOf(this.zzi), Integer.valueOf(zzxqVar.zzi), zzfyd.zzc().zza()).zzb(this.zzj, zzxqVar.zzj).zzb(this.zzk, zzxqVar.zzk).zzd(this.zzg, zzxqVar.zzg).zzc(Boolean.valueOf(this.zzh), Boolean.valueOf(zzxqVar.zzh), this.zzj == 0 ? zzfyd.zzc() : zzfyd.zzc().zza()).zzb(this.zzl, zzxqVar.zzl);
        if (this.zzk == 0) {
            boolean z = zzxqVar.zzm;
            zzb = zzb.zze(false, false);
        }
        return zzb.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final int zzb() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzxs
    public final /* bridge */ /* synthetic */ boolean zzc(zzxs zzxsVar) {
        return false;
    }
}
