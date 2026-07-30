package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class CoachInfo extends TransitBaseInfo {
    public static final Parcelable.Creator<CoachInfo> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    private double f6765f;

    /* renamed from: g, reason: collision with root package name */
    private String f6766g;

    /* renamed from: h, reason: collision with root package name */
    private String f6767h;

    /* renamed from: i, reason: collision with root package name */
    private String f6768i;

    static class a implements Parcelable.Creator<CoachInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoachInfo createFromParcel(Parcel parcel) {
            return new CoachInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public CoachInfo[] newArray(int i8) {
            return new CoachInfo[i8];
        }
    }

    public CoachInfo() {
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getBooking() {
        return this.f6766g;
    }

    public double getPrice() {
        return this.f6765f;
    }

    public String getProviderName() {
        return this.f6767h;
    }

    public String getProviderUrl() {
        return this.f6768i;
    }

    public void setBooking(String str) {
        this.f6766g = str;
    }

    public void setPrice(double d8) {
        this.f6765f = d8;
    }

    public void setProviderName(String str) {
        this.f6767h = str;
    }

    public void setProviderUrl(String str) {
        this.f6768i = str;
    }

    @Override // com.baidu.mapapi.search.core.TransitBaseInfo, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        super.writeToParcel(parcel, i8);
        parcel.writeDouble(this.f6765f);
        parcel.writeString(this.f6766g);
        parcel.writeString(this.f6767h);
        parcel.writeString(this.f6768i);
    }

    protected CoachInfo(Parcel parcel) {
        super(parcel);
        this.f6765f = parcel.readDouble();
        this.f6766g = parcel.readString();
        this.f6767h = parcel.readString();
        this.f6768i = parcel.readString();
    }
}
