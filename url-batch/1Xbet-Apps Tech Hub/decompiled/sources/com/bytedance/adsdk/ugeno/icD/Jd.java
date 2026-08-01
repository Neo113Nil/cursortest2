package com.bytedance.adsdk.ugeno.icD;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: ResourceHelp.java */
/* loaded from: classes.dex */
public final class Jd {
    private static Resources icD;
    private static String pvs;
    private static Context vG;

    public static void pvs(String str) {
        pvs = str;
    }

    private static String pvs(Context context) {
        if (pvs == null) {
            pvs = context.getPackageName();
        }
        return pvs;
    }

    private static int pvs(Context context, String str, String str2) {
        if (icD == null) {
            icD = context.getResources();
        }
        return icD.getIdentifier(str, str2, pvs(context));
    }

    public static Drawable pvs(Context context, String str) {
        return context.getResources().getDrawable(icD(context, str));
    }

    public static int icD(Context context, String str) {
        return pvs(context, str, "drawable");
    }
}
