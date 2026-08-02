package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class nc extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f4200a;

    /* renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f4201b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f4202c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f4203d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f4204e;

    public nc(String str, MotionMetadata motionMetadata, int i3, double d3, long j3) {
        super(str);
        this.f4202c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f4203d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f4204e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f4201b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d3, j3);
        this.f4200a = new LinkedBlockingDeque(i3);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f4200a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f4200a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f4201b;
                long currentTimeMillis = System.currentTimeMillis();
                long j3 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(currentTimeMillis, j3, fArr[0], fArr[1], fArr[2]);
                this.f4202c.set(Double.doubleToRawLongBits(this.f4201b.getTravelProbability()));
                this.f4203d.set(Double.doubleToRawLongBits(this.f4201b.getTravelProbabilityMaximumValue()));
                this.f4204e.set(this.f4201b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
    }
}
