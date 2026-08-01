package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgeu extends zzgke {
    zzgeu() {
        super(zzgpp.class, new zzges(zzguc.class));
    }

    public static final void zzh(zzgpp zzgppVar) throws GeneralSecurityException {
        zzgui.zzb(zzgppVar.zza(), 0);
        zzgui.zza(zzgppVar.zzh().zzd());
        zzm(zzgppVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgpv zzgpvVar) throws GeneralSecurityException {
        if (zzgpvVar.zza() < 12 || zzgpvVar.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzget(this, zzgps.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgpp.zzf(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzh((zzgpp) zzgxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
