package com.startapp.sdk.adsbase;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import com.startapp.sdk.ads.external.ExternalAdTracking;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.adsbase.StartAppAd;
import com.startapp.sdk.adsbase.adlisteners.AdDisplayListener;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.AbstractC0288g;
import com.startapp.sdk.internal.b9;
import com.startapp.sdk.internal.c0;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.mj;
import com.startapp.sdk.internal.u;
import com.startapp.sdk.internal.v;
import com.startapp.sdk.internal.v6;
import com.startapp.sdk.internal.w;
import com.startapp.sdk.internal.y;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class l implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3343a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f3344b = AbstractC0288g.a();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3345c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f3346d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f3347e;
    public final /* synthetic */ int f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f3348g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f3349h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f3350i;

    public l(StartAppAd startAppAd, AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i3, MetaData metaData, Point point) {
        StartAppAd.AdMode adMode;
        this.f3350i = startAppAd;
        this.f3346d = adEventListener;
        this.f3347e = adUnitConfig;
        this.f = i3;
        this.f3348g = metaData;
        this.f3349h = point;
        adMode = startAppAd.f3233g;
        this.f3345c = adMode == StartAppAd.AdMode.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        AdPreferences adPreferences;
        this.f3346d.onReceiveAd(this.f3350i);
        StartAppAd startAppAd = this.f3350i;
        String str = this.f3343a;
        String str2 = this.f3344b;
        adPreferences = startAppAd.f3234h;
        StartAppAd.a(startAppAd, true, str, str2, adPreferences, this.f3347e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
        this.f3350i.f = null;
        StartAppAd startAppAd = this.f3350i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3236j;
        v6.a("adHidden", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new u(context, adDisplayListener, startAppAd) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        AdPreferences adPreferences;
        StartAppAd startAppAd = this.f3350i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3236j;
        v6.a("onClicked", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new w(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f3350i.context;
        String c3 = this.f3348g.c();
        String str = this.f3343a;
        adPreferences = this.f3350i.f3234h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f3347e.getSioPrice();
        String bp = this.f3347e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f3344b;
        Boolean valueOf = Boolean.valueOf(this.f3345c);
        boolean z = this.f3345c;
        g0.a(context2, c3, new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z ? "FORCED" : "ENABLED", this.f3349h, z ? "VIDEO" : "INTERSTITIAL"));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        AdPreferences adPreferences;
        this.f3350i.f = null;
        StartAppAd startAppAd = this.f3350i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f3236j;
        v6.a("onShow", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f3350i.context;
        List singletonList = Collections.singletonList(this.f3348g.B());
        String str = this.f3343a;
        adPreferences = this.f3350i.f3234h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f3347e.getSioPrice();
        String bp = this.f3347e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f3344b;
        Boolean valueOf = Boolean.valueOf(this.f3345c);
        boolean z = this.f3345c;
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z ? "FORCED" : "ENABLED", this.f3349h, z ? "VIDEO" : "INTERSTITIAL"));
    }

    public final void e() {
        StartAppAd startAppAd = this.f3350i;
        y.a(startAppAd.context, startAppAd.f3236j, startAppAd);
    }

    public final void f() {
        StartAppAd startAppAd = this.f3350i;
        Context context = startAppAd.context;
        com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd.f3235i;
        v6.a("onVideoCompleted", videoListener != null, null, null);
        g0.a(videoListener != null ? new mj(videoListener, context) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        AdPreferences adPreferences;
        this.f3350i.f = null;
        this.f3346d.onFailedToReceiveAd(this.f3350i);
        StartAppAd startAppAd = this.f3350i;
        String str2 = this.f3343a;
        String str3 = this.f3344b;
        adPreferences = startAppAd.f3234h;
        StartAppAd.a(startAppAd, false, str2, str3, adPreferences, this.f3347e, this.f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
        this.f3350i.f = null;
    }
}
