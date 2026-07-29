package com.facebook.ads.internal.g;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Environment;
import android.os.StatFs;
import com.applovin.sdk.AppLovinEventTypes;
import com.umeng.commonsdk.proguard.d;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static SensorManager f5123a;

    /* renamed from: b, reason: collision with root package name */
    private static Sensor f5124b;

    /* renamed from: c, reason: collision with root package name */
    private static Sensor f5125c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile float[] f5126d;
    private static volatile float[] e;
    private static Map<String, String> f = new ConcurrentHashMap();
    private static String[] g = {"x", "y", "z"};
    private static SensorEventListener h;
    private static SensorEventListener i;

    /* renamed from: com.facebook.ads.internal.g.a$a, reason: collision with other inner class name */
    private static class C0345a implements SensorEventListener {
        private C0345a() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] unused = a.f5126d = sensorEvent.values;
            a.d();
        }
    }

    private static class b implements SensorEventListener {
        private b() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            float[] unused = a.e = sensorEvent.values;
            a.e();
        }
    }

    public static Map<String, String> a() {
        HashMap hashMap = new HashMap();
        hashMap.putAll(f);
        a(hashMap);
        return hashMap;
    }

    public static synchronized void a(Context context) {
        synchronized (a.class) {
            b(context);
            c(context);
            d(context);
            if (f5123a == null) {
                f5123a = (SensorManager) context.getSystemService(d.aa);
                if (f5123a == null) {
                    return;
                }
            }
            if (f5124b == null) {
                f5124b = f5123a.getDefaultSensor(1);
            }
            if (f5125c == null) {
                f5125c = f5123a.getDefaultSensor(4);
            }
            if (h == null) {
                h = new C0345a();
                if (f5124b != null) {
                    f5123a.registerListener(h, f5124b, 3);
                }
            }
            if (i == null) {
                i = new b();
                if (f5125c != null) {
                    f5123a.registerListener(i, f5125c, 3);
                }
            }
        }
    }

    private static void a(Map<String, String> map) {
        float[] fArr = f5126d;
        float[] fArr2 = e;
        if (fArr != null) {
            int min = Math.min(g.length, fArr.length);
            for (int i2 = 0; i2 < min; i2++) {
                map.put("accelerometer_" + g[i2], String.valueOf(fArr[i2]));
            }
        }
        if (fArr2 != null) {
            int min2 = Math.min(g.length, fArr2.length);
            for (int i3 = 0; i3 < min2; i3++) {
                map.put("rotation_" + g[i3], String.valueOf(fArr2[i3]));
            }
        }
    }

    private static void b(Context context) {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) context.getSystemService("activity")).getMemoryInfo(memoryInfo);
        f.put("available_memory", String.valueOf(memoryInfo.availMem));
    }

    private static void c(Context context) {
        f.put("free_space", String.valueOf(r0.getAvailableBlocks() * new StatFs(Environment.getDataDirectory().getPath()).getBlockSize()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void d() {
        synchronized (a.class) {
            if (f5123a != null) {
                f5123a.unregisterListener(h);
            }
            h = null;
        }
    }

    private static void d(Context context) {
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return;
        }
        int intExtra = registerReceiver.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1);
        int intExtra2 = registerReceiver.getIntExtra("scale", -1);
        int intExtra3 = registerReceiver.getIntExtra("status", -1);
        boolean z = intExtra3 == 2 || intExtra3 == 5;
        f.put(d.W, String.valueOf(intExtra2 > 0 ? 100.0f * (intExtra / intExtra2) : 0.0f));
        f.put("charging", z ? "1" : "0");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static synchronized void e() {
        synchronized (a.class) {
            if (f5123a != null) {
                f5123a.unregisterListener(i);
            }
            i = null;
        }
    }
}
