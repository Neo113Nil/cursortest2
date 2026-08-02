package org.bouncycastle.pqc.crypto.xmss;

import bo.app.a$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Xof;

/* loaded from: classes10.dex */
final class KeyedHashFunctions {
    private final Digest digest;
    private final int digestSize;

    public KeyedHashFunctions(ASN1ObjectIdentifier aSN1ObjectIdentifier, int i) {
        if (aSN1ObjectIdentifier == null) {
            a$$ExternalSyntheticBUOutline0.m$2("digest == null");
            throw null;
        }
        this.digest = DigestUtil.getDigest(aSN1ObjectIdentifier);
        this.digestSize = i;
    }

    private byte[] coreDigest(int i, byte[] bArr, byte[] bArr2) {
        byte[] bytesBigEndian = XMSSUtil.toBytesBigEndian(i, this.digestSize);
        this.digest.update(bytesBigEndian, 0, bytesBigEndian.length);
        this.digest.update(bArr, 0, bArr.length);
        this.digest.update(bArr2, 0, bArr2.length);
        int i2 = this.digestSize;
        byte[] bArr3 = new byte[i2];
        Digest digest = this.digest;
        if (digest instanceof Xof) {
            ((Xof) digest).doFinal(bArr3, 0, i2);
            return bArr3;
        }
        digest.doFinal(bArr3, 0);
        return bArr3;
    }

    public byte[] F(byte[] bArr, byte[] bArr2) {
        String str;
        int length = bArr.length;
        int i = this.digestSize;
        if (length != i) {
            str = "wrong key length";
        } else {
            if (bArr2.length == i) {
                return coreDigest(0, bArr, bArr2);
            }
            str = "wrong in length";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public byte[] H(byte[] bArr, byte[] bArr2) {
        String str;
        int length = bArr.length;
        int i = this.digestSize;
        if (length != i) {
            str = "wrong key length";
        } else {
            if (bArr2.length == i * 2) {
                return coreDigest(1, bArr, bArr2);
            }
            str = "wrong in length";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }

    public byte[] HMsg(byte[] bArr, byte[] bArr2) {
        if (bArr.length == this.digestSize * 3) {
            return coreDigest(2, bArr, bArr2);
        }
        a$$ExternalSyntheticBUOutline0.m$3("wrong key length");
        return null;
    }

    public byte[] PRF(byte[] bArr, byte[] bArr2) {
        String str;
        if (bArr.length != this.digestSize) {
            str = "wrong key length";
        } else {
            if (bArr2.length == 32) {
                return coreDigest(3, bArr, bArr2);
            }
            str = "wrong address length";
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
        return null;
    }
}
