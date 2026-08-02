package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class eg {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f6865a;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f6867c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f6868d;

    /* renamed from: f, reason: collision with root package name */
    public final cg f6870f = new cg(this);

    /* renamed from: b, reason: collision with root package name */
    public final bg f6866b = new bg();

    /* renamed from: e, reason: collision with root package name */
    public int f6869e = 0;

    public eg(Context context, w1 w1Var) {
        this.f6865a = null;
        this.f6867c = (SensorManager) context.getSystemService("sensor");
        this.f6868d = w1Var;
        this.f6865a = new HashMap();
        SensorsConfig T4 = MetaData.E().T();
        a(13, T4.a());
        a(9, T4.b());
        a(5, T4.d());
        a(10, T4.e());
        a(2, T4.f());
        a(6, T4.g());
        a(12, T4.i());
        a(11, T4.j());
        a(16, T4.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f6865a.keySet()) {
            int intValue = num.intValue();
            dg dgVar = (dg) this.f6865a.get(num);
            if (Build.VERSION.SDK_INT >= dgVar.f6814a && (defaultSensor = this.f6867c.getDefaultSensor(intValue)) != null) {
                this.f6867c.registerListener(this.f6870f, defaultSensor, dgVar.f6815b);
                this.f6869e++;
            }
        }
    }

    public final void b() {
        this.f6867c.unregisterListener(this.f6870f);
    }

    public final void a(int i4, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f6865a.put(Integer.valueOf(i4), new dg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
