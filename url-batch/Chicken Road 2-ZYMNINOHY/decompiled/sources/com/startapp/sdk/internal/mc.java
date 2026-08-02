package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: i, reason: collision with root package name */
    public static final AtomicInteger f7275i = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Context f7276a;

    /* renamed from: b, reason: collision with root package name */
    public final sf f7277b;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f7278c;

    /* renamed from: d, reason: collision with root package name */
    public nc f7279d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7280e;

    /* renamed from: f, reason: collision with root package name */
    public int f7281f;

    /* renamed from: g, reason: collision with root package name */
    public Sensor f7282g;

    /* renamed from: h, reason: collision with root package name */
    public final kc f7283h = new kc(this);

    public mc(Context context, sf sfVar, p4 p4Var, Handler handler) {
        this.f7276a = context;
        this.f7277b = sfVar;
        this.f7278c = handler;
    }

    public final boolean a(int i4) {
        if (this.f7280e) {
            MotionMetadata J4 = MetaData.E().J();
            if (J4 == null || !J4.u()) {
                J4 = null;
            }
            if (J4 != null && (i4 & J4.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.f7279d != null) {
            rf edit = this.f7277b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.f7279d.f7336d.get());
            edit.a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            edit.f7532a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            long j4 = this.f7279d.f7337e.get();
            edit.a("7783513af1730383", Long.valueOf(j4));
            edit.f7532a.putLong("7783513af1730383", j4);
            edit.apply();
            if (a(4)) {
                d9 d9Var = new d9(e9.f6838d);
                d9Var.f6792d = "MP.save";
                d9Var.f6793e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                d9Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata J4 = MetaData.E().J();
        MotionMetadata motionMetadata = (J4 == null || !J4.u()) ? null : J4;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f7276a.getSystemService("sensor")) == null || this.f7282g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int min = Math.min(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, (int) (si.f(motionMetadata.r()) * 1000)), 100000);
        if (defaultSensor == null || !sensorManager.registerListener(this.f7283h, defaultSensor, min)) {
            return;
        }
        this.f7282g = defaultSensor;
        double d4 = this.f7277b.getFloat("e9142de3c7cc5952", 0.0f);
        long j4 = this.f7277b.getLong("7783513af1730383", 0L);
        nc ncVar = this.f7279d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f7279d = null;
        }
        if (this.f7279d == null) {
            nc ncVar2 = new nc("startapp-mp-" + f7275i.incrementAndGet(), motionMetadata, motionMetadata.q(), d4, j4);
            this.f7279d = ncVar2;
            ncVar2.start();
        }
        if (a(1)) {
            d9 d9Var = new d9(e9.f6838d);
            d9Var.f6792d = "MP.start";
            d9Var.f6793e = defaultSensor.getName() + StringUtils.COMMA + defaultSensor.getMinDelay() + StringUtils.COMMA + defaultSensor.getPower();
            d9Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f7276a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.f7282g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.f7283h, sensor);
        this.f7282g = null;
        b();
        nc ncVar = this.f7279d;
        if (ncVar != null) {
            ncVar.interrupt();
            this.f7279d = null;
        }
        if (a(2)) {
            d9 d9Var = new d9(e9.f6838d);
            d9Var.f6792d = "MP.stop";
            d9Var.a();
        }
    }

    public final double a() {
        MotionMetadata J4 = MetaData.E().J();
        if (J4 == null || !J4.u()) {
            J4 = null;
        }
        if (J4 == null) {
            return -1.0d;
        }
        nc ncVar = this.f7279d;
        if (ncVar != null) {
            return Double.longBitsToDouble(ncVar.f7335c.get());
        }
        return this.f7277b.getFloat("e9142de3c7cc5952", 0.0f) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.f7277b.getLong("7783513af1730383", 0L), J4.b(), J4.a(), J4.c(), Utils.logisticalFunction(0.0d, J4.a(), J4.c()));
    }
}
