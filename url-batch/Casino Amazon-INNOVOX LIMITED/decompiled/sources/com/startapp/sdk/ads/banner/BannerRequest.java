package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.l1;
import com.startapp.sdk.internal.mh;
import com.startapp.sdk.internal.pa;
import com.startapp.sdk.internal.w6;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public class BannerRequest {
    private final pa adCacheManager;
    private BannerFormat adFormat;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final pa consentManager;
    private final Context context;
    private final pa eventTracer;
    protected final pa httpClient;
    protected final pa motionProcessor;
    protected final pa networkApiExecutor;
    private final pa videoDownloader;
    protected final pa webViewCacheLoader;
    private final pa webViewFactory;

    /* compiled from: Sta */
    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    public BannerRequest(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).K, com.startapp.sdk.components.a.a(context).i, com.startapp.sdk.components.a.a(context).M, com.startapp.sdk.components.a.a(context).S, com.startapp.sdk.components.a.a(context).f160a, com.startapp.sdk.components.a.a(context).m, com.startapp.sdk.components.a.a(context).A, com.startapp.sdk.components.a.a(context).w, com.startapp.sdk.components.a.a(context).b);
    }

    private Point chooseSize() {
        int i;
        int i2;
        Point point = this.adSizeDp;
        if (point != null) {
            i = point.x;
            i2 = point.y;
        } else {
            BannerFormat bannerFormat = this.adFormat;
            i = bannerFormat.widthDp;
            i2 = bannerFormat.heightDp;
        }
        return new Point(i, i2);
    }

    private String getAdTag() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences.getAdTag();
        }
        return null;
    }

    static /* synthetic */ void lambda$loadInnerAd$1(Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str);
        } else {
            callback.onFinished(null, str);
        }
    }

    private void loadImpl(Callback callback, String str) {
        loadInnerAd(callback, str);
    }

    private void loadInnerAd(final Callback callback, String str) {
        loadInnerAdImpl(new Callback() { // from class: com.startapp.sdk.ads.banner.BannerRequest$$ExternalSyntheticLambda0
            @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
            public final void onFinished(BannerCreator bannerCreator, String str2) {
                BannerRequest.lambda$loadInnerAd$1(BannerRequest.Callback.this, bannerCreator, str2);
            }
        }, str);
    }

    private void loadInnerAdImpl(Callback callback, String str) {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        l1 l1Var = new l1(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoDownloader, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point chooseSize = chooseSize();
        ((w6) this.eventTracer.a()).a(this, l1Var);
        ((w6) this.eventTracer.a()).c(this, mh.A);
        l1Var.t = bannerFormat.type;
        int i = chooseSize.x;
        int i2 = chooseSize.y;
        l1Var.c = i;
        l1Var.d = i2;
        l1Var.load(adPreferences, new c(callback, bannerFormat, adPreferences, l1Var), str);
    }

    /* renamed from: lambda$load$0$com-startapp-sdk-ads-banner-BannerRequest, reason: not valid java name */
    /* synthetic */ void m3860lambda$load$0$comstartappsdkadsbannerBannerRequest(Callback callback, BannerCreator bannerCreator, String str) {
        pa paVar = this.eventTracer;
        if (bannerCreator != null) {
            ((w6) paVar.a()).c(this, mh.f);
        } else {
            ((w6) paVar.a()).c(this, mh.g);
        }
        ((w6) this.eventTracer.a()).b(this, mh.d);
        callback.onFinished(bannerCreator, str);
    }

    public void load(Callback callback) {
        load(callback, null);
    }

    public BannerRequest setAdFormat(BannerFormat bannerFormat) {
        this.adFormat = bannerFormat;
        return this;
    }

    public BannerRequest setAdPreferences(AdPreferences adPreferences) {
        this.adPreferences = adPreferences;
        return this;
    }

    public BannerRequest setAdSize(int i, int i2) {
        this.adSizeDp = new Point(i, i2);
        return this;
    }

    public void load(final Callback callback, String str) {
        ((w6) this.eventTracer.a()).a((Object) this, mh.d);
        loadImpl(new Callback() { // from class: com.startapp.sdk.ads.banner.BannerRequest$$ExternalSyntheticLambda1
            @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
            public final void onFinished(BannerCreator bannerCreator, String str2) {
                BannerRequest.this.m3860lambda$load$0$comstartappsdkadsbannerBannerRequest(callback, bannerCreator, str2);
            }
        }, str);
    }

    public BannerRequest(Context context, pa paVar, pa paVar2, pa paVar3, pa paVar4, pa paVar5, pa paVar6, pa paVar7, pa paVar8, pa paVar9) {
        this.adFormat = BannerFormat.BANNER;
        this.context = context.getApplicationContext();
        this.eventTracer = paVar;
        this.consentManager = paVar2;
        this.adCacheManager = paVar3;
        this.videoDownloader = paVar4;
        this.webViewFactory = paVar5;
        this.httpClient = paVar6;
        this.networkApiExecutor = paVar7;
        this.motionProcessor = paVar8;
        this.webViewCacheLoader = paVar9;
    }
}
