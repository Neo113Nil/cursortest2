package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1BMPString;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1Encoding;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.ASN1Set;
import org.bouncycastle.asn1.BEROctetString;
import org.bouncycastle.asn1.BERSequence;
import org.bouncycastle.asn1.DERBMPString;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.DERSet;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.GOST28147Parameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.AuthenticatedSafe;
import org.bouncycastle.asn1.pkcs.CertBag;
import org.bouncycastle.asn1.pkcs.ContentInfo;
import org.bouncycastle.asn1.pkcs.EncryptedData;
import org.bouncycastle.asn1.pkcs.EncryptedPrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.EncryptionScheme;
import org.bouncycastle.asn1.pkcs.KeyDerivationFunc;
import org.bouncycastle.asn1.pkcs.MacData;
import org.bouncycastle.asn1.pkcs.PBES2Parameters;
import org.bouncycastle.asn1.pkcs.PBKDF2Params;
import org.bouncycastle.asn1.pkcs.PKCS12PBEParams;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.Pfx;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.pkcs.SafeBag;
import org.bouncycastle.asn1.util.ASN1Dump;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.AuthorityKeyIdentifier;
import org.bouncycastle.asn1.x509.DigestInfo;
import org.bouncycastle.asn1.x509.ExtendedKeyUsage;
import org.bouncycastle.asn1.x509.Extension;
import org.bouncycastle.asn1.x509.Extensions;
import org.bouncycastle.asn1.x509.KeyPurposeId;
import org.bouncycastle.asn1.x509.SubjectKeyIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x509.TBSCertificate;
import org.bouncycastle.asn1.x509.X509ObjectIdentifiers;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.internal.asn1.cms.GCMParameters;
import org.bouncycastle.internal.asn1.misc.MiscObjectIdentifiers;
import org.bouncycastle.internal.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.internal.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.PKCS12Key;
import org.bouncycastle.jcajce.PKCS12StoreParameter;
import org.bouncycastle.jcajce.provider.keystore.util.AdaptingKeyStoreSpi;
import org.bouncycastle.jcajce.provider.keystore.util.ParameterUtil;
import org.bouncycastle.jcajce.spec.GOST28147ParameterSpec;
import org.bouncycastle.jcajce.spec.PBKDF2KeySpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.jce.interfaces.BCKeyStore;
import org.bouncycastle.jce.interfaces.PKCS12BagAttributeCarrier;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.provider.JDKPKCS12StoreParameter;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.BigIntegers;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Hex;

/* loaded from: classes9.dex */
public class PKCS12KeyStoreSpi extends KeyStoreSpi implements PKCSObjectIdentifiers, X509ObjectIdentifiers, BCKeyStore {
    static final int CERTIFICATE = 1;
    static final int KEY = 2;
    static final int KEY_PRIVATE = 0;
    static final int KEY_PUBLIC = 1;
    static final int KEY_SECRET = 2;
    private static final int MIN_ITERATIONS = 51200;
    static final int NULL = 0;
    static final String PKCS12_MAX_IT_COUNT_PROPERTY = "org.bouncycastle.pkcs12.max_it_count";
    private static final int SALT_SIZE = 20;
    static final int SEALED = 4;
    static final int SECRET = 3;
    private static final DefaultSecretKeyProvider keySizeProvider = new DefaultSecretKeyProvider();
    private ASN1ObjectIdentifier certAlgorithm;
    private CertificateFactory certFact;
    private IgnoresCaseHashtable certs;
    private ASN1ObjectIdentifier keyAlgorithm;
    private IgnoresCaseHashtable keys;
    private IgnoresCaseHashtable localIds;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private Hashtable chainCerts = new Hashtable();
    private Hashtable keyCerts = new Hashtable();
    protected SecureRandom random = CryptoServicesRegistrar.getSecureRandom();
    private AlgorithmIdentifier macAlgorithm = new AlgorithmIdentifier(OIWObjectIdentifiers.idSHA1, DERNull.INSTANCE);
    private int itCount = 102400;
    private int saltLength = 20;

