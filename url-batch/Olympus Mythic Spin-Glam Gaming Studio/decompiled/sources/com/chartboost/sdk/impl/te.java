package com.chartboost.sdk.impl;

import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class te {
    public static final te a = new te();

    public final k2 a(Context context, t5 ctaConfig, Function0 function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(ctaConfig, "ctaConfig");
        k2 vlVar = ctaConfig.b() != null ? new vl(context, null, 0, null, function0, 14, null) : new rd(context, null, 0, null, null, null, null, function0, 126, null);
        vlVar.a(ctaConfig);
        return vlVar;
    }
}
