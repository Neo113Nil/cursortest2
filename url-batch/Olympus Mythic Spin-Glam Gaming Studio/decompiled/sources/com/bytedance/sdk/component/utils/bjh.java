package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;

/* loaded from: classes5.dex */
public class bjh {
    private static volatile String zmn;

    public static String zmn() {
        if (!TextUtils.isEmpty(zmn)) {
            return zmn;
        }
        String str = Build.MODEL;
        zmn = str;
        return str;
    }

    public static int zmn(Context context) {
        if (context == null) {
            return 0;
        }
        try {
            return context.getApplicationInfo().icon;
        } catch (Exception unused) {
            return 0;
        }
    }
}
