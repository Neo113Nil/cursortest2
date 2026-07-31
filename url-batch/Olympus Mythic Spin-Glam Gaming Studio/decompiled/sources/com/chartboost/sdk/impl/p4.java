package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public abstract class p4 {
    public static final Context a() {
        Context applicationContext = f4.b.d().getContext().getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        return applicationContext;
    }

    public static final hb b() {
        return f4.b.a().v();
    }
}
