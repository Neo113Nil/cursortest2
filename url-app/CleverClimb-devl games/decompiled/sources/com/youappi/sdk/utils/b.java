package com.youappi.sdk.utils;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes2.dex */
public class b {
    public static Float a(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        double intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        double intExtra2 = registerReceiver.getIntExtra("scale", -1);
        Double.isNaN(intExtra);
        Double.isNaN(intExtra2);
        return new Float(intExtra / intExtra2);
    }
}
