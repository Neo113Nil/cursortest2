package com.crrepa.band.my.common.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.crrepa.band.my.ble.band.cmd.i4;
import com.orhanobut.logger.f;

/* loaded from: classes2.dex */
public class VolumeChangeReceiver extends BroadcastReceiver {
    private static final String ACTION_VOLUME_CHANGED = "android.media.VOLUME_CHANGED_ACTION";
    private static final VolumeChangeReceiver volumeChangeReceiver = new VolumeChangeReceiver();

    public static void register(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(ACTION_VOLUME_CHANGED);
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(volumeChangeReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(volumeChangeReceiver, intentFilter);
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(volumeChangeReceiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.crrepa.band.my.ble.band.utils.c cVar = com.crrepa.band.my.ble.band.utils.c.getInstance(context);
        f.d("VolumeChangeReceiver maxVolume: " + cVar.getMaxVolume());
        int currentVolume = cVar.getCurrentVolume();
        f.d("VolumeChangeReceiver currentVolume: " + currentVolume);
        i4.getInstance().sendCurrentVolume(currentVolume);
    }
}
