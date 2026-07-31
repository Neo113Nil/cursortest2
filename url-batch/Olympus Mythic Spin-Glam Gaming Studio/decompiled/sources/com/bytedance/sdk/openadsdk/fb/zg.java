package com.bytedance.sdk.openadsdk.fb;

import android.app.ActivityManager;
import android.os.Build;
import com.bytedance.sdk.component.utils.iqz;
import java.lang.reflect.Method;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class zg {
    private static boolean btk;
    private static Method fb;
    private static Class<?> fs;
    private static Method zmn;
    private static Method zn;

    static {
        fs();
    }

    private static void fs() {
        int i;
        if (btk || (i = Build.VERSION.SDK_INT) < 35) {
            return;
        }
        try {
            if (zn()) {
                zmn = ActivityManager.class.getMethod("getHistoricalProcessStartReasons", Integer.TYPE);
                Class<?> cls = Class.forName("android.app.ApplicationStartInfo");
                fs = cls;
                fb = cls.getMethod("getReason", null);
                if (i >= 36) {
                    zn = fs.getMethod("getStartComponent", null);
                }
                btk = true;
            }
        } catch (Throwable th) {
            iqz.zn(th.getMessage(), new Object[0]);
        }
    }

    private static boolean zn() {
        return com.bytedance.sdk.openadsdk.uqh.btk.zmn("s_i_e", 0) == 1;
    }

    public static JSONObject zmn() {
        JSONObject jSONObject;
        Method method;
        List list;
        Method method2;
        Method method3;
        int i = Build.VERSION.SDK_INT;
        JSONObject jSONObject2 = null;
        if (i < 35 || !zn()) {
            return null;
        }
        fs();
        try {
            jSONObject = new JSONObject();
        } catch (Throwable th) {
            th = th;
        }
        try {
            ActivityManager activityManager = (ActivityManager) com.bytedance.sdk.openadsdk.core.kgc.zmn().getSystemService(ActivityManager.class);
            if (activityManager != null && (method = zmn) != null && (list = (List) method.invoke(activityManager, 1)) != null && !list.isEmpty()) {
                Object obj = list.get(0);
                if (i >= 36 && obj != null && (method3 = zn) != null) {
                    jSONObject.put("start_component", ((Integer) method3.invoke(obj, null)).intValue());
                }
                if (obj != null && (method2 = fb) != null) {
                    jSONObject.put("start_reason", ((Integer) method2.invoke(obj, null)).intValue());
                }
            }
            return jSONObject;
        } catch (Throwable th2) {
            th = th2;
            jSONObject2 = jSONObject;
            iqz.zn(th.getMessage(), new Object[0]);
            return jSONObject2;
        }
    }
}
