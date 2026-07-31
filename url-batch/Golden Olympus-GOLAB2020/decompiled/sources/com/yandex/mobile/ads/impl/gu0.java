package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class gu0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f26296a;

    public gu0(@NotNull ct nativeAdAssets) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f26296a = nativeAdAssets;
    }

    @Nullable
    public final Float a() {
        jt i4 = this.f26296a.i();
        et h4 = this.f26296a.h();
        if (i4 != null) {
            return Float.valueOf(i4.a());
        }
        if (h4 == null || h4.d() <= 0 || h4.b() <= 0) {
            return null;
        }
        return Float.valueOf(h4.d() / h4.b());
    }
}
