package com.tencent.bugly.proguard;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class af implements ag {

    /* renamed from: a, reason: collision with root package name */
    private String f8698a = null;

    @Override // com.tencent.bugly.proguard.ag
    public final byte[] a(byte[] bArr) throws Exception {
        if (this.f8698a == null || bArr == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(2, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f8698a.getBytes("UTF-8"))), new IvParameterSpec(this.f8698a.getBytes("UTF-8")));
        return cipher.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.ag
    public final byte[] b(byte[] bArr) throws Exception, NoSuchAlgorithmException {
        if (this.f8698a == null || bArr == null) {
            return null;
        }
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(1, SecretKeyFactory.getInstance("DES").generateSecret(new DESKeySpec(this.f8698a.getBytes("UTF-8"))), new IvParameterSpec(this.f8698a.getBytes("UTF-8")));
        return cipher.doFinal(bArr);
    }

    @Override // com.tencent.bugly.proguard.ag
    public final void a(String str) {
        if (str != null) {
            this.f8698a = str;
        }
    }
}
