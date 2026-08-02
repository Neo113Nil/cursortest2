package org.bouncycastle.pqc.jcajce.provider.hqc;

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
import org.bouncycastle.pqc.crypto.hqc.HQCKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCKeyPairGenerator;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.hqc.HQCPublicKeyParameters;
import org.bouncycastle.pqc.jcajce.provider.util.SpecUtil;
import org.bouncycastle.pqc.jcajce.spec.HQCParameterSpec;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class HQCKeyPairGeneratorSpi extends KeyPairGenerator {
    private static Map parameters;
    HQCKeyPairGenerator engine;
    boolean initialised;
    HQCKeyGenerationParameters param;
    SecureRandom random;

    static {
        HashMap hashMap = new HashMap();
        parameters = hashMap;
        HQCParameters hQCParameters = HQCParameters.hqc128;
        hashMap.put("hqc-128", hQCParameters);
        Map map = parameters;
        HQCParameters hQCParameters2 = HQCParameters.hqc192;
        map.put("hqc-192", hQCParameters2);
        Map map2 = parameters;
        HQCParameters hQCParameters3 = HQCParameters.hqc256;
        map2.put("hqc-256", hQCParameters3);
        parameters.put(HQCParameterSpec.hqc128.getName(), hQCParameters);
        parameters.put(HQCParameterSpec.hqc192.getName(), hQCParameters2);
        parameters.put(HQCParameterSpec.hqc256.getName(), hQCParameters3);
    }

    public HQCKeyPairGeneratorSpi() {
        super("HQC");
        this.engine = new HQCKeyPairGenerator();
        this.random = CryptoServicesRegistrar.getSecureRandom();
        this.initialised = false;
    }

    private static String getNameFromParams(AlgorithmParameterSpec algorithmParameterSpec) {
        return algorithmParameterSpec instanceof HQCParameterSpec ? ((HQCParameterSpec) algorithmParameterSpec).getName() : Strings.toLowerCase(SpecUtil.getNameFrom(algorithmParameterSpec));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (!this.initialised) {
            HQCKeyGenerationParameters hQCKeyGenerationParameters = new HQCKeyGenerationParameters(this.random, HQCParameters.hqc128);
            this.param = hQCKeyGenerationParameters;
            this.engine.init(hQCKeyGenerationParameters);
            this.initialised = true;
        }
        AsymmetricCipherKeyPair generateKeyPair = this.engine.generateKeyPair();
        return new KeyPair(new BCHQCPublicKey((HQCPublicKeyParameters) generateKeyPair.getPublic()), new BCHQCPrivateKey((HQCPrivateKeyParameters) generateKeyPair.getPrivate()));
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        String nameFromParams = getNameFromParams(algorithmParameterSpec);
        if (nameFromParams == null) {
            throw new InvalidAlgorithmParameterException(GetCert$$ExternalSyntheticOutline0.m("invalid ParameterSpec: ", algorithmParameterSpec));
        }
        HQCKeyGenerationParameters hQCKeyGenerationParameters = new HQCKeyGenerationParameters(secureRandom, (HQCParameters) parameters.get(nameFromParams));
        this.param = hQCKeyGenerationParameters;
        this.engine.init(hQCKeyGenerationParameters);
        this.initialised = true;
    }

    @Override // java.security.KeyPairGenerator, java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        throw new IllegalArgumentException("use AlgorithmParameterSpec");
    }
}
