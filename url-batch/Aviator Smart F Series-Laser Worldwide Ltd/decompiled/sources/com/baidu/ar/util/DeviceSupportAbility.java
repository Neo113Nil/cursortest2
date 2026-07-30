package com.baidu.ar.util;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.SensorManager;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.ar.NavigationType;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.c6;
import com.baidu.ar.gb;
import com.baidu.ar.id;
import com.baidu.ar.ihttp.HttpException;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.ar.r8;
import com.google.ar.core.ArCoreApk;
import com.huawei.hiar.AREnginesApk;
import com.moyoung.dafit.module.common.utils.u;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class DeviceSupportAbility {

    /* renamed from: a, reason: collision with root package name */
    public static boolean f3417a;

    /* renamed from: b, reason: collision with root package name */
    public static boolean f3418b;

    /* renamed from: c, reason: collision with root package name */
    public static NavigationType f3419c;

    public class a implements c6 {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ File f3420a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f3421b;

        public a(File file, File file2) {
            this.f3420a = file;
            this.f3421b = file2;
        }

        @Override // com.baidu.ar.c6
        public void a(HttpException httpException) {
            httpException.printStackTrace();
        }

        @Override // com.baidu.ar.c6
        public void a(IHttpResponse iHttpResponse) {
            try {
                DeviceSupportAbility.b(iHttpResponse.getContent(), this.f3420a, this.f3421b);
            } catch (IOException | JSONException e8) {
                e8.printStackTrace();
            }
        }
    }

    public static JSONObject a(Context context, String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            gb.a(jSONObject2);
            gb.b(context, jSONObject2);
            if (!TextUtils.isEmpty(str)) {
                gb.a(context, jSONObject2, str, str2);
            }
            gb.a(context, jSONObject2);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
        try {
            jSONObject.put("info", jSONObject2.toString());
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return jSONObject;
    }

    public static void b(String str, File file, File file2) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("errorNum")) {
            int i8 = jSONObject.getInt("errorNum");
            if (i8 != 1 && i8 != 3) {
                if (i8 == 0 && file2.exists()) {
                    file2.delete();
                    return;
                }
                return;
            }
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file2.exists()) {
                return;
            }
            file2.createNewFile();
        }
    }

    public static boolean checkARCoreSupportVersionCode(Context context) {
        return ((long) context.getPackageManager().getPackageInfo("com.google.ar.core", 0).versionCode) >= 210260663;
    }

    public static String getBlacklistParams(Context context, String str) {
        return a(context, str, ARConfig.getARId()).toString();
    }

    public static NavigationType getNavigationAbilityType(Context context, boolean z7) {
        try {
            NavigationType navigationType = f3419c;
            if (navigationType != null) {
                return navigationType;
            }
            if (((SensorManager) context.getSystemService("sensor")).getDefaultSensor(4) == null) {
                NavigationType navigationType2 = NavigationType.None;
                f3419c = navigationType2;
                return navigationType2;
            }
            if (b(context)) {
                NavigationType navigationType3 = NavigationType.None;
                f3419c = navigationType3;
                return navigationType3;
            }
            f3418b = z7;
            if (AREnginesApk.isAREngineApkReady(context) && a(context)) {
                NavigationType navigationType4 = NavigationType.AREngine;
                f3419c = navigationType4;
                return navigationType4;
            }
            if (!ArCoreApk.getInstance().checkAvailability(context).isSupported() || !checkARCoreSupportVersionCode(context)) {
                NavigationType navigationType5 = !z7 ? NavigationType.ARPedometer : NavigationType.ARIMU;
                f3419c = navigationType5;
                return navigationType5;
            }
            f3419c = NavigationType.ARCore;
            if (!z7) {
                f3419c = NavigationType.ARPedometer;
            }
            return f3419c;
        } catch (PackageManager.NameNotFoundException e8) {
            e = e8;
            e.printStackTrace();
            NavigationType navigationType6 = NavigationType.ARIMU;
            f3419c = navigationType6;
            return navigationType6;
        } catch (RuntimeException e9) {
            e = e9;
            e.printStackTrace();
            NavigationType navigationType62 = NavigationType.ARIMU;
            f3419c = navigationType62;
            return navigationType62;
        } catch (Throwable th) {
            e = th;
            e.printStackTrace();
            NavigationType navigationType622 = NavigationType.ARIMU;
            f3419c = navigationType622;
            return navigationType622;
        }
    }

    public static NavigationType getSelectedNavigationType() {
        return f3419c;
    }

    public static boolean isOutDoor() {
        return f3418b;
    }

    public static void jumpMarket(Context context) {
        StringBuilder sb;
        String str;
        if (f3417a) {
            try {
                Intent intent = new Intent("com.huawei.appmarket.intent.action.AppDetail");
                intent.putExtra("APP_PACKAGENAME", "com.huawei.arengine.service");
                intent.setPackage("com.huawei.appmarket");
                intent.setFlags(268435456);
                context.startActivity(intent);
            } catch (ActivityNotFoundException e8) {
                e = e8;
                sb = new StringBuilder();
                str = "the target activity is not found: ";
                sb.append(str);
                sb.append(e.getMessage());
                Log.w("DeviceSupportAbility", sb.toString());
            } catch (SecurityException e9) {
                e = e9;
                sb = new StringBuilder();
                str = "the target app has no permission of media";
                sb.append(str);
                sb.append(e.getMessage());
                Log.w("DeviceSupportAbility", sb.toString());
            }
        }
    }

    public static void setNavigationType(NavigationType navigationType) {
        f3419c = navigationType;
    }

    public static boolean b(Context context) {
        File filesDir = context.getFilesDir();
        StringBuilder sb = new StringBuilder();
        String str = File.separator;
        sb.append(str);
        sb.append(u.LANGUAGE_AR);
        sb.append(str);
        sb.append("devices/");
        File file = new File(filesDir, sb.toString());
        File file2 = new File(file.getAbsolutePath(), "ar-devices");
        r8.a(id.b(), a(context, (String) null, (String) null), new a(file, file2));
        return file2.exists();
    }

    public static boolean a(Context context) {
        return ((long) context.getPackageManager().getPackageInfo("com.huawei.arengine.service", 0).versionCode) >= 100000105;
    }
}
