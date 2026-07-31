package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class i30 {

    /* renamed from: a, reason: collision with root package name */
    public final String f27079a;

    private i30(String str) {
        this.f27079a = str;
    }

    public static i30 a(sf1 sf1Var) {
        String str;
        sf1Var.f(2);
        int t4 = sf1Var.t();
        int i4 = t4 >> 1;
        int t5 = ((sf1Var.t() >> 3) & 31) | ((t4 & 1) << 5);
        if (i4 == 4 || i4 == 5 || i4 == 7) {
            str = "dvhe";
        } else if (i4 == 8) {
            str = "hev1";
        } else {
            if (i4 != 9) {
                return null;
            }
            str = "avc3";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i4);
        sb.append(t5 >= 10 ? "." : ".0");
        sb.append(t5);
        return new i30(sb.toString());
    }
}
