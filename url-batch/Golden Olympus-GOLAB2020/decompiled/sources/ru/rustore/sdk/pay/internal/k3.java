package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class k3 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f44413a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f44414b;

    public k3(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f44413a = generalAnalyticsParametersFactory;
        this.f44414b = analyticsSender;
    }
}
