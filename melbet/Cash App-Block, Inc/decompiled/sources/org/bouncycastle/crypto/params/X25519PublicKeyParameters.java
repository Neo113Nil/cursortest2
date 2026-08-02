package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.InputStream;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.io.Streams;

/* loaded from: classes9.dex */
public final class X25519PublicKeyParameters extends AsymmetricKeyParameter {
    public static final int KEY_SIZE = 32;
    private final byte[] data;

    public X25519PublicKeyParameters(InputStream inputStream) {
        super(false);
        byte[] bArr = new byte[32];
        this.data = bArr;
        if (32 == Streams.readFully(inputStream, bArr)) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$1("EOF encountered in middle of X25519 public key");
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

    public byte[] getEncoded() {
        return Arrays.clone(this.data);
    }

    public X25519PublicKeyParameters(byte[] bArr) {
        this(validate(bArr), 0);
    }

    public X25519PublicKeyParameters(byte[] bArr, int i) {
        super(false);
        byte[] bArr2 = new byte[32];
        this.data = bArr2;
        System.arraycopy(bArr, i, bArr2, 0, 32);
    }
}
