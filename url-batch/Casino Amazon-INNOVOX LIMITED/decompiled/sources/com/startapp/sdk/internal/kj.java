package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class kj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f310a;
    public final /* synthetic */ Point b;
    public final /* synthetic */ BannerOptions c;
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.d d;
    public final /* synthetic */ lj e;

    public kj(lj ljVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.d dVar) {
        this.e = ljVar;
        this.f310a = weakReference;
        this.b = point;
        this.c = bannerOptions;
        this.d = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mj a2 = ij.a((View) this.f310a.get(), this.b, this.c, new AtomicReference(), true);
        this.d.a(a2.d == null, a2);
        this.e.f325a.postDelayed(this, 100L);
    }
}
