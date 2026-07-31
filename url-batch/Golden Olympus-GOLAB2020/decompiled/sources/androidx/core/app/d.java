package androidx.core.app;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* loaded from: classes.dex */
abstract class d {

    /* renamed from: a, reason: collision with root package name */
    protected static final Class f11606a;

    /* renamed from: b, reason: collision with root package name */
    protected static final Field f11607b;

    /* renamed from: c, reason: collision with root package name */
    protected static final Field f11608c;

    /* renamed from: d, reason: collision with root package name */
    protected static final Method f11609d;

    /* renamed from: e, reason: collision with root package name */
    protected static final Method f11610e;

    /* renamed from: f, reason: collision with root package name */
    protected static final Method f11611f;

    /* renamed from: g, reason: collision with root package name */
    private static final Handler f11612g = new Handler(Looper.getMainLooper());

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ C0089d f11613b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f11614c;

        a(C0089d c0089d, Object obj) {
            this.f11613b = c0089d;
            this.f11614c = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11613b.f11619a = this.f11614c;
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Application f11615b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ C0089d f11616c;

        b(Application application, C0089d c0089d) {
            this.f11615b = application;
            this.f11616c = c0089d;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11615b.unregisterActivityLifecycleCallbacks(this.f11616c);
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f11617b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f11618c;

        c(Object obj, Object obj2) {
            this.f11617b = obj;
            this.f11618c = obj2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Method method = d.f11609d;
                if (method != null) {
                    method.invoke(this.f11617b, this.f11618c, Boolean.FALSE, "AppCompat recreation");
                } else {
                    d.f11610e.invoke(this.f11617b, this.f11618c, Boolean.FALSE);
                }
            } catch (RuntimeException e4) {
                if (e4.getClass() == RuntimeException.class && e4.getMessage() != null && e4.getMessage().startsWith("Unable to stop")) {
                    throw e4;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
            }
        }
    }

    /* renamed from: androidx.core.app.d$d, reason: collision with other inner class name */
    private static final class C0089d implements Application.ActivityLifecycleCallbacks {

        /* renamed from: a, reason: collision with root package name */
        Object f11619a;

        /* renamed from: b, reason: collision with root package name */
        private Activity f11620b;

        /* renamed from: c, reason: collision with root package name */
        private final int f11621c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f11622d = false;

        /* renamed from: e, reason: collision with root package name */
        private boolean f11623e = false;

        /* renamed from: f, reason: collision with root package name */
        private boolean f11624f = false;

        C0089d(Activity activity) {
            this.f11620b = activity;
            this.f11621c = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            if (this.f11620b == activity) {
                this.f11620b = null;
                this.f11623e = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            if (!this.f11623e || this.f11624f || this.f11622d || !d.h(this.f11619a, this.f11621c, activity)) {
                return;
            }
            this.f11624f = true;
            this.f11619a = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.f11620b == activity) {
                this.f11622d = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class a4 = a();
        f11606a = a4;
        f11607b = b();
        f11608c = f();
        f11609d = d(a4);
        f11610e = c(a4);
        f11611f = e(a4);
    }

    private static Class a() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method d(Class cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method e(Class cls) {
        if (g() && cls != null) {
            try {
                Class cls2 = Integer.TYPE;
                Class cls3 = Boolean.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, cls2, cls3, Configuration.class, Configuration.class, cls3, cls3);
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Field f() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean g() {
        int i4 = Build.VERSION.SDK_INT;
        return i4 == 26 || i4 == 27;
    }

    protected static boolean h(Object obj, int i4, Activity activity) {
        try {
            Object obj2 = f11608c.get(activity);
            if (obj2 == obj && activity.hashCode() == i4) {
                f11612g.postAtFrontOfQueue(new c(f11607b.get(activity), obj2));
                return true;
            }
            return false;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    static boolean i(Activity activity) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        }
        if (g() && f11611f == null) {
            return false;
        }
        if (f11610e == null && f11609d == null) {
            return false;
        }
        try {
            Object obj2 = f11608c.get(activity);
            if (obj2 == null || (obj = f11607b.get(activity)) == null) {
                return false;
            }
            Application application = activity.getApplication();
            C0089d c0089d = new C0089d(activity);
            application.registerActivityLifecycleCallbacks(c0089d);
            Handler handler = f11612g;
            handler.post(new a(c0089d, obj2));
            try {
                if (g()) {
                    Method method = f11611f;
                    Boolean bool = Boolean.FALSE;
                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                } else {
                    activity.recreate();
                }
                handler.post(new b(application, c0089d));
                return true;
            } catch (Throwable th) {
                f11612g.post(new b(application, c0089d));
                throw th;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
