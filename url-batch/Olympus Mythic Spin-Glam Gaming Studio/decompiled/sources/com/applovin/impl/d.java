package com.applovin.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.utils.Logger;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class d {

    class a extends com.applovin.impl.b {
        private WeakReference a = new WeakReference(null);
        final /* synthetic */ Class b;
        final /* synthetic */ b c;
        final /* synthetic */ c d;

        a(Class cls, b bVar, c cVar) {
            this.b = cls;
            this.c = bVar;
            this.d = cVar;
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.b.isInstance(activity) && this.a.get() == null) {
                this.a = new WeakReference(activity);
                this.c.a(activity);
            }
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.b.isInstance(activity) && !activity.isChangingConfigurations() && this.a.get() == activity) {
                this.d.b(this);
            }
        }
    }

    public interface b {
        void a(Activity activity);
    }

    public static void a(Context context, Class cls, c cVar, b bVar) {
        cVar.a(new a(cls, bVar, cVar));
        a(context, cls);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r1.getWindow().getInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Activity activity) {
        WindowInsetsController insetsController;
        int statusBars;
        if (!o0.b() || insetsController == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5380);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        statusBars = WindowInsets.Type.statusBars();
        insetsController.hide(statusBars);
    }

    public static void c(Activity activity) {
        WindowInsetsController insetsController;
        int systemBars;
        if (!o0.b()) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController = activity.getWindow().getInsetsController();
        if (insetsController == null) {
            activity.getWindow().getDecorView().setSystemUiVisibility(5894);
            return;
        }
        insetsController.setSystemBarsBehavior(2);
        systemBars = WindowInsets.Type.systemBars();
        insetsController.hide(systemBars);
    }

    public static boolean d(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isChangingConfigurations() || activity.isDestroyed();
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.a);
        p0.startActivity(p1);
    }

    public static String b(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        try {
            return appLovinFullscreenActivity.getPackageManager().getActivityInfo(new ComponentName(appLovinFullscreenActivity, appLovinFullscreenActivity.getClass()), 0).taskAffinity;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(Context context, Class cls) {
        Intent intent = new Intent(context, (Class<?>) cls);
        if (!(context instanceof Activity)) {
            intent.setFlags(268435456);
        }
        safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r1.getWindow().getInsetsController();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(Activity activity) {
        WindowInsetsController insetsController;
        int navigationBars;
        if (o0.b() && insetsController != null) {
            insetsController.setSystemBarsBehavior(2);
            navigationBars = WindowInsets.Type.navigationBars();
            insetsController.hide(navigationBars);
            return;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(4866);
    }

    public static Activity a(View view) {
        if (view == null) {
            return null;
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        r2 = r2.baseActivity;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        ComponentName componentName;
        ComponentName componentName2;
        if (!o0.i()) {
            return null;
        }
        try {
            List<ActivityManager.AppTask> appTasks = ((ActivityManager) appLovinFullscreenActivity.getSystemService("activity")).getAppTasks();
            if (appTasks != null && !appTasks.isEmpty()) {
                Iterator<ActivityManager.AppTask> it = appTasks.iterator();
                while (it.hasNext()) {
                    ActivityManager.RecentTaskInfo taskInfo = it.next().getTaskInfo();
                    componentName = taskInfo.topActivity;
                    String name = appLovinFullscreenActivity.getClass().getName();
                    if (componentName != null && componentName.getClassName().equals(name) && componentName2 != null) {
                        return appLovinFullscreenActivity.getPackageManager().getActivityInfo(componentName2, 0).taskAffinity;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
