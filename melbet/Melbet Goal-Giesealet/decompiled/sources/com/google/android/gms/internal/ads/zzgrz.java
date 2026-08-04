package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzgrz {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgrx.zza, zzgrw.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.AesEaxKey", zzgpx.class, zzhds.SYMMETRIC, zzhct.zzg());
    private static final zzgyd zzd = zzgry.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering AES EAX is not supported in FIPS mode");
        }
        int i = zzgvg.zza;
        zzgvg.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zza2 = zzgyk.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzguj.zzc);
        zzgsa zzgsaVar = new zzgsa(null);
        zzgsaVar.zzb(16);
        zzgsaVar.zza(16);
        zzgsaVar.zzc(16);
        zzgsb zzgsbVar = zzgsb.zzc;
        zzgsaVar.zzd(zzgsbVar);
        hashMap.put("AES128_EAX_RAW", zzgsaVar.zze());
        hashMap.put("AES256_EAX", zzguj.zzd);
        zzgsa zzgsaVar2 = new zzgsa(null);
        zzgsaVar2.zzb(16);
        zzgsaVar2.zza(32);
        zzgsaVar2.zzc(16);
        zzgsaVar2.zzd(zzgsbVar);
        hashMap.put("AES256_EAX_RAW", zzgsaVar2.zze());
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzgyf.zza().zzb(zzd, zzgsc.class);
        zzgxk.zza().zzb(zzc, true);
    }
}
