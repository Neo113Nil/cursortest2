package com.startapp.sdk.internal;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class q7 implements ba {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7481a;

    /* renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f7482b;

    /* renamed from: c, reason: collision with root package name */
    public int f7483c;

    /* renamed from: d, reason: collision with root package name */
    public int f7484d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f7485e;

    public q7(Context context, AdUnitConfig config) {
        kotlin.jvm.internal.i.e(context, "context");
        kotlin.jvm.internal.i.e(config, "config");
        this.f7481a = context;
        this.f7482b = config;
        this.f7483c = -1;
        this.f7484d = -1;
    }

    public final void a() {
        int i4 = this.f7483c;
        if (i4 == -1) {
            i4 = (int) (this.f7481a.getResources().getDisplayMetrics().widthPixels / this.f7481a.getResources().getDisplayMetrics().density);
        }
        int i5 = this.f7484d;
        AdSize inlineAdaptiveBannerAdSize = i5 != -1 ? AdSize.getInlineAdaptiveBannerAdSize(i4, i5) : AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.f7481a, i4);
        kotlin.jvm.internal.i.b(inlineAdaptiveBannerAdSize);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : this.f7482b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        kotlin.jvm.internal.i.d(build, "build(...)");
        AdManagerAdView adManagerAdView = new AdManagerAdView(this.f7481a);
        adManagerAdView.setAdSizes(new AdSize[]{inlineAdaptiveBannerAdSize, AdSize.BANNER});
        adManagerAdView.setAdUnitId(this.f7482b.getAdUnitId());
        adManagerAdView.setAdListener(new p7(this, adManagerAdView));
        adManagerAdView.loadAd(build);
    }
}
