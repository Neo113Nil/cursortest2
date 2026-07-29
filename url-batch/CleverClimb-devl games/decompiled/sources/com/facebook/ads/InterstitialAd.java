package com.facebook.ads;

import android.content.Context;
import android.view.View;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.protocol.AdErrorType;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.b;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.e;
import com.facebook.ads.internal.protocol.g;
import com.facebook.ads.internal.q.d.a;
import java.util.EnumSet;

/* loaded from: classes.dex */
public class InterstitialAd implements Ad {

    /* renamed from: a, reason: collision with root package name */
    private static final d f4781a = d.ADS;

    /* renamed from: b, reason: collision with root package name */
    private final Context f4782b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4783c;

    /* renamed from: d, reason: collision with root package name */
    private DisplayAdController f4784d;
    private boolean e;
    private boolean f;
    private InterstitialAdListener g;

    public InterstitialAd(Context context, String str) {
        this.f4782b = context;
        this.f4783c = str;
    }

    private void a(EnumSet<CacheFlag> enumSet, String str) {
        this.e = false;
        if (this.f) {
            a.a(new b(AdErrorType.NO_ADAPTER_ON_LOAD, "interstitial load called while showing interstitial "), this.f4782b);
            if (this.g != null) {
                this.g.onError(this, new AdError(AdErrorType.LOAD_CALLED_WHILE_SHOWING_INTERSTITIAL.getErrorCode(), AdErrorType.LOAD_CALLED_WHILE_SHOWING_INTERSTITIAL.getDefaultErrorMessage()));
                return;
            }
            return;
        }
        if (this.f4784d != null) {
            this.f4784d.c();
            this.f4784d = null;
        }
        this.f4784d = new DisplayAdController(this.f4782b, this.f4783c, g.a(this.f4782b.getResources().getDisplayMetrics()), AdPlacementType.INTERSTITIAL, e.INTERSTITIAL, f4781a, 1, true, enumSet);
        this.f4784d.a(new com.facebook.ads.internal.adapters.a() { // from class: com.facebook.ads.InterstitialAd.1
            @Override // com.facebook.ads.internal.adapters.a
            public void a() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onAdClicked(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(View view) {
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(AdAdapter adAdapter) {
                InterstitialAd.this.e = true;
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onAdLoaded(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(com.facebook.ads.internal.protocol.a aVar) {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onError(InterstitialAd.this, AdError.getAdErrorFromWrapper(aVar));
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void b() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onLoggingImpression(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void d() {
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onInterstitialDisplayed(InterstitialAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void e() {
                InterstitialAd.this.f = false;
                if (InterstitialAd.this.f4784d != null) {
                    InterstitialAd.this.f4784d.c();
                    InterstitialAd.this.f4784d = null;
                }
                if (InterstitialAd.this.g != null) {
                    InterstitialAd.this.g.onInterstitialDismissed(InterstitialAd.this);
                }
            }
        });
        this.f4784d.a(str);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        if (this.f4784d != null) {
            this.f4784d.b(true);
            this.f4784d = null;
        }
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.f4783c;
    }

    public boolean isAdLoaded() {
        return this.e;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        loadAd(EnumSet.of(CacheFlag.NONE));
    }

    public void loadAd(EnumSet<CacheFlag> enumSet) {
        a(enumSet, (String) null);
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
        a(EnumSet.of(CacheFlag.NONE), str);
    }

    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
        a(enumSet, str);
    }

    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.g = interstitialAdListener;
    }

    public boolean show() {
        if (!this.e) {
            if (this.g != null) {
                this.g.onError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        }
        this.f4784d.b();
        this.f = true;
        this.e = false;
        return true;
    }
}
