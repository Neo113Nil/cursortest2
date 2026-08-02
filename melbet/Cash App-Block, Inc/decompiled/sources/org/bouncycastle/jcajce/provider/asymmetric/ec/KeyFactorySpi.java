package org.bouncycastle.jcajce.provider.asymmetric.ec;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.asn1.pkcs.PrivateKeyInfo;
import org.bouncycastle.asn1.sec.ECPrivateKey;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.asn1.x9.X9ObjectIdentifiers;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.util.OpenSSHPublicKeyUtil;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.jcajce.provider.config.ProviderConfiguration;
import org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter;
import org.bouncycastle.jcajce.spec.OpenSSHPrivateKeySpec;
import org.bouncycastle.jcajce.spec.OpenSSHPublicKeySpec;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;

/* loaded from: classes9.dex */
public class KeyFactorySpi extends BaseKeyFactorySpi implements AsymmetricKeyInfoConverter {
    String algorithm;
    ProviderConfiguration configuration;

    public static class EC extends KeyFactorySpi {
        public EC() {
            super("EC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDH extends KeyFactorySpi {
        public ECDH() {
            super("ECDH", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDHC extends KeyFactorySpi {
        public ECDHC() {
            super("ECDHC", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECDSA extends KeyFactorySpi {
        public ECDSA() {
            super("ECDSA", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410 extends KeyFactorySpi {
        public ECGOST3410() {
            super("ECGOST3410", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECGOST3410_2012 extends KeyFactorySpi {
        public ECGOST3410_2012() {
            super("ECGOST3410-2012", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public static class ECMQV extends KeyFactorySpi {
        public ECMQV() {
            super("ECMQV", BouncyCastleProvider.CONFIGURATION);
        }
    }

    public KeyFactorySpi(String str, ProviderConfiguration providerConfiguration) {
        this.algorithm = str;
        this.configuration = providerConfiguration;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PrivateKey engineGeneratePrivate(KeySpec keySpec) {
        if (keySpec instanceof ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (keySpec instanceof java.security.spec.ECPrivateKeySpec) {
            return new BCECPrivateKey(this.algorithm, (java.security.spec.ECPrivateKeySpec) keySpec, this.configuration);
        }
        if (!(keySpec instanceof OpenSSHPrivateKeySpec)) {
            return super.engineGeneratePrivate(keySpec);
        }
        ECPrivateKey eCPrivateKey = ECPrivateKey.getInstance(((OpenSSHPrivateKeySpec) keySpec).getEncoded());
        try {
            return new BCECPrivateKey(this.algorithm, new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, eCPrivateKey.getParametersObject()), eCPrivateKey), this.configuration);
        } catch (IOException e) {
            throw new InvalidKeySpecException(SVG$Unit$EnumUnboxingLocalUtility.m(e, new StringBuilder("bad encoding: ")));
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public PublicKey engineGeneratePublic(KeySpec keySpec) {
        try {
            if (keySpec instanceof ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (ECPublicKeySpec) keySpec, this.configuration);
            }
            if (keySpec instanceof java.security.spec.ECPublicKeySpec) {
                return new BCECPublicKey(this.algorithm, (java.security.spec.ECPublicKeySpec) keySpec, this.configuration);
            }
            if (!(keySpec instanceof OpenSSHPublicKeySpec)) {
                return super.engineGeneratePublic(keySpec);
            }
            AsymmetricKeyParameter parsePublicKey = OpenSSHPublicKeyUtil.parsePublicKey(((OpenSSHPublicKeySpec) keySpec).getEncoded());
            if (!(parsePublicKey instanceof ECPublicKeyParameters)) {
                throw new IllegalArgumentException("openssh key is not ec public key");
            }
            ECDomainParameters parameters = ((ECPublicKeyParameters) parsePublicKey).getParameters();
            return engineGeneratePublic(new ECPublicKeySpec(((ECPublicKeyParameters) parsePublicKey).getQ(), new ECParameterSpec(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed())));
        } catch (Exception e) {
            throw new InvalidKeySpecException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("invalid KeySpec: ")), e);
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseKeyFactorySpi, java.security.KeyFactorySpi
    public KeySpec engineGetKeySpec(Key key, Class cls) {
        IOException iOException;
        StringBuilder sb;
        String concat;
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPublicKeySpec.class)) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey = (ECPublicKey) key;
            if (eCPublicKey.getParams() != null) {
                return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), eCPublicKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPublicKeySpec(eCPublicKey.getW(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa.getCurve(), ecImplicitlyCa.getSeed()), ecImplicitlyCa));
        }
        if ((cls.isAssignableFrom(KeySpec.class) || cls.isAssignableFrom(java.security.spec.ECPrivateKeySpec.class)) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey.getParams() != null) {
                return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), eCPrivateKey.getParams());
            }
            ECParameterSpec ecImplicitlyCa2 = BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa();
            return new java.security.spec.ECPrivateKeySpec(eCPrivateKey.getS(), EC5Util.convertSpec(EC5Util.convertCurve(ecImplicitlyCa2.getCurve(), ecImplicitlyCa2.getSeed()), ecImplicitlyCa2));
        }
        if (cls.isAssignableFrom(ECPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            ECPublicKey eCPublicKey2 = (ECPublicKey) key;
            if (eCPublicKey2.getParams() != null) {
                return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), EC5Util.convertSpec(eCPublicKey2.getParams()));
            }
            return new ECPublicKeySpec(EC5Util.convertPoint(eCPublicKey2.getParams(), eCPublicKey2.getW()), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(ECPrivateKeySpec.class) && (key instanceof java.security.interfaces.ECPrivateKey)) {
            java.security.interfaces.ECPrivateKey eCPrivateKey2 = (java.security.interfaces.ECPrivateKey) key;
            if (eCPrivateKey2.getParams() != null) {
                return new ECPrivateKeySpec(eCPrivateKey2.getS(), EC5Util.convertSpec(eCPrivateKey2.getParams()));
            }
            return new ECPrivateKeySpec(eCPrivateKey2.getS(), BouncyCastleProvider.CONFIGURATION.getEcImplicitlyCa());
        }
        if (cls.isAssignableFrom(OpenSSHPublicKeySpec.class) && (key instanceof ECPublicKey)) {
            if (key instanceof BCECPublicKey) {
                BCECPublicKey bCECPublicKey = (BCECPublicKey) key;
                ECParameterSpec parameters = bCECPublicKey.getParameters();
                try {
                    return new OpenSSHPublicKeySpec(OpenSSHPublicKeyUtil.encodePublicKey(new ECPublicKeyParameters(bCECPublicKey.getQ(), new ECDomainParameters(parameters.getCurve(), parameters.getG(), parameters.getN(), parameters.getH(), parameters.getSeed()))));
                } catch (IOException e) {
                    iOException = e;
                    sb = new StringBuilder("unable to produce encoding: ");
                    concat = SVG$Unit$EnumUnboxingLocalUtility.m(iOException, sb);
                    a$$ExternalSyntheticBUOutline0.m$3(concat);
                    return null;
                }
            }
        } else {
            if (!cls.isAssignableFrom(OpenSSHPrivateKeySpec.class) || !(key instanceof java.security.interfaces.ECPrivateKey)) {
                return super.engineGetKeySpec(key, cls);
            }
            if (key instanceof BCECPrivateKey) {
                try {
                    return new OpenSSHPrivateKeySpec(PrivateKeyInfo.getInstance(key.getEncoded()).parsePrivateKey().toASN1Primitive().getEncoded());
                } catch (IOException e2) {
                    iOException = e2;
                    sb = new StringBuilder("cannot encoded key: ");
                    concat = SVG$Unit$EnumUnboxingLocalUtility.m(iOException, sb);
                    a$$ExternalSyntheticBUOutline0.m$3(concat);
                    return null;
                }
            }
        }
        concat = "invalid key type: ".concat(key.getClass().getName());
        a$$ExternalSyntheticBUOutline0.m$3(concat);
        return null;
    }

    @Override // java.security.KeyFactorySpi
    public Key engineTranslateKey(Key key) {
        if (key instanceof ECPublicKey) {
            return new BCECPublicKey((ECPublicKey) key, this.configuration);
        }
        if (key instanceof java.security.interfaces.ECPrivateKey) {
            return new BCECPrivateKey((java.security.interfaces.ECPrivateKey) key, this.configuration);
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("key type unknown");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PrivateKey generatePrivate(PrivateKeyInfo privateKeyInfo) {
        ASN1ObjectIdentifier algorithm = privateKeyInfo.getPrivateKeyAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPrivateKey(this.algorithm, privateKeyInfo, this.configuration);
        }
        a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m("algorithm identifier ", algorithm, " in key not recognised"));
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.util.AsymmetricKeyInfoConverter
    public PublicKey generatePublic(SubjectPublicKeyInfo subjectPublicKeyInfo) {
        ASN1ObjectIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm().getAlgorithm();
        if (algorithm.equals((ASN1Primitive) X9ObjectIdentifiers.id_ecPublicKey)) {
            return new BCECPublicKey(this.algorithm, subjectPublicKeyInfo, this.configuration);
        }
        a$$ExternalSyntheticBUOutline0.m$4(GetCert$$ExternalSyntheticOutline0.m("algorithm identifier ", algorithm, " in key not recognised"));
        return null;
    }
}
