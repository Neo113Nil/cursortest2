package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.ef;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class a implements ef {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f81a;

    public a(BannerStandard bannerStandard) {
        this.f81a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.ef
    public final void a(String str) {
        this.f81a.onImpressionSent(str);
    }
}
