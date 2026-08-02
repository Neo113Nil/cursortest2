package org.bouncycastle.jcajce.provider.asymmetric.dh;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.math.BigInteger;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.SecretKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.agreement.DHUnifiedAgreement;
import org.bouncycastle.crypto.agreement.MQVBasicAgreement;
import org.bouncycastle.crypto.agreement.kdf.ConcatenationKDFGenerator;
import org.bouncycastle.crypto.agreement.kdf.DHKEKGenerator;
import org.bouncycastle.crypto.generators.KDF2BytesGenerator;
import org.bouncycastle.crypto.params.DHMQVPrivateParameters;
import org.bouncycastle.crypto.params.DHMQVPublicParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;
import org.bouncycastle.crypto.params.DHUPrivateParameters;
import org.bouncycastle.crypto.params.DHUPublicParameters;
import org.bouncycastle.crypto.util.DigestFactory;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi;
import org.bouncycastle.jcajce.spec.DHDomainParameterSpec;
import org.bouncycastle.jcajce.spec.DHUParameterSpec;
import org.bouncycastle.jcajce.spec.MQVParameterSpec;
import org.bouncycastle.jcajce.spec.UserKeyingMaterialSpec;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class KeyAgreementSpi extends BaseAgreementSpi {
    private static final BigInteger ONE = BigInteger.valueOf(1);
    private static final BigInteger TWO = BigInteger.valueOf(2);
    private DHUParameterSpec dheParameters;
    private BigInteger g;
    private final BasicAgreement mqvAgreement;
    private MQVParameterSpec mqvParameters;
    private BigInteger p;
    private byte[] result;
    private final DHUnifiedAgreement unifiedAgreement;
    private BigInteger x;

    public static class DHUwithSHA1CKDF extends KeyAgreementSpi {
        public DHUwithSHA1CKDF() {
            super("DHUwithSHA1CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA1KDF extends KeyAgreementSpi {
        public DHUwithSHA1KDF() {
            super("DHUwithSHA1KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHUwithSHA224CKDF extends KeyAgreementSpi {
        public DHUwithSHA224CKDF() {
            super("DHUwithSHA224CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA224KDF extends KeyAgreementSpi {
        public DHUwithSHA224KDF() {
            super("DHUwithSHA224KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHUwithSHA256CKDF extends KeyAgreementSpi {
        public DHUwithSHA256CKDF() {
            super("DHUwithSHA256CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA256KDF extends KeyAgreementSpi {
        public DHUwithSHA256KDF() {
            super("DHUwithSHA256KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHUwithSHA384CKDF extends KeyAgreementSpi {
        public DHUwithSHA384CKDF() {
            super("DHUwithSHA384CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA384KDF extends KeyAgreementSpi {
        public DHUwithSHA384KDF() {
            super("DHUwithSHA384KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHUwithSHA512CKDF extends KeyAgreementSpi {
        public DHUwithSHA512CKDF() {
            super("DHUwithSHA512CKDF", new DHUnifiedAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHUwithSHA512KDF extends KeyAgreementSpi {
        public DHUwithSHA512KDF() {
            super("DHUwithSHA512KDF", new DHUnifiedAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithRFC2631KDF extends KeyAgreementSpi {
        public DHwithRFC2631KDF() {
            super("DHwithRFC2631KDF", new DHKEKGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1CKDF extends KeyAgreementSpi {
        public DHwithSHA1CKDF() {
            super("DHwithSHA1CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA1KDF extends KeyAgreementSpi {
        public DHwithSHA1KDF() {
            super("DHwithSHA1CKDF", new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class DHwithSHA224CKDF extends KeyAgreementSpi {
        public DHwithSHA224CKDF() {
            super("DHwithSHA224CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA224KDF extends KeyAgreementSpi {
        public DHwithSHA224KDF() {
            super("DHwithSHA224CKDF", new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class DHwithSHA256CKDF extends KeyAgreementSpi {
        public DHwithSHA256CKDF() {
            super("DHwithSHA256CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA256KDF extends KeyAgreementSpi {
        public DHwithSHA256KDF() {
            super("DHwithSHA256CKDF", new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class DHwithSHA384CKDF extends KeyAgreementSpi {
        public DHwithSHA384CKDF() {
            super("DHwithSHA384CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA384KDF extends KeyAgreementSpi {
        public DHwithSHA384KDF() {
            super("DHwithSHA384KDF", new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class DHwithSHA512CKDF extends KeyAgreementSpi {
        public DHwithSHA512CKDF() {
            super("DHwithSHA512CKDF", new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class DHwithSHA512KDF extends KeyAgreementSpi {
        public DHwithSHA512KDF() {
            super("DHwithSHA512KDF", new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA1CKDF extends KeyAgreementSpi {
        public MQVwithSHA1CKDF() {
            super("MQVwithSHA1CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA1KDF extends KeyAgreementSpi {
        public MQVwithSHA1KDF() {
            super("MQVwithSHA1KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA1()));
        }
    }

    public static class MQVwithSHA224CKDF extends KeyAgreementSpi {
        public MQVwithSHA224CKDF() {
            super("MQVwithSHA224CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA224KDF extends KeyAgreementSpi {
        public MQVwithSHA224KDF() {
            super("MQVwithSHA224KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA224()));
        }
    }

    public static class MQVwithSHA256CKDF extends KeyAgreementSpi {
        public MQVwithSHA256CKDF() {
            super("MQVwithSHA256CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA256KDF extends KeyAgreementSpi {
        public MQVwithSHA256KDF() {
            super("MQVwithSHA256KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA256()));
        }
    }

    public static class MQVwithSHA384CKDF extends KeyAgreementSpi {
        public MQVwithSHA384CKDF() {
            super("MQVwithSHA384CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA384KDF extends KeyAgreementSpi {
        public MQVwithSHA384KDF() {
            super("MQVwithSHA384KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA384()));
        }
    }

    public static class MQVwithSHA512CKDF extends KeyAgreementSpi {
        public MQVwithSHA512CKDF() {
            super("MQVwithSHA512CKDF", new MQVBasicAgreement(), new ConcatenationKDFGenerator(DigestFactory.createSHA512()));
        }
    }

    public static class MQVwithSHA512KDF extends KeyAgreementSpi {
        public MQVwithSHA512KDF() {
            super("MQVwithSHA512KDF", new MQVBasicAgreement(), new KDF2BytesGenerator(DigestFactory.createSHA512()));
        }
    }

    public KeyAgreementSpi(String str, BasicAgreement basicAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.unifiedAgreement = null;
        this.mqvAgreement = basicAgreement;
    }

    private DHPrivateKeyParameters generatePrivateKeyParameter(PrivateKey privateKey) {
        if (!(privateKey instanceof DHPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("private key not a DHPrivateKey");
            return null;
        }
        if (privateKey instanceof BCDHPrivateKey) {
            return ((BCDHPrivateKey) privateKey).engineGetKeyParameters();
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        DHParameterSpec params = dHPrivateKey.getParams();
        return new DHPrivateKeyParameters(dHPrivateKey.getX(), new DHParameters(params.getP(), params.getG(), null, params.getL()));
    }

    private DHPublicKeyParameters generatePublicKeyParameter(PublicKey publicKey) {
        if (!(publicKey instanceof DHPublicKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("public key not a DHPublicKey");
            return null;
        }
        if (publicKey instanceof BCDHPublicKey) {
            return ((BCDHPublicKey) publicKey).engineGetKeyParameters();
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        DHParameterSpec params = dHPublicKey.getParams();
        return params instanceof DHDomainParameterSpec ? new DHPublicKeyParameters(dHPublicKey.getY(), ((DHDomainParameterSpec) params).getDomainParameters()) : new DHPublicKeyParameters(dHPublicKey.getY(), new DHParameters(params.getP(), params.getG(), null, params.getL()));
    }

    public byte[] bigIntToBytes(BigInteger bigInteger) {
        return BigIntegers.asUnsignedByteArray((this.p.bitLength() + 7) / 8, bigInteger);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public byte[] doCalcSecret() {
        return this.result;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi
    public void doInitFromKey(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(key instanceof DHPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("DHKeyAgreement requires DHPrivateKey for initialisation");
            return;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        if (algorithmParameterSpec == null) {
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
        } else if (algorithmParameterSpec instanceof DHParameterSpec) {
            DHParameterSpec dHParameterSpec = (DHParameterSpec) algorithmParameterSpec;
            this.p = dHParameterSpec.getP();
            this.g = dHParameterSpec.getG();
            this.dheParameters = null;
            this.ukmParameters = null;
        } else if (algorithmParameterSpec instanceof DHUParameterSpec) {
            if (this.unifiedAgreement == null) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("agreement algorithm not DHU based");
                return;
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            DHUParameterSpec dHUParameterSpec = (DHUParameterSpec) algorithmParameterSpec;
            this.dheParameters = dHUParameterSpec;
            this.ukmParameters = dHUParameterSpec.getUserKeyingMaterial();
            this.unifiedAgreement.init(this.dheParameters.getEphemeralPublicKey() != null ? new DHUPrivateParameters(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.getEphemeralPrivateKey()), generatePublicKeyParameter(this.dheParameters.getEphemeralPublicKey())) : new DHUPrivateParameters(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.dheParameters.getEphemeralPrivateKey())));
        } else if (algorithmParameterSpec instanceof MQVParameterSpec) {
            if (this.mqvAgreement == null) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("agreement algorithm not MQV based");
                return;
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            MQVParameterSpec mQVParameterSpec = (MQVParameterSpec) algorithmParameterSpec;
            this.mqvParameters = mQVParameterSpec;
            this.ukmParameters = mQVParameterSpec.getUserKeyingMaterial();
            this.mqvAgreement.init(this.mqvParameters.getEphemeralPublicKey() != null ? new DHMQVPrivateParameters(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.getEphemeralPrivateKey()), generatePublicKeyParameter(this.mqvParameters.getEphemeralPublicKey())) : new DHMQVPrivateParameters(generatePrivateKeyParameter(dHPrivateKey), generatePrivateKeyParameter(this.mqvParameters.getEphemeralPrivateKey())));
        } else if (!(algorithmParameterSpec instanceof UserKeyingMaterialSpec)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("DHKeyAgreement only accepts DHParameterSpec");
            return;
        } else {
            if (this.kdf == null) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$1("no KDF specified for UserKeyingMaterialSpec");
                return;
            }
            this.p = dHPrivateKey.getParams().getP();
            this.g = dHPrivateKey.getParams().getG();
            this.dheParameters = null;
            this.ukmParameters = ((UserKeyingMaterialSpec) algorithmParameterSpec).getUserKeyingMaterial();
        }
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    @Override // javax.crypto.KeyAgreementSpi
    public Key engineDoPhase(Key key, boolean z) {
        if (this.x == null) {
            a$$ExternalSyntheticBUOutline0.m$1("Diffie-Hellman not initialised.");
            return null;
        }
        if (!(key instanceof DHPublicKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("DHKeyAgreement doPhase requires DHPublicKey");
            return null;
        }
        DHPublicKey dHPublicKey = (DHPublicKey) key;
        if (!dHPublicKey.getParams().getG().equals(this.g) || !dHPublicKey.getParams().getP().equals(this.p)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("DHPublicKey not for this KeyAgreement!");
            return null;
        }
        BigInteger y = dHPublicKey.getY();
        if (y != null && y.compareTo(TWO) >= 0) {
            BigInteger bigInteger = this.p;
            BigInteger bigInteger2 = ONE;
            if (y.compareTo(bigInteger.subtract(bigInteger2)) < 0) {
                if (this.unifiedAgreement != null) {
                    if (!z) {
                        a$$ExternalSyntheticBUOutline0.m$1("unified Diffie-Hellman can use only two key pairs");
                        return null;
                    }
                    this.result = this.unifiedAgreement.calculateAgreement(new DHUPublicParameters(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.dheParameters.getOtherPartyEphemeralKey())));
                    return null;
                }
                if (this.mqvAgreement != null) {
                    if (!z) {
                        a$$ExternalSyntheticBUOutline0.m$1("MQV Diffie-Hellman can use only two key pairs");
                        return null;
                    }
                    this.result = bigIntToBytes(this.mqvAgreement.calculateAgreement(new DHMQVPublicParameters(generatePublicKeyParameter((PublicKey) key), generatePublicKeyParameter(this.mqvParameters.getOtherPartyEphemeralKey()))));
                    return null;
                }
                BigInteger modPow = y.modPow(this.x, this.p);
                if (modPow.compareTo(bigInteger2) == 0) {
                    AesGcmSiv$$ExternalSyntheticLambda0.m$2("Shared key can't be 1");
                    return null;
                }
                this.result = bigIntToBytes(modPow);
                if (z) {
                    return null;
                }
                return new BCDHPublicKey(modPow, dHPublicKey.getParams());
            }
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Invalid DH PublicKey");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public SecretKey engineGenerateSecret(String str) {
        if (this.x != null) {
            return str.equals("TlsPremasterSecret") ? new SecretKeySpec(BaseAgreementSpi.trimZeroes(this.result), str) : super.engineGenerateSecret(str);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Diffie-Hellman not initialised.");
        return null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public void engineInit(Key key, SecureRandom secureRandom) {
        if (!(key instanceof DHPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("DHKeyAgreement requires DHPrivateKey");
            return;
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) key;
        this.p = dHPrivateKey.getParams().getP();
        this.g = dHPrivateKey.getParams().getG();
        BigInteger x = dHPrivateKey.getX();
        this.x = x;
        this.result = bigIntToBytes(x);
    }

    public KeyAgreementSpi() {
        this("Diffie-Hellman", null);
    }

    public KeyAgreementSpi(String str, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.unifiedAgreement = null;
        this.mqvAgreement = null;
    }

    public KeyAgreementSpi(String str, DHUnifiedAgreement dHUnifiedAgreement, DerivationFunction derivationFunction) {
        super(str, derivationFunction);
        this.unifiedAgreement = dHUnifiedAgreement;
        this.mqvAgreement = null;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public int engineGenerateSecret(byte[] bArr, int i) {
        if (this.x != null) {
            return super.engineGenerateSecret(bArr, i);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Diffie-Hellman not initialised.");
        return 0;
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseAgreementSpi, javax.crypto.KeyAgreementSpi
    public byte[] engineGenerateSecret() {
        if (this.x != null) {
            return super.engineGenerateSecret();
        }
        a$$ExternalSyntheticBUOutline0.m$1("Diffie-Hellman not initialised.");
        return null;
    }
}
