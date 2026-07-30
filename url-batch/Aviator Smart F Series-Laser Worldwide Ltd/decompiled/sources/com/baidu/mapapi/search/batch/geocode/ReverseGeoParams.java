package com.baidu.mapapi.search.batch.geocode;

import android.text.TextUtils;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class ReverseGeoParams extends BaseParams implements Serializable {

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "location")
    private String f6706c;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "poi_types")
    private String f6709f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "extensions_road")
    private boolean f6710g;

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "page_size")
    private int f6704a = 10;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "page_index")
    private int f6705b = 0;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "latest_admin")
    private int f6707d = 1;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "radius")
    private int f6708e = 1000;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "language")
    private String f6711h = "zh-CN";

    public ReverseGeoParams extensionsRoad(boolean z7) {
        this.f6710g = z7;
        return this;
    }

    public LanguageType getLanguageType() {
        return TextUtils.equals(this.f6711h, "en") ? LanguageType.LanguageTypeEnglish : LanguageType.LanguageTypeChinese;
    }

    public int getLatestAdmin() {
        return this.f6707d;
    }

    public LatLng getLocation() {
        if (TextUtils.isEmpty(this.f6706c)) {
            return null;
        }
        String[] split = this.f6706c.split(SystemInfoUtil.COMMA);
        if (split.length != 2) {
            return null;
        }
        LatLng latLng = new LatLng(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
        return SDKInitializer.getCoordType() == CoordType.GCJ02 ? CoordTrans.baiduToGcj(latLng) : latLng;
    }

    public int getPageNum() {
        return this.f6705b;
    }

    public int getPageSize() {
        return this.f6704a;
    }

    public String getPoiType() {
        return this.f6709f;
    }

    public int getRadius() {
        return this.f6708e;
    }

    public boolean isExtensionsRoad() {
        return this.f6710g;
    }

    public ReverseGeoParams languageType(LanguageType languageType) {
        if (languageType == LanguageType.LanguageTypeChinese) {
            this.f6711h = "zh-CN";
        }
        if (languageType == LanguageType.LanguageTypeEnglish) {
            this.f6711h = "en";
        }
        return this;
    }

    public ReverseGeoParams location(LatLng latLng) {
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            latLng = CoordTrans.gcjToBaidu(latLng);
        }
        this.f6706c = latLng.latitude + SystemInfoUtil.COMMA + latLng.longitude;
        return this;
    }

    public ReverseGeoParams newVersion(int i8) {
        this.f6707d = i8;
        return this;
    }

    public ReverseGeoParams pageNum(int i8) {
        this.f6705b = i8;
        return this;
    }

    public ReverseGeoParams pageSize(int i8) {
        this.f6704a = i8;
        return this;
    }

    public ReverseGeoParams poiType(String str) {
        this.f6709f = str;
        return this;
    }

    public ReverseGeoParams radius(int i8) {
        this.f6708e = i8;
        return this;
    }
}
