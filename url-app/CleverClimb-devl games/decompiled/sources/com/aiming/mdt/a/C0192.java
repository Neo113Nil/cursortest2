package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public class C0192 {
    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static void m722(char[] cArr, char[] cArr2, int i) {
        int i2 = (i + 2) % 4;
        char c2 = (char) (((cArr[i % 4] * 32718) + cArr2[i2]) % 65535);
        int i3 = (i + 3) % 4;
        cArr2[i3] = (char) (((cArr[i3] * 32718) + cArr2[i2]) / 65535);
        cArr[i3] = c2;
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    public static int[] m723(char[] cArr, int[] iArr, boolean z) {
        int i = (cArr[0] << 16) + cArr[1];
        int i2 = (cArr[2] << 16) + cArr[3];
        m725(iArr);
        int i3 = i2;
        int i4 = i;
        int i5 = 0;
        while (i5 < 16) {
            int i6 = i4 ^ iArr[i5];
            C0169 c0169 = C0169.f571;
            int i7 = i3 ^ (((c0169.f572[0][i6 >>> 24] + c0169.f572[1][(i6 >>> 16) & 255]) ^ c0169.f572[2][(i6 >>> 8) & 255]) + c0169.f572[3][i6 & 255]);
            i5++;
            i3 = i6;
            i4 = i7;
        }
        int i8 = iArr[16] ^ i4;
        int i9 = iArr[17] ^ i3;
        int[] iArr2 = {i9, i8};
        cArr[0] = (char) (i9 >>> 16);
        cArr[1] = (char) i9;
        cArr[2] = (char) (i8 >>> 16);
        cArr[3] = (char) i8;
        m725(iArr);
        return iArr2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    public static char[] m724(long j, char[] cArr) {
        char[] cArr2 = new char[cArr.length];
        int i = 0;
        int i2 = 4;
        for (int i3 = 0; i3 < cArr.length; i3++) {
            if ((((j >>> i3) & 1) != 1 || i >= 4) && i2 < cArr2.length) {
                cArr2[i2] = cArr[i3];
                i2++;
            } else {
                cArr2[i] = cArr[i3];
                i++;
            }
        }
        return cArr2;
    }

    /* renamed from: ʽ, reason: contains not printable characters */
    private static void m725(int[] iArr) {
        for (int i = 0; i < iArr.length / 2; i++) {
            int i2 = iArr[i];
            iArr[i] = iArr[(iArr.length - i) - 1];
            iArr[(iArr.length - i) - 1] = i2;
        }
    }
}
