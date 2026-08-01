package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgof implements zzgmx {
    private final zzgmh zza;

    public zzgof(zzgmh zzgmhVar) throws GeneralSecurityException {
        if (!zzgjl.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
        }
        this.zza = zzgmhVar;
    }
}
