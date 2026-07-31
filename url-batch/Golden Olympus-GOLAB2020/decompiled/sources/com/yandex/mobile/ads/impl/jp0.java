package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class jp0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final lm1 f27795a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f27796b;

    public /* synthetic */ jp0(Context context, bd0 bd0Var) {
        this(context, new lm1(bd0Var));
    }

    @NotNull
    public final ip0 a(@NotNull cp0 contentController) {
        Intrinsics.checkNotNullParameter(contentController, "contentController");
        Context appContext = this.f27796b;
        Intrinsics.checkNotNullExpressionValue(appContext, "appContext");
        return new ip0(appContext, contentController, this.f27795a, new ts0(appContext), new ps0());
    }

    public jp0(@NotNull Context context, @NotNull lm1 proxyInterstitialAdShowListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(proxyInterstitialAdShowListener, "proxyInterstitialAdShowListener");
        this.f27795a = proxyInterstitialAdShowListener;
        this.f27796b = context.getApplicationContext();
    }
}
