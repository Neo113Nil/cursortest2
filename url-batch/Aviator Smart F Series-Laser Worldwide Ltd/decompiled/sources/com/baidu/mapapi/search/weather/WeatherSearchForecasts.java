package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherSearchForecasts implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchForecasts> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7475a;

    /* renamed from: b, reason: collision with root package name */
    private String f7476b;

    /* renamed from: c, reason: collision with root package name */
    private int f7477c;

    /* renamed from: d, reason: collision with root package name */
    private int f7478d;

    /* renamed from: e, reason: collision with root package name */
    private String f7479e;

    /* renamed from: f, reason: collision with root package name */
    private String f7480f;

    /* renamed from: g, reason: collision with root package name */
    private String f7481g;

    /* renamed from: h, reason: collision with root package name */
    private String f7482h;

    /* renamed from: i, reason: collision with root package name */
    private String f7483i;

    /* renamed from: j, reason: collision with root package name */
    private String f7484j;

    /* renamed from: k, reason: collision with root package name */
    private int f7485k;

    static class a implements Parcelable.Creator<WeatherSearchForecasts> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecasts createFromParcel(Parcel parcel) {
            return new WeatherSearchForecasts(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchForecasts[] newArray(int i8) {
            return new WeatherSearchForecasts[i8];
        }
    }

    public WeatherSearchForecasts() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAirQualityIndex() {
        return this.f7485k;
    }

    public String getDate() {
        return this.f7475a;
    }

    public int getHighestTemp() {
        return this.f7478d;
    }

    public int getLowestTemp() {
        return this.f7477c;
    }

    public String getPhenomenonDay() {
        return this.f7483i;
    }

    public String getPhenomenonNight() {
        return this.f7484j;
    }

    public String getWeek() {
        return this.f7476b;
    }

    public String getWindDirectionDay() {
        return this.f7481g;
    }

    public String getWindDirectionNight() {
        return this.f7482h;
    }

    public String getWindPowerDay() {
        return this.f7479e;
    }

    public String getWindPowerNight() {
        return this.f7480f;
    }

    public void setAirQualityIndex(int i8) {
        this.f7485k = i8;
    }

    public void setDate(String str) {
        this.f7475a = str;
    }

    public void setHighestTemp(int i8) {
        this.f7478d = i8;
    }

    public void setLowestTemp(int i8) {
        this.f7477c = i8;
    }

    public void setPhenomenonDay(String str) {
        this.f7483i = str;
    }

    public void setPhenomenonNight(String str) {
        this.f7484j = str;
    }

    public void setWeek(String str) {
        this.f7476b = str;
    }

    public void setWindDirectionDay(String str) {
        this.f7481g = str;
    }

    public void setWindDirectionNight(String str) {
        this.f7482h = str;
    }

    public void setWindPowerDay(String str) {
        this.f7479e = str;
    }

    public void setWindPowerNight(String str) {
        this.f7480f = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7475a);
        parcel.writeString(this.f7476b);
        parcel.writeInt(this.f7477c);
        parcel.writeInt(this.f7478d);
        parcel.writeString(this.f7479e);
        parcel.writeString(this.f7480f);
        parcel.writeString(this.f7481g);
        parcel.writeString(this.f7482h);
        parcel.writeString(this.f7483i);
        parcel.writeString(this.f7484j);
    }

    protected WeatherSearchForecasts(Parcel parcel) {
        this.f7475a = parcel.readString();
        this.f7476b = parcel.readString();
        this.f7477c = parcel.readInt();
        this.f7478d = parcel.readInt();
        this.f7479e = parcel.readString();
        this.f7480f = parcel.readString();
        this.f7481g = parcel.readString();
        this.f7482h = parcel.readString();
        this.f7483i = parcel.readString();
        this.f7484j = parcel.readString();
    }
}
