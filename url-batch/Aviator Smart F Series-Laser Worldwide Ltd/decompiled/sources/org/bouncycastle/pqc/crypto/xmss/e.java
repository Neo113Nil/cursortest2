package org.bouncycastle.pqc.crypto.xmss;

/* loaded from: classes5.dex */
final class e {
    private final org.bouncycastle.crypto.e digest;
    private final int digestSize;

    protected e(org.bouncycastle.asn1.o oVar, int i8) {
        if (oVar == null) {
            throw new NullPointerException("digest == null");
        }
        this.digest = c.getDigest(oVar);
        this.digestSize = i8;
    }

    private byte[] coreDigest(int i8, byte[] bArr, byte[] bArr2) {
        byte[] bytesBigEndian = z.toBytesBigEndian(i8, this.digestSize);
        this.digest.update(bytesBigEndian, 0, bytesBigEndian.length);
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        int i9 = this.digestSize;
        byte[] bArr3 = new byte[i9];
        org.bouncycastle.crypto.e eVar = this.digest;
        if (eVar instanceof org.bouncycastle.crypto.i) {
            ((org.bouncycastle.crypto.i) eVar).doFinal(bArr3, 0, i9);
        } else {
            eVar.doFinal(bArr3, 0);
        }
        return bArr3;
    }

    protected byte[] F(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.digestSize;
        if (length != i8) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i8) {
            return coreDigest(0, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] H(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i8 = this.digestSize;
        if (length != i8) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == i8 * 2) {
            return coreDigest(1, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong in length");
    }

    protected byte[] HMsg(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.digestSize * 3) {
            return coreDigest(2, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong key length");
    }

    protected byte[] PRF(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.digestSize) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length == 32) {
            return coreDigest(3, bArr, bArr2);
        }
        throw new IllegalArgumentException("wrong address length");
    }
}
