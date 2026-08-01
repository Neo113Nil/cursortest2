package com.onesignal.location.internal.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void show(Context context) {
        context.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }
}
