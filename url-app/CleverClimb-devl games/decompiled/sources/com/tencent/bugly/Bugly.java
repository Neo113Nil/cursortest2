package com.tencent.bugly;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.bugly.proguard.o;
import com.tencent.bugly.proguard.p;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import java.util.Map;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class Bugly {
    public static final String SDK_IS_DEV = "false";

    /* renamed from: a, reason: collision with root package name */
    private static boolean f8525a = false;
    public static Context applicationContext = null;

    /* renamed from: b, reason: collision with root package name */
    private static String[] f8526b = {"BuglyCrashModule", "BuglyRqdModule", "BuglyBetaModule"};

    /* renamed from: c, reason: collision with root package name */
    private static String[] f8527c = {"BuglyRqdModule", "BuglyCrashModule", "BuglyBetaModule"};
    public static boolean enable = true;
    public static Boolean isDev;

    public static void init(Context context, String str, boolean z) {
        init(context, str, z, null);
    }

    public static synchronized void init(Context context, String str, boolean z, BuglyStrategy buglyStrategy) {
        synchronized (Bugly.class) {
            if (f8525a) {
                return;
            }
            f8525a = true;
            Context a2 = z.a(context);
            applicationContext = a2;
            if (a2 == null) {
                Log.e(x.f8801a, "init arg 'context' should not be null!");
                return;
            }
            if (isDev()) {
                f8526b = f8527c;
            }
            for (String str2 : f8526b) {
                try {
                    if (str2.equals("BuglyCrashModule")) {
                        b.a(CrashModule.getInstance());
                    } else if (!str2.equals("BuglyBetaModule") && !str2.equals("BuglyRqdModule")) {
                        str2.equals("BuglyFeedbackModule");
                    }
                } catch (Throwable th) {
                    x.b(th);
                }
            }
            b.f8564a = enable;
            b.a(applicationContext, str, z, buglyStrategy);
        }
    }

    public static synchronized String getAppChannel() {
        byte[] bArr;
        synchronized (Bugly.class) {
            com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
            if (b2 == null) {
                return null;
            }
            if (TextUtils.isEmpty(b2.l)) {
                p a2 = p.a();
                if (a2 == null) {
                    return b2.l;
                }
                Map<String, byte[]> a3 = a2.a(556, (o) null, true);
                if (a3 != null && (bArr = a3.get("app_channel")) != null) {
                    return new String(bArr);
                }
            }
            return b2.l;
        }
    }

    public static boolean isDev() {
        if (isDev == null) {
            isDev = Boolean.valueOf(Boolean.parseBoolean("false".replace("@", "")));
        }
        return isDev.booleanValue();
    }
}
