package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;

/* loaded from: classes10.dex */
public class McElieceCCA2KeysToParams {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof BCMcElieceCCA2PrivateKey) {
            return ((BCMcElieceCCA2PrivateKey) privateKey).getKeyParams();
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("can't identify McElieceCCA2 private key.");
        return null;
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof BCMcElieceCCA2PublicKey) {
            return ((BCMcElieceCCA2PublicKey) publicKey).getKeyParams();
        }
        throw new InvalidKeyException("can't identify McElieceCCA2 public key: ".concat(publicKey.getClass().getName()));
    }
}
