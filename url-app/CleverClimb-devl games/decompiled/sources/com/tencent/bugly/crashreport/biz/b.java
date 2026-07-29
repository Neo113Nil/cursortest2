package com.tencent.bugly.crashreport.biz;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.os.EnvironmentCompat;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.biz.a.AnonymousClass2;
import com.tencent.bugly.crashreport.biz.a.RunnableC0391a;
import com.tencent.bugly.crashreport.biz.a.c;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.List;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public static a f8588a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f8589b = false;

    /* renamed from: c, reason: collision with root package name */
    private static int f8590c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static long f8591d = 300000;
    private static long e = 30000;
    private static long f = 0;
    private static int g = 0;
    private static long h = 0;
    private static long i = 0;
    private static long j = 0;
    private static Application.ActivityLifecycleCallbacks k = null;
    private static Class<?> l = null;
    private static boolean m = true;

    static /* synthetic */ String a(String str, String str2) {
        return z.a() + "  " + str + "  " + str2 + "\n";
    }

    static /* synthetic */ int g() {
        int i2 = g;
        g = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Context context, BuglyStrategy buglyStrategy) {
        boolean z;
        boolean z2;
        boolean z3;
        if (buglyStrategy != null) {
            z2 = buglyStrategy.recordUserInfoOnceADay();
            z = buglyStrategy.isEnableUserInfo();
        } else {
            z = true;
            z2 = false;
        }
        if (z2) {
            com.tencent.bugly.crashreport.common.info.a a2 = com.tencent.bugly.crashreport.common.info.a.a(context);
            List<UserInfoBean> a3 = f8588a.a(a2.f8601d);
            if (a3 != null) {
                for (int i2 = 0; i2 < a3.size(); i2++) {
                    UserInfoBean userInfoBean = a3.get(i2);
                    if (userInfoBean.n.equals(a2.j) && userInfoBean.f8572b == 1) {
                        long b2 = z.b();
                        if (b2 <= 0) {
                            break;
                        }
                        if (userInfoBean.e >= b2) {
                            if (userInfoBean.f <= 0) {
                                a aVar = f8588a;
                                w a4 = w.a();
                                if (a4 != null) {
                                    a4.a(aVar.new AnonymousClass2());
                                }
                            }
                            z3 = false;
                            if (z3) {
                                return;
                            } else {
                                z = false;
                            }
                        }
                    }
                }
            }
            z3 = true;
            if (z3) {
            }
        }
        com.tencent.bugly.crashreport.common.info.a b3 = com.tencent.bugly.crashreport.common.info.a.b();
        if (b3 != null) {
            String str = null;
            boolean z4 = false;
            for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
                if (stackTraceElement.getMethodName().equals("onCreate")) {
                    str = stackTraceElement.getClassName();
                }
                if (stackTraceElement.getClassName().equals("android.app.Activity")) {
                    z4 = true;
                }
            }
            if (str == null) {
                str = EnvironmentCompat.MEDIA_UNKNOWN;
            } else if (z4) {
                b3.a(true);
            } else {
                str = "background";
            }
            b3.p = str;
        }
        if (z && Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (k == null) {
                        k = new Application.ActivityLifecycleCallbacks() { // from class: com.tencent.bugly.crashreport.biz.b.2
                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStarted(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityStopped(Activity activity) {
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityResumed(Activity activity) {
                                String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                                if (activity != null) {
                                    str2 = activity.getClass().getName();
                                }
                                if (b.l == null || b.l.getName().equals(str2)) {
                                    x.c(">>> %s onResumed <<<", str2);
                                    com.tencent.bugly.crashreport.common.info.a b4 = com.tencent.bugly.crashreport.common.info.a.b();
                                    if (b4 == null) {
                                        return;
                                    }
                                    b4.C.add(b.a(str2, "onResumed"));
                                    b4.a(true);
                                    b4.p = str2;
                                    b4.q = System.currentTimeMillis();
                                    b4.t = b4.q - b.i;
                                    long j2 = b4.q - b.h;
                                    if (j2 > (b.f > 0 ? b.f : b.e)) {
                                        b4.d();
                                        b.g();
                                        x.a("[session] launch app one times (app in background %d seconds and over %d seconds)", Long.valueOf(j2 / 1000), Long.valueOf(b.e / 1000));
                                        if (b.g % b.f8590c == 0) {
                                            b.f8588a.a(4, b.m, 0L);
                                            return;
                                        }
                                        b.f8588a.a(4, false, 0L);
                                        long currentTimeMillis = System.currentTimeMillis();
                                        if (currentTimeMillis - b.j > b.f8591d) {
                                            long unused = b.j = currentTimeMillis;
                                            x.a("add a timer to upload hot start user info", new Object[0]);
                                            if (b.m) {
                                                w.a().a(b.f8588a.new RunnableC0391a(null, true), b.f8591d);
                                            }
                                        }
                                    }
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityPaused(Activity activity) {
                                String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                                if (activity != null) {
                                    str2 = activity.getClass().getName();
                                }
                                if (b.l == null || b.l.getName().equals(str2)) {
                                    x.c(">>> %s onPaused <<<", str2);
                                    com.tencent.bugly.crashreport.common.info.a b4 = com.tencent.bugly.crashreport.common.info.a.b();
                                    if (b4 == null) {
                                        return;
                                    }
                                    b4.C.add(b.a(str2, "onPaused"));
                                    b4.a(false);
                                    b4.r = System.currentTimeMillis();
                                    b4.s = b4.r - b4.q;
                                    long unused = b.h = b4.r;
                                    if (b4.s < 0) {
                                        b4.s = 0L;
                                    }
                                    if (activity != null) {
                                        b4.p = "background";
                                    } else {
                                        b4.p = EnvironmentCompat.MEDIA_UNKNOWN;
                                    }
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityDestroyed(Activity activity) {
                                String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                                if (activity != null) {
                                    str2 = activity.getClass().getName();
                                }
                                if (b.l == null || b.l.getName().equals(str2)) {
                                    x.c(">>> %s onDestroyed <<<", str2);
                                    com.tencent.bugly.crashreport.common.info.a b4 = com.tencent.bugly.crashreport.common.info.a.b();
                                    if (b4 != null) {
                                        b4.C.add(b.a(str2, "onDestroyed"));
                                    }
                                }
                            }

                            @Override // android.app.Application.ActivityLifecycleCallbacks
                            public final void onActivityCreated(Activity activity, Bundle bundle) {
                                String str2 = EnvironmentCompat.MEDIA_UNKNOWN;
                                if (activity != null) {
                                    str2 = activity.getClass().getName();
                                }
                                if (b.l == null || b.l.getName().equals(str2)) {
                                    x.c(">>> %s onCreated <<<", str2);
                                    com.tencent.bugly.crashreport.common.info.a b4 = com.tencent.bugly.crashreport.common.info.a.b();
                                    if (b4 != null) {
                                        b4.C.add(b.a(str2, "onCreated"));
                                    }
                                }
                            }
                        };
                    }
                    application.registerActivityLifecycleCallbacks(k);
                } catch (Exception e2) {
                    if (!x.a(e2)) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        if (m) {
            i = System.currentTimeMillis();
            f8588a.a(1, false, 0L);
            x.a("[session] launch app, new start", new Object[0]);
            f8588a.a();
            w.a().a(f8588a.new c(21600000L), 21600000L);
        }
    }

    public static void a(final Context context, final BuglyStrategy buglyStrategy) {
        long j2;
        if (f8589b) {
            return;
        }
        m = com.tencent.bugly.crashreport.common.info.a.a(context).e;
        f8588a = new a(context, m);
        f8589b = true;
        if (buglyStrategy != null) {
            l = buglyStrategy.getUserInfoActivity();
            j2 = buglyStrategy.getAppReportDelay();
        } else {
            j2 = 0;
        }
        if (j2 <= 0) {
            c(context, buglyStrategy);
        } else {
            w.a().a(new Runnable() { // from class: com.tencent.bugly.crashreport.biz.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(context, buglyStrategy);
                }
            }, j2);
        }
    }

    public static void a(long j2) {
        if (j2 < 0) {
            j2 = com.tencent.bugly.crashreport.common.strategy.a.a().c().q;
        }
        f = j2;
    }

    public static void a(StrategyBean strategyBean, boolean z) {
        if (f8588a != null && !z) {
            a aVar = f8588a;
            w a2 = w.a();
            if (a2 != null) {
                a2.a(aVar.new AnonymousClass2());
            }
        }
        if (strategyBean == null) {
            return;
        }
        if (strategyBean.q > 0) {
            e = strategyBean.q;
        }
        if (strategyBean.w > 0) {
            f8590c = strategyBean.w;
        }
        if (strategyBean.x > 0) {
            f8591d = strategyBean.x;
        }
    }

    public static void a() {
        if (f8588a != null) {
            f8588a.a(2, false, 0L);
        }
    }

    public static void a(Context context) {
        if (!f8589b || context == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 14) {
            Application application = context.getApplicationContext() instanceof Application ? (Application) context.getApplicationContext() : null;
            if (application != null) {
                try {
                    if (k != null) {
                        application.unregisterActivityLifecycleCallbacks(k);
                    }
                } catch (Exception e2) {
                    if (!x.a(e2)) {
                        e2.printStackTrace();
                    }
                }
            }
        }
        f8589b = false;
    }
}
