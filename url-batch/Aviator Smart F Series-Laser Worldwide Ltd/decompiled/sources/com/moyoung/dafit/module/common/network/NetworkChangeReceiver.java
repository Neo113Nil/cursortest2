package com.moyoung.dafit.module.common.network;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* loaded from: classes4.dex */
public class NetworkChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action == null || !action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
            return;
        }
        boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
        if (booleanExtra) {
            Log.d("Network", "No network");
        } else {
            Log.d("Network", "Network available");
        }
        org.greenrobot.eventbus.c.getDefault().post(new c(booleanExtra));
    }
}
