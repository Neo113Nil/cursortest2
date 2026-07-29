package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.bugly.BuglyStrategy;
import com.tencent.bugly.crashreport.CrashReport;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.BuglyBroadcastRecevier;
import com.tencent.bugly.crashreport.crash.c;
import com.tencent.bugly.crashreport.crash.d;
import com.tencent.bugly.proguard.n;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.x;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class CrashModule extends a {
    public static final int MODULE_ID = 1004;

    /* renamed from: c, reason: collision with root package name */
    private static int f8532c;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f8533d;
    private static CrashModule e = new CrashModule();

    /* renamed from: a, reason: collision with root package name */
    private long f8534a;

    /* renamed from: b, reason: collision with root package name */
    private BuglyStrategy.a f8535b;

    public static CrashModule getInstance() {
        e.id = 1004;
        return e;
    }

    public static boolean hasInitialized() {
        return f8533d;
    }

    @Override // com.tencent.bugly.a
    public synchronized void init(Context context, boolean z, BuglyStrategy buglyStrategy) {
        if (context != null) {
            if (!f8533d) {
                x.a("Initializing crash module.", new Object[0]);
                n a2 = n.a();
                int i = f8532c + 1;
                f8532c = i;
                a2.a(1004, i);
                f8533d = true;
                CrashReport.setContext(context);
                a(context, buglyStrategy);
                c.a(1004, context, z, this.f8535b, (o) null, (String) null);
                c a3 = c.a();
                a3.e();
                if (buglyStrategy != null && !buglyStrategy.isEnableNativeCrashMonitor()) {
                    x.a("[crash] Closed native crash monitor!", new Object[0]);
                    a3.f();
                    if (buglyStrategy != null && !buglyStrategy.isEnableANRCrashMonitor()) {
                        x.a("[crash] Closed ANR monitor!", new Object[0]);
                        a3.i();
                        d.a(context);
                        BuglyBroadcastRecevier buglyBroadcastRecevier = BuglyBroadcastRecevier.getInstance();
                        buglyBroadcastRecevier.addFilter("android.net.conn.CONNECTIVITY_CHANGE");
                        buglyBroadcastRecevier.register(context);
                        n a4 = n.a();
                        int i2 = f8532c - 1;
                        f8532c = i2;
                        a4.a(1004, i2);
                    }
                    a3.h();
                    d.a(context);
                    BuglyBroadcastRecevier buglyBroadcastRecevier2 = BuglyBroadcastRecevier.getInstance();
                    buglyBroadcastRecevier2.addFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    buglyBroadcastRecevier2.register(context);
                    n a42 = n.a();
                    int i22 = f8532c - 1;
                    f8532c = i22;
                    a42.a(1004, i22);
                }
                a3.g();
                if (buglyStrategy != null) {
                    x.a("[crash] Closed ANR monitor!", new Object[0]);
                    a3.i();
                    d.a(context);
                    BuglyBroadcastRecevier buglyBroadcastRecevier22 = BuglyBroadcastRecevier.getInstance();
                    buglyBroadcastRecevier22.addFilter("android.net.conn.CONNECTIVITY_CHANGE");
                    buglyBroadcastRecevier22.register(context);
                    n a422 = n.a();
                    int i222 = f8532c - 1;
                    f8532c = i222;
                    a422.a(1004, i222);
                }
                a3.h();
                d.a(context);
                BuglyBroadcastRecevier buglyBroadcastRecevier222 = BuglyBroadcastRecevier.getInstance();
                buglyBroadcastRecevier222.addFilter("android.net.conn.CONNECTIVITY_CHANGE");
                buglyBroadcastRecevier222.register(context);
                n a4222 = n.a();
                int i2222 = f8532c - 1;
                f8532c = i2222;
                a4222.a(1004, i2222);
            }
        }
    }

    private synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        if (buglyStrategy == null) {
            return;
        }
        String libBuglySOFilePath = buglyStrategy.getLibBuglySOFilePath();
        if (!TextUtils.isEmpty(libBuglySOFilePath)) {
            com.tencent.bugly.crashreport.common.info.a.a(context).m = libBuglySOFilePath;
            x.a("setted libBugly.so file path :%s", libBuglySOFilePath);
        }
        if (buglyStrategy.getCrashHandleCallback() != null) {
            this.f8535b = buglyStrategy.getCrashHandleCallback();
            x.a("setted CrashHanldeCallback", new Object[0]);
        }
        if (buglyStrategy.getAppReportDelay() > 0) {
            this.f8534a = buglyStrategy.getAppReportDelay();
            x.a("setted delay: %d", Long.valueOf(this.f8534a));
        }
    }

    @Override // com.tencent.bugly.a
    public void onServerStrategyChanged(StrategyBean strategyBean) {
        c a2;
        if (strategyBean == null || (a2 = c.a()) == null) {
            return;
        }
        a2.a(strategyBean);
    }

    @Override // com.tencent.bugly.a
    public String[] getTables() {
        return new String[]{"t_cr"};
    }
}
