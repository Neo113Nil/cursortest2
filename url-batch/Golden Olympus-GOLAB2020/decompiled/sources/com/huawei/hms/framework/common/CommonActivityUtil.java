package com.huawei.hms.framework.common;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class CommonActivityUtil {

    /* renamed from: e, reason: collision with root package name */
    private static volatile CommonActivityUtil f14122e;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14124b;

    /* renamed from: a, reason: collision with root package name */
    private List f14123a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private boolean f14125c = false;

    /* renamed from: d, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f14126d = new Application.ActivityLifecycleCallbacks() { // from class: com.huawei.hms.framework.common.CommonActivityUtil.1

        /* renamed from: a, reason: collision with root package name */
        private int f14127a = 0;

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            Logger.i("CommonActivityUtil", "onActivityStarted");
            int i4 = this.f14127a + 1;
            this.f14127a = i4;
            if (i4 == 1) {
                CommonActivityUtil.this.f14124b = true;
                Logger.d("CommonActivityUtil", "onActivityStarted");
                for (int i5 = 0; i5 < CommonActivityUtil.this.f14123a.size(); i5++) {
                    ((OnAppStatusListener) CommonActivityUtil.this.f14123a.get(i5)).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            this.f14127a--;
            Logger.i("CommonActivityUtil", "onActivityStopped");
            if (this.f14127a == 0) {
                Logger.d("CommonActivityUtil", "onActivityStopped");
                CommonActivityUtil.this.f14124b = false;
                for (int i4 = 0; i4 < CommonActivityUtil.this.f14123a.size(); i4++) {
                    ((OnAppStatusListener) CommonActivityUtil.this.f14123a.get(i4)).onBack();
                }
            }
        }
    };

    public interface OnAppStatusListener {
        void onBack();

        void onFront();
    }

    private CommonActivityUtil() {
    }

    public static PendingIntent getActivities(Context context, int i4, Intent[] intentArr, int i5) {
        if (context == null) {
            Logger.w("CommonActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i4, intentArr, i5);
        } catch (RuntimeException e4) {
            Logger.e("CommonActivityUtil", "dealType rethrowFromSystemServer:", e4);
            return null;
        }
    }

    public static CommonActivityUtil getInstance() {
        if (f14122e == null) {
            synchronized (CommonActivityUtil.class) {
                try {
                    if (f14122e == null) {
                        Logger.i("CommonActivityUtil", "new CommonActivityUtil");
                        f14122e = new CommonActivityUtil();
                    }
                } finally {
                }
            }
        }
        return f14122e;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return getInstance().isForeground();
    }

    public boolean isRegistered() {
        return this.f14125c;
    }

    public void register(Context context) {
        if (context == null) {
            Logger.i("CommonActivityUtil", "appContext is null");
        }
        if (!(context instanceof Application)) {
            Logger.w("CommonActivityUtil", "context is not application, register background fail");
        } else {
            ((Application) context).registerActivityLifecycleCallbacks(this.f14126d);
            this.f14125c = true;
        }
    }

    public void setOnAppStatusListener(OnAppStatusListener onAppStatusListener) {
        if (onAppStatusListener == null) {
            Logger.w("CommonActivityUtil", "onAppStatusListener is null");
        } else if (this.f14123a.size() >= 20) {
            Logger.w("CommonActivityUtil", "onAppStatusListener of count is max");
        } else {
            this.f14123a.add(onAppStatusListener);
        }
    }

    public void unRegister() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).unregisterActivityLifecycleCallbacks(this.f14126d);
        } else {
            Logger.w("CommonActivityUtil", "context is not application, unRegister background fail");
        }
    }

    public boolean isForeground() {
        return this.f14124b;
    }
}
