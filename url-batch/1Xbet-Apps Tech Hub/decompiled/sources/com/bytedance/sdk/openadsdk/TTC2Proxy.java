package com.bytedance.sdk.openadsdk;

import android.content.Context;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.component.yiw;
import com.bytedance.sdk.openadsdk.component.yiw.pvs;

/* loaded from: classes2.dex */
public class TTC2Proxy {
    private TTC2Proxy() {
    }

    public static void load(Context context, AdSlot adSlot, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener, int i) {
        adSlot.setDurationSlotType(3);
        yiw.pvs(context).pvs(adSlot, pAGAppOpenAdLoadListener, i);
    }

    public static void a(Context context) {
        pvs.pvs(context);
    }
}
