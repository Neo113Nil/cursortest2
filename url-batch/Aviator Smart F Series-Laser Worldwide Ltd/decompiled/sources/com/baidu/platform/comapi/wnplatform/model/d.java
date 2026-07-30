package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;

/* loaded from: classes2.dex */
public class d extends a {

    /* renamed from: a, reason: collision with root package name */
    private float f10485a;

    /* renamed from: b, reason: collision with root package name */
    private float f10486b;

    /* renamed from: c, reason: collision with root package name */
    private double f10487c;

    /* renamed from: d, reason: collision with root package name */
    private double f10488d;

    /* renamed from: e, reason: collision with root package name */
    private float f10489e;

    /* renamed from: f, reason: collision with root package name */
    private float f10490f;

    /* renamed from: g, reason: collision with root package name */
    private double f10491g;

    /* renamed from: h, reason: collision with root package name */
    private double f10492h;

    public float a() {
        return this.f10485a;
    }

    public double b() {
        return this.f10488d;
    }

    public double c() {
        return this.f10487c;
    }

    public float d() {
        return this.f10486b;
    }

    public float e() {
        return this.f10489e;
    }

    public double f() {
        return this.f10492h;
    }

    public double g() {
        return this.f10491g;
    }

    public float h() {
        return this.f10490f;
    }

    public boolean a(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        this.f10485a = bundle.getFloat("gpsDirection", -1.0f);
        this.f10486b = bundle.getFloat("gpsSpeed", 0.0f);
        LatLng gcjToBaidu = CoordTrans.gcjToBaidu(new LatLng(bundle.getDouble("gpsLatitude", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), bundle.getDouble("gpsLongitude", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON)));
        CoordType coordType = SDKInitializer.getCoordType();
        CoordType coordType2 = CoordType.GCJ02;
        if (coordType == coordType2) {
            gcjToBaidu = CoordTrans.baiduToGcj(gcjToBaidu);
        }
        this.f10488d = gcjToBaidu.latitude;
        this.f10487c = gcjToBaidu.longitude;
        this.f10489e = bundle.getFloat("postDirection", -1.0f);
        this.f10490f = bundle.getFloat("postSpeed", 0.0f);
        LatLng gcjToBaidu2 = CoordTrans.gcjToBaidu(new LatLng(bundle.getDouble("postLatitude", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON), bundle.getDouble("postLongitude", com.github.mikephil.charting.utils.i.DOUBLE_EPSILON)));
        if (SDKInitializer.getCoordType() == coordType2) {
            gcjToBaidu2 = CoordTrans.baiduToGcj(gcjToBaidu2);
        }
        this.f10492h = gcjToBaidu2.latitude;
        this.f10491g = gcjToBaidu2.longitude;
        return true;
    }
}
