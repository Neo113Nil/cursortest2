package org.bouncycastle.pqc.jcajce.provider.ntru;

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
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SecretWithEncapsulation;
import org.bouncycastle.crypto.Wrapper;
import org.bouncycastle.jcajce.spec.KEMParameterSpec;
import org.bouncycastle.jcajce.spec.KTSParameterSpec;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMExtractor;
import org.bouncycastle.pqc.crypto.ntru.NTRUKEMGenerator;
import org.bouncycastle.pqc.jcajce.provider.util.WrapUtil;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* loaded from: classes10.dex */
class NTRUCipherSpi extends CipherSpi {
    private final String algorithmName;
    private AlgorithmParameters engineParams;
    private NTRUKEMGenerator kemGen;
    private KTSParameterSpec kemParameterSpec;
    private BCNTRUPrivateKey unwrapKey;
    private BCNTRUPublicKey wrapKey;

    public static class Base extends NTRUCipherSpi {
        public Base() {
            super("NTRU");
        }
    }

    public NTRUCipherSpi(String str) {
        this.algorithmName = str;
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
            if (!(key instanceof BCNTRUPublicKey)) {
                throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Only a "), this.algorithmName, " public key can be used for wrapping"));
            }
            this.wrapKey = (BCNTRUPublicKey) key;
            this.kemGen = new NTRUKEMGenerator(CryptoServicesRegistrar.getSecureRandom(secureRandom));
            return;
        }
        if (i != 4) {
            Mod$$ExternalSyntheticBUOutline0.m$4("Cipher only valid for wrapping/unwrapping");
        } else {
            if (!(key instanceof BCNTRUPrivateKey)) {
                throw new InvalidKeyException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("Only a "), this.algorithmName, " private key can be used for unwrapping"));
            }
            this.unwrapKey = (BCNTRUPrivateKey) key;
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
        byte[] bArr2 = null;
        try {
            if (i != 3) {
                AesGcmSiv$$ExternalSyntheticLambda0.m$2("only SECRET_KEY supported");
                return null;
            }
            try {
                NTRUKEMExtractor nTRUKEMExtractor = new NTRUKEMExtractor(this.unwrapKey.getKeyParams());
                bArr2 = nTRUKEMExtractor.extractSecret(Arrays.copyOfRange(bArr, 0, nTRUKEMExtractor.getEncapsulationLength()));
                Wrapper keyUnwrapper = WrapUtil.getKeyUnwrapper(this.kemParameterSpec, bArr2);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, nTRUKEMExtractor.getEncapsulationLength(), bArr.length);
                return new SecretKeySpec(keyUnwrapper.unwrap(copyOfRange, 0, copyOfRange.length), str);
            } catch (IllegalArgumentException e) {
                throw new NoSuchAlgorithmException("unable to extract KTS secret: " + e.getMessage());
            } catch (InvalidCipherTextException e2) {
                throw new InvalidKeyException("unable to extract KTS secret: " + e2.getMessage());
            }
        } finally {
            if (bArr2 != null) {
                Arrays.clear(bArr2);
            }
        }
    }

    @Override // javax.crypto.CipherSpi
    public int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        throw new IllegalStateException("Not supported in a wrapping mode");
    }

    @Override // javax.crypto.CipherSpi
    public byte[] engineWrap(Key key) {
        SecretWithEncapsulation secretWithEncapsulation = null;
        if (key.getEncoded() == null) {
            AesGcmSiv$$ExternalSyntheticLambda0.m$2("Cannot wrap key, null encoding.");
            return null;
        }
        try {
            try {
                secretWithEncapsulation = this.kemGen.generateEncapsulated(this.wrapKey.getKeyParams());
                Wrapper keyWrapper = WrapUtil.getKeyWrapper(this.kemParameterSpec, secretWithEncapsulation.getSecret());
                byte[] encapsulation = secretWithEncapsulation.getEncapsulation();
                byte[] encoded = key.getEncoded();
                byte[] concatenate = Arrays.concatenate(encapsulation, keyWrapper.wrap(encoded, 0, encoded.length));
                Arrays.clear(encoded);
                try {
                    secretWithEncapsulation.destroy();
                    return concatenate;
                } catch (DestroyFailedException e) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e.getMessage());
                }
            } catch (IllegalArgumentException e2) {
                throw new IllegalBlockSizeException("unable to generate KTS secret: " + e2.getMessage());
            }
        } catch (Throwable th) {
            if (secretWithEncapsulation != null) {
                try {
                    secretWithEncapsulation.destroy();
                } catch (DestroyFailedException e3) {
                    throw new IllegalBlockSizeException("unable to destroy interim values: " + e3.getMessage());
                }
            }
            throw th;
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
