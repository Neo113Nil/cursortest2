package com.onesignal.notifications.internal.badges.impl.shortcutbadger.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import java.util.Collections;
import java.util.List;
import m3.InterfaceC0687a;

/* loaded from: classes.dex */
public class ZukHomeBadger implements InterfaceC0687a {
    private final Uri CONTENT_URI = Uri.parse("content://com.android.badge/badge");

    @Override // m3.InterfaceC0687a
    public void executeBadge(Context context, ComponentName componentName, int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_badge_count", i2);
        context.getContentResolver().call(this.CONTENT_URI, "setAppBadgeCount", (String) null, bundle);
    }

    @Override // m3.InterfaceC0687a
    public List<String> getSupportLaunchers() {
        return Collections.singletonList("com.zui.launcher");
    }
}
