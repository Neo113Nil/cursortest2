package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class z51 implements y51 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a61 f35477a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final v51 f35478b;

    public z51(@NotNull Context context, @NotNull vu1 sdkEnvironmentModule, @NotNull j61 requestData, @NotNull a61 nativeAdLoadingItemFinishedListener, @NotNull C2105n4 adLoadingPhasesManager, @NotNull gs adType, @NotNull C2286v2 adConfiguration, @NotNull u51 nativeAdLoadListenerFactory, @NotNull w51 nativeAdLoadManagerFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sdkEnvironmentModule, "sdkEnvironmentModule");
        Intrinsics.checkNotNullParameter(requestData, "requestData");
        Intrinsics.checkNotNullParameter(nativeAdLoadingItemFinishedListener, "nativeAdLoadingItemFinishedListener");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(nativeAdLoadListenerFactory, "nativeAdLoadListenerFactory");
        Intrinsics.checkNotNullParameter(nativeAdLoadManagerFactory, "nativeAdLoadManagerFactory");
        this.f35477a = nativeAdLoadingItemFinishedListener;
        nativeAdLoadListenerFactory.getClass();
        e61 a4 = u51.a(context, adConfiguration, adLoadingPhasesManager, this);
        nativeAdLoadManagerFactory.getClass();
        v51 a5 = w51.a(context, sdkEnvironmentModule, requestData, adConfiguration, a4, adLoadingPhasesManager);
        this.f35478b = a5;
        a4.a(a5.e());
    }

    @Override // com.yandex.mobile.ads.impl.y51
    public final void a() {
        this.f35477a.a(this);
    }

    public final void b() {
        this.f35478b.x();
    }

    public final void c() {
        this.f35478b.y();
    }

    public final void a(@Nullable gt gtVar) {
        this.f35478b.a(gtVar);
    }

    public final void a(@Nullable nt ntVar) {
        this.f35478b.a(ntVar);
    }

    public final void a(@Nullable wt wtVar) {
        this.f35478b.a(wtVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ z51(Context context, vu1 vu1Var, j61 j61Var, a61 a61Var, gs gsVar, int i4) {
        this(context, vu1Var, j61Var, a61Var, r5, r6, new C2286v2(r6, vu1Var), new u51(), new w51());
        C2105n4 c2105n4 = new C2105n4();
        gs gsVar2 = (i4 & 32) != 0 ? gs.f26283g : gsVar;
    }
}
