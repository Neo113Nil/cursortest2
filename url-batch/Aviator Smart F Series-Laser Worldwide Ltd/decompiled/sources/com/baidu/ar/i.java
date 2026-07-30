package com.baidu.ar;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.baidu.ar.arplay.core.engine.ARPScriptEnvironment;
import com.baidu.ar.bean.ARConfig;
import com.baidu.ar.constants.ARConfigKey;
import com.baidu.ar.constants.HttpConstants;
import com.baidu.platform.comapi.map.MapController;
import java.util.HashMap;
import java.util.UUID;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public String f2424a;

    /* renamed from: b, reason: collision with root package name */
    public String f2425b;

    /* renamed from: c, reason: collision with root package name */
    public String f2426c;

    /* renamed from: d, reason: collision with root package name */
    public String f2427d;

    public i(Context context) {
        this.f2424a = MapController.DEFAULT_LAYER_TAG;
        this.f2426c = "0";
        this.f2427d = "0";
        UUID a8 = new h3(context).a();
        if (a8 != null) {
            this.f2424a = a8.toString();
        }
        this.f2425b = o.a(context);
        for (Sensor sensor : ((SensorManager) context.getSystemService("sensor")).getSensorList(-1)) {
            if (sensor.getType() == 4) {
                this.f2426c = "1";
            }
            if (sensor.getType() == 11) {
                this.f2427d = "1";
            }
        }
    }

    public void a() {
        c();
        b();
    }

    public final void b() {
        HashMap hashMap = new HashMap();
        hashMap.put("android.sensor.gyroscope", this.f2426c);
        hashMap.put("android.sensor.rotation_vector", this.f2427d);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("deviceinfo", hashMap);
    }

    public final void c() {
        HashMap hashMap = new HashMap();
        hashMap.put(HttpConstants.APP_VERSION, String.valueOf(o.a()));
        hashMap.put("ar_key", ARConfig.getARKey());
        hashMap.put("ar_type", Integer.valueOf(ARConfig.getARType()));
        hashMap.put(HttpConstants.OS_VERSION, String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("device_id", this.f2424a);
        hashMap.put(ARConfigKey.EXTRA_INFO, ARConfig.getARExtraInfo());
        hashMap.put(HttpConstants.HTTP_OS_TYPE, HttpConstants.OS_TYPE_VALUE);
        hashMap.put(HttpConstants.DEVICE_TYPE, Build.BRAND);
        hashMap.put("channel", this.f2425b);
        ARPScriptEnvironment.getInstance().setSharedEnvironmentKV("userinfo", hashMap);
    }

    public void a(String str, Object obj) {
        ARPScriptEnvironment.getInstance().setDataPipKV(str, obj);
    }
}
