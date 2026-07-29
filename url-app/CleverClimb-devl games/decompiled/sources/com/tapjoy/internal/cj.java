package com.tapjoy.internal;

/* loaded from: classes2.dex */
public final class cj {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f7887a = new String[512];

    public final String a(char[] cArr, int i, int i2) {
        boolean z = false;
        int i3 = 0;
        for (int i4 = i; i4 < i + i2; i4++) {
            i3 = (i3 * 31) + cArr[i4];
        }
        int i5 = ((i3 >>> 20) ^ (i3 >>> 12)) ^ i3;
        int length = (i5 ^ ((i5 >>> 7) ^ (i5 >>> 4))) & (this.f7887a.length - 1);
        String str = this.f7887a[length];
        if (str != null) {
            if (str.length() == i2) {
                int i6 = 0;
                while (true) {
                    if (i6 >= i2) {
                        z = true;
                        break;
                    }
                    if (cArr[i + i6] != str.charAt(i6)) {
                        break;
                    }
                    i6++;
                }
            }
            if (z) {
                return str;
            }
        }
        String str2 = new String(cArr, i, i2);
        this.f7887a[length] = str2;
        return str2;
    }
}
