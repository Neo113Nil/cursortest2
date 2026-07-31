package com.huawei.hms.api;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class BindingFailedResolveMgr {

    /* renamed from: b, reason: collision with root package name */
    static final BindingFailedResolveMgr f13913b = new BindingFailedResolveMgr();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13914c = new Object();

    /* renamed from: a, reason: collision with root package name */
    List<Activity> f13915a = new ArrayList(1);

    BindingFailedResolveMgr() {
    }

    void a(Activity activity) {
        synchronized (f13914c) {
            try {
                for (Activity activity2 : this.f13915a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f13915a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void b(Activity activity) {
        synchronized (f13914c) {
            this.f13915a.remove(activity);
        }
    }
}
