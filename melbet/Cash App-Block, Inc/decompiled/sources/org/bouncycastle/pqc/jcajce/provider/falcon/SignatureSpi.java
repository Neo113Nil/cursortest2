package org.bouncycastle.pqc.jcajce.provider.falcon;

import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.io.ByteArrayOutputStream;
import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.asn1.x509.SubjectPublicKeyInfo;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.falcon.FalconParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.falcon.FalconSigner;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private FalconParameters parameters;
    private SecureRandom random;
    private FalconSigner signer;

    public static class Base extends SignatureSpi {
        public Base() {
            super(new FalconSigner());
        }
    }

    public static class Falcon1024 extends SignatureSpi {
        public Falcon1024() {
            super(new FalconSigner(), FalconParameters.falcon_1024);
        }
    }

    public static class Falcon512 extends SignatureSpi {
        public Falcon512() {
            super(new FalconSigner(), FalconParameters.falcon_512);
        }
    }

    public SignatureSpi(FalconSigner falconSigner, FalconParameters falconParameters) {
        super(Strings.toUpperCase(falconParameters.getName()));
        this.parameters = falconParameters;
        this.bOut = new ByteArrayOutputStream();
        this.signer = falconSigner;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        if (!(privateKey instanceof BCFalconPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to Falcon");
            return;
        }
        BCFalconPrivateKey bCFalconPrivateKey = (BCFalconPrivateKey) privateKey;
        FalconPrivateKeyParameters keyParams = bCFalconPrivateKey.getKeyParams();
        FalconParameters falconParameters = this.parameters;
        if (falconParameters != null) {
            String upperCase = Strings.toUpperCase(falconParameters.getName());
            if (!upperCase.equals(bCFalconPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        FalconSigner falconSigner = this.signer;
        if (secureRandom != null) {
            falconSigner.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            falconSigner.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof BCFalconPublicKey)) {
            try {
                publicKey = new BCFalconPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unknown public key passed to Falcon: ")), e);
            }
        }
        BCFalconPublicKey bCFalconPublicKey = (BCFalconPublicKey) publicKey;
        FalconParameters falconParameters = this.parameters;
        if (falconParameters != null) {
            String upperCase = Strings.toUpperCase(falconParameters.getName());
            if (!upperCase.equals(bCFalconPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCFalconPublicKey.getKeyParams());
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(String str, Object obj) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public byte[] engineSign() {
        try {
            byte[] byteArray = this.bOut.toByteArray();
            this.bOut.reset();
            return this.signer.generateSignature(byteArray);
        } catch (Exception e) {
            Mod$$ExternalSyntheticBUOutline0.m(e);
            return null;
        }
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte b) {
        this.bOut.write(b);
    }

    @Override // java.security.SignatureSpi
    public boolean engineVerify(byte[] bArr) {
        byte[] byteArray = this.bOut.toByteArray();
        this.bOut.reset();
        return this.signer.verifySignature(byteArray, bArr);
    }

    @Override // java.security.SignatureSpi
    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.bOut.write(bArr, i, i2);
    }

    @Override // java.security.SignatureSpi
    public void engineSetParameter(AlgorithmParameterSpec algorithmParameterSpec) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    public SignatureSpi(FalconSigner falconSigner) {
        super("FALCON");
        this.bOut = new ByteArrayOutputStream();
        this.signer = falconSigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}
