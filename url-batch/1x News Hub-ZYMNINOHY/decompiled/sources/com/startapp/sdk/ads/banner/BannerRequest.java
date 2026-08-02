package com.startapp.sdk.ads.banner;

import android.content.Context;
import android.graphics.Point;
import b2.C0195i;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.internal.aa;
import com.startapp.sdk.internal.ba;
import com.startapp.sdk.internal.d7;
import com.startapp.sdk.internal.d9;
import com.startapp.sdk.internal.fi;
import com.startapp.sdk.internal.g0;
import com.startapp.sdk.internal.ib;
import com.startapp.sdk.internal.j0;
import com.startapp.sdk.internal.q1;
import com.startapp.sdk.internal.q7;
import com.startapp.sdk.internal.x6;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z9;
import kotlin.jvm.internal.j;
import l2.l;

/* loaded from: classes.dex */
public class BannerRequest {
    private final ib adCacheManager;
    private BannerFormat adFormat;
    private AdPreferences adPreferences;
    private Point adSizeDp;
    private final ib consentManager;
    private final Context context;
    private final ib eventTracer;
    private final ib externalAds;
    protected final ib httpClient;
    protected final ib motionProcessor;
    protected final ib networkApiExecutor;
    private final ib videoAdCacheManager;
    protected final ib webViewCacheLoader;
    private final ib webViewFactory;

    public interface Callback {
        void onFinished(BannerCreator bannerCreator, String str);
    }

    public BannerRequest(Context context) {
        this(context, com.startapp.sdk.components.a.a(context).f3453K, com.startapp.sdk.components.a.a(context).f3470j, com.startapp.sdk.components.a.a(context).f3454M, com.startapp.sdk.components.a.a(context).f3455N, com.startapp.sdk.components.a.a(context).f3463b, com.startapp.sdk.components.a.a(context).f3474n, com.startapp.sdk.components.a.a(context).f3443A, com.startapp.sdk.components.a.a(context).f3481w, com.startapp.sdk.components.a.a(context).f3464c, com.startapp.sdk.components.a.a(context).f3462a);
    }

    private Point chooseSize() {
        int i3;
        int i4;
        Point point = this.adSizeDp;
        if (point != null) {
            i3 = point.x;
            i4 = point.y;
        } else {
            BannerFormat bannerFormat = this.adFormat;
            i3 = bannerFormat.widthDp;
            i4 = bannerFormat.heightDp;
        }
        return new Point(i3, i4);
    }

