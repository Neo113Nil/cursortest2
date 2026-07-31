package w0;

import kotlin.KotlinVersion;

/* renamed from: w0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC3483a {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f46570a = "0123456789ABCDEF".toCharArray();

    private static byte[] a(char[] cArr) {
        if ((cArr.length & 1) != 0) {
            throw new IllegalArgumentException("Odd number of characters.");
        }
        byte[] bArr = new byte[cArr.length >> 1];
        int i4 = 0;
        int i5 = 0;
        while (i4 < cArr.length) {
            int digit = Character.digit(cArr[i4], 16);
            if (digit == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i4);
            }
            int i6 = i4 + 1;
            int digit2 = Character.digit(cArr[i6], 16);
            if (digit2 == -1) {
                throw new IllegalArgumentException("Illegal hexadecimal character at index " + i6);
            }
            i4 += 2;
            bArr[i5] = (byte) (((digit << 4) | digit2) & KotlinVersion.MAX_COMPONENT_VALUE);
            i5++;
        }
        return bArr;
    }

    public static byte[] b(String str) {
        return a(str.toCharArray());
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b4 : bArr) {
            char[] cArr = f46570a;
            sb.append(cArr[(b4 >> 4) & 15]);
            sb.append(cArr[b4 & 15]);
        }
        return sb.toString();
    }
}
