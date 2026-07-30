package com.baidu.mapapi.search.weather;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;

/* loaded from: classes2.dex */
public class WeatherSearchOption {

    /* renamed from: b, reason: collision with root package name */
    private String f7492b;

    /* renamed from: c, reason: collision with root package name */
    private LatLng f7493c;

    /* renamed from: a, reason: collision with root package name */
    private WeatherServerType f7491a = WeatherServerType.WEATHER_SERVER_TYPE_DEFAULT;

    /* renamed from: d, reason: collision with root package name */
    private WeatherDataType f7494d = WeatherDataType.WEATHER_DATA_TYPE_REAL_TIME;

    /* renamed from: e, reason: collision with root package name */
    private LanguageType f7495e = LanguageType.LanguageTypeChinese;

    public WeatherSearchOption districtID(String str) {
        this.f7492b = str;
        return this;
    }

    public WeatherDataType getDataType() {
        return this.f7494d;
    }

    public String getDistrictID() {
        return this.f7492b;
    }

    public LanguageType getLanguageType() {
        return this.f7495e;
    }

    public LatLng getLocation() {
        return this.f7493c;
    }

    public WeatherServerType getServerType() {
        return this.f7491a;
    }

    public WeatherSearchOption languageType(LanguageType languageType) {
        this.f7495e = languageType;
        return this;
    }

    public WeatherSearchOption location(LatLng latLng) {
        this.f7493c = latLng;
        return this;
    }

    public WeatherSearchOption serverType(WeatherServerType weatherServerType) {
        this.f7491a = weatherServerType;
        return this;
    }

    public WeatherSearchOption weatherDataType(WeatherDataType weatherDataType) {
        this.f7494d = weatherDataType;
        return this;
    }
}
