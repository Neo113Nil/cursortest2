package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ta0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f32266a;

    public ta0(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f32266a = context;
    }

    @NotNull
    public final ImageView a(int i4, int i5) {
        ImageView imageView = new ImageView(this.f32266a);
        int a4 = lh2.a(this.f32266a, 28.0f);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a4, a4);
        layoutParams.gravity = 8388613;
        layoutParams.rightMargin = i4;
        layoutParams.topMargin = i5;
        imageView.setLayoutParams(layoutParams);
        return imageView;
    }
}
