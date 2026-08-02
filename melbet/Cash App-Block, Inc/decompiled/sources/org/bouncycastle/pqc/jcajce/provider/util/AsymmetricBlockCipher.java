package org.bouncycastle.pqc.jcajce.provider.util;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.math.raw.Mod$$ExternalSyntheticBUOutline0;

/* loaded from: classes10.dex */
public abstract class AsymmetricBlockCipher extends CipherSpiExt {
    protected ByteArrayOutputStream buf = new ByteArrayOutputStream();
    protected int cipherTextSize;
    protected int maxPlainTextSize;
    protected AlgorithmParameterSpec paramSpec;

    public void checkLength(int i) {
        int size = this.buf.size() + i;
        int i2 = this.opMode;
        if (i2 == 1) {
            if (size <= this.maxPlainTextSize) {
                return;
            }
            throw new IllegalBlockSizeException(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.maxPlainTextSize, " bytes).", JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(size, "The length of the plaintext (", " bytes) is not supported by the cipher (max. ")));
        }
        if (i2 != 2 || size == this.cipherTextSize) {
            return;
        }
        throw new IllegalBlockSizeException(Recorder$$ExternalSyntheticOutline1.m(this.cipherTextSize, size, " bytes, was ", " bytes).", new StringBuilder("Illegal ciphertext length (expected ")));
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] doFinal(byte[] bArr, int i, int i2) {
        checkLength(i2);
        update(bArr, i, i2);
        byte[] byteArray = this.buf.toByteArray();
        this.buf.reset();
        int i3 = this.opMode;
        if (i3 == 1) {
            return messageEncrypt(byteArray);
        }
        if (i3 != 2) {
            return null;
        }
        return messageDecrypt(byteArray);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getBlockSize() {
        return this.opMode == 1 ? this.maxPlainTextSize : this.cipherTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] getIV() {
        return null;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int getOutputSize(int i) {
        if (this.buf.size() + i > getBlockSize()) {
            return 0;
        }
        return this.opMode == 1 ? this.cipherTextSize : this.maxPlainTextSize;
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final AlgorithmParameterSpec getParameters() {
        return this.paramSpec;
    }

    public abstract void initCipherDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec);

    public abstract void initCipherEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    public final void initDecrypt(Key key) {
        try {
            initDecrypt(key, null);
        } catch (InvalidAlgorithmParameterException unused) {
            Mod$$ExternalSyntheticBUOutline0.m$4("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key) {
        try {
            initEncrypt(key, null, CryptoServicesRegistrar.getSecureRandom());
        } catch (InvalidAlgorithmParameterException unused) {
            Mod$$ExternalSyntheticBUOutline0.m$4("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public abstract byte[] messageDecrypt(byte[] bArr);

    public abstract byte[] messageEncrypt(byte[] bArr);

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setMode(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void setPadding(String str) {
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final byte[] update(byte[] bArr, int i, int i2) {
        if (i2 != 0) {
            this.buf.write(bArr, i, i2);
        }
        return new byte[0];
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        this.opMode = 2;
        initCipherDecrypt(key, algorithmParameterSpec);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        update(bArr, i, i2);
        return 0;
    }

    public final void initEncrypt(Key key, SecureRandom secureRandom) {
        try {
            initEncrypt(key, null, secureRandom);
        } catch (InvalidAlgorithmParameterException unused) {
            Mod$$ExternalSyntheticBUOutline0.m$4("This cipher needs algorithm parameters for initialization (cannot be null).");
        }
    }

    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec) {
        initEncrypt(key, algorithmParameterSpec, CryptoServicesRegistrar.getSecureRandom());
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        this.opMode = 1;
        initCipherEncrypt(key, algorithmParameterSpec, secureRandom);
    }

    @Override // org.bouncycastle.pqc.jcajce.provider.util.CipherSpiExt
    public final int doFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        if (bArr2.length < getOutputSize(i2)) {
            throw new ShortBufferException("Output buffer too short.");
        }
        byte[] doFinal = doFinal(bArr, i, i2);
        System.arraycopy(doFinal, 0, bArr2, i3, doFinal.length);
        return doFinal.length;
    }
}
