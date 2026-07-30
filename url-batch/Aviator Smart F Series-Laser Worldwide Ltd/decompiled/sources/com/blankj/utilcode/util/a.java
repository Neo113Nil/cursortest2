package com.blankj.utilcode.util;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.util.Pair;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.blankj.utilcode.util.z0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class a {
    private a() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static void addActivityLifecycleCallbacks(@Nullable z0.a aVar) {
        c1.addActivityLifecycleCallbacks(aVar);
    }

    public static void finishActivity(@NonNull Activity activity) {
        finishActivity(activity, false);
    }

    public static void finishAllActivities() {
        finishAllActivities(false);
    }

    public static void finishAllActivitiesExceptNewest() {
        finishAllActivitiesExceptNewest(false);
    }

    public static void finishOtherActivities(@NonNull Class<? extends Activity> cls) {
        finishOtherActivities(cls, false);
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z7) {
        return finishToActivity(activity, z7, false);
    }

    @Nullable
    public static Activity getActivityByContext(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        Activity activityByContextInner = getActivityByContextInner(context);
        if (isActivityAlive(activityByContextInner)) {
            return activityByContextInner;
        }
        return null;
    }

    @Nullable
    private static Activity getActivityByContextInner(@Nullable Context context) {
        if (context == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (context instanceof ContextWrapper) {
            if (!(context instanceof Activity)) {
                Activity activityFromDecorContext = getActivityFromDecorContext(context);
                if (activityFromDecorContext == null) {
                    arrayList.add(context);
                    context = ((ContextWrapper) context).getBaseContext();
                    if (context == null || arrayList.contains(context)) {
                        break;
                    }
                } else {
                    return activityFromDecorContext;
                }
            } else {
                return (Activity) context;
            }
        }
        return null;
    }

    @Nullable
    private static Activity getActivityFromDecorContext(@Nullable Context context) {
        if (context != null && context.getClass().getName().equals("com.android.internal.policy.DecorContext")) {
            try {
                Field declaredField = context.getClass().getDeclaredField("mActivityContext");
                declaredField.setAccessible(true);
                return (Activity) ((WeakReference) declaredField.get(context)).get();
            } catch (Exception unused) {
            }
        }
        return null;
    }

    @Nullable
    public static Drawable getActivityIcon(@NonNull Activity activity) {
        return getActivityIcon(activity.getComponentName());
    }

    public static List<Activity> getActivityList() {
        return c1.getActivityList();
    }

    @Nullable
    public static Drawable getActivityLogo(@NonNull Activity activity) {
        return getActivityLogo(activity.getComponentName());
    }

    public static String getLauncherActivity() {
        return getLauncherActivity(z0.getApp().getPackageName());
    }

    public static List<String> getMainActivities() {
        return getMainActivities(z0.getApp().getPackageName());
    }

    private static Bundle getOptionsBundle(Fragment fragment, int i8, int i9) {
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return ActivityOptionsCompat.makeCustomAnimation(activity, i8, i9).toBundle();
    }

    public static Activity getTopActivity() {
        return c1.getTopActivity();
    }

    private static Context getTopActivityOrApp() {
        if (!c1.isAppForeground()) {
            return z0.getApp();
        }
        Activity topActivity = getTopActivity();
        return topActivity == null ? z0.getApp() : topActivity;
    }

    public static boolean isActivityAlive(Context context) {
        return isActivityAlive(getActivityByContext(context));
    }

    public static boolean isActivityExists(@NonNull String str, @NonNull String str2) {
        Intent intent = new Intent();
        intent.setClassName(str, str2);
        PackageManager packageManager = z0.getApp().getPackageManager();
        return (packageManager.resolveActivity(intent, 0) == null || intent.resolveActivity(packageManager) == null || packageManager.queryIntentActivities(intent, 0).size() == 0) ? false : true;
    }

    public static boolean isActivityExistsInStack(@NonNull Activity activity) {
        Iterator<Activity> it = c1.getActivityList().iterator();
        while (it.hasNext()) {
            if (it.next().equals(activity)) {
                return true;
            }
        }
        return false;
    }

    private static boolean isIntentAvailable(Intent intent) {
        return z0.getApp().getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }

    public static void removeActivityLifecycleCallbacks(@Nullable z0.a aVar) {
        c1.removeActivityLifecycleCallbacks(aVar);
    }

    public static void startActivities(@NonNull Intent[] intentArr) {
        startActivities(intentArr, getTopActivityOrApp(), (Bundle) null);
    }

    public static void startActivity(@NonNull Class<? extends Activity> cls) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8) {
        startActivityForResult(activity, (Bundle) null, activity.getPackageName(), cls.getName(), i8, (Bundle) null);
    }

    public static void startHomeActivity() {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(268435456);
        startActivity(intent);
    }

    public static void startLauncherActivity() {
        startLauncherActivity(z0.getApp().getPackageName());
    }

    public static void addActivityLifecycleCallbacks(@Nullable Activity activity, @Nullable z0.a aVar) {
        c1.addActivityLifecycleCallbacks(activity, aVar);
    }

    public static void finishActivity(@NonNull Activity activity, boolean z7) {
        activity.finish();
        if (z7) {
            return;
        }
        activity.overridePendingTransition(0, 0);
    }

    public static void finishAllActivities(boolean z7) {
        for (Activity activity : c1.getActivityList()) {
            activity.finish();
            if (!z7) {
                activity.overridePendingTransition(0, 0);
            }
        }
    }

    public static void finishAllActivitiesExceptNewest(boolean z7) {
        List<Activity> activityList = c1.getActivityList();
        for (int i8 = 1; i8 < activityList.size(); i8++) {
            finishActivity(activityList.get(i8), z7);
        }
    }

    public static void finishOtherActivities(@NonNull Class<? extends Activity> cls, boolean z7) {
        for (Activity activity : c1.getActivityList()) {
            if (!activity.getClass().equals(cls)) {
                finishActivity(activity, z7);
            }
        }
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z7, boolean z8) {
        for (Activity activity2 : c1.getActivityList()) {
            if (activity2.equals(activity)) {
                if (!z7) {
                    return true;
                }
                finishActivity(activity2, z8);
                return true;
            }
            finishActivity(activity2, z8);
        }
        return false;
    }

    @Nullable
    public static Drawable getActivityIcon(@NonNull Class<? extends Activity> cls) {
        return getActivityIcon(new ComponentName(z0.getApp(), cls));
    }

    @Nullable
    public static Drawable getActivityLogo(@NonNull Class<? extends Activity> cls) {
        return getActivityLogo(new ComponentName(z0.getApp(), cls));
    }

    public static String getLauncherActivity(@NonNull String str) {
        if (c1.isSpace(str)) {
            return "";
        }
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.addCategory("android.intent.category.LAUNCHER");
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = z0.getApp().getPackageManager().queryIntentActivities(intent, 0);
        return (queryIntentActivities == null || queryIntentActivities.size() == 0) ? "" : queryIntentActivities.get(0).activityInfo.name;
    }

    public static List<String> getMainActivities(@NonNull String str) {
        ArrayList arrayList = new ArrayList();
        Intent intent = new Intent("android.intent.action.MAIN", (Uri) null);
        intent.setPackage(str);
        List<ResolveInfo> queryIntentActivities = z0.getApp().getPackageManager().queryIntentActivities(intent, 0);
        int size = queryIntentActivities.size();
        if (size == 0) {
            return arrayList;
        }
        for (int i8 = 0; i8 < size; i8++) {
            ResolveInfo resolveInfo = queryIntentActivities.get(i8);
            if (resolveInfo.activityInfo.processName.equals(str)) {
                arrayList.add(resolveInfo.activityInfo.name);
            }
        }
        return arrayList;
    }

    public static boolean isActivityAlive(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    public static void removeActivityLifecycleCallbacks(@Nullable Activity activity) {
        c1.removeActivityLifecycleCallbacks(activity);
    }

    public static void startActivities(@NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        startActivities(intentArr, getTopActivityOrApp(), bundle);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, @Nullable Bundle bundle) {
        startActivityForResult(activity, (Bundle) null, activity.getPackageName(), cls.getName(), i8, bundle);
    }

    public static void startLauncherActivity(@NonNull String str) {
        String launcherActivity = getLauncherActivity(str);
        if (TextUtils.isEmpty(launcherActivity)) {
            return;
        }
        startActivity(str, launcherActivity);
    }

    @Nullable
    public static Drawable getActivityIcon(@NonNull ComponentName componentName) {
        try {
            return z0.getApp().getPackageManager().getActivityIcon(componentName);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    @Nullable
    public static Drawable getActivityLogo(@NonNull ComponentName componentName) {
        try {
            return z0.getApp().getPackageManager().getActivityLogo(componentName);
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    private static Bundle getOptionsBundle(Context context, int i8, int i9) {
        return ActivityOptionsCompat.makeCustomAnimation(context, i8, i9).toBundle();
    }

    public static void removeActivityLifecycleCallbacks(@Nullable Activity activity, @Nullable z0.a aVar) {
        c1.removeActivityLifecycleCallbacks(activity, aVar);
    }

    public static void startActivities(@NonNull Intent[] intentArr, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivities(intentArr, topActivityOrApp, getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void startActivity(@NonNull Class<? extends Activity> cls, @Nullable Bundle bundle) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), bundle);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, View... viewArr) {
        startActivityForResult(activity, (Bundle) null, activity.getPackageName(), cls.getName(), i8, getOptionsBundle(activity, viewArr));
    }

    public static void finishActivity(@NonNull Activity activity, @AnimRes int i8, @AnimRes int i9) {
        activity.finish();
        activity.overridePendingTransition(i8, i9);
    }

    private static Bundle getOptionsBundle(Fragment fragment, View[] viewArr) {
        FragmentActivity activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return getOptionsBundle(activity, viewArr);
    }

    public static boolean isActivityExistsInStack(@NonNull Class<? extends Activity> cls) {
        Iterator<Activity> it = c1.getActivityList().iterator();
        while (it.hasNext()) {
            if (it.next().getClass().equals(cls)) {
                return true;
            }
        }
        return false;
    }

    public static void finishAllActivitiesExceptNewest(@AnimRes int i8, @AnimRes int i9) {
        List<Activity> activityList = c1.getActivityList();
        for (int i10 = 1; i10 < activityList.size(); i10++) {
            finishActivity(activityList.get(i10), i8, i9);
        }
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr) {
        startActivities(intentArr, activity, (Bundle) null);
    }

    public static void startActivity(@NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, topActivityOrApp.getPackageName(), cls.getName(), getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void finishActivity(@NonNull Class<? extends Activity> cls) {
        finishActivity(cls, false);
    }

    public static void finishAllActivities(@AnimRes int i8, @AnimRes int i9) {
        for (Activity activity : c1.getActivityList()) {
            activity.finish();
            activity.overridePendingTransition(i8, i9);
        }
    }

    public static void finishOtherActivities(@NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        for (Activity activity : c1.getActivityList()) {
            if (!activity.getClass().equals(cls)) {
                finishActivity(activity, i8, i9);
            }
        }
    }

    private static Bundle getOptionsBundle(Activity activity, View[] viewArr) {
        int length;
        if (viewArr == null || (length = viewArr.length) <= 0) {
            return null;
        }
        Pair[] pairArr = new Pair[length];
        for (int i8 = 0; i8 < length; i8++) {
            View view = viewArr[i8];
            pairArr[i8] = Pair.create(view, view.getTransitionName());
        }
        return ActivityOptionsCompat.makeSceneTransitionAnimation(activity, pairArr).toBundle();
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        startActivities(intentArr, activity, bundle);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(activity, (Bundle) null, activity.getPackageName(), cls.getName(), i8, getOptionsBundle(activity, i9, i10));
    }

    public static void finishActivity(@NonNull Class<? extends Activity> cls, boolean z7) {
        for (Activity activity : c1.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                if (!z7) {
                    activity.overridePendingTransition(0, 0);
                }
            }
        }
    }

    public static boolean finishToActivity(@NonNull Activity activity, boolean z7, @AnimRes int i8, @AnimRes int i9) {
        for (Activity activity2 : c1.getActivityList()) {
            if (activity2.equals(activity)) {
                if (!z7) {
                    return true;
                }
                finishActivity(activity2, i8, i9);
                return true;
            }
            finishActivity(activity2, i8, i9);
        }
        return false;
    }

    public static void startActivities(@NonNull Activity activity, @NonNull Intent[] intentArr, @AnimRes int i8, @AnimRes int i9) {
        startActivities(intentArr, activity, getOptionsBundle(activity, i8, i9));
    }

    private static void startActivities(Intent[] intentArr, Context context, @Nullable Bundle bundle) {
        if (!(context instanceof Activity)) {
            for (Intent intent : intentArr) {
                intent.addFlags(268435456);
            }
        }
        if (bundle != null) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<? extends Activity> cls) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8) {
        startActivityForResult(activity, bundle, activity.getPackageName(), cls.getName(), i8, (Bundle) null);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, @Nullable Bundle bundle) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), bundle);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, @Nullable Bundle bundle2) {
        startActivityForResult(activity, bundle, activity.getPackageName(), cls.getName(), i8, bundle2);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, View... viewArr) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, viewArr));
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, View... viewArr) {
        startActivityForResult(activity, bundle, activity.getPackageName(), cls.getName(), i8, getOptionsBundle(activity, viewArr));
    }

    public static void finishActivity(@NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        for (Activity activity : c1.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                activity.finish();
                activity.overridePendingTransition(i8, i9);
            }
        }
    }

    public static boolean finishToActivity(@NonNull Class<? extends Activity> cls, boolean z7) {
        return finishToActivity(cls, z7, false);
    }

    public static boolean finishToActivity(@NonNull Class<? extends Activity> cls, boolean z7, boolean z8) {
        for (Activity activity : c1.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                if (!z7) {
                    return true;
                }
                finishActivity(activity, z8);
                return true;
            }
            finishActivity(activity, z8);
        }
        return false;
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        startActivity(activity, (Bundle) null, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, i8, i9));
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(activity, bundle, activity.getPackageName(), cls.getName(), i8, getOptionsBundle(activity, i9, i10));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<? extends Activity> cls) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, int i8) {
        startActivityForResult(activity, bundle, str, str2, i8, (Bundle) null);
    }

    public static boolean finishToActivity(@NonNull Class<? extends Activity> cls, boolean z7, @AnimRes int i8, @AnimRes int i9) {
        for (Activity activity : c1.getActivityList()) {
            if (activity.getClass().equals(cls)) {
                if (!z7) {
                    return true;
                }
                finishActivity(activity, i8, i9);
                return true;
            }
            finishActivity(activity, i8, i9);
        }
        return false;
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, int i8, @Nullable Bundle bundle2) {
        startActivityForResult(activity, bundle, str, str2, i8, bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<? extends Activity> cls, @Nullable Bundle bundle2) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), bundle2);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, int i8, View... viewArr) {
        startActivityForResult(activity, bundle, str, str2, i8, getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, topActivityOrApp.getPackageName(), cls.getName(), getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(activity, bundle, str, str2, i8, getOptionsBundle(activity, i9, i10));
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i8) {
        startActivityForResult(intent, activity, i8, (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i8, @Nullable Bundle bundle) {
        startActivityForResult(intent, activity, i8, bundle);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i8, View... viewArr) {
        startActivityForResult(intent, activity, i8, getOptionsBundle(activity, viewArr));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, @Nullable Bundle bundle2) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, View... viewArr) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, viewArr));
    }

    public static void startActivityForResult(@NonNull Activity activity, @NonNull Intent intent, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(intent, activity, i8, getOptionsBundle(activity, i9, i10));
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8) {
        startActivityForResult(fragment, (Bundle) null, z0.getApp().getPackageName(), cls.getName(), i8, (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull Class<? extends Activity> cls, @AnimRes int i8, @AnimRes int i9) {
        startActivity(activity, bundle, activity.getPackageName(), cls.getName(), getOptionsBundle(activity, i8, i9));
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, @Nullable Bundle bundle) {
        startActivityForResult(fragment, (Bundle) null, z0.getApp().getPackageName(), cls.getName(), i8, bundle);
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, View... viewArr) {
        startActivityForResult(fragment, (Bundle) null, z0.getApp().getPackageName(), cls.getName(), i8, getOptionsBundle(fragment, viewArr));
    }

    public static void startActivity(@NonNull String str, @NonNull String str2) {
        startActivity(getTopActivityOrApp(), (Bundle) null, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        startActivity(getTopActivityOrApp(), (Bundle) null, str, str2, bundle);
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(fragment, (Bundle) null, z0.getApp().getPackageName(), cls.getName(), i8, getOptionsBundle(fragment, i9, i10));
    }

    public static void startActivity(@NonNull String str, @NonNull String str2, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, (Bundle) null, str, str2, getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2) {
        startActivity(activity, (Bundle) null, str, str2, (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8) {
        startActivityForResult(fragment, bundle, z0.getApp().getPackageName(), cls.getName(), i8, (Bundle) null);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        startActivity(activity, (Bundle) null, str, str2, bundle);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, @Nullable Bundle bundle2) {
        startActivityForResult(fragment, bundle, z0.getApp().getPackageName(), cls.getName(), i8, bundle2);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, View... viewArr) {
        startActivity(activity, (Bundle) null, str, str2, getOptionsBundle(activity, viewArr));
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, View... viewArr) {
        startActivityForResult(fragment, bundle, z0.getApp().getPackageName(), cls.getName(), i8, getOptionsBundle(fragment, viewArr));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull String str, @NonNull String str2, @AnimRes int i8, @AnimRes int i9) {
        startActivity(activity, (Bundle) null, str, str2, getOptionsBundle(activity, i8, i9));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2) {
        startActivity(getTopActivityOrApp(), bundle, str, str2, (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle2) {
        startActivity(getTopActivityOrApp(), bundle, str, str2, bundle2);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull Class<? extends Activity> cls, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(fragment, bundle, z0.getApp().getPackageName(), cls.getName(), i8, getOptionsBundle(fragment, i9, i10));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull String str, @NonNull String str2, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        startActivity(topActivityOrApp, bundle, str, str2, getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2) {
        startActivity(activity, bundle, str, str2, (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull String str, @NonNull String str2, int i8) {
        startActivityForResult(fragment, bundle, str, str2, i8, (Bundle) null);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, @Nullable Bundle bundle2) {
        startActivity(activity, bundle, str, str2, bundle2);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull String str, @NonNull String str2, int i8, @Nullable Bundle bundle2) {
        startActivityForResult(fragment, bundle, str, str2, i8, bundle2);
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, View... viewArr) {
        startActivity(activity, bundle, str, str2, getOptionsBundle(activity, viewArr));
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull String str, @NonNull String str2, int i8, View... viewArr) {
        startActivityForResult(fragment, bundle, str, str2, i8, getOptionsBundle(fragment, viewArr));
    }

    public static void startActivity(@NonNull Bundle bundle, @NonNull Activity activity, @NonNull String str, @NonNull String str2, @AnimRes int i8, @AnimRes int i9) {
        startActivity(activity, bundle, str, str2, getOptionsBundle(activity, i8, i9));
    }

    public static boolean startActivity(@NonNull Intent intent) {
        return startActivity(intent, getTopActivityOrApp(), (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Bundle bundle, @NonNull Fragment fragment, @NonNull String str, @NonNull String str2, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(fragment, bundle, str, str2, i8, getOptionsBundle(fragment, i9, i10));
    }

    public static boolean startActivity(@NonNull Intent intent, @Nullable Bundle bundle) {
        return startActivity(intent, getTopActivityOrApp(), bundle);
    }

    public static boolean startActivity(@NonNull Intent intent, @AnimRes int i8, @AnimRes int i9) {
        Context topActivityOrApp = getTopActivityOrApp();
        return startActivity(intent, topActivityOrApp, getOptionsBundle(topActivityOrApp, i8, i9));
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i8) {
        startActivityForResult(intent, fragment, i8, (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i8, @Nullable Bundle bundle) {
        startActivityForResult(intent, fragment, i8, bundle);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent) {
        startActivity(intent, activity, (Bundle) null);
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i8, View... viewArr) {
        startActivityForResult(intent, fragment, i8, getOptionsBundle(fragment, viewArr));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, @Nullable Bundle bundle) {
        startActivity(intent, activity, bundle);
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, View... viewArr) {
        startActivity(intent, activity, getOptionsBundle(activity, viewArr));
    }

    public static void startActivityForResult(@NonNull Fragment fragment, @NonNull Intent intent, int i8, @AnimRes int i9, @AnimRes int i10) {
        startActivityForResult(intent, fragment, i8, getOptionsBundle(fragment, i9, i10));
    }

    public static void startActivity(@NonNull Activity activity, @NonNull Intent intent, @AnimRes int i8, @AnimRes int i9) {
        startActivity(intent, activity, getOptionsBundle(activity, i8, i9));
    }

    private static void startActivity(Context context, Bundle bundle, String str, String str2, @Nullable Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        startActivity(intent, context, bundle2);
    }

    private static boolean startActivityForResult(Activity activity, Bundle bundle, String str, String str2, int i8, @Nullable Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return startActivityForResult(intent, activity, i8, bundle2);
    }

    private static boolean startActivity(Intent intent, Context context, Bundle bundle) {
        if (!isIntentAvailable(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        if (bundle != null) {
            context.startActivity(intent, bundle);
            return true;
        }
        context.startActivity(intent);
        return true;
    }

    private static boolean startActivityForResult(Intent intent, Activity activity, int i8, @Nullable Bundle bundle) {
        if (!isIntentAvailable(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (bundle != null) {
            activity.startActivityForResult(intent, i8, bundle);
            return true;
        }
        activity.startActivityForResult(intent, i8);
        return true;
    }

    private static boolean startActivityForResult(Fragment fragment, Bundle bundle, String str, String str2, int i8, @Nullable Bundle bundle2) {
        Intent intent = new Intent();
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.setComponent(new ComponentName(str, str2));
        return startActivityForResult(intent, fragment, i8, bundle2);
    }

    private static boolean startActivityForResult(Intent intent, Fragment fragment, int i8, @Nullable Bundle bundle) {
        if (!isIntentAvailable(intent)) {
            Log.e("ActivityUtils", "intent is unavailable");
            return false;
        }
        if (fragment.getActivity() != null) {
            if (bundle != null) {
                fragment.startActivityForResult(intent, i8, bundle);
                return true;
            }
            fragment.startActivityForResult(intent, i8);
            return true;
        }
        Log.e("ActivityUtils", "Fragment " + fragment + " not attached to Activity");
        return false;
    }
}
