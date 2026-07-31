package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.pc, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2159pc<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f30404a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final c51 f30405b;

    public C2159pc(@NotNull ct nativeAdAssets, @NotNull c51 nativeAdDividerViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(nativeAdDividerViewProvider, "nativeAdDividerViewProvider");
        this.f30404a = nativeAdAssets;
        this.f30405b = nativeAdDividerViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f30405b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        View findViewById = container.findViewById(R.id.age_divider);
        if (findViewById == null || this.f30404a.a() != null) {
            return;
        }
        findViewById.setVisibility(8);
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
