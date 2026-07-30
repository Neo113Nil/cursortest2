package com.baidu.platform.comapi.wnplatform.model;

import android.os.Bundle;
import com.baidu.entity.pb.IndoorNavi;
import com.baidu.entity.pb.WalkPlan;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.google.protobuf.micro.MessageMicro;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class g extends a {

    /* renamed from: a, reason: collision with root package name */
    private int f10506a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f10507b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f10508c = 1;

    /* renamed from: d, reason: collision with root package name */
    private ArrayList<LatLng> f10509d = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private ArrayList<LatLng> f10510e = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    private WalkPlan f10511f = null;

    public void a() {
        this.f10506a = 0;
        this.f10507b = 0;
        ArrayList<LatLng> arrayList = this.f10509d;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<LatLng> arrayList2 = this.f10510e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
    }

    public ArrayList<LatLng> b() {
        return this.f10510e;
    }

    public int c() {
        return this.f10506a;
    }

    public int d() {
        return this.f10507b;
    }

    public WalkPlan e() {
        return this.f10511f;
    }

    public int b(WalkPlan walkPlan, int i8) {
        int i9 = 0;
        if (walkPlan == null) {
            return 0;
        }
        WalkPlan.Routes routes = i8 < walkPlan.getRoutesCount() ? walkPlan.getRoutes(i8) : null;
        if (routes != null) {
            Iterator<WalkPlan.Routes.Legs> it = routes.getLegsList().iterator();
            while (it.hasNext()) {
                i9 += it.next().getDuration();
            }
        }
        Iterator<IndoorNavi> it2 = walkPlan.getIndoorNavisList().iterator();
        while (it2.hasNext()) {
            Iterator<IndoorNavi.Routes> it3 = it2.next().getRoutesList().iterator();
            while (it3.hasNext()) {
                Iterator<IndoorNavi.Routes.Legs> it4 = it3.next().getLegsList().iterator();
                while (it4.hasNext()) {
                    i9 += it4.next().getDuration();
                }
            }
        }
        return i9;
    }

    public void a(Bundle bundle, int i8) {
        WalkPlan walkPlan;
        WalkPlan walkPlan2;
        a();
        if (bundle == null) {
            return;
        }
        this.f10508c = i8;
        this.f10506a = bundle.getInt("totaldistance");
        this.f10507b = bundle.getInt("totaltime");
        if (this.f10506a <= 0 && (walkPlan2 = this.f10511f) != null) {
            this.f10506a = a(walkPlan2, com.baidu.platform.comapi.walknavi.b.n().A());
        }
        if (this.f10507b <= 0 && (walkPlan = this.f10511f) != null) {
            this.f10507b = b(walkPlan, com.baidu.platform.comapi.walknavi.b.n().A());
        }
        double[] doubleArray = bundle.getDoubleArray("ptShapeX");
        double[] doubleArray2 = bundle.getDoubleArray("ptShapeY");
        if (doubleArray == null || doubleArray2 == null) {
            return;
        }
        LatLng latLng = new LatLng(com.github.mikephil.charting.utils.i.DOUBLE_EPSILON, com.github.mikephil.charting.utils.i.DOUBLE_EPSILON);
        for (int i9 = 0; i9 < doubleArray.length; i9++) {
            LatLng gcjToBaidu = CoordTrans.gcjToBaidu(new LatLng(doubleArray2[i9], doubleArray[i9]));
            this.f10510e.add(gcjToBaidu);
            if (Math.abs(latLng.longitude - gcjToBaidu.longitude) >= 1.0E-6d || Math.abs(latLng.latitude - gcjToBaidu.latitude) >= 1.0E-6d) {
                this.f10509d.add(gcjToBaidu);
                latLng = gcjToBaidu;
            }
        }
    }

    public boolean a(com.baidu.platform.comapi.h.h.a aVar) {
        MessageMicro messageMicro;
        com.baidu.platform.comapi.h.h.c cVar = aVar instanceof com.baidu.platform.comapi.h.h.c ? (com.baidu.platform.comapi.h.h.c) aVar : null;
        if (cVar == null || (messageMicro = cVar.a().get(0)) == null) {
            return false;
        }
        try {
            this.f10511f = (WalkPlan) messageMicro;
            com.baidu.platform.comapi.walknavi.b.n().a(this.f10511f);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public int a(WalkPlan walkPlan, int i8) {
        int i9 = 0;
        if (walkPlan == null) {
            return 0;
        }
        WalkPlan.Routes routes = i8 < walkPlan.getRoutesCount() ? walkPlan.getRoutes(i8) : null;
        if (routes != null) {
            Iterator<WalkPlan.Routes.Legs> it = routes.getLegsList().iterator();
            while (it.hasNext()) {
                i9 += it.next().getDistance();
            }
        }
        Iterator<IndoorNavi> it2 = walkPlan.getIndoorNavisList().iterator();
        while (it2.hasNext()) {
            Iterator<IndoorNavi.Routes> it3 = it2.next().getRoutesList().iterator();
            while (it3.hasNext()) {
                Iterator<IndoorNavi.Routes.Legs> it4 = it3.next().getLegsList().iterator();
                while (it4.hasNext()) {
                    i9 += it4.next().getDistance();
                }
            }
        }
        return i9;
    }
}
