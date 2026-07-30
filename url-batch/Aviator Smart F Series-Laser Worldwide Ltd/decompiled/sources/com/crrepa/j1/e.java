package com.crrepa.j1;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static int f13020a;

    /* renamed from: b, reason: collision with root package name */
    private static int f13021b;

    public static void a(int i8) {
        f13020a = i8;
    }

    public static void b(int i8) {
        f13021b = i8;
    }

    public static void a(byte[] bArr, byte[] bArr2, int i8, byte[] bArr3) {
        for (int i9 = 0; i9 < i8; i9++) {
            byte b8 = bArr[i9];
            int i10 = f13020a;
            f13020a = i10 + 1;
            bArr2[i9] = (byte) (b8 ^ bArr3[i10 % 32]);
        }
    }

    public static void b(byte[] bArr, byte[] bArr2, int i8, byte[] bArr3) {
        for (int i9 = 0; i9 < i8; i9++) {
            byte b8 = bArr[i9];
            int i10 = f13021b;
            f13021b = i10 + 1;
            bArr2[i9] = (byte) (b8 ^ bArr3[i10 % 32]);
        }
    }
}
