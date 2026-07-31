package com.yandex.div.internal.util;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class ConvertUtilsKt {
    @Nullable
    public static final Boolean toBoolean(@NotNull Number number) {
        Intrinsics.checkNotNullParameter(number, "<this>");
        return number instanceof Double ? toBoolean(number.doubleValue()) : toBoolean(number.intValue());
    }

    @Nullable
    public static final Boolean toBoolean(int i4) {
        if (i4 == 0) {
            return Boolean.FALSE;
        }
        if (i4 != 1) {
            return null;
        }
        return Boolean.TRUE;
    }

    private static final Boolean toBoolean(double d4) {
        if (d4 == 0.0d) {
            return Boolean.FALSE;
        }
        if (d4 == 1.0d) {
            return Boolean.TRUE;
        }
        return null;
    }
}
