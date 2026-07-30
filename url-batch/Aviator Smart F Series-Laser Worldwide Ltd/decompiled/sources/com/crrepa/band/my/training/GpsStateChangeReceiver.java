package com.crrepa.band.my.training;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.crrepa.band.my.training.model.GpsStateChangeEvent;

/* loaded from: classes3.dex */
public class GpsStateChangeReceiver extends BroadcastReceiver {
    public static final String LOCATION_BROADCAST = "android.location.PROVIDERS_CHANGED";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        org.greenrobot.eventbus.c.getDefault().post(new GpsStateChangeEvent(context));
    }
}
