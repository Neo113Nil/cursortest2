package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class o6 {
    public final Context a;
    public final v6 b;

    public o6(Context context, v6 displayMeasurement) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(displayMeasurement, "displayMeasurement");
        this.a = context;
        this.b = displayMeasurement;
    }

    public final int a() {
        Integer b = p6.b(this.a);
        Intrinsics.checkNotNullExpressionValue(b, "getOpenRTBDeviceType(...)");
        return b.intValue();
    }

    public final String b() {
        String d = p6.d(this.a);
        Intrinsics.checkNotNullExpressionValue(d, "getType(...)");
        return d;
    }

    public final boolean c() {
        return qe.c(this.a, this.b);
    }
}
