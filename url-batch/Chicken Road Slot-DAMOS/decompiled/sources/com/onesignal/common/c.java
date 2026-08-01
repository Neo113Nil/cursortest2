package com.onesignal.common;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c {
    public static final c INSTANCE = new c();
    private static final int MARGIN_ERROR_PX_SIZE = m.INSTANCE.dpToPx(24);

    private c() {
    }

    public final String getCarrierName(Context context) {
        context.getClass();
        try {
            Object systemService = context.getSystemService("phone");
            systemService.getClass();
            String networkOperatorName = ((TelephonyManager) systemService).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public final Integer getNetType(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        systemService.getClass();
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }

    public final boolean isKeyboardUp(WeakReference<Activity> weakReference) {
        View view;
        boolean isVisible;
        weakReference.getClass();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Rect rect = new Rect();
        if (weakReference.get() != null) {
            Activity activity = weakReference.get();
            activity.getClass();
            Window window = activity.getWindow();
            view = window.getDecorView();
            view.getWindowVisibleDisplayFrame(rect);
            window.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            view = null;
        }
        if (view == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return displayMetrics.heightPixels - rect.bottom > MARGIN_ERROR_PX_SIZE;
        }
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return false;
        }
        isVisible = rootWindowInsets.isVisible(8);
        return isVisible;
    }
}
