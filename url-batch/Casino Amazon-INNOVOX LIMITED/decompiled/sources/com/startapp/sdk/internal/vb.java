package com.startapp.sdk.internal;

import android.hardware.SensorEvent;
import com.startapp.motiondetector.TravelRecognizer;
import com.startapp.sdk.adsbase.remoteconfig.MotionMetadata;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: Sta */
/* loaded from: classes3.dex */
public final class vb extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedBlockingDeque f467a;
    public final TravelRecognizer b;
    public final AtomicLong c;
    public final AtomicLong d;
    public final AtomicLong e;

    public vb(String str, MotionMetadata motionMetadata, int i, double d, long j) {
        super(str);
        this.c = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.d = new AtomicLong(Double.doubleToRawLongBits(0.0d));
        this.e = new AtomicLong(0L);
        TravelRecognizer travelRecognizer = new TravelRecognizer(motionMetadata.f(), motionMetadata.g(), motionMetadata.h(), motionMetadata.i(), motionMetadata.s(), motionMetadata.t(), motionMetadata.d(), motionMetadata.e(), motionMetadata.b(), motionMetadata.a(), motionMetadata.c(), motionMetadata.o(), motionMetadata.p(), motionMetadata.m(), motionMetadata.l(), motionMetadata.n());
        this.b = travelRecognizer;
        travelRecognizer.setTravelProbabilityMaximum(d, j);
        this.f467a = new LinkedBlockingDeque(i);
    }

    public final boolean a(SensorEvent sensorEvent) {
        return this.f467a.offer(sensorEvent);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (true) {
            try {
                SensorEvent sensorEvent = (SensorEvent) this.f467a.take();
                if (sensorEvent == null) {
                    return;
                }
                TravelRecognizer travelRecognizer = this.b;
                long currentTimeMillis = System.currentTimeMillis();
                long j = sensorEvent.timestamp;
                float[] fArr = sensorEvent.values;
                travelRecognizer.add(currentTimeMillis, j, fArr[0], fArr[1], fArr[2]);
                this.c.set(Double.doubleToRawLongBits(this.b.getTravelProbability()));
                this.d.set(Double.doubleToRawLongBits(this.b.getTravelProbabilityMaximumValue()));
                this.e.set(this.b.getTravelProbabilityMaximumTime());
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th) {
                n8.a(th);
                return;
            }
        }
    }
}
