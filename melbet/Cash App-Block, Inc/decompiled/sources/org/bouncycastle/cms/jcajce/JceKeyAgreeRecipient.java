package org.bouncycastle.cms.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashSet;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.cms.ecc.ECCCMSSharedInfo;
import org.bouncycastle.asn1.cms.ecc.MQVuserKeyingMaterial;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.cryptopro.Gost2814789KeyWrapParameters;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.KeyAgreeRecipient;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.operator.DefaultSecretKeySizeProvider;
import org.bouncycastle.operator.SecretKeySizeProvider;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;

/* loaded from: classes9.dex */
public abstract class JceKeyAgreeRecipient implements KeyAgreeRecipient {
    private static KeyMaterialGenerator ecc_cms_Generator;
    private static KeyMaterialGenerator old_ecc_cms_Generator;
    private static final Set possibleOldMessages;
    private static KeyMaterialGenerator simple_ecc_cmsGenerator;
    protected EnvelopedDataHelper contentHelper;
    protected EnvelopedDataHelper helper;
    private SecretKeySizeProvider keySizeProvider;
    private AlgorithmIdentifier privKeyAlgID;
    private PrivateKey recipientKey;
    protected EnvelopedDataHelper unwrappingHelper;

    static {
        HashSet hashSet = new HashSet();
        possibleOldMessages = hashSet;
        hashSet.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        old_ecc_cms_Generator = new KeyMaterialGenerator() { // from class: org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient.1
            @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
            public byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i, byte[] bArr) {
                try {
                    return new ECCCMSSharedInfo(new AlgorithmIdentifier(algorithmIdentifier.getAlgorithm(), DERNull.INSTANCE), bArr, Pack.intToBigEndian(i)).getEncoded(ASN1Encoding.DER);
                } catch (IOException e) {
                    a$$ExternalSyntheticBUOutline0.m$1(BalanceFeedKt$$ExternalSyntheticOutline0.m("Unable to create KDF material: ", e));
                    return null;
                }
            }
        };
        simple_ecc_cmsGenerator = new KeyMaterialGenerator() { // from class: org.bouncycastle.cms.jcajce.JceKeyAgreeRecipient.2
            @Override // org.bouncycastle.cms.jcajce.KeyMaterialGenerator
            public byte[] generateKDFMaterial(AlgorithmIdentifier algorithmIdentifier, int i, byte[] bArr) {
                return bArr;
            }
        };
        ecc_cms_Generator = new RFC5753KeyMaterialGenerator();
    }

    public JceKeyAgreeRecipient(PrivateKey privateKey) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.unwrappingHelper = envelopedDataHelper;
        this.keySizeProvider = new DefaultSecretKeySizeProvider();
        this.privKeyAlgID = null;
        this.recipientKey = CMSUtils.cleanPrivateKey(privateKey);
    }

    private SecretKey calculateAgreedWrapKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, PublicKey publicKey, ASN1OctetString aSN1OctetString, PrivateKey privateKey, KeyMaterialGenerator keyMaterialGenerator) {
        PrivateKey cleanPrivateKey = CMSUtils.cleanPrivateKey(privateKey);
        UserKeyingMaterialSpec userKeyingMaterialSpec = null;
        userKeyingMaterialSpec = null;
        if (CMSUtils.isMQV(algorithmIdentifier.getAlgorithm())) {
            MQVuserKeyingMaterial mQVuserKeyingMaterial = MQVuserKeyingMaterial.getInstance(aSN1OctetString.getOctets());
            PublicKey generatePublic = this.helper.createKeyFactory(algorithmIdentifier.getAlgorithm()).generatePublic(new X509EncodedKeySpec(new SubjectPublicKeyInfo(getPrivateKeyAlgorithmIdentifier(), mQVuserKeyingMaterial.getEphemeralPublicKey().getPublicKeyData()).getEncoded()));
            KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(algorithmIdentifier.getAlgorithm());
            byte[] octets = mQVuserKeyingMaterial.getAddedukm() != null ? mQVuserKeyingMaterial.getAddedukm().getOctets() : null;
            KeyMaterialGenerator keyMaterialGenerator2 = old_ecc_cms_Generator;
            if (keyMaterialGenerator == keyMaterialGenerator2) {
                octets = keyMaterialGenerator2.generateKDFMaterial(algorithmIdentifier2, this.keySizeProvider.getKeySize(algorithmIdentifier2), octets);
            }
            createKeyAgreement.init(cleanPrivateKey, new MQVParameterSpec(cleanPrivateKey, generatePublic, octets));
            createKeyAgreement.doPhase(publicKey, true);
            return createKeyAgreement.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
        }
        KeyAgreement createKeyAgreement2 = this.helper.createKeyAgreement(algorithmIdentifier.getAlgorithm());
        if (CMSUtils.isEC(algorithmIdentifier.getAlgorithm())) {
            int keySize = this.keySizeProvider.getKeySize(algorithmIdentifier2);
            userKeyingMaterialSpec = new UserKeyingMaterialSpec(aSN1OctetString != null ? keyMaterialGenerator.generateKDFMaterial(algorithmIdentifier2, keySize, aSN1OctetString.getOctets()) : keyMaterialGenerator.generateKDFMaterial(algorithmIdentifier2, keySize, null));
        } else if (CMSUtils.isRFC2631(algorithmIdentifier.getAlgorithm())) {
            if (aSN1OctetString != null) {
                userKeyingMaterialSpec = new UserKeyingMaterialSpec(aSN1OctetString.getOctets());
            }
        } else {
            if (!CMSUtils.isGOST(algorithmIdentifier.getAlgorithm())) {
                throw new CMSException("Unknown key agreement algorithm: " + algorithmIdentifier.getAlgorithm());
            }
            if (aSN1OctetString != null) {
                userKeyingMaterialSpec = new UserKeyingMaterialSpec(aSN1OctetString.getOctets());
            }
        }
        createKeyAgreement2.init(cleanPrivateKey, userKeyingMaterialSpec);
        createKeyAgreement2.doPhase(publicKey, true);
        return createKeyAgreement2.generateSecret(algorithmIdentifier2.getAlgorithm().getId());
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        throw r9;
     */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.Throwable, java.security.Key] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Key extractSecretKey(AlgorithmIdentifier algorithmIdentifier, AlgorithmIdentifier algorithmIdentifier2, SubjectPublicKeyInfo subjectPublicKeyInfo, ASN1OctetString aSN1OctetString, byte[] bArr) {
        Exception exc;
        String str;
        JceKeyAgreeRecipient jceKeyAgreeRecipient;
        AlgorithmIdentifier algorithmIdentifier3;
        ASN1OctetString aSN1OctetString2;
        try {
            try {
                AlgorithmIdentifier algorithmIdentifier4 = AlgorithmIdentifier.getInstance(algorithmIdentifier.getParameters());
                PublicKey generatePublic = this.helper.createKeyFactory(subjectPublicKeyInfo.getAlgorithm().getAlgorithm()).generatePublic(new X509EncodedKeySpec(subjectPublicKeyInfo.getEncoded()));
                try {
                    jceKeyAgreeRecipient = this;
                    algorithmIdentifier3 = algorithmIdentifier;
                    aSN1OctetString2 = aSN1OctetString;
                    try {
                        SecretKey calculateAgreedWrapKey = jceKeyAgreeRecipient.calculateAgreedWrapKey(algorithmIdentifier3, algorithmIdentifier4, generatePublic, aSN1OctetString2, this.recipientKey, ecc_cms_Generator);
                        if (!algorithmIdentifier4.getAlgorithm().equals((ASN1Primitive) CryptoProObjectIdentifiers.id_Gost28147_89_None_KeyWrap) && !algorithmIdentifier4.getAlgorithm().equals((ASN1Primitive) CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap)) {
                            return jceKeyAgreeRecipient.unwrapSessionKey(algorithmIdentifier4.getAlgorithm(), calculateAgreedWrapKey, algorithmIdentifier2.getAlgorithm(), bArr);
                        }
                        Gost2814789EncryptedKey gost2814789EncryptedKey = Gost2814789EncryptedKey.getInstance(bArr);
                        Gost2814789KeyWrapParameters gost2814789KeyWrapParameters = Gost2814789KeyWrapParameters.getInstance(algorithmIdentifier4.getParameters());
                        Cipher createCipher = jceKeyAgreeRecipient.helper.createCipher(algorithmIdentifier4.getAlgorithm());
                        createCipher.init(4, calculateAgreedWrapKey, new GOST28147WrapParameterSpec(gost2814789KeyWrapParameters.getEncryptionParamSet(), aSN1OctetString2.getOctets()));
                        return createCipher.unwrap(Arrays.concatenate(gost2814789EncryptedKey.getEncryptedKey(), gost2814789EncryptedKey.getMacKey()), jceKeyAgreeRecipient.helper.getBaseCipherName(algorithmIdentifier2.getAlgorithm()), 3);
                    } catch (InvalidKeyException e) {
                        e = e;
                        InvalidKeyException invalidKeyException = e;
                        if (possibleOldMessages.contains(algorithmIdentifier3.getAlgorithm())) {
                            return jceKeyAgreeRecipient.unwrapSessionKey(algorithmIdentifier4.getAlgorithm(), jceKeyAgreeRecipient.calculateAgreedWrapKey(algorithmIdentifier3, algorithmIdentifier4, generatePublic, aSN1OctetString2, jceKeyAgreeRecipient.recipientKey, old_ecc_cms_Generator), algorithmIdentifier2.getAlgorithm(), bArr);
                        }
                        if (aSN1OctetString2 == null) {
                            throw invalidKeyException;
                        }
                        try {
                            ?? unwrapSessionKey = jceKeyAgreeRecipient.unwrapSessionKey(algorithmIdentifier4.getAlgorithm(), jceKeyAgreeRecipient.calculateAgreedWrapKey(algorithmIdentifier3, algorithmIdentifier4, generatePublic, aSN1OctetString2, jceKeyAgreeRecipient.recipientKey, simple_ecc_cmsGenerator), algorithmIdentifier2.getAlgorithm(), bArr);
                            return unwrapSessionKey;
                        } catch (InvalidKeyException unused) {
                            throw invalidKeyException;
                        }
                    }
                } catch (InvalidKeyException e2) {
                    e = e2;
                    jceKeyAgreeRecipient = this;
                    algorithmIdentifier3 = algorithmIdentifier;
                    aSN1OctetString2 = aSN1OctetString;
                }
            } catch (InvalidKeyException e3) {
                exc = e3;
                str = "key invalid in message.";
                f$$ExternalSyntheticLambda0.m(exc, str);
                return null;
            }
        } catch (NoSuchAlgorithmException e4) {
            exc = e4;
            str = "can't find algorithm.";
            f$$ExternalSyntheticLambda0.m(exc, str);
            return null;
        } catch (InvalidKeySpecException e5) {
            exc = e5;
            str = "originator key spec invalid.";
            f$$ExternalSyntheticLambda0.m(exc, str);
            return null;
        } catch (NoSuchPaddingException e6) {
            exc = e6;
            str = "required padding not supported.";
            f$$ExternalSyntheticLambda0.m(exc, str);
            return null;
        } catch (Exception e7) {
            exc = e7;
            str = "originator key invalid.";
            f$$ExternalSyntheticLambda0.m(exc, str);
            return null;
        }
    }

    @Override // org.bouncycastle.cms.KeyAgreeRecipient
    public AlgorithmIdentifier getPrivateKeyAlgorithmIdentifier() {
        if (this.privKeyAlgID == null) {
            this.privKeyAlgID = PrivateKeyInfo.getInstance(this.recipientKey.getEncoded()).getPrivateKeyAlgorithm();
        }
        return this.privKeyAlgID;
    }

    public JceKeyAgreeRecipient setContentProvider(String str) {
        this.contentHelper = CMSUtils.createContentHelper(str);
        return this;
    }

    public JceKeyAgreeRecipient setPrivateKeyAlgorithmIdentifier(AlgorithmIdentifier algorithmIdentifier) {
        this.privKeyAlgID = algorithmIdentifier;
        return this;
    }

    public JceKeyAgreeRecipient setProvider(String str) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.unwrappingHelper = envelopedDataHelper;
        return this;
    }

    public JceKeyAgreeRecipient setUnwrappingProvider(String str) {
        this.unwrappingHelper = new EnvelopedDataHelper(new NamedJcaJceExtHelper(str));
        return this;
    }

    public Key unwrapSessionKey(ASN1ObjectIdentifier aSN1ObjectIdentifier, SecretKey secretKey, ASN1ObjectIdentifier aSN1ObjectIdentifier2, byte[] bArr) {
        Cipher createCipher = this.unwrappingHelper.createCipher(aSN1ObjectIdentifier);
        createCipher.init(4, secretKey);
        return createCipher.unwrap(bArr, this.helper.getBaseCipherName(aSN1ObjectIdentifier2), 3);
    }

    public JceKeyAgreeRecipient setContentProvider(Provider provider) {
        this.contentHelper = CMSUtils.createContentHelper(provider);
        return this;
    }

    public JceKeyAgreeRecipient setUnwrappingProvider(Provider provider) {
        this.unwrappingHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        return this;
    }

    public JceKeyAgreeRecipient setProvider(Provider provider) {
        EnvelopedDataHelper envelopedDataHelper = new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider));
        this.helper = envelopedDataHelper;
        this.contentHelper = envelopedDataHelper;
        this.unwrappingHelper = envelopedDataHelper;
        return this;
    }
}
