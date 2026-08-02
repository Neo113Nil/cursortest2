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
    public final HashMap f3751a;

    /* renamed from: c, reason: collision with root package name */
    public final SensorManager f3753c;

    /* renamed from: d, reason: collision with root package name */
    public final w1 f3754d;
    public final cg f = new cg(this);

    /* renamed from: b, reason: collision with root package name */
    public final bg f3752b = new bg();

    /* renamed from: e, reason: collision with root package name */
    public int f3755e = 0;

    public eg(Context context, w1 w1Var) {
        this.f3751a = null;
        this.f3753c = (SensorManager) context.getSystemService("sensor");
        this.f3754d = w1Var;
        this.f3751a = new HashMap();
        SensorsConfig T2 = MetaData.E().T();
        a(13, T2.a());
        a(9, T2.b());
        a(5, T2.d());
        a(10, T2.e());
        a(2, T2.f());
        a(6, T2.g());
        a(12, T2.i());
        a(11, T2.j());
        a(16, T2.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f3751a.keySet()) {
            int intValue = num.intValue();
            dg dgVar = (dg) this.f3751a.get(num);
            if (Build.VERSION.SDK_INT >= dgVar.f3700a && (defaultSensor = this.f3753c.getDefaultSensor(intValue)) != null) {
                this.f3753c.registerListener(this.f, defaultSensor, dgVar.f3701b);
                this.f3755e++;
            }
        }
    }

    public final void b() {
        this.f3753c.unregisterListener(this.f);
    }

    public final void a(int i3, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f3751a.put(Integer.valueOf(i3), new dg(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
