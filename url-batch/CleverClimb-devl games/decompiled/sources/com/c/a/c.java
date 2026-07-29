package com.c.a;

import android.view.animation.Interpolator;
import com.c.a.e;
import java.util.ArrayList;

/* compiled from: FloatKeyframeSet.java */
/* loaded from: classes.dex */
class c extends f {
    private float g;
    private float h;
    private float i;
    private boolean j;

    public c(e.a... aVarArr) {
        super(aVarArr);
        this.j = true;
    }

    @Override // com.c.a.f
    public Object a(float f) {
        return Float.valueOf(b(f));
    }

    @Override // com.c.a.f
    /* renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c clone() {
        ArrayList<e> arrayList = this.e;
        int size = this.e.size();
        e.a[] aVarArr = new e.a[size];
        for (int i = 0; i < size; i++) {
            aVarArr[i] = (e.a) arrayList.get(i).e();
        }
        return new c(aVarArr);
    }

    public float b(float f) {
        if (this.f3530a == 2) {
            if (this.j) {
                this.j = false;
                this.g = ((e.a) this.e.get(0)).f();
                this.h = ((e.a) this.e.get(1)).f();
                this.i = this.h - this.g;
            }
            if (this.f3533d != null) {
                f = this.f3533d.getInterpolation(f);
            }
            if (this.f == null) {
                return this.g + (f * this.i);
            }
            return ((Number) this.f.a(f, Float.valueOf(this.g), Float.valueOf(this.h))).floatValue();
        }
        if (f <= 0.0f) {
            e.a aVar = (e.a) this.e.get(0);
            e.a aVar2 = (e.a) this.e.get(1);
            float f2 = aVar.f();
            float f3 = aVar2.f();
            float c2 = aVar.c();
            float c3 = aVar2.c();
            Interpolator d2 = aVar2.d();
            if (d2 != null) {
                f = d2.getInterpolation(f);
            }
            float f4 = (f - c2) / (c3 - c2);
            return this.f == null ? f2 + (f4 * (f3 - f2)) : ((Number) this.f.a(f4, Float.valueOf(f2), Float.valueOf(f3))).floatValue();
        }
        if (f >= 1.0f) {
            e.a aVar3 = (e.a) this.e.get(this.f3530a - 2);
            e.a aVar4 = (e.a) this.e.get(this.f3530a - 1);
            float f5 = aVar3.f();
            float f6 = aVar4.f();
            float c4 = aVar3.c();
            float c5 = aVar4.c();
            Interpolator d3 = aVar4.d();
            if (d3 != null) {
                f = d3.getInterpolation(f);
            }
            float f7 = (f - c4) / (c5 - c4);
            return this.f == null ? f5 + (f7 * (f6 - f5)) : ((Number) this.f.a(f7, Float.valueOf(f5), Float.valueOf(f6))).floatValue();
        }
        e.a aVar5 = (e.a) this.e.get(0);
        int i = 1;
        while (i < this.f3530a) {
            e.a aVar6 = (e.a) this.e.get(i);
            if (f < aVar6.c()) {
                Interpolator d4 = aVar6.d();
                if (d4 != null) {
                    f = d4.getInterpolation(f);
                }
                float c6 = (f - aVar5.c()) / (aVar6.c() - aVar5.c());
                float f8 = aVar5.f();
                float f9 = aVar6.f();
                return this.f == null ? f8 + (c6 * (f9 - f8)) : ((Number) this.f.a(c6, Float.valueOf(f8), Float.valueOf(f9))).floatValue();
            }
            i++;
            aVar5 = aVar6;
        }
        return ((Number) this.e.get(this.f3530a - 1).b()).floatValue();
    }
}
