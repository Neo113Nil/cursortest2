package com.baidu.bbalbscesium.i;

import java.util.Arrays;

/* loaded from: classes.dex */
class c {
    public static void a(byte[] bArr, byte[] bArr2, int i8) {
        if (i8 < 0) {
            throw new IllegalArgumentException("start should be more than zero!");
        }
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("dst array should not be null or empty");
        }
        if (bArr2 == null || bArr2.length == 0) {
            throw new IllegalArgumentException("src array should not be null or empty");
        }
        if (bArr.length < bArr2.length) {
            throw new IllegalArgumentException("dst array length should be longer than:" + bArr2.length);
        }
        if (bArr.length >= bArr2.length + i8) {
            System.arraycopy(bArr2, 0, bArr, i8, bArr2.length);
            return;
        }
        throw new IllegalArgumentException("start should be less than:" + (bArr.length - bArr2.length));
    }

    public static byte[] a(byte[] bArr, int i8) {
        if (bArr == null || bArr.length == 0) {
            throw new IllegalArgumentException("original array should not be null or empty");
        }
        if (i8 >= 0) {
            return Arrays.copyOf(bArr, i8);
        }
        throw new IllegalArgumentException("length should be more than zero!");
    }
}
