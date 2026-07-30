package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.ads.hz, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3339hz {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f31280a = StandardCharsets.UTF_8;

    /* renamed from: b, reason: collision with root package name */
    public static Cipher f31281b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f31282c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final Object f31283d = new Object();

    public static byte[] a(String str, byte[] bArr) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] x3 = PA.x(str, false);
            int length2 = x3.length;
            if (length2 > 16) {
                ByteBuffer allocate = ByteBuffer.allocate(length2);
                allocate.put(x3);
                allocate.flip();
                byte[] bArr2 = new byte[16];
                byte[] bArr3 = new byte[length2 - 16];
                allocate.get(bArr2);
                allocate.get(bArr3);
                SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
                synchronized (f31282c) {
                    b().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                    doFinal = b().doFinal(bArr3);
                }
                return doFinal;
            }
            try {
                throw new C3285gz();
            } catch (IllegalArgumentException e6) {
                e = e6;
                throw new C3285gz(e);
            } catch (InvalidAlgorithmParameterException e9) {
                e = e9;
                throw new C3285gz(e);
            } catch (InvalidKeyException e10) {
                e = e10;
                throw new C3285gz(e);
            } catch (BadPaddingException e11) {
                e = e11;
                throw new C3285gz(e);
            } catch (IllegalBlockSizeException e12) {
                e = e12;
                throw new C3285gz(e);
            } catch (NoSuchPaddingException e13) {
                e = e13;
                throw new C3285gz(e);
            }
        } catch (IllegalArgumentException | InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e14) {
            e = e14;
        }
    }

    public static final Cipher b() {
        Cipher cipher;
        synchronized (f31283d) {
            try {
                if (f31281b == null) {
                    f31281b = Cipher.getInstance("AES/CBC/PKCS5Padding");
                }
                cipher = f31281b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cipher;
    }
}