    private String getAdTag() {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences != null) {
            return adPreferences.getAdTag();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$load$0(Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            ((y6) ((x6) this.eventTracer.a())).c(this, fi.f);
        } else {
            ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3816g);
        }
        ((y6) ((x6) this.eventTracer.a())).b(this, fi.f3814d);
        callback.onFinished(bannerCreator, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0195i lambda$loadExternalAd$3(Callback callback, Point point, AdPreferences adPreferences, AdUnitConfig adUnitConfig, int i3, MetaData metaData, ba baVar) {
        C0195i c0195i = C0195i.f2555a;
        if (baVar == null) {
            callback.onFinished(null, null);
            return c0195i;
        }
        q7 q7Var = (q7) baVar;
        q7Var.f4347c = point.x;
        q7Var.f4348d = point.y;
        q7Var.f4349e = new d(this, callback, adPreferences, point, adUnitConfig, i3, metaData);
        q7Var.a();
        return c0195i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadExternalAd$4(Callback callback, final int i3) {
        final Callback callback2;
        Throwable th;
        final AdUnitConfig adUnitConfig;
        try {
            AdPreferences adPreferences = this.adPreferences;
            if (adPreferences == null) {
                adPreferences = new AdPreferences();
            }
            final AdPreferences adPreferences2 = adPreferences;
            final MetaData E3 = MetaData.E();
            ExternalAdConfig v = E3.v();
            if (v != null) {
                try {
                    adUnitConfig = v.getMapping().get(adPreferences2.getAdTag());
                } catch (Throwable th2) {
                    th = th2;
                    callback2 = callback;
                    callback2.onFinished(null, th.getMessage());
                    d9.a(th);
                }
            } else {
                adUnitConfig = null;
            }
            if (adUnitConfig == null) {
                callback.onFinished(null, "No ad unit found");
                return;
            }
            final Point chooseSize = chooseSize();
            callback2 = callback;
            try {
                ((j0) this.externalAds.a()).a(adUnitConfig, new l() { // from class: com.startapp.sdk.ads.banner.f
                    @Override // l2.l
                    public final Object invoke(Object obj) {
                        C0195i lambda$loadExternalAd$3;
                        BannerRequest bannerRequest = BannerRequest.this;
                        AdPreferences adPreferences3 = adPreferences2;
                        AdUnitConfig adUnitConfig2 = adUnitConfig;
                        int i4 = i3;
                        lambda$loadExternalAd$3 = bannerRequest.lambda$loadExternalAd$3(callback2, chooseSize, adPreferences3, adUnitConfig2, i4, E3, (ba) obj);
                        return lambda$loadExternalAd$3;
                    }
                });
            } catch (Throwable th3) {
                th = th3;
                th = th;
                callback2.onFinished(null, th.getMessage());
                d9.a(th);
            }
        } catch (Throwable th4) {
            th = th4;
            callback2 = callback;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadImpl$1(Callback callback, String str, BannerCreator bannerCreator, String str2) {
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str2);
            return;
        }
        ExternalConfig u3 = MetaData.E().u();
        if (u3 == null || !u3.getLoadInnerAdIfNoExternal()) {
            callback.onFinished(null, str2);
        } else {
            loadInnerAd(callback, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$loadInnerAd$2(Callback callback, BannerCreator bannerCreator, String str) {
        if (bannerCreator != null) {
            callback.onFinished(bannerCreator, str);
        } else if (d7.a(true, getAdTag(), true, false)) {
            loadExternalAd(callback, 2);
        } else {
            callback.onFinished(null, str);
        }
    }

    private void loadExternalAd(Callback callback, int i3) {
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3803C);
        g0.a(new S.a(i3, 2, this, callback));
    }

    private void loadImpl(Callback callback, String str) {
        if (d7.a(false, getAdTag(), true, false)) {
            loadExternalAd(new A0.b(this, callback, str, 5), 1);
        } else {
            loadInnerAd(callback, str);
        }
    }

    private void loadInnerAd(Callback callback, String str) {
        loadInnerAdImpl(new e(this, callback, 0), str);
    }

    private void loadInnerAdImpl(Callback callback, String str) {
        AdPreferences adPreferences = this.adPreferences;
        if (adPreferences == null) {
            adPreferences = new AdPreferences();
        }
        q1 q1Var = new q1(this.context, this.eventTracer, this.consentManager, this.adCacheManager, this.videoAdCacheManager, this.webViewFactory, this.httpClient, this.networkApiExecutor, this.motionProcessor, this.webViewCacheLoader, 0);
        BannerFormat bannerFormat = this.adFormat;
        Point chooseSize = chooseSize();
        ((y6) ((x6) this.eventTracer.a())).a(this, q1Var);
        ((y6) ((x6) this.eventTracer.a())).c(this, fi.f3804D);
        q1Var.f4336t = bannerFormat.type;
        int i3 = chooseSize.x;
        int i4 = chooseSize.y;
        q1Var.f4131c = i3;
        q1Var.f4132d = i4;
        q1Var.load(adPreferences, new c(callback, bannerFormat, adPreferences, q1Var), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendInfoAdRequest(boolean z, String uuid, String originalTS, AdPreferences adPreferences, Point size, AdUnitConfig config, int i3) {
        Context context = this.context;
        AdPreferences.Placement placement = AdPreferences.Placement.INAPP_BANNER;
        ib ibVar = this.httpClient;
        ib ibVar2 = this.networkApiExecutor;
        ib ibVar3 = this.eventTracer;
        ib ibVar4 = this.motionProcessor;
        z9 z9Var = new z9(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4);
        z9Var.f4873b = z;
        j.e(uuid, "uuid");
        z9Var.f4874c = uuid;
        j.e(originalTS, "originalTS");
        z9Var.f4876e = originalTS;
        j.e(config, "config");
        z9Var.f4875d = config;
        j.e(size, "size");
        z9Var.f = size;
        z9Var.f4877g = Integer.valueOf(this.adFormat.type);
        z9Var.f4878h = Integer.valueOf(i3);
        z9Var.f4879i = config.getSioPrice();
        new aa(context, adPreferences, placement, ibVar, ibVar2, ibVar3, ibVar4, z9Var).a();
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

    public BannerRequest setAdSize(int i3, int i4) {
        this.adSizeDp = new Point(i3, i4);
        return this;
    }

    public void load(Callback callback, String str) {
        ((y6) ((x6) this.eventTracer.a())).a((Object) this, fi.f3814d);
        loadImpl(new e(this, callback, 1), str);
    }

    public BannerRequest(Context context, ib ibVar, ib ibVar2, ib ibVar3, ib ibVar4, ib ibVar5, ib ibVar6, ib ibVar7, ib ibVar8, ib ibVar9, ib ibVar10) {
        this.adFormat = BannerFormat.BANNER;
        this.context = context.getApplicationContext();
        this.eventTracer = ibVar;
        this.consentManager = ibVar2;
        this.adCacheManager = ibVar3;
        this.videoAdCacheManager = ibVar4;
        this.webViewFactory = ibVar5;
        this.httpClient = ibVar6;
        this.networkApiExecutor = ibVar7;
        this.motionProcessor = ibVar8;
        this.webViewCacheLoader = ibVar9;
        this.externalAds = ibVar10;
    }
}
