package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzxu extends zzvj implements zzxi {
    private final zzha zza;
    private final zzxc zzb;
    private final zzto zzc;
    private final int zzd;
    private boolean zze = true;
    private long zzf = -9223372036854775807L;
    private boolean zzg;
    private boolean zzh;
    private zzhz zzi;
    private zzak zzj;
    private final zzaaw zzk;

    /* synthetic */ zzxu(zzak zzakVar, zzha zzhaVar, zzxc zzxcVar, zzto zztoVar, zzaaw zzaawVar, int i, boolean z, int i2, zzv zzvVar, zzgru zzgruVar, byte[] bArr) {
        this.zzj = zzakVar;
        this.zza = zzhaVar;
        this.zzb = zzxcVar;
        this.zzc = zztoVar;
        this.zzk = zzaawVar;
        this.zzd = i;
    }

    private final void zzu() {
        long j = this.zzf;
        boolean z = this.zzg;
        boolean z2 = this.zzh;
        zzak zzJ = zzJ();
        zzbf zzygVar = new zzyg(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, zzJ, z2 ? zzJ.zzc : null);
        if (this.zze) {
            zzygVar = new zzxr(this, zzygVar);
        }
        zze(zzygVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized void zzA(zzak zzakVar) {
        this.zzj = zzakVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzD(zzwi zzwiVar) {
        ((zzxq) zzwiVar).zza();
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final zzwi zzG(zzwk zzwkVar, zzaan zzaanVar, long j) {
        zzhb zza = this.zza.zza();
        zzhz zzhzVar = this.zzi;
        if (zzhzVar != null) {
            zza.zze(zzhzVar);
        }
        zzag zzagVar = zzJ().zzb;
        zzagVar.getClass();
        return new zzxq(zzagVar.zza, zza, this.zzb.zza(zzk()), this.zzc, zzh(zzwkVar), this.zzk, zzf(zzwkVar), this, zzaanVar, null, this.zzd, false, 0, null, zzfj.zzq(-9223372036854775807L), null);
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final synchronized zzak zzJ() {
        return this.zzj;
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zza(zzhz zzhzVar) {
        this.zzi = zzhzVar;
        Looper.myLooper().getClass();
        zzk();
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzxi
    public final void zzb(long j, zzafy zzafyVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.zzf;
        }
        boolean zzb = zzafyVar.zzb();
        if (!this.zze && this.zzf == j && this.zzg == zzb && this.zzh == z) {
            return;
        }
        this.zzf = j;
        this.zzg = zzb;
        this.zzh = z;
        this.zze = false;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzvj
    protected final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.zzwm
    public final void zzt() {
    }
}
