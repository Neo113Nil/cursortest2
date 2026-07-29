package com.moat.analytics.mobile.vng;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.moat.analytics.mobile.vng.w;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
class a {

    /* renamed from: a, reason: collision with root package name */
    static WeakReference<Activity> f7328a;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f7329b;

    /* renamed from: c, reason: collision with root package name */
    private static Application f7330c;

    /* renamed from: d, reason: collision with root package name */
    private static int f7331d;
    private static boolean e;

    /* renamed from: com.moat.analytics.mobile.vng.a$a, reason: collision with other inner class name */
    private static class C0379a implements Application.ActivityLifecycleCallbacks {
        C0379a() {
        }

        private static void a(boolean z) {
            if (z) {
                p.a(3, "ActivityState", (Object) null, "App became visible");
                if (w.a().f7405a != w.d.ON || ((k) MoatAnalytics.getInstance()).f7379c) {
                    return;
                }
                o.a().c();
                return;
            }
            p.a(3, "ActivityState", (Object) null, "App became invisible");
            if (w.a().f7405a != w.d.ON || ((k) MoatAnalytics.getInstance()).f7379c) {
                return;
            }
            o.a().d();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            int unused = a.f7331d = 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            try {
                if (a.f7331d != 3 && a.f7331d != 5) {
                    if (a.e) {
                        a(false);
                    }
                    boolean unused = a.e = false;
                }
                int unused2 = a.f7331d = 6;
                p.a(3, "ActivityState", this, "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
                if (a.b(activity)) {
                    a.f7328a = new WeakReference<>(null);
                }
            } catch (Exception e) {
                m.a(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            try {
                int unused = a.f7331d = 4;
                if (a.b(activity)) {
                    a.f7328a = new WeakReference<>(null);
                }
                p.a(3, "ActivityState", this, "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                m.a(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            try {
                a.f7328a = new WeakReference<>(activity);
                int unused = a.f7331d = 3;
                w.a().b();
                p.a(3, "ActivityState", this, "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
                if (((k) MoatAnalytics.getInstance()).f7378b) {
                    f.a(activity);
                }
            } catch (Exception e) {
                m.a(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            try {
                a.f7328a = new WeakReference<>(activity);
                int unused = a.f7331d = 2;
                if (!a.e) {
                    a(true);
                }
                boolean unused2 = a.e = true;
                p.a(3, "ActivityState", this, "Activity started: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                m.a(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            try {
                if (a.f7331d != 3) {
                    boolean unused = a.e = false;
                    a(false);
                }
                int unused2 = a.f7331d = 5;
                if (a.b(activity)) {
                    a.f7328a = new WeakReference<>(null);
                }
                p.a(3, "ActivityState", this, "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                m.a(e);
            }
        }
    }

    a() {
    }

    static Application a() {
        return f7330c;
    }

    static void a(Application application) {
        f7330c = application;
        if (f7329b) {
            return;
        }
        f7329b = true;
        f7330c.registerActivityLifecycleCallbacks(new C0379a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Activity activity) {
        return f7328a != null && f7328a.get() == activity;
    }
}
