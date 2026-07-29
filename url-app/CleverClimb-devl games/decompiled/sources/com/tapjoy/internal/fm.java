package com.tapjoy.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.tapjoy.TapjoyLog;
import com.tapjoy.TapjoyUtil;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

/* loaded from: classes2.dex */
public final class fm {

    /* renamed from: a, reason: collision with root package name */
    private static final fm f8099a = new fm();

    /* renamed from: b, reason: collision with root package name */
    private Application f8100b;

    /* renamed from: c, reason: collision with root package name */
    private Application.ActivityLifecycleCallbacks f8101c;

    /* renamed from: d, reason: collision with root package name */
    private final HashSet f8102d = new HashSet();

    public static void a(Context context) {
        if (Build.VERSION.SDK_INT >= 14 && context != null) {
            fm fmVar = f8099a;
            Context applicationContext = context.getApplicationContext();
            if (fmVar.f8100b == null) {
                try {
                    if (applicationContext instanceof Application) {
                        fmVar.f8100b = (Application) applicationContext;
                    } else {
                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                        TapjoyUtil.runOnMainThread(new Runnable() { // from class: com.tapjoy.internal.fm.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                try {
                                    try {
                                        fm.this.f8100b = fm.b();
                                    } catch (Exception e) {
                                        TapjoyLog.w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                                    }
                                } finally {
                                    countDownLatch.countDown();
                                }
                            }
                        });
                        countDownLatch.await();
                    }
                } catch (Exception e) {
                    TapjoyLog.w("Tapjoy.ActivityTracker", Log.getStackTraceString(e));
                }
                if (fmVar.f8100b == null) {
                    return;
                }
            }
            synchronized (fmVar) {
                if (fmVar.f8101c == null) {
                    Activity c2 = b.c();
                    if (c2 != null) {
                        fmVar.f8102d.add(b(c2));
                    }
                    final HashSet hashSet = fmVar.f8102d;
                    fmVar.f8101c = new Application.ActivityLifecycleCallbacks() { // from class: com.tapjoy.internal.fm.2
                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityCreated(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityDestroyed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityPaused(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityResumed(Activity activity) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStarted(Activity activity) {
                            hashSet.add(fm.b(activity));
                            if (hashSet.size() == 1) {
                                go.a();
                            }
                            b.a(activity);
                        }

                        @Override // android.app.Application.ActivityLifecycleCallbacks
                        public final void onActivityStopped(Activity activity) {
                            hashSet.remove(fm.b(activity));
                            if (hashSet.size() <= 0) {
                                go.b();
                            }
                        }
                    };
                    fmVar.f8100b.registerActivityLifecycleCallbacks(fmVar.f8101c);
                    go.a();
                }
            }
        }
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 14) {
            return;
        }
        fm fmVar = f8099a;
        if (fmVar.f8100b != null) {
            synchronized (fmVar) {
                if (fmVar.f8101c != null) {
                    fmVar.f8100b.unregisterActivityLifecycleCallbacks(fmVar.f8101c);
                    fmVar.f8101c = null;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(Activity activity) {
        return activity.getClass().getName() + "@" + System.identityHashCode(activity);
    }

    static /* synthetic */ Application b() {
        return (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null);
    }
}
