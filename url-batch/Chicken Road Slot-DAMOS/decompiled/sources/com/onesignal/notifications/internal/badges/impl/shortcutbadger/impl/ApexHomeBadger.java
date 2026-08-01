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
public class ApexHomeBadger implements a {
    private static final String CLASS = "class";
    private static final String COUNT = "count";
    private static final String INTENT_UPDATE_COUNTER = "com.anddoes.launcher.COUNTER_CHANGED";
    private static final String PACKAGENAME = "package";

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(INTENT_UPDATE_COUNTER);
        intent.putExtra(PACKAGENAME, componentName.getPackageName());
        intent.putExtra("count", i3);
        intent.putExtra(CLASS, componentName.getClassName());
        if (wb.a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            r.g(intent);
        }
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.anddoes.launcher");
    }
}
