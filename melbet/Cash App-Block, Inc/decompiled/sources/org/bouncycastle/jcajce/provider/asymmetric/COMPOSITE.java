package org.bouncycastle.jcajce.provider.asymmetric;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.bc.BCObjectIdentifiers;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.internal.asn1.edec.EdECObjectIdentifiers;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.jcajce.CompositePrivateKey;
import org.bouncycastle.jcajce.CompositePublicKey;
import org.bouncycastle.jcajce.provider.asymmetric.compositesignatures.CompositeSignaturesConstants;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricAlgorithmProvider;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.pqc.asn1.GMSSPrivateKey$$ExternalSyntheticOutline0;

/* loaded from: classes9.dex */
public class COMPOSITE {
    private static final String PREFIX = "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE";
    private static AsymmetricKeyInfoConverter baseConverter;
    private static final Map<String, String> compositeAttributes;

    /* renamed from: org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName;

        static {
            int[] iArr = new int[CompositeSignaturesConstants.CompositeName.values().length];
            $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName = iArr;
            try {
                iArr[CompositeSignaturesConstants.CompositeName.MLDSA44_Ed25519_SHA512.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_Ed25519_SHA512.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_Ed448_SHA512.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PSS_SHA256.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PSS_SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_RSA2048_PKCS15_SHA256.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_RSA3072_PKCS15_SHA512.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_P256_SHA256.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA44_ECDSA_brainpoolP256r1_SHA256.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_P256_SHA512.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA65_ECDSA_brainpoolP256r1_SHA512.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_P384_SHA512.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.MLDSA87_ECDSA_brainpoolP384r1_SHA512.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_P256_SHA256.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_ECDSA_brainpoolP256r1_SHA256.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.CompositeName.Falcon512_Ed25519_SHA512.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public static class CompositeKeyInfoConverter implements AsymmetricKeyInfoConverter {
        private final ConfigurableProvider provider;

        public CompositeKeyInfoConverter(ConfigurableProvider configurableProvider) {
            this.provider = configurableProvider;
        }

        private PrivateKey createPrivateKey(AlgorithmIdentifier algorithmIdentifier, ASN1OctetString aSN1OctetString) {
            ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
            aSN1EncodableVector.add(new ASN1Integer(0L));
            aSN1EncodableVector.add(algorithmIdentifier);
            aSN1EncodableVector.add(aSN1OctetString);
            PrivateKeyInfo privateKeyInfo = PrivateKeyInfo.getInstance(new DERSequence(aSN1EncodableVector));
            return this.provider.getKeyInfoConverter(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()).generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(privateKeyInfo.parsePrivateKey());
            PrivateKey[] privateKeyArr = new PrivateKey[aSN1Sequence.size()];
            if (aSN1Sequence.getObjectAt(0) instanceof ASN1OctetString) {
                switch (AnonymousClass1.$SwitchMap$org$bouncycastle$jcajce$provider$asymmetric$compositesignatures$CompositeSignaturesConstants$CompositeName[CompositeSignaturesConstants.ASN1IdentifierCompositeNameMap.get(privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm()).ordinal()]) {
                    case 1:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 2:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 3:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_87), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed448), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 4:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 5:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 6:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 7:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 8:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, SECObjectIdentifiers.secp256r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 9:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_44), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 10:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, SECObjectIdentifiers.secp256r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 11:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_65), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, TeleTrusTObjectIdentifiers.brainpoolP256r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 12:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_87), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, SECObjectIdentifiers.secp384r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 13:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(NISTObjectIdentifiers.id_ml_dsa_87), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, TeleTrusTObjectIdentifiers.brainpoolP384r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 14:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(BCObjectIdentifiers.falcon_512), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, SECObjectIdentifiers.secp256r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 15:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(BCObjectIdentifiers.falcon_512), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, TeleTrusTObjectIdentifiers.brainpoolP256r1), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    case 16:
                        privateKeyArr[0] = createPrivateKey(new AlgorithmIdentifier(BCObjectIdentifiers.falcon_512), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        privateKeyArr[1] = createPrivateKey(new AlgorithmIdentifier(EdECObjectIdentifiers.id_Ed25519), ASN1OctetString.getInstance(aSN1Sequence.getObjectAt(0)));
                        break;
                    default:
                        a$$ExternalSyntheticBUOutline0.m$3("unknown composite algorithm");
                        return null;
                }
            } else {
                for (int i = 0; i != aSN1Sequence.size(); i++) {
                    PrivateKeyInfo privateKeyInfo2 = PrivateKeyInfo.getInstance(ASN1Sequence.getInstance(aSN1Sequence.getObjectAt(i)));
                    privateKeyArr[i] = this.provider.getKeyInfoConverter(privateKeyInfo2.getPrivateKeyAlgorithm().getAlgorithm()).generatePrivate(privateKeyInfo2);
                }
            }
            return new CompositePrivateKey(privateKeyArr);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(subjectPublicKeyInfo.getPublicKeyData().getBytes());
            PublicKey[] publicKeyArr = new PublicKey[aSN1Sequence.size()];
            for (int i = 0; i != aSN1Sequence.size(); i++) {
                SubjectPublicKeyInfo subjectPublicKeyInfo2 = SubjectPublicKeyInfo.getInstance(aSN1Sequence.getObjectAt(i));
                publicKeyArr[i] = this.provider.getKeyInfoConverter(subjectPublicKeyInfo2.getAlgorithm().getAlgorithm()).generatePublic(subjectPublicKeyInfo2);
            }
            return new CompositePublicKey(publicKeyArr);
        }
    }

    public static class KeyFactory extends BaseKeyFactorySpi {
        @Override // java.security.KeyFactorySpi
        public Key engineTranslateKey(Key key) {
            try {
                if (key instanceof PrivateKey) {
                    return generatePrivate(PrivateKeyInfo.getInstance(key.getEncoded()));
                }
                if (key instanceof PublicKey) {
                    return generatePublic(SubjectPublicKeyInfo.getInstance(key.getEncoded()));
                }
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("key not recognized");
                return null;
            } catch (IOException e) {
                throw new InvalidKeyException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("key could not be parsed: ")));
            }
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
            return COMPOSITE.baseConverter.generatePrivate(privateKeyInfo);
        }

        @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
        public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
            return COMPOSITE.baseConverter.generatePublic(subjectPublicKeyInfo);
        }
    }

    public static class Mappings extends AsymmetricAlgorithmProvider {
        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        public void configure(ConfigurableProvider configurableProvider) {
            StringBuilder m = GMSSPrivateKey$$ExternalSyntheticOutline0.m(configurableProvider, "KeyFactory.COMPOSITE", "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier = MiscObjectIdentifiers.id_alg_composite;
            StringBuilder m2 = GetCert$$ExternalSyntheticOutline0.m(GetCert$$ExternalSyntheticOutline0.m(m, aSN1ObjectIdentifier, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID."), aSN1ObjectIdentifier, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.");
            ASN1ObjectIdentifier aSN1ObjectIdentifier2 = MiscObjectIdentifiers.id_composite_key;
            StringBuilder m3 = GetCert$$ExternalSyntheticOutline0.m(m2, aSN1ObjectIdentifier2, configurableProvider, "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory", "KeyFactory.OID.");
            m3.append(aSN1ObjectIdentifier2);
            configurableProvider.addAlgorithm(m3.toString(), "org.bouncycastle.jcajce.provider.asymmetric.COMPOSITE$KeyFactory");
            AsymmetricKeyInfoConverter unused = COMPOSITE.baseConverter = new CompositeKeyInfoConverter(configurableProvider);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier, COMPOSITE.baseConverter);
            configurableProvider.addKeyInfoConverter(aSN1ObjectIdentifier2, COMPOSITE.baseConverter);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        compositeAttributes = hashMap;
        hashMap.put("SupportedKeyClasses", "org.bouncycastle.jcajce.CompositePublicKey|org.bouncycastle.jcajce.CompositePrivateKey");
        hashMap.put("SupportedKeyFormats", "PKCS#8|X.509");
    }
}
