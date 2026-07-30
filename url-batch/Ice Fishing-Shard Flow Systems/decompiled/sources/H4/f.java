package H4;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f994a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f995b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f996c;

    static {
        char[] cArr = new char[512];
        for (int i2 = 0; i2 < 256; i2++) {
            cArr[i2] = "0123456789abcdef".charAt(i2 >>> 4);
            cArr[i2 | 256] = "0123456789abcdef".charAt(i2 & 15);
        }
        f994a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i5 = 0; i5 < 16; i5++) {
            bArr["0123456789abcdef".charAt(i5)] = (byte) i5;
        }
        f995b = bArr;
        boolean[] zArr = new boolean[65535];
        int i7 = 0;
        while (i7 < 65535) {
            zArr[i7] = (48 <= i7 && i7 <= 57) || (97 <= i7 && i7 <= 102);
            i7++;
        }
        f996c = zArr;
    }

    public static void a(CharSequence charSequence, int i2, byte[] bArr) {
        byte[] bArr2;
        byte b7;
        byte b8;
        for (int i5 = 0; i5 < i2; i5 += 2) {
            int i7 = i5 / 2;
            char charAt = charSequence.charAt(i5);
            char charAt2 = charSequence.charAt(i5 + 1);
            if (charAt >= 128 || (b7 = (bArr2 = f995b)[charAt]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt);
            }
            if (charAt2 >= 128 || (b8 = bArr2[charAt2]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt2);
            }
            bArr[i7] = (byte) (b8 | (b7 << 4));
        }
    }
}
