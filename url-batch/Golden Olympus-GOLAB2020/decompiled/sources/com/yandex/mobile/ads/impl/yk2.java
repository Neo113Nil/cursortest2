package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.AdError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class yk2 implements AdError {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f35169a;

    public yk2(@NotNull String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        this.f35169a = description;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yk2) && Intrinsics.areEqual(this.f35169a, ((yk2) obj).f35169a);
    }

    @Override // com.yandex.mobile.ads.common.AdError
    @NotNull
    public final String getDescription() {
        return this.f35169a;
    }

    public final int hashCode() {
        return this.f35169a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "YandexAdError(description=" + this.f35169a + ")";
    }
}
