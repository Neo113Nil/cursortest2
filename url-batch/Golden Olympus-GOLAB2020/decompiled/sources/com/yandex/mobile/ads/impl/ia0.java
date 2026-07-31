package com.yandex.mobile.ads.impl;

import com.ironsource.b9;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ia0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Set<String> f27145a;

    public ia0(@NotNull ct nativeAdAssets, @NotNull C2232sh availableAssetsProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(availableAssetsProvider, "availableAssetsProvider");
        availableAssetsProvider.getClass();
        this.f27145a = C2232sh.a(nativeAdAssets);
    }

    public final boolean a() {
        return this.f27145a.size() == 2 && this.f27145a.contains("feedback") && this.f27145a.contains(b9.h.f15446I0);
    }
}
