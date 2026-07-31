package com.yandex.mobile.ads.unity.wrapper.rewarded;

import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdRequestError;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* loaded from: classes3.dex */
final class b implements RewardedAdLoadListener {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36099a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private UnityRewardedAdLoadListener f36100b;

    b() {
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public void onAdFailedToLoad(final AdRequestError adRequestError) {
        if (this.f36100b == null) {
            return;
        }
        this.f36099a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.s
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(adRequestError);
            }
        });
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAdLoadListener
    public void onAdLoaded(final RewardedAd rewardedAd) {
        if (this.f36100b == null) {
            return;
        }
        this.f36099a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.t
            @Override // java.lang.Runnable
            public final void run() {
                b.this.a(rewardedAd);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdRequestError adRequestError) {
        UnityRewardedAdLoadListener unityRewardedAdLoadListener = this.f36100b;
        if (unityRewardedAdLoadListener == null) {
            return;
        }
        unityRewardedAdLoadListener.onAdFailedToLoad(adRequestError.getDescription());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(RewardedAd rewardedAd) {
        if (this.f36100b == null) {
            return;
        }
        this.f36100b.onAdLoaded(new RewardedAdWrapper(rewardedAd));
    }

    void a(UnityRewardedAdLoadListener unityRewardedAdLoadListener) {
        this.f36100b = unityRewardedAdLoadListener;
    }
}
