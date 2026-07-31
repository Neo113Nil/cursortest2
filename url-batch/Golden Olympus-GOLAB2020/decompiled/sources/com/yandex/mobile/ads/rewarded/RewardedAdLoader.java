package com.yandex.mobile.ads.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.bl2;
import com.yandex.mobile.ads.impl.tm2;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.vt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class RewardedAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final vt f35976a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bl2 f35977b;

    public RewardedAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35976a = new vt(context, new um2(context));
        this.f35977b = new bl2();
    }

    public final void cancelLoading() {
        this.f35976a.a();
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f35976a.a(this.f35977b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable RewardedAdLoadListener rewardedAdLoadListener) {
        this.f35976a.a(rewardedAdLoadListener != null ? new tm2(rewardedAdLoadListener) : null);
    }
}
