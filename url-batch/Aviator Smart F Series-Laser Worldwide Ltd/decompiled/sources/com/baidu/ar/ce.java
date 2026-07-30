package com.baidu.ar;

import com.baidu.ar.marker.model.LocationMarkerData;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ce extends h1 implements de {

    /* renamed from: h, reason: collision with root package name */
    public List<ja> f1976h;

    /* renamed from: i, reason: collision with root package name */
    public double f1977i;

    /* renamed from: j, reason: collision with root package name */
    public float f1978j;

    public ce(String str, int i8) {
        super(str, i8);
    }

    @Override // com.baidu.ar.de
    public void a(String str, double d8) {
        this.f1977i = d8;
        this.f1978j = 0.0f;
    }

    public void b(u6 u6Var) {
        this.f2311f = u6Var;
    }

    @Override // com.baidu.ar.de
    public void c(float[] fArr) {
        this.f2308c = fArr;
        this.f2306a = true;
        u6 u6Var = this.f2311f;
        if (u6Var != null) {
            u6Var.a(this);
        }
    }

    @Override // com.baidu.ar.de
    public void a(String str, s2 s2Var) {
    }

    @Override // com.baidu.ar.de
    public void a(boolean z7, String str, List<LocationMarkerData> list) {
        if (z7) {
            this.f1976h = new ArrayList();
            for (int i8 = 0; i8 < list.size(); i8++) {
                LocationMarkerData locationMarkerData = list.get(i8);
                ja jaVar = new ja();
                String str2 = locationMarkerData.floorId;
                s2 s2Var = new s2();
                double[] dArr = locationMarkerData.locationPoints;
                s2Var.f3191a = (float) dArr[0];
                s2Var.f3192b = (float) dArr[1];
                this.f1976h.add(jaVar);
            }
        }
    }

    @Override // com.baidu.ar.de
    public void a(float[] fArr) {
        this.f2353g = fArr;
    }
}
