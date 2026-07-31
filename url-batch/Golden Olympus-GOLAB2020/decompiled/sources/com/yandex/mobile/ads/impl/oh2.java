package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class oh2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final List<String> f30051a;

    public oh2(@NotNull ArrayList viewableUrls) {
        Intrinsics.checkNotNullParameter(viewableUrls, "viewableUrls");
        this.f30051a = viewableUrls;
    }

    @NotNull
    public final List<String> a() {
        return this.f30051a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oh2) && Intrinsics.areEqual(this.f30051a, ((oh2) obj).f30051a);
    }

    public final int hashCode() {
        return this.f30051a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "ViewableImpression(viewableUrls=" + this.f30051a + ")";
    }
}
