package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.widget.FrameLayout;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ur {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final fp f33229a;

    public ur(@NotNull fp closeButtonControllerProvider) {
        Intrinsics.checkNotNullParameter(closeButtonControllerProvider, "closeButtonControllerProvider");
        this.f33229a = closeButtonControllerProvider;
    }

    @NotNull
    public final tr a(@NotNull FrameLayout closeButton, @NotNull C2360y7 adResponse, @NotNull sv debugEventsReporter, boolean z4, boolean z5) {
        ep azVar;
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        this.f33229a.getClass();
        Intrinsics.checkNotNullParameter(closeButton, "closeButton");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(debugEventsReporter, "debugEventsReporter");
        Long u4 = adResponse.u();
        if (z4 && u4 == null) {
            azVar = new w11(closeButton, new o82(), new Handler(Looper.getMainLooper()));
        } else {
            azVar = new az(closeButton, new sh2(), debugEventsReporter, u4 != null ? u4.longValue() : 0L, new np());
        }
        return z5 ? new qc0(azVar) : new fb0(azVar);
    }
}
