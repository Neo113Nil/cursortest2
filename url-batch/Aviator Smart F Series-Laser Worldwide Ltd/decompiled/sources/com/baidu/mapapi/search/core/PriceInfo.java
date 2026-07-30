package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class PriceInfo implements Parcelable {
    public static final Parcelable.Creator<PriceInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private int f6804a;

    /* renamed from: b, reason: collision with root package name */
    private double f6805b;

    static class a implements Parcelable.Creator<PriceInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PriceInfo createFromParcel(Parcel parcel) {
            return new PriceInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PriceInfo[] newArray(int i8) {
            return new PriceInfo[i8];
        }
    }

    public PriceInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public double getTicketPrice() {
        return this.f6805b;
    }

    public int getTicketType() {
        return this.f6804a;
    }

    public void setTicketPrice(double d8) {
        this.f6805b = d8;
    }

    public void setTicketType(int i8) {
        this.f6804a = i8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeInt(this.f6804a);
        parcel.writeDouble(this.f6805b);
    }

    protected PriceInfo(Parcel parcel) {
        this.f6804a = parcel.readInt();
        this.f6805b = parcel.readDouble();
    }
}
