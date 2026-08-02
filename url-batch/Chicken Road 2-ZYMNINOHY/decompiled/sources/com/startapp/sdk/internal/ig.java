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
import com.startapp.sdk.adsbase.remoteconfig.ComponentInfoEventConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.sensors.SensorsData;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ig {

    /* renamed from: b, reason: collision with root package name */
    public int f7101b;

    /* renamed from: d, reason: collision with root package name */
    public final long f7103d;

    /* renamed from: e, reason: collision with root package name */
    public c2 f7104e;

    /* renamed from: f, reason: collision with root package name */
    public SensorManager f7105f;

    /* renamed from: g, reason: collision with root package name */
    public final ib f7106g;

    /* renamed from: h, reason: collision with root package name */
    public final Context f7107h;

    /* renamed from: i, reason: collision with root package name */
    public Pair f7108i;

    /* renamed from: j, reason: collision with root package name */
    public final ib f7109j;

    /* renamed from: k, reason: collision with root package name */
    public final r4 f7110k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7111l;

    /* renamed from: m, reason: collision with root package name */
    public final int f7112m;

    /* renamed from: a, reason: collision with root package name */
    public int f7100a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f7102c = new HashMap();
    public final fg n = new fg(this);
    public final hg o = new hg(this);

    public ig(ib ibVar, ib ibVar2, r4 r4Var, Context context) {
        this.f7109j = ibVar;
        this.f7110k = r4Var;
        this.f7106g = ibVar2;
        this.f7107h = context;
        this.f7108i = new Pair(Integer.valueOf(((sf) ibVar2.a()).getInt("last_collected_day", 0)), Integer.valueOf(((sf) ibVar2.a()).getInt("daily_collected", 0)));
        SensorsData U4 = MetaData.E().U();
        if (U4 == null) {
            return;
        }
        this.f7103d = (long) ((AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT / U4.d()) * 0.95d);
        this.f7112m = U4.e();
    }

    public static boolean a(ig igVar, SensorEvent sensorEvent) {
        igVar.getClass();
        int type = sensorEvent.sensor.getType();
        long currentTimeMillis = System.currentTimeMillis();
        Long l4 = (Long) igVar.f7102c.get(Integer.valueOf(type));
        if (currentTimeMillis - (l4 == null ? 0L : l4.longValue()) < igVar.f7103d) {
            return true;
        }
        igVar.f7102c.put(Integer.valueOf(type), Long.valueOf(currentTimeMillis));
        return false;
    }

    public final void a(Context context, SensorsData sensorsData) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f7105f = sensorManager;
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
                d9.a(th);
            }
        }
        SensorManager sensorManager2 = this.f7105f;
        if (sensorManager2 != null) {
            sensorManager2.unregisterListener(this.n);
        }
        int d4 = 1000000 / sensorsData.d();
        Sensor defaultSensor = this.f7105f.getDefaultSensor(1);
        Sensor defaultSensor2 = this.f7105f.getDefaultSensor(4);
        Sensor defaultSensor3 = this.f7105f.getDefaultSensor(2);
        this.f7105f.registerListener(this.n, defaultSensor, d4);
        this.f7105f.registerListener(this.n, defaultSensor2, d4);
        this.f7105f.registerListener(this.n, defaultSensor3, d4);
    }

    public static void a(ig igVar, SensorEvent sensorEvent, SensorsData sensorsData) {
        JSONObject jSONObject;
        igVar.f7101b = ((sf) igVar.f7106g.a()).getInt("total_collected", 0);
        c2 c2Var = igVar.f7104e;
        if (c2Var == null || c2Var.f6741g.size() >= c2Var.f6742h) {
            igVar.f7104e = new c2(((com.startapp.sdk.common.advertisingid.b) igVar.f7109j.a()).a().f7169a, igVar.f7107h.getPackageName(), System.currentTimeMillis() + "", UUID.randomUUID().toString(), igVar.f7111l, igVar.a(), sensorsData.c());
            igVar.f7100a = 0;
        }
        int i4 = igVar.f7100a;
        igVar.f7100a = i4 + 1;
        tf tfVar = new tf(i4, sensorEvent.sensor.getType(), System.currentTimeMillis(), Arrays.copyOf(sensorEvent.values, 3));
        c2 c2Var2 = igVar.f7104e;
        c2Var2.f6741g.add(tfVar);
        if (c2Var2.f6741g.size() >= c2Var2.f6742h) {
            int i5 = Calendar.getInstance().get(6);
            if (((Integer) igVar.f7108i.first).intValue() == i5) {
                Pair pair = igVar.f7108i;
                igVar.f7108i = new Pair((Integer) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1));
            } else {
                igVar.f7108i = new Pair(Integer.valueOf(i5), 1);
            }
            c2 c2Var3 = igVar.f7104e;
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("advertisingId", c2Var3.f6735a);
                jSONObject2.put("bId", c2Var3.f6738d);
                jSONObject2.put("batchTimestamp", c2Var3.f6737c);
                jSONObject2.put("fp", c2Var3.f6736b);
                jSONObject2.put("isCharging", c2Var3.f6739e);
                jSONObject2.put("isScreenOn", c2Var3.f6740f);
                JSONArray jSONArray = new JSONArray();
                for (tf tfVar2 : c2Var3.f6741g) {
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("sId", tfVar2.f7621a);
                    jSONObject3.put("n", tfVar2.f7622b);
                    jSONObject3.put("ts", tfVar2.f7623c);
                    JSONArray jSONArray2 = new JSONArray();
                    int length = tfVar2.f7624d.length;
                    for (int i6 = 0; i6 < length; i6++) {
                        jSONArray2.put(r5[i6]);
                    }
                    jSONObject3.put("v", jSONArray2);
                    jSONArray.put(jSONObject3);
                }
                jSONObject2.put("valueList", jSONArray);
                jSONObject = jSONObject2;
            } catch (Throwable th) {
                if (igVar.a(16)) {
                    d9.a(th);
                }
                jSONObject = null;
            }
            if (sensorsData.g()) {
                d9 d9Var = new d9(e9.f6848p);
                d9Var.f6793e = String.valueOf(jSONObject);
                d9Var.a();
            } else {
                d9 d9Var2 = new d9(e9.f6848p);
                d9Var2.f6794f = jSONObject;
                d9Var2.a();
            }
            rf edit = ((sf) igVar.f7106g.a()).edit();
            int i7 = igVar.f7101b + 1;
            igVar.f7101b = i7;
            edit.putInt("total_collected", i7);
            edit.putLong("sensor_last_collected_time", System.currentTimeMillis());
            Integer num = (Integer) igVar.f7108i.first;
            int intValue = num.intValue();
            edit.a("last_collected_day", num);
            edit.f7532a.putInt("last_collected_day", intValue);
            Integer num2 = (Integer) igVar.f7108i.second;
            int intValue2 = num2.intValue();
            edit.a("daily_collected", num2);
            edit.f7532a.putInt("daily_collected", intValue2);
            edit.apply();
            igVar.a(igVar.f7101b == sensorsData.e());
        }
    }

    public final boolean a() {
        for (Display display : ((DisplayManager) this.f7107h.getSystemService("display")).getDisplays()) {
            if (display.getState() == 2) {
                return true;
            }
        }
        return false;
    }

    public final void a(boolean z) {
        try {
            SensorManager sensorManager = this.f7105f;
            if (sensorManager != null) {
                sensorManager.unregisterListener(this.n);
            }
            this.f7110k.getClass();
            SensorsData U4 = MetaData.E().U();
            this.f7104e = null;
            if (!z && U4 != null) {
                new Handler(Looper.getMainLooper()).postDelayed(new gg(this), U4.a() * 1000);
            }
            this.f7107h.unregisterReceiver(this.o);
        } catch (Throwable th) {
            if (a(32)) {
                d9.a(th);
            }
        }
    }

    public final void a(Context context) {
        int a3;
        try {
            this.f7110k.getClass();
            SensorsData U4 = MetaData.E().U();
            String str = ((com.startapp.sdk.common.advertisingid.b) this.f7109j.a()).a().f7169a;
            if (U4 != null) {
                this.f7110k.getClass();
                SensorsData U5 = MetaData.E().U();
                if (U5 != null && ((sf) this.f7106g.a()).getInt("total_collected", 0) != U5.e() && !str.equals(CommonUrlParts.Values.FALSE_INTEGER) && !str.equals("00000000-0000-0000-0000-000000000000")) {
                    long j4 = ((sf) this.f7106g.a()).getLong("sensor_last_collected_time", 0L);
                    if ((((Integer) this.f7108i.first).intValue() != Calendar.getInstance().get(6) || ((Integer) this.f7108i.second).intValue() != U4.f()) && (System.currentTimeMillis() - j4) / 1000 >= U4.a()) {
                        a(context, U4);
                        return;
                    }
                    if (((Integer) this.f7108i.first).intValue() == Calendar.getInstance().get(6) && ((Integer) this.f7108i.second).intValue() == U4.f()) {
                        a3 = (24 - Calendar.getInstance().get(11)) * 3600;
                    } else {
                        a3 = U4.a();
                    }
                    new Handler(Looper.getMainLooper()).postDelayed(new gg(this), a3 * 1000);
                }
            }
        } catch (Throwable th) {
            if (a(4)) {
                d9.a(th);
            }
        }
    }

    public final boolean a(int i4) {
        this.f7110k.getClass();
        SensorsData U4 = MetaData.E().U();
        ComponentInfoEventConfig b4 = U4 != null ? U4.b() : null;
        return b4 != null && b4.a((long) i4);
    }
}
