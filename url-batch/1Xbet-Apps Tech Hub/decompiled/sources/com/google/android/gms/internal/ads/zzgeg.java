package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgeg extends zzgke {
    private static final zzgkl zza = new zzgkl() { // from class: com.google.android.gms.internal.ads.zzged
    };

    zzgeg() {
        super(zzgpj.class, new zzgee(zzgcf.class));
    }

    public static void zze(boolean z) throws GeneralSecurityException {
        zzgdo.zze(new zzgeg(), true);
        int i = zzger.zza;
        zzger.zzc(zzgku.zzc());
        zzgkq zzb = zzgkq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzgim.zze);
        zzgei zzgeiVar = new zzgei(null);
        zzgeiVar.zza(16);
        zzgeiVar.zzc(32);
        zzgeiVar.zze(16);
        zzgeiVar.zzd(16);
        zzgeiVar.zzb(zzgej.zzc);
        zzgeiVar.zzf(zzgek.zzc);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgeiVar.zzg());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzgim.zzf);
        zzgei zzgeiVar2 = new zzgei(null);
        zzgeiVar2.zza(32);
        zzgeiVar2.zzc(32);
        zzgeiVar2.zze(32);
        zzgeiVar2.zzd(16);
        zzgeiVar2.zzb(zzgej.zzc);
        zzgeiVar2.zzf(zzgek.zzc);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgeiVar2.zzg());
        zzb.zzd(Collections.unmodifiableMap(hashMap));
        zzgkm.zza().zzb(zza, zzgem.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgkd zza() {
        return new zzgef(this, zzgpm.class);
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final zzgrl zzb() {
        return zzgrl.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* synthetic */ zzgxw zzc(zzgve zzgveVar) throws zzgwy {
        return zzgpj.zze(zzgveVar, zzgvy.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final /* bridge */ /* synthetic */ void zzf(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgpj zzgpjVar = (zzgpj) zzgxwVar;
        zzgui.zzb(zzgpjVar.zza(), 0);
        new zzgeu();
        zzgeu.zzh(zzgpjVar.zzf());
        new zzgnk();
        zzgnk.zzm(zzgpjVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzgke
    public final int zzg() {
        return 2;
    }
}
