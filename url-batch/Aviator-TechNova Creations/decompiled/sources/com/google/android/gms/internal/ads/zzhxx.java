package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.RSAPrivateCrtKey;

/* compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* loaded from: classes3.dex */
final class zzhxx implements zzhbr {
    /* synthetic */ zzhxx(RSAPrivateCrtKey rSAPrivateCrtKey, zzhxn zzhxnVar, zzhxn zzhxnVar2, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (zzhie.zza()) {
            throw new GeneralSecurityException("Can not use RSA PSS in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzhyc.zzb(zzhxnVar);
        if (!zzhxnVar.equals(zzhxnVar2)) {
            throw new GeneralSecurityException("sigHash and mgf1Hash must be the same");
        }
        zzhyc.zzc(rSAPrivateCrtKey.getModulus().bitLength());
        zzhyc.zzd(rSAPrivateCrtKey.getPublicExponent());
    }

    @Override // com.google.android.gms.internal.ads.zzhbr
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        throw null;
    }
}
