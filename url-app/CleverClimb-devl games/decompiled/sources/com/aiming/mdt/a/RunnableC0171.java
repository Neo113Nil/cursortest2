package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʽˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0171 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f576 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static int f577;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private /* synthetic */ EnumC0066 f580;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f579 = {'G', 't', 'W', 'o', 'r', 'k', 'e', ' ', 'l', 'a', 'd', 'T', 's', ':', 'H', 'I'};

    /* renamed from: ʼ, reason: contains not printable characters */
    private static char f578 = 4;

    RunnableC0171(EnumC0066 enumC0066) {
        this.f580 = enumC0066;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = f577 + 57;
        f576 = i % 128;
        try {
            if ((i % 2 != 0 ? 'O' : '<') != '<') {
                EnumC0066.m203(this.f580);
            } else {
                EnumC0066.m203(this.f580);
            }
        } catch (Throwable unused) {
            int i2 = f576 + 79;
            f577 = i2 % 128;
            int i3 = i2 % 2;
            char[] charArray = "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0005\u0004\u000b\u0001\u000b\u000b\b\b\r\u0006\u0004\u0007\u0005\u0007\u0000\u0005\f".toCharArray();
            char[] cArr = f579;
            char c2 = f578;
            char[] cArr2 = new char[24];
            int i4 = f577 + 107;
            f576 = i4 % 128;
            if (i4 % 2 != 0) {
            }
            int i5 = 0;
            for (int i6 = 24; i5 < i6; i6 = 24) {
                char c3 = charArray[i5];
                int i7 = i5 + 1;
                char c4 = charArray[i7];
                if (c3 == c4) {
                    int i8 = f576 + 85;
                    f577 = i8 % 128;
                    if (i8 % 2 == 0) {
                        cArr2[i5] = (char) (c3 - 'w');
                        cArr2[i7] = (char) (c4 - 'w');
                    } else {
                        cArr2[i5] = (char) (c3 / 'w');
                        cArr2[i5 / 0] = (char) (c4 / 'w');
                    }
                } else {
                    int i9 = c3 / c2;
                    int i10 = c3 % c2;
                    int i11 = c4 / c2;
                    int i12 = c4 % c2;
                    if (i10 == i12) {
                        int i13 = f577 + 29;
                        f576 = i13 % 128;
                        int i14 = i13 % 2;
                        cArr2[i5] = cArr[((((i9 + c2) - 1) % c2) * c2) + i10];
                        cArr2[i7] = cArr[((((i11 + c2) - 1) % c2) * c2) + i12];
                    } else if (i9 != i11) {
                        cArr2[i5] = cArr[(i9 * c2) + i12];
                        cArr2[i7] = cArr[(i11 * c2) + i10];
                        int i15 = f576 + 67;
                        f577 = i15 % 128;
                        int i16 = i15 % 2;
                    } else {
                        int i17 = f577 + 87;
                        f576 = i17 % 128;
                        int i18 = i17 % 2;
                        cArr2[i5] = cArr[(i9 * c2) + (((i10 + c2) - 1) % c2)];
                        cArr2[i7] = cArr[(i11 * c2) + (((i12 + c2) - 1) % c2)];
                    }
                }
                i5 += 2;
            }
            new String(cArr2).intern();
            C0044.m107();
        }
    }
}
