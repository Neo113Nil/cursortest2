package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.internal.ads.CL;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.util.Locale;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19745a = "HkzwDFeD4QuyLdx5igfZYcu9xTM9NN==";

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f19746b = new byte[32];

    /* renamed from: c, reason: collision with root package name */
    private static byte[] f19747c = new byte[16];

    /* renamed from: com.anythink.expressad.foundation.h.a$a, reason: collision with other inner class name */
    public static class C0124a extends Provider {
        public C0124a() {
            super("Crypto", 1.0d, "HARMONY (SHA1 digest; SecureRandom; SHA1withDSA signature)");
            put("SecureRandom.SHA1PRNG", "org.apache.harmony.security.provider.crypto.SHA1PRNG_SecureRandomImpl");
            put("SecureRandom.SHA1PRNG ImplementedIn", "Software");
        }
    }

    static {
        String b9 = com.anythink.core.express.a.a.b(f19745a);
        if (TextUtils.isEmpty(b9)) {
            return;
        }
        try {
            byte[] digest = MessageDigest.getInstance("sha-384").digest(b9.getBytes());
            System.arraycopy(digest, 0, f19746b, 0, 32);
            System.arraycopy(digest, 32, f19747c, 0, 16);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    public static String a(String str) {
        return a(str, f19746b, f19747c);
    }

    private static void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            byte[] digest = MessageDigest.getInstance("sha-384").digest(str.getBytes());
            System.arraycopy(digest, 0, f19746b, 0, 32);
            System.arraycopy(digest, 32, f19747c, 0, 16);
        } catch (Exception e6) {
            e6.printStackTrace();
        }
    }

    private static String c(String str) {
        return b(str, f19746b, f19747c);
    }

    private static byte[] d(String str) {
        String upperCase = str.trim().replace(" ", "").toUpperCase(Locale.US);
        int length = upperCase.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i4 = i * 2;
            int i9 = i4 + 1;
            bArr[i] = (byte) (Integer.decode("0x" + upperCase.substring(i4, i9) + upperCase.substring(i9, i4 + 2)).intValue() & com.anythink.basead.exoplayer.k.p.f8630b);
        }
        return bArr;
    }

    private static String a(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Security.addProvider(new C0124a());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(1, secretKeySpec, ivParameterSpec);
            return new String(Base64.encode(cipher.doFinal(str.getBytes()), 0));
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static String b(String str, byte[] bArr, byte[] bArr2) {
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr2);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)));
        } catch (Exception e6) {
            e6.printStackTrace();
            return null;
        }
    }

    private static String a(byte[] bArr) {
        String str = "";
        for (byte b9 : bArr) {
            String hexString = Integer.toHexString(b9 & 255);
            if (hexString.length() == 1) {
                str = CL.k(str, "0", hexString);
            } else {
                str = CL.j(str, hexString);
            }
        }
        return str;
    }
}
