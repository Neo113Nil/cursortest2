package com.bykv.vk.openvk.component.video.api.sUS;

import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: MD5.java */
/* loaded from: classes.dex */
public class icD {
    private static final MessageDigest pvs = pvs();
    private static final char[] icD = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    private icD() {
    }

    private static MessageDigest pvs() {
        try {
            return MessageDigest.getInstance("md5");
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    public static String pvs(String str) {
        byte[] digest;
        MessageDigest messageDigest = pvs;
        if (messageDigest == null || TextUtils.isEmpty(str)) {
            return "";
        }
        byte[] bytes = str.getBytes(Charset.forName(Key.STRING_CHARSET_NAME));
        synchronized (icD.class) {
            digest = messageDigest.digest(bytes);
        }
        return pvs(digest);
    }

    public static String pvs(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        char[] cArr = new char[bArr.length << 1];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = icD;
            cArr[i] = cArr2[(b & 240) >> 4];
            i = i2 + 1;
            cArr[i2] = cArr2[b & Ascii.SI];
        }
        return new String(cArr);
    }
}
