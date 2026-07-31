package Z2;

import java.math.BigInteger;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final BigInteger f9751a = BigInteger.valueOf(0);

    public static BigInteger a(byte[] bArr, int i4, int i5) {
        if (i4 != 0 || i5 != bArr.length) {
            byte[] bArr2 = new byte[i5];
            System.arraycopy(bArr, i4, bArr2, 0, i5);
            bArr = bArr2;
        }
        return new BigInteger(1, bArr);
    }
}
