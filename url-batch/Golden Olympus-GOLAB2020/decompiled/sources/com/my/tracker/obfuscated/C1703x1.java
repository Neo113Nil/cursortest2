package com.my.tracker.obfuscated;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.my.tracker.config.AntiFraudConfig;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.my.tracker.obfuscated.x1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1703x1 {

    /* renamed from: b, reason: collision with root package name */
    final C1631f0 f21560b;

    /* renamed from: c, reason: collision with root package name */
    final AntiFraudConfig f21561c;

    /* renamed from: d, reason: collision with root package name */
    final Context f21562d;

    /* renamed from: e, reason: collision with root package name */
    a f21563e;

    /* renamed from: f, reason: collision with root package name */
    Runnable f21564f;

    /* renamed from: g, reason: collision with root package name */
    Runnable f21565g;

    /* renamed from: a, reason: collision with root package name */
    final AtomicInteger f21559a = new AtomicInteger();

    /* renamed from: h, reason: collision with root package name */
    long f21566h = -1;

    /* renamed from: com.my.tracker.obfuscated.x1$a */
    static final class a implements SensorEventListener {

        /* renamed from: a, reason: collision with root package name */
        private final C1631f0 f21567a;

        /* renamed from: b, reason: collision with root package name */
        private final SensorManager f21568b;

        /* renamed from: c, reason: collision with root package name */
        private final AntiFraudConfig f21569c;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList f21570d = new ArrayList();

        a(C1631f0 c1631f0, SensorManager sensorManager, AntiFraudConfig antiFraudConfig) {
            this.f21567a = c1631f0;
            this.f21568b = sensorManager;
            this.f21569c = antiFraudConfig;
        }

        public static a a(C1631f0 c1631f0, Context context, AntiFraudConfig antiFraudConfig) {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (sensorManager == null) {
                return null;
            }
            return new a(c1631f0, sensorManager, antiFraudConfig);
        }

        public void b() {
            AbstractC1708y2.a("SensorEventListenerImpl: stop()");
            ArrayList arrayList = this.f21570d;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                try {
                    this.f21568b.unregisterListener(this, (Sensor) obj);
                } catch (Throwable th) {
                    AbstractC1708y2.a("SensorEventListenerImpl: exception at unregister listener: " + th);
                }
            }
            this.f21570d.clear();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i4) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            StringBuilder sb;
            float f4;
            int type = sensorEvent.sensor.getType();
            if (type == 2) {
                C1631f0 c1631f0 = this.f21567a;
                float[] fArr = sensorEvent.values;
                c1631f0.b(fArr[0], fArr[1], fArr[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: magnetometer - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f4 = sensorEvent.values[2];
            } else if (type == 8) {
                this.f21567a.c(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: proximity - ");
                f4 = sensorEvent.values[0];
            } else if (type == 4) {
                C1631f0 c1631f02 = this.f21567a;
                float[] fArr2 = sensorEvent.values;
                c1631f02.a(fArr2[0], fArr2[1], fArr2[2]);
                sb = new StringBuilder();
                sb.append("SensorHandler: gyroscope - ");
                sb.append(sensorEvent.values[0]);
                sb.append(", ");
                sb.append(sensorEvent.values[1]);
                sb.append(", ");
                f4 = sensorEvent.values[2];
            } else if (type == 5) {
                this.f21567a.a(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: light - ");
                f4 = sensorEvent.values[0];
            } else {
                if (type != 6) {
                    return;
                }
                this.f21567a.b(sensorEvent.values[0]);
                sb = new StringBuilder();
                sb.append("SensorHandler: pressure - ");
                f4 = sensorEvent.values[0];
            }
            sb.append(f4);
            AbstractC1708y2.a(sb.toString());
        }

        public void a() {
            AbstractC1708y2.a("SensorEventListenerImpl: start()");
            int[] iArr = {5, 2, 4, 6, 8};
            for (int i4 = 0; i4 < 5; i4++) {
                int i5 = iArr[i4];
                if ((i5 != 5 || this.f21569c.useLightSensor) && ((i5 != 2 || this.f21569c.useMagneticFieldSensor) && ((i5 != 4 || this.f21569c.useGyroscope) && ((i5 != 6 || this.f21569c.usePressureSensor) && (i5 != 8 || this.f21569c.useProximitySensor))))) {
                    try {
                        Sensor defaultSensor = this.f21568b.getDefaultSensor(i5);
                        if (defaultSensor != null) {
                            this.f21568b.registerListener(this, defaultSensor, 1000000);
                            this.f21570d.add(defaultSensor);
                        }
                    } catch (Throwable th) {
                        AbstractC1708y2.a("SensorEventListenerImpl: exception at register listener: " + th);
                    }
                }
            }
        }
    }

    C1703x1(C1631f0 c1631f0, AntiFraudConfig antiFraudConfig, Context context) {
        this.f21560b = c1631f0;
        this.f21561c = antiFraudConfig;
        this.f21562d = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        AbstractC1658m.a(new Runnable() { // from class: com.my.tracker.obfuscated.B3
            @Override // java.lang.Runnable
            public final void run() {
                C1703x1.this.a();
            }
        });
    }

    public void a(final long j4) {
        if (j4 <= 0) {
            AbstractC1708y2.a("SensorHandler: install timestamp is empty, do nothing");
            return;
        }
        if (!this.f21559a.compareAndSet(0, 1)) {
            AbstractC1708y2.a("SensorHandler: handler has already been initialized");
            return;
        }
        a a4 = a.a(this.f21560b, this.f21562d.getApplicationContext(), this.f21561c);
        this.f21563e = a4;
        if (a4 == null) {
            AbstractC1708y2.a("SensorHandler: sensor event listener is null");
            return;
        }
        this.f21564f = new Runnable() { // from class: com.my.tracker.obfuscated.z3
            @Override // java.lang.Runnable
            public final void run() {
                C1703x1.this.b();
            }
        };
        this.f21565g = new Runnable() { // from class: com.my.tracker.obfuscated.A3
            @Override // java.lang.Runnable
            public final void run() {
                C1703x1.this.b(j4);
            }
        };
        this.f21566h = j4;
        AbstractC1708y2.a("SensorHandler: initialized");
        this.f21565g.run();
    }

    public void c() {
        Runnable runnable = this.f21565g;
        if (runnable == null) {
            AbstractC1708y2.a("SensorHandler: can't start, startRunnable is null");
        } else {
            AbstractC1658m.a(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        if (!this.f21559a.compareAndSet(2, 1)) {
            AbstractC1708y2.a("SensorHandler: handle isn't running");
        } else {
            this.f21563e.b();
            this.f21560b.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(long j4) {
        if (!this.f21559a.compareAndSet(1, 2)) {
            AbstractC1708y2.a("SensorHandler: handler can't start, current state: " + this.f21559a.get());
            return;
        }
        if (this.f21563e == null) {
            AbstractC1708y2.a("SensorHandler: handler can't start, sensor event listener is null");
        } else if (AbstractC1700w2.a() - j4 > 259200) {
            AbstractC1708y2.a("SensorHandler: more than 259200 seconds passed since the app was installed");
        } else {
            this.f21563e.a();
            AbstractC1658m.f21416a.postDelayed(this.f21564f, 20000L);
        }
    }

    public static C1703x1 a(C1631f0 c1631f0, AntiFraudConfig antiFraudConfig, Context context) {
        return new C1703x1(c1631f0, antiFraudConfig, context);
    }
}
