package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class pq implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ct f30530a;

    /* renamed from: b, reason: collision with root package name */
    private final int f30531b;

    public pq(@NotNull ct nativeAdAssets, int i4) {
        Intrinsics.checkNotNullParameter(nativeAdAssets, "nativeAdAssets");
        this.f30530a = nativeAdAssets;
        this.f30531b = i4;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView adView = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(adView, "adView");
        qq qqVar = new qq(this.f30530a, this.f30531b, new v31());
        ImageView a4 = qqVar.a(adView);
        ImageView b4 = qqVar.b(adView);
        if (a4 != null) {
            a4.setId(R.id.favicon);
        }
        if (b4 != null) {
            b4.setId(R.id.icon);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
    }
}
