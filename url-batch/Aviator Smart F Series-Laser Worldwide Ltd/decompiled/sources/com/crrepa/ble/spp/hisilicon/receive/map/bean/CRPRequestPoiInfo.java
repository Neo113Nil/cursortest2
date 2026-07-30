package com.crrepa.ble.spp.hisilicon.receive.map.bean;

/* loaded from: classes3.dex */
public class CRPRequestPoiInfo {
    private boolean extensionsAdcode;
    private boolean isRadiusLimit;
    private String keywords;
    private LocationBean location;
    private int pageIndex;
    private int pageSize;
    private int radius;
    private int scope;

    public static class LocationBean {
        private int coord_type;
        private int direction;
        private double latitude;
        private double longitude;
        private double speed;
        private String time;

        public int getCoord_type() {
            return this.coord_type;
        }

        public int getDirection() {
            return this.direction;
        }

        public double getLatitude() {
            return this.latitude;
        }

        public double getLongitude() {
            return this.longitude;
        }

        public double getSpeed() {
            return this.speed;
        }

        public String getTime() {
            return this.time;
        }

        public void setCoord_type(int i8) {
            this.coord_type = i8;
        }

        public void setDirection(int i8) {
            this.direction = i8;
        }

        public void setLatitude(double d8) {
            this.latitude = d8;
        }

        public void setLongitude(double d8) {
            this.longitude = d8;
        }

        public void setSpeed(double d8) {
            this.speed = d8;
        }

        public void setTime(String str) {
            this.time = str;
        }

        public String toString() {
            return "LocationBean{coord_type=" + this.coord_type + ", direction=" + this.direction + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", speed=" + this.speed + ", time='" + this.time + "'}";
        }
    }

    public String getKeywords() {
        return this.keywords;
    }

    public LocationBean getLocation() {
        return this.location;
    }

    public int getPageIndex() {
        return this.pageIndex;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getRadius() {
        return this.radius;
    }

    public int getScope() {
        return this.scope;
    }

    public boolean isExtensionsAdcode() {
        return this.extensionsAdcode;
    }

    public boolean isIsRadiusLimit() {
        return this.isRadiusLimit;
    }

    public void setExtensionsAdcode(boolean z7) {
        this.extensionsAdcode = z7;
    }

    public void setIsRadiusLimit(boolean z7) {
        this.isRadiusLimit = z7;
    }

    public void setKeywords(String str) {
        this.keywords = str;
    }

    public void setLocation(LocationBean locationBean) {
        this.location = locationBean;
    }

    public void setPageIndex(int i8) {
        this.pageIndex = i8;
    }

    public void setPageSize(int i8) {
        this.pageSize = i8;
    }

    public void setRadius(int i8) {
        this.radius = i8;
    }

    public void setScope(int i8) {
        this.scope = i8;
    }

    public String toString() {
        return "CRPRequestPOIInfo{keywords='" + this.keywords + "', location=" + this.location + ", radius=" + this.radius + ", isRadiusLimit=" + this.isRadiusLimit + ", scope=" + this.scope + ", pageSize=" + this.pageSize + ", pageIndex=" + this.pageIndex + ", extensionsAdcode=" + this.extensionsAdcode + '}';
    }
}
