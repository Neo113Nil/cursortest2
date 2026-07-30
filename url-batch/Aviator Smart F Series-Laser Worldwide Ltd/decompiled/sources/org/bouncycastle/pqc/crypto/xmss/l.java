package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
final class l {
    private final byte[][] publicKey;

    protected l(j jVar, byte[][] bArr) {
        if (jVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("publicKey == null");
        }
        if (z.hasNullPointer(bArr)) {
            throw new NullPointerException("publicKey byte array == null");
        }
        if (bArr.length != jVar.getLen()) {
            throw new IllegalArgumentException("wrong publicKey size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != jVar.getTreeDigestSize()) {
                throw new IllegalArgumentException("wrong publicKey format");
            }
        }
        this.publicKey = z.cloneArray(bArr);
    }

    protected byte[][] toByteArray() {
        return z.cloneArray(this.publicKey);
    }
}
