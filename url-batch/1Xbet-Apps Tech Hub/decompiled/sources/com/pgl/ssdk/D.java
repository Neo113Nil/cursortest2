package com.pgl.ssdk;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/* compiled from: SDKSensorCollector.java */
/* loaded from: classes3.dex */
public final class D implements SensorEventListener {
    private static D f;
    private SensorManager a;
    private int b;
    private int c = 0;
    private float[] d = new float[3];
    private List<String> e = new ArrayList();

    private D(Context context) {
        this.a = null;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            try {
                this.a = (SensorManager) applicationContext.getSystemService("sensor");
            } catch (Throwable unused) {
            }
        }
    }

    private synchronized void c() {
        try {
            SensorManager sensorManager = this.a;
            if (sensorManager != null) {
                int i = this.b - 1;
                this.b = i;
                if (i == 0) {
                    sensorManager.unregisterListener(this);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
    
        if (r7.a.registerListener(r7, r3.getDefaultSensor(1), 3) != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        String str;
        StringBuilder append;
        try {
            try {
                synchronized (this) {
                    try {
                        SensorManager sensorManager = this.a;
                        if (sensorManager != null) {
                            if (this.b == 0) {
                            }
                            this.b++;
                        }
                    } catch (Exception unused) {
                    }
                }
                synchronized (this) {
                    int i = 0;
                    while (this.c == 0 && i < 10) {
                        i++;
                        wait(100L);
                    }
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.0");
                append = new StringBuilder().append(decimalFormat.format(this.d[0])).append(",").append(decimalFormat.format(this.d[1])).append(",").append(decimalFormat.format(this.d[2]));
            } catch (Throwable unused2) {
                DecimalFormat decimalFormat2 = new DecimalFormat("0.0");
                append = new StringBuilder().append(decimalFormat2.format(this.d[0])).append(",").append(decimalFormat2.format(this.d[1])).append(",").append(decimalFormat2.format(this.d[2]));
            }
            str = append.toString();
        } catch (Throwable unused3) {
            str = null;
        }
        c();
        this.c = 0;
        if (str == null) {
            return;
        }
        this.e.add(str);
        try {
            int size = this.e.size();
            if (size > 20) {
                ArrayList arrayList = new ArrayList(this.e.subList(size - 10, size));
                this.e.clear();
                this.e = arrayList;
            }
        } catch (Throwable unused4) {
        }
    }

    public synchronized String b() {
        String str = "";
        int size = this.e.size();
        if (size <= 0) {
            return "";
        }
        if (size == 1) {
            return this.e.get(0);
        }
        try {
            List<String> list = this.e;
            int i = size - 10;
            if (i <= 0) {
                i = 0;
            }
            List<String> subList = list.subList(i, size);
            for (int i2 = 0; i2 < subList.size(); i2++) {
                str = str + subList.get(i2) + "|";
            }
            str = str.substring(0, str.length() - 1);
        } catch (Throwable unused) {
        }
        return str;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        this.d = sensorEvent.values;
        this.c = 1;
    }

    public static D a(Context context) {
        if (f == null) {
            synchronized (D.class) {
                if (f == null) {
                    f = new D(context);
                }
            }
        }
        return f;
    }
}
