package org.bouncycastle.pqc.jcajce.provider.lms;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.pqc.crypto.ExhaustedPrivateKeyException;
import org.bouncycastle.pqc.crypto.MessageSigner;
import org.bouncycastle.pqc.crypto.lms.LMSContext;
import org.bouncycastle.pqc.crypto.lms.LMSContextBasedSigner;
import org.bouncycastle.pqc.crypto.lms.LMSContextBasedVerifier;

/* loaded from: classes10.dex */
public class LMSSignatureSpi extends Signature {
    private Digest digest;
    private LMSContextBasedSigner lmOtsSigner;
    private LMSContextBasedVerifier lmOtsVerifier;
    private SecureRandom random;
    private MessageSigner signer;

    public static class generic extends LMSSignatureSpi {
        public generic() {
            super("LMS", new NullDigest());
        }
    }

    public LMSSignatureSpi(String str, Digest digest) {
        super(str);
        this.digest = digest;
    }

    private Digest getSigner() {
        try {
            return this.lmOtsSigner.generateLMSContext();
        } catch (ExhaustedPrivateKeyException e) {
            throw new SignatureException(e.getMessage(), e);
        }
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        if (!(privateKey instanceof BCLMSPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to LMS");
            return;
        }
        LMSContextBasedSigner lMSContextBasedSigner = (LMSContextBasedSigner) ((BCLMSPrivateKey) privateKey).getKeyParams();
        this.lmOtsSigner = lMSContextBasedSigner;
        if (lMSContextBasedSigner.getUsagesRemaining() != 0) {
            this.digest = null;
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("private key exhausted");
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof BCLMSPublicKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown public key passed to LMS");
            return;
        }
        NullDigest nullDigest = new NullDigest();
        this.digest = nullDigest;
        nullDigest.reset();
        this.lmOtsVerifier = (LMSContextBasedVerifier) ((BCLMSPublicKey) publicKey).getKeyParams();
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        if (this.digest == null) {
            this.digest = getSigner();
        }
        try {
            byte[] generateSignature = this.lmOtsSigner.generateSignature((LMSContext) this.digest);
            this.digest = null;
            return generateSignature;
        } catch (Exception e) {
            if (e instanceof IllegalStateException) {
                throw new SignatureException(e.getMessage(), e);
            }
            throw new SignatureException(e.toString(), e);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        if (this.digest == null) {
            this.digest = getSigner();
        }
        this.digest.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        LMSContext generateLMSContext = this.lmOtsVerifier.generateLMSContext(bArr);
        byte[] digestResult = DigestUtil.getDigestResult(this.digest);
        generateLMSContext.update(digestResult, 0, digestResult.length);
        return this.lmOtsVerifier.verify(generateLMSContext);
    }

    public LMSSignatureSpi(String str) {
        super(str);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        if (this.digest == null) {
            this.digest = getSigner();
        }
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}
