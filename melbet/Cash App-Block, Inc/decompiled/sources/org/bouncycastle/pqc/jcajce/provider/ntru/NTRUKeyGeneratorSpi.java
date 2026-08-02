package org.bouncycastle.pqc.jcajce.provider.ntru;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.jcajce.SecretKeyWithEncapsulation;
import org.bouncycastle.jcajce.spec.KEMExtractSpec;
import org.bouncycastle.jcajce.spec.KEMGenerateSpec;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMGenerator;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class NTRUKeyGeneratorSpi extends KeyGeneratorSpi {
    private KEMExtractSpec extSpec;
    private KEMGenerateSpec genSpec;
    private SecureRandom random;

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        KEMGenerateSpec kEMGenerateSpec = this.genSpec;
        if (kEMGenerateSpec == null) {
            NTRUKEMExtractor nTRUKEMExtractor = new NTRUKEMExtractor(((BCNTRUPrivateKey) this.extSpec.getPrivateKey()).getKeyParams());
            byte[] encapsulation = this.extSpec.getEncapsulation();
            byte[] extractSecret = nTRUKEMExtractor.extractSecret(encapsulation);
            byte[] copyOfRange = Arrays.copyOfRange(extractSecret, 0, (this.extSpec.getKeySize() + 7) / 8);
            Arrays.clear(extractSecret);
            SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(copyOfRange, this.extSpec.getKeyAlgorithmName()), encapsulation);
            Arrays.clear(copyOfRange);
            return secretKeyWithEncapsulation;
        }
        SecretWithEncapsulation generateEncapsulated = new NTRUKEMGenerator(this.random).generateEncapsulated(((BCNTRUPublicKey) kEMGenerateSpec.getPublicKey()).getKeyParams());
        byte[] secret = generateEncapsulated.getSecret();
        byte[] copyOfRange2 = Arrays.copyOfRange(secret, 0, (this.genSpec.getKeySize() + 7) / 8);
        Arrays.clear(secret);
        SecretKeyWithEncapsulation secretKeyWithEncapsulation2 = new SecretKeyWithEncapsulation(new SecretKeySpec(copyOfRange2, this.genSpec.getKeyAlgorithmName()), generateEncapsulated.getEncapsulation());
        try {
            generateEncapsulated.destroy();
            return secretKeyWithEncapsulation2;
        } catch (DestroyFailedException unused) {
            a$$ExternalSyntheticBUOutline0.m$1("key cleanup failed");
            return null;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        this.random = secureRandom;
        if (algorithmParameterSpec instanceof KEMGenerateSpec) {
            this.genSpec = (KEMGenerateSpec) algorithmParameterSpec;
            this.extSpec = null;
        } else if (!(algorithmParameterSpec instanceof KEMExtractSpec)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("unknown spec");
        } else {
            this.genSpec = null;
            this.extSpec = (KEMExtractSpec) algorithmParameterSpec;
        }
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }

    @Override // javax.crypto.KeyGeneratorSpi
    public void engineInit(int i, SecureRandom secureRandom) {
        throw new UnsupportedOperationException("Operation not supported");
    }
}
