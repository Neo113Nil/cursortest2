package com.c.a;

import android.view.animation.Interpolator;
import com.c.a.e;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: KeyframeSet.java */
/* loaded from: classes.dex */
class f {

    /* renamed from: a, reason: collision with root package name */
    int f3530a;

    /* renamed from: b, reason: collision with root package name */
    e f3531b;

    /* renamed from: c, reason: collision with root package name */
    e f3532c;

    /* renamed from: d, reason: collision with root package name */
    Interpolator f3533d;
    ArrayList<e> e = new ArrayList<>();
    j f;

    public f(e... eVarArr) {
        this.f3530a = eVarArr.length;
        this.e.addAll(Arrays.asList(eVarArr));
        this.f3531b = this.e.get(0);
        this.f3532c = this.e.get(this.f3530a - 1);
        this.f3533d = this.f3532c.d();
    }

    public static f a(float... fArr) {
        int length = fArr.length;
        e.a[] aVarArr = new e.a[Math.max(length, 2)];
        if (length == 1) {
            aVarArr[0] = (e.a) e.a(0.0f);
            aVarArr[1] = (e.a) e.a(1.0f, fArr[0]);
        } else {
            aVarArr[0] = (e.a) e.a(0.0f, fArr[0]);
            for (int i = 1; i < length; i++) {
                aVarArr[i] = (e.a) e.a(i / (length - 1), fArr[i]);
            }
        }
        return new c(aVarArr);
    }

    public void a(j jVar) {
        this.f = jVar;
    }

    @Override // 
    /* renamed from: b */
    public f clone() {
        ArrayList<e> arrayList = this.e;
        int size = this.e.size();
        e[] eVarArr = new e[size];
        for (int i = 0; i < size; i++) {
            eVarArr[i] = arrayList.get(i).e();
        }
        return new f(eVarArr);
    }

    public Object a(float f) {
        if (this.f3530a == 2) {
            if (this.f3533d != null) {
                f = this.f3533d.getInterpolation(f);
            }
            return this.f.a(f, this.f3531b.b(), this.f3532c.b());
        }
        int i = 1;
        if (f <= 0.0f) {
            e eVar = this.e.get(1);
            Interpolator d2 = eVar.d();
            if (d2 != null) {
                f = d2.getInterpolation(f);
            }
            float c2 = this.f3531b.c();
            return this.f.a((f - c2) / (eVar.c() - c2), this.f3531b.b(), eVar.b());
        }
        if (f >= 1.0f) {
            e eVar2 = this.e.get(this.f3530a - 2);
            Interpolator d3 = this.f3532c.d();
            if (d3 != null) {
                f = d3.getInterpolation(f);
            }
            float c3 = eVar2.c();
            return this.f.a((f - c3) / (this.f3532c.c() - c3), eVar2.b(), this.f3532c.b());
        }
        e eVar3 = this.f3531b;
        while (i < this.f3530a) {
            e eVar4 = this.e.get(i);
            if (f < eVar4.c()) {
                Interpolator d4 = eVar4.d();
                if (d4 != null) {
                    f = d4.getInterpolation(f);
                }
                float c4 = eVar3.c();
                return this.f.a((f - c4) / (eVar4.c() - c4), eVar3.b(), eVar4.b());
            }
            i++;
            eVar3 = eVar4;
        }
        return this.f3532c.b();
    }

    public String toString() {
        String str = " ";
        for (int i = 0; i < this.f3530a; i++) {
            str = str + this.e.get(i).b() + "  ";
        }
        return str;
    }
}
