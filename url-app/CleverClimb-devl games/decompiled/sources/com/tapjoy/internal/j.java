package com.tapjoy.internal;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* loaded from: classes2.dex */
public class j extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context, intent);
    }

    protected final int a(Context context, Intent intent) {
        try {
            Bundle bundle = context.getPackageManager().getReceiverInfo(new ComponentName(context, getClass()), 128).metaData;
            if (bundle == null) {
                return 0;
            }
            int i = 0;
            for (String str : bundle.keySet()) {
                try {
                    String string = bundle.getString(str);
                    if (string != null) {
                        try {
                            Object newInstance = Class.forName(string).newInstance();
                            if (newInstance instanceof BroadcastReceiver) {
                                BroadcastReceiver broadcastReceiver = (BroadcastReceiver) newInstance;
                                Intent intent2 = new Intent(intent);
                                intent2.setComponent(new ComponentName(context, string));
                                broadcastReceiver.onReceive(context, intent2);
                                i++;
                            }
                        } catch (Throwable unused) {
                        }
                    } else {
                        new Object[1][0] = str;
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                }
            }
            return i;
        } catch (PackageManager.NameNotFoundException unused3) {
            return 0;
        }
    }
}
