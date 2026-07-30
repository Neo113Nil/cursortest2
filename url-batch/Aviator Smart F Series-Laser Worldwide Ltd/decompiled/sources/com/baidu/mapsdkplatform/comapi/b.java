package com.baidu.mapsdkplatform.comapi;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import com.baidu.lbsapi.auth.LBSAuthManager;
import com.baidu.mapapi.CommonInfo;
import com.baidu.mapapi.ISDKInitializerListener;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.OpenLogUtil;
import com.baidu.mapapi.RequestAuthResultListener;
import com.baidu.mapapi.common.EnvironmentUtilities;
import com.baidu.mapapi.common.SysOSUtil;
import com.baidu.mapsdkplatform.comapi.util.PermissionCheck;
import com.baidu.mapsdkplatform.comapi.util.g;
import java.io.File;
import java.io.IOException;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f7911a = false;

    /* renamed from: b, reason: collision with root package name */
    private static CommonInfo f7912b = null;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f7913c = false;

    static class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SysOSUtil.updateCuid();
        }
    }

    public static CommonInfo a() {
        return f7912b;
    }

    public static boolean b() {
        return f7913c;
    }

    public static boolean c() {
        return f7911a;
    }

    public static void d() {
        g.a(false);
    }

    public static void e() {
        g.a(true);
    }

    public static void a(CommonInfo commonInfo) {
        f7912b = commonInfo;
    }

    public static void b(RequestAuthResultListener requestAuthResultListener) {
        PermissionCheck.removeRequestAuthResultListener(requestAuthResultListener);
    }

    public static void a(Context context, boolean z7, String str, String str2, String str3, ISDKInitializerListener iSDKInitializerListener) {
        if (f7911a) {
            return;
        }
        if (context != null) {
            if (context instanceof Application) {
                NativeLoader.setContext(context);
                NativeLoader.a(z7, str);
                JNIInitializer.setContext((Application) context);
                com.baidu.platform.comapi.util.SysOSUtil.getInstance().init(new com.baidu.platform.comapi.util.l.b(), new com.baidu.platform.comapi.util.l.a());
                if (a(str2)) {
                    EnvironmentUtilities.setSDCardPath(str2);
                }
                EnvironmentUtilities.initAppDirectory(context);
                com.baidu.mapsdkplatform.comapi.a.e().a(context);
                com.baidu.mapsdkplatform.comapi.a.e().g();
                if (OpenLogUtil.isNativeLogAnalysisEnable()) {
                    com.baidu.mapsdkplatform.comapi.f.a.b.c().a(context);
                }
                f7911a = true;
                if (iSDKInitializerListener != null) {
                    iSDKInitializerListener.initializerFinish();
                    return;
                }
                return;
            }
            throw new RuntimeException("BDMapSDKException: context must be an ApplicationContext");
        }
        throw new IllegalArgumentException("BDMapSDKException: context can not be null");
    }

    public static void a(Context context, boolean z7) {
        if (context != null) {
            if (context instanceof Application) {
                f7913c = z7;
                PermissionCheck.setPrivacyMode(z7);
                g.b(z7);
                LBSAuthManager.getInstance(context).setPrivacyMode(z7);
                com.baidu.mapapi.a.a().submit(new a());
                return;
            }
            throw new RuntimeException("BDMapSDKException: context must be an ApplicationContext");
        }
        throw new IllegalArgumentException("BDMapSDKException: context can not be null");
    }

    public static void a(RequestAuthResultListener requestAuthResultListener) {
        PermissionCheck.addRequestAuthResultListener(requestAuthResultListener);
    }

    private static boolean a(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        try {
            File file = new File(str + "/check.0");
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!file.exists()) {
                return true;
            }
            file.delete();
            return true;
        } catch (IOException e8) {
            Log.e("SDKInitializer", "SDCard cache path invalid", e8);
            throw new IllegalArgumentException("BDMapSDKException: Provided sdcard cache path invalid can not used.");
        }
    }
}
