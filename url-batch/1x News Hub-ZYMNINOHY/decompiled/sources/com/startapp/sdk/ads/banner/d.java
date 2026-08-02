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
import com.startapp.sdk.internal.AbstractC0288g;
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
    public BannerListener f3065a;

    /* renamed from: b, reason: collision with root package name */
    public View f3066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3067c = UUID.randomUUID().toString();

    /* renamed from: d, reason: collision with root package name */
    public final String f3068d = AbstractC0288g.a();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f3069e;
    public final /* synthetic */ AdPreferences f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Point f3070g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3071h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f3072i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ MetaData f3073j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ BannerRequest f3074k;

    public d(BannerRequest bannerRequest, BannerRequest.Callback callback, AdPreferences adPreferences, Point point, AdUnitConfig adUnitConfig, int i3, MetaData metaData) {
        this.f3074k = bannerRequest;
        this.f3069e = callback;
        this.f = adPreferences;
        this.f3070g = point;
        this.f3071h = adUnitConfig;
        this.f3072i = i3;
        this.f3073j = metaData;
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
        BannerListener bannerListener = this.f3065a;
        if (bannerListener != null) {
            bannerListener.onClick(this.f3066b);
        }
        context = this.f3074k.context;
        String c3 = this.f3073j.c();
        String str = this.f3067c;
        adPreferences = this.f3074k.adPreferences;
        g0.a(context, c3, new ExternalAdTracking(str, adPreferences.getAdTag(), this.f3071h.getSioPrice(), this.f3071h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f3068d, null, "DISABLED", this.f3070g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        Context context;
        AdPreferences adPreferences;
        BannerListener bannerListener = this.f3065a;
        if (bannerListener != null) {
            bannerListener.onImpression(this.f3066b);
        }
        context = this.f3074k.context;
        List singletonList = Collections.singletonList(this.f3073j.B());
        String str = this.f3067c;
        adPreferences = this.f3074k.adPreferences;
        b9.a(context, singletonList, (TrackingParams) new ExternalAdTracking(str, adPreferences.getAdTag(), this.f3071h.getSioPrice(), this.f3071h.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f3068d, null, "DISABLED", this.f3070g, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f3069e.onFinished(null, "No view returned");
        } else {
            this.f3069e.onFinished(new m1(this, view), null);
            this.f3074k.sendInfoAdRequest(true, this.f3067c, this.f3068d, this.f, this.f3070g, this.f3071h, this.f3072i);
        }
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f3069e.onFinished(null, str);
        this.f3074k.sendInfoAdRequest(false, this.f3067c, this.f3068d, this.f, this.f3070g, this.f3071h, this.f3072i);
    }
}
