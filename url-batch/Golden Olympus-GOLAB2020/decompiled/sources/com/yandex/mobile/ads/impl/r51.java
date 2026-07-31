package com.yandex.mobile.ads.impl;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import kotlin.KotlinVersion;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r51 {

    /* renamed from: b, reason: collision with root package name */
    private static final int f31049b = Color.parseColor("#eaeaea");

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ImageView[] f31050a;

    public r51(@NotNull ImageView... imageViews) {
        Intrinsics.checkNotNullParameter(imageViews, "imageViews");
        this.f31050a = imageViews;
        b();
    }

    public final void a() {
        for (ImageView imageView : this.f31050a) {
            Drawable background = imageView.getBackground();
            Intrinsics.checkNotNull(background, "null cannot be cast to non-null type android.graphics.drawable.ColorDrawable");
            ColorDrawable colorDrawable = (ColorDrawable) background;
            Drawable drawable = imageView.getDrawable();
            if (drawable != null && colorDrawable.getAlpha() == 255) {
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(colorDrawable, PropertyValuesHolder.ofInt("alpha", KotlinVersion.MAX_COMPONENT_VALUE, 0));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder.setTarget(colorDrawable);
                ofPropertyValuesHolder.setDuration(500L);
                ofPropertyValuesHolder.start();
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(drawable, PropertyValuesHolder.ofInt("alpha", 0, KotlinVersion.MAX_COMPONENT_VALUE));
                Intrinsics.checkNotNullExpressionValue(ofPropertyValuesHolder2, "ofPropertyValuesHolder(...)");
                ofPropertyValuesHolder2.setTarget(drawable);
                ofPropertyValuesHolder2.setDuration(500L);
                ofPropertyValuesHolder2.start();
            }
        }
    }

    public final void b() {
        for (ImageView imageView : this.f31050a) {
            if (imageView != null) {
                if (imageView.getDrawable() != null) {
                    imageView.setBackgroundColor(0);
                } else {
                    imageView.setBackgroundColor(f31049b);
                }
            }
        }
    }
}
