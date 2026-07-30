package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;

/* renamed from: com.google.android.gms.internal.ads.wg, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4127wg extends AbstractC3605mx {

    /* renamed from: a, reason: collision with root package name */
    public final SensorManager f35015a;

    /* renamed from: c, reason: collision with root package name */
    public final Display f35017c;

    /* renamed from: f, reason: collision with root package name */
    public float[] f35020f;

    /* renamed from: g, reason: collision with root package name */
    public Z2.e f35021g;

    /* renamed from: h, reason: collision with root package name */
    public C4181xg f35022h;

    /* renamed from: d, reason: collision with root package name */
    public final float[] f35018d = new float[9];

    /* renamed from: e, reason: collision with root package name */
    public final float[] f35019e = new float[9];

    /* renamed from: b, reason: collision with root package name */
    public final Object f35016b = new Object();

    public C4127wg(Context context) {
        this.f35015a = (SensorManager) context.getSystemService("sensor");
        this.f35017c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3605mx
    public final void a(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.f35016b) {
            try {
                if (this.f35020f == null) {
                    this.f35020f = new float[9];
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        float[] fArr2 = this.f35018d;
        SensorManager.getRotationMatrixFromVector(fArr2, fArr);
        int rotation = this.f35017c.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(fArr2, 2, com.anythink.expressad.video.module.a.a.f21888T, this.f35019e);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f21888T, com.anythink.expressad.video.module.a.a.f21889U, this.f35019e);
        } else if (rotation != 3) {
            System.arraycopy(fArr2, 0, this.f35019e, 0, 9);
        } else {
            SensorManager.remapCoordinateSystem(fArr2, com.anythink.expressad.video.module.a.a.f21889U, 1, this.f35019e);
        }
        float[] fArr3 = this.f35019e;
        float f6 = fArr3[1];
        fArr3[1] = fArr3[3];
        fArr3[3] = f6;
        float f9 = fArr3[2];
        fArr3[2] = fArr3[6];
        fArr3[6] = f9;
        float f10 = fArr3[5];
        fArr3[5] = fArr3[7];
        fArr3[7] = f10;
        synchronized (this.f35016b) {
            System.arraycopy(fArr3, 0, this.f35020f, 0, 9);
        }
        C4181xg c4181xg = this.f35022h;
        if (c4181xg != null) {
            Object obj = c4181xg.f35207N;
            synchronized (obj) {
                obj.notifyAll();
            }
        }
    }

    public final void b() {
        if (this.f35021g == null) {
            return;
        }
        this.f35015a.unregisterListener(this);
        this.f35021g.post(new U6(3));
        this.f35021g = null;
    }

    public final boolean c(float[] fArr) {
        synchronized (this.f35016b) {
            try {
                float[] fArr2 = this.f35020f;
                if (fArr2 == null) {
                    return false;
                }
                System.arraycopy(fArr2, 0, fArr, 0, 9);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
