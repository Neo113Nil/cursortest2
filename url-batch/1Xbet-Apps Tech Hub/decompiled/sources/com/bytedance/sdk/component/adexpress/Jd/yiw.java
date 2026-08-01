package com.bytedance.sdk.component.adexpress.Jd;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.uc;
import java.util.Locale;

/* compiled from: ScreenUtils.java */
/* loaded from: classes.dex */
public class yiw {
    private static boolean pvs;

    public static int pvs(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float pvs(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD();
        }
        return (f * Jd(context)) + 0.5f;
    }

    public static int icD(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD();
        }
        float Jd = Jd(context);
        if (Jd <= 0.0f) {
            Jd = 1.0f;
        }
        return (int) ((f / Jd) + 0.5f);
    }

    public static float vG(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD();
        }
        return f * Jd(context);
    }

    private static float Jd(Context context) {
        try {
            if (pvs) {
                context.getClassLoader().loadClass("android.util.DisplayMetrics").getDeclaredMethod("getDeviceDensity", new Class[0]).setAccessible(true);
                return ((Integer) r1.invoke(r0, new Object[0])).intValue() / 160.0f;
            }
        } catch (Exception unused) {
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int pvs(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int icD(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.pvs.pvs.pvs.pvs().vG().icD();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String vG(Context context) {
        String str;
        try {
            Locale locale = uc.icD(context).getConfiguration().getLocales().get(0);
            str = locale.getLanguage();
            try {
                if (locale.getCountry().equals("TW")) {
                    str = "zhHant";
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str = "";
        }
        return pvs(str);
    }

    private static String pvs(String str) {
        str.hashCode();
        switch (str) {
            case "ar":
                return "aa";
            case "ja":
                return "japan";
            case "ko":
                return "korea";
            case "ms":
                return "my";
            case "zh":
                return "cn";
            default:
                return str;
        }
    }
}
