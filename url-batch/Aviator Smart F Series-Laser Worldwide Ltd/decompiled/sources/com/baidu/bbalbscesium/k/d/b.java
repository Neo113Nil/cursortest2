package com.baidu.bbalbscesium.k.d;

import java.math.BigInteger;
import java.security.SecureRandom;
import javax.crypto.BadPaddingException;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final SecureRandom f4129a = new SecureRandom();

    private b() {
    }

    public static int a(BigInteger bigInteger) {
        return (bigInteger.bitLength() + 7) >> 3;
    }

    private static BigInteger a(byte[] bArr, BigInteger bigInteger) {
        BigInteger bigInteger2 = new BigInteger(1, bArr);
        if (bigInteger2.compareTo(bigInteger) < 0) {
            return bigInteger2;
        }
        throw new BadPaddingException("Message is larger than modulus");
    }

    private static byte[] a(BigInteger bigInteger, int i8) {
        byte[] byteArray = bigInteger.toByteArray();
        int length = byteArray.length;
        if (length == i8) {
            return byteArray;
        }
        if (length == i8 + 1 && byteArray[0] == 0) {
            byte[] bArr = new byte[i8];
            System.arraycopy(byteArray, 1, bArr, 0, i8);
            return bArr;
        }
        if (length >= i8) {
            return null;
        }
        byte[] bArr2 = new byte[i8];
        System.arraycopy(byteArray, 0, bArr2, i8 - length, length);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, int i8, int i9) {
        if (i8 == 0 && i9 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i9];
        System.arraycopy(bArr, i8, bArr2, 0, i9);
        return bArr2;
    }

    public static byte[] a(byte[] bArr, d dVar) {
        return a(bArr, dVar.a(), dVar.b());
    }

    private static byte[] a(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2) {
        return a(a(bArr, bigInteger).modPow(bigInteger2, bigInteger), a(bigInteger));
    }
}
