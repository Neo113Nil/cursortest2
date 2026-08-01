package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
public final class zzgdr {
    public static zzgdd zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgrr zze = zzgrr.zze(bArr, zzgvy.zza());
            zzgku zzc = zzgku.zzc();
            zzglp zza = zzglp.zza(zze);
            return !zzc.zzi(zza) ? new zzgkh(zza) : zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }
}
