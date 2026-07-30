package com.crrepa.g1;

import android.text.TextUtils;
import java.nio.charset.Charset;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12913a = "0123456789abcdef";

    public static byte a(char c8) {
        return (byte) f12913a.indexOf(c8);
    }

    public static int b(byte b8, byte b9) {
        return ((b8 & 255) << 8) + (b9 & 255);
    }

    public static String c(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
            sb.append(cn.hutool.core.text.l.SPACE);
        }
        return sb.toString();
    }

    public static int d(byte[] bArr) {
        return ((bArr[0] & 255) << 24) + ((bArr[1] & 255) << 16) + ((bArr[2] & 255) << 8) + (bArr[3] & 255);
    }

    public static int e(byte[] bArr) {
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static long f(byte[] bArr) {
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static long g(byte[] bArr) {
        return ((bArr[3] & 255) << 24) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
    }

    public static boolean h(byte[] bArr) {
        return bArr == null || bArr.length == 0;
    }

    private static boolean i(byte[] bArr) {
        for (byte b8 : bArr) {
            if (b8 != -1) {
                return true;
            }
        }
        return false;
    }

    public static int j(byte[] bArr) {
        byte b8 = bArr[3];
        int i8 = ((b8 << 25) >> 1) + ((bArr[2] & 255) << 16) + ((bArr[1] & 255) << 8) + (bArr[0] & 255);
        return b8 < 0 ? -i8 : i8;
    }

    public static int k(byte[] bArr) {
        if (!i(bArr)) {
            return 0;
        }
        return ((bArr[2] << 24) >>> 8) | (bArr[0] & 255) | ((bArr[1] << 8) & 65280);
    }

    public static String l(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            sb.append(f12913a.charAt(b8 % 16));
        }
        return sb.toString();
    }

    public static int a(byte b8) {
        return b8 & 255;
    }

    public static int b(String str) {
        int length = str.length();
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            if (a(str.charAt(i9)) > 0) {
                i8 = (int) (i8 + Math.pow(2.0d, (length - i9) - 1));
            }
        }
        return i8;
    }

    public static byte[] c(long j8) {
        return new byte[]{(byte) ((j8 >> 24) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 8) & 255), (byte) (j8 & 255)};
    }

    public static byte[] d(long j8) {
        return new byte[]{(byte) j8, (byte) (j8 >> 8), (byte) (j8 >> 16), (byte) (j8 >> 24)};
    }

    public static int a(byte b8, byte b9) {
        return (b8 << 8) | (b9 & 255);
    }

    public static String b(byte[] bArr) {
        if (bArr == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static int a(byte[] bArr) {
        return ((bArr[0] << 24) >>> 8) | (bArr[2] & 255) | ((bArr[1] << 8) & 65280);
    }

    public static byte[] b(int i8) {
        return new byte[]{(byte) ((i8 >> 8) & 255), (byte) (i8 & 255)};
    }

    public static int a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null && bArr.length != 0 && bArr2.length != 0) {
            for (int i8 = 0; i8 < bArr.length; i8++) {
                if (bArr[i8] == bArr2[0] && bArr2.length + i8 < bArr.length) {
                    int i9 = 1;
                    while (i9 < bArr2.length && bArr[i8 + i9] == bArr2[i9]) {
                        i9++;
                    }
                    if (i9 == bArr2.length) {
                        return i8;
                    }
                }
            }
        }
        return -1;
    }

    public static byte[] b(long j8) {
        return new byte[]{(byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255)};
    }

    public static byte[] a(int i8) {
        return new byte[]{(byte) (i8 & 255), (byte) ((i8 >> 8) & 255)};
    }

    public static byte[] a(long j8) {
        return new byte[]{(byte) (j8 & 255), (byte) ((j8 >> 8) & 255), (byte) ((j8 >> 16) & 255), (byte) ((j8 >> 24) & 255), (byte) ((j8 >> 32) & 255), (byte) ((j8 >> 40) & 255), (byte) ((j8 >> 48) & 255), (byte) ((j8 >> 56) & 255)};
    }

    public static byte[] a(String str) {
        byte[] bArr = new byte[6];
        String[] split = str.split(":");
        for (int i8 = 0; i8 < split.length; i8++) {
            bArr[i8] = (byte) Integer.parseInt(split[i8], 16);
        }
        return bArr;
    }

    public static byte[] a(String str, int i8, Charset charset) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (i8 < str.length()) {
            str = str.substring(0, i8);
        }
        while (i8 < str.getBytes(charset).length) {
            str = str.substring(0, str.length() - 1);
        }
        return str.getBytes(charset);
    }
}
