package org.bouncycastle.pqc.jcajce.provider.ntru;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.security.Key;
import java.security.KeyFactorySpi;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes10.dex */
public class NTRUKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(GMSSPrivateKey$$ExternalSyntheticOutline0.m(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            return generatePrivate(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded())));
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m$2(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            Mod$$ExternalSyntheticBUOutline0.m(keySpec, "Unknown key specification: ");
            return null;
        }
        try {
            return generatePublic(SubjectPublicKeyInfo.getInstance(((X509EncodedKeySpec) keySpec).getEncoded()));
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m$2(e);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof BCNTRUPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCNTRUPublicKey)) {
                throw new InvalidKeySpecException(SVG$Unit$EnumUnboxingLocalUtility.m(key, new StringBuilder("Unsupported key type: "), "."));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(Boxes$$ExternalSyntheticOutline1.m(cls, "Unknown key specification: ", "."));
    }

    @Override // java.security.KeyFactorySpi
    public final Key engineTranslateKey(Key key) {
        if ((key instanceof BCNTRUPrivateKey) || (key instanceof BCNTRUPublicKey)) {
            return key;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        return new BCNTRUPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new BCNTRUPublicKey(subjectPublicKeyInfo);
    }
}
