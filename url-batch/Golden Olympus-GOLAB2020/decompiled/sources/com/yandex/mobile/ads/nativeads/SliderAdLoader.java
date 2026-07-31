package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.um2;
import com.yandex.mobile.ads.impl.xm2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class SliderAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ht f35896a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f35897b;

    public SliderAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35896a = new ht(context, new um2(context));
        this.f35897b = new f();
    }

    public final void cancelLoading() {
        this.f35896a.a();
    }

    public final void loadSlider(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration) {
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f35896a.b(this.f35897b.a(nativeAdRequestConfiguration));
    }

    public final void setSliderAdLoadListener(@Nullable SliderAdLoadListener sliderAdLoadListener) {
        this.f35896a.a(sliderAdLoadListener != null ? new xm2(sliderAdLoadListener) : null);
    }
}
