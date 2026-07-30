package com.crrepa.ble.spp.hisilicon.receive.map.bean;

import com.crrepa.g1.k;

/* loaded from: classes3.dex */
public class CRPRequestSVGInfo {
    public static final String TYPE_REQUEST_SVG_BATCH = "2";
    public static final String TYPE_REQUEST_SVG_BATCH_NOT_FIRST = "0";
    public static final String TYPE_REQUEST_SVG_NORMAL = "1";
    private String ak;
    private String coord;
    private String device_id;
    private String request;
    private String sign;
    private String time;

    public static class CoordBean {

        /* renamed from: x, reason: collision with root package name */
        private int f12306x;

        /* renamed from: y, reason: collision with root package name */
        private int f12307y;

        /* renamed from: z, reason: collision with root package name */
        private int f12308z;

        public String getFileName() {
            return this.f12306x + "_" + this.f12307y + "_" + this.f12308z;
        }

        public int getX() {
            return this.f12306x;
        }

        public int getY() {
            return this.f12307y;
        }

        public int getZ() {
            return this.f12308z;
        }

        public void setX(int i8) {
            this.f12306x = i8;
        }

        public void setY(int i8) {
            this.f12307y = i8;
        }

        public void setZ(int i8) {
            this.f12308z = i8;
        }

        public String toString() {
            return "CoordBean{x=" + this.f12306x + ", y=" + this.f12307y + ", z=" + this.f12308z + '}';
        }
    }

    public String getAk() {
        return this.ak;
    }

    public String getCoord() {
        return this.coord;
    }

    public CoordBean getCoordBean() {
        return (CoordBean) k.a(this.coord, CoordBean.class);
    }

    public String getDevice_id() {
        return this.device_id;
    }

    public String getRequest() {
        return this.request;
    }

    public String getSign() {
        return this.sign;
    }

    public String getTime() {
        return this.time;
    }

    public void setAk(String str) {
        this.ak = str;
    }

    public void setCoord(String str) {
        this.coord = str;
    }

    public void setDevice_id(String str) {
        this.device_id = str;
    }

    public void setRequest(String str) {
        this.request = str;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    public void setTime(String str) {
        this.time = str;
    }

    public String toString() {
        return "CRPMapSVGInfo{request='" + this.request + "', device_id='" + this.device_id + "', ak='" + this.ak + "', sign='" + this.sign + "', time='" + this.time + "', coord='" + this.coord + "'}";
    }
}
