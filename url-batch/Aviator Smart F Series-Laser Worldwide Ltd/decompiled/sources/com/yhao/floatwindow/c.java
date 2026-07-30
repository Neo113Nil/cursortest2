package com.yhao.floatwindow;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.provider.Settings;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.PlaybackException;

/* loaded from: classes4.dex */
class c {
    c() {
    }

    static boolean hasPermission(Context context) {
        boolean canDrawOverlays;
        if (Build.VERSION.SDK_INT < 23) {
            return hasPermissionBelowMarshmallow(context);
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }

    static boolean hasPermissionBelowMarshmallow(Context context) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
            Class cls = Integer.TYPE;
            return ((Integer) AppOpsManager.class.getMethod("checkOp", cls, cls, String.class).invoke(appOpsManager, 24, Integer.valueOf(Binder.getCallingUid()), context.getApplicationContext().getPackageName())).intValue() == 0;
        } catch (Exception unused) {
            return false;
        }
    }

    @RequiresApi(api = 23)
    private static boolean hasPermissionForO(Context context) {
        try {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager == null) {
                return false;
            }
            View view = new View(context);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(0, 0, Build.VERSION.SDK_INT >= 26 ? 2038 : PlaybackException.ERROR_CODE_IO_INVALID_HTTP_CONTENT_TYPE, 24, -2);
            view.setLayoutParams(layoutParams);
            windowManager.addView(view, layoutParams);
            windowManager.removeView(view);
            return true;
        } catch (Exception e8) {
            a.e("hasPermissionForO e:" + e8.toString());
            return false;
        }
    }

    static boolean hasPermissionOnActivityResult(Context context) {
        boolean canDrawOverlays;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 == 26) {
            return hasPermissionForO(context);
        }
        if (i8 < 23) {
            return hasPermissionBelowMarshmallow(context);
        }
        canDrawOverlays = Settings.canDrawOverlays(context);
        return canDrawOverlays;
    }
}
