package com.baidu.mapapi.search.batch.geocode;

import com.baidu.mapapi.http.wrapper.BaseParams;
import com.baidu.mapapi.http.wrapper.annotation.Properties;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AddressComponent extends BaseParams implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    @Properties(name = "city")
    private String f6650a;

    /* renamed from: b, reason: collision with root package name */
    @Properties(name = "town")
    private String f6651b;

    /* renamed from: c, reason: collision with root package name */
    @Properties(name = "district")
    private String f6652c;

    /* renamed from: d, reason: collision with root package name */
    @Properties(name = "province")
    private String f6653d;

    /* renamed from: e, reason: collision with root package name */
    @Properties(name = "adcode")
    private int f6654e;

    /* renamed from: f, reason: collision with root package name */
    @Properties(name = "street")
    private String f6655f;

    /* renamed from: g, reason: collision with root package name */
    @Properties(name = "street_number")
    private String f6656g;

    /* renamed from: h, reason: collision with root package name */
    @Properties(name = "country")
    private String f6657h;

    /* renamed from: i, reason: collision with root package name */
    @Properties(name = "country_code")
    private int f6658i;

    /* renamed from: j, reason: collision with root package name */
    @Properties(name = "direction")
    private String f6659j;

    /* renamed from: k, reason: collision with root package name */
    @Properties(name = "distance")
    private String f6660k;

    /* renamed from: l, reason: collision with root package name */
    @Properties(name = "country_code_iso")
    private String f6661l;

    /* renamed from: m, reason: collision with root package name */
    @Properties(name = "country_code_iso2")
    private String f6662m;

    /* renamed from: n, reason: collision with root package name */
    @Properties(name = "town_code")
    private String f6663n;

    /* renamed from: o, reason: collision with root package name */
    @Properties(name = "cityLevel")
    private int f6664o;

    public int getAdcode() {
        return this.f6654e;
    }

    public String getCity() {
        return this.f6650a;
    }

    public int getCityLevel() {
        return this.f6664o;
    }

    public String getCountry() {
        return this.f6657h;
    }

    public int getCountryCode() {
        return this.f6658i;
    }

    public String getCountryCodeIso() {
        return this.f6661l;
    }

    public String getCountryCodeIso2() {
        return this.f6662m;
    }

    public String getDirection() {
        return this.f6659j;
    }

    public String getDistance() {
        return this.f6660k;
    }

    public String getDistrict() {
        return this.f6652c;
    }

    public String getProvince() {
        return this.f6653d;
    }

    public String getStreet() {
        return this.f6655f;
    }

    public String getStreetNumber() {
        return this.f6656g;
    }

    public String getTown() {
        return this.f6651b;
    }

    public String getTownCode() {
        return this.f6663n;
    }

    public void setAdcode(int i8) {
        this.f6654e = i8;
    }

    public void setCity(String str) {
        this.f6650a = str;
    }

    public void setCityLevel(int i8) {
        this.f6664o = i8;
    }

    public void setCountry(String str) {
        this.f6657h = str;
    }

    public void setCountryCode(int i8) {
        this.f6658i = i8;
    }

    public void setCountryCodeIso(String str) {
        this.f6661l = str;
    }

    public void setCountryCodeIso2(String str) {
        this.f6662m = str;
    }

    public void setDirection(String str) {
        this.f6659j = str;
    }

    public void setDistance(String str) {
        this.f6660k = str;
    }

    public void setDistrict(String str) {
        this.f6652c = str;
    }

    public void setProvince(String str) {
        this.f6653d = str;
    }

    public void setStreet(String str) {
        this.f6655f = str;
    }

    public void setStreetNumber(String str) {
        this.f6656g = str;
    }

    public void setTown(String str) {
        this.f6651b = str;
    }

    public void setTownCode(String str) {
        this.f6663n = str;
    }
}
