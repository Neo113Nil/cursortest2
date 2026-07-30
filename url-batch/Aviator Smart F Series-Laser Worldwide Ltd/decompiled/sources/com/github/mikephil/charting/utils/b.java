package com.github.mikephil.charting.utils;

import com.github.mikephil.charting.utils.f;
import java.util.List;

/* loaded from: classes3.dex */
public final class b extends f.a {
    private static f pool;
    public float height;
    public float width;

    static {
        f create = f.create(256, new b(0.0f, 0.0f));
        pool = create;
        create.setReplenishPercentage(0.5f);
    }

    public b() {
    }

    public static b getInstance(float f8, float f9) {
        b bVar = (b) pool.get();
        bVar.width = f8;
        bVar.height = f9;
        return bVar;
    }

    public static void recycleInstance(b bVar) {
        pool.recycle(bVar);
    }

    public static void recycleInstances(List<b> list) {
        pool.recycle(list);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.width == bVar.width && this.height == bVar.height;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.width) ^ Float.floatToIntBits(this.height);
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new b(0.0f, 0.0f);
    }

    public String toString() {
        return this.width + "x" + this.height;
    }

    public b(float f8, float f9) {
        this.width = f8;
        this.height = f9;
    }
}
