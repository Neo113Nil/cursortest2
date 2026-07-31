package com.yandex.mobile.ads.impl;

import android.R;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.q7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2177q7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ColorDrawable f30696a = new ColorDrawable(Color.parseColor("#80ffffff"));

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private static final LayerDrawable f30697b;

    static {
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setCornerRadius(0.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{C2154p7.c(), C2154p7.c()});
        gradientDrawable2.setCornerRadius(0.0f);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, new ClipDrawable(gradientDrawable2, 3, 1)});
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        f30697b = layerDrawable;
    }

    @NotNull
    public static LayerDrawable a() {
        return f30697b;
    }
}
