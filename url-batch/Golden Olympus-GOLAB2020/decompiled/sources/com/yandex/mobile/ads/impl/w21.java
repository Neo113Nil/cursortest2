package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class w21 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final at1<MultiBannerControlsContainer> f33902a = new at1<>();

    @Nullable
    public final MultiBannerControlsContainer a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        at1<MultiBannerControlsContainer> at1Var = this.f33902a;
        int i4 = R.layout.monetization_ads_internal_multibanner_controls;
        at1Var.getClass();
        MultiBannerControlsContainer multiBannerControlsContainer = (MultiBannerControlsContainer) at1.a(context, MultiBannerControlsContainer.class, i4, null);
        if (multiBannerControlsContainer == null) {
            return multiBannerControlsContainer;
        }
        multiBannerControlsContainer.setLayoutParams(layoutParams);
        return multiBannerControlsContainer;
    }
}
