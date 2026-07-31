package com.bykv.vk.openvk.zmn.zmn.zmn.nps;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes15.dex */
public class fs {
    private static final MessageDigest zmn = zmn();
    private static final char[] fs = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private fs() {
    }

    private static MessageDigest zmn() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String zmn(String str) {
        byte[] digest;
        MessageDigest messageDigest = zmn;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName("UTF-8"));
        synchronized (fs.class) {
            digest = messageDigest.digest(bytes);
        }
        return zmn(digest);
    }

    public static String zmn(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = fs;
            cArr[i] = cArr2[(b & 240) >> 4];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }
}
