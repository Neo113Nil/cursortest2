package org.bouncycastle.pqc.jcajce.provider.hqc;

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
import org.bouncycastle.pqc.crypto.hqc.HQCKEMExtractor;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMGenerator;
import org.bouncycastle.util.Arrays;

/* loaded from: classes10.dex */
public class HQCKeyGeneratorSpi extends KeyGeneratorSpi {
    private KEMExtractSpec extSpec;
    private KEMGenerateSpec genSpec;
    private SecureRandom random;

    @Override // javax.crypto.KeyGeneratorSpi
    public SecretKey engineGenerateKey() {
        KEMGenerateSpec kEMGenerateSpec = this.genSpec;
        if (kEMGenerateSpec == null) {
            HQCKEMExtractor hQCKEMExtractor = new HQCKEMExtractor(((BCHQCPrivateKey) this.extSpec.getPrivateKey()).getKeyParams());
            byte[] encapsulation = this.extSpec.getEncapsulation();
            byte[] extractSecret = hQCKEMExtractor.extractSecret(encapsulation);
            SecretKeyWithEncapsulation secretKeyWithEncapsulation = new SecretKeyWithEncapsulation(new SecretKeySpec(extractSecret, this.extSpec.getKeyAlgorithmName()), encapsulation);
            Arrays.clear(extractSecret);
            return secretKeyWithEncapsulation;
        }
        SecretWithEncapsulation generateEncapsulated = new HQCKEMGenerator(this.random).generateEncapsulated(((BCHQCPublicKey) kEMGenerateSpec.getPublicKey()).getKeyParams());
        SecretKeyWithEncapsulation secretKeyWithEncapsulation2 = new SecretKeyWithEncapsulation(new SecretKeySpec(generateEncapsulated.getSecret(), this.genSpec.getKeyAlgorithmName()), generateEncapsulated.getEncapsulation());
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
