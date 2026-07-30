package com.baidu.mapapi.map;

import android.os.Bundle;
import java.util.Collection;

/* loaded from: classes2.dex */
public class HexagonMapData {

    /* renamed from: a, reason: collision with root package name */
    private double[] f5903a;

    /* renamed from: b, reason: collision with root package name */
    private double[] f5904b;

    /* renamed from: c, reason: collision with root package name */
    private double[] f5905c;

    /* renamed from: d, reason: collision with root package name */
    private float f5906d;

    public HexagonMapData(Collection<WeightedLatLng> collection, float f8) {
        int size = collection.size();
        this.f5903a = new double[size];
        this.f5904b = new double[size];
        this.f5905c = new double[size];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (WeightedLatLng weightedLatLng : collection) {
            this.f5903a[i8] = weightedLatLng.getPoint().x;
            this.f5904b[i9] = weightedLatLng.getPoint().y;
            this.f5905c[i10] = weightedLatLng.getIntensity();
            i10++;
            i9++;
            i8++;
        }
        this.f5906d = f8;
    }

    public void toBundle(Bundle bundle) {
        bundle.putDoubleArray("x_array", this.f5903a);
        bundle.putDoubleArray("y_array", this.f5904b);
        bundle.putDoubleArray("z_array", this.f5905c);
    }
}
