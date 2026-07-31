package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;
import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.CallToActionView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class bn<V extends ViewGroup> implements q00<V> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final f61 f23872a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final y31 f23873b;

    public bn(@NotNull f61 nativeAd, @NotNull y31 nativeAdAssetViewProvider) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(nativeAdAssetViewProvider, "nativeAdAssetViewProvider");
        this.f23872a = nativeAd;
        this.f23873b = nativeAdAssetViewProvider;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(@NotNull V container) {
        Intrinsics.checkNotNullParameter(container, "container");
        this.f23873b.getClass();
        Intrinsics.checkNotNullParameter(container, "container");
        TextView textView = (TextView) container.findViewById(R.id.call_to_action);
        zq1 adType = this.f23872a.getAdType();
        if (!(textView instanceof CallToActionView) || adType == zq1.f35749d) {
            return;
        }
        ((CallToActionView) textView).a();
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
