package com.yandex.mobile.ads.appopenad;

import android.content.Context;
import com.yandex.mobile.ads.common.AdRequestConfiguration;
import com.yandex.mobile.ads.impl.bl2;
import com.yandex.mobile.ads.impl.hl2;
import com.yandex.mobile.ads.impl.ks;
import com.yandex.mobile.ads.impl.um2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class AppOpenAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ks f22375a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final bl2 f22376b;

    public AppOpenAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f22375a = new ks(context, new um2(context));
        this.f22376b = new bl2();
    }

    public final void cancelLoading() {
        this.f22375a.a();
    }

    public final void loadAd(@NotNull AdRequestConfiguration adRequestConfiguration) {
        Intrinsics.checkNotNullParameter(adRequestConfiguration, "adRequestConfiguration");
        this.f22375a.a(this.f22376b.a(adRequestConfiguration));
    }

    public final void setAdLoadListener(@Nullable AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f22375a.a(appOpenAdLoadListener != null ? new hl2(appOpenAdLoadListener) : null);
    }
}
