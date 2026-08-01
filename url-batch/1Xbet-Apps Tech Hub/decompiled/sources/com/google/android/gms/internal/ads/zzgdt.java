package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgdt {

    @Deprecated
    static final zzgsv zza;

    @Deprecated
    static final zzgsv zzb;

    @Deprecated
    static final zzgsv zzc;

    static {
        new zzgeg();
        new zzgft();
        new zzggl();
        new zzgfb();
        new zzghj();
        new zzghn();
        new zzggz();
        new zzgir();
        zzgsv zzc2 = zzgsv.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgdy.zzd();
        zzgnr.zza();
        zzgeg.zze(true);
        zzgft.zze(true);
        if (zzgjm.zzb()) {
            return;
        }
        zzgdo.zze(new zzgfb(), true);
        int i = zzgfl.zza;
        zzgfl.zzc(zzgku.zzc());
        zzgkq zzb2 = zzgkq.zzb();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzgim.zzc);
        zzgfd zzgfdVar = new zzgfd(null);
        zzgfdVar.zza(16);
        zzgfdVar.zzb(16);
        zzgfdVar.zzc(16);
        zzgfdVar.zzd(zzgfe.zzc);
        hashMap.put("AES128_EAX_RAW", zzgfdVar.zze());
        hashMap.put("AES256_EAX", zzgim.zzd);
        zzgfd zzgfdVar2 = new zzgfd(null);
        zzgfdVar2.zza(16);
        zzgfdVar2.zzb(32);
        zzgfdVar2.zzc(16);
        zzgfdVar2.zzd(zzgfe.zzc);
        hashMap.put("AES256_EAX_RAW", zzgfdVar2.zze());
        zzb2.zzd(Collections.unmodifiableMap(hashMap));
        zzggl.zze(true);
        zzgdo.zze(new zzggz(), true);
        int i2 = zzghg.zza;
        zzghg.zzc(zzgku.zzc());
        zzgkq zzb3 = zzgkq.zzb();
        HashMap hashMap2 = new HashMap();
        hashMap2.put("CHACHA20_POLY1305", zzghb.zzc(zzgha.zza));
        hashMap2.put("CHACHA20_POLY1305_RAW", zzghb.zzc(zzgha.zzc));
        zzb3.zzd(Collections.unmodifiableMap(hashMap2));
        zzgdo.zze(new zzghj(), true);
        int i3 = zzghu.zza;
        zzghu.zza(zzgku.zzc());
        zzgdo.zze(new zzghn(), true);
        int i4 = zzgif.zza;
        zzgif.zzc(zzgku.zzc());
        zzgir.zze(true);
    }
}
