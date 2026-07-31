package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import K2.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class VivoHomeBadger implements a {
    @Override // K2.a
    public void executeBadge(Context context, ComponentName componentName, int i7) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i7);
        context.sendBroadcast(intent);
    }

    @Override // K2.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.vivo.launcher");
    }
}
