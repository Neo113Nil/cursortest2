package org.bouncycastle.util;

import com.baidu.location.BDLocation;
import org.bouncycastle.crypto.digests.l;
import org.bouncycastle.crypto.digests.m;

/* loaded from: classes5.dex */
public class d {
    private static char[] encodingTable = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private final byte[] fingerprint;

    public d(byte[] bArr) {
        this(bArr, BDLocation.TypeCoarseLocation);
    }

    public static byte[] calculateFingerprint(byte[] bArr) {
        return calculateFingerprint(bArr, BDLocation.TypeCoarseLocation);
    }

    public static byte[] calculateFingerprintSHA512_160(byte[] bArr) {
        l lVar = new l(BDLocation.TypeCoarseLocation);
        lVar.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[lVar.getDigestSize()];
        lVar.doFinal(bArr2, 0);
        return bArr2;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return a.areEqual(((d) obj).fingerprint, this.fingerprint);
        }
        return false;
    }

    public byte[] getFingerprint() {
        return a.clone(this.fingerprint);
    }

    public int hashCode() {
        return a.hashCode(this.fingerprint);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i8 = 0; i8 != this.fingerprint.length; i8++) {
            if (i8 > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(encodingTable[(this.fingerprint[i8] >>> 4) & 15]);
            stringBuffer.append(encodingTable[this.fingerprint[i8] & 15]);
        }
        return stringBuffer.toString();
    }

    public d(byte[] bArr, int i8) {
        this.fingerprint = calculateFingerprint(bArr, i8);
    }

    public static byte[] calculateFingerprint(byte[] bArr, int i8) {
        if (i8 % 8 != 0) {
            throw new IllegalArgumentException("bitLength must be a multiple of 8");
        }
        m mVar = new m(256);
        mVar.update(bArr, 0, bArr.length);
        int i9 = i8 / 8;
        byte[] bArr2 = new byte[i9];
        mVar.doFinal(bArr2, 0, i9);
        return bArr2;
    }

    public d(byte[] bArr, boolean z7) {
        if (z7) {
            this.fingerprint = calculateFingerprintSHA512_160(bArr);
        } else {
            this.fingerprint = calculateFingerprint(bArr);
        }
    }
}
