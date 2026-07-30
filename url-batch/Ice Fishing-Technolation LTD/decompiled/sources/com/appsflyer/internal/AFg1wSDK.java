package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.core.app.NotificationCompat;
import com.appsflyer.AFLogger;
import com.appsflyer.internal.AFg1uSDK;

/* loaded from: classes.dex */
public final class AFg1wSDK implements AFg1uSDK {
    private static IntentFilter AFAdRevenueData = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    @Override // com.appsflyer.internal.AFg1uSDK
    public final AFg1uSDK.AFa1zSDK getCurrencyIso4217Code(Context context) {
        String str = null;
        float f = 0.0f;
        try {
            Intent registerReceiver = context.registerReceiver(null, AFAdRevenueData);
            if (registerReceiver != null) {
                if (2 == registerReceiver.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1)) {
                    int intExtra = registerReceiver.getIntExtra("plugged", -1);
                    if (intExtra == 1) {
                        str = "ac";
                    } else if (intExtra == 2) {
                        str = "usb";
                    } else if (intExtra == 4) {
                        str = "wireless";
                    } else {
                        str = "other";
                    }
                } else {
                    str = "no";
                }
                int intExtra2 = registerReceiver.getIntExtra("level", -1);
                int intExtra3 = registerReceiver.getIntExtra("scale", -1);
                if (-1 != intExtra2 && -1 != intExtra3) {
                    f = (intExtra2 * 100.0f) / intExtra3;
                }
            }
        } catch (Throwable th) {
            AFLogger.afErrorLogForExcManagerOnly("Device that failed to register receiver", th);
        }
        return new AFg1uSDK.AFa1zSDK(f, str);
    }
}
