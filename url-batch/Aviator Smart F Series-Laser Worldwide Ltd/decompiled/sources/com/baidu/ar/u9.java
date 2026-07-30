package com.baidu.ar;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.baidu.ar.arplay.representation.Matrix;
import com.baidu.ar.arplay.representation.Matrixf4x4;
import com.baidu.ar.arplay.representation.Quaternion;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Observable;

/* loaded from: classes.dex */
public abstract class u9 extends Observable implements SensorEventListener {

    /* renamed from: m, reason: collision with root package name */
    public static final String f3394m = "u9";

    /* renamed from: g, reason: collision with root package name */
    public SensorManager f3401g;

    /* renamed from: l, reason: collision with root package name */
    public float[] f3406l;

    /* renamed from: a, reason: collision with root package name */
    public Object f3395a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public Boolean f3396b = Boolean.TRUE;

    /* renamed from: c, reason: collision with root package name */
    public final Object f3397c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public List<Sensor> f3398d = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public boolean f3402h = false;

    /* renamed from: e, reason: collision with root package name */
    public final Matrixf4x4 f3399e = new Matrixf4x4();

    /* renamed from: f, reason: collision with root package name */
    public final Quaternion f3400f = new Quaternion();

    /* renamed from: i, reason: collision with root package name */
    public final Matrixf4x4 f3403i = new Matrixf4x4();

    /* renamed from: j, reason: collision with root package name */
    public final Matrixf4x4 f3404j = new Matrixf4x4();

    /* renamed from: k, reason: collision with root package name */
    public final Matrixf4x4 f3405k = new Matrixf4x4();

    public u9(SensorManager sensorManager) {
        this.f3401g = sensorManager;
        h.a(f3394m, "sensorList size " + String.valueOf(this.f3398d.size()));
        if (this.f3398d.size() > 120) {
            this.f3398d.clear();
        }
    }

    public static void b(float[] fArr, float[] fArr2) {
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
    }

    public Matrixf4x4 a() {
        return this.f3405k;
    }

    public boolean c() {
        Iterator<Sensor> it = this.f3398d.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                return false;
            }
        }
        return true;
    }

    public void d() {
        deleteObservers();
        Iterator<Sensor> it = this.f3398d.iterator();
        while (it.hasNext()) {
            this.f3401g.unregisterListener(this, it.next());
        }
        this.f3398d.clear();
    }

    public void e() {
        Iterator<Sensor> it = this.f3398d.iterator();
        while (it.hasNext()) {
            this.f3401g.registerListener(this, it.next(), 1);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i8) {
    }

    public static void a(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        Matrix.invertM(fArr4, 0, fArr3, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr4, 0);
    }

    public float[] b() {
        return this.f3406l;
    }

    public static boolean a(float[] fArr, float[] fArr2) {
        float f8;
        float[] fArr3 = new float[4];
        float[] fArr4 = {1.0f, 0.0f, 0.0f, 0.0f};
        Matrix.multiplyMV(fArr3, fArr2, fArr4);
        if (Float.compare(fArr3[0], fArr4[0]) == 0 && Float.compare(fArr3[1], fArr4[1]) == 0 && Float.compare(fArr3[2], fArr4[2]) == 0) {
            return false;
        }
        int compare = Float.compare(fArr3[0], 0.0f);
        int compare2 = Float.compare(fArr3[1], 0.0f);
        if (compare != 0) {
            double d8 = fArr3[1] / fArr3[0];
            f8 = (compare <= 0 || compare2 < 0) ? (compare <= 0 || compare2 >= 0) ? ((float) ((Math.atan(d8) * 180.0d) / 3.141592653589793d)) + 180.0f : 360.0f + ((float) ((Math.atan(d8) * 180.0d) / 3.141592653589793d)) : (float) ((Math.atan(d8) * 180.0d) / 3.141592653589793d);
        } else {
            f8 = (Float.compare(fArr3[1], 1.0f) != 0 && Float.compare(fArr3[1], -1.0f) == 0) ? 180.0f : 0.0f;
        }
        h.a(f3394m, "orientation: outputV[0] = " + fArr3[0] + ", outputV[1] = " + fArr3[1] + ", angleZ = " + f8);
        Matrix.setIdentityM(fArr, 0);
        Matrix.rotateM(fArr, 0, f8, 0.0f, 0.0f, 1.0f);
        return true;
    }
}
