package org.bouncycastle.jcajce.provider.asymmetric.ec;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.AlgorithmParameters;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.crypto.params.ParametersWithID;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.signers.SM2Signer;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;
import org.bouncycastle.jcajce.spec.SM2ParameterSpec;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes9.dex */
public class GMSignatureSpi extends java.security.SignatureSpi {
    private AlgorithmParameters engineParams;
    private final JcaJceHelper helper = new BCJcaJceHelper();
    private SM2ParameterSpec paramSpec;
    private final SM2Signer signer;

    public static class sha256WithSM2 extends GMSignatureSpi {
        public sha256WithSM2() {
            super(new SM2Signer(SHA256Digest.newInstance()));
        }
    }

    public static class sm3WithSM2 extends GMSignatureSpi {
        public sm3WithSM2() {
            super(new SM2Signer());
        }
    }

    public GMSignatureSpi(SM2Signer sM2Signer) {
        this.signer = sM2Signer;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineGetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null && this.paramSpec != null) {
            try {
                AlgorithmParameters createAlgorithmParameters = this.helper.createAlgorithmParameters("PSS");
                this.engineParams = createAlgorithmParameters;
                createAlgorithmParameters.init(this.paramSpec);
            } catch (Exception e) {
                Mod$$ExternalSyntheticBUOutline0.m$3(e);
                return null;
            }
        }
        return this.engineParams;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        CipherParameters generatePrivateKeyParameter = ECUtil.generatePrivateKeyParameter(privateKey);
        SecureRandom secureRandom = ((java.security.SignatureSpi) this).appRandom;
        if (secureRandom != null) {
            generatePrivateKeyParameter = new ParametersWithRandom(generatePrivateKeyParameter, secureRandom);
        }
        SM2ParameterSpec sM2ParameterSpec = this.paramSpec;
        SM2Signer sM2Signer = this.signer;
        if (sM2ParameterSpec != null) {
            sM2Signer.init(true, new ParametersWithID(generatePrivateKeyParameter, sM2ParameterSpec.getID()));
        } else {
            sM2Signer.init(true, generatePrivateKeyParameter);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        CipherParameters generatePublicKeyParameter = ECUtils.generatePublicKeyParameter(publicKey);
        SM2ParameterSpec sM2ParameterSpec = this.paramSpec;
        if (sM2ParameterSpec != null) {
            generatePublicKeyParameter = new ParametersWithID(generatePublicKeyParameter, sM2ParameterSpec.getID());
        }
        this.signer.init(false, generatePublicKeyParameter);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        if (algorithmParameterSpec instanceof SM2ParameterSpec) {
            this.paramSpec = (SM2ParameterSpec) algorithmParameterSpec;
        } else {
            AesGcmSiv$$ExternalSyntheticLambda0.m$1("only SM2ParameterSpec supported");
        }
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            return this.signer.generateSignature();
        } catch (CryptoException e) {
            throw new SignatureException("unable to create signature: " + e.getMessage());
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.signer.update(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        return this.signer.verifySignature(bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.signer.update(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }
}
