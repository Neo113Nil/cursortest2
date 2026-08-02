package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAKeyPairGenerator;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAKeyGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.crypto.params.DSAPrivateKeyParameters;
import org.bouncycastle.crypto.params.DSAPublicKeyParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Integers;
import org.bouncycastle.util.Properties;

/* loaded from: classes9.dex */
public class KeyPairGeneratorSpi extends KeyPairGenerator {
    DSAKeyPairGenerator engine;
    boolean initialised;
    DSAKeyGenerationParameters param;
    SecureRandom random;
    int strength;
    private static Hashtable params = new Hashtable();
    private static Object lock = new Object();

    public KeyPairGeneratorSpi() {
        super("DSA");
        this.engine = new DSAKeyPairGenerator();
        this.strength = 2048;
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        DSAParametersGenerator dSAParametersGenerator;
        int i;
        if (!this.initialised) {
            Integer valueOf = Integers.valueOf(this.strength);
            if (params.containsKey(valueOf)) {
                this.param = (DSAKeyGenerationParameters) params.get(valueOf);
            } else {
                synchronized (lock) {
                    try {
                        if (params.containsKey(valueOf)) {
                            this.param = (DSAKeyGenerationParameters) params.get(valueOf);
                        } else {
                            int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
                            int i2 = this.strength;
                            if (i2 == 1024) {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                if (Properties.isOverrideSet("org.bouncycastle.dsa.FIPS186-2for1024bits")) {
                                    i = this.strength;
                                    dSAParametersGenerator.init(i, defaultCertainty, this.random);
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters;
                                    params.put(valueOf, dSAKeyGenerationParameters);
                                } else {
                                    dSAParametersGenerator.init(new DSAParameterGenerationParameters(1024, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, defaultCertainty, this.random));
                                    DSAKeyGenerationParameters dSAKeyGenerationParameters2 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                    this.param = dSAKeyGenerationParameters2;
                                    params.put(valueOf, dSAKeyGenerationParameters2);
                                }
                            } else if (i2 > 1024) {
                                DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(i2, 256, defaultCertainty, this.random);
                                dSAParametersGenerator = new DSAParametersGenerator(SHA256Digest.newInstance());
                                dSAParametersGenerator.init(dSAParameterGenerationParameters);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters22 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters22;
                                params.put(valueOf, dSAKeyGenerationParameters22);
                            } else {
                                dSAParametersGenerator = new DSAParametersGenerator();
                                i = this.strength;
                                dSAParametersGenerator.init(i, defaultCertainty, this.random);
                                DSAKeyGenerationParameters dSAKeyGenerationParameters222 = new DSAKeyGenerationParameters(this.random, dSAParametersGenerator.generateParameters());
                                this.param = dSAKeyGenerationParameters222;
                                params.put(valueOf, dSAKeyGenerationParameters222);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.engine.init(this.param);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCDSAPublicKey((DSAPublicKeyParameters) generateKeyPair.getPublic()), new BCDSAPrivateKey((DSAPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 4096 || ((i < 1024 && i % 64 != 0) || (i >= 1024 && i % 1024 != 0))) {
            Mod$$ExternalSyntheticBUOutline0.m$4("strength must be from 512 - 4096 and a multiple of 1024 above 1024");
            return;
        }
        DSAParameterSpec dSADefaultParameters = BouncyCastleProvider.CONFIGURATION.getDSADefaultParameters(i);
        if (dSADefaultParameters == null) {
            this.strength = i;
            this.random = secureRandom;
            this.initialised = false;
        } else {
            DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSADefaultParameters.getP(), dSADefaultParameters.getQ(), dSADefaultParameters.getG()));
            this.param = dSAKeyGenerationParameters;
            this.engine.init(dSAKeyGenerationParameters);
            this.initialised = true;
        }
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (!(algorithmParameterSpec instanceof DSAParameterSpec)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("parameter object not a DSAParameterSpec");
            return;
        }
        DSAParameterSpec dSAParameterSpec = (DSAParameterSpec) algorithmParameterSpec;
        DSAKeyGenerationParameters dSAKeyGenerationParameters = new DSAKeyGenerationParameters(secureRandom, new DSAParameters(dSAParameterSpec.getP(), dSAParameterSpec.getQ(), dSAParameterSpec.getG()));
        this.param = dSAKeyGenerationParameters;
        this.engine.init(dSAKeyGenerationParameters);
        this.initialised = true;
    }
}
