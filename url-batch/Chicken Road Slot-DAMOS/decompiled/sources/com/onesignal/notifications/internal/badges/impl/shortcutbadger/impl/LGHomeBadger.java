package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import a2.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.List;
import vb.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
@Deprecated
/* loaded from: classes.dex */
public class LGHomeBadger implements a {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i3);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, componentName.getClassName());
        if (wb.a.canResolveBroadcast(context, intent)) {
            context.sendBroadcast(intent);
        } else {
            r.g(intent);
        }
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Arrays.asList("com.lge.launcher", "com.lge.launcher2");
    }
}
