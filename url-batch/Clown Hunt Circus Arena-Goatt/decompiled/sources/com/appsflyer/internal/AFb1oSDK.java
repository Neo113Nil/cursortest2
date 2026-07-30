package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;

/* loaded from: classes.dex */
public final class AFb1oSDK {
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final long values;

    public AFb1oSDK() {
    }

    public static Uri AFKeystoreWrapper(Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        return activity.getReferrer();
    }

    public AFb1oSDK(String str, long j, boolean z) {
        this.AFKeystoreWrapper = str;
        this.values = j;
        this.valueOf = z;
    }

    public final boolean valueOf() {
        return this.valueOf;
    }
}
