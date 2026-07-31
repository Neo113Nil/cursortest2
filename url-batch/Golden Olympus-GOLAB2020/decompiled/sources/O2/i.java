package O2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public class i {
    public int a(S2.d dVar) {
        return (dVar.e() + 7) / 8;
    }

    public byte[] b(BigInteger bigInteger, int i4) {
        byte[] byteArray = bigInteger.toByteArray();
        if (i4 < byteArray.length) {
            byte[] bArr = new byte[i4];
            System.arraycopy(byteArray, byteArray.length - i4, bArr, 0, i4);
            return bArr;
        }
        if (i4 <= byteArray.length) {
            return byteArray;
        }
        byte[] bArr2 = new byte[i4];
        System.arraycopy(byteArray, 0, bArr2, i4 - byteArray.length, byteArray.length);
        return bArr2;
    }
}
