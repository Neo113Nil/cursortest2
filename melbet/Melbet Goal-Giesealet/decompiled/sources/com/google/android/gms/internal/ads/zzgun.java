package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgun {
    private static final zzgyd zza = zzgum.zza;
    private static final zzgzc zzb = zzgzc.zzd(zzgul.zza, zzguk.class, zzgpx.class);

    public static void zza(boolean z) throws GeneralSecurityException {
        int i = zzgwq.zza;
        zzgwq.zza(zzgyo.zza());
        zzgyk zza2 = zzgyk.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XAES_256_GCM_192_BIT_NONCE", zzguj.zzg);
        hashMap.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", zzguj.zzh);
        hashMap.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", zzguj.zzi);
        hashMap.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", zzguj.zzj);
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzgyl.zza().zzb(zzb);
        zzgyf.zza().zzb(zza, zzgup.class);
    }
}
