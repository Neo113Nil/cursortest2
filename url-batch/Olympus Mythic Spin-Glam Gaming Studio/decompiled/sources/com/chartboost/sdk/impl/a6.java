package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class a6 implements g6 {
    public final float a;

    public a6(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.a = context.getResources().getDisplayMetrics().density;
    }

    @Override // com.chartboost.sdk.impl.g6
    public int a(double d) {
        return (int) (d * this.a);
    }

    @Override // com.chartboost.sdk.impl.g6
    public int a(int i) {
        return (int) (i * this.a);
    }
}
