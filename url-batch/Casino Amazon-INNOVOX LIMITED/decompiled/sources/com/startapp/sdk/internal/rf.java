package com.startapp.sdk.internal;

import android.content.Context;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Display;
import com.onesignal.notifications.internal.bundle.impl.NotificationBundleProcessor;
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import kotlin.time.DurationKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class rf {
    public int b;
    public final long d;
    public w1 e;
    public SensorManager f;
    public final pa g;
    public final Context h;
    public Pair i;
    public final pa j;
    public final k4 k;
    public boolean l;
    public final int m;

    /* renamed from: a, reason: collision with root package name */
    public int f405a = 0;
    public final HashMap c = new HashMap();
    public final of n = new of(this);
    public final qf o = new qf(this);

    public rf(pa paVar, pa paVar2, k4 k4Var, Context context) {
        this.j = paVar;
        this.k = k4Var;
        this.g = paVar2;
        this.h = context;
        this.i = new Pair(Integer.valueOf(((af) paVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((af) paVar2.a()).getInt("daily_collected", 0)));
        SensorsData P = MetaData.A().P();
        if (P == null) {
            return;
        }
        this.d = (long) ((1000 / P.d()) * 0.95d);
        this.m = P.e();
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f = sensorManager;
        if (sensorManager == null) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            context.registerReceiver(this.o, intentFilter);
        } catch (Throwable th) {
            if (a(8)) {
                n8.a(th);
            }
        }
        SensorManager sensorManager2 = this.f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.n);
        }
        int d = DurationKt.NANOS_IN_MILLIS / sensorsData.d();
        Sensor defaultSensor = this.f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f.getDefaultSensor(2);
        this.f.registerListener(this.n, defaultSensor, d);
        this.f.registerListener(this.n, defaultSensor2, d);
        this.f.registerListener(this.n, defaultSensor3, d);
    }

    public static boolean a(rf rfVar, SensorEvent sensorEvent) {
        int type = sensorEvent.sensor.getType();
        long currentTimeMillis = System.currentTimeMillis();
        Long l = (Long) rfVar.c.get(Integer.valueOf(type));
        if (currentTimeMillis - (l == null ? 0L : l.longValue()) < rfVar.d) {
            return true;
        }
        rfVar.c.put(Integer.valueOf(type), Long.valueOf(currentTimeMillis));
        return false;
    }

    public static void a(rf rfVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        JSONObject jSONObject;
        rfVar.b = ((af) rfVar.g.a()).getInt("total_collected", 0);
        w1 w1Var = rfVar.e;
        if (w1Var == null || w1Var.g.size() >= w1Var.h) {
            rfVar.e = new w1(((com.startapp.sdk.common.advertisingid.b) rfVar.j.a()).a().f255a, rfVar.h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), rfVar.l, rfVar.a(), sensorsData.c());
            rfVar.f405a = 0;
        }
        int i = rfVar.f405a;
        rfVar.f405a = i + 1;
        bf bfVar = new bf(i, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        w1 w1Var2 = rfVar.e;
        w1Var2.g.add(bfVar);
        if (w1Var2.g.size() >= w1Var2.h) {
            int i2 = Calendar.getInstance().get(6);
            if (((Integer) rfVar.i.first).intValue() == i2) {
                Pair pair = rfVar.i;
                rfVar.i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                rfVar.i = new Pair(Integer.valueOf(i2), 1);
            }
            w1 w1Var3 = rfVar.e;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("advertisingId", w1Var3.f476a);
                jSONObject2.put("bId", w1Var3.d);
                jSONObject2.put("batchTimestamp", w1Var3.c);
                jSONObject2.put("fp", w1Var3.b);
                jSONObject2.put("isCharging", w1Var3.e);
                jSONObject2.put("isScreenOn", w1Var3.f);
                JSONArray jSONArray = new JSONArray();
                for (bf bfVar2 : w1Var3.g) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("sId", bfVar2.f186a);
                    jSONObject3.put(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT, bfVar2.b);
                    jSONObject3.put("ts", bfVar2.c);
                    JSONArray jSONArray2 = new JSONArray();
                    int length = bfVar2.d.length;
                    for (int i3 = 0; i3 < length; i3++) {
                        jSONArray2.put(r5[i3]);
                    }
                    jSONObject3.put("v", jSONArray2);
                    jSONArray.put(jSONObject3);
                }
                jSONObject2.put("valueList", jSONArray);
                jSONObject = jSONObject2;
            } catch (Throwable th) {
                if (rfVar.a(16)) {
                    n8.a(th);
                }
                jSONObject = null;
            }
            if (sensorsData.g()) {
                n8 n8Var = new n8(o8.m);
                n8Var.e = String.valueOf(jSONObject);
                n8Var.a();
            } else {
                n8 n8Var2 = new n8(o8.m);
                n8Var2.f = jSONObject;
                n8Var2.a();
            }
            ze edit = ((af) rfVar.g.a()).edit();
            int i4 = rfVar.b + 1;
            rfVar.b = i4;
            edit.putInt("total_collected", i4);
            edit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) rfVar.i.first;
            int intValue = num.intValue();
            edit.a("last_collected_day", num);
            edit.f526a.putInt("last_collected_day", intValue);
            Integer num2 = (Integer) rfVar.i.second;
            int intValue2 = num2.intValue();
            edit.a("daily_collected", num2);
            edit.f526a.putInt("daily_collected", intValue2);
            edit.apply();
            rfVar.a(rfVar.b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.h.getSystemService("display")).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        try {
            SensorManager sensorManager = this.f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.n);
            }
            this.k.getClass();
            SensorsData P = MetaData.A().P();
            this.e = null;
            if (!z && P != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new pf(this), P.a() * 1000);
            }
            this.h.unregisterReceiver(this.o);
        } catch (Throwable th) {
            if (a(32)) {
                n8.a(th);
            }
        }
    }

    public final void a(Context context) {
        int a2;
        try {
            this.k.getClass();
            SensorsData P = MetaData.A().P();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.j.a()).a().f255a;
            if (P != null) {
                this.k.getClass();
                SensorsData P2 = MetaData.A().P();
                if (P2 != null && ((af) this.g.a()).getInt("total_collected", 0) != P2.e() && !str.equals(CommonUrlParts.Values.FALSE_INTEGER) && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j = ((af) this.g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.i.second).intValue() != P.f()) && (System.currentTimeMillis() - j) / 1000 >= P.a()) {
                        a(context, P);
                        return;
                    }
                    if (((Integer) this.i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.i.second).intValue() == P.f()) {
                        a2 = (24 - Calendar.getInstance().get(11)) * 3600;
                    } else {
                        a2 = P.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new pf(this), a2 * 1000);
                }
            }
        } catch (Throwable th) {
            if (a(4)) {
                n8.a(th);
            }
        }
    }

    public final boolean a(int i) {
        this.k.getClass();
        SensorsData P = MetaData.A().P();
        ComponentInfoEventConfig b = P != null ? P.b() : null;
        return b != null && b.a((long) i);
    }
}
