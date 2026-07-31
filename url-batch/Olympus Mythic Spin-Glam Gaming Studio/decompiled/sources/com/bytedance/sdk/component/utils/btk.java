package com.bytedance.sdk.component.utils;

import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* loaded from: classes12.dex */
public class btk {
    private static final char[] zmn = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String zmn(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        return zmn(bArr, 0, bArr.length);
    }

    public static String zmn(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        if (i < 0 || i + i2 > bArr.length) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i2 * 2;
        char[] cArr = new char[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i2; i5++) {
            byte b = bArr[i5 + i];
            int i6 = b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
            int i7 = i4 + 1;
            char[] cArr2 = zmn;
            cArr[i4] = cArr2[i6 >> 4];
            i4 += 2;
            cArr[i7] = cArr2[b & 15];
        }
        return new String(cArr, 0, i3);
    }

    public static String zmn(File file) {
        FileInputStream fileInputStream;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            if (messageDigest == null) {
                return null;
            }
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read <= 0) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String zmn2 = zmn(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (Exception unused) {
                }
                return zmn2;
            } catch (Throwable unused2) {
                if (fileInputStream != null) {
                    try {
                        fileInputStream.close();
                    } catch (Exception unused3) {
                    }
                }
                return null;
            }
        } catch (Throwable unused4) {
            fileInputStream = null;
        }
    }

    public static String zmn(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
                    messageDigest.update(str.getBytes("UTF-8"));
                    return zmn(messageDigest.digest());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }
}
