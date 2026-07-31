package com.huawei.hms.availableupdate;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    public static final b f13971b = new b();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f13972c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final List f13973a = new ArrayList(1);

    public void a(Activity activity) {
        synchronized (f13972c) {
            try {
                for (Activity activity2 : this.f13973a) {
                    if (activity2 != null && activity2 != activity && !activity2.isFinishing()) {
                        activity2.finish();
                    }
                }
                this.f13973a.add(activity);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void b(Activity activity) {
        synchronized (f13972c) {
            this.f13973a.remove(activity);
        }
    }
}
