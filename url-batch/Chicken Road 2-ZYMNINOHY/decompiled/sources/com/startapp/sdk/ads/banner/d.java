package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0366g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.m1;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public BannerListener f6145a;

    /* renamed from: b, reason: collision with root package name */
    public View f6146b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6147c = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    public final String f6148d = AbstractC0366g.a();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f6149e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f6150f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f6151g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f6152h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6153i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MetaData f6154j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f6155k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i4, MetaData metaData) {
        this.f6155k = bannerRequest;
        this.f6149e = callback;
        this.f6150f = adPreferences;
        this.f6151g = point;
        this.f6152h = adUnitConfig;
        this.f6153i = i4;
        this.f6154j = metaData;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        Context context;
        AdPreferences adPreferences;
        BannerListener bannerListener = this.f6145a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f6146b);
        }
        context = this.f6155k.context;
        String c4 = this.f6154j.c();
        String str = this.f6147c;
        adPreferences = this.f6155k.adPreferences;
        g0.a(context, c4, new ExternalAdTracking(str, adPreferences.getAdTag(), this.f6152h.getSioPrice(), this.f6152h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f6148d, null, "DISABLED", this.f6151g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        Context context;
        AdPreferences adPreferences;
        BannerListener bannerListener = this.f6145a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f6146b);
        }
        context = this.f6155k.context;
        List singletonList = Collections.singletonList(this.f6154j.B());
        String str = this.f6147c;
        adPreferences = this.f6155k.adPreferences;
        b9.a(context, singletonList, (TrackingParams) new ExternalAdTracking(str, adPreferences.getAdTag(), this.f6152h.getSioPrice(), this.f6152h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f6148d, null, "DISABLED", this.f6151g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f6149e.onFinished(null, "No view returned");
        } else {
            this.f6149e.onFinished(new m1(this, view), null);
            this.f6155k.sendInfoAdRequest(true, this.f6147c, this.f6148d, this.f6150f, this.f6151g, this.f6152h, this.f6153i);
        }
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f6149e.onFinished(null, str);
        this.f6155k.sendInfoAdRequest(false, this.f6147c, this.f6148d, this.f6150f, this.f6151g, this.f6152h, this.f6153i);
    }
}
