package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;

/* loaded from: classes.dex */
public final class SystemServiceUtils {
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    public static final <T, S> S accessSystemServiceByNameSafely(Context context, String str, String str2, String str3, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(Context context, String str, String str2, String str3, S s4, FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s4, functionWithThrowable);
        } catch (Throwable unused) {
            return s4;
        }
    }

    public static final <T, S> S accessSystemServiceSafely(T t4, String str, String str2, FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t4 == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(T t4, String str, String str2, S s4, FunctionWithThrowable<T, S> functionWithThrowable) {
        S s5 = (S) accessSystemServiceSafely(t4, str, str2, functionWithThrowable);
        return s5 == null ? s4 : s5;
    }
}
