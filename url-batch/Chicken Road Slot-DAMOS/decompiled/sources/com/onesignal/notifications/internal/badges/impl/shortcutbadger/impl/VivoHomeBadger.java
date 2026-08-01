package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import vb.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class VivoHomeBadger implements a {
    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent("launcher.action.CHANGE_APPLICATION_NOTIFICATION_NUM");
        intent.putExtra("packageName", context.getPackageName());
        intent.putExtra("className", componentName.getClassName());
        intent.putExtra("notificationNum", i3);
        context.sendBroadcast(intent);
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.vivo.launcher");
    }
}
