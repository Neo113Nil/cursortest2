package com.moat.analytics.mobile.cha;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.moat.analytics.mobile.cha.t;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
final class c {

    /* renamed from: ˊ, reason: contains not printable characters */
    private static boolean f865;

    /* renamed from: ˋ, reason: contains not printable characters */
    private static Application f866;

    /* renamed from: ˎ, reason: contains not printable characters */
    private static boolean f867;

    /* renamed from: ˏ, reason: contains not printable characters */
    static WeakReference<Activity> f868;

    /* renamed from: ॱ, reason: contains not printable characters */
    private static int f869;

    c() {
    }

    /* renamed from: ॱ, reason: contains not printable characters */
    static void m1017(Application application) {
        f866 = application;
        if (f867) {
            return;
        }
        f867 = true;
        f866.registerActivityLifecycleCallbacks(new a());
    }

    /* renamed from: ˏ, reason: contains not printable characters */
    static Application m1015() {
        return f866;
    }

    static class a implements Application.ActivityLifecycleCallbacks {
        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        a() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            int unused = c.f869 = 1;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            try {
                c.f868 = new WeakReference<>(activity);
                int unused = c.f869 = 2;
                if (!c.f865) {
                    m1019(true);
                }
                boolean unused2 = c.f865 = true;
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", this, "Activity started: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            try {
                c.f868 = new WeakReference<>(activity);
                int unused = c.f869 = 3;
                t.m1144().m1150();
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", this, "Activity resumed: " + activity.getClass() + "@" + activity.hashCode());
                if (((f) MoatAnalytics.getInstance()).f889) {
                    e.m1029(activity);
                }
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            try {
                int unused = c.f869 = 4;
                if (c.m1013(activity)) {
                    c.f868 = new WeakReference<>(null);
                }
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", this, "Activity paused: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            try {
                if (c.f869 != 3) {
                    boolean unused = c.f865 = false;
                    m1019(false);
                }
                int unused2 = c.f869 = 5;
                if (c.m1013(activity)) {
                    c.f868 = new WeakReference<>(null);
                }
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", this, "Activity stopped: " + activity.getClass() + "@" + activity.hashCode());
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            try {
                if (c.f869 != 3 && c.f869 != 5) {
                    if (c.f865) {
                        m1019(false);
                    }
                    boolean unused = c.f865 = false;
                }
                int unused2 = c.f869 = 6;
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", this, "Activity destroyed: " + activity.getClass() + "@" + activity.hashCode());
                if (c.m1013(activity)) {
                    c.f868 = new WeakReference<>(null);
                }
            } catch (Exception e) {
                o.m1110(e);
            }
        }

        /* renamed from: ॱ, reason: contains not printable characters */
        private static void m1019(boolean z) {
            if (z) {
                com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", null, "App became visible");
                if (t.m1144().f1011 != t.a.f1022 || ((f) MoatAnalytics.getInstance()).f887) {
                    return;
                }
                n.m1096().m1106();
                return;
            }
            com.moat.analytics.mobile.cha.a.m994(3, "ActivityState", null, "App became invisible");
            if (t.m1144().f1011 != t.a.f1022 || ((f) MoatAnalytics.getInstance()).f887) {
                return;
            }
            n.m1096().m1107();
        }
    }

    /* renamed from: ˊ, reason: contains not printable characters */
    static /* synthetic */ boolean m1013(Activity activity) {
        return f868 != null && f868.get() == activity;
    }
}
