package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final nm1 f23907a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f23908b;

    public /* synthetic */ bs1(Context context, bd0 bd0Var) {
        this(context, new nm1(bd0Var));
    }

    @NotNull
    public final as1 a(@NotNull ur1 contentController) {
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Context appContext = this.f23908b;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return new as1(appContext, contentController, this.f23907a, new ts0(appContext), new ps0());
    }

    public bs1(@NotNull Context context, @NotNull nm1 proxyRewardedAdShowListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proxyRewardedAdShowListener, "proxyRewardedAdShowListener");
        this.f23907a = proxyRewardedAdShowListener;
        this.f23908b = context.getApplicationContext();
    }
}
