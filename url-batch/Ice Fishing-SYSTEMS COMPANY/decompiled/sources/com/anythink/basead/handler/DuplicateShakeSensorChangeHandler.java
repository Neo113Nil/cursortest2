package com.anythink.basead.handler;

import android.hardware.SensorEvent;
import com.anythink.basead.b.c.i;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class DuplicateShakeSensorChangeHandler extends BaseShakeSensorChangeHandlerImp {

    /* renamed from: d, reason: collision with root package name */
    List<Double> f9204d;

    /* renamed from: e, reason: collision with root package name */
    long f9205e;

    /* renamed from: m, reason: collision with root package name */
    ATShackSensorListener f9212m;

    /* renamed from: n, reason: collision with root package name */
    float f9213n;

    /* renamed from: o, reason: collision with root package name */
    float f9214o;

    /* renamed from: p, reason: collision with root package name */
    float f9215p;
    public long lastCallBackTimeMs = 0;

    /* renamed from: s, reason: collision with root package name */
    private long f9218s = 0;

    /* renamed from: q, reason: collision with root package name */
    String f9216q = "";

    /* renamed from: j, reason: collision with root package name */
    List<Double> f9209j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    List<Double> f9210k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    List<Double> f9211l = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    long f9206f = 0;

    /* renamed from: g, reason: collision with root package name */
    int f9207g = 0;

    /* renamed from: h, reason: collision with root package name */
    int f9208h = 0;
    int i = 0;

    /* renamed from: r, reason: collision with root package name */
    boolean f9217r = false;

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long a(float f6, float f9, float f10) {
        long j9;
        double a9 = a(0);
        if (this.f9207g == 0 && Math.abs(f6) >= a9) {
            a(0, f6);
            this.f9207g = 1;
            if (this.f9206f == 0) {
                j9 = System.currentTimeMillis();
                if (this.f9208h == 0 && Math.abs(f9) >= a9) {
                    a(1, f9);
                    this.f9208h = 1;
                    if (this.f9206f == 0) {
                        j9 = System.currentTimeMillis();
                    }
                }
                if (this.i == 0 && Math.abs(f10) >= a9) {
                    a(2, f10);
                    this.i = 1;
                    if (this.f9206f == 0) {
                        return System.currentTimeMillis();
                    }
                }
                return j9;
            }
        }
        j9 = 0;
        if (this.f9208h == 0) {
            a(1, f9);
            this.f9208h = 1;
            if (this.f9206f == 0) {
            }
        }
        if (this.i == 0) {
            a(2, f10);
            this.i = 1;
            if (this.f9206f == 0) {
            }
        }
        return j9;
    }

    private void c() {
        this.f9206f = 0L;
        this.f9207g = 0;
        this.f9209j.clear();
        this.f9208h = 0;
        this.f9210k.clear();
        this.i = 0;
        this.f9211l.clear();
    }

    private boolean d() {
        if (this.f9212m == null) {
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastCallBackTimeMs <= this.f9218s) {
            return false;
        }
        b();
        if (!this.f9212m.onShakeTrigger()) {
            return false;
        }
        this.lastCallBackTimeMs = currentTimeMillis;
        a();
        return true;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public boolean handleSensorData(SensorEvent sensorEvent) {
        float[] fArr;
        if (this.f9212m != null && (fArr = sensorEvent.values) != null && fArr.length >= 3) {
            try {
                float f6 = this.f9213n;
                if (f6 == 0.0f) {
                    this.f9213n = -fArr[0];
                    this.f9214o = -fArr[1];
                    this.f9215p = -fArr[2];
                    return false;
                }
                float f9 = (-fArr[0]) - f6;
                float f10 = (-fArr[1]) - this.f9214o;
                float f11 = (-fArr[2]) - this.f9215p;
                a(sensorEvent);
                if (this.f9206f == 0) {
                    this.f9206f = a(f9, f10, f11);
                } else if (System.currentTimeMillis() - this.f9206f > this.f9205e) {
                    c();
                } else {
                    if (this.f9207g > 0 && this.f9209j.size() > 0) {
                        if (this.f9207g >= this.f9209j.size()) {
                            c();
                            return d();
                        }
                        double doubleValue = this.f9209j.get(this.f9207g).doubleValue();
                        if (f9 * doubleValue > 0.0d && Math.abs(f9) > Math.abs(doubleValue)) {
                            this.f9207g++;
                        }
                    }
                    if (this.f9208h > 0 && this.f9210k.size() > 0) {
                        if (this.f9208h >= this.f9210k.size()) {
                            c();
                            return d();
                        }
                        double doubleValue2 = this.f9210k.get(this.f9208h).doubleValue();
                        if (f10 * doubleValue2 > 0.0d && Math.abs(f10) > Math.abs(doubleValue2)) {
                            this.f9208h++;
                        }
                    }
                    if (this.i > 0 && this.f9211l.size() > 0) {
                        if (this.i >= this.f9211l.size()) {
                            c();
                            return d();
                        }
                        double doubleValue3 = this.f9211l.get(this.i).doubleValue();
                        if (f11 * doubleValue3 > 0.0d && Math.abs(f11) > Math.abs(doubleValue3)) {
                            this.i++;
                        }
                    }
                    a(f9, f10, f11);
                }
            } catch (Throwable th) {
                if (!this.f9217r) {
                    i.v("ShakeHandler", "Throwable:" + th.getMessage() + ",params:" + this.f9216q);
                    this.f9217r = true;
                }
            }
        }
        return false;
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void initSetting(ShakeSensorSetting shakeSensorSetting) {
        if (shakeSensorSetting != null) {
            this.f9218s = shakeSensorSetting.getShakeTimeMs();
            this.f9204d = shakeSensorSetting.getShakeStrengthList();
            this.f9205e = shakeSensorSetting.getShakeDetectDurationTime();
            this.f9216q = shakeSensorSetting.toString();
        }
    }

    @Override // com.anythink.basead.handler.IShackSensorChangeHandler
    public void setListener(ATShackSensorListener aTShackSensorListener) {
        this.f9212m = aTShackSensorListener;
    }

    private void a(int i, float f6) {
        List<Double> list;
        if (i == 1) {
            list = this.f9210k;
        } else if (i != 2) {
            list = this.f9209j;
        } else {
            list = this.f9211l;
        }
        list.clear();
        for (int i4 = 0; i4 < this.f9204d.size() - 1; i4++) {
            double a9 = a(i4);
            if (f6 < 0.0f) {
                list.add(Double.valueOf((-1.0d) * a9));
                list.add(Double.valueOf(a9 * 1.0d));
            } else {
                list.add(Double.valueOf(1.0d * a9));
                list.add(Double.valueOf(a9 * (-1.0d)));
            }
        }
        double a10 = a(this.f9204d.size() - 1);
        if (f6 < 0.0f) {
            list.add(Double.valueOf(a10 * (-1.0d)));
        } else {
            list.add(Double.valueOf(a10 * 1.0d));
        }
    }

    private double a(int i) {
        List<Double> list = this.f9204d;
        if (list == null || list.size() <= i) {
            return Double.MAX_VALUE;
        }
        return this.f9204d.get(i).doubleValue();
    }

    @Override // com.anythink.basead.handler.BaseShakeSensorChangeHandlerImp
    public final void a() {
        super.a();
        c();
    }
}
