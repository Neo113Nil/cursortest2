package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class nw1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final x82 f29775a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z82 f29776b;

    public /* synthetic */ nw1(Context context) {
        this(context, new x82(context), new z82(context));
    }

    public final void a() {
        this.f29776b.a();
        this.f29775a.a();
    }

    public nw1(@NotNull Context context, @NotNull x82 indicatorController, @NotNull z82 logController) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(indicatorController, "indicatorController");
        Intrinsics.checkNotNullParameter(logController, "logController");
        this.f29775a = indicatorController;
        this.f29776b = logController;
    }
}
