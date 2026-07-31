package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    private static Cipher f7903a;

    /* renamed from: b, reason: collision with root package name */
    private static final Object f7904b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f7905c = new Object();

    public lb(SecureRandom secureRandom) {
    }

    private static final Cipher c() {
        Cipher cipher;
        synchronized (f7905c) {
            if (f7903a == null) {
                f7903a = Cipher.getInstance("AES/CBC/PKCS5Padding");
            }
            cipher = f7903a;
        }
        return cipher;
    }

    public final String a(byte[] bArr, byte[] bArr2) {
        byte[] doFinal;
        byte[] iv;
        int length = bArr.length;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7904b) {
                c().init(1, secretKeySpec, (SecureRandom) null);
                doFinal = c().doFinal(bArr2);
                iv = c().getIV();
            }
            int length2 = doFinal.length + iv.length;
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(iv).put(doFinal);
            allocate.flip();
            byte[] bArr3 = new byte[length2];
            allocate.get(bArr3);
            return q9.a(bArr3, false);
        } catch (InvalidKeyException e7) {
            throw new kb(this, e7);
        } catch (NoSuchAlgorithmException e8) {
            throw new kb(this, e8);
        } catch (BadPaddingException e9) {
            throw new kb(this, e9);
        } catch (IllegalBlockSizeException e10) {
            throw new kb(this, e10);
        } catch (NoSuchPaddingException e11) {
            throw new kb(this, e11);
        }
    }

    public final byte[] b(byte[] bArr, String str) {
        byte[] doFinal;
        int length = bArr.length;
        try {
            byte[] b7 = q9.b(str, false);
            int length2 = b7.length;
            if (length2 <= 16) {
                throw new kb(this);
            }
            ByteBuffer allocate = ByteBuffer.allocate(length2);
            allocate.put(b7);
            allocate.flip();
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[length2 - 16];
            allocate.get(bArr2);
            allocate.get(bArr3);
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
            synchronized (f7904b) {
                c().init(2, secretKeySpec, new IvParameterSpec(bArr2));
                doFinal = c().doFinal(bArr3);
            }
            return doFinal;
        } catch (IllegalArgumentException e7) {
            throw new kb(this, e7);
        } catch (InvalidAlgorithmParameterException e8) {
            throw new kb(this, e8);
        } catch (InvalidKeyException e9) {
            throw new kb(this, e9);
        } catch (NoSuchAlgorithmException e10) {
            throw new kb(this, e10);
        } catch (BadPaddingException e11) {
            throw new kb(this, e11);
        } catch (IllegalBlockSizeException e12) {
            throw new kb(this, e12);
        } catch (NoSuchPaddingException e13) {
            throw new kb(this, e13);
        }
    }
}
