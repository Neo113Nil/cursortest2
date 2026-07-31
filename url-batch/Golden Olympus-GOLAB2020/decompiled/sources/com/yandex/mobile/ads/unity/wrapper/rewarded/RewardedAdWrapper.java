package com.yandex.mobile.ads.unity.wrapper.rewarded;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;

/* loaded from: classes3.dex */
public class RewardedAdWrapper {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f36094a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    private final a f36095b;

    /* renamed from: c, reason: collision with root package name */
    RewardedAd f36096c;

    public RewardedAdWrapper(RewardedAd rewardedAd) {
        a aVar = new a();
        this.f36095b = aVar;
        this.f36096c = rewardedAd;
        rewardedAd.setAdEventListener(aVar);
    }

    public void clearUnityRewardedAdListener() {
        this.f36094a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.k
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdWrapper.this.a();
            }
        });
    }

    public void destroyRewardedAd() {
        this.f36094a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.j
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdWrapper.this.b();
            }
        });
    }

    public AdInfo getInfo() {
        RewardedAd rewardedAd = this.f36096c;
        if (rewardedAd == null) {
            return null;
        }
        return rewardedAd.getInfo();
    }

    public void setUnityRewardedAdListener(final UnityRewardedAdListener unityRewardedAdListener) {
        this.f36094a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.l
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdWrapper.this.a(unityRewardedAdListener);
            }
        });
    }

    public void show(final Activity activity) {
        this.f36094a.post(new Runnable() { // from class: com.yandex.mobile.ads.unity.wrapper.rewarded.i
            @Override // java.lang.Runnable
            public final void run() {
                RewardedAdWrapper.this.a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        this.f36095b.a((UnityRewardedAdListener) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        if (this.f36096c == null) {
            return;
        }
        this.f36095b.a((UnityRewardedAdListener) null);
        this.f36096c.setAdEventListener(null);
        this.f36096c = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(UnityRewardedAdListener unityRewardedAdListener) {
        this.f36095b.a(unityRewardedAdListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Activity activity) {
        RewardedAd rewardedAd = this.f36096c;
        if (rewardedAd == null) {
            return;
        }
        rewardedAd.show(activity);
    }
}
