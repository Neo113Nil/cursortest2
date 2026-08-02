package org.bouncycastle.pqc.jcajce.provider.mceliece;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePrivateKeyParameters;

/* loaded from: classes10.dex */
public class McElieceKeysToParams {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof BCMcEliecePrivateKey) {
            BCMcEliecePrivateKey bCMcEliecePrivateKey = (BCMcEliecePrivateKey) privateKey;
            return new McEliecePrivateKeyParameters(bCMcEliecePrivateKey.getN(), bCMcEliecePrivateKey.getK(), bCMcEliecePrivateKey.getField(), bCMcEliecePrivateKey.getGoppaPoly(), bCMcEliecePrivateKey.getP1(), bCMcEliecePrivateKey.getP2(), bCMcEliecePrivateKey.getSInv());
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("can't identify McEliece private key.");
        return null;
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof BCMcEliecePublicKey) {
            return ((BCMcEliecePublicKey) publicKey).getKeyParams();
        }
        throw new InvalidKeyException("can't identify McEliece public key: ".concat(publicKey.getClass().getName()));
    }
}
