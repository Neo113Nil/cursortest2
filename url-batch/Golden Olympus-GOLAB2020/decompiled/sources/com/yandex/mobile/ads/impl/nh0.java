package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import com.ironsource.b9;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class nh0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f29641a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f29642b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f29643c = 0;

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static long a(String str, String str2) {
        long parseLong;
        if (!TextUtils.isEmpty(str)) {
            try {
                parseLong = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                ms0.b("HttpUtil", "Unexpected Content-Length [" + str + b9.i.f15552e);
            }
            if (!TextUtils.isEmpty(str2)) {
                return parseLong;
            }
            Matcher matcher = f29641a.matcher(str2);
            if (!matcher.matches()) {
                return parseLong;
            }
            try {
                String group = matcher.group(2);
                group.getClass();
                long parseLong2 = Long.parseLong(group);
                String group2 = matcher.group(1);
                group2.getClass();
                long parseLong3 = (parseLong2 - Long.parseLong(group2)) + 1;
                if (parseLong < 0) {
                    return parseLong3;
                }
                if (parseLong == parseLong3) {
                    return parseLong;
                }
                ms0.d("HttpUtil", "Inconsistent headers [" + str + "] [" + str2 + b9.i.f15552e);
                return Math.max(parseLong, parseLong3);
            } catch (NumberFormatException unused2) {
                ms0.b("HttpUtil", "Unexpected Content-Range [" + str2 + b9.i.f15552e);
                return parseLong;
            }
        }
        parseLong = -1;
        if (!TextUtils.isEmpty(str2)) {
        }
    }

    public static long a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f29642b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        group.getClass();
        return Long.parseLong(group);
    }
}
