package com.bytedance.zmn.zmn;

import android.content.Context;

/* loaded from: classes13.dex */
public class hhw {
    private static Context zmn;

    public static void zmn(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            zmn = applicationContext;
        } else {
            zmn = context;
        }
    }

    public static Context zmn() {
        return zmn;
    }
}
