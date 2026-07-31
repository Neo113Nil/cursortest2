package com.ironsource.environment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import com.ironsource.C1486j;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes2.dex */
public class ContextProvider {

    /* renamed from: d, reason: collision with root package name */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile ContextProvider f16079d;

    /* renamed from: a, reason: collision with root package name */
    private Activity f16080a;

    /* renamed from: b, reason: collision with root package name */
    private Context f16081b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentHashMap<String, a> f16082c = new ConcurrentHashMap<>();

    public interface a {
        void onPause(Activity activity);

        void onResume(Activity activity);
    }

    private ContextProvider() {
    }

    public static ContextProvider getInstance() {
        if (f16079d == null) {
            synchronized (ContextProvider.class) {
                try {
                    if (f16079d == null) {
                        f16079d = new ContextProvider();
                    }
                } finally {
                }
            }
        }
        return f16079d;
    }

    public Context getApplicationContext() {
        Activity activity;
        Context context = this.f16081b;
        return (context != null || (activity = this.f16080a) == null) ? context : activity.getApplicationContext();
    }

    public Activity getCurrentActiveActivity() {
        Activity activity = this.f16080a;
        return activity != null ? activity : C1486j.f16777a.b();
    }

    public void onPause(Activity activity) {
        if (activity != null) {
            Iterator<a> it = this.f16082c.values().iterator();
            while (it.hasNext()) {
                it.next().onPause(activity);
            }
        }
    }

    public void onResume(Activity activity) {
        if (activity != null) {
            this.f16080a = activity;
            Iterator<a> it = this.f16082c.values().iterator();
            while (it.hasNext()) {
                it.next().onResume(this.f16080a);
            }
        }
    }

    public void registerLifeCycleListener(a aVar) {
        this.f16082c.put(aVar.getClass().getSimpleName(), aVar);
    }

    public void updateActivity(Activity activity) {
        if (activity != null) {
            this.f16080a = activity;
        }
    }

    public void updateAppContext(Context context) {
        if (context != null) {
            this.f16081b = context;
        }
    }
}
