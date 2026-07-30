package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class PlaneInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<PlaneInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private double f6771f;

    /* renamed from: g, reason: collision with root package name */
    private String f6772g;

    /* renamed from: h, reason: collision with root package name */
    private double f6773h;

    /* renamed from: i, reason: collision with root package name */
    private String f6774i;

    static class a implements Parcelable.Creator<PlaneInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaneInfo createFromParcel(Parcel parcel) {
            return new PlaneInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaneInfo[] newArray(int i8) {
            return new PlaneInfo[i8];
        }
    }

    public PlaneInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAirlines() {
        return this.f6772g;
    }

    public String getBooking() {
        return this.f6774i;
    }

    public double getDiscount() {
        return this.f6771f;
    }

    public double getPrice() {
        return this.f6773h;
    }

    public void setAirlines(String str) {
        this.f6772g = str;
    }

    public void setBooking(String str) {
        this.f6774i = str;
    }

    public void setDiscount(double d8) {
        this.f6771f = d8;
    }

    public void setPrice(double d8) {
        this.f6773h = d8;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeDouble(this.f6771f);
        parcel.writeString(this.f6772g);
        parcel.writeDouble(this.f6773h);
        parcel.writeString(this.f6774i);
    }

    protected PlaneInfo(Parcel parcel) {
        super(parcel);
        this.f6771f = parcel.readDouble();
        this.f6772g = parcel.readString();
        this.f6773h = parcel.readDouble();
        this.f6774i = parcel.readString();
    }
}
