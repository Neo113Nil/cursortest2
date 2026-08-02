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
    public final Context f4345a;

    /* renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f4346b;

    /* renamed from: c, reason: collision with root package name */
    public int f4347c;

    /* renamed from: d, reason: collision with root package name */
    public int f4348d;

    /* renamed from: e, reason: collision with root package name */
    public c0 f4349e;

    public q7(Context context, AdUnitConfig config) {
        kotlin.jvm.internal.j.e(context, "context");
        kotlin.jvm.internal.j.e(config, "config");
        this.f4345a = context;
        this.f4346b = config;
        this.f4347c = -1;
        this.f4348d = -1;
    }

    public final void a() {
        int i3 = this.f4347c;
        if (i3 == -1) {
            i3 = (int) (this.f4345a.getResources().getDisplayMetrics().widthPixels / this.f4345a.getResources().getDisplayMetrics().density);
        }
        int i4 = this.f4348d;
        AdSize inlineAdaptiveBannerAdSize = i4 != -1 ? AdSize.getInlineAdaptiveBannerAdSize(i3, i4) : AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(this.f4345a, i3);
        kotlin.jvm.internal.j.b(inlineAdaptiveBannerAdSize);
        AdManagerAdRequest.Builder builder = new AdManagerAdRequest.Builder();
        for (Map.Entry<String, List<String>> entry : this.f4346b.getKeyValues().entrySet()) {
            builder.addCustomTargeting(entry.getKey(), entry.getValue());
        }
        AdManagerAdRequest build = builder.build();
        kotlin.jvm.internal.j.d(build, "build(...)");
        AdManagerAdView adManagerAdView = new AdManagerAdView(this.f4345a);
        adManagerAdView.setAdSizes(new AdSize[]{inlineAdaptiveBannerAdSize, AdSize.BANNER});
        adManagerAdView.setAdUnitId(this.f4346b.getAdUnitId());
        adManagerAdView.setAdListener(new p7(this, adManagerAdView));
        adManagerAdView.loadAd(build);
    }
}
