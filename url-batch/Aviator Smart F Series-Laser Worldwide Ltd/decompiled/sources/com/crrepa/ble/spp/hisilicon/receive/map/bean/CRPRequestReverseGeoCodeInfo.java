package com.crrepa.ble.spp.hisilicon.receive.map.bean;

/* loaded from: classes3.dex */
public class CRPRequestReverseGeoCodeInfo {
    private boolean isLatestAdmin;
    private LocationBean location;
    private int pageNum;
    private int pageSize;
    private int radius;

    public static class LocationBean {
        private double latitude;
        private double longitude;

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public void setLatitude(double d8) {
            this.latitude = d8;
        }

        public void setLongitude(double d8) {
            this.longitude = d8;
        }

        public String toString() {
            return "LocationBean{longitude=" + this.longitude + ", latitude=" + this.latitude + '}';
        }
    }

    public LocationBean getLocation() {
        return this.location;
    }

    public int getPageNum() {
        return this.pageNum;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getRadius() {
        return this.radius;
    }

    public boolean isIsLatestAdmin() {
        return this.isLatestAdmin;
    }

    public void setIsLatestAdmin(boolean z7) {
        this.isLatestAdmin = z7;
    }

    public void setLocation(LocationBean locationBean) {
        this.location = locationBean;
    }

    public void setPageNum(int i8) {
        this.pageNum = i8;
    }

    public void setPageSize(int i8) {
        this.pageSize = i8;
    }

    public void setRadius(int i8) {
        this.radius = i8;
    }

    public String toString() {
        return "CRPRequestRegeocodeInfo{location=" + this.location + ", radius=" + this.radius + ", isLatestAdmin=" + this.isLatestAdmin + ", pageSize=" + this.pageSize + ", pageNum=" + this.pageNum + '}';
    }
}
