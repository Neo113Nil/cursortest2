package com.bytedance.sdk.component.adexpress.fb;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import com.bytedance.sdk.component.utils.doe;
import java.util.Locale;

/* loaded from: classes3.dex */
public class nps {
    public static int zmn(float f, float f2, float f3, float f4) {
        return (((int) ((f * 255.0f) + 0.5f)) << 24) | (((int) ((f2 * 255.0f) + 0.5f)) << 16) | (((int) ((f3 * 255.0f) + 0.5f)) << 8) | ((int) ((f4 * 255.0f) + 0.5f));
    }

    public static float zmn(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
        }
        return (f * fb(context)) + 0.5f;
    }

    public static int fs(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
        }
        float fb = fb(context);
        if (fb <= 0.0f) {
            fb = 1.0f;
        }
        return (int) ((f / fb) + 0.5f);
    }

    public static float zn(Context context, float f) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
        }
        return f * fb(context);
    }

    private static float fb(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    public static int zmn(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
        }
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int fs(Context context) {
        if (context == null) {
            context = com.bytedance.sdk.component.adexpress.zmn.zmn.zmn.zmn().zn().fs();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        defaultDisplay.getRealMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public static String zn(@NonNull Context context) {
        String str;
        try {
            Locale locale = doe.fs(context).getConfiguration().getLocales().get(0);
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
        return zmn(str);
    }

    private static String zmn(String str) {
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
