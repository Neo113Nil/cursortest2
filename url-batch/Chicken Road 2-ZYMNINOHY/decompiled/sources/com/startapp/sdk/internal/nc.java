package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class nc extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f7333a;

    /* renamed from: b, reason: collision with root package name */
    public final TravelRecognizer f7334b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicLong f7335c;

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f7336d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f7337e;

    public nc(String str, MotionMetadata motionMetadata, int i4, double d4, long j4) {
        super(str);
        this.f7335c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f7336d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.f7337e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.f7334b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d4, j4);
        this.f7333a = new LinkedBlockingDeque(i4);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f7333a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f7333a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.f7334b;
                long currentTimeMillis = System.currentTimeMillis();
                long j4 = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(currentTimeMillis, j4, fArr[0], fArr[1], fArr[2]);
                this.f7335c.set(Double.doubleToRawLongBits(this.f7334b.getTravelProbability()));
                this.f7336d.set(Double.doubleToRawLongBits(this.f7334b.getTravelProbabilityMaximumValue()));
                this.f7337e.set(this.f7334b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                d9.a(th);
                return;
            }
        }
    }
}
