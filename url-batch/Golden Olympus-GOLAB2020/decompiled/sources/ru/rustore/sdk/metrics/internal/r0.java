package ru.rustore.sdk.metrics.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a1 f43756a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f43757b;

    /* renamed from: c, reason: collision with root package name */
    public final o0 f43758c;

    /* renamed from: d, reason: collision with root package name */
    public final d1 f43759d;

    public r0(a1 userIdDataSource, c0 packageNameDataSource, o0 remoteMetricsEventDataSource, d1 versionNameDataSource) {
        Intrinsics.checkNotNullParameter(userIdDataSource, "userIdDataSource");
        Intrinsics.checkNotNullParameter(packageNameDataSource, "packageNameDataSource");
        Intrinsics.checkNotNullParameter(remoteMetricsEventDataSource, "remoteMetricsEventDataSource");
        Intrinsics.checkNotNullParameter(versionNameDataSource, "versionNameDataSource");
        this.f43756a = userIdDataSource;
        this.f43757b = packageNameDataSource;
        this.f43758c = remoteMetricsEventDataSource;
        this.f43759d = versionNameDataSource;
    }
}
