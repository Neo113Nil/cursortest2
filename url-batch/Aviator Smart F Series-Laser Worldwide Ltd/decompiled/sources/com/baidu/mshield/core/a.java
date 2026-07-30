package com.baidu.mshield.core;

import android.content.Context;
import android.text.TextUtils;
import com.baidu.mshield.ac.F;
import com.baidu.mshield.b.a.g;
import com.baidu.mshield.utility.c;
import com.baidu.mshield.x0.EngineImpl;
import java.util.HashMap;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap<String, String> f8336a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f8337b;

    /* renamed from: com.baidu.mshield.core.a$a, reason: collision with other inner class name */
    public static class C0084a extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.baidu.mshield.a f8338a;

        public C0084a(com.baidu.mshield.a aVar) {
            this.f8338a = aVar;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            this.f8338a.a("4.2.6", this.f8338a.a("4.2.6") - 1);
        }
    }

    public static void a(boolean z7) {
        f8337b = z7;
    }

    public static String b(Context context) {
        try {
            com.baidu.mshield.sharedpreferences.a a8 = com.baidu.mshield.sharedpreferences.a.a(context);
            String e8 = a8.e();
            if (!TextUtils.isEmpty(e8)) {
                return e8;
            }
            String v7 = a8.v();
            if (!TextUtils.isEmpty(v7)) {
                return v7;
            }
            String b8 = c.b(context);
            if (TextUtils.isEmpty(b8)) {
                return "74FFB5E615AA72E0B057EE43E3D5A23A8BA34AAC1672FC9B56A7106C57BA03";
            }
            String[] split = b8.split("\\|");
            if (split != null && split.length == 2 && !TextUtils.isEmpty(split[0]) && !TextUtils.isEmpty(split[1])) {
                byte[] re = F.getInstance().re(split[1].getBytes(), split[0].getBytes());
                if (re == null) {
                    return "74FFB5E615AA72E0B057EE43E3D5A23A8BA34AAC1672FC9B56A7106C57BA03";
                }
                String str = split[0] + com.baidu.mshield.utility.a.a(re);
                a8.m(str);
                return str;
            }
            return b8;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return "74FFB5E615AA72E0B057EE43E3D5A23A8BA34AAC1672FC9B56A7106C57BA03";
        }
    }

    public static void c(Context context) {
        try {
            com.baidu.mshield.b.c.a.b("canRunPlugin=" + a(context));
            if (a(context)) {
                d(context);
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static void d(Context context) {
        com.baidu.mshield.a aVar = new com.baidu.mshield.a(context);
        aVar.a("4.2.6", aVar.a("4.2.6") + 1);
        EngineImpl.getInstance(context).init(0, true);
        new Timer().schedule(new C0084a(aVar), 30000L);
    }

    public static boolean a() {
        return f8337b;
    }

    public static void a(Context context, String str, String str2, HashMap<String, String> hashMap, int... iArr) {
        try {
            b(context);
            c.b(context);
            g.a(hashMap);
            EngineImpl.getInstance(context).setSecurityVerifyInfo(str, str2, hashMap);
            EngineImpl.getInstance(context).gpol();
            c(context);
            if (hashMap != null) {
                HashMap<String, String> hashMap2 = f8336a;
                synchronized (hashMap2) {
                    hashMap2.putAll(hashMap);
                }
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static boolean a(Context context) {
        try {
            com.baidu.mshield.a aVar = new com.baidu.mshield.a(context);
            if (!aVar.a()) {
                return false;
            }
            if (aVar.a("4.2.6") < aVar.b()) {
                return true;
            }
            EngineImpl.getInstance(context).sendWMCrashLog(5);
            return false;
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return true;
        }
    }

    public static void b(boolean z7) {
        try {
            com.baidu.sec.privacy.b.b.a(z7);
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
        }
    }

    public static String a(Context context, String str, int i8, String str2) {
        if (i8 != 0) {
            try {
                if (a(context)) {
                    if (TextUtils.isEmpty(str2)) {
                        EngineImpl.getInstance(context).ice(str, i8);
                    } else {
                        EngineImpl.getInstance(context).ice(str, i8, str2);
                    }
                }
            } catch (Throwable th) {
                com.baidu.mshield.utility.a.a(th);
            }
        }
        return b(context);
    }

    public static void a(Context context, HashMap<String, String> hashMap) {
        if (hashMap != null) {
            try {
                if (hashMap.size() == 0) {
                    return;
                }
                synchronized (f8336a) {
                    try {
                        for (String str : hashMap.keySet()) {
                            f8336a.put(str, hashMap.get(str));
                        }
                        g.b(hashMap);
                        EngineImpl.getInstance(context).ud(hashMap);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                com.baidu.mshield.utility.a.a(th2);
            }
        }
    }

    public static String a(String str) {
        try {
            HashMap<String, String> hashMap = f8336a;
            if (hashMap.size() <= 0) {
                return "";
            }
            synchronized (hashMap) {
                try {
                    if (!hashMap.containsKey(str)) {
                        return "";
                    }
                    return hashMap.get(str);
                } finally {
                }
            }
        } catch (Throwable th) {
            com.baidu.mshield.utility.a.a(th);
            return "";
        }
    }
}
