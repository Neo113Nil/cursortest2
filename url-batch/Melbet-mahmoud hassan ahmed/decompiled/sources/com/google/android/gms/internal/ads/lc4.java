package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class lc4 {

    /* renamed from: a, reason: collision with root package name */
    public final String f7934a;

    private lc4(int i7, int i8, String str) {
        this.f7934a = str;
    }

    public static lc4 a(dr2 dr2Var) {
        String str;
        dr2Var.g(2);
        int s7 = dr2Var.s();
        int i7 = s7 >> 1;
        int s8 = (dr2Var.s() >> 3) | ((s7 & 1) << 5);
        if (i7 == 4 || i7 == 5 || i7 == 7) {
            str = "dvhe";
        } else if (i7 == 8) {
            str = "hev1";
        } else {
            if (i7 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = s8 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i7);
        sb.append(str2);
        sb.append(s8);
        return new lc4(i7, s8, sb.toString());
    }
}
