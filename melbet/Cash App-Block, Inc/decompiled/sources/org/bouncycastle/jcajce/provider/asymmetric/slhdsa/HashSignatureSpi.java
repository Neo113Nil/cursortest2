package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.pqc.crypto.slhdsa.HashSLHDSASigner;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;

/* loaded from: classes9.dex */
public class HashSignatureSpi extends BaseDeterministicOrRandomSignature {
    private final HashSLHDSASigner signer;

    public static class Direct extends HashSignatureSpi {
        public Direct() {
            super(new HashSLHDSASigner());
        }
    }

    public HashSignatureSpi(HashSLHDSASigner hashSLHDSASigner) {
        super("HASH-SLH-DSA");
        this.signer = hashSLHDSASigner;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        if (!(this.keyParams instanceof SLHDSAPrivateKeyParameters)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                return this.signer.generateSignature();
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        } finally {
            this.isInitState = true;
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        if (!(this.keyParams instanceof SLHDSAPublicKeyParameters)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.verifySignature(bArr);
        } finally {
            this.isInitState = true;
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void signInit(PrivateKey privateKey, SecureRandom secureRandom) {
        ((Signature) this).appRandom = secureRandom;
        if (privateKey instanceof BCSLHDSAPrivateKey) {
            this.keyParams = ((BCSLHDSAPrivateKey) privateKey).getKeyParams();
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte b) {
        this.signer.update(b);
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void verifyInit(PublicKey publicKey) {
        if (publicKey instanceof BCSLHDSAPublicKey) {
            this.keyParams = ((BCSLHDSAPublicKey) publicKey).getKeyParams();
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown public key passed to SLH-DSA");
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void updateEngine(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }
}
