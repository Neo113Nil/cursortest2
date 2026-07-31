package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;
import j2.AbstractC3185a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fd0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final d10 f25755a = new d10();

    @NotNull
    public final ed0 a(@NotNull Context context, @NotNull C2360y7<String> adResponse, @NotNull C2286v2 adConfiguration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Context context2 = context.getApplicationContext();
        Intrinsics.checkNotNull(context2);
        ed0 ed0Var = new ed0(context2, adResponse, adConfiguration);
        ed0Var.setId(2);
        d10 d10Var = this.f25755a;
        float r4 = adResponse.r();
        d10Var.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        int c4 = AbstractC3185a.c(TypedValue.applyDimension(1, r4, context2.getResources().getDisplayMetrics()));
        d10 d10Var2 = this.f25755a;
        float c5 = adResponse.c();
        d10Var2.getClass();
        Intrinsics.checkNotNullParameter(context2, "context");
        int c6 = AbstractC3185a.c(TypedValue.applyDimension(1, c5, context2.getResources().getDisplayMetrics()));
        if (c4 > 0 && c6 > 0) {
            ed0Var.layout(0, 0, c4, c6);
        }
        return ed0Var;
    }
}
