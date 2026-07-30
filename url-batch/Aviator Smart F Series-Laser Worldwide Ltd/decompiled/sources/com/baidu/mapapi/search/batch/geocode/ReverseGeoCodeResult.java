package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public class ReverseGeoCodeResult extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "cityCode")
    private int f6694a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "formatted_address")
    private String f6695b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "business")
    private String f6696c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "addressComponent")
    private AddressComponent f6697d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "location")
    private Location f6698e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "pois")
    private List<PoiInfo> f6699f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "sematic_description")
    private String f6700g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "formatted_address_poi")
    private String f6701h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "poiRegions")
    private List<PoiRegionsInfo> f6702i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "roads")
    private List<RoadInfo> f6703j;

    public AddressComponent getAddressComponent() {
        return this.f6697d;
    }

    public String getBusiness() {
        return this.f6696c;
    }

    public int getCityCode() {
        return this.f6694a;
    }

    public String getFormattedAddress() {
        return this.f6695b;
    }

    public String getFormattedAddressPoi() {
        return this.f6701h;
    }

    public LatLng getLocation() {
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(new LatLng(this.f6698e.getLat(), this.f6698e.getLng())) : new LatLng(this.f6698e.getLat(), this.f6698e.getLng());
    }

    public List<PoiRegionsInfo> getPoiRegions() {
        return this.f6702i;
    }

    public List<PoiInfo> getPois() {
        return this.f6699f;
    }

    public List<RoadInfo> getRoads() {
        return this.f6703j;
    }

    public String getSematicDescription() {
        return this.f6700g;
    }

    public void setAddressComponent(AddressComponent addressComponent) {
        this.f6697d = addressComponent;
    }

    public void setBusiness(String str) {
        this.f6696c = str;
    }

    public void setCityCode(int i8) {
        this.f6694a = i8;
    }

    public void setFormattedAddress(String str) {
        this.f6695b = str;
    }

    public void setFormattedAddressPoi(String str) {
        this.f6701h = str;
    }

    public void setLocation(Location location) {
        this.f6698e = location;
    }

    public void setPoiRegions(List<PoiRegionsInfo> list) {
        this.f6702i = list;
    }

    public void setPois(List<PoiInfo> list) {
        this.f6699f = list;
    }

    public void setRoads(List<RoadInfo> list) {
        this.f6703j = list;
    }

    public void setSematicDescription(String str) {
        this.f6700g = str;
    }
}
