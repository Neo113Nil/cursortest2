package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import K2.a;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class OPPOHomeBader implements a {
    private static final String INTENT_ACTION = "com.oppo.unsettledevent";
    private static final String INTENT_EXTRA_BADGEUPGRADE_COUNT = "app_badge_count";
    private static final String INTENT_EXTRA_BADGE_COUNT = "number";
    private static final String INTENT_EXTRA_BADGE_UPGRADENUMBER = "upgradeNumber";
    private static final String INTENT_EXTRA_PACKAGENAME = "pakeageName";
    private static final String PROVIDER_CONTENT_URI = "content://com.android.badge/badge";
    private int mCurrentTotalCount = -1;

    private void executeBadgeByBroadcast(Context context, ComponentName componentName, int i7) {
        if (i7 == 0) {
            i7 = -1;
        }
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, componentName.getPackageName());
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, i7);
        intent.putExtra(INTENT_EXTRA_BADGE_UPGRADENUMBER, i7);
        L2.a.sendIntentExplicitly(context, intent);
    }

    private void executeBadgeByContentProvider(Context context, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt(INTENT_EXTRA_BADGEUPGRADE_COUNT, i7);
        context.getContentResolver().call(Uri.parse(PROVIDER_CONTENT_URI), "setAppBadgeCount", (String) null, bundle);
    }

    @Override // K2.a
    public void executeBadge(Context context, ComponentName componentName, int i7) {
        if (this.mCurrentTotalCount == i7) {
            return;
        }
        this.mCurrentTotalCount = i7;
        executeBadgeByContentProvider(context, i7);
    }

    @Override // K2.a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.oppo.launcher");
    }
}
