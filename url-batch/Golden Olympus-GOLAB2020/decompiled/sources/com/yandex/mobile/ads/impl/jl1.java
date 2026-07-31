package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jl1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f27721a;

    public /* synthetic */ jl1() {
        this(new d10());
    }

    @NotNull
    public final ProgressBar a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ProgressBar progressBar = new ProgressBar(context);
        progressBar.setIndeterminateDrawable(androidx.core.content.a.g(context, R.drawable.monetization_ads_video_progress_bar_background));
        this.f27721a.getClass();
        int a4 = d10.a(context, 45.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a4, a4);
        layoutParams.gravity = 17;
        progressBar.setLayoutParams(layoutParams);
        return progressBar;
    }

    public jl1(@NotNull d10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f27721a = dimensionConverter;
    }
}
