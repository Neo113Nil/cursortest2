package com.crrepa.band.my.device.pushmessage.notify;

import android.content.Context;
import android.content.Intent;
import com.crrepa.band.my.device.pushmessage.notify.service.NotificationCollectorMonitorService;

/* loaded from: classes2.dex */
public class d {
    public void startMonitor(Context context) {
        if (q1.b.isNotificationEnabled(context)) {
            context.startService(new Intent(context, (Class<?>) NotificationCollectorMonitorService.class));
        }
    }
}
