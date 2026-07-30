package com.crrepa.ble.spp.hisilicon.receive.map.bean;

/* loaded from: classes3.dex */
public class CRPRequestNavigationInitInfo {
    public static final int NAVIGATION_TYPE_CYCLING = 1;
    public static final int NAVIGATION_TYPE_ELECTRIC_VEHICLES = 2;
    public static final int NAVIGATION_TYPE_WALKING = 0;
    private FromBean from;
    private int navi_type;
    private ToBean to;

    public static class FromBean {
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
            return "FromBean{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
        }
    }

    public static class ToBean {
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
            return "ToBean{latitude=" + this.latitude + ", longitude=" + this.longitude + '}';
        }
    }

    public FromBean getFrom() {
        return this.from;
    }

    public int getNavi_type() {
        return this.navi_type;
    }

    public ToBean getTo() {
        return this.to;
    }

    public void setFrom(FromBean fromBean) {
        this.from = fromBean;
    }

    public void setNavi_type(int i8) {
        this.navi_type = i8;
    }

    public void setTo(ToBean toBean) {
        this.to = toBean;
    }

    public String toString() {
        return "CRPRequestNaviInitInfo{navi_type=" + this.navi_type + ", from=" + this.from + ", to=" + this.to + '}';
    }
}
