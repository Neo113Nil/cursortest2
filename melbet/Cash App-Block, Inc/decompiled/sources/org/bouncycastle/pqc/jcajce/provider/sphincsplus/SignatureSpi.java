package org.bouncycastle.pqc.jcajce.provider.sphincsplus;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.NullDigest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.sphincsplus.SPHINCSPlusSigner;

/* loaded from: classes10.dex */
public class SignatureSpi extends java.security.SignatureSpi {
    private final Digest digest;
    private final SPHINCSPlusSigner signer;

    public static class Direct extends SignatureSpi {
        public Direct() {
            super(new NullDigest(), new SPHINCSPlusSigner());
        }
    }

    public SignatureSpi(Digest digest, SPHINCSPlusSigner sPHINCSPlusSigner) {
        this.digest = digest;
        this.signer = sPHINCSPlusSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        if (!(privateKey instanceof BCSPHINCSPlusPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to SPHINCS+");
            return;
        }
        SPHINCSPlusPrivateKeyParameters keyParams = ((BCSPHINCSPlusPrivateKey) privateKey).getKeyParams();
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        SPHINCSPlusSigner sPHINCSPlusSigner = this.signer;
        if (secureRandom != null) {
            sPHINCSPlusSigner.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            sPHINCSPlusSigner.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof BCSPHINCSPlusPublicKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown public key passed to SPHINCS+");
        } else {
            this.signer.init(false, ((BCSPHINCSPlusPublicKey) publicKey).getKeyParams());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        byte[] bArr = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr, 0);
        try {
            return this.signer.generateSignature(bArr);
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.digest.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        byte[] bArr2 = new byte[this.digest.getDigestSize()];
        this.digest.doFinal(bArr2, 0);
        return this.signer.verifySignature(bArr2, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.digest.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        ((java.security.SignatureSpi) this).appRandom = secureRandom;
        engineInitSign(privateKey);
    }
}
