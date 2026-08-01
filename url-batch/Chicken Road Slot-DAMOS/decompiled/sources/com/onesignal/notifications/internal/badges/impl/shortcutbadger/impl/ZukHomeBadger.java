package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import vb.a;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class ZukHomeBadger implements a {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // vb.a
    public void executeBadge(Context context, ComponentName componentName, int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i3);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // vb.a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
