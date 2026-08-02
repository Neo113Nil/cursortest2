package org.bouncycastle.pqc.jcajce.provider.mceliece;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
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
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;
import org.bouncycastle.pqc.asn1.McEliecePrivateKey;
import org.bouncycastle.pqc.asn1.McEliecePublicKey;
import org.bouncycastle.pqc.asn1.PQCObjectIdentifiers;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePrivateKeyParameters;
import org.bouncycastle.pqc.legacy.crypto.mceliece.McEliecePublicKeyParameters;

/* loaded from: classes10.dex */
public class McElieceKeyFactorySpi extends KeyFactorySpi implements AsymmetricKeyInfoConverter {
    public static final String OID = "1.3.6.1.4.1.8301.3.1.3.4.1";

    private static Digest getDigest(AlgorithmIdentifier algorithmIdentifier) {
        return new SHA256Digest();
    }

    @Override // java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (!(keySpec instanceof PKCS8EncodedKeySpec)) {
            throw new InvalidKeySpecException(GMSSPrivateKey$$ExternalSyntheticOutline0.m(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(((PKCS8EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!PQCObjectIdentifiers.mcEliece.equals((ASN1Primitive) privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece private key");
                }
                McEliecePrivateKey mcEliecePrivateKey = McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
                return new BCMcEliecePrivateKey(new McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
            } catch (IOException unused) {
                throw new InvalidKeySpecException("Unable to decode PKCS8EncodedKeySpec.");
            }
        } catch (IOException e) {
            throw new InvalidKeySpecException(BalanceFeedKt$$ExternalSyntheticOutline0.m("Unable to decode PKCS8EncodedKeySpec: ", e));
        }
    }

    @Override // java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        if (!(keySpec instanceof X509EncodedKeySpec)) {
            throw new InvalidKeySpecException(GMSSPrivateKey$$ExternalSyntheticOutline0.m(keySpec, new StringBuilder("Unsupported key specification: "), "."));
        }
        try {
            SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(((X509EncodedKeySpec) keySpec).getEncoded()));
            try {
                if (!PQCObjectIdentifiers.mcEliece.equals((ASN1Primitive) subjectPublicKeyInfo.getAlgorithm().getAlgorithm())) {
                    throw new InvalidKeySpecException("Unable to recognise OID in McEliece public key");
                }
                McEliecePublicKey mcEliecePublicKey = McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
                return new BCMcEliecePublicKey(new McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
            } catch (IOException e) {
                throw new InvalidKeySpecException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("Unable to decode X509EncodedKeySpec: ")));
            }
        } catch (IOException e2) {
            Mod$$ExternalSyntheticBUOutline0.m$2(e2);
            return null;
        }
    }

    @Override // java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) {
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        McEliecePrivateKey mcEliecePrivateKey = McEliecePrivateKey.getInstance(privateKeyInfo.parsePrivateKey().toASN1Primitive());
        return new BCMcEliecePrivateKey(new McEliecePrivateKeyParameters(mcEliecePrivateKey.getN(), mcEliecePrivateKey.getK(), mcEliecePrivateKey.getField(), mcEliecePrivateKey.getGoppaPoly(), mcEliecePrivateKey.getP1(), mcEliecePrivateKey.getP2(), mcEliecePrivateKey.getSInv()));
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        McEliecePublicKey mcEliecePublicKey = McEliecePublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
        return new BCMcEliecePublicKey(new McEliecePublicKeyParameters(mcEliecePublicKey.getN(), mcEliecePublicKey.getT(), mcEliecePublicKey.getG()));
    }

    public KeySpec getKeySpec(Key key, Class cls) {
        if (key instanceof BCMcEliecePrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMcEliecePublicKey)) {
                throw new InvalidKeySpecException(SVG$Unit$EnumUnboxingLocalUtility.m(key, new StringBuilder("Unsupported key type: "), "."));
            }
            if (X509EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new X509EncodedKeySpec(key.getEncoded());
            }
        }
        throw new InvalidKeySpecException(Boxes$$ExternalSyntheticOutline1.m(cls, "Unknown key specification: ", "."));
    }

    public Key translateKey(Key key) {
        if ((key instanceof BCMcEliecePrivateKey) || (key instanceof BCMcEliecePublicKey)) {
            return key;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key type.");
        return null;
    }
}
