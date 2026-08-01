package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgnj extends zzgkd {
    final /* synthetic */ zzgnk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgnj(zzgnk zzgnkVar, Class cls) {
        super(cls);
        this.zza = zzgnkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgre zzgreVar = (zzgre) zzgxwVar;
        zzgra zzc = zzgrb.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgreVar.zzh());
        byte[] zzb = zzglr.zzb(zzgreVar.zza());
        zzc.zza(zzgve.zzv(zzb, 0, zzb.length));
        return (zzgrb) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgre.zzg(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgre zzgreVar = (zzgre) zzgxwVar;
        if (zzgreVar.zza() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        zzgnk.zzn(zzgreVar.zzh());
    }
}
