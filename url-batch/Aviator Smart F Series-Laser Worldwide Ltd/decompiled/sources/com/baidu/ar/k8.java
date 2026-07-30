package com.baidu.ar;

import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class k8 {

    /* renamed from: a, reason: collision with root package name */
    public static char[] f2655a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b, reason: collision with root package name */
    public static MessageDigest f2656b;

    static {
        try {
            f2656b = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e8) {
            System.err.println(k8.class.getName() + "初始化失败，MessageDigest不支持MD5Util。");
            e8.printStackTrace();
        }
    }

    public static String a(File file) {
        try {
            return a(new FileInputStream(file));
        } catch (IOException unused) {
            return null;
        }
    }

    public static String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            char[] charArray = str.toCharArray();
            byte[] bArr = new byte[charArray.length];
            for (int i8 = 0; i8 < charArray.length; i8++) {
                bArr[i8] = (byte) charArray[i8];
            }
            byte[] digest = messageDigest.digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b8 : digest) {
                int i9 = b8 & 255;
                if (i9 < 16) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(Integer.toHexString(i9));
            }
            return stringBuffer.toString();
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public static String a(InputStream inputStream) {
        try {
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        String a8 = a(f2656b.digest());
                        x7.a((Closeable) inputStream);
                        return a8;
                    }
                    f2656b.update(bArr, 0, read);
                }
            } catch (IOException e8) {
                e8.printStackTrace();
                x7.a((Closeable) inputStream);
                return null;
            }
        } catch (Throwable th) {
            x7.a((Closeable) inputStream);
            throw th;
        }
    }

    public static String b(byte[] bArr) {
        f2656b.update(bArr);
        return a(f2656b.digest());
    }

    public static synchronized String a(String str) {
        String b8;
        synchronized (k8.class) {
            b8 = b(str.getBytes(Charset.forName("utf-8")));
        }
        return b8;
    }

    public static String a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static String a(byte[] bArr, int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer(i9 * 2);
        int i10 = i9 + i8;
        while (i8 < i10) {
            a(bArr[i8], stringBuffer);
            i8++;
        }
        return stringBuffer.toString();
    }

    public static void a(byte b8, StringBuffer stringBuffer) {
        char[] cArr = f2655a;
        char c8 = cArr[(b8 & 240) >> 4];
        char c9 = cArr[b8 & 15];
        stringBuffer.append(c8);
        stringBuffer.append(c9);
    }
}
