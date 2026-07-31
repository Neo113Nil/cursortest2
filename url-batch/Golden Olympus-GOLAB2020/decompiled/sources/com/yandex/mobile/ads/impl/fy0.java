package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapter;
import com.monetization.ads.mediation.nativeads.MediatedNativeAdapterListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class fy0 implements z71 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> f25945a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final h71 f25946b;

    public fy0(@NotNull v51 nativeAdLoadManager, @NotNull C2360y7<n61> adResponse, @NotNull sy0 mediationData, @NotNull C2286v2 adConfiguration, @NotNull vx0 extrasCreator, @NotNull qx0 mediatedAdapterReporter, @NotNull hx0<MediatedNativeAdapter> mediatedAdProvider, @NotNull cy0 mediatedAdCreator, @NotNull C2105n4 adLoadingPhasesManager, @NotNull ag1 passbackAdLoader, @NotNull dy0 mediatedNativeAdLoader, @NotNull zw0<MediatedNativeAdapter, MediatedNativeAdapterListener> mediatedAdController, @NotNull h71 mediatedNativeAdapterListener) {
        Intrinsics.checkNotNullParameter(nativeAdLoadManager, "nativeAdLoadManager");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        Intrinsics.checkNotNullParameter(mediationData, "mediationData");
        Intrinsics.checkNotNullParameter(adConfiguration, "adConfiguration");
        Intrinsics.checkNotNullParameter(extrasCreator, "extrasCreator");
        Intrinsics.checkNotNullParameter(mediatedAdapterReporter, "mediatedAdapterReporter");
        Intrinsics.checkNotNullParameter(mediatedAdProvider, "mediatedAdProvider");
        Intrinsics.checkNotNullParameter(mediatedAdCreator, "mediatedAdCreator");
        Intrinsics.checkNotNullParameter(adLoadingPhasesManager, "adLoadingPhasesManager");
        Intrinsics.checkNotNullParameter(passbackAdLoader, "passbackAdLoader");
        Intrinsics.checkNotNullParameter(mediatedNativeAdLoader, "mediatedNativeAdLoader");
        Intrinsics.checkNotNullParameter(mediatedAdController, "mediatedAdController");
        Intrinsics.checkNotNullParameter(mediatedNativeAdapterListener, "mediatedNativeAdapterListener");
        this.f25945a = mediatedAdController;
        this.f25946b = mediatedNativeAdapterListener;
    }

    @Override // com.yandex.mobile.ads.impl.z71
    public final void a(@NotNull Context context, @NotNull C2360y7<n61> adResponse) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        this.f25945a.a(context, (Context) this.f25946b);
    }
}
