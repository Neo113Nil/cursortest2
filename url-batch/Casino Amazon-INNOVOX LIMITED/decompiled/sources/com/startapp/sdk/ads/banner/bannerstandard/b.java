package com.startapp.sdk.ads.banner.bannerstandard;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class b implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f82a;

    public b(BannerStandard bannerStandard) {
        this.f82a = bannerStandard;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f82a.webViewTouched = true;
        return false;
    }
}
