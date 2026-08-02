package com.startapp.sdk.ads.banner.bannerstandard;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class c implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6124a;

    public c(BannerStandard bannerStandard) {
        this.f6124a = bannerStandard;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.f6124a.webViewTouched = true;
        return false;
    }
}
