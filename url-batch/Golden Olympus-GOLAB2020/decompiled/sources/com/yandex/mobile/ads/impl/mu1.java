package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ew1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class mu1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final gu1 f29236a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mw1 f29237b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final gr f29238c;

    public /* synthetic */ mu1() {
        this(new gu1(), new mw1());
    }

    public final boolean a(@NotNull du1 sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (this.f29236a.a(sdkConfiguration)) {
            return true;
        }
        this.f29237b.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (!Intrinsics.areEqual("7.15.0", sdkConfiguration.M())) {
            return true;
        }
        this.f29238c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        int i4 = ew1.f25476l;
        if (!Intrinsics.areEqual(ew1.a.a().i(), sdkConfiguration.B0())) {
            return true;
        }
        this.f29238c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        if (ew1.a.a().c() != sdkConfiguration.o0()) {
            return true;
        }
        this.f29238c.getClass();
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        return !Intrinsics.areEqual(ew1.a.a().e(), sdkConfiguration.W());
    }

    public mu1(@NotNull gu1 sdkConfigurationExpiredDateValidator, @NotNull mw1 sdkVersionUpdateValidator) {
        Intrinsics.checkNotNullParameter(sdkConfigurationExpiredDateValidator, "sdkConfigurationExpiredDateValidator");
        Intrinsics.checkNotNullParameter(sdkVersionUpdateValidator, "sdkVersionUpdateValidator");
        this.f29236a = sdkConfigurationExpiredDateValidator;
        this.f29237b = sdkVersionUpdateValidator;
        this.f29238c = new gr();
    }
}
