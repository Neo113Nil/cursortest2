package com.crrepa.band.my.common.receiver;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes2.dex */
public class InstalledReceiver extends BroadcastReceiver {
    private static InstalledReceiver installedReceiver;

    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public static void register(Context context) {
        if (installedReceiver == null) {
            installedReceiver = new InstalledReceiver();
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.setPriority(1000);
        intentFilter.addDataScheme("package");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(installedReceiver, intentFilter, 2);
        } else {
            context.registerReceiver(installedReceiver, intentFilter);
        }
    }

    public static void unregister(Context context) {
        context.unregisterReceiver(installedReceiver);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.crrepa.band.my.ble.band.connect.a.connect();
    }
}
