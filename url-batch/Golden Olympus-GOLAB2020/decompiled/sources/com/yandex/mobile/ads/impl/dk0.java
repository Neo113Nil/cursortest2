package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ip1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class dk0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ip1.b f24654a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ip1.b f24655b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ip1.b f24656c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ip1.b f24657d;

    public dk0(@NotNull ip1.b impressionTrackingSuccessReportType, @NotNull ip1.b impressionTrackingStartReportType, @NotNull ip1.b impressionTrackingFailureReportType, @NotNull ip1.b forcedImpressionTrackingFailureReportType) {
        Intrinsics.checkNotNullParameter(impressionTrackingSuccessReportType, "impressionTrackingSuccessReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingStartReportType, "impressionTrackingStartReportType");
        Intrinsics.checkNotNullParameter(impressionTrackingFailureReportType, "impressionTrackingFailureReportType");
        Intrinsics.checkNotNullParameter(forcedImpressionTrackingFailureReportType, "forcedImpressionTrackingFailureReportType");
        this.f24654a = impressionTrackingSuccessReportType;
        this.f24655b = impressionTrackingStartReportType;
        this.f24656c = impressionTrackingFailureReportType;
        this.f24657d = forcedImpressionTrackingFailureReportType;
    }

    @NotNull
    public final ip1.b a() {
        return this.f24657d;
    }

    @NotNull
    public final ip1.b b() {
        return this.f24656c;
    }

    @NotNull
    public final ip1.b c() {
        return this.f24655b;
    }

    @NotNull
    public final ip1.b d() {
        return this.f24654a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk0)) {
            return false;
        }
        dk0 dk0Var = (dk0) obj;
        return this.f24654a == dk0Var.f24654a && this.f24655b == dk0Var.f24655b && this.f24656c == dk0Var.f24656c && this.f24657d == dk0Var.f24657d;
    }

    public final int hashCode() {
        return this.f24657d.hashCode() + ((this.f24656c.hashCode() + ((this.f24655b.hashCode() + (this.f24654a.hashCode() * 31)) * 31)) * 31);
    }

    @NotNull
    public final String toString() {
        return "ImpressionTrackingReportTypes(impressionTrackingSuccessReportType=" + this.f24654a + ", impressionTrackingStartReportType=" + this.f24655b + ", impressionTrackingFailureReportType=" + this.f24656c + ", forcedImpressionTrackingFailureReportType=" + this.f24657d + ")";
    }
}
