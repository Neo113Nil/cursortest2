package com.onesignal.location.internal.permissions;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c {
    public static final c INSTANCE = new c();

    private c() {
    }

    public final void show(Context context) {
        h.e(context, "context");
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        context.startActivity(intent);
    }
}
