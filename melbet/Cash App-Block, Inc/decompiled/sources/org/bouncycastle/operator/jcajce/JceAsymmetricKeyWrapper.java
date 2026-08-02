package org.bouncycastle.operator.jcajce;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.ProviderException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.security.interfaces.ECPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.SecretKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import javax.crypto.spec.SecretKeySpec;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.DERNull;
import org.bouncycastle.asn1.DEROctetString;
import org.bouncycastle.asn1.cryptopro.CryptoProObjectIdentifiers;
import org.bouncycastle.asn1.cryptopro.Gost2814789EncryptedKey;
import org.bouncycastle.asn1.cryptopro.GostR3410KeyTransport;
import org.bouncycastle.asn1.cryptopro.GostR3410TransportParameters;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.RSAESOAEPparams;
import org.bouncycastle.asn1.rosstandart.RosstandartObjectIdentifiers;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.GOST28147WrapParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.operator.AsymmetricKeyWrapper;
import org.bouncycastle.operator.GenericKey;
import org.bouncycastle.operator.OperatorException;
import org.bouncycastle.pqc.crypto.sphincs.SPHINCSKeyParameters;
import org.bouncycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class JceAsymmetricKeyWrapper extends AsymmetricKeyWrapper {
    private static final Map digests;
    private static final Set gostAlgs;
    private Map extraMappings;
    private OperatorHelper helper;
    private PublicKey publicKey;
    private SecureRandom random;

    static {
        HashSet hashSet = new HashSet();
        gostAlgs = hashSet;
        hashSet.add(CryptoProObjectIdentifiers.gostR3410_2001_CryptoPro_ESDH);
        hashSet.add(CryptoProObjectIdentifiers.gostR3410_2001);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_256);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_agreement_gost_3410_12_512);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_256);
        hashSet.add(RosstandartObjectIdentifiers.id_tc26_gost_3410_12_512);
        HashMap hashMap = new HashMap();
        digests = hashMap;
        ASN1ObjectIdentifier aSN1ObjectIdentifier = OIWObjectIdentifiers.idSHA1;
        DERNull dERNull = DERNull.INSTANCE;
        hashMap.put("SHA1", new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA1, new AlgorithmIdentifier(aSN1ObjectIdentifier, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha224;
        hashMap.put("SHA224", new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA224, new AlgorithmIdentifier(aSN1ObjectIdentifier2, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_sha256;
        hashMap.put("SHA256", new AlgorithmIdentifier(aSN1ObjectIdentifier3, dERNull));
        hashMap.put("SHA-256", new AlgorithmIdentifier(aSN1ObjectIdentifier3, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_sha384;
        hashMap.put("SHA384", new AlgorithmIdentifier(aSN1ObjectIdentifier4, dERNull));
        hashMap.put(McElieceCCA2KeyGenParameterSpec.SHA384, new AlgorithmIdentifier(aSN1ObjectIdentifier4, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier5 = NISTObjectIdentifiers.id_sha512;
        hashMap.put("SHA512", new AlgorithmIdentifier(aSN1ObjectIdentifier5, dERNull));
        hashMap.put("SHA-512", new AlgorithmIdentifier(aSN1ObjectIdentifier5, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier6 = NISTObjectIdentifiers.id_sha512_224;
        hashMap.put("SHA512/224", new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        hashMap.put("SHA-512/224", new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        hashMap.put("SHA-512(224)", new AlgorithmIdentifier(aSN1ObjectIdentifier6, dERNull));
        ASN1ObjectIdentifier aSN1ObjectIdentifier7 = NISTObjectIdentifiers.id_sha512_256;
        hashMap.put("SHA512/256", new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
        hashMap.put(SPHINCSKeyParameters.SHA512_256, new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
        hashMap.put("SHA-512(256)", new AlgorithmIdentifier(aSN1ObjectIdentifier7, dERNull));
    }

    public JceAsymmetricKeyWrapper(PublicKey publicKey) {
        super(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()).getAlgorithm());
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    private static AlgorithmIdentifier extractAlgID(PublicKey publicKey, AlgorithmParameterSpec algorithmParameterSpec) {
        if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
            a$$ExternalSyntheticBUOutline0.m$3("unknown spec: ".concat(algorithmParameterSpec.getClass().getName()));
            return null;
        }
        OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec) algorithmParameterSpec;
        if (!oAEPParameterSpec.getMGFAlgorithm().equals(OAEPParameterSpec.DEFAULT.getMGFAlgorithm())) {
            Path$$ExternalSyntheticBUOutline0.m(oAEPParameterSpec.getMGFAlgorithm(), "unknown MGF: ");
            return null;
        }
        if (oAEPParameterSpec.getPSource() instanceof PSource.PSpecified) {
            return new AlgorithmIdentifier(PKCSObjectIdentifiers.id_RSAES_OAEP, new RSAESOAEPparams(getDigest(oAEPParameterSpec.getDigestAlgorithm()), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_mgf1, getDigest(((MGF1ParameterSpec) oAEPParameterSpec.getMGFParameters()).getDigestAlgorithm())), new AlgorithmIdentifier(PKCSObjectIdentifiers.id_pSpecified, new DEROctetString(((PSource.PSpecified) oAEPParameterSpec.getPSource()).getValue()))));
        }
        Path$$ExternalSyntheticBUOutline0.m(oAEPParameterSpec.getPSource().getAlgorithm(), "unknown PSource: ");
        return null;
    }

    private static AlgorithmIdentifier getDigest(String str) {
        AlgorithmIdentifier algorithmIdentifier = (AlgorithmIdentifier) digests.get(str);
        if (algorithmIdentifier != null) {
            return algorithmIdentifier;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("unknown digest name: ", str));
        return null;
    }

    public static boolean isGOST(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return gostAlgs.contains(aSN1ObjectIdentifier);
    }

    @Override // org.bouncycastle.operator.KeyWrapper
    public byte[] generateWrappedKey(GenericKey genericKey) {
        AlgorithmParameters algorithmParameters;
        if (isGOST(getAlgorithmIdentifier().getAlgorithm())) {
            try {
                this.random = CryptoServicesRegistrar.getSecureRandom(this.random);
                KeyPairGenerator createKeyPairGenerator = this.helper.createKeyPairGenerator(getAlgorithmIdentifier().getAlgorithm());
                createKeyPairGenerator.initialize(((ECPublicKey) this.publicKey).getParams(), this.random);
                KeyPair generateKeyPair = createKeyPairGenerator.generateKeyPair();
                byte[] bArr = new byte[8];
                this.random.nextBytes(bArr);
                SubjectPublicKeyInfo subjectPublicKeyInfo = SubjectPublicKeyInfo.getInstance(generateKeyPair.getPublic().getEncoded());
                GostR3410TransportParameters gostR3410TransportParameters = subjectPublicKeyInfo.getAlgorithm().getAlgorithm().on(RosstandartObjectIdentifiers.id_tc26) ? new GostR3410TransportParameters(RosstandartObjectIdentifiers.id_tc26_gost_28147_param_Z, subjectPublicKeyInfo, bArr) : new GostR3410TransportParameters(CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_A_ParamSet, subjectPublicKeyInfo, bArr);
                KeyAgreement createKeyAgreement = this.helper.createKeyAgreement(getAlgorithmIdentifier().getAlgorithm());
                createKeyAgreement.init(generateKeyPair.getPrivate(), new UserKeyingMaterialSpec(gostR3410TransportParameters.getUkm()));
                createKeyAgreement.doPhase(this.publicKey, true);
                ASN1ObjectIdentifier aSN1ObjectIdentifier = CryptoProObjectIdentifiers.id_Gost28147_89_CryptoPro_KeyWrap;
                SecretKey generateSecret = createKeyAgreement.generateSecret(aSN1ObjectIdentifier.getId());
                byte[] encoded = OperatorUtils.getJceKey(genericKey).getEncoded();
                Cipher createCipher = this.helper.createCipher(aSN1ObjectIdentifier);
                createCipher.init(3, generateSecret, new GOST28147WrapParameterSpec(gostR3410TransportParameters.getEncryptionParamSet(), gostR3410TransportParameters.getUkm()));
                byte[] wrap = createCipher.wrap(new SecretKeySpec(encoded, "GOST"));
                return new GostR3410KeyTransport(new Gost2814789EncryptedKey(Arrays.copyOfRange(wrap, 0, 32), Arrays.copyOfRange(wrap, 32, 36)), gostR3410TransportParameters).getEncoded();
            } catch (Exception e) {
                throw new OperatorException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("exception wrapping key: ")), e);
            }
        }
        Cipher createAsymmetricWrapper = this.helper.createAsymmetricWrapper(getAlgorithmIdentifier().getAlgorithm(), this.extraMappings);
        byte[] bArr2 = null;
        try {
            algorithmParameters = !getAlgorithmIdentifier().getAlgorithm().equals((ASN1Primitive) OIWObjectIdentifiers.elGamalAlgorithm) ? this.helper.createAlgorithmParameters(getAlgorithmIdentifier()) : null;
            PublicKey publicKey = this.publicKey;
            try {
                if (algorithmParameters != null) {
                    createAsymmetricWrapper.init(3, publicKey, algorithmParameters, this.random);
                } else {
                    createAsymmetricWrapper.init(3, publicKey, this.random);
                }
                bArr2 = createAsymmetricWrapper.wrap(OperatorUtils.getJceKey(genericKey));
            } catch (IllegalStateException | UnsupportedOperationException | InvalidKeyException | GeneralSecurityException | ProviderException unused) {
            }
        } catch (IllegalStateException | UnsupportedOperationException | InvalidKeyException | GeneralSecurityException | ProviderException unused2) {
            algorithmParameters = null;
        }
        if (bArr2 != null) {
            return bArr2;
        }
        PublicKey publicKey2 = this.publicKey;
        try {
            if (algorithmParameters != null) {
                createAsymmetricWrapper.init(1, publicKey2, algorithmParameters, this.random);
            } else {
                createAsymmetricWrapper.init(1, publicKey2, this.random);
            }
            return createAsymmetricWrapper.doFinal(OperatorUtils.getJceKey(genericKey).getEncoded());
        } catch (InvalidKeyException e2) {
            throw new OperatorException("unable to encrypt contents key", e2);
        } catch (GeneralSecurityException e3) {
            throw new OperatorException("unable to encrypt contents key", e3);
        }
    }

    public JceAsymmetricKeyWrapper setAlgorithmMapping(ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        this.extraMappings.put(aSN1ObjectIdentifier, str);
        return this;
    }

    public JceAsymmetricKeyWrapper setProvider(String str) {
        this.helper = new OperatorHelper(new NamedJcaJceHelper(str));
        return this;
    }

    public JceAsymmetricKeyWrapper setSecureRandom(SecureRandom secureRandom) {
        this.random = secureRandom;
        return this;
    }

    public JceAsymmetricKeyWrapper setProvider(Provider provider) {
        this.helper = new OperatorHelper(new ProviderJcaJceHelper(provider));
        return this;
    }

    public JceAsymmetricKeyWrapper(AlgorithmParameters algorithmParameters, PublicKey publicKey) {
        super(extractAlgID(publicKey, algorithmParameters.getParameterSpec(AlgorithmParameterSpec.class)));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    public JceAsymmetricKeyWrapper(X509Certificate x509Certificate) {
        this(x509Certificate.getPublicKey());
    }

    public JceAsymmetricKeyWrapper(AlgorithmParameterSpec algorithmParameterSpec, PublicKey publicKey) {
        super(extractAlgID(publicKey, algorithmParameterSpec));
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }

    public JceAsymmetricKeyWrapper(AlgorithmIdentifier algorithmIdentifier, PublicKey publicKey) {
        super(algorithmIdentifier);
        this.helper = new OperatorHelper(new DefaultJcaJceHelper());
        this.extraMappings = new HashMap();
        this.publicKey = publicKey;
    }
}
