package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class TrainInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<TrainInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private double f6836f;

    /* renamed from: g, reason: collision with root package name */
    private String f6837g;

    static class a implements Parcelable.Creator<TrainInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainInfo createFromParcel(Parcel parcel) {
            return new TrainInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrainInfo[] newArray(int i8) {
            return new TrainInfo[i8];
        }
    }

    public TrainInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBooking() {
        return this.f6837g;
    }

    public double getPrice() {
        return this.f6836f;
    }

    public void setBooking(String str) {
        this.f6837g = str;
    }

    public void setPrice(double d8) {
        this.f6836f = d8;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeDouble(this.f6836f);
        parcel.writeString(this.f6837g);
    }

    protected TrainInfo(Parcel parcel) {
        super(parcel);
        this.f6836f = parcel.readDouble();
        this.f6837g = parcel.readString();
    }
}
