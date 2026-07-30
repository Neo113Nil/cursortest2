package com.baidu.mapsdkplatform.comapi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.mapapi.NetworkUtil;
import com.baidu.mapsdkplatform.comapi.util.g;

/* loaded from: classes2.dex */
public class d extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7954a = "d";

    public void a(Context context) {
        String currentNetMode = NetworkUtil.getCurrentNetMode(context);
        String f8 = g.f();
        if (f8 == null) {
            g.a(currentNetMode);
        } else {
            if (f8.equals(currentNetMode)) {
                return;
            }
            g.a(currentNetMode);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        a(context);
        NetworkUtil.updateNetworkProxy(context);
    }
}
