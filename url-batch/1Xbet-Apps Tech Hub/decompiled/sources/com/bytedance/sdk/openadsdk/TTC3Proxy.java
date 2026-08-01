package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.component.reward.NB;
import com.bytedance.sdk.openadsdk.component.reward.Wyp;
import com.bytedance.sdk.openadsdk.component.reward.kj;
import com.bytedance.sdk.openadsdk.component.reward.yiw;
import com.bytedance.sdk.openadsdk.component.vG.icD;

/* loaded from: classes2.dex */
public class TTC3Proxy {
    public static void verityPlayable(String str, int i, String str2, String str3, String str4) {
        Wyp.pvs(str, i, str2, str3, str4);
    }

    public static void loadReward(Context context, AdSlot adSlot, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
        adSlot.setDurationSlotType(7);
        kj.pvs(context).pvs(adSlot, new yiw(pAGRewardedAdLoadListener));
    }

    public static void loadFull(Context context, AdSlot adSlot, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
        adSlot.setDurationSlotType(8);
        NB.pvs(context).pvs(adSlot, new icD(pAGInterstitialAdLoadListener));
    }

    public static void a(Context context) {
        try {
            kj.pvs(context).pvs();
        } catch (Throwable unused) {
        }
        try {
            NB.pvs(context).pvs();
        } catch (Throwable unused2) {
        }
    }
}
