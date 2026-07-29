package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.e.g;
import com.applovin.impl.sdk.j;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* loaded from: classes.dex */
public class a implements MaxAdListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a, reason: collision with root package name */
    private final j f2754a;

    /* renamed from: b, reason: collision with root package name */
    private final MaxAdListener f2755b;

    public a(MaxAdListener maxAdListener, j jVar) {
        this.f2754a = jVar;
        this.f2755b = maxAdListener;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        g.d(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        g.h(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, int i) {
        g.a(this.f2755b, maxAd, i, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        g.b(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        g.g(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        g.c(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, int i) {
        g.a(this.f2755b, str, i, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        g.a(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoCompleted(MaxAd maxAd) {
        g.f(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onRewardedVideoStarted(MaxAd maxAd) {
        g.e(this.f2755b, maxAd, this.f2754a);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        g.a(this.f2755b, maxAd, maxReward, this.f2754a);
    }
}
