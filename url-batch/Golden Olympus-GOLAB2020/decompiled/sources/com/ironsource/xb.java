package com.ironsource;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAdRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class xb implements cm {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterstitialAdRequest f20308a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final gj f20309b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final InterfaceC1541q3 f20310c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final IronSourceError f20311d;

    public xb(@NotNull InterstitialAdRequest adRequest, @NotNull gj adLoadTaskListener, @NotNull InterfaceC1541q3 analytics, @NotNull IronSourceError error) {
        Intrinsics.checkNotNullParameter(adRequest, "adRequest");
        Intrinsics.checkNotNullParameter(adLoadTaskListener, "adLoadTaskListener");
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(error, "error");
        this.f20308a = adRequest;
        this.f20309b = adLoadTaskListener;
        this.f20310c = analytics;
        this.f20311d = error;
    }

    @NotNull
    public final IronSourceError a() {
        return this.f20311d;
    }

    @Override // com.ironsource.cm
    public void start() {
        tb tbVar = new tb(this.f20310c, this.f20308a.getAdId$mediationsdk_release(), this.f20308a.getProviderName$mediationsdk_release());
        tbVar.a();
        tbVar.a(this.f20311d);
        this.f20309b.onAdLoadFailed(this.f20311d);
    }
}
