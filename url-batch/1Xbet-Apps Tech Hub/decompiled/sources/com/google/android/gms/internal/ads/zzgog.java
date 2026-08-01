package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgog implements zzgmx {
    private final zzgne zza;

    public zzgog(zzgne zzgneVar) throws GeneralSecurityException {
        if (!zzgjl.zza(2)) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        this.zza = zzgneVar;
    }
}
