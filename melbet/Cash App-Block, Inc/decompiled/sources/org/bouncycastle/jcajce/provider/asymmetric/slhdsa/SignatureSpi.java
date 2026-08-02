package org.bouncycastle.jcajce.provider.asymmetric.slhdsa;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSAPublicKeyParameters;
import org.bouncycastle.pqc.crypto.slhdsa.SLHDSASigner;

/* loaded from: classes9.dex */
public class SignatureSpi extends BaseDeterministicOrRandomSignature {
    private final ByteArrayOutputStream bOut;
    private final SLHDSASigner signer;

    public static class Direct extends SignatureSpi {
        public Direct() {
            super(new SLHDSASigner());
        }
    }

    public SignatureSpi(SLHDSASigner sLHDSASigner) {
        super("SLH-DSA");
        this.bOut = new ByteArrayOutputStream();
        this.signer = sLHDSASigner;
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        if (!(this.keyParams instanceof SLHDSAPrivateKeyParameters)) {
            throw new SignatureException("engine initialized for verification");
        }
        try {
            try {
                return this.signer.generateSignature(this.bOut.toByteArray());
            } catch (Exception e) {
                throw new SignatureException(e.toString());
            }
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        if (!(this.keyParams instanceof SLHDSAPublicKeyParameters)) {
            throw new SignatureException("engine initialized for signing");
        }
        try {
            return this.signer.verifySignature(this.bOut.toByteArray(), bArr);
        } finally {
            this.isInitState = true;
            this.bOut.reset();
        }
    }

    @Override // org.bouncycastle.jcajce.provider.asymmetric.util.BaseDeterministicOrRandomSignature
    public void reInitialize(boolean z, CipherParameters cipherParameters) {
        this.signer.init(z, cipherParameters);
        this.bOut.reset();
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
        this.bOut.write(b);
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
        this.bOut.write(bArr, i, i2);
    }
}
