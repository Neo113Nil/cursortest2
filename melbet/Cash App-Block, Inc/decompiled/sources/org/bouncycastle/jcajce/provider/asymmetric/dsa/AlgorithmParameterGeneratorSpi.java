package org.bouncycastle.jcajce.provider.asymmetric.dsa;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAParameterGenerationParameters;
import org.bouncycastle.crypto.params.DSAParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseAlgorithmParameterGeneratorSpi;
import org.bouncycastle.jcajce.provider.asymmetric.util.PrimeCertaintyCalculator;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class AlgorithmParameterGeneratorSpi extends BaseAlgorithmParameterGeneratorSpi {
    protected DSAParameterGenerationParameters params;
    protected SecureRandom random;
    protected int strength = 2048;

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public AlgorithmParameters engineGenerateParameters() {
        DSAParametersGenerator dSAParametersGenerator = this.strength <= 1024 ? new DSAParametersGenerator() : new DSAParametersGenerator(SHA256Digest.newInstance());
        if (this.random == null) {
            this.random = CryptoServicesRegistrar.getSecureRandom();
        }
        int defaultCertainty = PrimeCertaintyCalculator.getDefaultCertainty(this.strength);
        int i = this.strength;
        if (i == 1024) {
            DSAParameterGenerationParameters dSAParameterGenerationParameters = new DSAParameterGenerationParameters(1024, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, defaultCertainty, this.random);
            this.params = dSAParameterGenerationParameters;
            dSAParametersGenerator.init(dSAParameterGenerationParameters);
        } else {
            SecureRandom secureRandom = this.random;
            if (i > 1024) {
                DSAParameterGenerationParameters dSAParameterGenerationParameters2 = new DSAParameterGenerationParameters(i, 256, defaultCertainty, secureRandom);
                this.params = dSAParameterGenerationParameters2;
                dSAParametersGenerator.init(dSAParameterGenerationParameters2);
            } else {
                dSAParametersGenerator.init(i, defaultCertainty, secureRandom);
            }
        }
        DSAParameters generateParameters = dSAParametersGenerator.generateParameters();
        try {
            AlgorithmParameters createParametersInstance = createParametersInstance("DSA");
            createParametersInstance.init(new DSAParameterSpec(generateParameters.getP(), generateParameters.getQ(), generateParameters.getG()));
            return createParametersInstance;
        } catch (Exception e) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(e.getMessage());
            return null;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        if (i < 512 || i > 3072) {
            Mod$$ExternalSyntheticBUOutline0.m$4("strength must be from 512 - 3072");
            return;
        }
        if (i <= 1024 && i % 64 != 0) {
            Mod$$ExternalSyntheticBUOutline0.m$4("strength must be a multiple of 64 below 1024 bits.");
        } else if (i > 1024 && i % 1024 != 0) {
            Mod$$ExternalSyntheticBUOutline0.m$4("strength must be a multiple of 1024 above 1024 bits.");
        } else {
            this.strength = i;
            this.random = secureRandom;
        }
    }

    @Override // java.security.AlgorithmParameterGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }
}
