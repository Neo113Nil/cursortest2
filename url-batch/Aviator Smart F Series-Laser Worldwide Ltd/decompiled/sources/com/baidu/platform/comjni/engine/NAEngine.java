package com.baidu.platform.comjni.engine;

import android.content.Context;
import android.os.Bundle;
import com.baidu.platform.comapi.exception.ComInitException;
import com.baidu.platform.comapi.longlink.LongLinkClient;
import com.baidu.platform.comjni.NativeComponent;

/* loaded from: classes2.dex */
public class NAEngine extends NativeComponent {

    /* renamed from: a, reason: collision with root package name */
    private static LongLinkClient f10564a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10565b = false;

    public NAEngine() {
        create();
    }

    public static void a() {
        nativeInitClass(new Bundle(), 0);
        f10565b = true;
    }

    public static boolean b() {
        return nativeStartSocketProc();
    }

    public static boolean c() {
        try {
            LongLinkClient longLinkClient = f10564a;
            if (longLinkClient != null) {
                longLinkClient.unRegister(null);
                f10564a.release();
                f10564a = null;
            }
            return nativeUninitEngine();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String getIP(String str) {
        return nativeGetIP(str);
    }

    public static boolean initLongLinkClient() {
        if (f10564a == null) {
            try {
                f10564a = LongLinkClient.create();
            } catch (ComInitException unused) {
            }
        }
        return f10564a != null;
    }

    private native long nativeCreate();

    private static native void nativeEnableMonitor(boolean z7);

    private static native boolean nativeGetFlaxLength(Bundle bundle);

    private static native String nativeGetIP(String str);

    private static native void nativeInitCVLogFilePath(String str);

    private static native int nativeInitClass(Object obj, int i8);

    private static native boolean nativeInitEngine(Object obj, String str);

    private static native void nativeInitMonitor(String str);

    private static native void nativeMonitorAddLog(int i8, String str, String str2);

    private static native void nativeMonitorSetLogPriority(int i8);

    private static native void nativeMonitorSetOutPutType(int i8);

    private native int nativeRelease(long j8);

    private static native void nativeSetHttpsEnable(boolean z7);

    private static native void nativeSetMonitorLogFilter(String[] strArr);

    private static native void nativeSetNewDomainEnable(boolean z7);

    private static native void nativeSetProxyInfo(String str, int i8);

    private static native void nativeStartRunningRequest();

    private static native boolean nativeStartSocketProc();

    private static native boolean nativeStartSocketProcByCache(String str);

    private static native void nativeSyncAppRuntime(String str);

    private static native void nativeUninitCVLogFilePath();

    private static native boolean nativeUninitEngine();

    public static void restartLongLink() {
        LongLinkClient longLinkClient = f10564a;
        if (longLinkClient != null) {
            try {
                longLinkClient.start();
            } catch (Exception unused) {
            }
        }
    }

    public static void startRunningRequest() {
        nativeStartRunningRequest();
    }

    public static void stopLongLink() {
        LongLinkClient longLinkClient = f10564a;
        if (longLinkClient != null) {
            try {
                longLinkClient.stop();
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public long create() {
        this.mNativePointer = nativeCreate();
        return this.mNativePointer;
    }

    @Override // com.baidu.platform.comjni.NativeComponent
    public int dispose() {
        return nativeRelease(this.mNativePointer);
    }

    public static void b(int i8) {
        nativeMonitorSetOutPutType(i8);
    }

    public static boolean a(Context context, String str) {
        if (!f10565b) {
            a();
        }
        try {
            return nativeInitEngine(context, str);
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(String str) {
        nativeInitMonitor(str);
    }

    public static void a(boolean z7) {
        nativeEnableMonitor(z7);
        nativeMonitorSetLogPriority(1);
    }

    public static void a(int i8) {
        nativeMonitorSetLogPriority(i8);
    }

    public static void a(String[] strArr) {
        nativeSetMonitorLogFilter(strArr);
    }

    public static void a(int i8, String str, String str2) {
        nativeMonitorAddLog(i8, str, str2);
    }
}
