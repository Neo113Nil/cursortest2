package com.cmplay.gppay.b;

import com.umeng.commonsdk.proguard.ao;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    private static final byte[] f4113a = {ao.n, 74, 71, -80, 32, 101, -47, 72, 117, -14, 0, -29, 70, 65, -12, 74};

    /* renamed from: b, reason: collision with root package name */
    private Cipher f4114b;

    /* renamed from: c, reason: collision with root package name */
    private Cipher f4115c;

    public a(byte[] bArr, String str, String str2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBEWITHSHAAND256BITAES-CBC-BC").generateSecret(new PBEKeySpec((str + str2).toCharArray(), bArr, 1024, 256)).getEncoded(), "AES");
            this.f4114b = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f4114b.init(1, secretKeySpec, new IvParameterSpec(f4113a));
            this.f4115c = Cipher.getInstance("AES/CBC/PKCS5Padding");
            this.f4115c.init(2, secretKeySpec, new IvParameterSpec(f4113a));
        } catch (GeneralSecurityException e) {
            throw new RuntimeException("Invalid environment", e);
        }
    }

    @Override // com.cmplay.gppay.b.g
    public String a(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            return com.cmplay.gppay.b.a.a.a(this.f4114b.doFinal(("com.google.android.vending.licensing.AESObfuscator-1|" + str2 + str).getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("Invalid environment", e);
        } catch (GeneralSecurityException e2) {
            throw new RuntimeException("Invalid environment", e2);
        }
    }

    @Override // com.cmplay.gppay.b.g
    public String b(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            String str3 = new String(this.f4115c.doFinal(com.cmplay.gppay.b.a.a.a(str)), "UTF-8");
            if (str3.indexOf("com.google.android.vending.licensing.AESObfuscator-1|" + str2) == 0) {
                return str3.substring("com.google.android.vending.licensing.AESObfuscator-1|".length() + str2.length(), str3.length());
            }
            throw new l("Header not found (invalid data or key):" + str);
        } catch (com.cmplay.gppay.b.a.b e) {
            throw new l(e.getMessage() + ":" + str);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("Invalid environment", e2);
        } catch (BadPaddingException e3) {
            throw new l(e3.getMessage() + ":" + str);
        } catch (IllegalBlockSizeException e4) {
            throw new l(e4.getMessage() + ":" + str);
        }
    }
}
