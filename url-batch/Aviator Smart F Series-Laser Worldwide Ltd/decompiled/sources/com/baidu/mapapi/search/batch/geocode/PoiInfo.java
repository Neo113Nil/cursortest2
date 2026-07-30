package com.baidu.mapapi.search.batch.geocode;

import cn.hutool.core.util.g1;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PoiInfo extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "addr")
    private String f6669a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "tel")
    private String f6670b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "uid")
    private String f6671c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = g1.URL_PROTOCOL_ZIP)
    private String f6672d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "name")
    private String f6673e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "point")
    private LocationXY f6674f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "direction")
    private String f6675g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "distance")
    private int f6676h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "tag")
    private String f6677i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "parent_poi")
    private ParentPoiInfo f6678j;

    public static class ParentPoiInfo extends BaseParams implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        @Properties(name = "addr")
        private String f6679a;

        /* renamed from: b, reason: collision with root package name */
        @Properties(name = "direction")
        private String f6680b;

        /* renamed from: c, reason: collision with root package name */
        @Properties(name = "distance")
        private int f6681c;

        /* renamed from: d, reason: collision with root package name */
        @Properties(name = "name")
        private String f6682d;

        /* renamed from: e, reason: collision with root package name */
        @Properties(name = "tag")
        private String f6683e;

        /* renamed from: f, reason: collision with root package name */
        @Properties(name = "uid")
        private String f6684f;

        /* renamed from: g, reason: collision with root package name */
        @Properties(name = "point")
        private LocationXY f6685g;

        public String getAddr() {
            return this.f6679a;
        }

        public String getDirection() {
            return this.f6680b;
        }

        public int getDistance() {
            return this.f6681c;
        }

        public String getName() {
            return this.f6682d;
        }

        public LatLng getPoint() {
            return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(new LatLng(this.f6685g.getLat(), this.f6685g.getLng())) : new LatLng(this.f6685g.getLat(), this.f6685g.getLng());
        }

        public String getTag() {
            return this.f6683e;
        }

        public String getUid() {
            return this.f6684f;
        }

        public void setAddr(String str) {
            this.f6679a = str;
        }

        public void setDirection(String str) {
            this.f6680b = str;
        }

        public void setDistance(int i8) {
            this.f6681c = i8;
        }

        public void setName(String str) {
            this.f6682d = str;
        }

        public void setPoint(LocationXY locationXY) {
            this.f6685g = locationXY;
        }

        public void setTag(String str) {
            this.f6683e = str;
        }

        public void setUid(String str) {
            this.f6684f = str;
        }
    }

    public String getAddr() {
        return this.f6669a;
    }

    public String getDirection() {
        return this.f6675g;
    }

    public int getDistance() {
        return this.f6676h;
    }

    public String getName() {
        return this.f6673e;
    }

    public ParentPoiInfo getParentPoiInfo() {
        return this.f6678j;
    }

    public LatLng getPoint() {
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(new LatLng(this.f6674f.getLat(), this.f6674f.getLng())) : new LatLng(this.f6674f.getLat(), this.f6674f.getLng());
    }

    public String getTag() {
        return this.f6677i;
    }

    public String getTel() {
        return this.f6670b;
    }

    public String getUid() {
        return this.f6671c;
    }

    public String getZip() {
        return this.f6672d;
    }

    public void setAddr(String str) {
        this.f6669a = str;
    }

    public void setDirection(String str) {
        this.f6675g = str;
    }

    public void setDistance(int i8) {
        this.f6676h = i8;
    }

    public void setName(String str) {
        this.f6673e = str;
    }

    public void setParentPoiInfo(ParentPoiInfo parentPoiInfo) {
        this.f6678j = parentPoiInfo;
    }

    public void setPoint(LocationXY locationXY) {
        this.f6674f = locationXY;
    }

    public void setTag(String str) {
        this.f6677i = str;
    }

    public void setTel(String str) {
        this.f6670b = str;
    }

    public void setUid(String str) {
        this.f6671c = str;
    }

    public void setZip(String str) {
        this.f6672d = str;
    }
}
