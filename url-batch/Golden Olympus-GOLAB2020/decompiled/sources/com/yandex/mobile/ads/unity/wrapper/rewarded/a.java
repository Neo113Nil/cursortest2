package com.yandex.mobile.ads.unity.wrapper.rewarded;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdError;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.rewarded.Reward;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;

/* loaded from: classes3.dex */
public class a implements RewardedAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36097a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityRewardedAdListener f36098b;

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdClicked() {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.p
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a();
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdDismissed() {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.o
            @Override // java.lang.Runnable
            public final void run() {
                a.this.b();
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdFailedToShow(final AdError adError) {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.m
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(adError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdImpression(final ImpressionData impressionData) {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.q
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(impressionData);
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onAdShown() {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.n
            @Override // java.lang.Runnable
            public final void run() {
                a.this.c();
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdEventListener
    public void onRewarded(final Reward reward) {
        if (this.f36098b == null) {
            return;
        }
        this.f36097a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.r
            @Override // java.lang.Runnable
            public final void run() {
                a.this.a(reward);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        UnityRewardedAdListener unityRewardedAdListener = this.f36098b;
        if (unityRewardedAdListener == null) {
            return;
        }
        unityRewardedAdListener.onAdClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        UnityRewardedAdListener unityRewardedAdListener = this.f36098b;
        if (unityRewardedAdListener == null) {
            return;
        }
        unityRewardedAdListener.onAdDismissed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c() {
        UnityRewardedAdListener unityRewardedAdListener = this.f36098b;
        if (unityRewardedAdListener == null) {
            return;
        }
        unityRewardedAdListener.onAdShown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdError adError) {
        UnityRewardedAdListener unityRewardedAdListener = this.f36098b;
        if (unityRewardedAdListener == null) {
            return;
        }
        unityRewardedAdListener.onAdFailedToShow(adError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(ImpressionData impressionData) {
        if (this.f36098b == null) {
            return;
        }
        this.f36098b.onAdImpression(impressionData == null ? "" : impressionData.getRawData());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Reward reward) {
        UnityRewardedAdListener unityRewardedAdListener = this.f36098b;
        if (unityRewardedAdListener == null) {
            return;
        }
        unityRewardedAdListener.onRewarded(reward.getAmount(), reward.getType());
    }

    void a(UnityRewardedAdListener unityRewardedAdListener) {
        this.f36098b = unityRewardedAdListener;
    }
}
