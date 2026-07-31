package ru.rustore.sdk.pay.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class zf {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final s5 f45353a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final m f45354b;

    public zf(@NotNull s5 generalAnalyticsParametersFactory, @NotNull m analyticsSender) {
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(analyticsSender, "analyticsSender");
        this.f45353a = generalAnalyticsParametersFactory;
        this.f45354b = analyticsSender;
    }
}
