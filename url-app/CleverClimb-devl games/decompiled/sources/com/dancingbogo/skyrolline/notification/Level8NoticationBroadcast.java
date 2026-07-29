package com.dancingbogo.skyrolline.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dancingbogo.skyrolline.commons.RollingSkyService;
import com.dancingbogo.skyrolline.util.b;
import com.dancingbogo.skyrolline.util.d;

/* loaded from: classes2.dex */
public class Level8NoticationBroadcast extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        b.b("Level8NoticationBroadcast", "Level8NoticationBroadcast onReceive");
        Intent intent2 = new Intent(context, (Class<?>) RollingSkyService.class);
        intent2.putExtra("start_level_notification_48", true);
        d.b(context, intent2);
    }
}
