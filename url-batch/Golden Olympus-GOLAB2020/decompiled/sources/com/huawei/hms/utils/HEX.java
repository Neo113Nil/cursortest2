package com.huawei.hms.utils;

/* loaded from: classes.dex */
public final class HEX {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f14440a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f14441b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private HEX() {
    }

    private static char[] a(byte[] bArr, char[] cArr) {
        if (bArr == null) {
            return new char[0];
        }
        char[] cArr2 = new char[bArr.length << 1];
        int i4 = 0;
        for (byte b4 : bArr) {
            int i5 = i4 + 1;
            cArr2[i4] = cArr[(b4 & 240) >>> 4];
            i4 += 2;
            cArr2[i5] = cArr[b4 & 15];
        }
        return cArr2;
    }

    public static char[] encodeHex(byte[] bArr) {
        return encodeHex(bArr, false);
    }

    public static String encodeHexString(byte[] bArr, boolean z4) {
        return new String(encodeHex(bArr, z4));
    }

    public static char[] encodeHex(byte[] bArr, boolean z4) {
        return a(bArr, z4 ? f14441b : f14440a);
    }
}
