package com.blankj.utilcode.util;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle;
import com.blankj.utilcode.util.ThreadUtils;

/* loaded from: classes2.dex */
public final class z0 {

    @SuppressLint({"StaticFieldLeak"})
    private static Application sApp;

    public static class a {
        public void onActivityCreated(@NonNull Activity activity) {
        }

        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        public void onActivityPaused(@NonNull Activity activity) {
        }

        public void onActivityResumed(@NonNull Activity activity) {
        }

        public void onActivityStarted(@NonNull Activity activity) {
        }

        public void onActivityStopped(@NonNull Activity activity) {
        }

        public void onLifecycleChanged(@NonNull Activity activity, Lifecycle.Event event) {
        }
    }

    public interface b {
        void accept(Object obj);
    }

    public interface c {
    }

    public static abstract class d extends ThreadUtils.d {
        private b mConsumer;

        public d(b bVar) {
            this.mConsumer = bVar;
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.e
        public void onSuccess(Object obj) {
            b bVar = this.mConsumer;
            if (bVar != null) {
                bVar.accept(obj);
            }
        }
    }

    private z0() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static Application getApp() {
        Application application = sApp;
        if (application != null) {
            return application;
        }
        init(c1.getApplicationByReflect());
        if (sApp == null) {
            throw new NullPointerException("reflect failed.");
        }
        Log.i("Utils", c1.getCurrentProcessName() + " reflect app success.");
        return sApp;
    }

    public static void init(Application application) {
        if (application == null) {
            Log.e("Utils", "app is null.");
            return;
        }
        Application application2 = sApp;
        if (application2 == null) {
            sApp = application;
            c1.init(application);
            c1.preLoad();
        } else {
            if (application2.equals(application)) {
                return;
            }
            c1.unInit(sApp);
            sApp = application;
            c1.init(application);
        }
    }
}
