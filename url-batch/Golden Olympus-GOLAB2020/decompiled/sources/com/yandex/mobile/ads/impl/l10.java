package com.yandex.mobile.ads.impl;

import O1.C1165z4;
import android.content.Context;
import com.yandex.div.core.DivConfiguration;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class l10 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final mp1 f28383a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final tz1 f28384b;

    public /* synthetic */ l10(mp1 mp1Var) {
        this(mp1Var, new tz1());
    }

    @NotNull
    public final DivConfiguration a(@NotNull Context context, @NotNull C1165z4 divData, @NotNull f61 nativeAdPrivate, @NotNull k20 clickHandler) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(nativeAdPrivate, "nativeAdPrivate");
        Intrinsics.checkNotNullParameter(clickHandler, "clickHandler");
        if (!(nativeAdPrivate instanceof pz1)) {
            DivConfiguration a4 = new p20(context, clickHandler).a();
            Intrinsics.checkNotNull(a4);
            return a4;
        }
        sz1 sz1Var = new sz1(this.f28383a);
        sz1Var.a(divData, (pz1) nativeAdPrivate);
        this.f28384b.getClass();
        return tz1.a(context, sz1Var, clickHandler);
    }

    public l10(@NotNull mp1 reporter, @NotNull tz1 sliderDivConfigurationCreator) {
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(sliderDivConfigurationCreator, "sliderDivConfigurationCreator");
        this.f28383a = reporter;
        this.f28384b = sliderDivConfigurationCreator;
    }
}
