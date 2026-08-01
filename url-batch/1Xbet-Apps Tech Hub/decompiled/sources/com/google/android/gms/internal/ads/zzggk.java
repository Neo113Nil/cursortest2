package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzggk extends zzgkd {
    final /* synthetic */ zzggl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzggk(zzggl zzgglVar, Class cls) {
        super(cls);
        this.zza = zzgglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqm zzc = zzgqn.zzc();
        byte[] zzb = zzglr.zzb(((zzgqq) zzgxwVar).zza());
        zzc.zza(zzgve.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgqn) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgqq.zzf(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgui.zza(((zzgqq) zzgxwVar).zza());
    }
}
