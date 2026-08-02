package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.banner.BannerListener;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0288g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.h1;
import com.startapp.sdk.internal.j1;
import com.startapp.sdk.internal.v6;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3038a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f3039b = AbstractC0288g.a();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f3040c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g7 f3041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3042e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f3043g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f3044h;

    public b(BannerStandard bannerStandard, Point point, g7 g7Var, AdUnitConfig adUnitConfig, int i3, MetaData metaData) {
        this.f3044h = bannerStandard;
        this.f3040c = point;
        this.f3041d = g7Var;
        this.f3042e = adUnitConfig;
        this.f = i3;
        this.f3043g = metaData;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        String adTag;
        Context context = this.f3044h.getContext();
        BannerStandard bannerStandard = this.f3044h;
        j1.a(context, bannerStandard.listener, (View) bannerStandard, (String) null);
        Context context2 = this.f3044h.getContext();
        String c3 = this.f3043g.c();
        String str = this.f3038a;
        adTag = this.f3044h.getAdTag();
        g0.a(context2, c3, new ExternalAdTracking(str, adTag, this.f3042e.getSioPrice(), this.f3042e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f3039b, null, "DISABLED", this.f3040c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        String adTag;
        Context context = this.f3044h.getContext();
        BannerStandard bannerStandard = this.f3044h;
        BannerListener bannerListener = bannerStandard.listener;
        v6.a("onImpression", bannerListener != null, null, null);
        g0.a(bannerListener != null ? new h1(context, bannerListener, bannerStandard) : null);
        Context context2 = this.f3044h.getContext();
        List singletonList = Collections.singletonList(this.f3043g.B());
        String str = this.f3038a;
        adTag = this.f3044h.getAdTag();
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, this.f3042e.getSioPrice(), this.f3042e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f3039b, null, "DISABLED", this.f3040c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f3044h.sendLoadError("No view returned");
            return;
        }
        this.f3044h.updateBannerView();
        BannerStandard bannerStandard = this.f3044h;
        Point point = this.f3040c;
        bannerStandard.attachAdViewToContainer(view, point.x, point.y);
        Context context = this.f3044h.getContext();
        BannerStandard bannerStandard2 = this.f3044h;
        j1.b(context, bannerStandard2.listener, bannerStandard2, null);
        this.f3041d.a(Boolean.TRUE);
        BannerStandard bannerStandard3 = this.f3044h;
        bannerStandard3.sendInfoAdRequest(true, this.f3038a, this.f3039b, bannerStandard3.getAdPreferences(), this.f3040c, this.f3042e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f3044h.sendLoadError(str);
        this.f3041d.a(Boolean.FALSE);
        BannerStandard bannerStandard = this.f3044h;
        bannerStandard.sendInfoAdRequest(false, this.f3038a, this.f3039b, bannerStandard.getAdPreferences(), this.f3040c, this.f3042e, this.f);
    }
}
