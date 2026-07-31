package a4;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f3143a;

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f3144b;

    /* renamed from: c, reason: collision with root package name */
    public static final boolean[] f3145c;

    static {
        char[] cArr = new char[512];
        for (int i7 = 0; i7 < 256; i7++) {
            cArr[i7] = "0123456789abcdef".charAt(i7 >>> 4);
            cArr[i7 | 256] = "0123456789abcdef".charAt(i7 & 15);
        }
        f3143a = cArr;
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i8 = 0; i8 < 16; i8++) {
            bArr["0123456789abcdef".charAt(i8)] = (byte) i8;
        }
        f3144b = bArr;
        boolean[] zArr = new boolean[65535];
        int i9 = 0;
        while (i9 < 65535) {
            zArr[i9] = (48 <= i9 && i9 <= 57) || (97 <= i9 && i9 <= 102);
            i9++;
        }
        f3145c = zArr;
    }

    public static void a(CharSequence charSequence, int i7, byte[] bArr) {
        byte[] bArr2;
        byte b7;
        byte b8;
        for (int i8 = 0; i8 < i7; i8 += 2) {
            int i9 = i8 / 2;
            char charAt = charSequence.charAt(i8);
            char charAt2 = charSequence.charAt(i8 + 1);
            if (charAt >= 128 || (b7 = (bArr2 = f3144b)[charAt]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt);
            }
            if (charAt2 >= 128 || (b8 = bArr2[charAt2]) == -1) {
                throw new IllegalArgumentException("invalid character " + charAt2);
            }
            bArr[i9] = (byte) (b8 | (b7 << 4));
        }
    }
}
