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
import com.startapp.sdk.internal.AbstractC0366g;
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
    public final String f6434a = UUID.randomUUID().toString();

    /* renamed from: b, reason: collision with root package name */
    public final String f6435b = AbstractC0366g.a();

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6436c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f6437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AdUnitConfig f6438e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6439f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ MetaData f6440g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Point f6441h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ StartAppAd f6442i;

    public l(StartAppAd startAppAd, AdEventListener adEventListener, AdUnitConfig adUnitConfig, int i4, MetaData metaData, Point point) {
        StartAppAd.AdMode adMode;
        this.f6442i = startAppAd;
        this.f6437d = adEventListener;
        this.f6438e = adUnitConfig;
        this.f6439f = i4;
        this.f6440g = metaData;
        this.f6441h = point;
        adMode = startAppAd.f6321g;
        this.f6436c = adMode == StartAppAd.AdMode.REWARDED_VIDEO;
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(View view) {
        AdPreferences adPreferences;
        this.f6437d.onReceiveAd(this.f6442i);
        StartAppAd startAppAd = this.f6442i;
        String str = this.f6434a;
        String str2 = this.f6435b;
        adPreferences = startAppAd.f6322h;
        StartAppAd.a(startAppAd, true, str, str2, adPreferences, this.f6438e, this.f6439f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void b() {
        this.f6442i.f6320f = null;
        StartAppAd startAppAd = this.f6442i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f6324j;
        v6.a("adHidden", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new u(context, adDisplayListener, startAppAd) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void c() {
        AdPreferences adPreferences;
        StartAppAd startAppAd = this.f6442i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f6324j;
        v6.a("onClicked", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new w(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f6442i.context;
        String c4 = this.f6440g.c();
        String str = this.f6434a;
        adPreferences = this.f6442i.f6322h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f6438e.getSioPrice();
        String bp = this.f6438e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f6435b;
        Boolean valueOf = Boolean.valueOf(this.f6436c);
        boolean z = this.f6436c;
        g0.a(context2, c4, new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z ? "FORCED" : "ENABLED", this.f6441h, z ? "VIDEO" : "INTERSTITIAL"));
    }

    @Override // com.startapp.sdk.internal.c0
    public final void d() {
        AdPreferences adPreferences;
        this.f6442i.f6320f = null;
        StartAppAd startAppAd = this.f6442i;
        Context context = startAppAd.context;
        AdDisplayListener adDisplayListener = startAppAd.f6324j;
        v6.a("onShow", adDisplayListener != null, null, null);
        g0.a(adDisplayListener != null ? new v(context, adDisplayListener, startAppAd) : null);
        Context context2 = this.f6442i.context;
        List singletonList = Collections.singletonList(this.f6440g.B());
        String str = this.f6434a;
        adPreferences = this.f6442i.f6322h;
        String adTag = adPreferences.getAdTag();
        String sioPrice = this.f6438e.getSioPrice();
        String bp = this.f6438e.getBp();
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_OVERLAY;
        String str2 = this.f6435b;
        Boolean valueOf = Boolean.valueOf(this.f6436c);
        boolean z = this.f6436c;
        b9.a(context2, singletonList, (TrackingParams) new ExternalAdTracking(str, adTag, sioPrice, bp, placement, str2, valueOf, z ? "FORCED" : "ENABLED", this.f6441h, z ? "VIDEO" : "INTERSTITIAL"));
    }

    public final void e() {
        StartAppAd startAppAd = this.f6442i;
        y.a(startAppAd.context, startAppAd.f6324j, startAppAd);
    }

    public final void f() {
        StartAppAd startAppAd = this.f6442i;
        Context context = startAppAd.context;
        com.startapp.sdk.adsbase.adlisteners.VideoListener videoListener = startAppAd.f6323i;
        v6.a("onVideoCompleted", videoListener != null, null, null);
        g0.a(videoListener != null ? new mj(videoListener, context) : null);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a(String str) {
        AdPreferences adPreferences;
        this.f6442i.f6320f = null;
        this.f6437d.onFailedToReceiveAd(this.f6442i);
        StartAppAd startAppAd = this.f6442i;
        String str2 = this.f6434a;
        String str3 = this.f6435b;
        adPreferences = startAppAd.f6322h;
        StartAppAd.a(startAppAd, false, str2, str3, adPreferences, this.f6438e, this.f6439f);
    }

    @Override // com.startapp.sdk.internal.c0
    public final void a() {
        this.f6442i.f6320f = null;
    }
}
