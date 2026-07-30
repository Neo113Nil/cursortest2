package com.baidu.ar;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public class l9 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public a f2711a;

    public interface a {
        void a(int i8);
    }

    public void a() {
        this.f2711a = null;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        a aVar;
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction())) {
            intent.getIntExtra("wifi_state", 0);
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || (networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo")) == null) {
            return;
        }
        if (NetworkInfo.State.CONNECTED != networkInfo.getState() || !networkInfo.isAvailable()) {
            a aVar2 = this.f2711a;
            if (aVar2 != null) {
                aVar2.a(2);
                return;
            }
            return;
        }
        if ((networkInfo.getType() == 1 || networkInfo.getType() == 0) && (aVar = this.f2711a) != null) {
            aVar.a(1);
        }
    }

    public void a(a aVar) {
        this.f2711a = aVar;
    }
}
