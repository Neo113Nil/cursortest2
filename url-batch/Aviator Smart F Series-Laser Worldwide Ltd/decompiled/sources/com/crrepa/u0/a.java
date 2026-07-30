package com.crrepa.u0;

/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static int a(int i8, int i9) {
        int i10 = i8 % 8;
        if (i10 != 0) {
            i8 += 8 - i10;
        }
        int i11 = i9 % 4;
        if (i11 != 0) {
            i9 += 4 - i11;
        }
        return (((i8 * i9) * 4) / 8) + 24;
    }
}
