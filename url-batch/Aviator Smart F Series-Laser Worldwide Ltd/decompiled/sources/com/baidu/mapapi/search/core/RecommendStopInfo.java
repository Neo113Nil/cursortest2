package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class RecommendStopInfo implements Parcelable {
    public static final Parcelable.Creator<RecommendStopInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private String f6808a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6809b;

    /* renamed from: c, reason: collision with root package name */
    private double f6810c;

    /* renamed from: d, reason: collision with root package name */
    private String f6811d;

    /* renamed from: e, reason: collision with root package name */
    private String f6812e;

    static class a implements Parcelable.Creator<RecommendStopInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopInfo createFromParcel(Parcel parcel) {
            return new RecommendStopInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public RecommendStopInfo[] newArray(int i8) {
            return new RecommendStopInfo[i8];
        }
    }

    public RecommendStopInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAddress() {
        return this.f6812e;
    }

    public double getDistance() {
        return this.f6810c;
    }

    public String getId() {
        return this.f6811d;
    }

    public LatLng getLocation() {
        return this.f6809b;
    }

    public String getName() {
        return this.f6808a;
    }

    public void setAddress(String str) {
        this.f6812e = str;
    }

    public void setDistance(double d8) {
        this.f6810c = d8;
    }

    public void setId(String str) {
        this.f6811d = str;
    }

    public void setLocation(LatLng latLng) {
        this.f6809b = latLng;
    }

    public void setName(String str) {
        this.f6808a = str;
    }

    public String toString() {
        return "RecommendStopInfo{mName='" + this.f6808a + "', mLocation=" + this.f6809b + ", mDistance=" + this.f6810c + ", mId='" + this.f6811d + "', mAddress='" + this.f6812e + "'}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeString(this.f6808a);
        parcel.writeParcelable(this.f6809b, i8);
        parcel.writeDouble(this.f6810c);
        parcel.writeString(this.f6812e);
        parcel.writeString(this.f6811d);
    }

    protected RecommendStopInfo(Parcel parcel) {
        this.f6808a = parcel.readString();
        this.f6809b = (LatLng) parcel.readParcelable(LatLng.class.getClassLoader());
        this.f6810c = parcel.readDouble();
        this.f6812e = parcel.readString();
        this.f6811d = parcel.readString();
    }
}
