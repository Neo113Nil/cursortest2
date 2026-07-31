package com.startapp.sdk.internal;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.startapp.motiondetector.AmortizedMaximum;
import com.startapp.motiondetector.Utils;
import com.startapp.sdk.adsbase.remoteconfig.MetaData;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class ub {
    public static final AtomicInteger i = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public final Context f453a;
    public final af b;
    public final Handler c;
    public vb d;
    public boolean e;
    public int f;
    public Sensor g;
    public final sb h = new sb(this);

    public ub(Context context, af afVar, i4 i4Var, Handler handler) {
        this.f453a = context;
        this.b = afVar;
        this.c = handler;
    }

    public final boolean a(int i2) {
        if (this.e) {
            MotionMetadata F = MetaData.A().F();
            if (F == null || !F.u()) {
                F = null;
            }
            if (F != null && (i2 & F.j()) != 0) {
                return true;
            }
        }
        return false;
    }

    public final void b() {
        if (this.d != null) {
            ze edit = this.b.edit();
            float longBitsToDouble = (float) Double.longBitsToDouble(this.d.d.get());
            edit.a("e9142de3c7cc5952", Float.valueOf(longBitsToDouble));
            edit.f526a.putFloat("e9142de3c7cc5952", longBitsToDouble);
            edit.putLong("7783513af1730383", this.d.e.get()).apply();
            if (a(4)) {
                n8 n8Var = new n8(o8.d);
                n8Var.d = "MP.save";
                n8Var.e = String.format(Locale.ENGLISH, "%.6f", Double.valueOf(a()));
                n8Var.a();
            }
        }
    }

    public final void c() {
        SensorManager sensorManager;
        MotionMetadata F = MetaData.A().F();
        MotionMetadata motionMetadata = (F == null || !F.u()) ? null : F;
        if (motionMetadata == null || (sensorManager = (SensorManager) this.f453a.getSystemService("sensor")) == null || this.g != null) {
            return;
        }
        Sensor defaultSensor = sensorManager.getDefaultSensor(1);
        int min = Math.min(Math.max(AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_COUNT_UPPER_BOUND, (int) (zh.e(motionMetadata.r()) * 1000)), AndroidComposeViewAccessibilityDelegateCompat.ParcelSafeTextLength);
        if (defaultSensor == null || !sensorManager.registerListener(this.h, defaultSensor, min)) {
            return;
        }
        this.g = defaultSensor;
        double d = this.b.getFloat("e9142de3c7cc5952", 0.0f);
        long j = this.b.getLong("7783513af1730383", 0L);
        vb vbVar = this.d;
        if (vbVar != null) {
            vbVar.interrupt();
            this.d = null;
        }
        if (this.d == null) {
            vb vbVar2 = new vb("startapp-mp-" + i.incrementAndGet(), motionMetadata, motionMetadata.q(), d, j);
            this.d = vbVar2;
            vbVar2.start();
        }
        if (a(1)) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "MP.start";
            n8Var.e = defaultSensor.getName() + StringUtils.COMMA + defaultSensor.getMinDelay() + StringUtils.COMMA + defaultSensor.getPower();
            n8Var.a();
        }
    }

    public final void d() {
        Sensor sensor;
        SensorManager sensorManager = (SensorManager) this.f453a.getSystemService("sensor");
        if (sensorManager == null || (sensor = this.g) == null) {
            return;
        }
        sensorManager.unregisterListener(this.h, sensor);
        this.g = null;
        b();
        vb vbVar = this.d;
        if (vbVar != null) {
            vbVar.interrupt();
            this.d = null;
        }
        if (a(2)) {
            n8 n8Var = new n8(o8.d);
            n8Var.d = "MP.stop";
            n8Var.a();
        }
    }

    public final double a() {
        MotionMetadata F = MetaData.A().F();
        if (F == null || !F.u()) {
            F = null;
        }
        if (F == null) {
            return -1.0d;
        }
        vb vbVar = this.d;
        if (vbVar != null) {
            return Double.longBitsToDouble(vbVar.c.get());
        }
        return this.b.getFloat("e9142de3c7cc5952", 0.0f) * AmortizedMaximum.calcImpact(System.currentTimeMillis(), this.b.getLong("7783513af1730383", 0L), F.b(), F.a(), F.c(), Utils.logisticalFunction(0.0d, F.a(), F.c()));
    }
}
