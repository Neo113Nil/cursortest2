package com.startapp.sdk.internal;

import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class lj {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f325a;

    public lj(View view, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.d dVar) {
        Handler handler = new Handler(Looper.getMainLooper());
        this.f325a = handler;
        handler.postDelayed(new kj(this, new WeakReference(view), point, bannerOptions, dVar), 100L);
    }
}
