package com.crrepa.ble.spp.hisilicon.receive.map.bean;

/* loaded from: classes3.dex */
public class CRPRequestPoiSugInfo {
    private boolean cityLimit;
    private String cityname;
    private String keyword;
    private LocationBean location;

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
            return "LocationBean{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
        }
    }

    public String getCityname() {
        return this.cityname;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public LocationBean getLocation() {
        return this.location;
    }

    public boolean isCityLimit() {
        return this.cityLimit;
    }

    public void setCityLimit(boolean z7) {
        this.cityLimit = z7;
    }

    public void setCityname(String str) {
        this.cityname = str;
    }

    public void setKeyword(String str) {
        this.keyword = str;
    }

    public void setLocation(LocationBean locationBean) {
        this.location = locationBean;
    }

    public String toString() {
        return "CRPRequestPoiSugInfo{keyword='" + this.keyword + "', cityname='" + this.cityname + "', cityLimit=" + this.cityLimit + ", location=" + this.location + '}';
    }
}
