package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgnr {

    @Deprecated
    static final zzgsv zza;

    @Deprecated
    static final zzgsv zzb;

    @Deprecated
    static final zzgsv zzc;

    static {
        new zzgnk();
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
        zzgnx.zzd();
        zzgna.zzd();
        zzgnk.zzh(true);
        if (zzgjm.zzb()) {
            return;
        }
        zzgmm.zzm(true);
    }
}
