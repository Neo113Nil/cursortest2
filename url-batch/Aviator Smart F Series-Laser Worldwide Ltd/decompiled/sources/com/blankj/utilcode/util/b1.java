package com.blankj.utilcode.util;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.z0;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
final class b1 implements Application.ActivityLifecycleCallbacks {
    static final b1 INSTANCE = new b1();
    private static final Activity STUB = new Activity();
    private final LinkedList<Activity> mActivityList = new LinkedList<>();
    private final List<z0.c> mStatusListeners = new CopyOnWriteArrayList();
    private final Map<Activity, List<z0.a>> mActivityLifecycleCallbacksMap = new ConcurrentHashMap();
    private int mForegroundCount = 0;
    private int mConfigCount = 0;
    private boolean mIsBackground = false;

    class a implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ z0.a val$listener;

        a(Activity activity, z0.a aVar) {
            this.val$activity = activity;
            this.val$listener = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.this.addActivityLifecycleCallbacksInner(this.val$activity, this.val$listener);
        }
    }

    class b implements Runnable {
        final /* synthetic */ Activity val$activity;

        b(Activity activity) {
            this.val$activity = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.this.mActivityLifecycleCallbacksMap.remove(this.val$activity);
        }
    }

    class c implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ z0.a val$callbacks;

        c(Activity activity, z0.a aVar) {
            this.val$activity = activity;
            this.val$callbacks = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            b1.this.removeActivityLifecycleCallbacksInner(this.val$activity, this.val$callbacks);
        }
    }

    class d implements Runnable {
        final /* synthetic */ Activity val$activity;
        final /* synthetic */ Object val$tag;

        d(Activity activity, Object obj) {
            this.val$activity = activity;
            this.val$tag = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Window window = this.val$activity.getWindow();
                if (window != null) {
                    window.setSoftInputMode(((Integer) this.val$tag).intValue());
                }
            } catch (Exception unused) {
            }
        }
    }

    b1() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addActivityLifecycleCallbacksInner(Activity activity, z0.a aVar) {
        List<z0.a> list = this.mActivityLifecycleCallbacksMap.get(activity);
        if (list == null) {
            list = new CopyOnWriteArrayList<>();
            this.mActivityLifecycleCallbacksMap.put(activity, list);
        } else if (list.contains(aVar)) {
            return;
        }
        list.add(aVar);
    }

    private void consumeActivityLifecycleCallbacks(Activity activity, Lifecycle.Event event) {
        consumeLifecycle(activity, event, this.mActivityLifecycleCallbacksMap.get(activity));
        consumeLifecycle(activity, event, this.mActivityLifecycleCallbacksMap.get(STUB));
    }

    private void consumeLifecycle(Activity activity, Lifecycle.Event event, List<z0.a> list) {
        if (list == null) {
            return;
        }
        for (z0.a aVar : list) {
            aVar.onLifecycleChanged(activity, event);
            if (event.equals(Lifecycle.Event.ON_CREATE)) {
                aVar.onActivityCreated(activity);
            } else if (event.equals(Lifecycle.Event.ON_START)) {
                aVar.onActivityStarted(activity);
            } else if (event.equals(Lifecycle.Event.ON_RESUME)) {
                aVar.onActivityResumed(activity);
            } else if (event.equals(Lifecycle.Event.ON_PAUSE)) {
                aVar.onActivityPaused(activity);
            } else if (event.equals(Lifecycle.Event.ON_STOP)) {
                aVar.onActivityStopped(activity);
            } else if (event.equals(Lifecycle.Event.ON_DESTROY)) {
                aVar.onActivityDestroyed(activity);
            }
        }
        if (event.equals(Lifecycle.Event.ON_DESTROY)) {
            this.mActivityLifecycleCallbacksMap.remove(activity);
        }
    }

    private List<Activity> getActivitiesByReflect() {
        Object activityThread;
        LinkedList linkedList = new LinkedList();
        Activity activity = null;
        try {
            activityThread = getActivityThread();
        } catch (Exception e8) {
            Log.e("UtilsActivityLifecycle", "getActivitiesByReflect: " + e8.getMessage());
        }
        if (activityThread == null) {
            return linkedList;
        }
        Field declaredField = activityThread.getClass().getDeclaredField("mActivities");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(activityThread);
        if (!(obj instanceof Map)) {
            return linkedList;
        }
        for (Object obj2 : ((Map) obj).values()) {
            Class<?> cls = obj2.getClass();
            Field declaredField2 = cls.getDeclaredField("activity");
            declaredField2.setAccessible(true);
            Activity activity2 = (Activity) declaredField2.get(obj2);
            if (activity == null) {
                Field declaredField3 = cls.getDeclaredField("paused");
                declaredField3.setAccessible(true);
                if (declaredField3.getBoolean(obj2)) {
                    linkedList.addFirst(activity2);
                } else {
                    activity = activity2;
                }
            } else {
                linkedList.addFirst(activity2);
            }
        }
        if (activity != null) {
            linkedList.addFirst(activity);
        }
        return linkedList;
    }

    private Object getActivityThread() {
        Object activityThreadInActivityThreadStaticField = getActivityThreadInActivityThreadStaticField();
        return activityThreadInActivityThreadStaticField != null ? activityThreadInActivityThreadStaticField : getActivityThreadInActivityThreadStaticMethod();
    }

    private Object getActivityThreadInActivityThreadStaticField() {
        try {
            Field declaredField = Class.forName("android.app.ActivityThread").getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Exception e8) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticField: " + e8.getMessage());
            return null;
        }
    }

    private Object getActivityThreadInActivityThreadStaticMethod() {
        try {
            return Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e8) {
            Log.e("UtilsActivityLifecycle", "getActivityThreadInActivityThreadStaticMethod: " + e8.getMessage());
            return null;
        }
    }

    private void postStatus(Activity activity, boolean z7) {
        if (this.mStatusListeners.isEmpty()) {
            return;
        }
        Iterator<z0.c> it = this.mStatusListeners.iterator();
        if (it.hasNext()) {
            cn.hutool.core.convert.impl.s.a(it.next());
            if (!z7) {
                throw null;
            }
            throw null;
        }
    }

    private void processHideSoftInputOnActivityDestroy(Activity activity, boolean z7) {
        try {
            if (z7) {
                Window window = activity.getWindow();
                window.getDecorView().setTag(-123, Integer.valueOf(window.getAttributes().softInputMode));
                window.setSoftInputMode(3);
            } else {
                Object tag = activity.getWindow().getDecorView().getTag(-123);
                if (!(tag instanceof Integer)) {
                } else {
                    c1.runOnUiThreadDelayed(new d(activity, tag), 100L);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeActivityLifecycleCallbacksInner(Activity activity, z0.a aVar) {
        List<z0.a> list = this.mActivityLifecycleCallbacksMap.get(activity);
        if (list == null || list.isEmpty()) {
            return;
        }
        list.remove(aVar);
    }

    private static void setAnimatorsEnabled() {
        boolean areAnimatorsEnabled;
        if (Build.VERSION.SDK_INT >= 26) {
            areAnimatorsEnabled = ValueAnimator.areAnimatorsEnabled();
            if (areAnimatorsEnabled) {
                return;
            }
        }
        try {
            Field declaredField = ValueAnimator.class.getDeclaredField("sDurationScale");
            declaredField.setAccessible(true);
            if (((Float) declaredField.get(null)).floatValue() == 0.0f) {
                declaredField.set(null, Float.valueOf(1.0f));
                Log.i("UtilsActivityLifecycle", "setAnimatorsEnabled: Animators are enabled now!");
            }
        } catch (IllegalAccessException e8) {
            e8.printStackTrace();
        } catch (NoSuchFieldException e9) {
            e9.printStackTrace();
        }
    }

    private void setTopActivity(Activity activity) {
        if (!this.mActivityList.contains(activity)) {
            this.mActivityList.addFirst(activity);
        } else {
            if (this.mActivityList.getFirst().equals(activity)) {
                return;
            }
            this.mActivityList.remove(activity);
            this.mActivityList.addFirst(activity);
        }
    }

    void addActivityLifecycleCallbacks(z0.a aVar) {
        addActivityLifecycleCallbacks(STUB, aVar);
    }

    void addOnAppStatusChangedListener(z0.c cVar) {
        this.mStatusListeners.add(cVar);
    }

    List<Activity> getActivityList() {
        if (!this.mActivityList.isEmpty()) {
            return new LinkedList(this.mActivityList);
        }
        this.mActivityList.addAll(getActivitiesByReflect());
        return new LinkedList(this.mActivityList);
    }

    Application getApplicationByReflect() {
        Object invoke;
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Object activityThread = getActivityThread();
            if (activityThread == null || (invoke = cls.getMethod("getApplication", new Class[0]).invoke(activityThread, new Object[0])) == null) {
                return null;
            }
            return (Application) invoke;
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    Activity getTopActivity() {
        for (Activity activity : getActivityList()) {
            if (c1.isActivityAlive(activity)) {
                return activity;
            }
        }
        return null;
    }

    void init(Application application) {
        application.registerActivityLifecycleCallbacks(this);
    }

    boolean isAppForeground() {
        return !this.mIsBackground;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        if (this.mActivityList.size() == 0) {
            postStatus(activity, true);
        }
        q.applyLanguage(activity);
        setAnimatorsEnabled();
        setTopActivity(activity);
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        this.mActivityList.remove(activity);
        c1.fixSoftInputLeaks(activity);
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostSaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStopped(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreSaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
        setTopActivity(activity);
        if (this.mIsBackground) {
            this.mIsBackground = false;
            postStatus(activity, true);
        }
        processHideSoftInputOnActivityDestroy(activity, false);
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        if (!this.mIsBackground) {
            setTopActivity(activity);
        }
        int i8 = this.mConfigCount;
        if (i8 < 0) {
            this.mConfigCount = i8 + 1;
        } else {
            this.mForegroundCount++;
        }
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        if (activity.isChangingConfigurations()) {
            this.mConfigCount--;
        } else {
            int i8 = this.mForegroundCount - 1;
            this.mForegroundCount = i8;
            if (i8 <= 0) {
                this.mIsBackground = true;
                postStatus(activity, false);
            }
        }
        processHideSoftInputOnActivityDestroy(activity, true);
        consumeActivityLifecycleCallbacks(activity, Lifecycle.Event.ON_STOP);
    }

    void removeActivityLifecycleCallbacks(z0.a aVar) {
        removeActivityLifecycleCallbacks(STUB, aVar);
    }

    void removeOnAppStatusChangedListener(z0.c cVar) {
        this.mStatusListeners.remove(cVar);
    }

    void unInit(Application application) {
        this.mActivityList.clear();
        application.unregisterActivityLifecycleCallbacks(this);
    }

    void addActivityLifecycleCallbacks(Activity activity, z0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        c1.runOnUiThread(new a(activity, aVar));
    }

    void removeActivityLifecycleCallbacks(Activity activity) {
        if (activity == null) {
            return;
        }
        c1.runOnUiThread(new b(activity));
    }

    void removeActivityLifecycleCallbacks(Activity activity, z0.a aVar) {
        if (activity == null || aVar == null) {
            return;
        }
        c1.runOnUiThread(new c(activity, aVar));
    }
}
