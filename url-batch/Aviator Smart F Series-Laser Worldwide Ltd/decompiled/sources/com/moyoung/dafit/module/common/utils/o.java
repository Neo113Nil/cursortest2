package com.moyoung.dafit.module.common.utils;

import android.content.Context;

/* loaded from: classes4.dex */
public class o {
    public static int dp2px(float f8) {
        return dp2px(d.get(), f8);
    }

    public static int px2dip(Context context, float f8) {
        return (int) ((f8 / context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public static int dp2px(Context context, float f8) {
        return (int) ((f8 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }
}
