package org.bouncycastle.pqc.jcajce.provider.util;

import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.CipherSpi;

/* loaded from: classes10.dex */
public abstract class CipherSpiExt extends CipherSpi {
    public static final int DECRYPT_MODE = 2;
    public static final int ENCRYPT_MODE = 1;
    protected int opMode;

    public abstract int doFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public final byte[] doFinal() {
        return doFinal(null, 0, 0);
    }

    public abstract byte[] doFinal(byte[] bArr, int i, int i2);

    @Override // javax.crypto.CipherSpi
    public final int engineDoFinal(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return doFinal(bArr, i, i2, bArr2, i3);
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetBlockSize() {
        return getBlockSize();
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineGetIV() {
        return getIV();
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetKeySize(Key key) {
        if (key != null) {
            return getKeySize(key);
        }
        AesGcmSiv$$ExternalSyntheticLambda0.m$2("Unsupported key.");
        return 0;
    }

    @Override // javax.crypto.CipherSpi
    public final int engineGetOutputSize(int i) {
        return getOutputSize(i);
    }

    @Override // javax.crypto.CipherSpi
    public final AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override // javax.crypto.CipherSpi
    public void engineInit(int i, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) {
        if (key == null) {
            throw new InvalidKeyException();
        }
        this.opMode = i;
        if (i == 1) {
            initEncrypt(key, algorithmParameterSpec, secureRandom);
        } else if (i == 2) {
            initDecrypt(key, algorithmParameterSpec);
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetMode(String str) {
        setMode(str);
    }

    @Override // javax.crypto.CipherSpi
    public final void engineSetPadding(String str) {
        setPadding(str);
    }

    @Override // javax.crypto.CipherSpi
    public final int engineUpdate(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        return update(bArr, i, i2, bArr2, i3);
    }

    public abstract int getBlockSize();

    public abstract byte[] getIV();

    public abstract int getKeySize(Key key);

    public abstract String getName();

    public abstract int getOutputSize(int i);

    public abstract AlgorithmParameterSpec getParameters();

    public abstract void initDecrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec);

    public abstract void initEncrypt(Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom);

    public abstract void setMode(String str);

    public abstract void setPadding(String str);

    public abstract int update(byte[] bArr, int i, int i2, byte[] bArr2, int i3);

    public final byte[] update(byte[] bArr) {
        return update(bArr, 0, bArr.length);
    }

    public abstract byte[] update(byte[] bArr, int i, int i2);

    @Override // javax.crypto.CipherSpi
    public final byte[] engineDoFinal(byte[] bArr, int i, int i2) {
        return doFinal(bArr, i, i2);
    }

    @Override // javax.crypto.CipherSpi
    public final byte[] engineUpdate(byte[] bArr, int i, int i2) {
        return update(bArr, i, i2);
    }

    public final byte[] doFinal(byte[] bArr) {
        return doFinal(bArr, 0, bArr.length);
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, SecureRandom secureRandom) {
        try {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        } catch (InvalidAlgorithmParameterException e) {
            throw new InvalidParameterException(e.getMessage());
        }
    }

    @Override // javax.crypto.CipherSpi
    public final void engineInit(int i, Key key, AlgorithmParameters algorithmParameters, SecureRandom secureRandom) {
        if (algorithmParameters == null) {
            engineInit(i, key, secureRandom);
        } else {
            engineInit(i, key, (AlgorithmParameterSpec) null, secureRandom);
        }
    }
}
