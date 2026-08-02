package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzvo extends zzth implements zzvf {
    private final zzfr zza;
    private final zzri zzb;
    private final int zzc;
    private boolean zzd = true;
    private long zze = -9223372036854775807L;
    private boolean zzf;
    private boolean zzg;
    private zzgu zzh;
    private zzbc zzi;
    private final zzvl zzj;
    private final zzyo zzk;

    /* synthetic */ zzvo(zzbc zzbcVar, zzfr zzfrVar, zzvl zzvlVar, zzri zzriVar, zzyo zzyoVar, int i, zzvn zzvnVar) {
        this.zzi = zzbcVar;
        this.zza = zzfrVar;
        this.zzj = zzvlVar;
        this.zzb = zzriVar;
        this.zzk = zzyoVar;
        this.zzc = i;
    }

    private final void zzw() {
        long j = this.zze;
        boolean z = this.zzf;
        boolean z2 = this.zzg;
        zzbc zzJ = zzJ();
        zzwb zzwbVar = new zzwb(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzJ, z2 ? zzJ.zzc : null);
        zzo(this.zzd ? new zzvk(this, zzwbVar) : zzwbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzG(zzug zzugVar) {
        ((zzvj) zzugVar).zzN();
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final zzug zzI(zzui zzuiVar, zzyk zzykVar, long j) {
        zzfs zza = this.zza.zza();
        zzgu zzguVar = this.zzh;
        if (zzguVar != null) {
            zza.zzf(zzguVar);
        }
        zzax zzaxVar = zzJ().zzb;
        zzaxVar.getClass();
        zzvl zzvlVar = this.zzj;
        zzb();
        return new zzvj(zzaxVar.zza, zza, new zztk(zzvlVar.zza), this.zzb, zzc(zzuiVar), this.zzk, zze(zzuiVar), this, zzykVar, null, this.zzc, zzet.zzr(-9223372036854775807L));
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final synchronized zzbc zzJ() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzvf
    public final void zza(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.zze;
        }
        if (!this.zzd && this.zze == j && this.zzf == z && this.zzg == z2) {
            return;
        }
        this.zze = j;
        this.zzf = z;
        this.zzg = z2;
        this.zzd = false;
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzth
    protected final void zzn(zzgu zzguVar) {
        this.zzh = zzguVar;
        Looper.myLooper().getClass();
        zzb();
        zzw();
    }

    @Override // com.google.android.gms.internal.ads.zzth
    protected final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzth, com.google.android.gms.internal.ads.zzuk
    public final synchronized void zzt(zzbc zzbcVar) {
        this.zzi = zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzuk
    public final void zzz() {
    }
}
