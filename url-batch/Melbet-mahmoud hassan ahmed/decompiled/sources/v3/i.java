package v3;

import androidx.annotation.RecentlyNonNull;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f22825a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f22826b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @RecentlyNonNull
    public static String a(@RecentlyNonNull byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i7 = 0;
        for (byte b7 : bArr) {
            int i8 = b7 & 255;
            int i9 = i7 + 1;
            char[] cArr2 = f22826b;
            cArr[i7] = cArr2[i8 >>> 4];
            i7 = i9 + 1;
            cArr[i9] = cArr2[i8 & 15];
        }
        return new String(cArr);
    }

    @RecentlyNonNull
    public static byte[] b(@RecentlyNonNull String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("Hex string has odd number of characters");
        }
        byte[] bArr = new byte[length / 2];
        int i7 = 0;
        while (i7 < length) {
            int i8 = i7 + 2;
            bArr[i7 / 2] = (byte) Integer.parseInt(str.substring(i7, i8), 16);
            i7 = i8;
        }
        return bArr;
    }
}
