package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f43723a;

    /* renamed from: b, reason: collision with root package name */
    public final c f43724b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f43725c;

    /* renamed from: d, reason: collision with root package name */
    public final y0 f43726d;

    /* renamed from: e, reason: collision with root package name */
    public final w0.b f43727e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f43728f;

    public n(t0 sendMetricsEventInteractor, c enqueueMetricsEventUseCase, u0 sendMetricsEventJobScheduler, y0 singleThreadDispatcher, w0.b logger) {
        Intrinsics.checkNotNullParameter(sendMetricsEventInteractor, "sendMetricsEventInteractor");
        Intrinsics.checkNotNullParameter(enqueueMetricsEventUseCase, "enqueueMetricsEventUseCase");
        Intrinsics.checkNotNullParameter(sendMetricsEventJobScheduler, "sendMetricsEventJobScheduler");
        Intrinsics.checkNotNullParameter(singleThreadDispatcher, "singleThreadDispatcher");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43723a = sendMetricsEventInteractor;
        this.f43724b = enqueueMetricsEventUseCase;
        this.f43725c = sendMetricsEventJobScheduler;
        this.f43726d = singleThreadDispatcher;
        this.f43727e = logger;
    }
}
