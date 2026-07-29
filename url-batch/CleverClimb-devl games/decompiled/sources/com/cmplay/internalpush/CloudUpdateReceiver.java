package com.cmplay.internalpush;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.cmplay.base.util.x;

/* loaded from: classes.dex */
public class CloudUpdateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || !intent.getAction().equals("com.cmplay.activesdk.cloud_cfg.update")) {
            return;
        }
        g.c(context);
        if (x.a()) {
            com.cmplay.base.util.h.a("zzb_cloud", "CloudUpdateReceiver 进程：" + x.b(context) + ",通知到了，" + x.a());
            return;
        }
        if (x.b()) {
            com.cmplay.base.util.h.a("zzb_cloud", "CloudUpdateReceiver UI进程通知到了，去加载数据");
            com.cmplay.internalpush.a.a.b.a().b();
        }
    }
}
