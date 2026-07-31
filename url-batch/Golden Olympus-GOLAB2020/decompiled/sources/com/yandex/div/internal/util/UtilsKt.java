package com.yandex.div.internal.util;

import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.properties.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class UtilsKt {
    public static final <K, V> V getOrThrow(@NotNull Map<? extends K, ? extends V> map, K k4, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        V v4 = map.get(k4);
        if (v4 != null) {
            return v4;
        }
        throw new NoSuchElementException(str);
    }

    public static /* synthetic */ Object getOrThrow$default(Map map, Object obj, String str, int i4, Object obj2) {
        if ((i4 & 2) != 0) {
            str = null;
        }
        return getOrThrow(map, obj, str);
    }

    @NotNull
    public static final <T> c weak(@Nullable T t4) {
        return new WeakRef(t4);
    }
}
