package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.jk;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f6127a;

    public e(BannerStandard.a aVar) {
        this.f6127a = aVar;
    }

    public final void a(boolean z, jk jkVar) {
        this.f6127a.fireViewableChangeEvent(z);
        this.f6127a.fireExposureChangeEvent(jkVar);
        if (z) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
