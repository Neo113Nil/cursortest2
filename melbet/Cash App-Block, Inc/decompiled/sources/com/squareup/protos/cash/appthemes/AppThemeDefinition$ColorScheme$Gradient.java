package com.squareup.protos.cash.appthemes;

import app.cash.local.primitives.BrandKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class AppThemeDefinition$ColorScheme$Gradient extends BrandKt {
    public final Gradient value;

    public AppThemeDefinition$ColorScheme$Gradient(Gradient gradient) {
        gradient.getClass();
        this.value = gradient;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AppThemeDefinition$ColorScheme$Gradient) && Intrinsics.areEqual(this.value, ((AppThemeDefinition$ColorScheme$Gradient) obj).value);
    }

    public final int hashCode() {
        return this.value.hashCode();
    }

    public final String toString() {
        return "Gradient(value=" + this.value + ")";
    }
}
