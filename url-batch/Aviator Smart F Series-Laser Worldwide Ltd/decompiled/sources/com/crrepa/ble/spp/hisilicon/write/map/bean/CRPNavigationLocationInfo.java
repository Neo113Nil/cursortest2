package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class CRPNavigationLocationInfo {
    private double direction;
    private int link_id;
    private LocationBean location;
    private int msg_type;
    private int navi_type;
    private LocationBean origin_location;

    public double getDirection() {
        return this.direction;
    }

    public int getLink_id() {
        return this.link_id;
    }

    public LocationBean getLocation() {
        return this.location;
    }

    public int getMsg_type() {
        return this.msg_type;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public LocationBean getOrigin_location() {
        return this.origin_location;
    }

    public void setDirection(double d8) {
        this.direction = d8;
    }

    public void setLink_id(int i8) {
        this.link_id = i8;
    }

    public void setLocation(LocationBean locationBean) {
        this.location = locationBean;
    }

    public void setMsg_type(int i8) {
        this.msg_type = i8;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public void setOrigin_location(LocationBean locationBean) {
        this.origin_location = locationBean;
    }

    public String toString() {
        return "CRPGpsStatusInfo{msg_type=" + this.msg_type + ", navi_type=" + this.navi_type + ", link_id=" + this.link_id + ", direction=" + this.direction + ", location=" + this.location + ", origin_location=" + this.origin_location + '}';
    }
}
