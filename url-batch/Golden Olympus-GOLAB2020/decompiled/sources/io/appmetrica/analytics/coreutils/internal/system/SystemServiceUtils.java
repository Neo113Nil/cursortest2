package io.appmetrica.analytics.coreutils.internal.system;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SystemServiceUtils {

    @NotNull
    public static final SystemServiceUtils INSTANCE = new SystemServiceUtils();

    private SystemServiceUtils() {
    }

    @Nullable
    public static final <T, S> S accessSystemServiceByNameSafely(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafely(context.getSystemService(str), str2, str3, functionWithThrowable);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceByNameSafelyOrDefault(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull String str3, S s4, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        try {
            return (S) accessSystemServiceSafelyOrDefault(context.getSystemService(str), str2, str3, s4, functionWithThrowable);
        } catch (Throwable unused) {
            return s4;
        }
    }

    @Nullable
    public static final <T, S> S accessSystemServiceSafely(@Nullable T t4, @NotNull String str, @NotNull String str2, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        if (t4 == null) {
            return null;
        }
        try {
            return functionWithThrowable.apply(t4);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final <T, S> S accessSystemServiceSafelyOrDefault(@Nullable T t4, @NotNull String str, @NotNull String str2, S s4, @NotNull FunctionWithThrowable<T, S> functionWithThrowable) {
        S s5 = (S) accessSystemServiceSafely(t4, str, str2, functionWithThrowable);
        return s5 == null ? s4 : s5;
    }
}
