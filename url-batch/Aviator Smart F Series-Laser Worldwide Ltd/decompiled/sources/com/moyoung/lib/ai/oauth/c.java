package com.moyoung.lib.ai.oauth;

import android.util.Base64;
import cn.hutool.core.util.l;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes4.dex */
public class c {
    private static final String AES_KEY = "Kp7mN8xR3qA9vB2wE5yT6uI4oP1sD0fG";
    private static final String ALGORITHM = "AES";
    private static final int GCM_IV_LENGTH = 12;
    private static final int GCM_TAG_LENGTH = 16;
    private static final String TRANSFORMATION = "AES/GCM/NoPadding";

    public static String encrypt(String str) {
        byte[] bArr = new byte[12];
        new SecureRandom().nextBytes(bArr);
        Cipher cipher = Cipher.getInstance(TRANSFORMATION);
        cipher.init(1, new SecretKeySpec(AES_KEY.getBytes(l.UTF_8), ALGORITHM), new GCMParameterSpec(128, bArr));
        byte[] doFinal = cipher.doFinal(str.getBytes(l.UTF_8));
        int length = doFinal.length - 16;
        byte[] bArr2 = new byte[length];
        byte[] bArr3 = new byte[16];
        System.arraycopy(doFinal, 0, bArr2, 0, length);
        System.arraycopy(doFinal, length, bArr3, 0, 16);
        String format = String.format("%s:%s:%s", Base64.encodeToString(bArr, 2), Base64.encodeToString(bArr2, 2), Base64.encodeToString(bArr3, 2));
        System.out.printf("[Java] 加密成功，结果长度: %d 字符%n", Integer.valueOf(format.length()));
        return format;
    }
}
