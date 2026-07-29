package com.moat.analytics.mobile.iro;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.moat.analytics.mobile.iro.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class a {

    /* renamed from: ˊ, reason: contains not printable characters */
    static WeakReference<Activity> f1067;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static boolean f1068;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean f1069;

    /* renamed from: ˏ, reason: contains not printable characters */
    private static Application f1070;

    /* renamed from: ॱ, reason: contains not printable characters */
    private static int f1071;

    a() {
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static void m1171(Application application) {
        f1070 = application;
        if (f1068) {
            return;
        }
        f1068 = true;
        f1070.registerActivityLifecycleCallbacks(new c());
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static Application m1173() {
        return f1070;
    }

    static class c implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        c() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            int unused = a.f1071 = 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                a.f1067 = new WeakReference<>(activity);
                int unused = a.f1071 = 2;
                if (!a.f1069) {
                    m1177(true);
                }
                boolean unused2 = a.f1069 = true;
                b.m1182(3, "ActivityState", this, "Activity started: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                a.f1067 = new WeakReference<>(activity);
                int unused = a.f1071 = 3;
                t.m1319().m1328();
                b.m1182(3, "ActivityState", this, "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
                if (((j) MoatAnalytics.getInstance()).f1169) {
                    e.m1208(activity);
                }
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            try {
                int unused = a.f1071 = 4;
                if (a.m1174(activity)) {
                    a.f1067 = new WeakReference<>(null);
                }
                b.m1182(3, "ActivityState", this, "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            try {
                if (a.f1071 != 3) {
                    boolean unused = a.f1069 = false;
                    m1177(false);
                }
                int unused2 = a.f1071 = 5;
                if (a.m1174(activity)) {
                    a.f1067 = new WeakReference<>(null);
                }
                b.m1182(3, "ActivityState", this, "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                if (a.f1071 != 3 && a.f1071 != 5) {
                    if (a.f1069) {
                        m1177(false);
                    }
                    boolean unused = a.f1069 = false;
                }
                int unused2 = a.f1071 = 6;
                b.m1182(3, "ActivityState", this, "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
                if (a.m1174(activity)) {
                    a.f1067 = new WeakReference<>(null);
                }
            } catch (Exception e) {
                o.m1290(e);
            }
        }

        /* renamed from: ˋ, reason: contains not printable characters */
        private static void m1177(boolean z) {
            if (z) {
                b.m1182(3, "ActivityState", null, "App became visible");
                if (t.m1319().f1230 != t.c.f1247 || ((j) MoatAnalytics.getInstance()).f1170) {
                    return;
                }
                k.m1275().m1283();
                return;
            }
            b.m1182(3, "ActivityState", null, "App became invisible");
            if (t.m1319().f1230 != t.c.f1247 || ((j) MoatAnalytics.getInstance()).f1170) {
                return;
            }
            k.m1275().m1282();
        }
    }

    /* renamed from: ˎ, reason: contains not printable characters */
    static /* synthetic */ boolean m1174(Activity activity) {
        return f1067 != null && f1067.get() == activity;
    }
}
