package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.f3;
import com.startapp.sdk.internal.u1;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements f3, u1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6140a;

    public /* synthetic */ j(BannerStandard bannerStandard) {
        this.f6140a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.f3
    public void a() {
        this.f6140a.handleCollapse();
    }

    @Override // com.startapp.sdk.internal.u1
    public boolean a(String str) {
        return this.f6140a.onMraidClickEvent(str);
    }
}
