package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzgbr implements zzgen {
    final zzikp zza;
    final zzikp zzb;
    final zzikp zzc;
    final zzikp zzd;
    final zzikp zze;
    private final zzgbl zzf;
    private final zzgbr zzg = this;

    zzgbr(zzgbl zzgblVar) {
        this.zzf = zzgblVar;
        zzikp zza = zzikf.zza(zzgeq.zza());
        this.zza = zza;
        zzikp zza2 = zzikf.zza(zzgga.zza(zzgblVar.zza, zzgblVar.zzc, zzgblVar.zzG, zza, zzgblVar.zzJ, zzgblVar.zzu, zzgblVar.zzj, zzggd.zza()));
        this.zzb = zza2;
        zzikp zza3 = zzikf.zza(zzgev.zza());
        this.zzc = zza3;
        zzgbq zzgbqVar = new zzgbq(this);
        this.zzd = zzgbqVar;
        this.zze = zzikf.zza(zzgeo.zza(zzgblVar.zzc, zza2, zzgblVar.zzG, zzgblVar.zzF, zza3, zzgbqVar, zzgblVar.zzj));
    }

    @Override // com.google.android.gms.internal.ads.zzgen
    public final zzgdv zza() {
        return (zzgdv) this.zze.zzb();
    }

    final /* synthetic */ zzgbl zzb() {
        return this.zzf;
    }

    final /* synthetic */ zzgbr zzc() {
        return this.zzg;
    }
}
