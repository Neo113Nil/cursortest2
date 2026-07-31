package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes13.dex */
public final class doe {
    private static boolean btk;
    private static String fb;
    private static String fs;
    private static boolean hhw;

    @SuppressLint({"StaticFieldLeak"})
    private static Context zmn;
    private static Resources zn;

    public static void zmn(Context context) {
        zmn = context;
    }

    public static void zmn(String str) {
        fb = str;
    }

    private static String fb(Context context) {
        if (fb == null) {
            fb = context.getPackageName();
        }
        return fb;
    }

    private static int zmn(Context context, String str, String str2) {
        int identifier = fs(context).getIdentifier(str, str2, fb(context));
        if (identifier != 0) {
            return identifier;
        }
        if (!btk) {
            zn(context);
            return fs(context).getIdentifier(str, str2, fb(context));
        }
        return context.getResources().getIdentifier(str, str2, fb(context));
    }

    public static String zmn(Context context, String str) {
        return fs(context).getString(fs(context, str));
    }

    public static int fs(Context context, String str) {
        return zmn(context, str, "string");
    }

    public static Drawable zn(Context context, String str) {
        try {
            return fs(context).getDrawable(fb(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static int fb(Context context, String str) {
        try {
            return zmn(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int btk(Context context, String str) {
        return zmn(context, str, "id");
    }

    public static int hhw(Context context, String str) {
        return zmn(context, str, "style");
    }

    public static int nps(Context context, String str) {
        return fs(context).getColor(zg(context, str));
    }

    public static int zg(Context context, String str) {
        return zmn(context, str, "color");
    }

    public static int bvs(Context context, String str) {
        return zmn(context, str, "anim");
    }

    public static Resources fs(Context context) {
        Resources resources = zn;
        if (resources == null) {
            resources = null;
        }
        Context context2 = zmn;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    public static synchronized void zn(Context context) {
        synchronized (doe.class) {
            try {
                if (TextUtils.isEmpty(fs)) {
                    return;
                }
                btk = true;
            } catch (Throwable th) {
                Log.e("ResourceHelp", "makePluginResources failed", th);
            }
        }
    }
}
