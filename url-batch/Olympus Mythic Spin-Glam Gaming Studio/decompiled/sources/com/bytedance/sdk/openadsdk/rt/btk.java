package com.bytedance.sdk.openadsdk.rt;

import android.app.Activity;
import android.os.Build;

/* loaded from: classes14.dex */
public class btk {
    public static void zmn(Activity activity) {
        if (activity == null || Build.VERSION.SDK_INT == 26) {
            return;
        }
        try {
            if (activity.getRequestedOrientation() == 1) {
                return;
            }
            activity.setRequestedOrientation(1);
        } catch (Throwable unused) {
        }
    }
}
