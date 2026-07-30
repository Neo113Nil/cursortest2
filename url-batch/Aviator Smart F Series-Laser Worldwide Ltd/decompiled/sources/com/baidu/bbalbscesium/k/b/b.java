package com.baidu.bbalbscesium.k.b;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.util.Random;

/* loaded from: classes.dex */
public class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final int f4113b = 16;

    /* renamed from: c, reason: collision with root package name */
    public static final int f4114c = 64;

    /* renamed from: d, reason: collision with root package name */
    public static final int f4115d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final int f4116e = 32;

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f4117f = c(new byte[]{a4.a.f19b1, a4.a.f82s1, 112, a4.a.X0, a4.a.f55k1, a4.a.f15a1, 32, 51, 50, 45, a4.a.Y0, 121, a4.a.f73p1, a4.a.f19b1, 32, a4.a.f43h1});

    /* renamed from: g, reason: collision with root package name */
    public static final int f4118g = 32;

    /* renamed from: a, reason: collision with root package name */
    private final int f4119a;

    public b(int i8) {
        this.f4119a = i8;
    }

    static int[] c(byte[] bArr) {
        IntBuffer asIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[asIntBuffer.remaining()];
        asIntBuffer.get(iArr);
        return iArr;
    }

    int a() {
        return 12;
    }

    @Override // com.baidu.bbalbscesium.k.b.d
    public byte[] b(byte[] bArr) {
        return a(bArr, (byte[]) null);
    }

    private static int a(int i8, int i9) {
        return (i8 >>> (-i9)) | (i8 << i9);
    }

    ByteBuffer a(byte[] bArr, byte[] bArr2, int i8) {
        int[] a8 = a(c(bArr), c(bArr2), i8);
        int[] iArr = (int[]) a8.clone();
        a(iArr);
        for (int i9 = 0; i9 < a8.length; i9++) {
            a8[i9] = a8[i9] + iArr[i9];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(a8, 0, 16);
        return order;
    }

    void a(ByteBuffer byteBuffer, byte[] bArr, byte[] bArr2) {
        if (byteBuffer.remaining() - a() < bArr.length) {
            throw new IllegalArgumentException("data output is too small");
        }
        if (bArr2 == null) {
            bArr2 = new byte[a()];
            new Random().nextBytes(bArr2);
        }
        byteBuffer.put(bArr2);
        a(bArr2, com.baidu.bbalbscesium.k.c.b.b(), byteBuffer, ByteBuffer.wrap(bArr));
    }

    private void a(byte[] bArr, byte[] bArr2, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        int remaining = byteBuffer2.remaining();
        int i8 = remaining / 64;
        int i9 = i8 + 1;
        for (int i10 = 0; i10 < i9; i10++) {
            ByteBuffer a8 = a(bArr, bArr2, this.f4119a + i10);
            int i11 = 64;
            if (i10 == i8) {
                i11 = remaining % 64;
            }
            a.a(byteBuffer, byteBuffer2, a8, i11);
        }
    }

    static void a(int[] iArr) {
        for (int i8 = 0; i8 < 10; i8++) {
            a(iArr, 0, 4, 8, 12);
            a(iArr, 1, 5, 9, 13);
            a(iArr, 2, 6, 10, 14);
            a(iArr, 3, 7, 11, 15);
            a(iArr, 0, 5, 10, 15);
            a(iArr, 1, 6, 11, 12);
            a(iArr, 2, 7, 8, 13);
            a(iArr, 3, 4, 9, 14);
        }
    }

    static void a(int[] iArr, int i8, int i9, int i10, int i11) {
        int i12 = iArr[i8] + iArr[i9];
        iArr[i8] = i12;
        int a8 = a(i12 ^ iArr[i11], 16);
        iArr[i11] = a8;
        int i13 = iArr[i10] + a8;
        iArr[i10] = i13;
        int a9 = a(iArr[i9] ^ i13, 12);
        iArr[i9] = a9;
        int i14 = iArr[i8] + a9;
        iArr[i8] = i14;
        int a10 = a(iArr[i11] ^ i14, 8);
        iArr[i11] = a10;
        int i15 = iArr[i10] + a10;
        iArr[i10] = i15;
        iArr[i9] = a(iArr[i9] ^ i15, 7);
    }

    static void a(int[] iArr, int[] iArr2) {
        int[] iArr3 = f4117f;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    byte[] a(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() < a()) {
            throw new GeneralSecurityException("data too short");
        }
        byte[] bArr = new byte[a()];
        byteBuffer.get(bArr);
        ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.remaining());
        a(bArr, com.baidu.bbalbscesium.k.c.b.a(), allocate, byteBuffer);
        return allocate.array();
    }

    @Override // com.baidu.bbalbscesium.k.b.d
    public byte[] a(byte[] bArr) {
        return a(ByteBuffer.wrap(bArr));
    }

    public byte[] a(byte[] bArr, byte[] bArr2) {
        if (bArr.length > Integer.MAX_VALUE - a()) {
            throw new GeneralSecurityException("data too long");
        }
        ByteBuffer allocate = ByteBuffer.allocate(a() + bArr.length);
        a(allocate, bArr, bArr2);
        return allocate.array();
    }

    int[] a(int[] iArr, int[] iArr2, int i8) {
        if (iArr.length != a() / 4) {
            throw new IllegalArgumentException(String.format("need 96-bit param, but got a %d-bit param", Integer.valueOf(iArr.length * 32)));
        }
        int[] iArr3 = new int[16];
        a(iArr3, iArr2);
        iArr3[12] = i8;
        System.arraycopy(iArr, 0, iArr3, 13, iArr.length);
        return iArr3;
    }
}
