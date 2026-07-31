package com.yandex.mobile.ads.nativeads;

import android.content.Context;
import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.impl.om2;
import com.yandex.mobile.ads.impl.um2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes3.dex */
public final class NativeBulkAdLoader {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ht f35894a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final f f35895b;

    public NativeBulkAdLoader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f35894a = new ht(context, new um2(context));
        this.f35895b = new f();
    }

    public final void cancelLoading() {
        this.f35894a.a();
    }

    public final void loadAds(@NotNull NativeAdRequestConfiguration nativeAdRequestConfiguration, int i4) {
        Intrinsics.checkNotNullParameter(nativeAdRequestConfiguration, "nativeAdRequestConfiguration");
        this.f35894a.a(this.f35895b.a(nativeAdRequestConfiguration), i4);
    }

    public final void setNativeBulkAdLoadListener(@Nullable NativeBulkAdLoadListener nativeBulkAdLoadListener) {
        this.f35894a.a(nativeBulkAdLoadListener != null ? new om2(nativeBulkAdLoadListener) : null);
    }
}
