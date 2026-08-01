package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzwi implements zzui, zzuh {
    private final zzui zza;
    private final long zzb;
    private zzuh zzc;

    public zzwi(zzui zzuiVar, long j) {
        this.zza = zzuiVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zza(long j, zzmd zzmdVar) {
        long j2 = this.zzb;
        return this.zza.zza(j - j2, zzmdVar) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzb + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return zzc + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzd() {
        long zzd = this.zza.zzd();
        if (zzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return zzd + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zze(long j) {
        long j2 = this.zzb;
        return this.zza.zze(j - j2) + j2;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzf(zzwc zzwcVar) {
        zzuh zzuhVar = this.zzc;
        zzuhVar.getClass();
        zzuhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzg(zzxy[] zzxyVarArr, boolean[] zArr, zzwa[] zzwaVarArr, boolean[] zArr2, long j) {
        zzwa[] zzwaVarArr2 = new zzwa[zzwaVarArr.length];
        int i = 0;
        while (true) {
            zzwa zzwaVar = null;
            if (i >= zzwaVarArr.length) {
                break;
            }
            zzwh zzwhVar = (zzwh) zzwaVarArr[i];
            if (zzwhVar != null) {
                zzwaVar = zzwhVar.zzc();
            }
            zzwaVarArr2[i] = zzwaVar;
            i++;
        }
        long zzg = this.zza.zzg(zzxyVarArr, zArr, zzwaVarArr2, zArr2, j - this.zzb);
        for (int i2 = 0; i2 < zzwaVarArr.length; i2++) {
            zzwa zzwaVar2 = zzwaVarArr2[i2];
            if (zzwaVar2 == null) {
                zzwaVarArr[i2] = null;
            } else {
                zzwa zzwaVar3 = zzwaVarArr[i2];
                if (zzwaVar3 == null || ((zzwh) zzwaVar3).zzc() != zzwaVar2) {
                    zzwaVarArr[i2] = new zzwh(zzwaVar2, this.zzb);
                }
            }
        }
        return zzg + this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzwl zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j - this.zzb, false);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzl(zzuh zzuhVar, long j) {
        this.zzc = zzuhVar;
        this.zza.zzl(this, j - this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
        this.zza.zzm(j - this.zzb);
    }

    public final zzui zzn() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        long j = zzlaVar.zza;
        long j2 = this.zzb;
        zzky zza = zzlaVar.zza();
        zza.zze(j - j2);
        return this.zza.zzo(zza.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        return this.zza.zzp();
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzh(zzui zzuiVar) {
        zzuh zzuhVar = this.zzc;
        zzuhVar.getClass();
        zzuhVar.zzh(this);
    }
}
