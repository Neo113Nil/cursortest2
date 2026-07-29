package com.dancingbogo.skyrolline.cloud;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.dancingbogo.skyrolline.GameApp;
import java.util.List;

/* loaded from: classes.dex */
public class CloudUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private static CloudUpdateReceiver f4553a;

    /* renamed from: b, reason: collision with root package name */
    private Handler f4554b = new Handler(Looper.getMainLooper()) { // from class: com.dancingbogo.skyrolline.cloud.CloudUpdateReceiver.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
        }
    };

    public static CloudUpdateReceiver a(Context context) {
        if (f4553a == null) {
            synchronized (CloudUpdateReceiver.class) {
                if (f4553a == null) {
                    f4553a = new CloudUpdateReceiver(context);
                }
            }
        }
        return f4553a;
    }

    private CloudUpdateReceiver(Context context) {
        com.dancingbogo.skyrolline.util.b.b("CloudUpdateReceiver", "registerReceiver broadcast");
        context.registerReceiver(this, new IntentFilter("com.cmplay.activesdk.cloud_cfg.update"));
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        com.dancingbogo.skyrolline.c.a.a(context);
        if (com.dancingbogo.skyrolline.c.a.a()) {
            b.a(GameApp.f4485a).c();
            List<String> a2 = a.a().a(4, "section_ad");
            if (a2.size() >= 1) {
                com.dancingbogo.skyrolline.b.d.a("key_ad", a2.get(0));
            }
            int a3 = a.a().a(4, "rs_native_mediation", "switch", -1);
            if (a3 != -1) {
                com.dancingbogo.skyrolline.b.d.a("key_juhe_switcher", a3);
                com.dancingbogo.skyrolline.b.d.a("key_is_cloud_update", 1);
            } else {
                com.dancingbogo.skyrolline.b.d.a("key_juhe_switcher", 0);
            }
        }
    }
}
