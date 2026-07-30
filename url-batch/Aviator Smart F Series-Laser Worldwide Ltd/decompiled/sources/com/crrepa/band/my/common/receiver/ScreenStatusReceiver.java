package com.crrepa.band.my.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class ScreenStatusReceiver extends BroadcastReceiver {
    private static ScreenStatusReceiver receiver = new ScreenStatusReceiver();

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(receiver, intentFilter, 2);
        } else {
            context.registerReceiver(receiver, intentFilter);
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(receiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        f.d("ScreenStatusReceiver: " + intent.getAction());
        com.crrepa.band.my.ble.band.utils.b.getInstance().stop();
    }
}
