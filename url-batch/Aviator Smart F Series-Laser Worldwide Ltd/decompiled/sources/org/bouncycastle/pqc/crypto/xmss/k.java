package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
final class k {
    private final byte[][] privateKey;

    protected k(j jVar, byte[][] bArr) {
        if (jVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("privateKey == null");
        }
        if (z.hasNullPointer(bArr)) {
            throw new NullPointerException("privateKey byte array == null");
        }
        if (bArr.length != jVar.getLen()) {
            throw new IllegalArgumentException("wrong privateKey format");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != jVar.getTreeDigestSize()) {
                throw new IllegalArgumentException("wrong privateKey format");
            }
        }
        this.privateKey = z.cloneArray(bArr);
    }

    protected byte[][] toByteArray() {
        return z.cloneArray(this.privateKey);
    }
}
