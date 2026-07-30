package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;

/* renamed from: com.google.android.gms.internal.ads.Go, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2578Go extends AbstractC3605mx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f25208a;

    /* renamed from: b, reason: collision with root package name */
    public final Sensor f25209b;

    /* renamed from: c, reason: collision with root package name */
    public float f25210c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public Float f25211d = Float.valueOf(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public long f25212e;

    /* renamed from: f, reason: collision with root package name */
    public int f25213f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f25214g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f25215h;
    public C2748Qo i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f25216j;

    public C2578Go(Context context) {
        p2.j.f39798C.f39810k.getClass();
        this.f25212e = System.currentTimeMillis();
        this.f25213f = 0;
        this.f25214g = false;
        this.f25215h = false;
        this.i = null;
        this.f25216j = false;
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.f25208a = sensorManager;
        if (sensorManager != null) {
            this.f25209b = sensorManager.getDefaultSensor(4);
        } else {
            this.f25209b = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3605mx
    public final void a(SensorEvent sensorEvent) {
        C3151ea c3151ea = AbstractC3368ia.ta;
        q2.r rVar = q2.r.f40116e;
        if (((Boolean) rVar.f40119c.a(c3151ea)).booleanValue()) {
            p2.j.f39798C.f39810k.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            long j9 = this.f25212e;
            C3151ea c3151ea2 = AbstractC3368ia.va;
            SharedPreferencesOnSharedPreferenceChangeListenerC3260ga sharedPreferencesOnSharedPreferenceChangeListenerC3260ga = rVar.f40119c;
            if (j9 + ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea2)).intValue() < currentTimeMillis) {
                this.f25213f = 0;
                this.f25212e = currentTimeMillis;
                this.f25214g = false;
                this.f25215h = false;
                this.f25210c = this.f25211d.floatValue();
            }
            float floatValue = this.f25211d.floatValue() + (sensorEvent.values[1] * 4.0f);
            this.f25211d = Float.valueOf(floatValue);
            float f6 = this.f25210c;
            C3151ea c3151ea3 = AbstractC3368ia.ua;
            if (floatValue > ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).floatValue() + f6) {
                this.f25210c = this.f25211d.floatValue();
                this.f25215h = true;
            } else if (this.f25211d.floatValue() < this.f25210c - ((Float) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(c3151ea3)).floatValue()) {
                this.f25210c = this.f25211d.floatValue();
                this.f25214g = true;
            }
            if (this.f25211d.isInfinite()) {
                this.f25211d = Float.valueOf(0.0f);
                this.f25210c = 0.0f;
            }
            if (this.f25214g && this.f25215h) {
                t2.C.k("Flick detected.");
                this.f25212e = currentTimeMillis;
                int i = this.f25213f + 1;
                this.f25213f = i;
                this.f25214g = false;
                this.f25215h = false;
                C2748Qo c2748Qo = this.i;
                if (c2748Qo == null || i != ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC3260ga.a(AbstractC3368ia.wa)).intValue()) {
                    return;
                }
                c2748Qo.e(new BinderC2714Oo(1), EnumC2731Po.f27052v);
            }
        }
    }

    public final void b() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            try {
                if (((Boolean) q2.r.f40116e.f40119c.a(AbstractC3368ia.ta)).booleanValue()) {
                    if (!this.f25216j && (sensorManager = this.f25208a) != null && (sensor = this.f25209b) != null) {
                        sensorManager.registerListener(this, sensor, 2);
                        this.f25216j = true;
                        t2.C.k("Listening for flick gestures.");
                    }
                    if (this.f25208a == null || this.f25209b == null) {
                        int i = t2.C.f40822b;
                        u2.i.f("Flick detection failed to initialize. Failed to obtain gyroscope.");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
