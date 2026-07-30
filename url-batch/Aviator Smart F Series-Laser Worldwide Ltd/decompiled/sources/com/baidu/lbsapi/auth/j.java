package com.baidu.lbsapi.auth;

import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.SecureRandom;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static KeyPair f4343a;

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
            keyPairGenerator.initialize(2048, new SecureRandom());
            if (f4343a == null) {
                f4343a = keyPairGenerator.generateKeyPair();
            }
            return f4343a;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b() {
        PublicKey publicKey;
        KeyPair keyPair = f4343a;
        if (keyPair == null || (publicKey = keyPair.getPublic()) == null) {
            return null;
        }
        try {
            return c.a(publicKey.getEncoded(), StandardCharsets.UTF_8.name());
        } catch (Exception unused) {
            return null;
        }
    }

    public static byte[] a(String str) {
        if (!TextUtils.isEmpty(str) && f4343a != null) {
            try {
                byte[] a8 = c.a(str.getBytes(StandardCharsets.UTF_8));
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(2, f4343a.getPrivate());
                return cipher.doFinal(a8);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public static String b(String str) {
        if (!TextUtils.isEmpty(str) && f4343a != null) {
            try {
                Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
                cipher.init(1, f4343a.getPrivate());
                Charset charset = StandardCharsets.UTF_8;
                return c.a(cipher.doFinal(str.getBytes(charset)), charset.name());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }
}
