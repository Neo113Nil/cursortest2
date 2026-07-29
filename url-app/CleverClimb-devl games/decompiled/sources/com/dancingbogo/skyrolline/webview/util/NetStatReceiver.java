package com.dancingbogo.skyrolline.webview.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Message;
import android.support.v4.view.PointerIconCompat;
import com.dancingbogo.skyrolline.GameApp;
import com.tapjoy.TapjoyConstants;

/* loaded from: classes2.dex */
public class NetStatReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private Handler f4683a;

    /* renamed from: b, reason: collision with root package name */
    private Context f4684b;

    /* renamed from: c, reason: collision with root package name */
    private a f4685c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f4686d = false;
    private long e;

    public interface a {
        void a();

        void b();

        void c();

        void d();
    }

    public void a(a aVar) {
        this.f4685c = aVar;
    }

    public NetStatReceiver(Context context) {
        this.e = 0L;
        this.f4684b = context;
        this.f4683a = new Handler(context.getMainLooper()) { // from class: com.dancingbogo.skyrolline.webview.util.NetStatReceiver.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (NetStatReceiver.this.f4685c == null) {
                    return;
                }
                if (!NetStatReceiver.this.f4686d || message.what == 1000 || message.what == 1004) {
                    NetStatReceiver.this.f4686d = false;
                    int i = message.what;
                    if (i != 1) {
                        if (i != 3) {
                            switch (i) {
                                case 1000:
                                    removeMessages(1004);
                                    NetStatReceiver.this.f4685c.c();
                                    break;
                                case 1001:
                                    break;
                                default:
                                    switch (i) {
                                        case PointerIconCompat.TYPE_HELP /* 1003 */:
                                            if (NetStatReceiver.this.c()) {
                                                NetStatReceiver.this.b();
                                                break;
                                            }
                                            break;
                                        case 1004:
                                            NetStatReceiver.this.f4685c.d();
                                            break;
                                    }
                            }
                            return;
                        }
                        NetStatReceiver.this.b();
                        return;
                    }
                    NetStatReceiver.this.f4685c.a();
                }
            }
        };
        this.e = System.currentTimeMillis();
        a();
    }

    private void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.wifi.STATE_CHANGE");
        intentFilter.addAction(com.cmplay.base.util.webview.util.NetStatReceiver.MOBILE_NET_ACTION);
        this.f4684b.registerReceiver(this, intentFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f4683a == null || this.f4685c == null) {
            return;
        }
        this.f4686d = true;
        this.f4685c.b();
        this.f4683a.sendEmptyMessageDelayed(1004, TapjoyConstants.TIMER_INCREMENT);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (System.currentTimeMillis() - 700 < this.e) {
            return;
        }
        if (this.f4684b == null || this.f4683a == null) {
            if (context != null) {
                try {
                    context.unregisterReceiver(this);
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            }
            return;
        }
        String action = intent.getAction();
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
            this.f4683a.sendEmptyMessage(intent.getIntExtra("wifi_state", 0));
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo != null) {
                if (NetworkInfo.State.CONNECTED == networkInfo.getState()) {
                    this.f4683a.sendEmptyMessage(1000);
                    return;
                } else {
                    if (NetworkInfo.State.DISCONNECTED == networkInfo.getState()) {
                        this.f4683a.sendEmptyMessage(1002);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if ("android.net.wifi.STATE_CHANGE".equals(action)) {
            NetworkInfo networkInfo2 = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            if (networkInfo2 == null || NetworkInfo.State.CONNECTING != networkInfo2.getState()) {
                return;
            }
            this.f4683a.sendEmptyMessage(1001);
            return;
        }
        if (com.cmplay.base.util.webview.util.NetStatReceiver.MOBILE_NET_ACTION.equals(action)) {
            this.f4683a.removeMessages(PointerIconCompat.TYPE_HELP);
            this.f4683a.sendEmptyMessageDelayed(PointerIconCompat.TYPE_HELP, 100L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) GameApp.f4485a.getSystemService("connectivity");
        try {
            return ((Boolean) connectivityManager.getClass().getMethod("getMobileDataEnabled", new Class[0]).invoke(connectivityManager, new Object[0])).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
