package com.ironsource.b.h;

import android.text.TextUtils;

/* compiled from: ErrorBuilder.java */
/* loaded from: classes2.dex */
public class d {
    public static com.ironsource.b.d.b a(String str, String str2) {
        return new com.ironsource.b.d.b(502, "Mediation - Unable to retrieve configurations from IronSource server, using cached configurations with appKey:" + str + " and userId:" + str2);
    }

    public static com.ironsource.b.d.b a(String str, String str2, String str3) {
        String str4;
        StringBuilder sb = new StringBuilder();
        sb.append("Init Fail - ");
        sb.append(str);
        sb.append(" value ");
        sb.append(str2);
        sb.append(" is not valid");
        if (TextUtils.isEmpty(str3)) {
            str4 = "";
        } else {
            str4 = " - " + str3;
        }
        sb.append(str4);
        return new com.ironsource.b.d.b(506, sb.toString());
    }

    public static com.ironsource.b.d.b b(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = str2 + " init failed due to an unknown error";
        } else {
            str3 = str2 + " - " + str;
        }
        return new com.ironsource.b.d.b(508, str3);
    }

    public static com.ironsource.b.d.b a(String str) {
        return new com.ironsource.b.d.b(509, str + " Show Fail - No ads to show");
    }

    public static com.ironsource.b.d.b c(String str, String str2) {
        return new com.ironsource.b.d.b(509, str + " Show Fail - " + str2);
    }

    public static com.ironsource.b.d.b b(String str) {
        if (TextUtils.isEmpty(str)) {
            str = "An error occurred";
        }
        return new com.ironsource.b.d.b(510, str);
    }

    public static com.ironsource.b.d.b c(String str) {
        return new com.ironsource.b.d.b(520, "" + str + " Show Fail - No Internet connection");
    }

    public static com.ironsource.b.d.b d(String str, String str2) {
        return new com.ironsource.b.d.b(524, str + " Show Fail - " + str2);
    }

    public static com.ironsource.b.d.b d(String str) {
        return new com.ironsource.b.d.b(527, str + " The requested instance does not exist");
    }

    public static com.ironsource.b.d.b e(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "Load failed due to an unknown error";
        } else {
            str2 = "Load failed - " + str;
        }
        return new com.ironsource.b.d.b(510, str2);
    }
}
