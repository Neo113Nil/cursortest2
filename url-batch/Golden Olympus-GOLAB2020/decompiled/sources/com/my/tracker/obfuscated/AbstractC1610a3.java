package com.my.tracker.obfuscated;

import android.net.Uri;

/* renamed from: com.my.tracker.obfuscated.a3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1610a3 {
    public static String a(String str, String str2) {
        Uri.Builder encodedAuthority = new Uri.Builder().scheme("https").encodedAuthority(str);
        if (str2 != null) {
            encodedAuthority.appendEncodedPath(str2);
        }
        return encodedAuthority.toString();
    }

    public static String a(String str, String str2, String str3) {
        return a(str + "." + str2, str3);
    }
}
