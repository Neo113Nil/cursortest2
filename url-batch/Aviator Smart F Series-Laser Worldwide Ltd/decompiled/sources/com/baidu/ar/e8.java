package com.baidu.ar;

import android.app.ActivityManager;
import android.content.Context;
import android.hardware.SensorManager;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.bean.DuMixARConfig;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.ar.ihttp.HttpFactory;
import com.baidu.ar.ihttp.IHttpRequest;
import com.baidu.ar.ihttp.IHttpResponse;
import com.baidu.mapapi.http.wrapper.HttpManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class e8 implements h6 {
    public Map<String, Object> a(List<t3> list) {
        Object c8;
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        t3 t3Var = list.get(0);
        ArrayList<String> arrayList = new ArrayList();
        Iterator<String> e8 = t3Var.e();
        while (e8.hasNext()) {
            String next = e8.next();
            if (!"event_id".equals(next) && (c8 = t3Var.c(next)) != null) {
                hashMap.put(next, c8);
                hashMap2.put(next, c8);
                arrayList.add(next);
            }
        }
        int size = list.size();
        for (int i8 = 1; i8 < size; i8++) {
            t3 t3Var2 = list.get(i8);
            for (String str : arrayList) {
                if (hashMap2.containsKey(str) && !hashMap.get(str).equals(t3Var2.c(str))) {
                    hashMap2.remove(str);
                }
            }
        }
        return hashMap2;
    }

    public void b(JSONObject jSONObject) {
        String str;
        int i8;
        IHttpRequest newRequest = HttpFactory.newRequest();
        if (newRequest == null) {
            return;
        }
        newRequest.setUrl(id.j()).setMethod(HttpManager.HTTP_POST).setBody(jSONObject);
        IHttpResponse execute = newRequest.execute();
        if (execute.isSuccess()) {
            i8 = execute.getCode();
            str = execute.getContent();
        } else {
            str = "";
            i8 = 0;
        }
        if (i8 != 200 || !str.equals(FirebaseAnalytics.Param.SUCCESS)) {
            throw new IOException(String.format("stats response is error. code: %d response: %s", Integer.valueOf(i8), str));
        }
    }

    public JSONObject a(JSONObject jSONObject, t3 t3Var) {
        String d8 = t3Var.d();
        if (d8 != null) {
            jSONObject.put("_uniq", d8);
        }
        return jSONObject;
    }

    @Override // com.baidu.ar.h6
    public void a(Context context, t3 t3Var) {
        if (context == null) {
            throw new SecurityException("context is cleared");
        }
        try {
            JSONObject h8 = t3Var.h();
            a(h8, t3Var);
            a(h8, context);
            b(h8);
        } catch (JSONException e8) {
            e8.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    @Override // com.baidu.ar.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(Context context, List<t3> list) {
        JSONObject jSONObject;
        if (context == null) {
            throw new SecurityException("context is cleared");
        }
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = null;
        try {
            Map<String, Object> a8 = a(list);
            Set<String> keySet = a8 != null ? a8.keySet() : null;
            for (t3 t3Var : list) {
                if (jSONObject2 == null) {
                    jSONObject = new JSONObject();
                    try {
                        jSONObject.put("event_id", "[multi]");
                        jSONObject2 = jSONObject;
                    } catch (JSONException e8) {
                        e = e8;
                        jSONObject2 = jSONObject;
                        e.printStackTrace();
                        if (jSONObject2 != null) {
                        }
                    }
                }
                try {
                    JSONObject a9 = t3Var.a(keySet);
                    a(a9, t3Var);
                    jSONArray.put(a9);
                } catch (JSONException e9) {
                    e = e9;
                    jSONObject = jSONObject2;
                    jSONObject2 = jSONObject;
                    e.printStackTrace();
                    if (jSONObject2 != null) {
                    }
                }
            }
            if (jSONObject2 != null) {
                if (a8 != null) {
                    for (Map.Entry<String, Object> entry : a8.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                }
                a(jSONObject2, context);
                jSONObject2.put("data", jSONArray);
            }
        } catch (JSONException e10) {
            e = e10;
        }
        if (jSONObject2 != null) {
            b(jSONObject2);
        }
    }

    public void a(Context context, JSONObject jSONObject) {
        if (context == null || jSONObject == null) {
            return;
        }
        jSONObject.put(HttpConstants.HTTP_OS_TYPE_OLD, HttpConstants.OS_TYPE_VALUE);
        jSONObject.put(HttpConstants.HTTP_OS_TYPE, HttpConstants.OS_TYPE_VALUE);
        jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, o.a());
        jSONObject.put(HttpConstants.HTTP_APP_ID, o.a(context));
        String str = Build.MODEL;
        jSONObject.put("device_id", str);
        int i8 = Build.VERSION.SDK_INT;
        jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i8);
        jSONObject.put(HttpConstants.OS_BRAND, Build.BRAND.toLowerCase());
        jSONObject.put(HttpConstants.OS_MODEL, str.toLowerCase());
        jSONObject.put(HttpConstants.OS_VERSION_SDK, i8);
        jSONObject.put(HttpConstants.OS_VERSION_RELESE, Build.VERSION.RELEASE);
        jSONObject.put(HttpConstants.OS_WIDTH_PIXELS, context.getResources().getDisplayMetrics().widthPixels);
        jSONObject.put(HttpConstants.OS_HEIGHT_PIXELS, context.getResources().getDisplayMetrics().heightPixels);
        jSONObject.put(HttpConstants.OS_SCALE_PDI, context.getResources().getDisplayMetrics().densityDpi);
        long[] f8 = nc.f();
        jSONObject.put(HttpConstants.OS_ROM_MEMORY, f8[0]);
        jSONObject.put(HttpConstants.OS_ROM_AVAIL_MEMORY, f8[1]);
        jSONObject.put(HttpConstants.OS_SDCARD_MEMORY, nc.h());
        jSONObject.put(HttpConstants.OS_ROM_SDCARD_AVAIL_MEMORY, nc.g());
        jSONObject.put(HttpConstants.OS_RAM_MEMEORY, nc.b(context));
        jSONObject.put(HttpConstants.OS_RAM_AVAIL_MEMORY, nc.a(context));
        if (nc.c(context)) {
            jSONObject.put(HttpConstants.OS_HAS_GYROSCOPE, 1);
        } else {
            jSONObject.put(HttpConstants.OS_HAS_GYROSCOPE, 0);
        }
        jSONObject.put(HttpConstants.OS_CPU_NAME, nc.a());
        jSONObject.put(HttpConstants.OS_CPU_NUM_CORES, nc.e());
        jSONObject.put(HttpConstants.OS_CPU_MIN_FREQ, nc.d());
        jSONObject.put(HttpConstants.OS_CPU_MAX_FREQ, nc.c());
        jSONObject.put(HttpConstants.OS_CPU_ABI, Build.CPU_ABI);
        jSONObject.put(HttpConstants.OS_CPU_CUR_FREQ, nc.b());
        jSONObject.put(HttpConstants.OS_NATIVE_HEAPSIZE, (int) (Runtime.getRuntime().maxMemory() / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED));
        jSONObject.put(HttpConstants.OS_NATIVE_SENSOR, ((SensorManager) context.getSystemService("sensor")).getDefaultSensor(4) != null);
        jSONObject.put(HttpConstants.NETWORK_TYPE, m9.c(context));
        jSONObject.put(HttpConstants.OS_CPU_SUPPORTED_ABIS, Arrays.asList(Build.SUPPORTED_ABIS));
        try {
            jSONObject.put(HttpConstants.HTTP_GLES_VERSION, ((ActivityManager) context.getSystemService("activity")).getDeviceConfigurationInfo().reqGlEsVersion >> 16);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void a(JSONObject jSONObject) {
        jSONObject.put(HttpConstants.AIP_APP_ID, DuMixARConfig.getAipAppId());
        jSONObject.put(HttpConstants.IS_AIP, ExifInterface.GPS_MEASUREMENT_3D);
        Object[] signatureAndTime = ARConfig.getSignatureAndTime();
        jSONObject.put(HttpConstants.SIGN, signatureAndTime[0]);
        jSONObject.put("timestamp", signatureAndTime[1]);
    }

    public void a(JSONObject jSONObject, Context context) {
        UUID a8 = new h3(context).a();
        String uuid = a8 != null ? a8.toString() : "";
        a(jSONObject);
        jSONObject.put(HttpConstants.AIP_APP_ID, DuMixARConfig.getAipAppId());
        jSONObject.put("cuid", ARConfig.getCUID());
        a(context, jSONObject);
        jSONObject.put(HttpConstants.HTTP_OS_TYPE, HttpConstants.OS_TYPE_VALUE);
        jSONObject.put(HttpConstants.OS_VERSION, Build.MODEL);
        jSONObject.put(HttpConstants.DEVICE_TYPE, Build.BRAND);
        jSONObject.put(HttpConstants.HTTP_USER_ID, uuid);
        jSONObject.put("device_id", uuid);
        int i8 = Build.VERSION.SDK_INT;
        jSONObject.put(HttpConstants.OS_VERSION, i8);
        jSONObject.put(HttpConstants.APP_VERSION, o.a());
        jSONObject.put(HttpConstants.HTTP_ENGINE_VERSION, o.a());
        if (!TextUtils.isEmpty(o.a(context))) {
            jSONObject.put(HttpConstants.HTTP_APP_ID, o.a(context));
        }
        jSONObject.put(HttpConstants.HTTP_SYSTEM_VERSION, i8);
        jSONObject.put(HttpConstants.HTTP_HARDWARE, Build.HARDWARE);
        jSONObject.put("manufacture", Build.MANUFACTURER);
        jSONObject.put(HttpConstants.HTTP_BOARD, Build.BOARD);
    }
}
