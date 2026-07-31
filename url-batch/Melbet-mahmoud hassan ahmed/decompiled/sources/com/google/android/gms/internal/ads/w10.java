package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes.dex */
final class w10 extends x10 {
    w10() {
    }

    private static final String b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        int length = str.length();
        int i7 = 0;
        int i8 = 0;
        while (i8 < str.length() && str.charAt(i8) == ',') {
            i8++;
        }
        while (length > 0) {
            int i9 = length - 1;
            if (str.charAt(i9) != ',') {
                break;
            }
            length = i9;
        }
        if (length < i8) {
            return null;
        }
        if (i8 != 0) {
            i7 = i8;
        } else if (length == str.length()) {
            return str;
        }
        return str.substring(i7, length);
    }

    @Override // com.google.android.gms.internal.ads.x10
    public final String a(String str, String str2) {
        String b7 = b(str);
        String b8 = b(str2);
        if (TextUtils.isEmpty(b7)) {
            return b8;
        }
        if (TextUtils.isEmpty(b8)) {
            return b7;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(b7).length() + 1 + String.valueOf(b8).length());
        sb.append(b7);
        sb.append(",");
        sb.append(b8);
        return sb.toString();
    }
}
