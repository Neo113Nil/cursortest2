package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherSearchForecastForHours implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchForecastForHours> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f7467a;

    /* renamed from: b, reason: collision with root package name */
    private String f7468b;

    /* renamed from: c, reason: collision with root package name */
    private String f7469c;

    /* renamed from: d, reason: collision with root package name */
    private String f7470d;

    /* renamed from: e, reason: collision with root package name */
    private int f7471e;

    /* renamed from: f, reason: collision with root package name */
    private int f7472f;

    /* renamed from: g, reason: collision with root package name */
    private String f7473g;

    /* renamed from: h, reason: collision with root package name */
    private int f7474h;

    static class a implements Parcelable.Creator<WeatherSearchForecastForHours> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours createFromParcel(Parcel parcel) {
            return new WeatherSearchForecastForHours(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecastForHours[] newArray(int i8) {
            return new WeatherSearchForecastForHours[i8];
        }
    }

    public WeatherSearchForecastForHours() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getClouds() {
        return this.f7472f;
    }

    public String getDataTime() {
        return this.f7468b;
    }

    public int getHourlyPrecipitation() {
        return this.f7474h;
    }

    public String getPhenomenon() {
        return this.f7473g;
    }

    public int getRelativeHumidity() {
        return this.f7467a;
    }

    public int getTemperature() {
        return this.f7471e;
    }

    public String getWindDirection() {
        return this.f7469c;
    }

    public String getWindPower() {
        return this.f7470d;
    }

    public void setClouds(int i8) {
        this.f7472f = i8;
    }

    public void setDataTime(String str) {
        this.f7468b = str;
    }

    public void setHourlyPrecipitation(int i8) {
        this.f7474h = i8;
    }

    public void setPhenomenon(String str) {
        this.f7473g = str;
    }

    public void setRelativeHumidity(int i8) {
        this.f7467a = i8;
    }

    public void setTemperature(int i8) {
        this.f7471e = i8;
    }

    public void setWindDirection(String str) {
        this.f7469c = str;
    }

    public void setWindPower(String str) {
        this.f7470d = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f7467a);
        parcel.writeString(this.f7468b);
        parcel.writeString(this.f7469c);
        parcel.writeString(this.f7470d);
        parcel.writeInt(this.f7471e);
        parcel.writeInt(this.f7472f);
        parcel.writeString(this.f7473g);
        parcel.writeInt(this.f7474h);
    }

    protected WeatherSearchForecastForHours(Parcel parcel) {
        this.f7467a = parcel.readInt();
        this.f7468b = parcel.readString();
        this.f7469c = parcel.readString();
        this.f7470d = parcel.readString();
        this.f7471e = parcel.readInt();
        this.f7472f = parcel.readInt();
        this.f7473g = parcel.readString();
        this.f7474h = parcel.readInt();
    }
}
