package com.baidu.mapapi.walknavi.params;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class WalkRouteNodeInfo extends a {
    @Override // com.baidu.mapapi.walknavi.params.a
    public String getBuildingID() {
        return this.f7701f;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public String getFloorID() {
        return this.f7700e;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public String getKeyword() {
        return this.f7697b;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public LatLng getLocation() {
        return this.f7698c;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public RouteNodeType getType() {
        return this.f7696a;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public void setBuildingID(String str) {
        this.f7701f = str;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public void setFloorID(String str) {
        this.f7700e = str;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public void setKeyword(String str) {
        this.f7697b = str;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public void setLocation(LatLng latLng) {
        this.f7698c = latLng;
    }

    @Override // com.baidu.mapapi.walknavi.params.a
    public void setType(RouteNodeType routeNodeType) {
        this.f7696a = routeNodeType;
    }
}
