package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class wr0 implements vr0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C1925fe f34165a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final mv1 f34166b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final nz0 f34167c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final hr f34168d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final qv f34169e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ns0 f34170f;

    public wr0(@NotNull C1925fe appDataSource, @NotNull mv1 sdkIntegrationDataSource, @NotNull nz0 mediationNetworksDataSource, @NotNull hr consentsDataSource, @NotNull qv debugErrorIndicatorDataSource, @NotNull ns0 logsDataSource) {
        Intrinsics.checkNotNullParameter(appDataSource, "appDataSource");
        Intrinsics.checkNotNullParameter(sdkIntegrationDataSource, "sdkIntegrationDataSource");
        Intrinsics.checkNotNullParameter(mediationNetworksDataSource, "mediationNetworksDataSource");
        Intrinsics.checkNotNullParameter(consentsDataSource, "consentsDataSource");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorDataSource, "debugErrorIndicatorDataSource");
        Intrinsics.checkNotNullParameter(logsDataSource, "logsDataSource");
        this.f34165a = appDataSource;
        this.f34166b = sdkIntegrationDataSource;
        this.f34167c = mediationNetworksDataSource;
        this.f34168d = consentsDataSource;
        this.f34169e = debugErrorIndicatorDataSource;
        this.f34170f = logsDataSource;
    }

    @Override // com.yandex.mobile.ads.impl.vr0
    @NotNull
    public final cx a() {
        return new cx(this.f34165a.a(), this.f34166b.a(), this.f34167c.a(), this.f34168d.a(), this.f34169e.a(), this.f34170f.a());
    }

    @Override // com.yandex.mobile.ads.impl.vr0
    public final void a(boolean z4) {
        this.f34169e.a(z4);
    }
}
