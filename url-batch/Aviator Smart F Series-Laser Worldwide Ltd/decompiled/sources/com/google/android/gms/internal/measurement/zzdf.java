package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes3.dex */
final class zzdf extends zzdu {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzbz zzd;
    final /* synthetic */ zzef zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzdf(zzef zzefVar, String str, String str2, boolean z7, zzbz zzbzVar) {
        super(zzefVar, true);
        this.zze = zzefVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = z7;
        this.zzd = zzbzVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() {
        zzcc zzccVar;
        zzccVar = this.zze.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).getUserProperties(this.zza, this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    protected final void zzb() {
        this.zzd.zze(null);
    }
}
