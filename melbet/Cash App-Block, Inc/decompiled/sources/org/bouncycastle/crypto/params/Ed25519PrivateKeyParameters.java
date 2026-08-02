package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import java.security.SecureRandom;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.math.ec.rfc8032.Ed25519;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public final class Ed25519PrivateKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    public static final int SIGNATURE_SIZE = 64;
    private Ed25519PublicKeyParameters cachedPublicKey;
    private final byte[] data;

    public Ed25519PrivateKeyParameters(InputStream inputStream) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        if (32 == Streams.readFully(inputStream, bArr)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of Ed25519 private key");
        throw null;
    }

    private static byte[] validate(byte[] bArr) {
        if (bArr.length == 32) {
            return bArr;
        }
        a$$ExternalSyntheticBUOutline0.m$3("'buf' must have length 32");
        return null;
    }

    public void encode(byte[] bArr, int i) {
        System.arraycopy(this.data, 0, bArr, i, 32);
    }

    public Ed25519PublicKeyParameters generatePublicKey() {
        Ed25519PublicKeyParameters ed25519PublicKeyParameters;
        synchronized (this.data) {
            try {
                if (this.cachedPublicKey == null) {
                    this.cachedPublicKey = new Ed25519PublicKeyParameters(Ed25519.generatePublicKey(this.data, 0));
                }
                ed25519PublicKeyParameters = this.cachedPublicKey;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ed25519PublicKeyParameters;
    }

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public void sign(int i, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        byte[] bArr4 = new byte[32];
        generatePublicKey().encode(bArr4, 0);
        if (i == 0) {
            if (bArr == null) {
                Ed25519.sign(this.data, 0, bArr4, 0, bArr2, i2, i3, bArr3, i4);
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("ctx");
                return;
            }
        }
        if (i == 1) {
            if (bArr == null) {
                a$$ExternalSyntheticBUOutline0.m$2("'ctx' cannot be null");
                return;
            } else if (bArr.length <= 255) {
                Ed25519.sign(this.data, 0, bArr4, 0, bArr, bArr2, i2, i3, bArr3, i4);
                return;
            } else {
                a$$ExternalSyntheticBUOutline0.m$3("ctx");
                return;
            }
        }
        if (i != 2) {
            a$$ExternalSyntheticBUOutline0.m$3("algorithm");
            return;
        }
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$2("'ctx' cannot be null");
            return;
        }
        if (bArr.length > 255) {
            a$$ExternalSyntheticBUOutline0.m$3("ctx");
        } else if (64 == i3) {
            Ed25519.signPrehash(this.data, 0, bArr4, 0, bArr, bArr2, i2, bArr3, i4);
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("msgLen");
        }
    }

    public Ed25519PrivateKeyParameters(SecureRandom secureRandom) {
        super(true);
        byte[] bArr = new byte[32];
        this.data = bArr;
        Ed25519.generatePrivateKey(secureRandom, bArr);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public Ed25519PrivateKeyParameters(byte[] bArr, int i) {
        super(true);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }

    public void sign(int i, Ed25519PublicKeyParameters ed25519PublicKeyParameters, byte[] bArr, byte[] bArr2, int i2, int i3, byte[] bArr3, int i4) {
        sign(i, bArr, bArr2, i2, i3, bArr3, i4);
    }
}
