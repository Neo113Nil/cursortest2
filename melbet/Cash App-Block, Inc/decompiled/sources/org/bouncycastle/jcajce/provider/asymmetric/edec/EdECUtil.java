package org.bouncycastle.jcajce.provider.asymmetric.edec;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.PrivateKeyFactory;
import org.bouncycastle.crypto.util.PublicKeyFactory;

/* loaded from: classes9.dex */
class EdECUtil {
    public static AsymmetricKeyParameter generatePrivateKeyParameter(PrivateKey privateKey) {
        if (privateKey instanceof BCXDHPrivateKey) {
            return ((BCXDHPrivateKey) privateKey).engineGetKeyParameters();
        }
        if (privateKey instanceof BCEdDSAPrivateKey) {
            return ((BCEdDSAPrivateKey) privateKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = privateKey.getEncoded();
            if (encoded != null) {
                return PrivateKeyFactory.createKey(encoded);
            }
            throw new InvalidKeyException("no encoding for EdEC/XDH private key");
        } catch (Exception e) {
            throw new InvalidKeyException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("cannot identify EdEC/XDH private key: ")));
        }
    }

    public static AsymmetricKeyParameter generatePublicKeyParameter(PublicKey publicKey) {
        if (publicKey instanceof BCXDHPublicKey) {
            return ((BCXDHPublicKey) publicKey).engineGetKeyParameters();
        }
        if (publicKey instanceof BCEdDSAPublicKey) {
            return ((BCEdDSAPublicKey) publicKey).engineGetKeyParameters();
        }
        try {
            byte[] encoded = publicKey.getEncoded();
            if (encoded != null) {
                return PublicKeyFactory.createKey(encoded);
            }
            throw new InvalidKeyException("no encoding for EdEC/XDH public key");
        } catch (Exception e) {
            throw new InvalidKeyException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("cannot identify EdEC/XDH public key: ")));
        }
    }
}