    public static class BCPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStore() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class BCPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public BCPKCS12KeyStore3DES() {
            super(r0, new PKCS12KeyStoreSpi(r2, r3, r3));
            BCJcaJceHelper bCJcaJceHelper = new BCJcaJceHelper();
            BCJcaJceHelper bCJcaJceHelper2 = new BCJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
        }
    }

    public static class BCPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_CBC, NISTObjectIdentifiers.id_aes128_CBC));
        }
    }

    public static class BCPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public BCPKCS12KeyStoreAES256GCM() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_GCM, NISTObjectIdentifiers.id_aes128_GCM));
        }
    }

    public static class DefPKCS12KeyStore extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStore() {
            super(new DefaultJcaJceHelper(), new PKCS12KeyStoreSpi(new DefaultJcaJceHelper(), PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC, PKCSObjectIdentifiers.pbeWithSHAAnd40BitRC2_CBC));
        }
    }

    public static class DefPKCS12KeyStore3DES extends AdaptingKeyStoreSpi {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DefPKCS12KeyStore3DES() {
            super(r0, new PKCS12KeyStoreSpi(r2, r3, r3));
            DefaultJcaJceHelper defaultJcaJceHelper = new DefaultJcaJceHelper();
            DefaultJcaJceHelper defaultJcaJceHelper2 = new DefaultJcaJceHelper();
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC;
        }
    }

    public static class DefPKCS12KeyStoreAES256 extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_CBC, NISTObjectIdentifiers.id_aes128_CBC));
        }
    }

    public static class DefPKCS12KeyStoreAES256GCM extends AdaptingKeyStoreSpi {
        public DefPKCS12KeyStoreAES256GCM() {
            super(new BCJcaJceHelper(), new PKCS12KeyStoreSpi(new BCJcaJceHelper(), NISTObjectIdentifiers.id_aes256_GCM, NISTObjectIdentifiers.id_aes128_GCM));
        }
    }

    public static class DefaultSecretKeyProvider {
        private final Map KEY_SIZES;

        public DefaultSecretKeyProvider() {
            HashMap hashMap = new HashMap();
            hashMap.put(new ASN1ObjectIdentifier("1.2.840.113533.7.66.10"), Integers.valueOf(128));
            hashMap.put(PKCSObjectIdentifiers.des_EDE3_CBC, Integers.valueOf(192));
            hashMap.put(NISTObjectIdentifiers.id_aes128_CBC, Integers.valueOf(128));
            hashMap.put(NISTObjectIdentifiers.id_aes192_CBC, Integers.valueOf(192));
            hashMap.put(NISTObjectIdentifiers.id_aes256_CBC, Integers.valueOf(256));
            hashMap.put(NISTObjectIdentifiers.id_aes128_GCM, Integers.valueOf(128));
            hashMap.put(NISTObjectIdentifiers.id_aes256_GCM, Integers.valueOf(256));
            hashMap.put(NTTObjectIdentifiers.id_camellia128_cbc, Integers.valueOf(128));
            hashMap.put(NTTObjectIdentifiers.id_camellia192_cbc, Integers.valueOf(192));
            hashMap.put(NTTObjectIdentifiers.id_camellia256_cbc, Integers.valueOf(256));
            hashMap.put(CryptoProObjectIdentifiers.gostR28147_gcfb, Integers.valueOf(256));
            this.KEY_SIZES = Collections.unmodifiableMap(hashMap);
        }

        public int getKeySize(AlgorithmIdentifier algorithmIdentifier) {
            Integer num = (Integer) this.KEY_SIZES.get(algorithmIdentifier.getAlgorithm());
            if (num != null) {
                return num.intValue();
            }
            return -1;
        }
    }

    public static class IgnoresCaseHashtable {
        private Hashtable keys;
        private Hashtable orig;

        private IgnoresCaseHashtable() {
            this.orig = new Hashtable();
            this.keys = new Hashtable();
        }

        public Enumeration elements() {
            return this.orig.elements();
        }

        public Object get(String str) {
            String str2 = (String) this.keys.get(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.get(str2);
        }

        public Enumeration keys() {
            return this.orig.keys();
        }

        public void put(String str, Object obj) {
            String lowerCase = str == null ? null : Strings.toLowerCase(str);
            String str2 = (String) this.keys.get(lowerCase);
            if (str2 != null) {
                this.orig.remove(str2);
            }
            this.keys.put(lowerCase, str);
            this.orig.put(str, obj);
        }

        public Object remove(String str) {
            String str2 = (String) this.keys.remove(str == null ? null : Strings.toLowerCase(str));
            if (str2 == null) {
                return null;
            }
            return this.orig.remove(str2);
        }

        public int size() {
            return this.orig.size();
        }
    }

    public PKCS12KeyStoreSpi(JcaJceHelper jcaJceHelper, ASN1ObjectIdentifier aSN1ObjectIdentifier, ASN1ObjectIdentifier aSN1ObjectIdentifier2) {
        this.keys = new IgnoresCaseHashtable();
        this.localIds = new IgnoresCaseHashtable();
        this.certs = new IgnoresCaseHashtable();
        this.keyAlgorithm = aSN1ObjectIdentifier;
        this.certAlgorithm = aSN1ObjectIdentifier2;
        try {
            this.certFact = jcaJceHelper.createCertificateFactory("X.509");
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m$3(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("can't create cert factory - ")));
            throw null;
        }
    }

    private byte[] calculatePbeMac(ASN1ObjectIdentifier aSN1ObjectIdentifier, byte[] bArr, int i, char[] cArr, boolean z, byte[] bArr2) {
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(bArr, i);
        Mac createMac = this.helper.createMac(aSN1ObjectIdentifier.getId());
        createMac.init(new PKCS12Key(cArr, z), pBEParameterSpec);
        createMac.update(bArr2);
        return createMac.doFinal();
    }

    private Cipher createCipher(int i, char[] cArr, AlgorithmIdentifier algorithmIdentifier) {
        AlgorithmParameterSpec gOST28147ParameterSpec;
        PBES2Parameters pBES2Parameters = PBES2Parameters.getInstance(algorithmIdentifier.getParameters());
        PBKDF2Params pBKDF2Params = PBKDF2Params.getInstance(pBES2Parameters.getKeyDerivationFunc().getParameters());
        AlgorithmIdentifier algorithmIdentifier2 = AlgorithmIdentifier.getInstance(pBES2Parameters.getEncryptionScheme());
        SecretKey generateSecret = this.helper.createSecretKeyFactory(pBES2Parameters.getKeyDerivationFunc().getAlgorithm().getId()).generateSecret(pBKDF2Params.isDefaultPrf() ? new PBEKeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2)) : new PBKDF2KeySpec(cArr, pBKDF2Params.getSalt(), validateIterationCount(pBKDF2Params.getIterationCount()), keySizeProvider.getKeySize(algorithmIdentifier2), pBKDF2Params.getPrf()));
        Cipher createCipher = this.helper.createCipher(pBES2Parameters.getEncryptionScheme().getAlgorithm().getId());
        ASN1Encodable parameters = pBES2Parameters.getEncryptionScheme().getParameters();
        if (parameters instanceof ASN1OctetString) {
            gOST28147ParameterSpec = new IvParameterSpec(ASN1OctetString.getInstance(parameters).getOctets());
        } else {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(parameters);
            if (!(aSN1Sequence.getObjectAt(1) instanceof ASN1ObjectIdentifier)) {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(algorithmIdentifier2.getAlgorithm().getId(), BouncyCastleProvider.PROVIDER_NAME);
                try {
                    algorithmParameters.init(aSN1Sequence.getEncoded());
                    createCipher.init(i, generateSecret, algorithmParameters);
                    return createCipher;
                } catch (IOException e) {
                    throw new InvalidKeySpecException(e.getMessage());
                }
            }
            GOST28147Parameters gOST28147Parameters = GOST28147Parameters.getInstance(parameters);
            gOST28147ParameterSpec = new GOST28147ParameterSpec(gOST28147Parameters.getEncryptionParamSet(), gOST28147Parameters.getIV());
        }
        createCipher.init(i, generateSecret, gOST28147ParameterSpec);
        return createCipher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SafeBag createSafeBag(String str, Certificate certificate) {
        DERSequence dERSequence;
        CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate.getEncoded()));
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        boolean z = false;
        if (certificate instanceof PKCS12BagAttributeCarrier) {
            PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) certificate;
            ASN1ObjectIdentifier aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
            ASN1BMPString aSN1BMPString = (ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
            if ((aSN1BMPString == null || !aSN1BMPString.getString().equals(str)) && str != null) {
                pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, new DERBMPString(str));
            }
            Enumeration bagAttributeKeys = pKCS12BagAttributeCarrier.getBagAttributeKeys();
            while (bagAttributeKeys.hasMoreElements()) {
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                if (!aSN1ObjectIdentifier2.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
                    aSN1EncodableVector2.add(aSN1ObjectIdentifier2);
                    aSN1EncodableVector2.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier2)));
                    aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector2));
                    z = true;
                }
            }
        }
        if (!z) {
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            aSN1EncodableVector3.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
            aSN1EncodableVector3.add(new DERSet(new DERBMPString(str)));
            aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector3));
        }
        if (certificate instanceof X509Certificate) {
            Extensions extensions = TBSCertificate.getInstance(((X509Certificate) certificate).getTBSCertificate()).getExtensions();
            if (extensions != null) {
                Extension extension = extensions.getExtension(Extension.extendedKeyUsage);
                if (extension != null) {
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                    aSN1EncodableVector4.add(new DERSet(ExtendedKeyUsage.getInstance(extension.getParsedValue()).getUsages()));
                    aSN1EncodableVector.add(new DERSequence(aSN1EncodableVector4));
                } else {
                    ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                    aSN1EncodableVector5.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                    aSN1EncodableVector5.add(new DERSet(KeyPurposeId.anyExtendedKeyUsage));
                    dERSequence = new DERSequence(aSN1EncodableVector5);
                }
            } else {
                ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                aSN1EncodableVector6.add(MiscObjectIdentifiers.id_oracle_pkcs12_trusted_key_usage);
                aSN1EncodableVector6.add(new DERSet(KeyPurposeId.anyExtendedKeyUsage));
                dERSequence = new DERSequence(aSN1EncodableVector6);
            }
            aSN1EncodableVector.add(dERSequence);
        }
        return new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SubjectKeyIdentifier createSubjectKeyId(PublicKey publicKey) {
        try {
            return new SubjectKeyIdentifier(getDigest(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded())));
        } catch (Exception unused) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1("error creating key");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02bd A[Catch: CertificateEncodingException -> 0x035f, TryCatch #4 {CertificateEncodingException -> 0x035f, blocks: (B:58:0x026e, B:60:0x0291, B:62:0x029e, B:65:0x02ad, B:66:0x02b5, B:68:0x02bd, B:69:0x02c8, B:70:0x02cd, B:72:0x02d3, B:75:0x0302, B:76:0x0343), top: B:57:0x026e }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02d3 A[Catch: CertificateEncodingException -> 0x035f, LOOP:4: B:70:0x02cd->B:72:0x02d3, LOOP_END, TryCatch #4 {CertificateEncodingException -> 0x035f, blocks: (B:58:0x026e, B:60:0x0291, B:62:0x029e, B:65:0x02ad, B:66:0x02b5, B:68:0x02bd, B:69:0x02c8, B:70:0x02cd, B:72:0x02d3, B:75:0x0302, B:76:0x0343), top: B:57:0x026e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void doStore(OutputStream outputStream, char[] cArr, boolean z) {
        AlgorithmIdentifier algorithmIdentifier;
        MacData macData;
        AlgorithmIdentifier algorithmIdentifier2;
        boolean z2;
        ASN1ObjectIdentifier aSN1ObjectIdentifier;
        Enumeration bagAttributeKeys;
        byte[] wrapKey;
        AlgorithmIdentifier algorithmIdentifier3;
        boolean z3;
        int size = this.keys.size();
        String str = ASN1Encoding.BER;
        if (size == 0) {
            if (cArr == null) {
                Enumeration keys = this.certs.keys();
                ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
                while (keys.hasMoreElements()) {
                    try {
                        String str2 = (String) keys.nextElement();
                        aSN1EncodableVector.add(createSafeBag(str2, (Certificate) this.certs.get(str2)));
                    } catch (CertificateEncodingException e) {
                        Mod$$ExternalSyntheticBUOutline0.m$1(e);
                        return;
                    }
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier2 = PKCSObjectIdentifiers.data;
                if (z) {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier2, new DEROctetString(new DERSequence(new ContentInfo(aSN1ObjectIdentifier2, new DEROctetString(new DERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.DER);
                    return;
                } else {
                    new Pfx(new ContentInfo(aSN1ObjectIdentifier2, new BEROctetString(new BERSequence(new ContentInfo(aSN1ObjectIdentifier2, new BEROctetString(new BERSequence(aSN1EncodableVector).getEncoded()))).getEncoded())), null).encodeTo(outputStream, ASN1Encoding.BER);
                    return;
                }
            }
        } else if (cArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("no password supplied for PKCS#12 KeyStore");
            return;
        }
        ASN1EncodableVector aSN1EncodableVector2 = new ASN1EncodableVector();
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            byte[] bArr = new byte[20];
            this.random.nextBytes(bArr);
            String str3 = (String) keys2.nextElement();
            PrivateKey privateKey = (PrivateKey) this.keys.get(str3);
            if (isPBKDF2(this.keyAlgorithm)) {
                PBKDF2Params pBKDF2Params = new PBKDF2Params(bArr, MIN_ITERATIONS, getKeyLength(this.keyAlgorithm), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, DERNull.INSTANCE));
                ASN1ObjectIdentifier aSN1ObjectIdentifier3 = this.keyAlgorithm;
                EncryptionScheme encryptionScheme = new EncryptionScheme(aSN1ObjectIdentifier3, getAlgParams(aSN1ObjectIdentifier3));
                algorithmIdentifier3 = new AlgorithmIdentifier(PKCSObjectIdentifiers.id_PBES2, new PBES2Parameters(new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, pBKDF2Params), encryptionScheme));
                wrapKey = wrapKey(encryptionScheme, privateKey, pBKDF2Params, cArr);
            } else {
                PKCS12PBEParams pKCS12PBEParams = new PKCS12PBEParams(bArr, MIN_ITERATIONS);
                wrapKey = wrapKey(this.keyAlgorithm.getId(), privateKey, pKCS12PBEParams, cArr);
                algorithmIdentifier3 = new AlgorithmIdentifier(this.keyAlgorithm, pKCS12PBEParams.toASN1Primitive());
            }
            EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = new EncryptedPrivateKeyInfo(algorithmIdentifier3, wrapKey);
            ASN1EncodableVector aSN1EncodableVector3 = new ASN1EncodableVector();
            if (privateKey instanceof PKCS12BagAttributeCarrier) {
                PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
                ASN1ObjectIdentifier aSN1ObjectIdentifier4 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                ASN1BMPString aSN1BMPString = (ASN1BMPString) pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier4);
                if (aSN1BMPString == null || !aSN1BMPString.getString().equals(str3)) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier4, new DERBMPString(str3));
                }
                ASN1ObjectIdentifier aSN1ObjectIdentifier5 = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                if (pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier5) == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier5, createSubjectKeyId(engineGetCertificate(str3).getPublicKey()));
                }
                Enumeration bagAttributeKeys2 = pKCS12BagAttributeCarrier.getBagAttributeKeys();
                z3 = false;
                while (bagAttributeKeys2.hasMoreElements()) {
                    ASN1ObjectIdentifier aSN1ObjectIdentifier6 = (ASN1ObjectIdentifier) bagAttributeKeys2.nextElement();
                    ASN1EncodableVector aSN1EncodableVector4 = new ASN1EncodableVector();
                    aSN1EncodableVector4.add(aSN1ObjectIdentifier6);
                    aSN1EncodableVector4.add(new DERSet(pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier6)));
                    aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector4));
                    z3 = true;
                }
            } else {
                z3 = false;
            }
            if (!z3) {
                ASN1EncodableVector aSN1EncodableVector5 = new ASN1EncodableVector();
                Certificate engineGetCertificate = engineGetCertificate(str3);
                aSN1EncodableVector5.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                aSN1EncodableVector5.add(new DERSet(createSubjectKeyId(engineGetCertificate.getPublicKey())));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector5));
                ASN1EncodableVector aSN1EncodableVector6 = new ASN1EncodableVector();
                aSN1EncodableVector6.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                aSN1EncodableVector6.add(new DERSet(new DERBMPString(str3)));
                aSN1EncodableVector3.add(new DERSequence(aSN1EncodableVector6));
            }
            aSN1EncodableVector2.add(new SafeBag(PKCSObjectIdentifiers.pkcs8ShroudedKeyBag, encryptedPrivateKeyInfo.toASN1Primitive(), new DERSet(aSN1EncodableVector3)));
        }
        BEROctetString bEROctetString = new BEROctetString(new DERSequence(aSN1EncodableVector2).getEncoded(ASN1Encoding.DER));
        byte[] bArr2 = new byte[20];
        this.random.nextBytes(bArr2);
        ASN1EncodableVector aSN1EncodableVector7 = new ASN1EncodableVector();
        if (isPBKDF2(this.certAlgorithm)) {
            PBKDF2Params pBKDF2Params2 = new PBKDF2Params(bArr2, MIN_ITERATIONS, getKeyLength(this.certAlgorithm), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_hmacWithSHA256, DERNull.INSTANCE));
            ASN1ObjectIdentifier aSN1ObjectIdentifier7 = PKCSObjectIdentifiers.id_PBES2;
            KeyDerivationFunc keyDerivationFunc = new KeyDerivationFunc(PKCSObjectIdentifiers.id_PBKDF2, pBKDF2Params2);
            ASN1ObjectIdentifier aSN1ObjectIdentifier8 = this.certAlgorithm;
            algorithmIdentifier = new AlgorithmIdentifier(aSN1ObjectIdentifier7, new PBES2Parameters(keyDerivationFunc, new EncryptionScheme(aSN1ObjectIdentifier8, getAlgParams(aSN1ObjectIdentifier8))));
        } else {
            algorithmIdentifier = new AlgorithmIdentifier(this.certAlgorithm, new PKCS12PBEParams(bArr2, MIN_ITERATIONS).toASN1Primitive());
        }
        Hashtable hashtable = new Hashtable();
        Enumeration keys3 = this.keys.keys();
        while (keys3.hasMoreElements()) {
            try {
                String str4 = (String) keys3.nextElement();
                Certificate engineGetCertificate2 = engineGetCertificate(str4);
                CertBag certBag = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(engineGetCertificate2.getEncoded()));
                ASN1EncodableVector aSN1EncodableVector8 = new ASN1EncodableVector();
                if (engineGetCertificate2 instanceof PKCS12BagAttributeCarrier) {
                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier2 = (PKCS12BagAttributeCarrier) engineGetCertificate2;
                    ASN1ObjectIdentifier aSN1ObjectIdentifier9 = PKCSObjectIdentifiers.pkcs_9_at_friendlyName;
                    ASN1BMPString aSN1BMPString2 = (ASN1BMPString) pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier9);
                    if (aSN1BMPString2 != null) {
                        algorithmIdentifier2 = algorithmIdentifier;
                        if (!aSN1BMPString2.getString().equals(str4)) {
                        }
                        aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                        if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier) == null) {
                            pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier, createSubjectKeyId(engineGetCertificate2.getPublicKey()));
                        }
                        bagAttributeKeys = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                        z2 = false;
                        while (bagAttributeKeys.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier10 = (ASN1ObjectIdentifier) bagAttributeKeys.nextElement();
                            Enumeration enumeration = bagAttributeKeys;
                            ASN1EncodableVector aSN1EncodableVector9 = new ASN1EncodableVector();
                            aSN1EncodableVector9.add(aSN1ObjectIdentifier10);
                            aSN1EncodableVector9.add(new DERSet(pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier10)));
                            aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector9));
                            bagAttributeKeys = enumeration;
                            z2 = true;
                        }
                    } else {
                        algorithmIdentifier2 = algorithmIdentifier;
                    }
                    pKCS12BagAttributeCarrier2.setBagAttribute(aSN1ObjectIdentifier9, new DERBMPString(str4));
                    aSN1ObjectIdentifier = PKCSObjectIdentifiers.pkcs_9_at_localKeyId;
                    if (pKCS12BagAttributeCarrier2.getBagAttribute(aSN1ObjectIdentifier) == null) {
                    }
                    bagAttributeKeys = pKCS12BagAttributeCarrier2.getBagAttributeKeys();
                    z2 = false;
                    while (bagAttributeKeys.hasMoreElements()) {
                    }
                } else {
                    algorithmIdentifier2 = algorithmIdentifier;
                    z2 = false;
                }
                if (!z2) {
                    ASN1EncodableVector aSN1EncodableVector10 = new ASN1EncodableVector();
                    aSN1EncodableVector10.add(PKCSObjectIdentifiers.pkcs_9_at_localKeyId);
                    aSN1EncodableVector10.add(new DERSet(createSubjectKeyId(engineGetCertificate2.getPublicKey())));
                    aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector10));
                    ASN1EncodableVector aSN1EncodableVector11 = new ASN1EncodableVector();
                    aSN1EncodableVector11.add(PKCSObjectIdentifiers.pkcs_9_at_friendlyName);
                    aSN1EncodableVector11.add(new DERSet(new DERBMPString(str4)));
                    aSN1EncodableVector8.add(new DERSequence(aSN1EncodableVector11));
                }
                aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag.toASN1Primitive(), new DERSet(aSN1EncodableVector8)));
                hashtable.put(engineGetCertificate2, engineGetCertificate2);
                algorithmIdentifier = algorithmIdentifier2;
            } catch (CertificateEncodingException e2) {
                Mod$$ExternalSyntheticBUOutline0.m$1(e2);
                return;
            }
        }
        AlgorithmIdentifier algorithmIdentifier4 = algorithmIdentifier;
        Enumeration keys4 = this.certs.keys();
        while (keys4.hasMoreElements()) {
            try {
                String str5 = (String) keys4.nextElement();
                Certificate certificate = (Certificate) this.certs.get(str5);
                if (this.keys.get(str5) == null) {
                    aSN1EncodableVector7.add(createSafeBag(str5, certificate));
                    hashtable.put(certificate, certificate);
                }
            } catch (CertificateEncodingException e3) {
                Mod$$ExternalSyntheticBUOutline0.m$1(e3);
                return;
            }
        }
        Set usedCertificateSet = getUsedCertificateSet();
        Enumeration keys5 = this.chainCerts.keys();
        while (keys5.hasMoreElements()) {
            try {
                Certificate certificate2 = (Certificate) this.chainCerts.get((CertId) keys5.nextElement());
                if (usedCertificateSet.contains(certificate2) && hashtable.get(certificate2) == null) {
                    CertBag certBag2 = new CertBag(PKCSObjectIdentifiers.x509Certificate, new DEROctetString(certificate2.getEncoded()));
                    ASN1EncodableVector aSN1EncodableVector12 = new ASN1EncodableVector();
                    if (certificate2 instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier3 = (PKCS12BagAttributeCarrier) certificate2;
                        Enumeration bagAttributeKeys3 = pKCS12BagAttributeCarrier3.getBagAttributeKeys();
                        while (bagAttributeKeys3.hasMoreElements()) {
                            ASN1ObjectIdentifier aSN1ObjectIdentifier11 = (ASN1ObjectIdentifier) bagAttributeKeys3.nextElement();
                            if (!aSN1ObjectIdentifier11.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                ASN1EncodableVector aSN1EncodableVector13 = new ASN1EncodableVector();
                                aSN1EncodableVector13.add(aSN1ObjectIdentifier11);
                                aSN1EncodableVector13.add(new DERSet(pKCS12BagAttributeCarrier3.getBagAttribute(aSN1ObjectIdentifier11)));
                                aSN1EncodableVector12.add(new DERSequence(aSN1EncodableVector13));
                            }
                        }
                    }
                    aSN1EncodableVector7.add(new SafeBag(PKCSObjectIdentifiers.certBag, certBag2.toASN1Primitive(), new DERSet(aSN1EncodableVector12)));
                }
            } catch (CertificateEncodingException e4) {
                Mod$$ExternalSyntheticBUOutline0.m$1(e4);
                return;
            }
        }
        byte[] cryptData = cryptData(true, algorithmIdentifier4, cArr, false, new DERSequence(aSN1EncodableVector7).getEncoded(ASN1Encoding.DER));
        ASN1ObjectIdentifier aSN1ObjectIdentifier12 = PKCSObjectIdentifiers.data;
        ContentInfo contentInfo = new ContentInfo(aSN1ObjectIdentifier12, new BEROctetString(new AuthenticatedSafe(new ContentInfo[]{new ContentInfo(aSN1ObjectIdentifier12, bEROctetString), new ContentInfo(PKCSObjectIdentifiers.encryptedData, new EncryptedData(aSN1ObjectIdentifier12, algorithmIdentifier4, new BEROctetString(cryptData)).toASN1Primitive())}).getEncoded(z ? ASN1Encoding.DER : ASN1Encoding.BER)));
        byte[] bArr3 = new byte[this.saltLength];
        this.random.nextBytes(bArr3);
        byte[] octets = ((ASN1OctetString) contentInfo.getContent()).getOctets();
        if (this.keyAlgorithm.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) {
            macData = null;
        } else {
            try {
                macData = new MacData(new DigestInfo(this.macAlgorithm, calculatePbeMac(this.macAlgorithm.getAlgorithm(), bArr3, this.itCount, cArr, false, octets)), bArr3, this.itCount);
            } catch (Exception e5) {
                a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m(e5, new StringBuilder("error constructing MAC: ")));
                return;
            }
        }
        Pfx pfx = new Pfx(contentInfo, macData);
        if (z) {
            str = ASN1Encoding.DER;
        }
        pfx.encodeTo(outputStream, str);
    }

    private ASN1Primitive getAlgParams(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        if (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC)) {
            byte[] bArr = new byte[16];
            this.random.nextBytes(bArr);
            return new DEROctetString(bArr);
        }
        if (!aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_GCM) && !aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) {
            a$$ExternalSyntheticBUOutline0.m$1("unknown encryption OID in getAlgParams()");
            return null;
        }
        byte[] bArr2 = new byte[12];
        this.random.nextBytes(bArr2);
        return new GCMParameters(bArr2, 16).toASN1Primitive();
    }

    private static byte[] getDigest(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        Digest createSHA1 = DigestFactory.createSHA1();
        byte[] bArr = new byte[createSHA1.getDigestSize()];
        byte[] bytes = subjectPublicKeyInfo.getPublicKeyData().getBytes();
        createSHA1.update(bytes, 0, bytes.length);
        createSHA1.doFinal(bArr, 0);
        return bArr;
    }

    private static int getKeyLength(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM)) ? 32 : 16;
    }

    private Set getUsedCertificateSet() {
        HashSet hashSet = new HashSet();
        Enumeration keys = this.keys.keys();
        while (keys.hasMoreElements()) {
            Certificate[] engineGetCertificateChain = engineGetCertificateChain((String) keys.nextElement());
            for (int i = 0; i != engineGetCertificateChain.length; i++) {
                hashSet.add(engineGetCertificateChain[i]);
            }
        }
        Enumeration keys2 = this.certs.keys();
        while (keys2.hasMoreElements()) {
            hashSet.add(engineGetCertificate((String) keys2.nextElement()));
        }
        return hashSet;
    }

    private static boolean isPBKDF2(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes256_GCM) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_CBC) || aSN1ObjectIdentifier.equals((ASN1Primitive) NISTObjectIdentifiers.id_aes128_GCM);
    }

    private void processKeyBag(SafeBag safeBag) {
        PrivateKey privateKey = BouncyCastleProvider.getPrivateKey(PrivateKeyInfo.getInstance(safeBag.getBagValue()));
        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) privateKey;
        Enumeration objects = safeBag.getBagAttributes().getObjects();
        ASN1OctetString aSN1OctetString = null;
        String str = null;
        while (objects.hasMoreElements()) {
            ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(objects.nextElement());
            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence.getObjectAt(0));
            ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence.getObjectAt(1));
            if (aSN1Set.size() > 0) {
                ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                if (bagAttribute == null) {
                    pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                } else if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                    a$$ExternalSyntheticBUOutline0.m$4("attempt to add existing attribute with different value");
                    return;
                }
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                    str = ((ASN1BMPString) aSN1Primitive).getString();
                    this.keys.put(str, privateKey);
                } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    aSN1OctetString = (ASN1OctetString) aSN1Primitive;
                }
            }
        }
        String str2 = new String(Hex.encode(aSN1OctetString.getOctets()));
        if (str == null) {
            this.keys.put(str2, privateKey);
        } else {
            this.localIds.put(str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    private boolean processShroudedKeyBag(SafeBag safeBag, char[] cArr, boolean z) {
        String str;
        ASN1OctetString aSN1OctetString;
        EncryptedPrivateKeyInfo encryptedPrivateKeyInfo = EncryptedPrivateKeyInfo.getInstance(safeBag.getBagValue());
        PrivateKey unwrapKey = unwrapKey(encryptedPrivateKeyInfo.getEncryptionAlgorithm(), encryptedPrivateKeyInfo.getEncryptedData(), cArr, z);
        ASN1OctetString aSN1OctetString2 = null;
        if (safeBag.getBagAttributes() != null) {
            Enumeration objects = safeBag.getBagAttributes().getObjects();
            str = null;
            ASN1OctetString aSN1OctetString3 = null;
            while (objects.hasMoreElements()) {
                ASN1Sequence aSN1Sequence = (ASN1Sequence) objects.nextElement();
                ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) aSN1Sequence.getObjectAt(0);
                ASN1Set aSN1Set = (ASN1Set) aSN1Sequence.getObjectAt(1);
                if (aSN1Set.size() > 0) {
                    ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                    aSN1OctetString = aSN1Primitive;
                    if (unwrapKey instanceof PKCS12BagAttributeCarrier) {
                        PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) unwrapKey;
                        ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                        if (bagAttribute != null) {
                            boolean equals = bagAttribute.toASN1Primitive().equals(aSN1Primitive);
                            aSN1OctetString = aSN1Primitive;
                            if (!equals) {
                                a$$ExternalSyntheticBUOutline0.m$4("attempt to add existing attribute with different value");
                                return false;
                            }
                        } else {
                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                            aSN1OctetString = aSN1Primitive;
                        }
                    }
                } else {
                    aSN1OctetString = 0;
                }
                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                    str = ((ASN1BMPString) aSN1OctetString).getString();
                    this.keys.put(str, unwrapKey);
                } else if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                    aSN1OctetString3 = aSN1OctetString;
                }
            }
            aSN1OctetString2 = aSN1OctetString3;
        } else {
            str = null;
        }
        if (aSN1OctetString2 == null) {
            this.keys.put("unmarked", unwrapKey);
            return true;
        }
        String str2 = new String(Hex.encode(aSN1OctetString2.getOctets()));
        if (str == null) {
            this.keys.put(str2, unwrapKey);
        } else {
            this.localIds.put(str, str2);
        }
        return false;
    }

    private int validateIterationCount(BigInteger bigInteger) {
        int intValueExact = BigIntegers.intValueExact(bigInteger);
        if (intValueExact < 0) {
            a$$ExternalSyntheticBUOutline0.m$1("negative iteration count found");
            return 0;
        }
        BigInteger asBigInteger = Properties.asBigInteger(PKCS12_MAX_IT_COUNT_PROPERTY);
        if (asBigInteger == null || BigIntegers.intValueExact(asBigInteger) >= intValueExact) {
            return intValueExact;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(intValueExact, "iteration count ", " greater than ");
        m2m.append(BigIntegers.intValueExact(asBigInteger));
        throw new IllegalStateException(m2m.toString());
    }

    public byte[] cryptData(boolean z, AlgorithmIdentifier algorithmIdentifier, char[] cArr, boolean z2, byte[] bArr) {
        StringBuilder sb;
        String m;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        int i = z ? 1 : 2;
        if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            try {
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), BigIntegers.intValueExact(pKCS12PBEParams.getIterations()));
                PKCS12Key pKCS12Key = new PKCS12Key(cArr, z2);
                Cipher createCipher = this.helper.createCipher(algorithm.getId());
                createCipher.init(i, pKCS12Key, pBEParameterSpec);
                return createCipher.doFinal(bArr);
            } catch (Exception e) {
                e = e;
                sb = new StringBuilder("exception decrypting data - ");
            }
        } else {
            if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                m = GetCert$$ExternalSyntheticOutline0.m("unknown PBE algorithm: ", algorithm);
                a$$ExternalSyntheticBUOutline0.m$4(m);
                return null;
            }
            try {
                return createCipher(i, cArr, algorithmIdentifier).doFinal(bArr);
            } catch (Exception e2) {
                e = e2;
                sb = new StringBuilder("exception decrypting data - ");
            }
        }
        m = GetCert$$ExternalSyntheticOutline0.m(e, sb);
        a$$ExternalSyntheticBUOutline0.m$4(m);
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration engineAliases() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.keys();
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        return (this.certs.get(str) == null && this.keys.get(str) == null) ? false : true;
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        String str2;
        Certificate certificate;
        Certificate certificate2 = (Certificate) this.certs.remove(str);
        if (certificate2 != null) {
            this.chainCerts.remove(new CertId(certificate2.getPublicKey()));
        }
        if (((Key) this.keys.remove(str)) == null || (str2 = (String) this.localIds.remove(str)) == null || (certificate = (Certificate) this.keyCerts.remove(str2)) == null) {
            return;
        }
        this.chainCerts.remove(new CertId(certificate.getPublicKey()));
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("null alias passed to getCertificate.");
            return null;
        }
        Certificate certificate = (Certificate) this.certs.get(str);
        if (certificate != null) {
            return certificate;
        }
        String str2 = (String) this.localIds.get(str);
        Hashtable hashtable = this.keyCerts;
        return str2 != null ? (Certificate) hashtable.get(str2) : (Certificate) hashtable.get(str);
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        Enumeration elements = this.certs.elements();
        Enumeration keys = this.certs.keys();
        while (elements.hasMoreElements()) {
            Certificate certificate2 = (Certificate) elements.nextElement();
            String str = (String) keys.nextElement();
            if (certificate2.equals(certificate)) {
                return str;
            }
        }
        Enumeration elements2 = this.keyCerts.elements();
        Enumeration keys2 = this.keyCerts.keys();
        while (elements2.hasMoreElements()) {
            Certificate certificate3 = (Certificate) elements2.nextElement();
            String str2 = (String) keys2.nextElement();
            if (certificate3.equals(certificate)) {
                return str2;
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        Certificate engineGetCertificate;
        byte[] keyIdentifier;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("null alias passed to getCertificateChain.");
            return null;
        }
        if (!engineIsKeyEntry(str) || (engineGetCertificate = engineGetCertificate(str)) == null) {
            return null;
        }
        Vector vector = new Vector();
        while (engineGetCertificate != null) {
            X509Certificate x509Certificate = (X509Certificate) engineGetCertificate;
            byte[] extensionValue = x509Certificate.getExtensionValue(Extension.authorityKeyIdentifier.getId());
            Certificate certificate = (extensionValue == null || (keyIdentifier = AuthorityKeyIdentifier.getInstance(ASN1OctetString.getInstance(extensionValue).getOctets()).getKeyIdentifier()) == null) ? null : (Certificate) this.chainCerts.get(new CertId(keyIdentifier));
            if (certificate == null) {
                Principal issuerDN = x509Certificate.getIssuerDN();
                if (!issuerDN.equals(x509Certificate.getSubjectDN())) {
                    Enumeration keys = this.chainCerts.keys();
                    while (true) {
                        if (!keys.hasMoreElements()) {
                            break;
                        }
                        X509Certificate x509Certificate2 = (X509Certificate) this.chainCerts.get(keys.nextElement());
                        if (x509Certificate2.getSubjectDN().equals(issuerDN)) {
                            try {
                                x509Certificate.verify(x509Certificate2.getPublicKey());
                                certificate = x509Certificate2;
                                break;
                            } catch (Exception unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (!vector.contains(engineGetCertificate)) {
                vector.addElement(engineGetCertificate);
                if (certificate != engineGetCertificate) {
                    engineGetCertificate = certificate;
                }
            }
            engineGetCertificate = null;
        }
        int size = vector.size();
        Certificate[] certificateArr = new Certificate[size];
        for (int i = 0; i != size; i++) {
            certificateArr[i] = (Certificate) vector.elementAt(i);
        }
        return certificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$2("alias == null");
            return null;
        }
        if (this.keys.get(str) == null && this.certs.get(str) == null) {
            return null;
        }
        return new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) {
        if (str != null) {
            return (Key) this.keys.get(str);
        }
        a$$ExternalSyntheticBUOutline0.m$3("null alias passed to getKey.");
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        return this.certs.get(str) != null && this.keys.get(str) == null;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        return this.keys.get(str) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x034e  */
    /* JADX WARN: Type inference failed for: r3v6, types: [org.bouncycastle.jcajce.provider.keystore.pkcs12.PKCS12KeyStoreSpi$IgnoresCaseHashtable] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, java.security.cert.Certificate] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v27 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [org.bouncycastle.asn1.ASN1OctetString] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.String] */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void engineLoad(InputStream inputStream, char[] cArr) {
        char[] cArr2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        ?? r7;
        ?? r9;
        int i;
        boolean z5;
        if (inputStream == null) {
            return;
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        bufferedInputStream.mark(10);
        int read = bufferedInputStream.read();
        if (read < 0) {
            Path$$ExternalSyntheticBUOutline0.m$1("no data in keystore stream");
            return;
        }
        if (read != 48) {
            a$$ExternalSyntheticBUOutline0.m$4("stream does not represent a PKCS12 key store");
            return;
        }
        bufferedInputStream.reset();
        try {
            Pfx pfx = Pfx.getInstance(new ASN1InputStream(bufferedInputStream).readObject());
            ContentInfo authSafe = pfx.getAuthSafe();
            Vector vector = new Vector();
            if (pfx.getMacData() == null) {
                cArr2 = cArr;
                z = false;
                z2 = true;
            } else {
                if (cArr == null) {
                    a$$ExternalSyntheticBUOutline0.m$2("no password supplied when one expected");
                    return;
                }
                MacData macData = pfx.getMacData();
                DigestInfo mac = macData.getMac();
                this.macAlgorithm = mac.getAlgorithmId();
                byte[] salt = macData.getSalt();
                this.itCount = validateIterationCount(macData.getIterationCount());
                this.saltLength = salt.length;
                byte[] octets = ((ASN1OctetString) authSafe.getContent()).getOctets();
                try {
                    cArr2 = cArr;
                    byte[] calculatePbeMac = calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr2, false, octets);
                    byte[] digest = mac.getDigest();
                    if (Arrays.constantTimeAreEqual(calculatePbeMac, digest)) {
                        z = false;
                    } else {
                        if (cArr2.length > 0) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        if (!Arrays.constantTimeAreEqual(calculatePbeMac(this.macAlgorithm.getAlgorithm(), salt, this.itCount, cArr2, true, octets), digest)) {
                            throw new IOException("PKCS12 key store mac invalid - wrong password or corrupted file.");
                        }
                        z = true;
                    }
                    z2 = false;
                } catch (IOException e) {
                    throw e;
                } catch (Exception e2) {
                    a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m(e2, new StringBuilder("error constructing MAC: ")));
                    return;
                }
            }
            AnonymousClass1 anonymousClass1 = null;
            this.keys = new IgnoresCaseHashtable();
            this.localIds = new IgnoresCaseHashtable();
            if (authSafe.getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                ContentInfo[] contentInfo = AuthenticatedSafe.getInstance(ASN1OctetString.getInstance(authSafe.getContent()).getOctets()).getContentInfo();
                z3 = true;
                int i2 = 0;
                z4 = false;
                while (i2 != contentInfo.length) {
                    if (contentInfo[i2].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.data)) {
                        ASN1Sequence aSN1Sequence = ASN1Sequence.getInstance(ASN1OctetString.getInstance(contentInfo[i2].getContent()).getOctets());
                        for (int i3 = 0; i3 != aSN1Sequence.size(); i3++) {
                            SafeBag safeBag = SafeBag.getInstance(aSN1Sequence.getObjectAt(i3));
                            if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                z4 = processShroudedKeyBag(safeBag, cArr2, z);
                                z3 = false;
                            } else if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag);
                            } else if (safeBag.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                processKeyBag(safeBag);
                            } else {
                                System.out.println("extra in data " + safeBag.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag));
                            }
                        }
                        z5 = z;
                    } else if (contentInfo[i2].getContentType().equals((ASN1Primitive) PKCSObjectIdentifiers.encryptedData)) {
                        EncryptedData encryptedData = EncryptedData.getInstance(contentInfo[i2].getContent());
                        boolean z6 = z;
                        byte[] cryptData = cryptData(false, encryptedData.getEncryptionAlgorithm(), cArr, z6, encryptedData.getContent().getOctets());
                        z5 = z6;
                        cArr2 = cArr;
                        ASN1Sequence aSN1Sequence2 = ASN1Sequence.getInstance(cryptData);
                        for (int i4 = 0; i4 != aSN1Sequence2.size(); i4++) {
                            SafeBag safeBag2 = SafeBag.getInstance(aSN1Sequence2.getObjectAt(i4));
                            if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.certBag)) {
                                vector.addElement(safeBag2);
                            } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs8ShroudedKeyBag)) {
                                z4 = processShroudedKeyBag(safeBag2, cArr2, z5);
                            } else if (safeBag2.getBagId().equals((ASN1Primitive) PKCSObjectIdentifiers.keyBag)) {
                                processKeyBag(safeBag2);
                            } else {
                                System.out.println("extra in encryptedData " + safeBag2.getBagId());
                                System.out.println(ASN1Dump.dumpAsString(safeBag2));
                            }
                        }
                        z3 = false;
                    } else {
                        z5 = z;
                        System.out.println("extra " + contentInfo[i2].getContentType().getId());
                        System.out.println("extra " + ASN1Dump.dumpAsString(contentInfo[i2].getContent()));
                    }
                    i2++;
                    z = z5;
                }
            } else {
                z3 = true;
                z4 = false;
            }
            this.certs = new IgnoresCaseHashtable();
            this.chainCerts = new Hashtable();
            this.keyCerts = new Hashtable();
            int i5 = 0;
            while (i5 != vector.size()) {
                SafeBag safeBag3 = (SafeBag) vector.elementAt(i5);
                CertBag certBag = CertBag.getInstance(safeBag3.getBagValue());
                if (!certBag.getCertId().equals((ASN1Primitive) PKCSObjectIdentifiers.x509Certificate)) {
                    JWK$$ExternalSyntheticBUOutline0.m$1(certBag.getCertId(), "Unsupported certificate type: ");
                    return;
                }
                try {
                    ?? generateCertificate = this.certFact.generateCertificate(new ByteArrayInputStream(((ASN1OctetString) certBag.getCertValue()).getOctets()));
                    if (safeBag3.getBagAttributes() != null) {
                        Enumeration objects = safeBag3.getBagAttributes().getObjects();
                        AnonymousClass1 anonymousClass12 = anonymousClass1;
                        r9 = anonymousClass12;
                        r7 = anonymousClass12;
                        while (objects.hasMoreElements()) {
                            ASN1Sequence aSN1Sequence3 = ASN1Sequence.getInstance(objects.nextElement());
                            ASN1ObjectIdentifier aSN1ObjectIdentifier = ASN1ObjectIdentifier.getInstance(aSN1Sequence3.getObjectAt(0));
                            ASN1Set aSN1Set = ASN1Set.getInstance(aSN1Sequence3.getObjectAt(1));
                            if (aSN1Set.size() > 0) {
                                ASN1Primitive aSN1Primitive = (ASN1Primitive) aSN1Set.getObjectAt(0);
                                if (generateCertificate instanceof PKCS12BagAttributeCarrier) {
                                    PKCS12BagAttributeCarrier pKCS12BagAttributeCarrier = (PKCS12BagAttributeCarrier) generateCertificate;
                                    ASN1Encodable bagAttribute = pKCS12BagAttributeCarrier.getBagAttribute(aSN1ObjectIdentifier);
                                    if (bagAttribute != null) {
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                            String hexString = Hex.toHexString(((ASN1OctetString) aSN1Primitive).getOctets());
                                            if (!this.keys.keys.containsKey(hexString) && !this.localIds.keys.containsKey(hexString)) {
                                                r7 = r7;
                                            }
                                        }
                                        if (!bagAttribute.toASN1Primitive().equals(aSN1Primitive)) {
                                            a$$ExternalSyntheticBUOutline0.m$4("attempt to add existing attribute with different value");
                                            return;
                                        }
                                    } else {
                                        i = i5;
                                        if (aSN1Set.size() > 1) {
                                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Set);
                                        } else {
                                            pKCS12BagAttributeCarrier.setBagAttribute(aSN1ObjectIdentifier, aSN1Primitive);
                                        }
                                        if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                            r7 = r7;
                                            if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_localKeyId)) {
                                                r7 = (ASN1OctetString) aSN1Primitive;
                                            }
                                        } else {
                                            r9 = ((ASN1BMPString) aSN1Primitive).getString();
                                            r7 = r7;
                                        }
                                    }
                                }
                                i = i5;
                                if (aSN1ObjectIdentifier.equals((ASN1Primitive) PKCSObjectIdentifiers.pkcs_9_at_friendlyName)) {
                                }
                            } else {
                                i = i5;
                                r7 = r7;
                            }
                            i5 = i;
                            r7 = r7;
                        }
                    } else {
                        r7 = 0;
                        r9 = null;
                    }
                    int i6 = i5;
                    this.chainCerts.put(new CertId(generateCertificate.getPublicKey()), generateCertificate);
                    if (!z4) {
                        if (r7 != 0) {
                            this.keyCerts.put(new String(Hex.encode(r7.getOctets())), generateCertificate);
                        }
                        if (r9 != null) {
                            this.certs.put(r9, generateCertificate);
                        }
                    } else if (this.keyCerts.isEmpty()) {
                        String str = new String(Hex.encode(createSubjectKeyId(generateCertificate.getPublicKey()).getKeyIdentifier()));
                        this.keyCerts.put(str, generateCertificate);
                        IgnoresCaseHashtable ignoresCaseHashtable = this.keys;
                        ignoresCaseHashtable.put(str, ignoresCaseHashtable.remove("unmarked"));
                    }
                    i5 = i6 + 1;
                    anonymousClass1 = null;
                } catch (Exception e3) {
                    Mod$$ExternalSyntheticBUOutline0.m$3(e3);
                    return;
                }
            }
            if (!z2 || !z3 || cArr2 == null || cArr2.length == 0 || Properties.isOverrideSet("org.bouncycastle.pkcs12.ignore_useless_passwd")) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$4("password supplied for keystore that does not require one");
        } catch (Exception e4) {
            a$$ExternalSyntheticBUOutline0.m$4(e4.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineProbe(InputStream inputStream) {
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        if (this.keys.get(str) != null) {
            throw new KeyStoreException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("There is a key entry with the name ", str, "."));
        }
        this.certs.put(str, certificate);
        this.chainCerts.put(new CertId(certificate.getPublicKey()), certificate);
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        if (!(key instanceof PrivateKey)) {
            throw new KeyStoreException("PKCS12 does not support non-PrivateKeys");
        }
        if (certificateArr == null) {
            throw new KeyStoreException("no certificate chain for private key");
        }
        if (this.keys.get(str) != null) {
            engineDeleteEntry(str);
        }
        this.keys.put(str, key);
        if (certificateArr != null) {
            this.certs.put(str, certificateArr[0]);
            for (int i = 0; i != certificateArr.length; i++) {
                this.chainCerts.put(new CertId(certificateArr[i].getPublicKey()), certificateArr[i]);
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        Hashtable hashtable = new Hashtable();
        Enumeration keys = this.certs.keys();
        while (keys.hasMoreElements()) {
            hashtable.put(keys.nextElement(), "cert");
        }
        Enumeration keys2 = this.keys.keys();
        while (keys2.hasMoreElements()) {
            String str = (String) keys2.nextElement();
            if (hashtable.get(str) == null) {
                hashtable.put(str, "key");
            }
        }
        return hashtable.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
        PKCS12StoreParameter pKCS12StoreParameter;
        char[] password;
        if (loadStoreParameter == null) {
            a$$ExternalSyntheticBUOutline0.m$3("'param' arg cannot be null");
            return;
        }
        boolean z = loadStoreParameter instanceof PKCS12StoreParameter;
        if (!z && !(loadStoreParameter instanceof JDKPKCS12StoreParameter)) {
            a$$ExternalSyntheticBUOutline0.m$3("No support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
            return;
        }
        if (z) {
            pKCS12StoreParameter = (PKCS12StoreParameter) loadStoreParameter;
        } else {
            JDKPKCS12StoreParameter jDKPKCS12StoreParameter = (JDKPKCS12StoreParameter) loadStoreParameter;
            pKCS12StoreParameter = new PKCS12StoreParameter(jDKPKCS12StoreParameter.getOutputStream(), loadStoreParameter.getProtectionParameter(), jDKPKCS12StoreParameter.isUseDEREncoding());
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            password = null;
        } else {
            if (!(protectionParameter instanceof KeyStore.PasswordProtection)) {
                a$$ExternalSyntheticBUOutline0.m$3("No support for protection parameter of type ".concat(protectionParameter.getClass().getName()));
                return;
            }
            password = ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        doStore(pKCS12StoreParameter.getOutputStream(), password, pKCS12StoreParameter.isForDEREncoding());
    }

    @Override // org.bouncycastle.jce.interfaces.BCKeyStore
    public void setRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
    }

    public PrivateKey unwrapKey(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, char[] cArr, boolean z) {
        String m;
        Cipher createCipher;
        ASN1ObjectIdentifier algorithm = algorithmIdentifier.getAlgorithm();
        try {
        } catch (Exception e) {
            m = GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception unwrapping private key - "));
        }
        if (algorithm.on(PKCSObjectIdentifiers.pkcs_12PbeIds)) {
            PKCS12PBEParams pKCS12PBEParams = PKCS12PBEParams.getInstance(algorithmIdentifier.getParameters());
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), validateIterationCount(pKCS12PBEParams.getIterations()));
            createCipher = this.helper.createCipher(algorithm.getId());
            createCipher.init(4, new PKCS12Key(cArr, z), pBEParameterSpec);
        } else {
            if (!algorithm.equals((ASN1Primitive) PKCSObjectIdentifiers.id_PBES2)) {
                m = GetCert$$ExternalSyntheticOutline0.m("exception unwrapping private key - cannot recognise: ", algorithm);
                a$$ExternalSyntheticBUOutline0.m$4(m);
                return null;
            }
            createCipher = createCipher(4, cArr, algorithmIdentifier);
        }
        return (PrivateKey) createCipher.unwrap(bArr, "", 2);
    }

    public byte[] wrapKey(EncryptionScheme encryptionScheme, Key key, PBKDF2Params pBKDF2Params, char[] cArr) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr, pBKDF2Params.getSalt(), BigIntegers.intValueExact(pBKDF2Params.getIterationCount()), BigIntegers.intValueExact(pBKDF2Params.getKeyLength()) * 8);
        try {
            SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory("PBKDF2withHMacSHA256");
            Cipher createCipher = this.helper.createCipher(encryptionScheme.getAlgorithm().getId());
            AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(encryptionScheme.getAlgorithm().getId());
            algorithmParameters.init(encryptionScheme.getParameters().toASN1Primitive().getEncoded());
            createCipher.init(3, createSecretKeyFactory.generateSecret(pBEKeySpec), algorithmParameters);
            return createCipher.wrap(key);
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception encrypting data - ")));
            return null;
        }
    }

    public class CertId {
        byte[] id;

        public CertId(PublicKey publicKey) {
            this.id = PKCS12KeyStoreSpi.this.createSubjectKeyId(publicKey).getKeyIdentifier();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CertId) {
                return Arrays.areEqual(this.id, ((CertId) obj).id);
            }
            return false;
        }

        public int hashCode() {
            return Arrays.hashCode(this.id);
        }

        public CertId(byte[] bArr) {
            this.id = bArr;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new RuntimeException("operation not supported");
    }

    public byte[] wrapKey(String str, Key key, PKCS12PBEParams pKCS12PBEParams, char[] cArr) {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(cArr);
        try {
            SecretKeyFactory createSecretKeyFactory = this.helper.createSecretKeyFactory(str);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(pKCS12PBEParams.getIV(), BigIntegers.intValueExact(pKCS12PBEParams.getIterations()));
            Cipher createCipher = this.helper.createCipher(str);
            createCipher.init(3, createSecretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return createCipher.wrap(key);
        } catch (Exception e) {
            a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception encrypting data - ")));
            return null;
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) {
        doStore(outputStream, cArr, false);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
        if (loadStoreParameter == null) {
            engineLoad(null, null);
        } else if (loadStoreParameter instanceof BCLoadStoreParameter) {
            engineLoad(((BCLoadStoreParameter) loadStoreParameter).getInputStream(), ParameterUtil.extractPassword(loadStoreParameter));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("no support for 'param' of type ".concat(loadStoreParameter.getClass().getName()));
        }
    }
}
