package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgir extends zzgke {
    private static final zzgkl zza = new zzgkl() { // from class: com.google.android.gms.internal.ads.zzgio
    };

    zzgir() {
        super(zzgsy.class, new zzgip(zzgcf.class));
    }

    public static void zze(boolean z) throws GeneralSecurityException {
        zzgdo.zze(new zzgir(), true);
        int i = zzgiy.zza;
        zzgiy.zzc(zzgku.zzc());
        zzgkq zzb = zzgkq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzgit.zzc(zzgis.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzgit.zzc(zzgis.zzc));
        zzb.zzd(Collections.unmodifiableMap(hashMap));
        zzgkm.zza().zzb(zza, zzgit.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzgiq(this, zzgtb.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgsy.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgsy zzgsyVar = (zzgsy) zzgxwVar;
        zzgui.zzb(zzgsyVar.zza(), 0);
        if (zzgsyVar.zzf().zzd() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 1;
    }
}
