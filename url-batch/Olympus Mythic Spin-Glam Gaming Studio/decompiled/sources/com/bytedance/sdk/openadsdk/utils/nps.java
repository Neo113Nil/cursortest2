package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import com.applovin.sdk.AppLovinEventTypes;

/* loaded from: classes15.dex */
public class nps {
    static float fs = 0.0f;
    static int zmn = -1;
    private static long zn;

    private static void zmn(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            zmn = 1;
        } else {
            zmn = 0;
        }
        fs = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static zmn zmn() {
        if (zn == 0 || SystemClock.elapsedRealtime() - zn > 60000) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.kgc.zmn().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                zmn(registerReceiver);
                zn = SystemClock.elapsedRealtime();
            }
        }
        return new zmn(zmn, fs);
    }

    public static class zmn {
        public final float fs;
        public final int zmn;

        public zmn(int i, float f) {
            this.zmn = i;
            this.fs = f;
        }
    }
}
