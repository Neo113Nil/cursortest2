package com.yandex.div.internal.util;

import java.lang.Number;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import m2.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PositiveNumberDelegate<T extends Number> {

    @NotNull
    private final T fallbackValue;

    @NotNull
    private T value;

    public PositiveNumberDelegate(@NotNull T value, @NotNull T fallbackValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(fallbackValue, "fallbackValue");
        this.value = value;
        this.fallbackValue = fallbackValue;
    }

    @NotNull
    public final T getValue(@Nullable Object obj, @NotNull h property) {
        Intrinsics.checkNotNullParameter(property, "property");
        return this.value;
    }

    public final void setValue(@Nullable Object obj, @NotNull h property, @NotNull T value) {
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.doubleValue() <= 0.0d) {
            value = this.fallbackValue;
        }
        this.value = value;
    }

    public /* synthetic */ PositiveNumberDelegate(Number number, Number number2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(number, (i4 & 2) != 0 ? 1 : number2);
    }
}
