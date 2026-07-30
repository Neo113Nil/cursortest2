package com.baidu.ar;

import android.util.Log;

/* loaded from: classes.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public float[] f3264a;

    /* renamed from: b, reason: collision with root package name */
    public float f3265b = -1.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f3266c;

    public boolean a(float f8) {
        float f9 = this.f3265b;
        if (f9 == -1.0f) {
            this.f3265b = f8;
            return false;
        }
        if (f8 <= f9) {
            return false;
        }
        Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: heading accuracy > localAccuracy");
        this.f3265b = f8;
        return true;
    }

    public boolean a(float[] fArr, float f8) {
        if (this.f3264a == null) {
            this.f3264a = fArr;
        }
        if (f8 < this.f3266c) {
            Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: accuracy < mLatlonAcuracy: accuracy:" + f8 + ", mLatlonAcuracy:" + this.f3266c);
            this.f3266c = f8;
            return true;
        }
        float[] fArr2 = this.f3264a;
        float a8 = u8.a(fArr2[0], fArr2[1], fArr[0], fArr[1]);
        Log.e("CoordinateStrategy", "distance:" + a8);
        if (a8 < 20.0f) {
            return false;
        }
        this.f3264a = fArr;
        Log.e("CoordinateStrategy", "The condition of rebinding coordinate system is satisfied: latlng diatance >=20");
        return true;
    }
}
