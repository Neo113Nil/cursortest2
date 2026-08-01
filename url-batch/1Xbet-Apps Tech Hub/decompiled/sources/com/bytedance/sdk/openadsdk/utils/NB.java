package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: BatteryDataWatcher.java */
/* loaded from: classes2.dex */
public class NB {
    static float icD = 0.0f;
    static int pvs = -1;
    private static long vG;

    private static void pvs(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            pvs = 1;
        } else {
            pvs = 0;
        }
        icD = (intent.getIntExtra(FirebaseAnalytics.Param.LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    public static pvs pvs() {
        if (vG == 0 || SystemClock.elapsedRealtime() - vG > 60000) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.mnm.pvs().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                pvs(registerReceiver);
                vG = SystemClock.elapsedRealtime();
            }
        }
        pvs pvsVar = new pvs(pvs, icD);
        int i = pvsVar.pvs;
        float f = pvsVar.icD;
        return pvsVar;
    }

    /* compiled from: BatteryDataWatcher.java */
    public static class pvs {
        public final float icD;
        public final int pvs;

        public pvs(int i, float f) {
            this.pvs = i;
            this.icD = f;
        }
    }
}
