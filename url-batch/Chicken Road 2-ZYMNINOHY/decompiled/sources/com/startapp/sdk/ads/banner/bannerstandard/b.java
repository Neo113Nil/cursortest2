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
import com.startapp.sdk.internal.AbstractC0366g;
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
    public final String f6116a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f6117b = AbstractC0366g.a();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Point f6118c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g7 f6119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f6120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6121f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f6122g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f6123h;

    public b(BannerStandard bannerStandard, Point point, g7 g7Var, AdUnitConfig adUnitConfig, int i4, MetaData metaData) {
        this.f6123h = bannerStandard;
        this.f6118c = point;
        this.f6119d = g7Var;
        this.f6120e = adUnitConfig;
        this.f6121f = i4;
        this.f6122g = metaData;
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
        Context context = this.f6123h.getContext();
        BannerStandard bannerStandard = this.f6123h;
        j1.a(context, bannerStandard.listener, (View) bannerStandard, (String) null);
        Context context2 = this.f6123h.getContext();
        String c4 = this.f6122g.c();
        String str = this.f6116a;
        adTag = this.f6123h.getAdTag();
        g0.a(context2, c4, new ExternalAdTracking(str, adTag, this.f6120e.getSioPrice(), this.f6120e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f6117b, null, "DISABLED", this.f6118c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        String adTag;
        Context context = this.f6123h.getContext();
        BannerStandard bannerStandard = this.f6123h;
        BannerListener bannerListener = bannerStandard.listener;
        v6.a("onImpression", bannerListener != null, null, null);
        g0.a(bannerListener != null ? new h1(context, bannerListener, bannerStandard) : null);
        Context context2 = this.f6123h.getContext();
        List singletonList = Collections.singletonList(this.f6122g.B());
        String str = this.f6116a;
        adTag = this.f6123h.getAdTag();
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, this.f6120e.getSioPrice(), this.f6120e.getBp(), AdPreferences.Placement.INAPP_BANNER, this.f6117b, null, "DISABLED", this.f6118c, AdPreferences.TYPE_BANNER));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        if (view == null) {
            this.f6123h.sendLoadError("No view returned");
            return;
        }
        this.f6123h.updateBannerView();
        BannerStandard bannerStandard = this.f6123h;
        Point point = this.f6118c;
        bannerStandard.attachAdViewToContainer(view, point.x, point.y);
        Context context = this.f6123h.getContext();
        BannerStandard bannerStandard2 = this.f6123h;
        j1.b(context, bannerStandard2.listener, bannerStandard2, null);
        this.f6119d.a(Boolean.TRUE);
        BannerStandard bannerStandard3 = this.f6123h;
        bannerStandard3.sendInfoAdRequest(true, this.f6116a, this.f6117b, bannerStandard3.getAdPreferences(), this.f6118c, this.f6120e, this.f6121f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        this.f6123h.sendLoadError(str);
        this.f6119d.a(Boolean.FALSE);
        BannerStandard bannerStandard = this.f6123h;
        bannerStandard.sendInfoAdRequest(false, this.f6116a, this.f6117b, bannerStandard.getAdPreferences(), this.f6118c, this.f6120e, this.f6121f);
    }
}
