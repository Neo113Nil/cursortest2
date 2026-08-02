package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.jk;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f3048a;

    public e(BannerStandard.a aVar) {
        this.f3048a = aVar;
    }

    public final void a(boolean z, jk jkVar) {
        this.f3048a.fireViewableChangeEvent(z);
        this.f3048a.fireExposureChangeEvent(jkVar);
        if (z) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
