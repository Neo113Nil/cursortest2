package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class jm3 implements wc3 {

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f7178e = new hm3();

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f7179f = new im3();

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7180a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f7181b;

    /* renamed from: c, reason: collision with root package name */
    private final SecretKeySpec f7182c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7183d;

    public jm3(byte[] bArr, int i7) {
        if (!qf3.a(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i7 != 12 && i7 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f7183d = i7;
        wn3.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7182c = secretKeySpec;
        Cipher cipher = f7178e.get();
        cipher.init(1, secretKeySpec);
        byte[] b7 = b(cipher.doFinal(new byte[16]));
        this.f7180a = b7;
        this.f7181b = b(b7);
    }

    private static byte[] b(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i7 = 0;
        while (i7 < 15) {
            byte b7 = bArr[i7];
            int i8 = i7 + 1;
            bArr2[i7] = (byte) (((b7 + b7) ^ ((bArr[i8] & 255) >>> 7)) & 255);
            i7 = i8;
        }
        byte b8 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b8 + b8));
        return bArr2;
    }

    private final byte[] c(Cipher cipher, int i7, byte[] bArr, int i8, int i9) {
        int length;
        byte[] bArr2;
        byte[] bArr3 = new byte[16];
        bArr3[15] = (byte) i7;
        if (i9 == 0) {
            return cipher.doFinal(d(bArr3, this.f7180a));
        }
        byte[] doFinal = cipher.doFinal(bArr3);
        int i10 = 0;
        int i11 = 0;
        while (i9 - i11 > 16) {
            for (int i12 = 0; i12 < 16; i12++) {
                doFinal[i12] = (byte) (doFinal[i12] ^ bArr[(i8 + i11) + i12]);
            }
            doFinal = cipher.doFinal(doFinal);
            i11 += 16;
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, i11 + i8, i8 + i9);
        if (copyOfRange.length == 16) {
            bArr2 = d(copyOfRange, this.f7180a);
        } else {
            byte[] copyOf = Arrays.copyOf(this.f7181b, 16);
            while (true) {
                length = copyOfRange.length;
                if (i10 >= length) {
                    break;
                }
                copyOf[i10] = (byte) (copyOf[i10] ^ copyOfRange[i10]);
                i10++;
            }
            copyOf[length] = (byte) (copyOf[length] ^ 128);
            bArr2 = copyOf;
        }
        return cipher.doFinal(d(doFinal, bArr2));
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i7 = 0; i7 < length; i7++) {
            bArr3[i7] = (byte) (bArr[i7] ^ bArr2[i7]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.ads.wc3
    public final byte[] a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i7 = this.f7183d;
        if (length > (Integer.MAX_VALUE - i7) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i7 + length + 16];
        byte[] a7 = un3.a(i7);
        System.arraycopy(a7, 0, bArr3, 0, this.f7183d);
        Cipher cipher = f7178e.get();
        cipher.init(1, this.f7182c);
        byte[] c7 = c(cipher, 0, a7, 0, a7.length);
        byte[] c8 = c(cipher, 1, bArr2, 0, 0);
        Cipher cipher2 = f7179f.get();
        cipher2.init(1, this.f7182c, new IvParameterSpec(c7));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f7183d);
        byte[] c9 = c(cipher, 2, bArr3, this.f7183d, length);
        int i8 = length + this.f7183d;
        for (int i9 = 0; i9 < 16; i9++) {
            bArr3[i8 + i9] = (byte) ((c8[i9] ^ c7[i9]) ^ c9[i9]);
        }
        return bArr3;
    }
}
