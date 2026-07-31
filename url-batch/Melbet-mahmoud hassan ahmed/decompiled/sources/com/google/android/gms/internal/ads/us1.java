package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class us1 {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f12958a = Pattern.compile("bytes (\\d+)-(\\d+)/(?:\\d+|\\*)");

    /* renamed from: b, reason: collision with root package name */
    private static final Pattern f12959b = Pattern.compile("bytes (?:(?:\\d+-\\d+)|\\*)/(\\d+)");

    public static long a(String str, String str2) {
        long j7 = -1;
        if (!TextUtils.isEmpty(str)) {
            try {
                j7 = Long.parseLong(str);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 28);
                sb.append("Unexpected Content-Length [");
                sb.append(str);
                sb.append("]");
                Log.e("HttpUtil", sb.toString());
            }
        }
        if (TextUtils.isEmpty(str2)) {
            return j7;
        }
        Matcher matcher = f12958a.matcher(str2);
        if (!matcher.matches()) {
            return j7;
        }
        try {
            String group = matcher.group(2);
            Objects.requireNonNull(group);
            long parseLong = Long.parseLong(group);
            String group2 = matcher.group(1);
            Objects.requireNonNull(group2);
            long parseLong2 = (parseLong - Long.parseLong(group2)) + 1;
            if (j7 < 0) {
                return parseLong2;
            }
            if (j7 == parseLong2) {
                return j7;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 26 + String.valueOf(str2).length());
            sb2.append("Inconsistent headers [");
            sb2.append(str);
            sb2.append("] [");
            sb2.append(str2);
            sb2.append("]");
            Log.w("HttpUtil", sb2.toString());
            return Math.max(j7, parseLong2);
        } catch (NumberFormatException unused2) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str2).length() + 27);
            sb3.append("Unexpected Content-Range [");
            sb3.append(str2);
            sb3.append("]");
            Log.e("HttpUtil", sb3.toString());
            return j7;
        }
    }

    public static long b(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1L;
        }
        Matcher matcher = f12959b.matcher(str);
        if (!matcher.matches()) {
            return -1L;
        }
        String group = matcher.group(1);
        Objects.requireNonNull(group);
        return Long.parseLong(group);
    }
}
