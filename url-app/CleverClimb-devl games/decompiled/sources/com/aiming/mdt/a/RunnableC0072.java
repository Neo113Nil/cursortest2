package com.aiming.mdt.a;

/* renamed from: com.aiming.mdt.a.ʻʽʾˉ, reason: contains not printable characters */
/* loaded from: classes.dex */
final class RunnableC0072 implements Runnable {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static int f165 = 1;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private static int f166;

    /* renamed from: ʼ, reason: contains not printable characters */
    private /* synthetic */ C0040 f169;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static char[] f168 = {'J', 'S', 'F', 'r', 'a', 'm', 'e', 'w', 'o', 'k', ' ', 'u', 'n', ':', 'K', 'L'};

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static char f167 = 4;

    RunnableC0072(C0040 c0040) {
        this.f169 = c0040;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = f166 + 27;
        f165 = i % 128;
        int i2 = i % 2;
        try {
            C0040.m94(this.f169);
            int i3 = f166 + 43;
            f165 = i3 % 128;
            if (i3 % 2 != 0) {
            }
        } catch (Throwable th) {
            C0076.m232().m236(th);
            int i4 = f166 + 5;
            f165 = i4 % 128;
            int i5 = i4 % 2;
            char[] charArray = "\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\u000b\u0000\n\u000b\u0007\u000f\u000e\u0000\u0000\u0007\u0006\u0007\u0004\u000b\u0001\u000b\u000e\n\u0098\u0098\u000b\u0000`".toCharArray();
            int i6 = f165 + 1;
            f166 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr = charArray;
            char[] cArr2 = f168;
            char c2 = f167;
            char[] cArr3 = new char[31];
            int i8 = f165 + 51;
            f166 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 30;
            cArr3[30] = (char) (cArr[30] - '&');
            int i11 = 0;
            while (true) {
                if (!(i11 < i10)) {
                    new String(cArr3).intern();
                    C0044.m109();
                    return;
                }
                int i12 = f166 + 59;
                f165 = i12 % 128;
                int i13 = i12 % 2;
                char c3 = cArr[i11];
                int i14 = i11 + 1;
                char c4 = cArr[i14];
                if (!(c3 != c4)) {
                    cArr3[i11] = (char) (c3 - '&');
                    cArr3[i14] = (char) (c4 - '&');
                } else {
                    int i15 = c3 / c2;
                    int i16 = c3 % c2;
                    int i17 = c4 / c2;
                    int i18 = c4 % c2;
                    if (!(i16 == i18)) {
                        if ((i15 != i17 ? '\"' : 'Q') != '\"') {
                            int i19 = f165 + 119;
                            f166 = i19 % 128;
                            int i20 = i19 % 2;
                            cArr3[i11] = cArr2[(i15 * c2) + (((i16 + c2) - 1) % c2)];
                            cArr3[i14] = cArr2[(i17 * c2) + (((i18 + c2) - 1) % c2)];
                        } else {
                            cArr3[i11] = cArr2[(i15 * c2) + i18];
                            cArr3[i14] = cArr2[(i17 * c2) + i16];
                        }
                    } else {
                        int i21 = f166 + 31;
                        f165 = i21 % 128;
                        int i22 = i21 % 2;
                        cArr3[i11] = cArr2[((((i15 + c2) - 1) % c2) * c2) + i16];
                        cArr3[i14] = cArr2[((((i17 + c2) - 1) % c2) * c2) + i18];
                    }
                }
                i11 += 2;
                i10 = 30;
            }
        }
    }
}
