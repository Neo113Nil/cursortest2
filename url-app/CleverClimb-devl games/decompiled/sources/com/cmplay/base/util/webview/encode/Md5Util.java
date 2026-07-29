package com.cmplay.base.util.webview.encode;

import com.umeng.commonsdk.proguard.ao;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class Md5Util {
    public static String getStringMd5(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return encodeHex(messageDigest.digest());
        } catch (Exception unused) {
            return null;
        }
    }

    public static String encodeHex(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i++) {
            sb.append("0123456789abcdef".charAt((bArr[i] & 240) >>> 4));
            sb.append("0123456789abcdef".charAt(bArr[i] & ao.m));
        }
        return sb.toString();
    }
}
