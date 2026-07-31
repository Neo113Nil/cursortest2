package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fx1 implements gs1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gx1 f25943a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C1920f9 f25944b;

    public fx1(@NotNull Context context, @NotNull C2286v2 adConfiguration, @NotNull gx1 serverSideReward, @NotNull C1920f9 adTracker) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(serverSideReward, "serverSideReward");
        Intrinsics.checkNotNullParameter(adTracker, "adTracker");
        this.f25943a = serverSideReward;
        this.f25944b = adTracker;
    }

    @Override // com.yandex.mobile.ads.impl.gs1
    public final void a() {
        this.f25944b.a(this.f25943a.c(), o62.f29925j);
    }
}
