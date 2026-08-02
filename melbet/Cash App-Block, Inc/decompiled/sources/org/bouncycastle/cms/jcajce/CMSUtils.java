package org.bouncycastle.cms.jcajce;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cms.IssuerAndSerialNumber;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.iso.ISOIECObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.sec.SECObjectIdentifiers;
import org.bouncycastle.asn1.x509.Certificate;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.cms.CMSAlgorithm;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.jcajce.util.AlgorithmParametersUtils;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorCreationException;

/* loaded from: classes9.dex */
class CMSUtils {
    private static final Map asymmetricWrapperAlgNames;
    private static final Set ecAlgs;
    private static final Set gostAlgs;
    private static final Set mqvAlgs;
    private static Map<ASN1ObjectIdentifier, String> wrapAlgNames;

    static {
        HashSet hashSet = new HashSet();
        mqvAlgs = hashSet;
        HashSet hashSet2 = new HashSet();
        ecAlgs = hashSet2;
        HashSet hashSet3 = new HashSet();
        gostAlgs = hashSet3;
        HashMap hashMap = new HashMap();
        asymmetricWrapperAlgNames = hashMap;
        HashMap hashMap2 = new HashMap();
        wrapAlgNames = hashMap2;
        hashMap2.put(CMSAlgorithm.AES128_WRAP, "AESWRAP");
        wrapAlgNames.put(CMSAlgorithm.AES192_WRAP, "AESWRAP");
        wrapAlgNames.put(CMSAlgorithm.AES256_WRAP, "AESWRAP");
        hashSet.add(X9ObjectIdentifiers.mqvSinglePass_sha1kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha224kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha256kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha384kdf_scheme);
        hashSet.add(SECObjectIdentifiers.mqvSinglePass_sha512kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_cofactorDH_sha1kdf_scheme);
        hashSet2.add(X9ObjectIdentifiers.dhSinglePass_stdDH_sha1kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha224kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha256kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha384kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_cofactorDH_sha512kdf_scheme);
        hashSet2.add(SECObjectIdentifiers.dhSinglePass_stdDH_sha512kdf_scheme);
        hashSet3.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.gostR3410_2001;
        hashSet3.add(aSN1ObjectIdentifier);
        hashSet3.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet3.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
        hashSet3.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
        hashSet3.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
        hashMap.put(PKCSObjectIdentifiers.rsaEncryption, "RSA/ECB/PKCS1Padding");
        hashMap.put(OIWObjectIdentifiers.elGamalAlgorithm, "Elgamal/ECB/PKCS1Padding");
        hashMap.put(PKCSObjectIdentifiers.id_RSAES_OAEP, "RSA/ECB/OAEPPadding");
        hashMap.put(aSN1ObjectIdentifier, "ECGOST3410");
        hashMap.put(ISOIECObjectIdentifiers.id_kem_rsa, "RSA-KTS-KEM-KWS");
    }

    public static PrivateKey cleanPrivateKey(PrivateKey privateKey) {
        return privateKey instanceof AnnotatedPrivateKey ? cleanPrivateKey(((AnnotatedPrivateKey) privateKey).getKey()) : privateKey;
    }

    public static Cipher createAsymmetricWrapper(JcaJceHelper jcaJceHelper, ASN1ObjectIdentifier aSN1ObjectIdentifier, Map map) {
        try {
            String str = !map.isEmpty() ? (String) map.get(aSN1ObjectIdentifier) : null;
            if (str == null) {
                str = (String) asymmetricWrapperAlgNames.get(aSN1ObjectIdentifier);
            }
            if (str != null) {
                try {
                    return jcaJceHelper.createCipher(str);
                } catch (NoSuchAlgorithmException unused) {
                    if (str.equals("RSA/ECB/PKCS1Padding")) {
                        try {
                            return jcaJceHelper.createCipher("RSA/NONE/PKCS1Padding");
                        } catch (NoSuchAlgorithmException unused2) {
                        }
                    }
                }
            }
            return jcaJceHelper.createCipher(aSN1ObjectIdentifier.getId());
        } catch (GeneralSecurityException e) {
            throw new OperatorCreationException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot create cipher: ")), e);
        }
    }

    public static EnvelopedDataHelper createContentHelper(String str) {
        return str != null ? new EnvelopedDataHelper(new NamedJcaJceExtHelper(str)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }

    public static ASN1Encodable extractParameters(AlgorithmParameters algorithmParameters) {
        try {
            return AlgorithmParametersUtils.extractParameters(algorithmParameters);
        } catch (IOException e) {
            throw new CMSException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("cannot extract parameters: ")), e);
        }
    }

    public static IssuerAndSerialNumber getIssuerAndSerialNumber(X509Certificate x509Certificate) {
        return new IssuerAndSerialNumber(Certificate.getInstance(x509Certificate.getEncoded()).getIssuer(), x509Certificate.getSerialNumber());
    }

    public static Key getJceKey(GenericKey genericKey) {
        if (genericKey.getRepresentation() instanceof Key) {
            return (Key) genericKey.getRepresentation();
        }
        if (genericKey.getRepresentation() instanceof byte[]) {
            return new SecretKeySpec((byte[]) genericKey.getRepresentation(), "ENC");
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown generic key type");
        return null;
    }

    public static int getKekSize(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) CMSAlgorithm.AES256_WRAP)) {
            return 32;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) CMSAlgorithm.AES128_WRAP)) {
            return 16;
        }
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) CMSAlgorithm.AES192_WRAP)) {
            return 24;
        }
        a$$ExternalSyntheticBUOutline0.m$3("unknown wrap algorithm");
        return 0;
    }

    public static byte[] getSubjectKeyId(X509Certificate x509Certificate) {
        byte[] extensionValue = x509Certificate.getExtensionValue(Extension.subjectKeyIdentifier.getId());
        if (extensionValue != null) {
            return ASN1OctetString.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getOctets();
        }
        return null;
    }

    public static String getWrapAlgorithmName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return wrapAlgNames.get(aSN1ObjectIdentifier);
    }

    public static boolean isEC(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return ecAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isGOST(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return gostAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isMQV(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return mqvAlgs.contains(aSN1ObjectIdentifier);
    }

    public static boolean isRFC2631(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_ESDH) || aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.id_alg_SSDH);
    }

    public static void loadParameters(AlgorithmParameters algorithmParameters, ASN1Encodable aSN1Encodable) {
        try {
            AlgorithmParametersUtils.loadParameters(algorithmParameters, aSN1Encodable);
        } catch (IOException e) {
            f$$ExternalSyntheticLambda0.m((Exception) e, "error encoding algorithm parameters.");
        }
    }

    public static EnvelopedDataHelper createContentHelper(Provider provider) {
        return provider != null ? new EnvelopedDataHelper(new ProviderJcaJceExtHelper(provider)) : new EnvelopedDataHelper(new DefaultJcaJceExtHelper());
    }
}
