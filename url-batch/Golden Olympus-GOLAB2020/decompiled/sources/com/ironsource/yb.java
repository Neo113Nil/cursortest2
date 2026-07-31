package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class yb implements cm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final RewardedAdRequest f20420a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final rq f20421b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f20422c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f20423d;

    public yb(@NotNull RewardedAdRequest adRequest, @NotNull rq adLoadTaskListener, @NotNull InterfaceC1541q3 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f20420a = adRequest;
        this.f20421b = adLoadTaskListener;
        this.f20422c = analytics;
        this.f20423d = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f20423d;
    }

    @Override // com.ironsource.cm
    public void start() {
        tb tbVar = new tb(this.f20422c, this.f20420a.getAdId$mediationsdk_release(), this.f20420a.getProviderName$mediationsdk_release());
        tbVar.a();
        tbVar.a(this.f20423d);
        this.f20421b.onAdLoadFailed(this.f20423d);
    }
}
