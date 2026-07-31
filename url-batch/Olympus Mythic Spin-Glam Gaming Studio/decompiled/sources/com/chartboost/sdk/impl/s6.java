package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* loaded from: classes6.dex */
public final class s6 {
    public static final s6 a = new s6();

    public final float a(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public final int a(int i, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        float a2 = a(context);
        if (a2 == 0.0f) {
            return 0;
        }
        return MathKt.roundToInt(i / a2);
    }
}
