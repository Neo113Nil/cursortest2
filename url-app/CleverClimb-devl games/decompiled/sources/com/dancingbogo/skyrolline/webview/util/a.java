package com.dancingbogo.skyrolline.webview.util;

import android.text.TextUtils;
import java.io.File;

/* compiled from: FileUtil.java */
/* loaded from: classes2.dex */
public class a {
    public static String a(String str) {
        return str.substring(str.charAt(str.lastIndexOf("/")), str.length());
    }

    public static boolean a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(a(str2));
        return new File(sb.toString()).exists();
    }

    public static String b(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str + a(str2);
    }

    public static String b(String str) {
        return str.substring(str.charAt(str.lastIndexOf(".")), str.length());
    }
}
