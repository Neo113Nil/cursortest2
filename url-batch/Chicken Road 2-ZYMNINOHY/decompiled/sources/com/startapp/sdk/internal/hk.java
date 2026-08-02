package com.startapp.sdk.internal;

import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerOptions;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class hk implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WeakReference f7069a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Point f7070b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BannerOptions f7071c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.banner.bannerstandard.e f7072d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ik f7073e;

    public hk(ik ikVar, WeakReference weakReference, Point point, BannerOptions bannerOptions, com.startapp.sdk.ads.banner.bannerstandard.e eVar) {
        this.f7073e = ikVar;
        this.f7069a = weakReference;
        this.f7070b = point;
        this.f7071c = bannerOptions;
        this.f7072d = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk a3 = fk.a((View) this.f7069a.get(), this.f7070b, this.f7071c, new AtomicReference(), true);
        this.f7072d.a(a3.f7166d == null, a3);
        this.f7073e.f7114a.postDelayed(this, 100L);
    }
}
