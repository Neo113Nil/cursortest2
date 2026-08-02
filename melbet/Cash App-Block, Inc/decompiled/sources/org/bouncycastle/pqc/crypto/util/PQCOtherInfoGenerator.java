package org.bouncycastle.pqc.crypto.util;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.IOException;
import java.security.SecureRandom;
import org.bouncycastle.asn1.x509.AlgorithmIdentifier;
import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.EncapsulatedSecretExtractor;
import org.bouncycastle.crypto.EncapsulatedSecretGenerator;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.util.DEROtherInfo;
import org.bouncycastle.pqc.crypto.KEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMExtractor;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMKeyPairGenerator;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMParameters;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMGenerator;
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyGenerationParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUKeyPairGenerator;
import org.bouncycastle.pqc.crypto.ntru.NTRUParameters;
import org.bouncycastle.pqc.crypto.ntru.NTRUPrivateKeyParameters;

/* loaded from: classes10.dex */
public class PQCOtherInfoGenerator {
    protected final DEROtherInfo.Builder otherInfoBuilder;
    protected final SecureRandom random;
    protected boolean used = false;

    public static class PartyU extends PQCOtherInfoGenerator {
        private AsymmetricCipherKeyPair aKp;
        private EncapsulatedSecretExtractor encSE;

        public PartyU(KEMParameters kEMParameters, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
            EncapsulatedSecretExtractor nTRUKEMExtractor;
            if (kEMParameters instanceof MLKEMParameters) {
                MLKEMKeyPairGenerator mLKEMKeyPairGenerator = new MLKEMKeyPairGenerator();
                mLKEMKeyPairGenerator.init(new MLKEMKeyGenerationParameters(secureRandom, (MLKEMParameters) kEMParameters));
                AsymmetricCipherKeyPair generateKeyPair = mLKEMKeyPairGenerator.generateKeyPair();
                this.aKp = generateKeyPair;
                nTRUKEMExtractor = new MLKEMExtractor((MLKEMPrivateKeyParameters) generateKeyPair.getPrivate());
            } else {
                if (!(kEMParameters instanceof NTRUParameters)) {
                    a$$ExternalSyntheticBUOutline0.m$3("unknown KEMParameters");
                    throw null;
                }
                NTRUKeyPairGenerator nTRUKeyPairGenerator = new NTRUKeyPairGenerator();
                nTRUKeyPairGenerator.init(new NTRUKeyGenerationParameters(secureRandom, (NTRUParameters) kEMParameters));
                AsymmetricCipherKeyPair generateKeyPair2 = nTRUKeyPairGenerator.generateKeyPair();
                this.aKp = generateKeyPair2;
                nTRUKEMExtractor = new NTRUKEMExtractor((NTRUPrivateKeyParameters) generateKeyPair2.getPrivate());
            }
            this.encSE = nTRUKEMExtractor;
        }

        public DEROtherInfo generate(byte[] bArr) {
            this.otherInfoBuilder.withSuppPrivInfo(this.encSE.extractSecret(bArr));
            return this.otherInfoBuilder.build();
        }

        public byte[] getSuppPrivInfoPartA() {
            return PQCOtherInfoGenerator.getEncoded(this.aKp.getPublic());
        }

        public PQCOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }
    }

    public static class PartyV extends PQCOtherInfoGenerator {
        private EncapsulatedSecretGenerator encSG;

        public PartyV(KEMParameters kEMParameters, AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
            super(algorithmIdentifier, bArr, bArr2, secureRandom);
            EncapsulatedSecretGenerator nTRUKEMGenerator;
            if (kEMParameters instanceof MLKEMParameters) {
                nTRUKEMGenerator = new MLKEMGenerator(secureRandom);
            } else {
                if (!(kEMParameters instanceof NTRUParameters)) {
                    a$$ExternalSyntheticBUOutline0.m$3("unknown KEMParameters");
                    throw null;
                }
                nTRUKEMGenerator = new NTRUKEMGenerator(secureRandom);
            }
            this.encSG = nTRUKEMGenerator;
        }

        public DEROtherInfo generate() {
            if (this.used) {
                a$$ExternalSyntheticBUOutline0.m$1("builder already used");
                return null;
            }
            this.used = true;
            return this.otherInfoBuilder.build();
        }

        public byte[] getSuppPrivInfoPartB(byte[] bArr) {
            this.used = false;
            try {
                SecretWithEncapsulation generateEncapsulated = this.encSG.generateEncapsulated(PQCOtherInfoGenerator.getPublicKey(bArr));
                this.otherInfoBuilder.withSuppPrivInfo(generateEncapsulated.getSecret());
                return generateEncapsulated.getEncapsulation();
            } catch (IOException unused) {
                a$$ExternalSyntheticBUOutline0.m$3("cannot decode public key");
                return null;
            }
        }

        public PQCOtherInfoGenerator withSuppPubInfo(byte[] bArr) {
            this.otherInfoBuilder.withSuppPubInfo(bArr);
            return this;
        }
    }

    public PQCOtherInfoGenerator(AlgorithmIdentifier algorithmIdentifier, byte[] bArr, byte[] bArr2, SecureRandom secureRandom) {
        this.otherInfoBuilder = new DEROtherInfo.Builder(algorithmIdentifier, bArr, bArr2);
        this.random = secureRandom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte[] getEncoded(AsymmetricKeyParameter asymmetricKeyParameter) {
        try {
            return SubjectPublicKeyInfoFactory.createSubjectPublicKeyInfo(asymmetricKeyParameter).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AsymmetricKeyParameter getPublicKey(byte[] bArr) {
        return PublicKeyFactory.createKey(bArr);
    }
}
