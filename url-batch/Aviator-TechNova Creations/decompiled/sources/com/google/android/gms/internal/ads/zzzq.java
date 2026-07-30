package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzzq extends zzzs implements Comparable {
    private final int zze;
    private final boolean zzf;
    private final boolean zzg;
    private final boolean zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final int zzm;
    private final boolean zzn;

    public zzzq(int i, zzbg zzbgVar, int i2, zzzl zzzlVar, int i3, String str, String str2) {
        super(i, zzbgVar, i2);
        int i4;
        int i5;
        boolean z;
        int i6 = 0;
        this.zzf = zzmn.zzaa(i3, false);
        int i7 = this.zzd.zze;
        int i8 = zzzlVar.zzC;
        this.zzg = 1 == (i7 & 1);
        this.zzh = (i7 & 2) != 0;
        zzguf zzj = str2 != null ? zzguf.zzj(str2) : zzzlVar.zzy.isEmpty() ? zzguf.zzj("") : zzzlVar.zzy;
        int i9 = 0;
        while (true) {
            if (i9 >= zzj.size()) {
                i4 = 0;
                i9 = Integer.MAX_VALUE;
                break;
            }
            zzv zzvVar = this.zzd;
            String str3 = (String) zzj.get(i9);
            boolean z2 = zzzlVar.zzD;
            i4 = zzaaa.zzj(zzvVar, str3, false);
            if (i4 > 0) {
                break;
            } else {
                i9++;
            }
        }
        this.zzi = i9;
        this.zzj = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i10 = zzzlVar.zzA;
            i5 = 0;
        }
        int zzm = zzaaa.zzm(this.zzd.zzf, i5);
        this.zzk = zzm;
        zzv zzvVar2 = this.zzd;
        this.zzn = (1088 & zzvVar2.zzf) != 0;
        int zzn = zzaaa.zzn(zzvVar2, zzzlVar.zzz);
        this.zzl = zzn;
        int zzj2 = zzaaa.zzj(this.zzd, str, zzaaa.zzi(str) == null);
        this.zzm = zzj2;
        if (i4 > 0 || ((zzzlVar.zzy.isEmpty() && zzm > 0) || ((zzzlVar.zzy.isEmpty() && zzn != Integer.MAX_VALUE) || this.zzg || (this.zzh && zzj2 > 0)))) {
            z = true;
        } else {
            boolean z3 = zzzlVar.zzx;
            z = false;
        }
        if (zzmn.zzaa(i3, zzzlVar.zzV) && z) {
            i6 = 1;
        }
        this.zze = i6;
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzzq zzzqVar) {
        zzgts zza = zzgts.zzg().zzd(this.zzf, zzzqVar.zzf).zza(Integer.valueOf(this.zzi), Integer.valueOf(zzzqVar.zzi), zzgvz.zzb().zza());
        int i = this.zzj;
        zzgts zzb = zza.zzb(i, zzzqVar.zzj);
        int i2 = this.zzk;
        zzgts zzb2 = zzb.zzb(i2, zzzqVar.zzk).zza(Integer.valueOf(this.zzl), Integer.valueOf(zzzqVar.zzl), zzgvz.zzb().zza()).zzd(this.zzg, zzzqVar.zzg).zza(Boolean.valueOf(this.zzh), Boolean.valueOf(zzzqVar.zzh), i == 0 ? zzgvz.zzb() : zzgvz.zzb().zza()).zzb(this.zzm, zzzqVar.zzm);
        if (i2 == 0) {
            zzb2 = zzb2.zzc(this.zzn, zzzqVar.zzn);
        }
        return zzb2.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzs
    public final /* bridge */ /* synthetic */ boolean zzc(zzzs zzzsVar) {
        return false;
    }
}
