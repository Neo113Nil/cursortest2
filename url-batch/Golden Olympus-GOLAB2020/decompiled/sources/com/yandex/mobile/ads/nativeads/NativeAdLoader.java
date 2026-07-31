package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.km2;
import com.yandex.mobile.ads.impl.pm2;
import com.yandex.mobile.ads.impl.um2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public class NativeAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ht f35865a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f35866b;

    public NativeAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35865a = new ht(context, new um2(context));
        this.f35866b = new f();
    }

    public final void cancelLoading() {
        this.f35865a.a();
    }

    public final void loadAd(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f35865a.a(this.f35866b.a(nativeAdRequestConfiguration));
    }

    public final void setNativeAdLoadListener(@Nullable NativeAdLoadListener nativeAdLoadListener) {
        this.f35865a.a(nativeAdLoadListener instanceof a ? new pm2((a) nativeAdLoadListener) : nativeAdLoadListener != null ? new km2(nativeAdLoadListener) : null);
    }
}
