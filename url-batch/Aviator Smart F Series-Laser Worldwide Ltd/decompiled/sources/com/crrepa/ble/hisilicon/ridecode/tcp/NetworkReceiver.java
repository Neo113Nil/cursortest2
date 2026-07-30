package com.crrepa.ble.hisilicon.ridecode.tcp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.crrepa.g1.d;
import com.crrepa.g1.m;
import com.crrepa.u.c;

/* loaded from: classes3.dex */
public class NetworkReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static final NetworkReceiver f12293a = new NetworkReceiver();

    /* renamed from: b, reason: collision with root package name */
    private static boolean f12294b = false;

    public static void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 33) {
            d.a().registerReceiver(f12293a, intentFilter, 2);
        } else {
            d.a().registerReceiver(f12293a, intentFilter);
        }
        f12294b = true;
    }

    public static void b() {
        if (f12294b) {
            d.a().unregisterReceiver(f12293a);
            f12294b = false;
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.a(m.a());
    }
}
