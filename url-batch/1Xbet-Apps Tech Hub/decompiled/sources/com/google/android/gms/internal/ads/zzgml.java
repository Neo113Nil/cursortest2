package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgml extends zzgkd {
    zzgml(zzgmm zzgmmVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = (zzgpd) zzgxwVar;
        zzgoz zzc = zzgpa.zzc();
        zzc.zzc(0);
        byte[] zzb = zzglr.zzb(zzgpdVar.zza());
        zzc.zza(zzgve.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgpdVar.zzf());
        return (zzgpa) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgpd.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = (zzgpd) zzgxwVar;
        zzgmm.zzn(zzgpdVar.zzf());
        zzgmm.zzo(zzgpdVar.zza());
    }
}
