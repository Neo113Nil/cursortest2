package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ip1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ny {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final np1 f29789a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final xe1 f29790b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final e51 f29791c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final vj1 f29792d;

    public ny(@NotNull C2286v2 adConfiguration, @NotNull C2360y7 adResponse, @NotNull np1 reporter, @NotNull e91 openUrlHandler, @NotNull e51 nativeAdEventController, @NotNull vj1 preferredPackagesViewer) {
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(openUrlHandler, "openUrlHandler");
        Intrinsics.checkNotNullParameter(nativeAdEventController, "nativeAdEventController");
        Intrinsics.checkNotNullParameter(preferredPackagesViewer, "preferredPackagesViewer");
        this.f29789a = reporter;
        this.f29790b = openUrlHandler;
        this.f29791c = nativeAdEventController;
        this.f29792d = preferredPackagesViewer;
    }

    public final void a(@NotNull Context context, @NotNull jy action) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        if (this.f29792d.a(context, action.d())) {
            this.f29789a.a(ip1.b.f27318F);
            this.f29791c.d();
        } else {
            this.f29790b.a(action.c());
        }
    }
}
