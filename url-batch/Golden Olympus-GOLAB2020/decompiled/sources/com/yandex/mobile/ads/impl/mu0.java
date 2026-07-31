package com.yandex.mobile.ads.impl;

import android.content.Context;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mu0 implements r00 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29234a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gu0 f29235b;

    public mu0(@NotNull ct nativeAdAssets, int i4, @NotNull gu0 mediaAspectRatioProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(mediaAspectRatioProvider, "mediaAspectRatioProvider");
        this.f29234a = i4;
        this.f29235b = mediaAspectRatioProvider;
    }

    @Override // com.yandex.mobile.ads.impl.r00
    public final boolean a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int c4 = lh2.c(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int i4 = context.getResources().getDisplayMetrics().widthPixels;
        Float a4 = this.f29235b.a();
        return i4 - (a4 != null ? AbstractC3185a.c(a4.floatValue() * ((float) c4)) : 0) >= this.f29234a;
    }
}
