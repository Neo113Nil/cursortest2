package com.baidu.mapapi;

/* loaded from: classes2.dex */
public class OpenLogUtil {

    /* renamed from: a, reason: collision with root package name */
    private static ModuleName f5314a = null;

    /* renamed from: b, reason: collision with root package name */
    private static boolean f5315b = true;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f5316c = false;

    /* renamed from: d, reason: collision with root package name */
    private static String f5317d;

    public static String getMapLogFilePath() {
        return f5317d;
    }

    public static boolean isMapLogEnable() {
        return f5316c;
    }

    public static boolean isNativeLogAnalysisEnable() {
        return f5315b;
    }

    public static void setMapLogEnable(boolean z7) {
        f5316c = z7;
    }

    public static void setMapLogFilePath(String str) {
        f5317d = str;
    }

    public static void setModuleLogEnable(ModuleName moduleName, boolean z7) {
        f5314a = moduleName;
        com.baidu.mapsdkplatform.comjni.tools.a.a(z7, moduleName.ordinal());
    }

    public static void setNativeLogAnalysisEnable(boolean z7) {
        f5315b = z7;
    }
}
