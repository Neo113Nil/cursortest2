package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherSearchRealTime implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchRealTime> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f7496a;

    /* renamed from: b, reason: collision with root package name */
    private int f7497b;

    /* renamed from: c, reason: collision with root package name */
    private String f7498c;

    /* renamed from: d, reason: collision with root package name */
    private String f7499d;

    /* renamed from: e, reason: collision with root package name */
    private String f7500e;

    /* renamed from: f, reason: collision with root package name */
    private int f7501f;

    /* renamed from: g, reason: collision with root package name */
    private String f7502g;

    /* renamed from: h, reason: collision with root package name */
    private int f7503h;

    /* renamed from: i, reason: collision with root package name */
    private float f7504i;

    /* renamed from: j, reason: collision with root package name */
    private int f7505j;

    /* renamed from: k, reason: collision with root package name */
    private int f7506k;

    /* renamed from: l, reason: collision with root package name */
    private int f7507l;

    /* renamed from: m, reason: collision with root package name */
    private int f7508m;

    /* renamed from: n, reason: collision with root package name */
    private int f7509n;

    /* renamed from: o, reason: collision with root package name */
    private int f7510o;

    /* renamed from: p, reason: collision with root package name */
    private int f7511p;

    /* renamed from: q, reason: collision with root package name */
    private float f7512q;

    static class a implements Parcelable.Creator<WeatherSearchRealTime> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchRealTime createFromParcel(Parcel parcel) {
            return new WeatherSearchRealTime(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchRealTime[] newArray(int i8) {
            return new WeatherSearchRealTime[i8];
        }
    }

    public WeatherSearchRealTime() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAirQualityIndex() {
        return this.f7510o;
    }

    public float getCO() {
        return this.f7512q;
    }

    public int getClouds() {
        return this.f7503h;
    }

    public float getHourlyPrecipitation() {
        return this.f7504i;
    }

    public int getNO2() {
        return this.f7508m;
    }

    public int getO3() {
        return this.f7506k;
    }

    public int getPM10() {
        return this.f7511p;
    }

    public int getPM2_5() {
        return this.f7507l;
    }

    public String getPhenomenon() {
        return this.f7498c;
    }

    public int getRelativeHumidity() {
        return this.f7496a;
    }

    public int getSO2() {
        return this.f7509n;
    }

    public int getSensoryTemp() {
        return this.f7497b;
    }

    public int getTemperature() {
        return this.f7501f;
    }

    public String getUpdateTime() {
        return this.f7500e;
    }

    public int getVisibility() {
        return this.f7505j;
    }

    public String getWindDirection() {
        return this.f7499d;
    }

    public String getWindPower() {
        return this.f7502g;
    }

    public void setAirQualityIndex(int i8) {
        this.f7510o = i8;
    }

    public void setCO(float f8) {
        this.f7512q = f8;
    }

    public void setClouds(int i8) {
        this.f7503h = i8;
    }

    public void setHourlyPrecipitation(float f8) {
        this.f7504i = f8;
    }

    public void setNO2(int i8) {
        this.f7508m = i8;
    }

    public void setO3(int i8) {
        this.f7506k = i8;
    }

    public void setPM10(int i8) {
        this.f7511p = i8;
    }

    public void setPM2_5(int i8) {
        this.f7507l = i8;
    }

    public void setPhenomenon(String str) {
        this.f7498c = str;
    }

    public void setRelativeHumidity(int i8) {
        this.f7496a = i8;
    }

    public void setSO2(int i8) {
        this.f7509n = i8;
    }

    public void setSensoryTemp(int i8) {
        this.f7497b = i8;
    }

    public void setTemperature(int i8) {
        this.f7501f = i8;
    }

    public void setUpdateTime(String str) {
        this.f7500e = str;
    }

    public void setVisibility(int i8) {
        this.f7505j = i8;
    }

    public void setWindDirection(String str) {
        this.f7499d = str;
    }

    public void setWindPower(String str) {
        this.f7502g = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f7496a);
        parcel.writeInt(this.f7497b);
        parcel.writeString(this.f7498c);
        parcel.writeString(this.f7499d);
        parcel.writeString(this.f7500e);
        parcel.writeInt(this.f7501f);
        parcel.writeString(this.f7502g);
    }

    protected WeatherSearchRealTime(Parcel parcel) {
        this.f7496a = parcel.readInt();
        this.f7497b = parcel.readInt();
        this.f7498c = parcel.readString();
        this.f7499d = parcel.readString();
        this.f7500e = parcel.readString();
        this.f7501f = parcel.readInt();
        this.f7502g = parcel.readString();
    }
}
