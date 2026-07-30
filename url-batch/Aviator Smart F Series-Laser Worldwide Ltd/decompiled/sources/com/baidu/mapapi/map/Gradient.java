package com.baidu.mapapi.map;

import android.graphics.Color;
import java.util.HashMap;

/* loaded from: classes2.dex */
public class Gradient {

    /* renamed from: a, reason: collision with root package name */
    private final int f5785a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f5786b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f5787c;

    /* renamed from: d, reason: collision with root package name */
    float[] f5788d;

    private class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f5789a;

        /* renamed from: b, reason: collision with root package name */
        private final int f5790b;

        /* renamed from: c, reason: collision with root package name */
        private final float f5791c;

        private b(int i8, int i9, float f8) {
            this.f5789a = i8;
            this.f5790b = i9;
            this.f5791c = f8;
        }
    }

    public Gradient(int[] iArr, float[] fArr) {
        this(iArr, fArr, 1000);
    }

    private HashMap<Integer, b> a() {
        HashMap<Integer, b> hashMap = new HashMap<>();
        if (this.f5787c[0] != 0.0f) {
            hashMap.put(0, new b(Color.argb(0, Color.red(this.f5786b[0]), Color.green(this.f5786b[0]), Color.blue(this.f5786b[0])), this.f5786b[0], this.f5785a * this.f5787c[0]));
        }
        for (int i8 = 1; i8 < this.f5786b.length; i8++) {
            int i9 = i8 - 1;
            Integer valueOf = Integer.valueOf((int) (this.f5785a * this.f5787c[i9]));
            int[] iArr = this.f5786b;
            int i10 = iArr[i9];
            int i11 = iArr[i8];
            float f8 = this.f5785a;
            float[] fArr = this.f5787c;
            hashMap.put(valueOf, new b(i10, i11, (fArr[i8] - fArr[i9]) * f8));
        }
        float[] fArr2 = this.f5787c;
        if (fArr2[fArr2.length - 1] != 1.0f) {
            int length = fArr2.length - 1;
            Integer valueOf2 = Integer.valueOf((int) (this.f5785a * fArr2[length]));
            int i12 = this.f5786b[length];
            hashMap.put(valueOf2, new b(i12, i12, this.f5785a * (1.0f - this.f5787c[length])));
        }
        return hashMap;
    }

    float[] b() {
        float[] fArr = this.f5788d;
        if (fArr != null) {
            return fArr;
        }
        this.f5788d = new float[this.f5785a];
        int i8 = 0;
        while (i8 < this.f5785a) {
            int i9 = i8 + 1;
            this.f5788d[i8] = i9 * 0.001f;
            i8 = i9;
        }
        return this.f5788d;
    }

    public int[] getColors() {
        return this.f5786b;
    }

    public float[] getStartPoints() {
        return this.f5787c;
    }

    private Gradient(int[] iArr, float[] fArr, int i8) {
        int[] a8 = com.baidu.platform.comapi.util.d.a(iArr);
        if (a8 == null || fArr == null) {
            throw new IllegalArgumentException("BDMapSDKException: colors and startPoints should not be null");
        }
        if (a8.length != fArr.length) {
            throw new IllegalArgumentException("BDMapSDKException: colors and startPoints should be same length");
        }
        if (a8.length == 0) {
            throw new IllegalArgumentException("BDMapSDKException: No colors have been defined");
        }
        for (int i9 = 1; i9 < fArr.length; i9++) {
            if (fArr[i9] <= fArr[i9 - 1]) {
                throw new IllegalArgumentException("BDMapSDKException: startPoints should be in increasing order");
            }
        }
        this.f5785a = i8;
        int[] iArr2 = new int[a8.length];
        this.f5786b = iArr2;
        float[] fArr2 = new float[fArr.length];
        this.f5787c = fArr2;
        System.arraycopy(a8, 0, iArr2, 0, a8.length);
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
    }

    int[] a(double d8) {
        HashMap<Integer, b> a8 = a();
        int[] iArr = new int[this.f5785a];
        b bVar = a8.get(0);
        int i8 = 0;
        for (int i9 = 0; i9 < this.f5785a; i9++) {
            if (a8.containsKey(Integer.valueOf(i9))) {
                bVar = a8.get(Integer.valueOf(i9));
                i8 = i9;
            }
            iArr[i9] = a(bVar.f5789a, bVar.f5790b, (i9 - i8) / bVar.f5791c);
        }
        if (d8 != 1.0d) {
            for (int i10 = 0; i10 < this.f5785a; i10++) {
                int i11 = iArr[i10];
                iArr[i10] = Color.argb((int) (Color.alpha(i11) * d8), Color.red(i11), Color.green(i11), Color.blue(i11));
            }
        }
        return iArr;
    }

    private static int a(int i8, int i9, float f8) {
        int alpha = (int) (((Color.alpha(i9) - Color.alpha(i8)) * f8) + Color.alpha(i8));
        float[] fArr = new float[3];
        Color.RGBToHSV(Color.red(i8), Color.green(i8), Color.blue(i8), fArr);
        float[] fArr2 = new float[3];
        Color.RGBToHSV(Color.red(i9), Color.green(i9), Color.blue(i9), fArr2);
        float f9 = fArr[0];
        float f10 = fArr2[0];
        if (f9 - f10 > 180.0f) {
            fArr2[0] = f10 + 360.0f;
        } else if (f10 - f9 > 180.0f) {
            fArr[0] = f9 + 360.0f;
        }
        float[] fArr3 = new float[3];
        for (int i10 = 0; i10 < 3; i10++) {
            float f11 = fArr2[i10];
            float f12 = fArr[i10];
            fArr3[i10] = ((f11 - f12) * f8) + f12;
        }
        return Color.HSVToColor(alpha, fArr3);
    }
}
