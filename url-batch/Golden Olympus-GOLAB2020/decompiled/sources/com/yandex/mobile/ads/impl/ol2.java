package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.common.ImpressionData;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ol2 implements ImpressionData {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1795a4 f30088a;

    public ol2(@NotNull C1795a4 impressionData) {
        Intrinsics.checkNotNullParameter(impressionData, "impressionData");
        this.f30088a = impressionData;
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof ol2) && Intrinsics.areEqual(((ol2) obj).f30088a, this.f30088a);
    }

    @Override // com.yandex.mobile.ads.common.ImpressionData
    @NotNull
    public final String getRawData() {
        return this.f30088a.c();
    }

    public final int hashCode() {
        return this.f30088a.hashCode();
    }
}
