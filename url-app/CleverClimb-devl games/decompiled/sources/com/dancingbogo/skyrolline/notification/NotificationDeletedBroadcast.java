package com.dancingbogo.skyrolline.notification;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.dancingbogo.skyrolline.util.NativeUtil;

/* loaded from: classes2.dex */
public class NotificationDeletedBroadcast extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null || context == null) {
            return;
        }
        NativeUtil.getInstance().reportInfoc("rollingsky_games_notification", "style0=1&action=3", true);
    }
}
