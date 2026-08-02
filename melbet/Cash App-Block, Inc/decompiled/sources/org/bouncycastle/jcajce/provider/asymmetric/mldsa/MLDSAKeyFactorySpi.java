package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

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
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;

/* loaded from: classes9.dex */
public class MLDSAKeyFactorySpi extends BaseKeyFactorySpi {
    private static final Set<ASN1ObjectIdentifier> hashKeyOids;
    private static final Set<ASN1ObjectIdentifier> pureKeyOids;

    public static class Hash extends MLDSAKeyFactorySpi {
        public Hash() {
            super((Set<ASN1ObjectIdentifier>) MLDSAKeyFactorySpi.hashKeyOids);
        }
    }

    public static class HashMLDSA44 extends MLDSAKeyFactorySpi {
        public HashMLDSA44() {
            super(NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512);
        }
    }

    public static class HashMLDSA65 extends MLDSAKeyFactorySpi {
        public HashMLDSA65() {
            super(NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512);
        }
    }

    public static class HashMLDSA87 extends MLDSAKeyFactorySpi {
        public HashMLDSA87() {
            super(NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512);
        }
    }

    public static class MLDSA44 extends MLDSAKeyFactorySpi {
        public MLDSA44() {
            super(NISTObjectIdentifiers.id_ml_dsa_44);
        }
    }

    public static class MLDSA65 extends MLDSAKeyFactorySpi {
        public MLDSA65() {
            super(NISTObjectIdentifiers.id_ml_dsa_65);
        }
    }

    public static class MLDSA87 extends MLDSAKeyFactorySpi {
        public MLDSA87() {
            super(NISTObjectIdentifiers.id_ml_dsa_87);
        }
    }

    public static class Pure extends MLDSAKeyFactorySpi {
        public Pure() {
            super((Set<ASN1ObjectIdentifier>) MLDSAKeyFactorySpi.pureKeyOids);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        pureKeyOids = hashSet;
        HashSet hashSet2 = new HashSet();
        hashKeyOids = hashSet2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_ml_dsa_44;
        hashSet.add(aSN1ObjectIdentifier);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_ml_dsa_65;
        hashSet.add(aSN1ObjectIdentifier2);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_ml_dsa_87;
        hashSet.add(aSN1ObjectIdentifier3);
        hashSet2.add(aSN1ObjectIdentifier);
        hashSet2.add(aSN1ObjectIdentifier2);
        hashSet2.add(aSN1ObjectIdentifier3);
        hashSet2.add(NISTObjectIdentifiers.id_hash_ml_dsa_44_with_sha512);
        hashSet2.add(NISTObjectIdentifiers.id_hash_ml_dsa_65_with_sha512);
        hashSet2.add(NISTObjectIdentifiers.id_hash_ml_dsa_87_with_sha512);
    }

    public MLDSAKeyFactorySpi(Set<ASN1ObjectIdentifier> set) {
        super(set);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof BCMLDSAPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCMLDSAPublicKey)) {
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
        if ((key instanceof BCMLDSAPrivateKey) || (key instanceof BCMLDSAPublicKey)) {
            return key;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        return new BCMLDSAPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new BCMLDSAPublicKey(subjectPublicKeyInfo);
    }

    public MLDSAKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }
}
