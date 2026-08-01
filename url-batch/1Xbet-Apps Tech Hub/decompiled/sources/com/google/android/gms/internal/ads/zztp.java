package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zztp implements zzui, zzuh {
    public final zzui zza;
    long zzb;
    private zzuh zzc;
    private zzto[] zzd = new zzto[0];
    private long zze = 0;

    public zztp(zzui zzuiVar, boolean z, long j, long j2) {
        this.zza = zzuiVar;
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zza(long j, zzmd zzmdVar) {
        if (j == 0) {
            return 0L;
        }
        long max = Math.max(0L, Math.min(zzmdVar.zzf, j));
        long j2 = zzmdVar.zzg;
        long j3 = this.zzb;
        long max2 = Math.max(0L, Math.min(j2, j3 == Long.MIN_VALUE ? Long.MAX_VALUE : j3 - j));
        if (max != zzmdVar.zzf || max2 != zzmdVar.zzg) {
            zzmdVar = new zzmd(max, max2);
        }
        return this.zza.zza(j, zzmdVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzb() {
        long zzb = this.zza.zzb();
        if (zzb != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzb < j) {
                return zzb;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final long zzc() {
        long zzc = this.zza.zzc();
        if (zzc != Long.MIN_VALUE) {
            long j = this.zzb;
            if (j == Long.MIN_VALUE || zzc < j) {
                return zzc;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final long zzd() {
        if (zzq()) {
            long j = this.zze;
            this.zze = -9223372036854775807L;
            long zzd = zzd();
            return zzd != -9223372036854775807L ? zzd : j;
        }
        long zzd2 = this.zza.zzd();
        if (zzd2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        zzef.zzf(zzd2 >= 0);
        long j2 = this.zzb;
        zzef.zzf(j2 == Long.MIN_VALUE || zzd2 <= j2);
        return zzd2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r0 > r3) goto L17;
     */
    @Override // com.google.android.gms.internal.ads.zzui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zze(long j) {
        this.zze = -9223372036854775807L;
        boolean z = false;
        for (zzto zztoVar : this.zzd) {
            if (zztoVar != null) {
                zztoVar.zzc();
            }
        }
        long zze = this.zza.zze(j);
        if (zze != j) {
            if (zze >= 0) {
                long j2 = this.zzb;
                if (j2 != Long.MIN_VALUE) {
                }
            }
            zzef.zzf(z);
            return zze;
        }
        z = true;
        zzef.zzf(z);
        return zze;
    }

    @Override // com.google.android.gms.internal.ads.zzwb
    public final /* bridge */ /* synthetic */ void zzf(zzwc zzwcVar) {
        zzuh zzuhVar = this.zzc;
        zzuhVar.getClass();
        zzuhVar.zzf(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
    
        if (r4 > r6) goto L24;
     */
    @Override // com.google.android.gms.internal.ads.zzui
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long zzg(zzxy[] zzxyVarArr, boolean[] zArr, zzwa[] zzwaVarArr, boolean[] zArr2, long j) {
        int length = zzwaVarArr.length;
        this.zzd = new zzto[length];
        zzwa[] zzwaVarArr2 = new zzwa[length];
        int i = 0;
        while (true) {
            zzwa zzwaVar = null;
            if (i >= zzwaVarArr.length) {
                break;
            }
            zzto[] zztoVarArr = this.zzd;
            zzto zztoVar = (zzto) zzwaVarArr[i];
            zztoVarArr[i] = zztoVar;
            if (zztoVar != null) {
                zzwaVar = zztoVar.zza;
            }
            zzwaVarArr2[i] = zzwaVar;
            i++;
        }
        long zzg = this.zza.zzg(zzxyVarArr, zArr, zzwaVarArr2, zArr2, j);
        long j2 = (zzq() && j == 0) ? 0L : j;
        this.zze = -9223372036854775807L;
        boolean z = true;
        if (zzg != j2) {
            if (zzg >= 0) {
                long j3 = this.zzb;
                if (j3 != Long.MIN_VALUE) {
                }
            }
            z = false;
        }
        zzef.zzf(z);
        for (int i2 = 0; i2 < zzwaVarArr.length; i2++) {
            zzwa zzwaVar2 = zzwaVarArr2[i2];
            if (zzwaVar2 == null) {
                this.zzd[i2] = null;
            } else {
                zzto[] zztoVarArr2 = this.zzd;
                zzto zztoVar2 = zztoVarArr2[i2];
                if (zztoVar2 == null || zztoVar2.zza != zzwaVar2) {
                    zztoVarArr2[i2] = new zzto(this, zzwaVar2);
                }
            }
            zzwaVarArr[i2] = this.zzd[i2];
        }
        return zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final zzwl zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzj(long j, boolean z) {
        this.zza.zzj(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzk() throws IOException {
        this.zza.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzui
    public final void zzl(zzuh zzuhVar, long j) {
        this.zzc = zzuhVar;
        this.zza.zzl(this, j);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final void zzm(long j) {
        this.zza.zzm(j);
    }

    public final void zzn(long j, long j2) {
        this.zzb = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzo(zzla zzlaVar) {
        return this.zza.zzo(zzlaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzui, com.google.android.gms.internal.ads.zzwc
    public final boolean zzp() {
        return this.zza.zzp();
    }

    final boolean zzq() {
        return this.zze != -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzuh
    public final void zzh(zzui zzuiVar) {
        zzuh zzuhVar = this.zzc;
        zzuhVar.getClass();
        zzuhVar.zzh(this);
    }
}
