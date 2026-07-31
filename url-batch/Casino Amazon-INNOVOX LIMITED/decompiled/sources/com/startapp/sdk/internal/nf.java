package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Build;
import com.startapp.sdk.adsbase.remoteconfig.BaseSensorConfig;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.SensorsConfig;
import java.util.HashMap;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class nf {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f352a;
    public final SensorManager c;
    public final id d;
    public final lf f = new lf(this);
    public final kf b = new kf();
    public int e = 0;

    public nf(Context context, s1 s1Var) {
        this.f352a = null;
        this.c = (SensorManager) context.getSystemService("sensor");
        this.d = s1Var;
        this.f352a = new HashMap();
        SensorsConfig O = MetaData.A().O();
        a(13, O.a());
        a(9, O.b());
        a(5, O.d());
        a(10, O.e());
        a(2, O.f());
        a(6, O.g());
        a(12, O.i());
        a(11, O.j());
        a(16, O.c());
    }

    public final void a() {
        Sensor defaultSensor;
        for (Integer num : this.f352a.keySet()) {
            int intValue = num.intValue();
            mf mfVar = (mf) this.f352a.get(num);
            if (Build.VERSION.SDK_INT >= mfVar.f338a && (defaultSensor = this.c.getDefaultSensor(intValue)) != null) {
                this.c.registerListener(this.f, defaultSensor, mfVar.b);
                this.e++;
            }
        }
    }

    public final void b() {
        this.c.unregisterListener(this.f);
    }

    public final void a(int i, BaseSensorConfig baseSensorConfig) {
        if (baseSensorConfig.c()) {
            this.f352a.put(Integer.valueOf(i), new mf(baseSensorConfig.b(), baseSensorConfig.a()));
        }
    }
}
