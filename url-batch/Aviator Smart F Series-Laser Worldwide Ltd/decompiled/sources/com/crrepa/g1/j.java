package com.crrepa.g1;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f12925a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f12926b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private static MessageDigest f12927c;

    static {
        try {
            f12927c = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
        }
    }

    public static byte a(char c8) {
        return (byte) "0123456789ABCDEF".indexOf(c8);
    }

    public static String b(byte[] bArr, boolean z7) {
        return b(bArr, z7 ? f12925a : f12926b);
    }

    public static String c(byte[] bArr) {
        return b(bArr, true);
    }

    protected static int a(char c8, int i8) {
        int digit = Character.digit(c8, 16);
        if (digit != -1) {
            return digit;
        }
        throw new RuntimeException("Illegal hexadecimal character " + c8 + " at index " + i8);
    }

    protected static String b(byte[] bArr, char[] cArr) {
        return new String(a(bArr, cArr));
    }

    public static String a(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read <= 0) {
                fileInputStream.close();
                return a(f12927c.digest());
            }
            f12927c.update(bArr, 0, read);
        }
    }

    public static char[] b(byte[] bArr) {
        return a(bArr, true);
    }

    private static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i8) {
        return c(new byte[]{bArr[i8]});
    }

    private static String a(byte[] bArr, int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer(i9 * 2);
        int i10 = i9 + i8;
        while (i8 < i10) {
            a(bArr[i8], stringBuffer);
            i8++;
        }
        return stringBuffer.toString();
    }

    private static void a(byte b8, StringBuffer stringBuffer) {
        char[] cArr = f12925a;
        char c8 = cArr[(b8 & 240) >> 4];
        char c9 = cArr[b8 & 15];
        stringBuffer.append(c8);
        stringBuffer.append(c9);
    }

    public static boolean a(String str, File file) {
        String str2;
        if (!TextUtils.isEmpty(str) && file != null && file.exists()) {
            try {
                str2 = a(file);
            } catch (IOException e8) {
                e8.printStackTrace();
                str2 = null;
            }
            if (str2 != null && TextUtils.equals(str.toLowerCase(), str2.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public static byte[] a(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) (a(charArray[i9 + 1]) | (a(charArray[i9]) << 4));
        }
        return bArr;
    }

    public static byte[] a(char[] cArr) {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new RuntimeException("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i8 = 0;
        int i9 = 0;
        while (i8 < length) {
            int i10 = i8 + 1;
            int a8 = (a(cArr[i8], i8) << 4) | a(cArr[i10], i10);
            i8 += 2;
            bArr[i9] = (byte) (a8 & 255);
            i9++;
        }
        return bArr;
    }

    public static char[] a(byte[] bArr, boolean z7) {
        return a(bArr, z7 ? f12925a : f12926b);
    }

    protected static char[] a(byte[] bArr, char[] cArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr2 = new char[bArr.length << 1];
        int i8 = 0;
        for (byte b8 : bArr) {
            int i9 = i8 + 1;
            cArr2[i8] = cArr[(b8 & 240) >>> 4];
            i8 += 2;
            cArr2[i9] = cArr[b8 & 15];
        }
        return cArr2;
    }
}
