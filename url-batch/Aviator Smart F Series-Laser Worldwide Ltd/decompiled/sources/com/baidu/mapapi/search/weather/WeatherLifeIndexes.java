package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherLifeIndexes implements Parcelable {
    public static final Parcelable.Creator<WeatherLifeIndexes> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7453a;

    /* renamed from: b, reason: collision with root package name */
    private String f7454b;

    /* renamed from: c, reason: collision with root package name */
    private String f7455c;

    static class a implements Parcelable.Creator<WeatherLifeIndexes> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherLifeIndexes createFromParcel(Parcel parcel) {
            return new WeatherLifeIndexes(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherLifeIndexes[] newArray(int i8) {
            return new WeatherLifeIndexes[i8];
        }
    }

    public WeatherLifeIndexes() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBrief() {
        return this.f7454b;
    }

    public String getDetail() {
        return this.f7455c;
    }

    public String getName() {
        return this.f7453a;
    }

    public void setBrief(String str) {
        this.f7454b = str;
    }

    public void setDetail(String str) {
        this.f7455c = str;
    }

    public void setName(String str) {
        this.f7453a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(getName());
        parcel.writeString(getBrief());
        parcel.writeString(getDetail());
    }

    protected WeatherLifeIndexes(Parcel parcel) {
        setName(parcel.readString());
        setBrief(parcel.readString());
        setDetail(parcel.readString());
    }
}
