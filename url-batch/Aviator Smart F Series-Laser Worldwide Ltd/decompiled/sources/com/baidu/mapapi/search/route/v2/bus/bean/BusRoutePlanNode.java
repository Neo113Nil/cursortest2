package com.baidu.mapapi.search.route.v2.bus.bean;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class BusRoutePlanNode extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "location")
    private List<Double> f7341a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "name")
    private String f7342b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "city_name")
    private String f7343c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "city_id")
    private int f7344d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "station_list")
    private List<BusRoutePlanStation> f7345e;

    public int getCityId() {
        return this.f7344d;
    }

    public String getCityName() {
        return this.f7343c;
    }

    public LatLng getLocation() {
        if (this.f7341a.size() < 2) {
            return null;
        }
        LatLng latLng = new LatLng(this.f7341a.get(1).doubleValue(), this.f7341a.get(0).doubleValue());
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public String getName() {
        return this.f7342b;
    }

    public List<BusRoutePlanStation> getStationList() {
        return this.f7345e;
    }

    public void setCityId(int i8) {
        this.f7344d = i8;
    }

    public void setCityName(String str) {
        this.f7343c = str;
    }

    public void setLocation(List<Double> list) {
        this.f7341a = list;
    }

    public void setName(String str) {
        this.f7342b = str;
    }

    public void setStationList(List<BusRoutePlanStation> list) {
        this.f7345e = list;
    }
}
