package com.google.android.gms.common.util;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class zzc {
    private static final Pattern zza = Pattern.compile("\\\\u[0-9a-fA-F]{4}");

    public static String zza(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Matcher matcher = zza.matcher(str);
        StringBuilder sb = null;
        int i8 = 0;
        while (matcher.find()) {
            if (sb == null) {
                sb = new StringBuilder();
            }
            int start = matcher.start();
            int i9 = start;
            while (i9 >= 0 && str.charAt(i9) == '\\') {
                i9--;
            }
            if ((start - i9) % 2 != 0) {
                int parseInt = Integer.parseInt(matcher.group().substring(2), 16);
                sb.append((CharSequence) str, i8, matcher.start());
                if (parseInt == 92) {
                    sb.append("\\\\");
                } else {
                    sb.append(Character.toChars(parseInt));
                }
                i8 = matcher.end();
            }
        }
        if (sb == null) {
            return str;
        }
        if (i8 < matcher.regionEnd()) {
            sb.append((CharSequence) str, i8, matcher.regionEnd());
        }
        return sb.toString();
    }
}
