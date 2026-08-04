package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@24.6.0 */
/* loaded from: classes2.dex */
public final class zzguu {
    public static final /* synthetic */ int zza = 0;
    private static final zzgzc zzb = zzgzc.zzd(zzgut.zza, zzguq.class, zzgpx.class);
    private static final zzgqe zzc = zzgxs.zzd("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", zzgpx.class, zzhds.SYMMETRIC, zzhez.zze());
    private static final zzgyg zzd = zzgur.zza;
    private static final zzgyd zze = zzgus.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzgxd.zza(1)) {
            throw new GeneralSecurityException("Registering XChaCha20Poly1305 is not supported in FIPS mode");
        }
        int i = zzgww.zza;
        zzgww.zza(zzgyo.zza());
        zzgyl.zza().zzb(zzb);
        zzgyk zza2 = zzgyk.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzguw.zzb(zzguv.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzguw.zzb(zzguv.zzc));
        zza2.zzd(Collections.unmodifiableMap(hashMap));
        zzgyf.zza().zzb(zze, zzguw.class);
        zzgyh.zza().zzb(zzd, zzguw.class);
        zzgxk.zza().zzb(zzc, true);
    }
}
