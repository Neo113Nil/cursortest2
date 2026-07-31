package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bu {
    @NotNull
    public static au a(@NotNull Context context, @NotNull View roundView, @Nullable AttributeSet attributeSet, int i4) {
        float f4;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(roundView, "view");
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.MonetizationAdsInternalRoundImageView, i4, 0);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            f4 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.MonetizationAdsInternalRoundImageView_monetization_internal_corner_radius, 0);
            obtainStyledAttributes.recycle();
        } else {
            f4 = 0.0f;
        }
        float f5 = f4;
        Intrinsics.checkNotNullParameter(roundView, "roundView");
        return new au(roundView, f5, f5, f5, f5);
    }
}
