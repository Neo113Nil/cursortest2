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
public class AdwHomeBadger implements a {
    public static final String CLASSNAME = "CNAME";
    public static final String COUNT = "COUNT";
    public static final String INTENT_UPDATE_COUNTER = "org.adw.launcher.counter.SEND";
    public static final String PACKAGENAME = "PNAME";

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(INTENT_UPDATE_COUNTER);
        intent.putExtra(PACKAGENAME, componentName.getPackageName());
        intent.putExtra(CLASSNAME, componentName.getClassName());
        intent.putExtra(COUNT, i3);
        if (wb.a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            r.g(intent);
        }
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("org.adw.launcher", "org.adwfreak.launcher");
    }
}
