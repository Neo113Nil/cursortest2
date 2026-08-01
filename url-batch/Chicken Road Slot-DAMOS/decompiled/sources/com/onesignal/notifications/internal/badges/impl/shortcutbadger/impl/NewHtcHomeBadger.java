package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a2.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import vb.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class NewHtcHomeBadger implements a {
    public static final String COUNT = "count";
    public static final String EXTRA_COMPONENT = "com.htc.launcher.extra.COMPONENT";
    public static final String EXTRA_COUNT = "com.htc.launcher.extra.COUNT";
    public static final String INTENT_SET_NOTIFICATION = "com.htc.launcher.action.SET_NOTIFICATION";
    public static final String INTENT_UPDATE_SHORTCUT = "com.htc.launcher.action.UPDATE_SHORTCUT";
    public static final String PACKAGENAME = "packagename";

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(INTENT_SET_NOTIFICATION);
        intent.putExtra(EXTRA_COMPONENT, componentName.flattenToShortString());
        intent.putExtra(EXTRA_COUNT, i3);
        Intent intent2 = new Intent(INTENT_UPDATE_SHORTCUT);
        intent2.putExtra(PACKAGENAME, componentName.getPackageName());
        intent2.putExtra(COUNT, i3);
        if (!wb.a.canResolveBroadcast(context, intent) && !wb.a.canResolveBroadcast(context, intent2)) {
            r.g(intent2);
        } else {
            context.sendBroadcast(intent);
            context.sendBroadcast(intent2);
        }
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.htc.launcher");
    }
}
