package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzgpa {
    private static final zzgmx zza = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgow
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return new zzgqb((zzgov) zzgdyVar);
        }
    }, zzgov.class, zzgoo.class);
    private static final zzgmx zzb = zzgmx.zzb(new zzgmv() { // from class: com.google.android.gms.internal.ads.zzgox
        @Override // com.google.android.gms.internal.ads.zzgmv
        public final Object zza(zzgdy zzgdyVar) {
            return zzgvo.zzb((zzgov) zzgdyVar);
        }
    }, zzgov.class, zzgem.class);
    private static final zzgdz zzc = zzglh.zzd("type.googleapis.com/google.crypto.tink.HmacKey", zzgem.class, zzgsu.SYMMETRIC, zzgsl.zzi());
    private static final zzgmb zzd = new zzgmb() { // from class: com.google.android.gms.internal.ads.zzgoy
    };
    private static final zzglz zze = new zzglz() { // from class: com.google.android.gms.internal.ads.zzgoz
        @Override // com.google.android.gms.internal.ads.zzglz
        public final zzgdy zza(zzgen zzgenVar, Integer num) {
            zzgpg zzgpgVar = (zzgpg) zzgenVar;
            zzgot zzgotVar = new zzgot(null);
            zzgotVar.zzc(zzgpgVar);
            zzgotVar.zzb(zzgvs.zzc(zzgpgVar.zzc()));
            zzgotVar.zza(num);
            return zzgotVar.zzd();
        }
    };
    private static final int zzf = 2;

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzf;
        if (!zzgkr.zza(i)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i2 = zzgqg.zza;
        zzgqg.zze(zzgmk.zzc());
        zzgmh.zza().zze(zza);
        zzgmh.zza().zze(zzb);
        zzgmg zzb2 = zzgmg.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgpt.zza);
        zzgpc zzgpcVar = new zzgpc(null);
        zzgpcVar.zzb(32);
        zzgpcVar.zzc(16);
        zzgpcVar.zzd(zzgpe.zzd);
        zzgpcVar.zza(zzgpd.zzc);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgpcVar.zze());
        zzgpc zzgpcVar2 = new zzgpc(null);
        zzgpcVar2.zzb(32);
        zzgpcVar2.zzc(32);
        zzgpcVar2.zzd(zzgpe.zza);
        zzgpcVar2.zza(zzgpd.zzc);
        hashMap.put("HMAC_SHA256_256BITTAG", zzgpcVar2.zze());
        zzgpc zzgpcVar3 = new zzgpc(null);
        zzgpcVar3.zzb(32);
        zzgpcVar3.zzc(32);
        zzgpcVar3.zzd(zzgpe.zzd);
        zzgpcVar3.zza(zzgpd.zzc);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgpcVar3.zze());
        zzgpc zzgpcVar4 = new zzgpc(null);
        zzgpcVar4.zzb(64);
        zzgpcVar4.zzc(16);
        zzgpcVar4.zzd(zzgpe.zza);
        zzgpcVar4.zza(zzgpd.zze);
        hashMap.put("HMAC_SHA512_128BITTAG", zzgpcVar4.zze());
        zzgpc zzgpcVar5 = new zzgpc(null);
        zzgpcVar5.zzb(64);
        zzgpcVar5.zzc(16);
        zzgpcVar5.zzd(zzgpe.zzd);
        zzgpcVar5.zza(zzgpd.zze);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgpcVar5.zze());
        zzgpc zzgpcVar6 = new zzgpc(null);
        zzgpcVar6.zzb(64);
        zzgpcVar6.zzc(32);
        zzgpcVar6.zzd(zzgpe.zza);
        zzgpcVar6.zza(zzgpd.zze);
        hashMap.put("HMAC_SHA512_256BITTAG", zzgpcVar6.zze());
        zzgpc zzgpcVar7 = new zzgpc(null);
        zzgpcVar7.zzb(64);
        zzgpcVar7.zzc(32);
        zzgpcVar7.zzd(zzgpe.zzd);
        zzgpcVar7.zza(zzgpd.zze);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgpcVar7.zze());
        hashMap.put("HMAC_SHA512_512BITTAG", zzgpt.zzb);
        zzgpc zzgpcVar8 = new zzgpc(null);
        zzgpcVar8.zzb(64);
        zzgpcVar8.zzc(64);
        zzgpcVar8.zzd(zzgpe.zzd);
        zzgpcVar8.zza(zzgpd.zze);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgpcVar8.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzgma.zzb().zzc(zze, zzgpg.class);
        zzgmc.zza().zzb(zzd, zzgpg.class);
        zzgky.zzc().zzf(zzc, i, true);
    }
}
