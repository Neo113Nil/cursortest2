package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzggz extends zzgke {
    zzggz() {
        super(zzgqt.class, new zzggx(zzgcf.class));
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzggy(this, zzgqw.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgqt.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgqt zzgqtVar = (zzgqt) zzgxwVar;
        zzgui.zzb(zzgqtVar.zza(), 0);
        if (zzgqtVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
