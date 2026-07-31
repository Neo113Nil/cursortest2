package ru.rustore.sdk.pay.internal;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.metrics.MetricsClient;

/* loaded from: classes3.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final a0 f44602a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final s5 f44603b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final MetricsClient f44604c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    public final Context f44605d;

    public lj(@NotNull a0 appVersionNameRepository, @NotNull s5 generalAnalyticsParametersFactory, @NotNull MetricsClient metricsClient, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(appVersionNameRepository, "appVersionNameRepository");
        Intrinsics.checkNotNullParameter(generalAnalyticsParametersFactory, "generalAnalyticsParametersFactory");
        Intrinsics.checkNotNullParameter(metricsClient, "metricsClient");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f44602a = appVersionNameRepository;
        this.f44603b = generalAnalyticsParametersFactory;
        this.f44604c = metricsClient;
        this.f44605d = context;
    }
}
