package org.bouncycastle.pqc.jcajce.provider.dilithium;

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
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumPrivateKeyParameters;
import org.bouncycastle.pqc.crypto.crystals.dilithium.DilithiumSigner;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
public class SignatureSpi extends Signature {
    private ByteArrayOutputStream bOut;
    private DilithiumParameters parameters;
    private SecureRandom random;
    private DilithiumSigner signer;

    public static class Base extends SignatureSpi {
        public Base() {
            super(new DilithiumSigner());
        }
    }

    public static class Base2 extends SignatureSpi {
        public Base2() {
            super(new DilithiumSigner(), DilithiumParameters.dilithium2);
        }
    }

    public static class Base3 extends SignatureSpi {
        public Base3() {
            super(new DilithiumSigner(), DilithiumParameters.dilithium3);
        }
    }

    public static class Base5 extends SignatureSpi {
        public Base5() {
            super(new DilithiumSigner(), DilithiumParameters.dilithium5);
        }
    }

    public SignatureSpi(DilithiumSigner dilithiumSigner, DilithiumParameters dilithiumParameters) {
        super(Strings.toUpperCase(dilithiumParameters.getName()));
        this.bOut = new ByteArrayOutputStream();
        this.signer = dilithiumSigner;
        this.parameters = dilithiumParameters;
    }

    @Override // java.security.SignatureSpi
    public Object engineGetParameter(String str) {
        throw new UnsupportedOperationException("engineSetParameter unsupported");
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey) {
        if (!(privateKey instanceof BCDilithiumPrivateKey)) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("unknown private key passed to Dilithium");
            return;
        }
        BCDilithiumPrivateKey bCDilithiumPrivateKey = (BCDilithiumPrivateKey) privateKey;
        DilithiumPrivateKeyParameters keyParams = bCDilithiumPrivateKey.getKeyParams();
        DilithiumParameters dilithiumParameters = this.parameters;
        if (dilithiumParameters != null) {
            String upperCase = Strings.toUpperCase(dilithiumParameters.getName());
            if (!upperCase.equals(bCDilithiumPrivateKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        SecureRandom secureRandom = this.random;
        DilithiumSigner dilithiumSigner = this.signer;
        if (secureRandom != null) {
            dilithiumSigner.init(true, new ParametersWithRandom(keyParams, secureRandom));
        } else {
            dilithiumSigner.init(true, keyParams);
        }
    }

    @Override // java.security.SignatureSpi
    public void engineInitVerify(PublicKey publicKey) {
        if (!(publicKey instanceof BCDilithiumPublicKey)) {
            try {
                publicKey = new BCDilithiumPublicKey(SubjectPublicKeyInfo.getInstance(publicKey.getEncoded()));
            } catch (Exception e) {
                throw new InvalidKeyException(Fragment$5$$ExternalSyntheticOutline0.m(e, new StringBuilder("unknown public key passed to Dilithium: ")), e);
            }
        }
        BCDilithiumPublicKey bCDilithiumPublicKey = (BCDilithiumPublicKey) publicKey;
        DilithiumParameters dilithiumParameters = this.parameters;
        if (dilithiumParameters != null) {
            String upperCase = Strings.toUpperCase(dilithiumParameters.getName());
            if (!upperCase.equals(bCDilithiumPublicKey.getAlgorithm())) {
                throw new InvalidKeyException("signature configured for ".concat(upperCase));
            }
        }
        this.signer.init(false, bCDilithiumPublicKey.getKeyParams());
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

    public SignatureSpi(DilithiumSigner dilithiumSigner) {
        super("Dilithium");
        this.bOut = new ByteArrayOutputStream();
        this.signer = dilithiumSigner;
        this.parameters = null;
    }

    @Override // java.security.SignatureSpi
    public void engineInitSign(PrivateKey privateKey, SecureRandom secureRandom) {
        this.random = secureRandom;
        engineInitSign(privateKey);
    }
}
