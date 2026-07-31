package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.Button;
import android.widget.FrameLayout;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fp1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f25891a;

    public /* synthetic */ fp1() {
        this(new d10());
    }

    @NotNull
    public final Button a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Button button = new Button(context);
        button.setBackground(androidx.core.content.a.g(context, R.drawable.monetization_ads_video_ic_replay));
        this.f25891a.getClass();
        int a4 = d10.a(context, 90.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a4, a4);
        layoutParams.gravity = 17;
        button.setLayoutParams(layoutParams);
        return button;
    }

    public fp1(@NotNull d10 dimensionConverter) {
        Intrinsics.checkNotNullParameter(dimensionConverter, "dimensionConverter");
        this.f25891a = dimensionConverter;
    }
}
