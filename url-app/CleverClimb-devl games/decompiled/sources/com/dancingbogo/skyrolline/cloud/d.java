package com.dancingbogo.skyrolline.cloud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import com.dancingbogo.skyrolline.GameApp;
import com.tapjoy.TapjoyConstants;

/* compiled from: WifiStateReceiver.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static d f4569a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f4570b = true;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f4571c = new BroadcastReceiver() { // from class: com.dancingbogo.skyrolline.cloud.d.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            if (d.this.f4570b) {
                d.this.f4570b = false;
            } else if (((WifiManager) GameApp.f4485a.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI)) != null && "android.net.wifi.STATE_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.isConnected()) {
                GameApp.a().a(new Runnable() { // from class: com.dancingbogo.skyrolline.cloud.d.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        b.a(GameApp.f4485a).d();
                    }
                }, 1000L);
            }
        }
    };

    public static d a() {
        if (f4569a == null) {
            synchronized (d.class) {
                if (f4569a == null) {
                    f4569a = new d();
                }
            }
        }
        return f4569a;
    }

    public void b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        GameApp.f4485a.registerReceiver(this.f4571c, intentFilter);
    }
}
