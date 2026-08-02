package org.bouncycastle.pqc.jcajce.provider.hqc;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;
import org.bouncycastle.asn1.cmc.GetCert$$ExternalSyntheticOutline0;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMExtractor;
import org.bouncycastle.pqc.crypto.hqc.HQCKEMGenerator;
import org.bouncycastle.pqc.crypto.hqc.HQCParameters;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;
import org.bouncycastle.util.Strings;

/* loaded from: classes10.dex */
class HQCCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private HQCParameters hqcParameters;
    private HQCKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private BCHQCPrivateKey unwrapKey;
    private BCHQCPublicKey wrapKey;

    public static class Base extends HQCCipherSpi {
        public Base() {
            super("HQC");
        }
    }

    public static class HQC128 extends HQCCipherSpi {
        public HQC128() {
            super(HQCParameters.hqc128);
        }
    }

    public static class HQC192 extends HQCCipherSpi {
        public HQC192() {
            super(HQCParameters.hqc192);
        }
    }

    public static class HQC256 extends HQCCipherSpi {
        public HQC256() {
            super(HQCParameters.hqc256);
        }
    }

    public HQCCipherSpi(HQCParameters hQCParameters) {
        this.hqcParameters = hQCParameters;
        this.algorithmName = Strings.toUpperCase(hQCParameters.getName());
    }

    @Override // javax.crypto.CipherSpi
    public int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetBlockSize() {
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineGetIV() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetKeySize(Key key) {
        return 2048;
    }

    @Override // javax.crypto.CipherSpi
    public int engineGetOutputSize(int i) {
        return -1;
    }

    @Override // javax.crypto.CipherSpi
    public AlgorithmParameters engineGetParameters() {
        if (this.engineParams == null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.algorithmName, "BCPQC");
                this.engineParams = algorithmParameters;
                algorithmParameters.init(this.kemParameterSpec);
            } catch (Exception e) {
                throw Exceptions.illegalStateException(e.toString(), e);
            }
        }
        return this.engineParams;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        KTSParameterSpec kTSParameterSpec;
        if (algorithmParameterSpec == null) {
            kTSParameterSpec = new KEMParameterSpec("AES-KWP");
        } else {
            if (!(algorithmParameterSpec instanceof KTSParameterSpec)) {
                throw new InvalidAlgorithmParameterException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder(), this.algorithmName, " can only accept KTSParameterSpec"));
            }
            kTSParameterSpec = (KTSParameterSpec) algorithmParameterSpec;
        }
        this.kemParameterSpec = kTSParameterSpec;
        if (i == 3) {
            if (!(key instanceof BCHQCPublicKey)) {
                throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCHQCPublicKey) key;
            this.kemGen = new HQCKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
        } else if (i != 4) {
            Mod$$ExternalSyntheticBUOutline0.m$4("Cipher only valid for wrapping/unwrapping");
            return;
        } else {
            if (!(key instanceof BCHQCPrivateKey)) {
                throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCHQCPrivateKey) key;
        }
        HQCParameters hQCParameters = this.hqcParameters;
        if (hQCParameters != null) {
            String upperCase = Strings.toUpperCase(hQCParameters.getName());
            if (!upperCase.equals(key.getAlgorithm())) {
                throw new InvalidKeyException("cipher locked to ".concat(upperCase));
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetMode(String str) {
        throw new NoSuchAlgorithmException(Recorder$$ExternalSyntheticOutline2.m("Cannot support mode ", str));
    }

    @Override // javax.crypto.CipherSpi
    public void engineSetPadding(String str) {
        throw new NoSuchPaddingException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Padding ", str, " unknown"));
    }

    @Override // javax.crypto.CipherSpi
    public Key engineUnwrap(byte[] bArr, String str, int i) {
        if (i != 3) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("only SECRET_KEY supported");
            return null;
        }
        try {
            HQCKEMExtractor hQCKEMExtractor = new HQCKEMExtractor(this.unwrapKey.getKeyParams());
            byte[] extractSecret = hQCKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, hQCKEMExtractor.getEncapsulationLength()));
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            KeyParameter keyParameter = new KeyParameter(extractSecret);
            Arrays.clear(extractSecret);
            wrapper.init(false, keyParameter);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, hQCKEMExtractor.getEncapsulationLength(), bArr.length);
            SecretKeySpec secretKeySpec = new SecretKeySpec(wrapper.unwrap(copyOfRange, 0, copyOfRange.length), str);
            Arrays.clear(keyParameter.getKey());
            return secretKeySpec;
        } catch (IllegalArgumentException e) {
            throw new NoSuchAlgorithmException(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to extract KTS secret: ")));
        } catch (InvalidCipherTextException e2) {
            throw new InvalidKeyException("unable to extract KTS secret: " + e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) {
        if (key.getEncoded() == null) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            SecretWithEncapsulation generateEncapsulated = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
            Wrapper wrapper = WrapUtil.getWrapper(this.kemParameterSpec.getKeyAlgorithmName());
            wrapper.init(true, new KeyParameter(generateEncapsulated.getSecret()));
            byte[] encapsulation = generateEncapsulated.getEncapsulation();
            generateEncapsulated.destroy();
            byte[] encoded = key.getEncoded();
            byte[] concatenate = Arrays.concatenate(encapsulation, wrapper.wrap(encoded, 0, encoded.length));
            Arrays.clear(encoded);
            return concatenate;
        } catch (IllegalArgumentException e) {
            throw new IllegalBlockSizeException(GetCert$$ExternalSyntheticOutline0.m(e, new StringBuilder("unable to generate KTS secret: ")));
        } catch (DestroyFailedException e2) {
            throw new IllegalBlockSizeException("unable to destroy interim values: " + e2.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineUpdate(byte[] bArr, int i, int i2) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    public HQCCipherSpi(String str) {
        this.algorithmName = str;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw Exceptions.illegalArgumentException(e.getMessage(), e);
        }
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        AlgorithmParameterSpec parameterSpec;
        if (algorithmParameters != null) {
            try {
                parameterSpec = algorithmParameters.getParameterSpec(KEMParameterSpec.class);
            } catch (Exception unused) {
                Mod$$ExternalSyntheticBUOutline0.m(algorithmParameters);
                return;
            }
        } else {
            parameterSpec = null;
        }
        engineInit(i, key, parameterSpec, secureRandom);
    }
}
