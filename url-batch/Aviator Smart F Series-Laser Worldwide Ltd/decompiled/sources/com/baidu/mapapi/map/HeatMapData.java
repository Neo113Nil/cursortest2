package com.baidu.mapapi.map;

import android.os.Bundle;
import java.util.Collection;

/* loaded from: classes2.dex */
public class HeatMapData {

    /* renamed from: a, reason: collision with root package name */
    private double[] f5873a;

    /* renamed from: b, reason: collision with root package name */
    private double[] f5874b;

    /* renamed from: c, reason: collision with root package name */
    private double[] f5875c;

    /* renamed from: d, reason: collision with root package name */
    private float f5876d;

    public HeatMapData(Collection<WeightedLatLng> collection, float f8) {
        int size = collection.size();
        this.f5873a = new double[size];
        this.f5874b = new double[size];
        this.f5875c = new double[size];
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        for (WeightedLatLng weightedLatLng : collection) {
            this.f5873a[i8] = weightedLatLng.getPoint().x;
            this.f5874b[i9] = weightedLatLng.getPoint().y;
            this.f5875c[i10] = weightedLatLng.getIntensity();
            i10++;
            i9++;
            i8++;
        }
        this.f5876d = f8;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putDoubleArray("x_array", this.f5873a);
        bundle.putDoubleArray("y_array", this.f5874b);
        bundle.putDoubleArray("z_array", this.f5875c);
        bundle.putFloat("max_intentity", this.f5876d);
        return bundle;
    }
}
