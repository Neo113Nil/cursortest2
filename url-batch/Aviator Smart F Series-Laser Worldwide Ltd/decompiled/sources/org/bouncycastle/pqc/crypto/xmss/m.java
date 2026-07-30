package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
final class m {
    private byte[][] signature;

    protected m(j jVar, byte[][] bArr) {
        if (jVar == null) {
            throw new NullPointerException("params == null");
        }
        if (bArr == null) {
            throw new NullPointerException("signature == null");
        }
        if (z.hasNullPointer(bArr)) {
            throw new NullPointerException("signature byte array == null");
        }
        if (bArr.length != jVar.getLen()) {
            throw new IllegalArgumentException("wrong signature size");
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2.length != jVar.getTreeDigestSize()) {
                throw new IllegalArgumentException("wrong signature format");
            }
        }
        this.signature = z.cloneArray(bArr);
    }

    public byte[][] toByteArray() {
        return z.cloneArray(this.signature);
    }
}
