package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d6, double d7) {
        return Double.isFinite(d6) ? d6 : d7;
    }

    public static long getMillisOrDefault(Long l2, TimeUnit timeUnit, long j2) {
        return l2 == null ? j2 : timeUnit.toMillis(l2.longValue());
    }

    public static <T> T getOrDefault(T t5, T t6) {
        return t5 == null ? t6 : t5;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t5, T t6) {
        return t5 == null ? t6 : t5;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t5) {
        return t5 == null ? "<null>" : t5.toString().isEmpty() ? "<empty>" : t5.toString();
    }
}
