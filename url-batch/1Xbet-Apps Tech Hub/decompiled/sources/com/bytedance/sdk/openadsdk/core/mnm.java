package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* compiled from: InternalContainer.java */
/* loaded from: classes2.dex */
public class mnm {
    private static volatile vA<com.bytedance.sdk.openadsdk.icD.pvs> icD = null;
    private static volatile Context pvs = null;
    private static int vG = -1;

    public static Context pvs() {
        if (pvs == null) {
            pvs(null);
        }
        return pvs;
    }

    public static void pvs(Context context) {
        if (pvs == null) {
            synchronized (mnm.class) {
                if (pvs == null) {
                    if (context != null) {
                        pvs = context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            pvs = applicationContext;
                        }
                        return;
                    }
                    try {
                        Application pvs2 = pvs.pvs();
                        if (pvs2 != null) {
                            pvs = pvs2;
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static int icD() {
        Context pvs2;
        if (vG < 0 && (pvs2 = pvs()) != null) {
            vG = ViewConfiguration.get(pvs2).getScaledTouchSlop();
        }
        return vG;
    }

    public static vA<com.bytedance.sdk.openadsdk.icD.pvs> vG() {
        if (icD == null) {
            synchronized (mnm.class) {
                if (icD == null) {
                    icD = new cR(pvs);
                }
            }
        }
        return icD;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.sUS Jd() {
        return com.bytedance.sdk.openadsdk.core.settings.mnm.Lxj();
    }

    public static com.bytedance.sdk.openadsdk.Wyp.vG.icD NB() {
        if (!com.bytedance.sdk.openadsdk.core.settings.kj.pvs()) {
            return com.bytedance.sdk.openadsdk.Wyp.vG.vG.pvs();
        }
        return com.bytedance.sdk.openadsdk.icD.pvs.Jd.pvs();
    }

    /* compiled from: InternalContainer.java */
    private static class pvs {
        private static volatile Application pvs;

        public static Application pvs() {
            return pvs;
        }

        static {
            try {
                Object icD = icD();
                pvs = (Application) icD.getClass().getMethod("getApplication", new Class[0]).invoke(icD, new Object[0]);
                com.bytedance.sdk.component.utils.Ju.pvs("MyApplication", "application get success");
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("MyApplication", "application get failed", th);
            }
        }

        private static Object icD() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke(null, new Object[0]);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.Ju.pvs("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
