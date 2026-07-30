package com.crrepa.l0;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final int f13178a = 65258;

    private e() {
    }

    public static byte[] a(byte[] bArr, int i8) {
        if (bArr == null) {
            return com.crrepa.g1.c.b(f13178a);
        }
        for (int i9 : bArr) {
            int i10 = (((i8 & 255) << 8) | ((65280 & i8) >> 8)) ^ (i9 & 255);
            int i11 = i10 ^ ((i10 & 255) >> 4);
            int i12 = i11 ^ ((i11 & 255) << 12);
            i8 = i12 ^ ((i12 & 255) << 5);
        }
        return com.crrepa.g1.c.b(i8);
    }

    public static byte[] a(byte[] bArr, int i8, int i9, int i10) {
        if (bArr == null) {
            return com.crrepa.g1.c.b(f13178a);
        }
        while (i8 < i9) {
            int i11 = (((i10 & 255) << 8) | ((65280 & i10) >> 8)) ^ (bArr[i8] & 255);
            int i12 = i11 ^ ((i11 & 255) >> 4);
            int i13 = i12 ^ ((i12 & 255) << 12);
            i10 = i13 ^ ((i13 & 255) << 5);
            i8++;
        }
        return com.crrepa.g1.c.b(i10);
    }
}
