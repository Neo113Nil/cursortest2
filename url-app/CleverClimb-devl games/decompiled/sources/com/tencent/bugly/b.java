package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.proguard.n;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.u;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.y;
import com.tencent.bugly.proguard.z;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f8564a = true;

    /* renamed from: b, reason: collision with root package name */
    public static List<a> f8565b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public static boolean f8566c;

    /* renamed from: d, reason: collision with root package name */
    private static p f8567d;
    private static boolean e;

    private static boolean a(com.tencent.bugly.crashreport.common.info.a aVar) {
        List<String> list = aVar.o;
        aVar.getClass();
        return list != null && list.contains("bugly");
    }

    public static synchronized void a(Context context) {
        synchronized (b.class) {
            a(context, null);
        }
    }

    public static synchronized void a(Context context, BuglyStrategy buglyStrategy) {
        synchronized (b.class) {
            if (e) {
                x.d("[init] initial Multi-times, ignore this.", new Object[0]);
                return;
            }
            if (context == null) {
                Log.w(x.f8801a, "[init] context of init() is null, check it.");
                return;
            }
            com.tencent.bugly.crashreport.common.info.a a2 = com.tencent.bugly.crashreport.common.info.a.a(context);
            if (a(a2)) {
                f8564a = false;
                return;
            }
            String f = a2.f();
            if (f == null) {
                Log.e(x.f8801a, "[init] meta data of BUGLY_APPID in AndroidManifest.xml should be set.");
            } else {
                a(context, f, a2.u, buglyStrategy);
            }
        }
    }

    public static synchronized void a(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        byte[] bArr;
        synchronized (b.class) {
            if (e) {
                x.d("[init] initial Multi-times, ignore this.", new Object[0]);
                return;
            }
            if (context == null) {
                Log.w(x.f8801a, "[init] context is null, check it.");
                return;
            }
            if (str == null) {
                Log.e(x.f8801a, "init arg 'crashReportAppID' should not be null!");
                return;
            }
            e = true;
            if (z) {
                f8566c = true;
                x.f8802b = true;
                x.d("Bugly debug模式开启，请在发布时把isDebug关闭。 -- Running in debug model for 'isDebug' is enabled. Please disable it when you release.", new Object[0]);
                x.e("--------------------------------------------------------------------------------------------", new Object[0]);
                x.d("Bugly debug模式将有以下行为特性 -- The following list shows the behaviour of debug model: ", new Object[0]);
                x.d("[1] 输出详细的Bugly SDK的Log -- More detailed log of Bugly SDK will be output to logcat;", new Object[0]);
                x.d("[2] 每一条Crash都会被立即上报 -- Every crash caught by Bugly will be uploaded immediately.", new Object[0]);
                x.d("[3] 自定义日志将会在Logcat中输出 -- Custom log will be output to logcat.", new Object[0]);
                x.e("--------------------------------------------------------------------------------------------", new Object[0]);
                x.b("[init] Open debug mode of Bugly.", new Object[0]);
            }
            x.a("[init] Bugly version: v%s", "2.6.5");
            x.a(" crash report start initializing...", new Object[0]);
            x.b("[init] Bugly start initializing...", new Object[0]);
            x.a("[init] Bugly complete version: v%s", "2.6.5");
            Context a2 = z.a(context);
            com.tencent.bugly.crashreport.common.info.a a3 = com.tencent.bugly.crashreport.common.info.a.a(a2);
            a3.t();
            y.a(a2);
            f8567d = p.a(a2, f8565b);
            u.a(a2);
            com.tencent.bugly.crashreport.common.strategy.a a4 = com.tencent.bugly.crashreport.common.strategy.a.a(a2, f8565b);
            n a5 = n.a(a2);
            if (a(a3)) {
                f8564a = false;
                return;
            }
            a3.a(str);
            x.a("[param] Set APP ID:%s", str);
            if (buglyStrategy != null) {
                String appVersion = buglyStrategy.getAppVersion();
                if (!TextUtils.isEmpty(appVersion)) {
                    if (appVersion.length() > 100) {
                        String substring = appVersion.substring(0, 100);
                        x.d("appVersion %s length is over limit %d substring to %s", appVersion, 100, substring);
                        appVersion = substring;
                    }
                    a3.j = appVersion;
                    x.a("[param] Set App version: %s", buglyStrategy.getAppVersion());
                }
                try {
                    if (buglyStrategy.isReplaceOldChannel()) {
                        String appChannel = buglyStrategy.getAppChannel();
                        if (!TextUtils.isEmpty(appChannel)) {
                            if (appChannel.length() > 100) {
                                String substring2 = appChannel.substring(0, 100);
                                x.d("appChannel %s length is over limit %d substring to %s", appChannel, 100, substring2);
                                appChannel = substring2;
                            }
                            f8567d.a(556, "app_channel", appChannel.getBytes(), (o) null, false);
                            a3.l = appChannel;
                        }
                    } else {
                        Map<String, byte[]> a6 = f8567d.a(556, (o) null, true);
                        if (a6 != null && (bArr = a6.get("app_channel")) != null) {
                            a3.l = new String(bArr);
                        }
                    }
                    x.a("[param] Set App channel: %s", a3.l);
                } catch (Exception e2) {
                    if (f8566c) {
                        e2.printStackTrace();
                    }
                }
                String appPackageName = buglyStrategy.getAppPackageName();
                if (!TextUtils.isEmpty(appPackageName)) {
                    if (appPackageName.length() > 100) {
                        String substring3 = appPackageName.substring(0, 100);
                        x.d("appPackageName %s length is over limit %d substring to %s", appPackageName, 100, substring3);
                        appPackageName = substring3;
                    }
                    a3.f8600c = appPackageName;
                    x.a("[param] Set App package: %s", buglyStrategy.getAppPackageName());
                }
                String deviceID = buglyStrategy.getDeviceID();
                if (deviceID != null) {
                    if (deviceID.length() > 100) {
                        String substring4 = deviceID.substring(0, 100);
                        x.d("deviceId %s length is over limit %d substring to %s", deviceID, 100, substring4);
                        deviceID = substring4;
                    }
                    a3.c(deviceID);
                    x.a("s[param] Set device ID: %s", deviceID);
                }
                a3.e = buglyStrategy.isUploadProcess();
                y.f8804a = buglyStrategy.isBuglyLogUpload();
            }
            com.tencent.bugly.crashreport.biz.b.a(a2, buglyStrategy);
            for (int i = 0; i < f8565b.size(); i++) {
                try {
                    if (a5.a(f8565b.get(i).id)) {
                        f8565b.get(i).init(a2, z, buglyStrategy);
                    }
                } catch (Throwable th) {
                    if (!x.a(th)) {
                        th.printStackTrace();
                    }
                }
            }
            a4.a(buglyStrategy != null ? buglyStrategy.getAppReportDelay() : 0L);
            x.b("[init] Bugly initialization finished.", new Object[0]);
        }
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            if (!f8565b.contains(aVar)) {
                f8565b.add(aVar);
            }
        }
    }
}
