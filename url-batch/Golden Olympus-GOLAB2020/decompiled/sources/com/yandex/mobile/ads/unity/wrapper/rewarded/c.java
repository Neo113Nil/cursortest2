package com.yandex.mobile.ads.unity.wrapper.rewarded;

import android.content.Context;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;
import com.yandex.mobile.ads.rewarded.RewardedAdLoader;

/* loaded from: classes3.dex */
abstract class c {
    static RewardedAdLoader a(Context context, RewardedAdLoadListener rewardedAdLoadListener) {
        RewardedAdLoader rewardedAdLoader = new RewardedAdLoader(context);
        rewardedAdLoader.setAdLoadListener(rewardedAdLoadListener);
        return rewardedAdLoader;
    }
}
