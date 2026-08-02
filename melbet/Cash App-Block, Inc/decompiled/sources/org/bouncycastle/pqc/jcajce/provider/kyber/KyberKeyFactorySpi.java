package org.bouncycastle.pqc.jcajce.provider.kyber;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;

/* loaded from: classes10.dex */
public class KyberKeyFactorySpi extends BaseKeyFactorySpi {
    private static final Set<ASN1ObjectIdentifier> keyOids;

    public static class Kyber1024 extends KyberKeyFactorySpi {
        public Kyber1024() {
            super(NISTObjectIdentifiers.id_alg_ml_kem_1024);
        }
    }

    public static class Kyber1024_AES extends KyberKeyFactorySpi {
        public Kyber1024_AES() {
            super(BCObjectIdentifiers.kyber1024_aes);
        }
    }

    public static class Kyber512 extends KyberKeyFactorySpi {
        public Kyber512() {
            super(NISTObjectIdentifiers.id_alg_ml_kem_512);
        }
    }

    public static class Kyber512_AES extends KyberKeyFactorySpi {
        public Kyber512_AES() {
            super(BCObjectIdentifiers.kyber512_aes);
        }
    }

    public static class Kyber768 extends KyberKeyFactorySpi {
        public Kyber768() {
            super(NISTObjectIdentifiers.id_alg_ml_kem_768);
        }
    }

    public static class Kyber768_AES extends KyberKeyFactorySpi {
        public Kyber768_AES() {
            super(BCObjectIdentifiers.kyber768_aes);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(NISTObjectIdentifiers.id_alg_ml_kem_512);
        hashSet.add(NISTObjectIdentifiers.id_alg_ml_kem_768);
        hashSet.add(NISTObjectIdentifiers.id_alg_ml_kem_1024);
        hashSet.add(BCObjectIdentifiers.kyber512_aes);
        hashSet.add(BCObjectIdentifiers.kyber768_aes);
        hashSet.add(BCObjectIdentifiers.kyber1024_aes);
    }

    public KyberKeyFactorySpi() {
        super(keyOids);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof BCKyberPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCKyberPublicKey)) {
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
        if ((key instanceof BCKyberPrivateKey) || (key instanceof BCKyberPublicKey)) {
            return key;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        return new BCKyberPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new BCKyberPublicKey(subjectPublicKeyInfo);
    }

    public KyberKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }
}
