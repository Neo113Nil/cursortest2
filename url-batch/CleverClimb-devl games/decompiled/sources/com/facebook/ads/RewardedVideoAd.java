package com.facebook.ads;

import android.content.Context;
import android.util.Log;
import com.facebook.ads.internal.DisplayAdController;
import com.facebook.ads.internal.adapters.AdAdapter;
import com.facebook.ads.internal.adapters.a;
import com.facebook.ads.internal.adapters.ae;
import com.facebook.ads.internal.protocol.AdPlacementType;
import com.facebook.ads.internal.protocol.d;
import com.facebook.ads.internal.protocol.e;
import com.facebook.ads.internal.protocol.f;

/* loaded from: classes.dex */
public class RewardedVideoAd implements Ad {
    public static final int UNSET_VIDEO_DURATION = -1;

    /* renamed from: a, reason: collision with root package name */
    private static final String f4832a = "RewardedVideoAd";

    /* renamed from: b, reason: collision with root package name */
    private final Context f4833b;

    /* renamed from: c, reason: collision with root package name */
    private final String f4834c;

    /* renamed from: d, reason: collision with root package name */
    private DisplayAdController f4835d;
    private RewardedVideoAdListener f;
    private RewardData g;
    private boolean e = false;
    private int h = -1;

    public RewardedVideoAd(Context context, String str) {
        this.f4833b = context;
        this.f4834c = str;
    }

    private void a(String str, boolean z) {
        try {
            b(str, z);
        } catch (Exception e) {
            Log.e(f4832a, "Error loading rewarded video ad", e);
            if (this.f != null) {
                this.f.onError(this, AdError.INTERNAL_ERROR);
            }
        }
    }

    private final void a(boolean z) {
        if (this.f4835d != null) {
            this.f4835d.b(z);
            this.f4835d = null;
        }
    }

    private void b(String str, boolean z) {
        a(false);
        this.e = false;
        this.f4835d = new DisplayAdController(this.f4833b, this.f4834c, f.REWARDED_VIDEO, AdPlacementType.REWARDED_VIDEO, e.INTERSTITIAL, d.ADS, 1, true);
        this.f4835d.a(z);
        this.f4835d.a(new a() { // from class: com.facebook.ads.RewardedVideoAd.1
            @Override // com.facebook.ads.internal.adapters.a
            public void a() {
                if (RewardedVideoAd.this.f != null) {
                    RewardedVideoAd.this.f.onAdClicked(RewardedVideoAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(AdAdapter adAdapter) {
                ae aeVar = (ae) adAdapter;
                if (RewardedVideoAd.this.g != null) {
                    aeVar.a(RewardedVideoAd.this.g);
                }
                RewardedVideoAd.this.h = aeVar.a();
                RewardedVideoAd.this.e = true;
                if (RewardedVideoAd.this.f != null) {
                    RewardedVideoAd.this.f.onAdLoaded(RewardedVideoAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void a(com.facebook.ads.internal.protocol.a aVar) {
                if (RewardedVideoAd.this.f != null) {
                    RewardedVideoAd.this.f.onError(RewardedVideoAd.this, AdError.getAdErrorFromWrapper(aVar));
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void b() {
                if (RewardedVideoAd.this.f != null) {
                    RewardedVideoAd.this.f.onLoggingImpression(RewardedVideoAd.this);
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void f() {
                RewardedVideoAd.this.f.onRewardedVideoCompleted();
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void g() {
                if (RewardedVideoAd.this.f != null) {
                    RewardedVideoAd.this.f.onRewardedVideoClosed();
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void h() {
                if (RewardedVideoAd.this.f instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) RewardedVideoAd.this.f).onRewardServerFailed();
                }
            }

            @Override // com.facebook.ads.internal.adapters.a
            public void i() {
                if (RewardedVideoAd.this.f instanceof S2SRewardedVideoAdListener) {
                    ((S2SRewardedVideoAdListener) RewardedVideoAd.this.f).onRewardServerSuccess();
                }
            }
        });
        this.f4835d.a(str);
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        a(true);
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.f4834c;
    }

    public int getVideoDuration() {
        return this.h;
    }

    public boolean isAdLoaded() {
        return this.e;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        a((String) null, false);
    }

    public void loadAd(boolean z) {
        a((String) null, z);
    }

    @Override // com.facebook.ads.Ad
    public void loadAdFromBid(String str) {
        a(str, false);
    }

    public void loadAdFromBid(String str, boolean z) {
        a(str, z);
    }

    public void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.f = rewardedVideoAdListener;
    }

    public void setRewardData(RewardData rewardData) {
        this.g = rewardData;
        if (this.e) {
            this.f4835d.a(rewardData);
        }
    }

    public boolean show() {
        return show(-1);
    }

    public boolean show(int i) {
        if (!this.e) {
            if (this.f != null) {
                this.f.onError(this, AdError.INTERNAL_ERROR);
            }
            return false;
        }
        this.f4835d.a(i);
        this.f4835d.b();
        this.e = false;
        return true;
    }
}
