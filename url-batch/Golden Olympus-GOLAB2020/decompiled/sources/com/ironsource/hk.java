package com.ironsource;

import android.text.TextUtils;
import android.util.Base64;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

/* loaded from: classes2.dex */
public class hk {

    /* renamed from: a, reason: collision with root package name */
    public static final int f16598a = 1024;

    /* renamed from: b, reason: collision with root package name */
    public static final String f16599b = "RSA/ECB/PKCS1Padding";

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            return Base64.encodeToString(a(str.getBytes("UTF-8"), a(str2)), 0).replaceAll(System.getProperty("line.separator"), "");
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception on string encryption error: " + e4.getMessage());
            return "";
        }
    }

    public static KeyPair a() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(f16599b);
            keyPairGenerator.initialize(1024);
            return keyPairGenerator.genKeyPair();
        } catch (NoSuchAlgorithmException e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception on key generation error: " + e4.getMessage());
            throw new RuntimeException(e4);
        }
    }

    private static RSAPublicKey a(String str) {
        return (RSAPublicKey) KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 0)));
    }

    public static byte[] a(byte[] bArr, PrivateKey privateKey) {
        try {
            Cipher cipher = Cipher.getInstance(f16599b);
            cipher.init(2, privateKey);
            return cipher.doFinal(bArr);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception on decryption error: " + e4.getMessage());
            throw new RuntimeException(e4);
        }
    }

    public static byte[] a(byte[] bArr, PublicKey publicKey) {
        try {
            Cipher cipher = Cipher.getInstance(f16599b);
            cipher.init(1, publicKey);
            return cipher.doFinal(bArr);
        } catch (Exception e4) {
            o9.d().a(e4);
            IronLog.INTERNAL.error("exception on encryption error: " + e4.getMessage());
            throw new RuntimeException(e4);
        }
    }
}
