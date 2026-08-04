package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
final class zzwn implements zzun, zzum {
    private final zzun zza;
    private final long zzb;
    private zzum zzc;

    public zzwn(zzun zzunVar, long j) {
        this.zza = zzunVar;
        this.zzb = j;
    }

    public final zzun zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzb(zzum zzumVar, long j) {
        this.zzc = zzumVar;
        this.zza.zzb(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzc() throws IOException {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final zzwq zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zze(zzyf[] zzyfVarArr, boolean[] zArr, zzwf[] zzwfVarArr, boolean[] zArr2, long j) {
        zzwf[] zzwfVarArr2 = new zzwf[zzwfVarArr.length];
        int i = 0;
        while (true) {
            zzwf zzwfVar = null;
            if (i >= zzwfVarArr.length) {
                break;
            }
            zzwm zzwmVar = (zzwm) zzwfVarArr[i];
            if (zzwmVar != null) {
                zzwfVar = zzwmVar.zza();
            }
            zzwfVarArr2[i] = zzwfVar;
            i++;
        }
        zzun zzunVar = this.zza;
        long j2 = this.zzb;
        long zze = zzunVar.zze(zzyfVarArr, zArr, zzwfVarArr2, zArr2, j - j2);
        for (int i2 = 0; i2 < zzwfVarArr.length; i2++) {
            zzwf zzwfVar2 = zzwfVarArr2[i2];
            if (zzwfVar2 == null) {
                zzwfVarArr[i2] = null;
            } else {
                zzwf zzwfVar3 = zzwfVarArr[i2];
                if (zzwfVar3 == null || ((zzwm) zzwfVar3).zza() != zzwfVar2) {
                    zzwfVarArr[i2] = new zzwm(zzwfVar2, j2);
                }
            }
        }
        return zze + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final void zzf(long j, boolean z) {
        this.zza.zzf(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zza.zzg(j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzh() {
        long zzh = this.zza.zzh();
        if (zzh == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzh + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        long zzi = this.zza.zzi();
        if (zzi == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzi + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzj(long j) {
        long j2 = this.zzb;
        return this.zza.zzj(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun
    public final long zzk(long j, zzlt zzltVar) {
        long j2 = this.zzb;
        return this.zza.zzk(j - j2, zzltVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        long zzl = this.zza.zzl();
        if (zzl == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzl + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        long j = zzklVar.zza;
        long j2 = this.zzb;
        zzkk zza = zzklVar.zza();
        zza.zza(j - j2);
        return this.zza.zzm(zza.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzun, com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzwg
    public final /* bridge */ /* synthetic */ void zzs(zzwh zzwhVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzs(this);
    }

    @Override // com.google.android.gms.internal.ads.zzum
    public final void zzp(zzun zzunVar) {
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzumVar.zzp(this);
    }
}
