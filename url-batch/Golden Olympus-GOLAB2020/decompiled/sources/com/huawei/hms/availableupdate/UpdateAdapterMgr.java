package com.huawei.hms.availableupdate;

import android.app.Activity;
import com.huawei.hms.support.log.HMSLog;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class UpdateAdapterMgr {
    public static final UpdateAdapterMgr INST = new UpdateAdapterMgr();

    /* renamed from: a, reason: collision with root package name */
    private WeakReference f13966a;

    private Activity a() {
        Activity activity;
        WeakReference weakReference = this.f13966a;
        if (weakReference == null || (activity = (Activity) weakReference.get()) == null || activity.isFinishing()) {
            return null;
        }
        return activity;
    }

    public boolean needStartUpdateActivity() {
        Activity a4 = a();
        if (a4 == null) {
            return true;
        }
        if (a4.isTaskRoot()) {
            return false;
        }
        a4.finish();
        HMSLog.i("UpdateAdapterMgr", " finish old activity.");
        return true;
    }

    public void onActivityCreate(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityCreate");
        Activity a4 = a();
        if (a4 != null) {
            a4.finish();
            HMSLog.i("UpdateAdapterMgr", "finish old activity.");
        }
        this.f13966a = new WeakReference(activity);
    }

    public void onActivityDestroy(Activity activity) {
        HMSLog.i("UpdateAdapterMgr", "onActivityDestroy");
        Activity a4 = a();
        if (activity == null || !activity.equals(a4)) {
            return;
        }
        HMSLog.i("UpdateAdapterMgr", "reset");
        this.f13966a = null;
    }
}
