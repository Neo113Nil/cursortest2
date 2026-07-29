package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes2.dex */
final class zzauq implements zzaua<zzatz> {
    @Override // com.google.android.gms.internal.ads.zzaua
    public final zzaug<zzatz> zzb(String str, String str2, int i) throws GeneralSecurityException {
        zzaug<zzatz> zzausVar;
        String lowerCase = str2.toLowerCase();
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : (char) 65535) != 0) {
            throw new GeneralSecurityException(String.format("No support for primitive '%s'.", str2));
        }
        switch (str) {
            case "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey":
                zzausVar = new zzaus();
                break;
            case "type.googleapis.com/google.crypto.tink.AesEaxKey":
                zzausVar = new zzauu();
                break;
            case "type.googleapis.com/google.crypto.tink.AesGcmKey":
                zzausVar = new zzauv();
                break;
            case "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key":
                zzausVar = new zzauw();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsAeadKey":
                zzausVar = new zzaux();
                break;
            case "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey":
                zzausVar = new zzauz();
                break;
            default:
                throw new GeneralSecurityException(String.format("No support for primitive 'Aead' with key type '%s'.", str));
        }
        if (zzausVar.getVersion() >= i) {
            return zzausVar;
        }
        throw new GeneralSecurityException(String.format("No key manager for key type '%s' with version at least %d.", str, Integer.valueOf(i)));
    }
}
