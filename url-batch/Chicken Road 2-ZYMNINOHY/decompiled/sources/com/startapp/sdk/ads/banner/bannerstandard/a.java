package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.wf;

/* loaded from: classes.dex */
public final class a implements wf {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6115a;

    public a(BannerStandard bannerStandard) {
        this.f6115a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.wf
    public final void a(String str) {
        this.f6115a.onImpressionSent(str);
    }
}
