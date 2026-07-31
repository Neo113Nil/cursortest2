package com.yandex.mobile.ads.interstitial;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.bl2;
import com.yandex.mobile.ads.impl.bt;
import com.yandex.mobile.ads.impl.em2;
import com.yandex.mobile.ads.impl.um2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class InterstitialAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final bl2 f35863a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bt f35864b;

    public InterstitialAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        um2 um2Var = new um2(context);
        this.f35863a = new bl2();
        this.f35864b = new bt(context, um2Var);
    }

    public final void cancelLoading() {
        this.f35864b.a();
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f35864b.a(this.f35863a.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f35864b.a(interstitialAdLoadListener != null ? new em2(interstitialAdLoadListener) : null);
    }
}
