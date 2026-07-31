package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.mj;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f84a;

    public d(BannerStandard.a aVar) {
        this.f84a = aVar;
    }

    public final void a(boolean z, mj mjVar) {
        this.f84a.fireViewableChangeEvent(z);
        this.f84a.fireExposureChangeEvent(mjVar);
        if (z) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
