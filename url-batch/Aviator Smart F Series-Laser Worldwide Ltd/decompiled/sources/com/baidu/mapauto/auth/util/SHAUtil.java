package com.baidu.mapauto.auth.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.bouncycastle.pqc.crypto.xmss.o;

/* loaded from: classes2.dex */
public class SHAUtil {
    private static String byte2Hex(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (byte b8 : bArr) {
            String hexString = Integer.toHexString(b8 & 255);
            if (hexString.length() == 1) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    public static String getSHA256(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(o.SHA_256);
            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));
            return byte2Hex(messageDigest.digest());
        } catch (NoSuchAlgorithmException e8) {
            e8.printStackTrace();
            return "";
        }
    }
}
