package com.baidu.mapapi.search.weather;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class WeatherSearchAlerts implements Parcelable {
    public static final Parcelable.Creator<WeatherSearchAlerts> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f7463a;

    /* renamed from: b, reason: collision with root package name */
    private String f7464b;

    /* renamed from: c, reason: collision with root package name */
    private String f7465c;

    /* renamed from: d, reason: collision with root package name */
    private String f7466d;

    static class a implements Parcelable.Creator<WeatherSearchAlerts> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchAlerts createFromParcel(Parcel parcel) {
            return new WeatherSearchAlerts(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public WeatherSearchAlerts[] newArray(int i8) {
            return new WeatherSearchAlerts[i8];
        }
    }

    public WeatherSearchAlerts() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.f7466d;
    }

    public String getLevel() {
        return this.f7464b;
    }

    public String getTitle() {
        return this.f7465c;
    }

    public String getType() {
        return this.f7463a;
    }

    public void setDesc(String str) {
        this.f7466d = str;
    }

    public void setLevel(String str) {
        this.f7464b = str;
    }

    public void setTitle(String str) {
        this.f7465c = str;
    }

    public void setType(String str) {
        this.f7463a = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f7463a);
        parcel.writeString(this.f7464b);
        parcel.writeString(this.f7465c);
        parcel.writeString(this.f7466d);
    }

    protected WeatherSearchAlerts(Parcel parcel) {
        this.f7463a = parcel.readString();
        this.f7464b = parcel.readString();
        this.f7465c = parcel.readString();
        this.f7466d = parcel.readString();
    }
}
