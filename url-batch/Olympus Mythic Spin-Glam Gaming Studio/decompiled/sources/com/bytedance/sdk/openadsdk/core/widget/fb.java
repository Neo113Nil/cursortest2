package com.bytedance.sdk.openadsdk.core.widget;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import com.bytedance.sdk.openadsdk.utils.jy;

/* loaded from: classes5.dex */
public class fb {
    public static Drawable zmn() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }

    public static Drawable fs() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 44.0f));
        gradientDrawable.setStroke(jy.fs(com.bytedance.sdk.openadsdk.core.kgc.zmn(), 1.0f), Color.parseColor("#33FFFFFF"));
        gradientDrawable.setColor(Color.parseColor("#99333333"));
        return gradientDrawable;
    }
}
