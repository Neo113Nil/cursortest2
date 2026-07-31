package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class eh {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f44040a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f44041b;

    public eh(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f44040a = generalAnalyticsParametersFactory;
        this.f44041b = analyticsSender;
    }
}
