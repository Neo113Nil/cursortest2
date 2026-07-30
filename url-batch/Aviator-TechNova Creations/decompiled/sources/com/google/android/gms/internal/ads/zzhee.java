package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
public final class zzhee {
    public static final /* synthetic */ int zza = 0;
    private static final zzhku zzb = zzhku.zzd(zzhed.zza, zzhej.class, zzhas.class);
    private static final zzhba zzc = zzhjl.zze("type.googleapis.com/google.crypto.tink.KmsAeadKey", zzhas.class, zzhqb.REMOTE, zzhqr.zze());
    private static final zzhjb zzd = zzhec.zza;

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzhid.zza(1)) {
            throw new GeneralSecurityException("Registering KMS AEAD is not supported in FIPS mode");
        }
        int i = zzheq.zza;
        zzheq.zza(zzhkg.zza());
        zzhkd.zza().zzb(zzb);
        zzhjx.zza().zzb(zzd, zzhel.class);
        zzhjc.zza().zzb(zzc, true);
    }
}
