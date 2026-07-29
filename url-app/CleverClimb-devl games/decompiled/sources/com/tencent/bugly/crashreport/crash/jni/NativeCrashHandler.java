package com.tencent.bugly.crashreport.crash.jni;

import android.annotation.SuppressLint;
import android.content.Context;
import com.tapjoy.TapjoyConstants;
import com.tencent.bugly.crashreport.common.strategy.StrategyBean;
import com.tencent.bugly.crashreport.crash.CrashDetailBean;
import com.tencent.bugly.proguard.w;
import com.tencent.bugly.proguard.x;
import com.tencent.bugly.proguard.z;
import com.umeng.analytics.pro.c;
import java.io.File;

/* compiled from: BUGLY */
/* loaded from: classes2.dex */
public class NativeCrashHandler implements com.tencent.bugly.crashreport.a {

    /* renamed from: a, reason: collision with root package name */
    private static NativeCrashHandler f8683a;
    private static boolean l;
    private static boolean m;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8684b;

    /* renamed from: c, reason: collision with root package name */
    private final com.tencent.bugly.crashreport.common.info.a f8685c;

    /* renamed from: d, reason: collision with root package name */
    private final w f8686d;
    private NativeExceptionHandler e;
    private String f;
    private final boolean g;
    private boolean h = false;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;
    private com.tencent.bugly.crashreport.crash.b n;

    protected native boolean appendNativeLog(String str, String str2, String str3);

    protected native boolean appendWholeNativeLog(String str);

    protected native String getNativeKeyValueList();

    protected native String getNativeLog();

    protected native boolean putNativeKeyValue(String str, String str2);

    protected native String regist(String str, boolean z, int i);

    protected native String removeNativeKeyValue(String str);

    protected native void setNativeInfo(int i, String str);

    protected native void testCrash();

    protected native String unregist();

    @SuppressLint({"SdCardPath"})
    private NativeCrashHandler(Context context, com.tencent.bugly.crashreport.common.info.a aVar, com.tencent.bugly.crashreport.crash.b bVar, w wVar, boolean z, String str) {
        this.f8684b = z.a(context);
        try {
            if (z.a(str)) {
                str = context.getDir("bugly", 0).getAbsolutePath();
            }
        } catch (Throwable unused) {
            str = c.f8856a + com.tencent.bugly.crashreport.common.info.a.a(context).f8600c + "/app_bugly";
        }
        this.n = bVar;
        this.f = str;
        this.f8685c = aVar;
        this.f8686d = wVar;
        this.g = z;
        this.e = new a(context, aVar, bVar, com.tencent.bugly.crashreport.common.strategy.a.a());
    }

