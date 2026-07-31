package com.appsflyer.internal;

import android.content.Context;

/* loaded from: classes3.dex */
public final class AFg1qSDK {
    public static boolean AFKeystoreWrapper(Context context) {
        return context.getPackageManager().isInstantApp();
    }
}
