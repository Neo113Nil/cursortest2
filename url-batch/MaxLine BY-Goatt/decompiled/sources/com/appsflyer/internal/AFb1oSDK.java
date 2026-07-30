package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class AFb1oSDK {
    public final String AFKeystoreWrapper;
    private final boolean valueOf;
    public final long values;

    public AFb1oSDK(String str, long j, boolean z) {
        this.AFKeystoreWrapper = str;
        this.values = j;
        this.valueOf = z;
    }

    public static Uri AFKeystoreWrapper(Activity activity) {
        if (activity == null || activity.getIntent() == null) {
            return null;
        }
        return activity.getReferrer();
    }

    public final boolean valueOf() {
        return this.valueOf;
    }

    public AFb1oSDK() {
    }
}
