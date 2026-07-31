package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* loaded from: classes.dex */
abstract class rm3 implements mn3 {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f11260c = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: a, reason: collision with root package name */
    int[] f11261a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11262b;

    rm3(byte[] bArr, int i7) {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f11261a = i(bArr);
        this.f11262b = i7;
    }

    static void f(int[] iArr, int i7, int i8, int i9, int i10) {
        int i11 = iArr[i7] + iArr[i8];
        iArr[i7] = i11;
        int i12 = i11 ^ iArr[i10];
        int i13 = (i12 >>> (-16)) | (i12 << 16);
        iArr[i10] = i13;
        int i14 = iArr[i9] + i13;
        iArr[i9] = i14;
        int i15 = iArr[i8] ^ i14;
        int i16 = (i15 >>> (-12)) | (i15 << 12);
        iArr[i8] = i16;
        int i17 = iArr[i7] + i16;
        iArr[i7] = i17;
        int i18 = iArr[i10] ^ i17;
        int i19 = (i18 >>> (-8)) | (i18 << 8);
        iArr[i10] = i19;
        int i20 = iArr[i9] + i19;
        iArr[i9] = i20;
        int i21 = iArr[i8] ^ i20;
        iArr[i8] = (i21 >>> (-7)) | (i21 << 7);
    }

    static void g(int[] iArr, int[] iArr2) {
        int[] iArr3 = f11260c;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void h(int[] iArr) {
        for (int i7 = 0; i7 < 10; i7++) {
            f(iArr, 0, 4, 8, 12);
            f(iArr, 1, 5, 9, 13);
            f(iArr, 2, 6, 10, 14);
            f(iArr, 3, 7, 11, 15);
            f(iArr, 0, 5, 10, 15);
            f(iArr, 1, 6, 11, 12);
            f(iArr, 2, 7, 8, 13);
            f(iArr, 3, 4, 9, 14);
        }
    }

    static int[] i(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    @Override // com.google.android.gms.internal.ads.mn3
    public final byte[] a(byte[] bArr) {
        int length = bArr.length;
        if (length > Integer.MAX_VALUE - b()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(b() + length);
        e(allocate, bArr);
        return allocate.array();
    }

    abstract int b();

    abstract int[] c(int[] iArr, int i7);

    final ByteBuffer d(byte[] bArr, int i7) {
        int[] c7 = c(i(bArr), i7);
        int[] iArr = (int[]) c7.clone();
        h(iArr);
        for (int i8 = 0; i8 < 16; i8++) {
            c7[i8] = c7[i8] + iArr[i8];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(c7, 0, 16);
        return order;
    }

    final void e(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - b() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] a7 = un3.a(b());
        byteBuffer.put(a7);
        ByteBuffer wrap = ByteBuffer.wrap(bArr);
        int remaining = wrap.remaining();
        int i7 = (remaining / 64) + 1;
        for (int i8 = 0; i8 < i7; i8++) {
            ByteBuffer d7 = d(a7, this.f11262b + i8);
            if (i8 == i7 - 1) {
                pm3.a(byteBuffer, wrap, d7, remaining % 64);
            } else {
                pm3.a(byteBuffer, wrap, d7, 64);
            }
        }
    }
}
