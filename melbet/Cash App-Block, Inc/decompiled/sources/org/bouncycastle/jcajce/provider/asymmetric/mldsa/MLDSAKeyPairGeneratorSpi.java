package org.bouncycastle.jcajce.provider.asymmetric.mldsa;

import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.jcajce.spec.MLDSAParameterSpec;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.mldsa.MLDSAPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.util.Strings;

/* loaded from: classes9.dex */
public class MLDSAKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    MLDSAKeyPairGenerator engine;
    boolean initialised;
    private final MLDSAParameters mldsaParameters;
    MLDSAKeyGenerationParameters param;
    SecureRandom random;

    public static class Hash extends MLDSAKeyPairGeneratorSpi {
        public Hash() {
            super("HASH-ML-DSA");
        }
    }

    public static class MLDSA44 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44() {
            super(MLDSAParameterSpec.ml_dsa_44);
        }
    }

    public static class MLDSA44withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA44withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_44_with_sha512);
        }
    }

    public static class MLDSA65 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65() {
            super(MLDSAParameterSpec.ml_dsa_65);
        }
    }

    public static class MLDSA65withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA65withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_65_with_sha512);
        }
    }

    public static class MLDSA87 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87() {
            super(MLDSAParameterSpec.ml_dsa_87);
        }
    }

    public static class MLDSA87withSHA512 extends MLDSAKeyPairGeneratorSpi {
        public MLDSA87withSHA512() {
            super(MLDSAParameterSpec.ml_dsa_87_with_sha512);
        }
    }

    public static class Pure extends MLDSAKeyPairGeneratorSpi {
        public Pure() {
            super("ML-DSA");
        }
    }

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        hashMap.put(MLDSAParameterSpec.ml_dsa_44.getName(), MLDSAParameters.ml_dsa_44);
        parameters.put(MLDSAParameterSpec.ml_dsa_65.getName(), MLDSAParameters.ml_dsa_65);
        parameters.put(MLDSAParameterSpec.ml_dsa_87.getName(), MLDSAParameters.ml_dsa_87);
        parameters.put(MLDSAParameterSpec.ml_dsa_44_with_sha512.getName(), MLDSAParameters.ml_dsa_44_with_sha512);
        parameters.put(MLDSAParameterSpec.ml_dsa_65_with_sha512.getName(), MLDSAParameters.ml_dsa_65_with_sha512);
        parameters.put(MLDSAParameterSpec.ml_dsa_87_with_sha512.getName(), MLDSAParameters.ml_dsa_87_with_sha512);
    }

    public MLDSAKeyPairGeneratorSpi(MLDSAParameterSpec mLDSAParameterSpec) {
        super(Strings.toUpperCase(mLDSAParameterSpec.getName()));
        this.engine = new MLDSAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        MLDSAParameters mLDSAParameters = (MLDSAParameters) parameters.get(mLDSAParameterSpec.getName());
        this.mldsaParameters = mLDSAParameters;
        if (this.param == null) {
            this.param = new MLDSAKeyGenerationParameters(this.random, mLDSAParameters);
        }
        this.engine.init(this.param);
        this.initialised = true;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof MLDSAParameterSpec ? ((MLDSAParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            boolean startsWith = getAlgorithm().startsWith("HASH");
            SecureRandom secureRandom = this.random;
            this.param = startsWith ? new MLDSAKeyGenerationParameters(secureRandom, MLDSAParameters.ml_dsa_87_with_sha512) : new MLDSAKeyGenerationParameters(secureRandom, MLDSAParameters.ml_dsa_87);
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCMLDSAPublicKey((MLDSAPublicKeyParameters) generateKeyPair.getPublic()), new BCMLDSAPrivateKey((MLDSAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null || !parameters.containsKey(nameFromParams)) {
            throw new InvalidAlgorithmParameterException(GetCert$$ExternalSyntheticOutline0.m("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        MLDSAParameters mLDSAParameters = (MLDSAParameters) parameters.get(nameFromParams);
        this.param = new MLDSAKeyGenerationParameters(secureRandom, (MLDSAParameters) parameters.get(nameFromParams));
        if (this.mldsaParameters == null || mLDSAParameters.getName().equals(this.mldsaParameters.getName())) {
            this.engine.init(this.param);
            this.initialised = true;
        } else {
            throw new InvalidAlgorithmParameterException("key pair generator locked to " + MLDSAParameterSpec.fromName(this.mldsaParameters.getName()).getName());
        }
    }

    public MLDSAKeyPairGeneratorSpi(String str) {
        super(str);
        this.engine = new MLDSAKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
        this.mldsaParameters = null;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
