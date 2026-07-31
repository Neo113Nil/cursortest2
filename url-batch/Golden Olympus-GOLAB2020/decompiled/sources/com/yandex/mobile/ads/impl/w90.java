package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.ExtendedNativeAdView;
import com.yandex.div.core.view2.Div2View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class w90 implements q00<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final pk1 f33960a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final z10 f33961b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final mp1 f33962c;

    public w90(@NotNull pk1 preloadedDivKitDesign, @NotNull z10 divKitActionAdapter, @NotNull mp1 reporter) {
        Intrinsics.checkNotNullParameter(preloadedDivKitDesign, "preloadedDivKitDesign");
        Intrinsics.checkNotNullParameter(divKitActionAdapter, "divKitActionAdapter");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        this.f33960a = preloadedDivKitDesign;
        this.f33961b = divKitActionAdapter;
        this.f33962c = reporter;
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void a(ExtendedNativeAdView extendedNativeAdView) {
        ExtendedNativeAdView container = extendedNativeAdView;
        Intrinsics.checkNotNullParameter(container, "container");
        try {
            container.removeAllViews();
            Div2View d4 = this.f33960a.d();
            pg2.a(d4);
            j10.a(d4).a(this.f33961b);
            container.addView(d4);
        } catch (Throwable th) {
            ap0.b(new Object[0]);
            this.f33962c.reportError("Failed to bind DivKit Feed Preloaded Ad", th);
        }
    }

    @Override // com.yandex.mobile.ads.impl.q00
    public final void c() {
        Div2View d4 = this.f33960a.d();
        j10.a(d4).a((z10) null);
        pg2.a(d4);
    }
}
