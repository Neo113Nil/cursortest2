package com.moyoung.dafit.module.common.utils;

import android.text.TextUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes4.dex */
public class x {
    private static char[] hexDigits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    private static MessageDigest messagedigest;

    static {
        messagedigest = null;
        try {
            messagedigest = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
        }
    }

    private static void appendHexPair(byte b8, StringBuffer stringBuffer) {
        char[] cArr = hexDigits;
        char c8 = cArr[(b8 & 240) >> 4];
        char c9 = cArr[b8 & 15];
        stringBuffer.append(c8);
        stringBuffer.append(c9);
    }

    private static String bufferToHex(byte[] bArr) {
        return bufferToHex(bArr, 0, bArr.length);
    }

    public static boolean checkFileMd5(String str, File file) {
        String str2;
        if (TextUtils.isEmpty(str) || !file.exists()) {
            return false;
        }
        try {
            str2 = getFileMD5(file);
        } catch (IOException e8) {
            com.orhanobut.logger.f.e("md5验证失败", new Object[0]);
            e8.printStackTrace();
            str2 = null;
        }
        return str2 != null && TextUtils.equals(str.toLowerCase(), str2.toLowerCase());
    }

    public static String getFileMD5(File file) {
        if (file == null || !file.exists()) {
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        while (true) {
            int read = fileInputStream.read(bArr);
            if (read <= 0) {
                fileInputStream.close();
                return bufferToHex(messagedigest.digest());
            }
            messagedigest.update(bArr, 0, read);
        }
    }

    private static String bufferToHex(byte[] bArr, int i8, int i9) {
        StringBuffer stringBuffer = new StringBuffer(i9 * 2);
        int i10 = i9 + i8;
        while (i8 < i10) {
            appendHexPair(bArr[i8], stringBuffer);
            i8++;
        }
        return stringBuffer.toString();
    }
}
