package org.bouncycastle.crypto.params;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.util.Arrays;

/* loaded from: classes9.dex */
public class Blake3Parameters implements CipherParameters {
    private static final int KEYLEN = 32;
    private byte[] theContext;
    private byte[] theKey;

    public static Blake3Parameters context(byte[] bArr) {
        if (bArr == null) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid context");
            return null;
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theContext = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public static Blake3Parameters key(byte[] bArr) {
        if (bArr == null || bArr.length != 32) {
            a$$ExternalSyntheticBUOutline0.m$3("Invalid keyLength");
            return null;
        }
        Blake3Parameters blake3Parameters = new Blake3Parameters();
        blake3Parameters.theKey = Arrays.clone(bArr);
        return blake3Parameters;
    }

    public void clearKey() {
        Arrays.fill(this.theKey, (byte) 0);
    }

    public byte[] getContext() {
        return Arrays.clone(this.theContext);
    }

    public byte[] getKey() {
        return Arrays.clone(this.theKey);
    }
}
