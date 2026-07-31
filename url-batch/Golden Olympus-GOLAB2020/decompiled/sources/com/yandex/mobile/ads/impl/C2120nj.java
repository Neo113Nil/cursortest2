package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.nj, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2120nj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vy1 f29655a;

    protected C2120nj(@NotNull vy1 sizeInfo) {
        Intrinsics.checkNotNullParameter(sizeInfo, "sizeInfo");
        this.f29655a = sizeInfo;
    }

    @NotNull
    public final vy1 a() {
        return this.f29655a;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof C2120nj) && Intrinsics.areEqual(((C2120nj) obj).f29655a, this.f29655a);
    }

    public final int hashCode() {
        return this.f29655a.hashCode();
    }

    @NotNull
    public final String toString() {
        return this.f29655a.toString();
    }
}
