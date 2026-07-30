package org.bouncycastle.asn1.x9;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class j {
    public int getByteLength(org.bouncycastle.math.ec.e eVar) {
        return (eVar.getFieldSize() + 7) / 8;
    }

    public byte[] integerToBytes(BigInteger bigInteger, int i8) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i8 < byteArray.length) {
            byte[] bArr = new byte[i8];
            System.arraycopy(byteArray, byteArray.length - i8, bArr, 0, i8);
            return bArr;
        }
        if (i8 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(byteArray, 0, bArr2, i8 - byteArray.length, byteArray.length);
        return bArr2;
    }

    public int getByteLength(org.bouncycastle.math.ec.f fVar) {
        return (fVar.getFieldSize() + 7) / 8;
    }
}
