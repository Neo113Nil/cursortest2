package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@23.3.0 */
/* loaded from: classes3.dex */
public final class zzget {
    public static zzgen zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgsz zzf = zzgsz.zzf(bArr, zzgxi.zza());
            zzgmk zzc = zzgmk.zzc();
            zzgnm zza = zzgnm.zza(zzf);
            return !zzc.zzk(zza) ? new zzglk(zza) : zzc.zzb(zza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzgen zzgenVar) throws GeneralSecurityException {
        return ((zzgnm) zzgmk.zzc().zze(zzgenVar, zzgnm.class)).zzc().zzaV();
    }
}
