package com.baidu.mshield.b.f;

import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.my.lib.data.ErrorCode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f8335a = {"0", "1", "2", ExifInterface.GPS_MEASUREMENT_3D, "4", ErrorCode.PARAMETER_ERROR, "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static String a(byte b8) {
        int i8 = b8;
        if (b8 < 0) {
            i8 = b8 + 256;
        }
        StringBuilder sb = new StringBuilder();
        String[] strArr = f8335a;
        sb.append(strArr[i8 / 16]);
        sb.append(strArr[i8 % 16]);
        return sb.toString();
    }

    public static String b(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[bArr.length * 2];
        for (int i8 = 0; i8 < bArr.length; i8++) {
            byte b8 = bArr[i8];
            int i9 = i8 * 2;
            cArr2[i9] = cArr[(b8 >>> 4) & 15];
            cArr2[i9 + 1] = cArr[b8 & 15];
        }
        return new String(cArr2);
    }

    public static String c(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        try {
            return a(MessageDigest.getInstance("MD5").digest(bArr));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String a(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b8 : bArr) {
            try {
                stringBuffer.append(a(b8));
            } catch (Throwable th) {
                com.baidu.mshield.b.c.a.a(th);
            }
        }
        return stringBuffer.toString();
    }

    public static String a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String str3 = new String(str);
            try {
                return a(MessageDigest.getInstance("MD5").digest(str3.getBytes()));
            } catch (Throwable th) {
                th = th;
                str2 = str3;
                th.printStackTrace();
                return str2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static String a(File file) {
        FileInputStream fileInputStream;
        if (file == null || !file.exists()) {
            return null;
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                String b8 = b(messageDigest.digest());
                try {
                    fileInputStream.close();
                } catch (IOException e8) {
                    e8.printStackTrace();
                }
                return b8;
            } catch (Throwable th) {
                th = th;
                try {
                    th.printStackTrace();
                    return null;
                } finally {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
