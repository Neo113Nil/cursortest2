package com.cmplay.internalpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import com.tapjoy.TapjoyConstants;

/* compiled from: WifiStateReceiver.java */
/* loaded from: classes.dex */
public class t {

    /* renamed from: c, reason: collision with root package name */
    private static t f4296c;

    /* renamed from: a, reason: collision with root package name */
    private boolean f4297a = true;

    /* renamed from: b, reason: collision with root package name */
    private Handler f4298b = new Handler(Looper.getMainLooper());

    /* renamed from: d, reason: collision with root package name */
    private BroadcastReceiver f4299d = new BroadcastReceiver() { // from class: com.cmplay.internalpush.t.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo;
            if (t.this.f4297a) {
                t.this.f4297a = false;
            } else if (((WifiManager) context.getSystemService(TapjoyConstants.TJC_CONNECTION_TYPE_WIFI)) != null && "android.net.wifi.STATE_CHANGE".equals(intent.getAction()) && (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) != null && networkInfo.isConnected()) {
                t.this.f4298b.postDelayed(new Runnable() { // from class: com.cmplay.internalpush.t.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.cmplay.base.util.h.a("zzb_cloud", "网络切换，拉取魔方-----");
                        com.ijinshan.cloudconfig.a.a(1, "");
                    }
                }, 1000L);
            }
        }
    };

    public static t a() {
        if (f4296c == null) {
            synchronized (t.class) {
                if (f4296c == null) {
                    f4296c = new t();
                }
            }
        }
        return f4296c;
    }

    public void a(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        context.registerReceiver(this.f4299d, intentFilter);
    }
}
