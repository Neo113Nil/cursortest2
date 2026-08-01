package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import vb.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class OPPOHomeBader implements a {
    private static final String INTENT_ACTION = "com.oppo.unsettledevent";
    private static final String INTENT_EXTRA_BADGEUPGRADE_COUNT = "app_badge_count";
    private static final String INTENT_EXTRA_BADGE_COUNT = "number";
    private static final String INTENT_EXTRA_BADGE_UPGRADENUMBER = "upgradeNumber";
    private static final String INTENT_EXTRA_PACKAGENAME = "pakeageName";
    private static final String PROVIDER_CONTENT_URI = "content://com.android.badge/badge";
    private int mCurrentTotalCount = -1;

    private void executeBadgeByBroadcast(Context context, ComponentName componentName, int i3) {
        if (i3 == 0) {
            i3 = -1;
        }
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i3);
        intent.putExtra(INTENT_EXTRA_BADGE_UPGRADENUMBER, i3);
        wb.a.sendIntentExplicitly(context, intent);
    }

    private void executeBadgeByContentProvider(Context context, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(INTENT_EXTRA_BADGEUPGRADE_COUNT, i3);
        context.getContentResolver().call(Uri.parse(PROVIDER_CONTENT_URI), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        if (this.mCurrentTotalCount == i3) {
            return;
        }
        this.mCurrentTotalCount = i3;
        executeBadgeByContentProvider(context, i3);
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.oppo.launcher");
    }
}
