package com.bytedance.sdk.openadsdk.core;

import android.annotation.SuppressLint;
import android.app.Application;
import android.content.Context;
import android.view.ViewConfiguration;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class kgc {
    private static volatile nqi<com.bytedance.sdk.openadsdk.fb.zmn> fs = null;

    @SuppressLint({"StaticFieldLeak"})
    private static volatile Context zmn = null;
    private static int zn = -1;

    public static Context zmn() {
        if (zmn == null) {
            fs(null);
        }
        return zmn;
    }

    public static Context zmn(Context context) {
        if (context == null) {
            context = zmn();
        }
        if (context instanceof Application) {
            return context;
        }
        if (context != null) {
            return context.getApplicationContext();
        }
        return null;
    }

    public static void fs(Context context) {
        if (zmn == null) {
            synchronized (kgc.class) {
                try {
                    if (zmn == null) {
                        if (context != null) {
                            zmn = context;
                            Context applicationContext = context.getApplicationContext();
                            if (applicationContext != null) {
                                zmn = applicationContext;
                            }
                            return;
                        }
                        try {
                            Application zmn2 = zmn.zmn();
                            if (zmn2 != null) {
                                zmn = zmn2;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static int fs() {
        Context zmn2;
        if (zn < 0 && (zmn2 = zmn()) != null) {
            zn = ViewConfiguration.get(zmn2).getScaledTouchSlop();
        }
        return zn;
    }

    public static nqi<com.bytedance.sdk.openadsdk.fb.zmn> zn() {
        if (fs == null) {
            synchronized (kgc.class) {
                try {
                    if (fs == null) {
                        fs = new uqh(zmn);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return fs;
    }

    public static com.bytedance.sdk.openadsdk.core.settings.rc fb() {
        return com.bytedance.sdk.openadsdk.core.settings.rc.fs();
    }

    public static com.bytedance.sdk.openadsdk.cyb.fs.zn btk() {
        if (!com.bytedance.sdk.openadsdk.core.settings.nps.zmn()) {
            return com.bytedance.sdk.openadsdk.cyb.fs.fb.zmn();
        }
        return com.bytedance.sdk.openadsdk.fb.zmn.fs.zmn();
    }

    private static class zmn {

        @SuppressLint({"StaticFieldLeak"})
        private static volatile Application zmn;

        @Nullable
        public static Application zmn() {
            return zmn;
        }

        static {
            try {
                Object fs = fs();
                zmn = (Application) fs.getClass().getMethod("getApplication", null).invoke(fs, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zmn("MyApplication", "application get failed", th);
            }
        }

        private static Object fs() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", null);
                method.setAccessible(true);
                return method.invoke(null, null);
            } catch (Throwable th) {
                com.bytedance.sdk.component.utils.iqz.zmn("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
