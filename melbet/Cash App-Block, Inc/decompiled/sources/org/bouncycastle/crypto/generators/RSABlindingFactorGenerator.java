package org.bouncycastle.crypto.generators;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

/* loaded from: classes9.dex */
public class RSABlindingFactorGenerator {
    private static BigInteger TWO = BigInteger.valueOf(2);
    private RSAKeyParameters key;
    private SecureRandom random;

    public BigInteger generateBlindingFactor() {
        RSAKeyParameters rSAKeyParameters = this.key;
        if (rSAKeyParameters == null) {
            a$$ExternalSyntheticBUOutline0.m$1("generator not initialised");
            return null;
        }
        BigInteger modulus = rSAKeyParameters.getModulus();
        int bitLength = modulus.bitLength() - 1;
        while (true) {
            BigInteger createRandomBigInteger = BigIntegers.createRandomBigInteger(bitLength, this.random);
            if (createRandomBigInteger.compareTo(TWO) >= 0 && BigIntegers.modOddIsCoprime(modulus, createRandomBigInteger)) {
                return createRandomBigInteger;
            }
        }
    }

    public void init(CipherParameters cipherParameters) {
        SecureRandom secureRandom;
        if (cipherParameters instanceof ParametersWithRandom) {
            ParametersWithRandom parametersWithRandom = (ParametersWithRandom) cipherParameters;
            this.key = (RSAKeyParameters) parametersWithRandom.getParameters();
            secureRandom = parametersWithRandom.getRandom();
        } else {
            this.key = (RSAKeyParameters) cipherParameters;
            secureRandom = CryptoServicesRegistrar.getSecureRandom();
        }
        this.random = secureRandom;
        if (this.key instanceof RSAPrivateCrtKeyParameters) {
            a$$ExternalSyntheticBUOutline0.m$3("generator requires RSA public key");
        }
    }
}
