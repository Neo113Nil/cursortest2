package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzcft implements zzkw {
    private final zzyn zzb = new zzyn(true, 65536);
    private long zzc = 15000000;
    private long zzd = 30000000;
    private long zze = 2500000;
    private long zzf = 5000000;
    private int zzg;
    private boolean zzh;

    zzcft() {
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final long zza() {
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzb() {
        zzj(false);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzc() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final void zzd() {
        zzj(true);
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final /* synthetic */ void zze(zzda zzdaVar, zzuk zzukVar, zzlz[] zzlzVarArr, zzwl zzwlVar, zzxy[] zzxyVarArr) {
        int i = 0;
        this.zzg = 0;
        while (true) {
            int length = zzlzVarArr.length;
            if (i >= 2) {
                this.zzb.zzf(this.zzg);
                return;
            } else {
                if (zzxyVarArr[i] != null) {
                    this.zzg += zzlzVarArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzd ? (char) 0 : j2 < this.zzc ? (char) 2 : (char) 1;
        int zza = this.zzb.zza();
        int i = this.zzg;
        if (c != 2 && (c != 1 || !this.zzh || zza >= i)) {
            z = false;
        }
        this.zzh = z;
        return z;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final /* synthetic */ boolean zzh(zzda zzdaVar, zzuk zzukVar, long j, float f, boolean z, long j2) {
        long j3 = z ? this.zzf : this.zze;
        return j3 <= 0 || j >= j3;
    }

    @Override // com.google.android.gms.internal.ads.zzkw
    public final zzyn zzi() {
        return this.zzb;
    }

    final void zzj(boolean z) {
        this.zzg = 0;
        this.zzh = false;
        if (z) {
            this.zzb.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zze = i * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zzf = i * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzd = i * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzc = i * 1000;
    }
}
