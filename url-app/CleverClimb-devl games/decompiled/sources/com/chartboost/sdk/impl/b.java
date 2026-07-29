package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public class b {
    public static int[] a(char[] cArr, int[] iArr, boolean z) {
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        if (!z) {
            a(iArr);
        }
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        for (int i6 = 16; i5 < i6; i6 = 16) {
            int i7 = i4 ^ iArr[i5];
            a aVar = a.f3681b;
            int i8 = (((aVar.f3682a[0][i7 >>> 24] + aVar.f3682a[1][(i7 >>> 16) & 255]) ^ aVar.f3682a[2][(i7 >>> 8) & 255]) + aVar.f3682a[3][i7 & 255]) ^ i3;
            i5++;
            i3 = i7;
            i4 = i8;
        }
        int i9 = iArr[16] ^ i4;
        int i10 = iArr[17] ^ i3;
        int[] iArr2 = {i10, i9};
        cArr[0] = i10 >>> 16;
        cArr[1] = (char) i10;
        cArr[2] = i9 >>> 16;
        cArr[3] = (char) i9;
        if (!z) {
            a(iArr);
        }
        return iArr2;
    }

    private static void a(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
