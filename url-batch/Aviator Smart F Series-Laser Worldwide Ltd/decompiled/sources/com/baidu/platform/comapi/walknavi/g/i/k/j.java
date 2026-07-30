package com.baidu.platform.comapi.walknavi.g.i.k;

import android.os.Environment;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static String f10078a = Environment.getExternalStorageDirectory() + "/AR/Screenshots/";

    public static String a(String str) {
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
        } catch (Exception unused) {
            return "";
        }
    }
}
