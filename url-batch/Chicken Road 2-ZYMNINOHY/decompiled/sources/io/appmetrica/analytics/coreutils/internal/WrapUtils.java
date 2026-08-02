package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d4, double d5) {
        return Double.isFinite(d4) ? d4 : d5;
    }

    public static double getFiniteDoubleOrDefaultNullable(Double d4, double d5) {
        return d4 == null ? d5 : getFiniteDoubleOrDefault(d4.doubleValue(), d5);
    }

    public static long getMillisOrDefault(Long l4, TimeUnit timeUnit, long j4) {
        return l4 == null ? j4 : timeUnit.toMillis(l4.longValue());
    }

    public static <T> T getOrDefault(T t4, T t5) {
        return t4 == null ? t5 : t4;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t4, T t5) {
        return t4 == null ? t5 : t4;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t4) {
        return t4 == null ? "<null>" : t4.toString().isEmpty() ? "<empty>" : t4.toString();
    }
}
