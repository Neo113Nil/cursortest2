package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class ol {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f44762a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f44763b;

    public ol(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f44762a = generalAnalyticsParametersFactory;
        this.f44763b = analyticsSender;
    }
}
