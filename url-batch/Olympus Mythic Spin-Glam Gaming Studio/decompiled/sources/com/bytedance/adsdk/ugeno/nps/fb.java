package com.bytedance.adsdk.ugeno.nps;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes5.dex */
public final class fb {
    private static Resources fs;
    private static String zmn;

    @SuppressLint({"StaticFieldLeak"})
    private static Context zn;

    public static void zmn(String str) {
        zmn = str;
    }

    private static String zmn(Context context) {
        if (zmn == null) {
            zmn = context.getPackageName();
        }
        return zmn;
    }

    private static int zmn(Context context, String str, String str2) {
        if (fs == null) {
            fs = context.getResources();
        }
        return fs.getIdentifier(str, str2, zmn(context));
    }

    public static int zmn(Context context, String str) {
        return zmn(context, str, "raw");
    }

    public static int fs(Context context, String str) {
        return zmn(context, str, "drawable");
    }
}
