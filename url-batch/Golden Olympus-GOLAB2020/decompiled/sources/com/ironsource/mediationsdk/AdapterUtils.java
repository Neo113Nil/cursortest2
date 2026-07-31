package com.ironsource.mediationsdk;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;

/* loaded from: classes2.dex */
public class AdapterUtils {
    public static final int MIN_TABLET_DP_SIZE = 600;

    public static int dpToPixels(Context context, int i4) {
        if (context != null) {
            return (int) TypedValue.applyDimension(1, i4, context.getResources().getDisplayMetrics());
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils dpToPixels - context is null, returning dpSize", 3);
        return i4;
    }

    public static String getScreenSizeParams(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f4 = displayMetrics.heightPixels;
        float f5 = displayMetrics.density;
        float min = Math.min(displayMetrics.widthPixels / f5, f4 / f5);
        float f6 = displayMetrics.xdpi;
        float f7 = displayMetrics.widthPixels / f6;
        float f8 = displayMetrics.heightPixels / displayMetrics.ydpi;
        return "smallestWidth = " + min + " diagonalInches = " + Math.sqrt((f7 * f7) + (f8 * f8)) + " smallScreenDpApi =  " + context.getResources().getConfiguration().smallestScreenWidthDp;
    }

    public static boolean isLargeScreen(Context context) {
        if (context != null) {
            return context.getResources().getConfiguration().smallestScreenWidthDp >= 600;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "AdapterUtils isLargeScreen - context is null", 3);
        return false;
    }
}
