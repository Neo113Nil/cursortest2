package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ha0 {

    /* renamed from: d, reason: collision with root package name */
    private static final int f26676d = Color.parseColor("#66000000");

    /* renamed from: e, reason: collision with root package name */
    private static final int f26677e = Color.parseColor("#00000000");

    /* renamed from: f, reason: collision with root package name */
    private static final int f26678f = Color.parseColor("#7f7f7f");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f26679a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ct f26680b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ia0 f26681c;

    public ha0(@NotNull Context context, @NotNull ct nativeAdAssets, @NotNull ia0 feedbackAppearanceResolver) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        Intrinsics.checkNotNullParameter(feedbackAppearanceResolver, "feedbackAppearanceResolver");
        this.f26679a = context;
        this.f26680b = nativeAdAssets;
        this.f26681c = feedbackAppearanceResolver;
    }

    public final void a(@NotNull ImageView feedbackView, @NotNull FrameLayout feedbackContainer, int i4) {
        Intrinsics.checkNotNullParameter(feedbackView, "feedbackView");
        Intrinsics.checkNotNullParameter(feedbackContainer, "feedbackContainer");
        if (!this.f26681c.a()) {
            int i5 = f26678f;
            Drawable g4 = androidx.core.content.a.g(this.f26679a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i5, PorterDuff.Mode.SRC_ATOP);
            if (g4 != null) {
                g4.setColorFilter(porterDuffColorFilter);
            }
            feedbackView.setImageDrawable(g4);
            feedbackContainer.setPadding(0, 0, 0, 0);
            feedbackContainer.setBackground(null);
            feedbackContainer.setVisibility(0);
            return;
        }
        if (this.f26680b.i() != null) {
            int i6 = f26678f;
            Drawable g5 = androidx.core.content.a.g(this.f26679a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i6, PorterDuff.Mode.SRC_ATOP);
            if (g5 != null) {
                g5.setColorFilter(porterDuffColorFilter2);
            }
            feedbackView.setImageDrawable(g5);
            feedbackContainer.setPadding(0, 0, 0, 0);
            feedbackContainer.setBackground(null);
            feedbackContainer.setVisibility(8);
            return;
        }
        if (this.f26680b.h() != null) {
            Drawable g6 = androidx.core.content.a.g(this.f26679a, R.drawable.monetization_ads_internal_ic_close_gray);
            PorterDuffColorFilter porterDuffColorFilter3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
            if (g6 != null) {
                g6.setColorFilter(porterDuffColorFilter3);
            }
            feedbackView.setImageDrawable(g6);
            GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{f26676d, f26677e});
            feedbackContainer.setPadding(0, 0, 0, i4);
            feedbackContainer.setBackground(gradientDrawable);
            feedbackContainer.setVisibility(0);
        }
    }
}
