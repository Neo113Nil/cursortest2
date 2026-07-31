package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class z9 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f45322a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f45323b;

    public z9(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f45322a = generalAnalyticsParametersFactory;
        this.f45323b = analyticsSender;
    }
}
