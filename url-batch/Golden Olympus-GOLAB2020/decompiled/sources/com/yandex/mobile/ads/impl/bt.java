package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class bt {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gp0 f23909a;

    public /* synthetic */ bt(Context context, um2 um2Var) {
        this(context, um2Var, new hp0());
    }

    public final void a() {
        this.f23909a.a();
    }

    public final void a(@NotNull C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f23909a.a(adRequestData);
    }

    public bt(@NotNull Context context, @NotNull um2 sdkEnvironmentModule, @NotNull hp0 itemsLoadControllerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(itemsLoadControllerFactory, "itemsLoadControllerFactory");
        itemsLoadControllerFactory.getClass();
        this.f23909a = hp0.a(context, sdkEnvironmentModule);
        C2054l0.a(context);
    }

    public final void a(@Nullable em2 em2Var) {
        this.f23909a.a(em2Var);
    }
}
