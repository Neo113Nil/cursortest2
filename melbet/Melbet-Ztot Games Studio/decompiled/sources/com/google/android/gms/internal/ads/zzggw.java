package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzggw {
    private static final zzgmx zza = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzggt
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgkq.zzb((zzggs) zzgdyVar);
        }
    }, zzggs.class, zzgdo.class);
    private static final zzglz zzb = new zzglz() { // from class: com.google.android.gms.internal.ads.zzggu
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            zzghb zzghbVar = (zzghb) zzgenVar;
            zzggq zzggqVar = new zzggq(null);
            zzggqVar.zzc(zzghbVar);
            zzggqVar.zza(num);
            zzggqVar.zzb(zzgvs.zzc(zzghbVar.zzb()));
            return zzggqVar.zzd();
        }
    };
    private static final zzgmb zzc = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzggv
    };
    private static final zzgdz zzd = zzglh.zzd("type.googleapis.com/google.crypto.tink.AesGcmSivKey", zzgdo.class, zzgsu.SYMMETRIC, zzgry.zzg());

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgkr.zza(1)) {
            throw new GeneralSecurityException("Registering AES GCM SIV is not supported in FIPS mode");
        }
        int i = zzgjq.zza;
        zzgjq.zze(zzgmk.zzc());
        if (zzb()) {
            zzgmh.zza().zze(zza);
            zzgmg zzb2 = zzgmg.zzb();
            HashMap hashMap = new HashMap();
            zzggy zzggyVar = new zzggy(null);
            zzggyVar.zza(16);
            zzggyVar.zzb(zzggz.zza);
            hashMap.put("AES128_GCM_SIV", zzggyVar.zzc());
            zzggy zzggyVar2 = new zzggy(null);
            zzggyVar2.zza(16);
            zzggyVar2.zzb(zzggz.zzc);
            hashMap.put("AES128_GCM_SIV_RAW", zzggyVar2.zzc());
            zzggy zzggyVar3 = new zzggy(null);
            zzggyVar3.zza(32);
            zzggyVar3.zzb(zzggz.zza);
            hashMap.put("AES256_GCM_SIV", zzggyVar3.zzc());
            zzggy zzggyVar4 = new zzggy(null);
            zzggyVar4.zza(32);
            zzggyVar4.zzb(zzggz.zzc);
            hashMap.put("AES256_GCM_SIV_RAW", zzggyVar4.zzc());
            zzb2.zzd(Collections.unmodifiableMap(hashMap));
            zzgmc.zza().zzb(zzc, zzghb.class);
            zzgma.zzb().zzc(zzb, zzghb.class);
            zzgky.zzc().zzd(zzd, true);
        }
    }

    private static boolean zzb() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }
}
