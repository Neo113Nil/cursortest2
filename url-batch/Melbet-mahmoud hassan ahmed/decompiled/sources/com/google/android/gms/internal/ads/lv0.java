package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class lv0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f8105a = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*\\s*<!DOCTYPE(\\s)+html(|(\\s)+[^>]*)>", 2);

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f8106b = Pattern.compile("^\\uFEFF?\\s*(\\s*<!--([^-]|(?!-->))*-->)*?\\s*<!DOCTYPE[^>]*>", 2);

    public static String a(String str, String... strArr) {
        StringBuilder sb = new StringBuilder();
        Matcher matcher = f8105a.matcher(str);
        int i7 = 0;
        if (matcher.find()) {
            int end = matcher.end();
            sb.append(str.substring(0, end));
            while (i7 <= 0) {
                String str2 = strArr[i7];
                if (str2 != null) {
                    sb.append(str2);
                }
                i7++;
            }
            str = str.substring(end);
        } else if (!f8106b.matcher(str).find()) {
            while (i7 <= 0) {
                String str3 = strArr[i7];
                if (str3 != null) {
                    sb.append(str3);
                }
                i7++;
            }
        }
        sb.append(str);
        return sb.toString();
    }
}
