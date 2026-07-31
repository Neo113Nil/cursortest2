package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;
import ru.rustore.sdk.metrics.internal.w0;

/* loaded from: classes3.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f43729a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f43730b;

    /* renamed from: c, reason: collision with root package name */
    public final l0 f43731c;

    public n0(i0 persistentMetricsEventDataSource, k0 persistentMetricsEventDtoFactory, l0 persistentMetricsEventMapper, w0.b logger) {
        Intrinsics.checkNotNullParameter(persistentMetricsEventDataSource, "persistentMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(persistentMetricsEventDtoFactory, "persistentMetricsEventDtoFactory");
        Intrinsics.checkNotNullParameter(persistentMetricsEventMapper, "persistentMetricsEventMapper");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f43729a = persistentMetricsEventDataSource;
        this.f43730b = persistentMetricsEventDtoFactory;
        this.f43731c = persistentMetricsEventMapper;
    }
}
