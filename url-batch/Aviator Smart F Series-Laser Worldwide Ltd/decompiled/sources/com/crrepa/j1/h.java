package com.crrepa.j1;

import android.content.Context;
import cn.hutool.core.text.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Locale;
import java.util.Properties;
import java.util.concurrent.Semaphore;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: b, reason: collision with root package name */
    public static boolean f13040b = false;

    /* renamed from: a, reason: collision with root package name */
    private Semaphore f13041a = new Semaphore(1);

    public static float a(Context context, float f8) {
        return f8 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static int b(Context context, float f8) {
        return (int) (f8 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
    }

    public static String d(String str) {
        char[] charArray = "0123456789ABCDEF".toCharArray();
        StringBuilder sb = new StringBuilder("");
        byte[] bytes = str.getBytes();
        for (int i8 = 0; i8 < bytes.length; i8++) {
            sb.append(charArray[(bytes[i8] & 240) >> 4]);
            sb.append(charArray[bytes[i8] & 15]);
            sb.append(' ');
        }
        return sb.toString().trim();
    }

    public static byte[] e(String str) {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("this hexString must not be empty");
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        int length = lowerCase.length() / 2;
        byte[] bArr = new byte[length];
        int i8 = 0;
        for (int i9 = 0; i9 < length; i9++) {
            bArr[i9] = (byte) ((((byte) (Character.digit(lowerCase.charAt(i8), 16) & 255)) << 4) | ((byte) (Character.digit(lowerCase.charAt(i8 + 1), 16) & 255)));
            i8 += 2;
        }
        return bArr;
    }

    public float c(Context context, float f8) {
        return f8 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static int a(String str) {
        return Integer.parseInt(new BigInteger(str, 2).toString(), 16);
    }

    public static int b(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return 0;
        }
        return ((bArr[3] & 255) << 24) | (bArr[0] & 255) | ((bArr[1] & 255) << 8) | ((bArr[2] & 255) << 16);
    }

    public static String c(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString + l.SPACE);
        }
        return sb.toString();
    }

    public static void d(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return;
        }
        int length = bArr.length - 1;
        for (int i8 = 0; i8 < bArr.length / 2; i8++) {
            byte b8 = bArr[i8];
            bArr[i8] = bArr[length];
            bArr[length] = b8;
            length--;
        }
    }

    public static int a(byte[] bArr) {
        if (bArr == null || bArr.length != 4) {
            return 0;
        }
        return ((bArr[0] & 255) << 24) | (bArr[3] & 255) | ((bArr[2] & 255) << 8) | ((bArr[1] & 255) << 16);
    }

    public static String b(String str) {
        char[] charArray = str.toCharArray();
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 * 2;
            bArr[i8] = (byte) ((("0123456789ABCDEF".indexOf(charArray[i9]) * 16) + "0123456789ABCDEF".indexOf(charArray[i9 + 1])) & 255);
        }
        return new String(bArr);
    }

    public byte[] c(String str) {
        FileInputStream fileInputStream = new FileInputStream(new File(str));
        byte[] bArr = new byte[fileInputStream.available()];
        fileInputStream.read(bArr);
        fileInputStream.close();
        return bArr;
    }

    public static String a(int i8) {
        return new BigInteger(String.valueOf(i8)).toString(2);
    }

    public static void b(long j8, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return;
        }
        bArr[0] = (byte) (j8 & 255);
        bArr[1] = (byte) ((j8 >> 8) & 255);
        bArr[2] = (byte) ((j8 >> 16) & 255);
        bArr[3] = (byte) ((j8 >> 24) & 255);
    }

    public static String a(String str, int i8) {
        StringBuilder sb = new StringBuilder();
        int length = i8 > str.length() ? i8 - str.length() : 0;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 < length) {
                sb.append("0");
            } else {
                sb.append(str.charAt(i9 - length));
            }
        }
        return sb.toString();
    }

    public void b(String str, String str2) {
        try {
            this.f13041a.acquire();
        } catch (InterruptedException e8) {
            e8.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter(str, true);
            fileWriter.write(str2);
            fileWriter.close();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        this.f13041a.release();
    }

    public Properties a(Context context, String str) {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream(str));
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return properties;
    }

    public static void a(int i8, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            return;
        }
        bArr[0] = (byte) (i8 & 255);
        bArr[1] = (byte) ((i8 >> 8) & 255);
        bArr[2] = (byte) ((i8 >> 16) & 255);
        bArr[3] = (byte) ((i8 >> 24) & 255);
    }

    public static void a(long j8, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            return;
        }
        bArr[0] = (byte) (j8 & 255);
        bArr[1] = (byte) ((j8 >> 8) & 255);
    }

    public void a(Context context, String str, Properties properties) {
        try {
            properties.store(new FileOutputStream(str, false), "");
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public void a(String str, String str2) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        fileOutputStream.write(str2.getBytes());
        fileOutputStream.close();
    }

    public void a(String str, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(str));
        fileOutputStream.write(bArr);
        fileOutputStream.close();
    }

    public static void a(byte[] bArr, int i8, byte b8, int i9) {
        if (bArr.length < i8 + i9) {
            return;
        }
        while (i8 < i9) {
            bArr[i8] = 0;
            i8++;
        }
    }

    public static boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i8 = 0; i8 < bArr.length; i8++) {
            if (bArr[i8] != bArr2[i8]) {
                return false;
            }
        }
        return true;
    }
}
