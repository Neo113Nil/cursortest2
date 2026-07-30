package com.moyoung.dafit.module.common.baseui;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class a implements Application.ActivityLifecycleCallbacks {
    private int activityCount = 0;
    private final List<String> classNameList = new ArrayList();
    private Activity currentActivity;

    /* renamed from: com.moyoung.dafit.module.common.baseui.a$a, reason: collision with other inner class name */
    private static class C0299a {
        private static final a INSTANCE = new a();
        private static final long APP_START_TIME = System.currentTimeMillis();

        private C0299a() {
        }
    }

    public static a getInstance() {
        return C0299a.INSTANCE;
    }

    private void handleFindPhone() {
        org.greenrobot.eventbus.c.getDefault().post(new q());
    }

    public int getActivityCount() {
        return this.activityCount;
    }

    public List<String> getClassNameList() {
        return this.classNameList;
    }

    public Activity getCurrentActivity() {
        return this.currentActivity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        this.classNameList.add(activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(@NonNull Activity activity) {
        com.orhanobut.logger.f.d("onActivityDestroyed: " + this.activityCount);
        if (this.activityCount == 0) {
            com.moyoung.dafit.module.common.utils.e.saveUseTime(System.currentTimeMillis() - C0299a.APP_START_TIME);
        }
        this.classNameList.remove(activity.getClass().getName());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(@NonNull Activity activity) {
        this.currentActivity = activity;
        handleFindPhone();
        this.activityCount++;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(@NonNull Activity activity) {
        this.activityCount--;
    }
}
