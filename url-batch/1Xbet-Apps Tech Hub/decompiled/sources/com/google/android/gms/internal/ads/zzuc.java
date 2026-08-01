package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzuc implements zzui, zzuh {
    public final zzuk zza;
    private final long zzb;
    private zzum zzc;
    private zzui zzd;
    private zzuh zze;
    private long zzf = -9223372036854775807L;
    private final zzyn zzg;

    public zzuc(zzuk zzukVar, zzyn zzynVar, long j) {
        this.zza = zzukVar;
        this.zzg = zzynVar;
        this.zzb = j;
    }

    private final long zzv(long j) {
        long j2 = this.zzf;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zza(long j, zzmd zzmdVar) {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zza(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzd() {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zze(long j) {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zze(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzf(zzwc zzwcVar) {
        zzuh zzuhVar = this.zze;
        int i = zzfs.zza;
        zzuhVar.zzf(this);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzg(zzxy[] zzxyVarArr, boolean[] zArr, zzwa[] zzwaVarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.zzf;
        if (j3 == -9223372036854775807L || j != this.zzb) {
            j2 = j;
        } else {
            this.zzf = -9223372036854775807L;
            j2 = j3;
        }
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zzg(zzxyVarArr, zArr, zzwaVarArr, zArr2, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzh(zzui zzuiVar) {
        zzuh zzuhVar = this.zze;
        int i = zzfs.zza;
        zzuhVar.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzwl zzi() {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        return zzuiVar.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzj(long j, boolean z) {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        zzuiVar.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk() throws IOException {
        try {
            zzui zzuiVar = this.zzd;
            if (zzuiVar != null) {
                zzuiVar.zzk();
                return;
            }
            zzum zzumVar = this.zzc;
            if (zzumVar != null) {
                zzumVar.zzz();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzl(zzuh zzuhVar, long j) {
        this.zze = zzuhVar;
        zzui zzuiVar = this.zzd;
        if (zzuiVar != null) {
            zzuiVar.zzl(this, zzv(this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
        zzui zzuiVar = this.zzd;
        int i = zzfs.zza;
        zzuiVar.zzm(j);
    }

    public final long zzn() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        zzui zzuiVar = this.zzd;
        return zzuiVar != null && zzuiVar.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        zzui zzuiVar = this.zzd;
        return zzuiVar != null && zzuiVar.zzp();
    }

    public final long zzq() {
        return this.zzb;
    }

    public final void zzr(zzuk zzukVar) {
        long zzv = zzv(this.zzb);
        zzum zzumVar = this.zzc;
        zzumVar.getClass();
        zzui zzI = zzumVar.zzI(zzukVar, this.zzg, zzv);
        this.zzd = zzI;
        if (this.zze != null) {
            zzI.zzl(this, zzv);
        }
    }

    public final void zzs(long j) {
        this.zzf = j;
    }

    public final void zzu(zzum zzumVar) {
        zzef.zzf(this.zzc == null);
        this.zzc = zzumVar;
    }

    public final void zzt() {
        zzui zzuiVar = this.zzd;
        if (zzuiVar != null) {
            zzum zzumVar = this.zzc;
            zzumVar.getClass();
            zzumVar.zzG(zzuiVar);
        }
    }
}
