package com.baidu.location.b;

import android.util.Base64;
import com.baidu.location.Jni;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    private boolean f4827a;

    /* renamed from: b, reason: collision with root package name */
    private String[] f4828b;

    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static p f4829a = new p();
    }

    private p() {
        this.f4827a = false;
        this.f4828b = null;
        try {
            String str = Jni.getldkaiv();
            if (str == null || !str.contains(b5.b.VERTICAL)) {
                return;
            }
            String[] split = str.split("\\|");
            this.f4828b = split;
            if (split == null || split.length != 2) {
                return;
            }
            this.f4827a = true;
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static p a() {
        return b.f4829a;
    }

    public synchronized String b(String str) {
        if (!this.f4827a) {
            return null;
        }
        try {
            IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f4828b[1].getBytes(cn.hutool.core.util.l.UTF_8));
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f4828b[0].getBytes(cn.hutool.core.util.l.UTF_8), "AES");
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
            cipher.init(2, secretKeySpec, ivParameterSpec);
            return new String(cipher.doFinal(Base64.decode(str, 0)), cn.hutool.core.util.l.UTF_8);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public synchronized String a(String str) {
        if (this.f4827a) {
            try {
                IvParameterSpec ivParameterSpec = new IvParameterSpec(this.f4828b[1].getBytes(cn.hutool.core.util.l.UTF_8));
                SecretKeySpec secretKeySpec = new SecretKeySpec(this.f4828b[0].getBytes(cn.hutool.core.util.l.UTF_8), "AES");
                Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return Base64.encodeToString(cipher.doFinal(str.getBytes()), 0);
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
        return null;
    }

    public boolean b() {
        return this.f4827a;
    }
}
