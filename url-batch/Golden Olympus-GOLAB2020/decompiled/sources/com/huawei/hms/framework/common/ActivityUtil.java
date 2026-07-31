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
public class ActivityUtil {

    /* renamed from: d, reason: collision with root package name */
    private static volatile ActivityUtil f14115d;

    /* renamed from: b, reason: collision with root package name */
    private boolean f14117b;

    /* renamed from: a, reason: collision with root package name */
    private List f14116a = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f14118c = new Application.ActivityLifecycleCallbacks() { // from class: com.huawei.hms.framework.common.ActivityUtil.1

        /* renamed from: a, reason: collision with root package name */
        private int f14119a = 0;

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
            int i4 = this.f14119a + 1;
            this.f14119a = i4;
            if (i4 == 1) {
                ActivityUtil.this.f14117b = true;
                Logger.d("ActivityUtil", "onActivityStarted");
                for (int i5 = 0; i5 < ActivityUtil.this.f14116a.size(); i5++) {
                    ((OnAppStatusListener) ActivityUtil.this.f14116a.get(i5)).onFront();
                }
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            int i4 = this.f14119a - 1;
            this.f14119a = i4;
            if (i4 == 0) {
                Logger.d("ActivityUtil", "onActivityStopped");
                ActivityUtil.this.f14117b = false;
                for (int i5 = 0; i5 < ActivityUtil.this.f14116a.size(); i5++) {
                    ((OnAppStatusListener) ActivityUtil.this.f14116a.get(i5)).onBack();
                }
            }
        }
    };

    public interface OnAppStatusListener {
        void onBack();

        void onFront();
    }

    private ActivityUtil() {
    }

    public static PendingIntent getActivities(Context context, int i4, Intent[] intentArr, int i5) {
        if (context == null) {
            Logger.w("ActivityUtil", "context is null");
            return null;
        }
        try {
            return PendingIntent.getActivities(context, i4, intentArr, i5);
        } catch (RuntimeException e4) {
            Logger.e("ActivityUtil", "dealType rethrowFromSystemServer:", e4);
            return null;
        }
    }

    public static ActivityUtil getInstance() {
        if (f14115d == null) {
            synchronized (ActivityUtil.class) {
                try {
                    if (f14115d == null) {
                        f14115d = new ActivityUtil();
                    }
                } finally {
                }
            }
        }
        return f14115d;
    }

    @Deprecated
    public static boolean isForeground(Context context) {
        return getInstance().isForeground();
    }

    public void register() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).registerActivityLifecycleCallbacks(this.f14118c);
        } else {
            Logger.w("ActivityUtil", "context is not application, register background fail");
        }
    }

    public void setOnAppStatusListener(OnAppStatusListener onAppStatusListener) {
        if (onAppStatusListener == null) {
            Logger.w("ActivityUtil", "onAppStatusListener is null");
        } else if (this.f14116a.size() >= 20) {
            Logger.w("ActivityUtil", "onAppStatusListener of count is max");
        } else {
            this.f14116a.add(onAppStatusListener);
        }
    }

    public void unRegister() {
        Context appContext = ContextHolder.getAppContext();
        if (appContext instanceof Application) {
            ((Application) appContext).unregisterActivityLifecycleCallbacks(this.f14118c);
        } else {
            Logger.w("ActivityUtil", "context is not application, unRegister background fail");
        }
    }

    public boolean isForeground() {
        return this.f14117b;
    }
}
