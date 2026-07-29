package com.cmplay.internalpush.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmplay.base.util.x;

/* loaded from: classes.dex */
public class CloudVideoReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.getAction().equals("com.cmplay.activesdk.cloud_cfg.update") || x.a() || !x.b()) {
            return;
        }
        e.a();
        f.a();
        g.a();
    }
}
