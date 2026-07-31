package com.yandex.mobile.ads.impl;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ww {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f34213a;

    public ww(boolean z4) {
        this.f34213a = z4;
    }

    public final boolean a() {
        return this.f34213a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ww) && this.f34213a == ((ww) obj).f34213a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f34213a);
    }

    @NotNull
    public final String toString() {
        return "DebugPanelErrorIndicatorData(isEnabled=" + this.f34213a + ")";
    }
}
