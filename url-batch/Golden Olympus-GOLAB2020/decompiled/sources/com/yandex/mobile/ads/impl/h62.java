package com.yandex.mobile.ads.impl;

import java.util.List;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class h62 implements cd1 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bk0 f26625a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final dk0 f26626b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f26627c;

    /* renamed from: d, reason: collision with root package name */
    private int f26628d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f26629e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26630f;

    public h62(@NotNull bk0 impressionReporter, @NotNull dk0 impressionTrackingReportTypes) {
        Intrinsics.checkNotNullParameter(impressionReporter, "impressionReporter");
        Intrinsics.checkNotNullParameter(impressionTrackingReportTypes, "impressionTrackingReportTypes");
        this.f26625a = impressionReporter;
        this.f26626b = impressionTrackingReportTypes;
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType, @NotNull c92 validationResult) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        int i4 = this.f26628d + 1;
        this.f26628d = i4;
        if (i4 == 20) {
            this.f26629e = true;
            this.f26625a.b(this.f26626b.b(), validationResult);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void invalidate() {
        this.f26627c = false;
        this.f26628d = 0;
        this.f26629e = false;
        this.f26630f = false;
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull List<id1> forcedFailures) {
        Intrinsics.checkNotNullParameter(forcedFailures, "forcedFailures");
        id1 id1Var = (id1) CollectionsKt.firstOrNull((List) forcedFailures);
        if (id1Var == null) {
            return;
        }
        this.f26625a.a(this.f26626b.a(), id1Var.b());
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType, @NotNull List<? extends ux1> notTrackedShowNoticeTypes) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        Intrinsics.checkNotNullParameter(notTrackedShowNoticeTypes, "notTrackedShowNoticeTypes");
        if (this.f26630f) {
            return;
        }
        this.f26630f = true;
        this.f26625a.a(this.f26626b.d(), MapsKt.mapOf(TuplesKt.to("failure_tracked", Boolean.valueOf(this.f26629e))));
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull ux1 showNoticeType) {
        Intrinsics.checkNotNullParameter(showNoticeType, "showNoticeType");
        if (this.f26627c) {
            return;
        }
        this.f26627c = true;
        this.f26625a.a(this.f26626b.c());
    }

    @Override // com.yandex.mobile.ads.impl.cd1
    public final void a(@NotNull C2360y7<?> adResponse) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f26625a.a(adResponse);
    }
}
