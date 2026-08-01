package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzghn extends zzgke {
    zzghn() {
        super(zzgsn.class, new zzghl(zzgcf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzghm(this, zzgsq.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgsn.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgsn zzgsnVar = (zzgsn) zzgxwVar;
        zzgui.zzb(zzgsnVar.zza(), 0);
        if (zzghk.zzb(zzgsnVar.zzf().zza().zzh())) {
            return;
        }
        throw new GeneralSecurityException("Unsupported DEK key type: " + zzgsnVar.zzf().zza().zzh() + ". Only Tink AEAD key types are supported.");
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
