package org.bouncycastle.pqc.jcajce.provider.dilithium;

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
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.pqc.jcajce.provider.util.BaseKeyFactorySpi;

/* loaded from: classes10.dex */
public class DilithiumKeyFactorySpi extends BaseKeyFactorySpi {
    private static final Set<ASN1ObjectIdentifier> keyOids;

    public static class Base2 extends DilithiumKeyFactorySpi {
        public Base2() {
            super(BCObjectIdentifiers.dilithium2);
        }
    }

    public static class Base2_AES extends DilithiumKeyFactorySpi {
        public Base2_AES() {
            super(BCObjectIdentifiers.dilithium2_aes);
        }
    }

    public static class Base3 extends DilithiumKeyFactorySpi {
        public Base3() {
            super(BCObjectIdentifiers.dilithium3);
        }
    }

    public static class Base3_AES extends DilithiumKeyFactorySpi {
        public Base3_AES() {
            super(BCObjectIdentifiers.dilithium3_aes);
        }
    }

    public static class Base5 extends DilithiumKeyFactorySpi {
        public Base5() {
            super(BCObjectIdentifiers.dilithium5);
        }
    }

    public static class Base5_AES extends DilithiumKeyFactorySpi {
        public Base5_AES() {
            super(BCObjectIdentifiers.dilithium5_aes);
        }
    }

    static {
        HashSet hashSet = new HashSet();
        keyOids = hashSet;
        hashSet.add(BCObjectIdentifiers.dilithium2);
        hashSet.add(BCObjectIdentifiers.dilithium3);
        hashSet.add(BCObjectIdentifiers.dilithium5);
        hashSet.add(BCObjectIdentifiers.dilithium2_aes);
        hashSet.add(BCObjectIdentifiers.dilithium3_aes);
        hashSet.add(BCObjectIdentifiers.dilithium5_aes);
    }

    public DilithiumKeyFactorySpi() {
        super(keyOids);
    }

    @Override // java.security.KeyFactorySpi
    public final KeySpec engineGetKeySpec(Key key, Class cls) {
        if (key instanceof BCDilithiumPrivateKey) {
            if (PKCS8EncodedKeySpec.class.isAssignableFrom(cls)) {
                return new PKCS8EncodedKeySpec(key.getEncoded());
            }
        } else {
            if (!(key instanceof BCDilithiumPublicKey)) {
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
        if ((key instanceof BCDilithiumPrivateKey) || (key instanceof BCDilithiumPublicKey)) {
            return key;
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key type");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        return new BCDilithiumPrivateKey(privateKeyInfo);
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        return new BCDilithiumPublicKey(subjectPublicKeyInfo);
    }

    public DilithiumKeyFactorySpi(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        super(aSN1ObjectIdentifier);
    }
}
