package com.facebook.ads.internal.q.a;

import com.umeng.commonsdk.proguard.ao;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class h {
    public static String a(File file) {
        FileInputStream fileInputStream;
        int read;
        try {
            try {
                fileInputStream = new FileInputStream(file);
                try {
                    MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                    byte[] bArr = new byte[1024];
                    do {
                        read = fileInputStream.read(bArr);
                        if (read > 0) {
                            messageDigest.update(bArr, 0, read);
                        }
                    } while (read != -1);
                    return b(messageDigest.digest());
                } catch (IOException unused) {
                    throw new Exception("IO exception.");
                } catch (NoSuchAlgorithmException unused2) {
                    throw new Exception("No such algorithm.");
                }
            } catch (FileNotFoundException unused3) {
                throw new Exception("File not found or not accessible.");
            }
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException unused4) {
            }
        }
    }

    public static final String a(String str) {
        return a(new File(str));
    }

    public static String a(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            int i = (b2 >>> 4) & 15;
            int i2 = 0;
            while (true) {
                sb.append((char) ((i < 0 || i > 9) ? (i - 10) + 97 : i + 48));
                i = b2 & ao.m;
                int i3 = i2 + 1;
                if (i2 >= 1) {
                    break;
                }
                i2 = i3;
            }
        }
        return sb.toString();
    }

    private static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            sb.append(Integer.toString((b2 & 255) + 256, 16).substring(1));
        }
        return sb.toString();
    }
}