    public static synchronized NativeCrashHandler getInstance(Context context, com.tencent.bugly.crashreport.common.info.a aVar, com.tencent.bugly.crashreport.crash.b bVar, com.tencent.bugly.crashreport.common.strategy.a aVar2, w wVar, boolean z, String str) {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            if (f8683a == null) {
                f8683a = new NativeCrashHandler(context, aVar, bVar, wVar, z, str);
            }
            nativeCrashHandler = f8683a;
        }
        return nativeCrashHandler;
    }

    public static synchronized NativeCrashHandler getInstance() {
        NativeCrashHandler nativeCrashHandler;
        synchronized (NativeCrashHandler.class) {
            nativeCrashHandler = f8683a;
        }
        return nativeCrashHandler;
    }

    public synchronized String getDumpFilePath() {
        return this.f;
    }

    public synchronized void setDumpFilePath(String str) {
        this.f = str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:40|(1:42)(14:65|(1:67)|44|45|(1:47)|48|(1:50)|52|(1:54)(1:63)|55|(1:57)(1:62)|58|59|60)|43|44|45|(0)|48|(0)|52|(0)(0)|55|(0)(0)|58|59|60) */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f A[Catch: Throwable -> 0x008d, all -> 0x0193, TryCatch #2 {Throwable -> 0x008d, blocks: (B:45:0x0075, B:47:0x007f, B:48:0x0081, B:50:0x008b), top: B:44:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008b A[Catch: Throwable -> 0x008d, all -> 0x0193, TRY_LEAVE, TryCatch #2 {Throwable -> 0x008d, blocks: (B:45:0x0075, B:47:0x007f, B:48:0x0081, B:50:0x008b), top: B:44:0x0075 }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091 A[Catch: Throwable -> 0x00bb, all -> 0x0193, TryCatch #0 {Throwable -> 0x00bb, blocks: (B:38:0x0015, B:40:0x001d, B:42:0x004f, B:43:0x005c, B:52:0x008d, B:54:0x0091, B:55:0x00a0, B:57:0x00a4, B:58:0x00b3, B:62:0x00ac, B:63:0x0099, B:65:0x0061, B:67:0x0067), top: B:37:0x0015, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4 A[Catch: Throwable -> 0x00bb, all -> 0x0193, TryCatch #0 {Throwable -> 0x00bb, blocks: (B:38:0x0015, B:40:0x001d, B:42:0x004f, B:43:0x005c, B:52:0x008d, B:54:0x0091, B:55:0x00a0, B:57:0x00a4, B:58:0x00b3, B:62:0x00ac, B:63:0x0099, B:65:0x0061, B:67:0x0067), top: B:37:0x0015, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ac A[Catch: Throwable -> 0x00bb, all -> 0x0193, TryCatch #0 {Throwable -> 0x00bb, blocks: (B:38:0x0015, B:40:0x001d, B:42:0x004f, B:43:0x005c, B:52:0x008d, B:54:0x0091, B:55:0x00a0, B:57:0x00a4, B:58:0x00b3, B:62:0x00ac, B:63:0x0099, B:65:0x0061, B:67:0x0067), top: B:37:0x0015, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0099 A[Catch: Throwable -> 0x00bb, all -> 0x0193, TryCatch #0 {Throwable -> 0x00bb, blocks: (B:38:0x0015, B:40:0x001d, B:42:0x004f, B:43:0x005c, B:52:0x008d, B:54:0x0091, B:55:0x00a0, B:57:0x00a4, B:58:0x00b3, B:62:0x00ac, B:63:0x0099, B:65:0x0061, B:67:0x0067), top: B:37:0x0015, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized void a(boolean z) {
        StringBuilder sb;
        if (this.j) {
            x.d("[Native] Native crash report has already registered.", new Object[0]);
            return;
        }
        if (this.i) {
            try {
                String regist = regist(this.f, z, 1);
                if (regist != null) {
                    x.a("[Native] Native Crash Report enable.", new Object[0]);
                    x.c("[Native] Check extra jni for Bugly NDK v%s", regist);
                    String replace = "2.1.1".replace(".", "");
                    String replace2 = "2.3.0".replace(".", "");
                    String replace3 = regist.replace(".", "");
                    if (replace3.length() != 2) {
                        if (replace3.length() == 1) {
                            sb = new StringBuilder();
                            sb.append(replace3);
                            sb.append("00");
                        }
                        if (Integer.parseInt(replace3) >= Integer.parseInt(replace)) {
                            l = true;
                        }
                        if (Integer.parseInt(replace3) >= Integer.parseInt(replace2)) {
                            m = true;
                        }
                        if (m) {
                            x.d("[Native] Info setting jni can not be accessed.", new Object[0]);
                        } else {
                            x.a("[Native] Info setting jni can be accessed.", new Object[0]);
                        }
                        if (l) {
                            x.d("[Native] Extra jni can not be accessed.", new Object[0]);
                        } else {
                            x.a("[Native] Extra jni can be accessed.", new Object[0]);
                        }
                        this.f8685c.n = regist;
                        this.j = true;
                        return;
                    }
                    sb = new StringBuilder();
                    sb.append(replace3);
                    sb.append("0");
                    replace3 = sb.toString();
                    if (Integer.parseInt(replace3) >= Integer.parseInt(replace)) {
                    }
                    if (Integer.parseInt(replace3) >= Integer.parseInt(replace2)) {
                    }
                    if (m) {
                    }
                    if (l) {
                    }
                    this.f8685c.n = regist;
                    this.j = true;
                    return;
                }
            } catch (Throwable unused) {
                x.c("[Native] Failed to load Bugly SO file.", new Object[0]);
            }
        } else if (this.h) {
            try {
                Class[] clsArr = {String.class, String.class, Integer.TYPE, Integer.TYPE};
                Object[] objArr = new Object[4];
                objArr[0] = this.f;
                objArr[1] = com.tencent.bugly.crashreport.common.info.b.a(false);
                objArr[2] = Integer.valueOf(z ? 1 : 5);
                objArr[3] = 1;
                String str = (String) z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler2", null, clsArr, objArr);
                if (str == null) {
                    Class[] clsArr2 = {String.class, String.class, Integer.TYPE};
                    com.tencent.bugly.crashreport.common.info.a.b();
                    str = (String) z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "registNativeExceptionHandler", null, clsArr2, new Object[]{this.f, com.tencent.bugly.crashreport.common.info.b.a(false), Integer.valueOf(com.tencent.bugly.crashreport.common.info.a.J())});
                }
                if (str != null) {
                    this.j = true;
                    com.tencent.bugly.crashreport.common.info.a.b().n = str;
                    Boolean bool = (Boolean) z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "checkExtraJni", null, new Class[]{String.class}, new Object[]{str});
                    if (bool != null) {
                        l = bool.booleanValue();
                    }
                    z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{true});
                    z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "setLogMode", null, new Class[]{Integer.TYPE}, new Object[]{Integer.valueOf(z ? 1 : 5)});
                    return;
                }
            } catch (Throwable unused2) {
            }
        }
        this.i = false;
        this.h = false;
    }

    public synchronized void startNativeMonitor() {
        if (!this.i && !this.h) {
            String str = "Bugly";
            boolean z = !z.a(this.f8685c.m);
            String str2 = this.f8685c.m;
            if (z) {
                str = str2;
            } else {
                this.f8685c.getClass();
            }
            this.i = a(str, z);
            if (this.i || this.h) {
                a(this.g);
                this.f8686d.a(new Runnable() { // from class: com.tencent.bugly.crashreport.crash.jni.NativeCrashHandler.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (z.a(NativeCrashHandler.this.f8684b, "native_record_lock", TapjoyConstants.TIMER_INCREMENT)) {
                            try {
                                NativeCrashHandler.this.setNativeAppVersion(NativeCrashHandler.this.f8685c.j);
                                NativeCrashHandler.this.setNativeAppChannel(NativeCrashHandler.this.f8685c.l);
                                NativeCrashHandler.this.setNativeAppPackage(NativeCrashHandler.this.f8685c.f8600c);
                                NativeCrashHandler.this.setNativeUserId(NativeCrashHandler.this.f8685c.g());
                                NativeCrashHandler.this.setNativeIsAppForeground(NativeCrashHandler.this.f8685c.a());
                                NativeCrashHandler.this.setNativeLaunchTime(NativeCrashHandler.this.f8685c.f8598a);
                            } catch (Throwable th) {
                                if (!x.a(th)) {
                                    th.printStackTrace();
                                }
                            }
                            CrashDetailBean a2 = b.a(NativeCrashHandler.this.f8684b, NativeCrashHandler.this.f, NativeCrashHandler.this.e);
                            if (a2 != null) {
                                x.a("[Native] Get crash from native record.", new Object[0]);
                                if (!NativeCrashHandler.this.n.a(a2)) {
                                    NativeCrashHandler.this.n.a(a2, 3000L, false);
                                }
                                b.a(false, NativeCrashHandler.this.f);
                            }
                            NativeCrashHandler.this.a();
                            z.b(NativeCrashHandler.this.f8684b, "native_record_lock");
                            return;
                        }
                        x.a("[Native] Failed to lock file for handling native crash record.", new Object[0]);
                    }
                });
                return;
            }
            return;
        }
        a(this.g);
    }

    private static boolean a(String str, boolean z) {
        boolean z2;
        try {
            x.a("[Native] Trying to load so: %s", str);
            if (z) {
                System.load(str);
            } else {
                System.loadLibrary(str);
            }
            try {
                x.a("[Native] Successfully loaded SO: %s", str);
                return true;
            } catch (Throwable th) {
                th = th;
                z2 = true;
                x.d(th.getMessage(), new Object[0]);
                x.d("[Native] Failed to load so: %s", str);
                return z2;
            }
        } catch (Throwable th2) {
            th = th2;
            z2 = false;
        }
    }

    private synchronized void b() {
        if (!this.j) {
            x.d("[Native] Native crash report has already unregistered.", new Object[0]);
            return;
        }
        try {
            if (unregist() != null) {
                x.a("[Native] Successfully closed native crash report.", new Object[0]);
                this.j = false;
                return;
            }
        } catch (Throwable unused) {
            x.c("[Native] Failed to close native crash report.", new Object[0]);
        }
        try {
            z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "enableHandler", null, new Class[]{Boolean.TYPE}, new Object[]{false});
            this.j = false;
            x.a("[Native] Successfully closed native crash report.", new Object[0]);
        } catch (Throwable unused2) {
            x.c("[Native] Failed to close native crash report.", new Object[0]);
            this.i = false;
            this.h = false;
        }
    }

    public void testNativeCrash() {
        if (!this.i) {
            x.d("[Native] Bugly SO file has not been load.", new Object[0]);
        } else {
            testCrash();
        }
    }

    public NativeExceptionHandler getNativeExceptionHandler() {
        return this.e;
    }

    protected final void a() {
        File[] listFiles;
        long b2 = z.b() - com.tencent.bugly.crashreport.crash.c.g;
        File file = new File(this.f);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        int length = "tomb_".length();
        int i = 0;
        for (File file2 : listFiles) {
            String name = file2.getName();
            if (name.startsWith("tomb_")) {
                try {
                    int indexOf = name.indexOf(".txt");
                    if (indexOf > 0 && Long.parseLong(name.substring(length, indexOf)) >= b2) {
                    }
                } catch (Throwable unused) {
                    x.e("[Native] Tomb file format error, delete %s", name);
                }
                if (file2.delete()) {
                    i++;
                }
            }
        }
        x.c("[Native] Clean tombs %d", Integer.valueOf(i));
    }

    private synchronized void b(boolean z) {
        if (z) {
            startNativeMonitor();
        } else {
            b();
        }
    }

    public synchronized boolean isUserOpened() {
        return this.k;
    }

    private synchronized void c(boolean z) {
        if (this.k != z) {
            x.a("user change native %b", Boolean.valueOf(z));
            this.k = z;
        }
    }

    public synchronized void setUserOpened(boolean z) {
        c(z);
        boolean isUserOpened = isUserOpened();
        com.tencent.bugly.crashreport.common.strategy.a a2 = com.tencent.bugly.crashreport.common.strategy.a.a();
        if (a2 != null) {
            isUserOpened = isUserOpened && a2.c().g;
        }
        if (isUserOpened != this.j) {
            x.a("native changed to %b", Boolean.valueOf(isUserOpened));
            b(isUserOpened);
        }
    }

    public synchronized void onStrategyChanged(StrategyBean strategyBean) {
        if (strategyBean != null) {
            try {
                if (strategyBean.g != this.j) {
                    x.d("server native changed to %b", Boolean.valueOf(strategyBean.g));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        boolean z = com.tencent.bugly.crashreport.common.strategy.a.a().c().g && this.k;
        if (z != this.j) {
            x.a("native changed to %b", Boolean.valueOf(z));
            b(z);
        }
    }

    @Override // com.tencent.bugly.crashreport.a
    public boolean appendLogToNative(String str, String str2, String str3) {
        if ((!this.h && !this.i) || !l || str == null || str2 == null || str3 == null) {
            return false;
        }
        try {
            if (this.i) {
                return appendNativeLog(str, str2, str3);
            }
            Boolean bool = (Boolean) z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "appendNativeLog", null, new Class[]{String.class, String.class, String.class}, new Object[]{str, str2, str3});
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (UnsatisfiedLinkError unused) {
            l = false;
            return false;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public boolean putKeyValueToNative(String str, String str2) {
        if ((!this.h && !this.i) || !l || str == null || str2 == null) {
            return false;
        }
        try {
            if (this.i) {
                return putNativeKeyValue(str, str2);
            }
            Boolean bool = (Boolean) z.a("com.tencent.feedback.eup.jni.NativeExceptionUpload", "putNativeKeyValue", null, new Class[]{String.class, String.class}, new Object[]{str, str2});
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        } catch (UnsatisfiedLinkError unused) {
            l = false;
            return false;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    private boolean a(int i, String str) {
        if (!this.i || !m) {
            return false;
        }
        try {
            setNativeInfo(i, str);
            return true;
        } catch (UnsatisfiedLinkError unused) {
            m = false;
            return false;
        } catch (Throwable th) {
            if (!x.a(th)) {
                th.printStackTrace();
            }
            return false;
        }
    }

    public boolean filterSigabrtSysLog() {
        return a(998, "true");
    }

    public boolean setNativeAppVersion(String str) {
        return a(10, str);
    }

    public boolean setNativeAppChannel(String str) {
        return a(12, str);
    }

    public boolean setNativeAppPackage(String str) {
        return a(13, str);
    }

    public boolean setNativeUserId(String str) {
        return a(11, str);
    }

    @Override // com.tencent.bugly.crashreport.a
    public boolean setNativeIsAppForeground(boolean z) {
        return a(14, z ? "true" : "false");
    }

    public boolean setNativeLaunchTime(long j) {
        try {
            return a(15, String.valueOf(j));
        } catch (NumberFormatException e) {
            if (x.a(e)) {
                return false;
            }
            e.printStackTrace();
            return false;
        }
    }
}
