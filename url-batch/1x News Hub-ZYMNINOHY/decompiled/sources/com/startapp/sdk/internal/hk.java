package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f3944a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f3945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f3946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e f3947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik f3948e;

    public hk(ik ikVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f3948e = ikVar;
        this.f3944a = weakReference;
        this.f3945b = point;
        this.f3946c = bannerOptions;
        this.f3947d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk a3 = fk.a((View) this.f3944a.get(), this.f3945b, this.f3946c, new AtomicReference(), true);
        this.f3947d.a(a3.f4038d == null, a3);
        this.f3948e.f3988a.postDelayed(this, 100L);
    }
}
