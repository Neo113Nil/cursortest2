package E2;

/* renamed from: E2.t, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract /* synthetic */ class AbstractC0388t {
    public static /* synthetic */ String a(long j4, int i4) {
        if (j4 == 0) {
            return "0";
        }
        if (j4 > 0) {
            return Long.toString(j4, i4);
        }
        if (i4 < 2 || i4 > 36) {
            i4 = 10;
        }
        int i5 = 64;
        char[] cArr = new char[64];
        int i6 = i4 - 1;
        if ((i4 & i6) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4);
            do {
                i5--;
                cArr[i5] = Character.forDigit(((int) j4) & i6, i4);
                j4 >>>= numberOfTrailingZeros;
            } while (j4 != 0);
        } else {
            long a4 = (i4 & 1) == 0 ? (j4 >>> 1) / (i4 >>> 1) : kotlin.text.r.a(j4, i4);
            long j5 = i4;
            cArr[63] = Character.forDigit((int) (j4 - (a4 * j5)), i4);
            i5 = 63;
            while (a4 > 0) {
                i5--;
                cArr[i5] = Character.forDigit((int) (a4 % j5), i4);
                a4 /= j5;
            }
        }
        return new String(cArr, i5, 64 - i5);
    }
}
