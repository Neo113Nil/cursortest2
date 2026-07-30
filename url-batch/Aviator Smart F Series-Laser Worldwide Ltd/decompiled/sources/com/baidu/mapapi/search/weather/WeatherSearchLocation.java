package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherSearchLocation implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchLocation> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7486a;

    /* renamed from: b, reason: collision with root package name */
    private String f7487b;

    /* renamed from: c, reason: collision with root package name */
    private String f7488c;

    /* renamed from: d, reason: collision with root package name */
    private String f7489d;

    /* renamed from: e, reason: collision with root package name */
    private String f7490e;

    static class a implements Parcelable.Creator<WeatherSearchLocation> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchLocation createFromParcel(Parcel parcel) {
            return new WeatherSearchLocation(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchLocation[] newArray(int i8) {
            return new WeatherSearchLocation[i8];
        }
    }

    public WeatherSearchLocation() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCity() {
        return this.f7488c;
    }

    public String getCountry() {
        return this.f7486a;
    }

    public String getDistrictID() {
        return this.f7490e;
    }

    public String getDistrictName() {
        return this.f7489d;
    }

    public String getProvince() {
        return this.f7487b;
    }

    public void setCity(String str) {
        this.f7488c = str;
    }

    public void setCountry(String str) {
        this.f7486a = str;
    }

    public void setDistrictID(String str) {
        this.f7490e = str;
    }

    public void setDistrictName(String str) {
        this.f7489d = str;
    }

    public void setProvince(String str) {
        this.f7487b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7486a);
        parcel.writeString(this.f7487b);
        parcel.writeString(this.f7488c);
        parcel.writeString(this.f7489d);
        parcel.writeString(this.f7490e);
    }

    protected WeatherSearchLocation(Parcel parcel) {
        this.f7486a = parcel.readString();
        this.f7487b = parcel.readString();
        this.f7488c = parcel.readString();
        this.f7489d = parcel.readString();
        this.f7490e = parcel.readString();
    }
}
