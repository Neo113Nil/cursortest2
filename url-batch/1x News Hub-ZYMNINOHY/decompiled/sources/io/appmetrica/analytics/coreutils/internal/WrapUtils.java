package io.appmetrica.analytics.coreutils.internal;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class WrapUtils {
    public static double getFiniteDoubleOrDefault(double d3, double d4) {
        return Double.isFinite(d3) ? d3 : d4;
    }

    public static long getMillisOrDefault(Long l3, TimeUnit timeUnit, long j3) {
        return l3 == null ? j3 : timeUnit.toMillis(l3.longValue());
    }

    public static <T> T getOrDefault(T t3, T t4) {
        return t3 == null ? t4 : t3;
    }

    public static String getOrDefaultIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> T getOrDefaultNullable(T t3, T t4) {
        return t3 == null ? t4 : t3;
    }

    public static String getOrDefaultNullableIfEmpty(String str, String str2) {
        return TextUtils.isEmpty(str) ? str2 : str;
    }

    public static <T> String wrapToTag(T t3) {
        return t3 == null ? "<null>" : t3.toString().isEmpty() ? "<empty>" : t3.toString();
    }
}
