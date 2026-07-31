package com.yandex.mobile.ads.impl;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.yandex.mobile.ads.impl.v7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2291v7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final GradientDrawable f33538a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public static final ColorDrawable f33539b;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(0.0f);
        f33538a = gradientDrawable;
        f33539b = new ColorDrawable(Color.parseColor("#ff000000"));
    }
}
