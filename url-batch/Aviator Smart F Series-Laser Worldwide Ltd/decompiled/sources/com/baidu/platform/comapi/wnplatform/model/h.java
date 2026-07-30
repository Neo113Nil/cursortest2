package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
class h {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f10512a;

    /* renamed from: b, reason: collision with root package name */
    private final List<LatLng> f10513b = new ArrayList();

    public h(Bundle bundle) {
        this.f10512a = bundle;
    }

    public List<LatLng> a() {
        if (!this.f10513b.isEmpty()) {
            return this.f10513b;
        }
        double[] doubleArray = this.f10512a.getDoubleArray("pointsX");
        if (doubleArray == null) {
            return this.f10513b;
        }
        double[] doubleArray2 = this.f10512a.getDoubleArray("pointsY");
        if (doubleArray2 == null) {
            return this.f10513b;
        }
        int length = doubleArray.length;
        int length2 = doubleArray2.length;
        if (length == 0 || length != length2) {
            return this.f10513b;
        }
        for (int i8 = 0; i8 < length; i8++) {
            this.f10513b.add(CoordTrans.gcjToBaidu(new LatLng(doubleArray2[i8], doubleArray[i8])));
        }
        return this.f10513b;
    }
}
