package com.baidu.platform.comapi.walknavi.g.i.j;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.platform.comapi.walknavi.g.i.k.h;
import java.util.Arrays;
import java.util.UUID;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class e {
    public static c a(Context context, com.baidu.platform.comapi.walknavi.g.i.e.a aVar, f<JSONObject> fVar) {
        String a8 = a(context, aVar);
        if (TextUtils.isEmpty(a8)) {
            return null;
        }
        String str = com.baidu.platform.comapi.walknavi.g.i.k.d.f10071a + com.baidu.platform.comapi.walknavi.g.i.k.d.f10072b + "/queryARResource";
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("doQueryArResource: " + str);
        d dVar = new d(str, fVar);
        dVar.execute(a8);
        return dVar;
    }

    public static String a(Context context, com.baidu.platform.comapi.walknavi.g.i.e.a aVar) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("doQueryArResource catch Exception");
        }
        if (aVar == null) {
            return jSONObject2.toString();
        }
        String d8 = aVar.d();
        if (d8 != null) {
            jSONObject = new JSONObject(d8);
        } else {
            jSONObject = new JSONObject();
        }
        UUID a8 = new com.baidu.platform.comapi.walknavi.g.i.k.e(context).a();
        if (a8 != null) {
            jSONObject.put(HttpConstants.HTTP_USER_ID, a8.toString());
        }
        jSONObject2.put(HttpConstants.HTTP_AR_VALUE, jSONObject.toString());
        String b8 = aVar.b();
        if (!TextUtils.isEmpty(b8)) {
            jSONObject2.put("ar_key", b8);
        }
        String a9 = aVar.a();
        if (!TextUtils.isEmpty(a9)) {
            jSONObject2.put(ARConfigKey.AR_ID, a9);
        } else {
            jSONObject2.put(ARConfigKey.AR_ID, "");
        }
        jSONObject2.put(HttpConstants.HTTP_GLES_VERSION, ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >> 16);
        jSONObject2.put(HttpConstants.HTTP_OS_TYPE_OLD, HttpConstants.OS_TYPE_VALUE);
        jSONObject2.put(HttpConstants.HTTP_ENGINE_VERSION, com.baidu.platform.comapi.walknavi.g.i.k.b.a());
        jSONObject2.put(HttpConstants.HTTP_APP_ID, com.baidu.platform.comapi.walknavi.g.i.k.b.a(context));
        jSONObject2.put("device_id", Build.MODEL);
        jSONObject2.put(HttpConstants.HTTP_SYSTEM_VERSION, Build.VERSION.SDK_INT);
        jSONObject2.put(HttpConstants.HTTP_USER_ID, a8.toString());
        jSONObject2.put("publish_id", "6");
        if (!com.baidu.platform.comapi.walknavi.g.i.b.f9991a) {
            jSONObject2.put("update_check", 1);
        }
        a(context, jSONObject2);
        com.baidu.platform.comapi.walknavi.g.i.k.a.a("doQueryArResource = " + jSONObject2.toString());
        return jSONObject2.toString();
    }

    public static b a(String str, int i8, String str2, boolean z7, a<String> aVar) {
        b bVar = new b(str, i8, z7, aVar);
        bVar.execute(str2);
        return bVar;
    }

    public static void a(Context context, JSONObject jSONObject) {
        try {
            if (context == null) {
                com.baidu.platform.comapi.walknavi.g.i.k.a.a("bdar: postSystemInfo context is null!!!");
                return;
            }
            long[] f8 = h.f();
            long[] g8 = h.g();
            Sensor defaultSensor = ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(4);
            if (jSONObject != null) {
                jSONObject.put(HttpConstants.OS_BRAND, Build.BRAND.toLowerCase());
                jSONObject.put(HttpConstants.OS_MODEL, Build.MODEL.toLowerCase());
                jSONObject.put(HttpConstants.OS_VERSION_SDK, Build.VERSION.SDK_INT);
                jSONObject.put(HttpConstants.OS_VERSION_RELESE, Build.VERSION.RELEASE);
                jSONObject.put(HttpConstants.OS_WIDTH_PIXELS, context.getResources().getDisplayMetrics().widthPixels);
                jSONObject.put(HttpConstants.OS_HEIGHT_PIXELS, context.getResources().getDisplayMetrics().heightPixels);
                jSONObject.put(HttpConstants.OS_SCALE_PDI, context.getResources().getDisplayMetrics().densityDpi);
                jSONObject.put(HttpConstants.OS_RAM_AVAIL_MEMORY, h.a(context));
                jSONObject.put(HttpConstants.OS_RAM_MEMEORY, h.b(context));
                jSONObject.put(HttpConstants.OS_ROM_AVAIL_MEMORY, f8[1]);
                jSONObject.put(HttpConstants.OS_ROM_MEMORY, f8[0]);
                jSONObject.put(HttpConstants.OS_ROM_SDCARD_AVAIL_MEMORY, g8[1]);
                jSONObject.put(HttpConstants.OS_SDCARD_MEMORY, g8[0]);
                jSONObject.put(HttpConstants.OS_CPU_NAME, h.a());
                jSONObject.put(HttpConstants.OS_CPU_NUM_CORES, h.e());
                jSONObject.put(HttpConstants.OS_CPU_MIN_FREQ, h.d());
                jSONObject.put(HttpConstants.OS_CPU_MAX_FREQ, h.c());
                jSONObject.put(HttpConstants.OS_CPU_CUR_FREQ, h.b());
                jSONObject.put(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
                jSONObject.put(HttpConstants.OS_NATIVE_HEAPSIZE, (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
                jSONObject.put(HttpConstants.OS_NATIVE_SENSOR, defaultSensor != null);
                jSONObject.put(HttpConstants.OS_CPU_SUPPORTED_ABIS, Arrays.asList(Build.SUPPORTED_ABIS));
            }
        } catch (Exception unused) {
            com.baidu.platform.comapi.walknavi.g.i.k.a.a("postSystemInfo catch Exception");
        }
    }
}
