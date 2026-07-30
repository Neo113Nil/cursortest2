package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.f;
import java.util.List;

/* loaded from: classes3.dex */
public class d extends f.a {
    private static f pool;

    /* renamed from: x, reason: collision with root package name */
    public double f14112x;

    /* renamed from: y, reason: collision with root package name */
    public double f14113y;

    static {
        f create = f.create(64, new d(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    private d(double d8, double d9) {
        this.f14112x = d8;
        this.f14113y = d9;
    }

    public static d getInstance(double d8, double d9) {
        d dVar = (d) pool.get();
        dVar.f14112x = d8;
        dVar.f14113y = d9;
        return dVar;
    }

    public static void recycleInstance(d dVar) {
        pool.recycle(dVar);
    }

    public static void recycleInstances(List<d> list) {
        pool.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new d(i.DOUBLE_EPSILON, i.DOUBLE_EPSILON);
    }

    public String toString() {
        return "MPPointD, x: " + this.f14112x + ", y: " + this.f14113y;
    }
}
