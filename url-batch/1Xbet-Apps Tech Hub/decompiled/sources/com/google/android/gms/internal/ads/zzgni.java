package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@22.6.0 */
/* loaded from: classes2.dex */
final class zzgni extends zzglh {
    zzgni(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzglh
    public final /* bridge */ /* synthetic */ Object zza(zzgxw zzgxwVar) throws GeneralSecurityException {
        zzgrb zzgrbVar = (zzgrb) zzgxwVar;
        zzgqy zzc = zzgrbVar.zzg().zzc();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgrbVar.zzh().zzA(), "HMAC");
        int zza = zzgrbVar.zzg().zza();
        zzgqy zzgqyVar = zzgqy.UNKNOWN_HASH;
        int ordinal = zzc.ordinal();
        if (ordinal == 1) {
            return new zzgug(new zzguf("HMACSHA1", secretKeySpec), zza);
        }
        if (ordinal == 2) {
            return new zzgug(new zzguf("HMACSHA384", secretKeySpec), zza);
        }
        if (ordinal == 3) {
            return new zzgug(new zzguf("HMACSHA256", secretKeySpec), zza);
        }
        if (ordinal == 4) {
            return new zzgug(new zzguf("HMACSHA512", secretKeySpec), zza);
        }
        if (ordinal == 5) {
            return new zzgug(new zzguf("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
