package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import K2.a;
import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ZukHomeBadger implements a {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // K2.a
    public void executeBadge(Context context, ComponentName componentName, int i7) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i7);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // K2.a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
