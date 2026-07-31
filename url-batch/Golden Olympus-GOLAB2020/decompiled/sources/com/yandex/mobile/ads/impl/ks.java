package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class ks {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Cif f28309a;

    public ks(@NotNull Context context, @NotNull um2 sdkModule) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkModule, "sdkModule");
        this.f28309a = C2021jf.a(context, sdkModule);
        C2054l0.a(context);
    }

    public final void a() {
        this.f28309a.a();
    }

    public final void a(@NotNull C1918f7 adRequestData) {
        Intrinsics.checkNotNullParameter(adRequestData, "adRequestData");
        this.f28309a.a(adRequestData);
    }

    public final void a(@Nullable hl2 hl2Var) {
        this.f28309a.a(hl2Var);
    }
}
