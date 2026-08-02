package com.squareup.protos.cash.appthemes;

import app.cash.local.primitives.BrandKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppThemeDefinition$ColorScheme$BackgroundColor extends BrandKt {
    public final BackgroundColor value;

    public AppThemeDefinition$ColorScheme$BackgroundColor(BackgroundColor backgroundColor) {
        backgroundColor.getClass();
        this.value = backgroundColor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppThemeDefinition$ColorScheme$BackgroundColor) && Intrinsics.areEqual(this.value, ((AppThemeDefinition$ColorScheme$BackgroundColor) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "BackgroundColor(value=" + this.value + ")";
    }
}
