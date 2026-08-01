package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgef extends zzgkd {
    final /* synthetic */ zzgeg zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzgef(zzgeg zzgegVar, Class cls) {
        super(cls);
        this.zza = zzgegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ zzgxw zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpm zzgpmVar = (zzgpm) zzgxwVar;
        new zzgeu();
        zzgpp zze = zzget.zze(zzgpmVar.zze());
        zzgxw zza = new zzgnk().zza().zza(zzgpmVar.zzf());
        zzgpi zzc = zzgpj.zzc();
        zzc.zza(zze);
        zzc.zzb((zzgrb) zza);
        zzc.zzc(0);
        return (zzgpj) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* synthetic */ zzgxw zzb(zzgve zzgveVar) throws zzgwy {
        return zzgpm.zzd(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgkd
    public final /* bridge */ /* synthetic */ void zzc(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpm zzgpmVar = (zzgpm) zzgxwVar;
        ((zzget) new zzgeu().zza()).zzc(zzgpmVar.zze());
        new zzgnk().zza().zzc(zzgpmVar.zzf());
        zzgui.zza(zzgpmVar.zze().zza());
    }
}
