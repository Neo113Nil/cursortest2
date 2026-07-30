package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class TaxiInfo implements Parcelable {
    public static final Parcelable.Creator<TaxiInfo> CREATOR = new a();

    /* renamed from: a, reason: collision with root package name */
    private float f6830a;

    /* renamed from: b, reason: collision with root package name */
    private String f6831b;

    /* renamed from: c, reason: collision with root package name */
    private int f6832c;

    /* renamed from: d, reason: collision with root package name */
    private int f6833d;

    /* renamed from: e, reason: collision with root package name */
    private float f6834e;

    /* renamed from: f, reason: collision with root package name */
    private float f6835f;

    static class a implements Parcelable.Creator<TaxiInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TaxiInfo[] newArray(int i8) {
            return new TaxiInfo[i8];
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TaxiInfo createFromParcel(Parcel parcel) {
            return new TaxiInfo(parcel);
        }
    }

    public TaxiInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getDesc() {
        return this.f6831b;
    }

    public int getDistance() {
        return this.f6832c;
    }

    public int getDuration() {
        return this.f6833d;
    }

    public float getPerKMPrice() {
        return this.f6834e;
    }

    public float getStartPrice() {
        return this.f6835f;
    }

    public float getTotalPrice() {
        return this.f6830a;
    }

    public void setDesc(String str) {
        this.f6831b = str;
    }

    public void setDistance(int i8) {
        this.f6832c = i8;
    }

    public void setDuration(int i8) {
        this.f6833d = i8;
    }

    public void setPerKMPrice(float f8) {
        this.f6834e = f8;
    }

    public void setStartPrice(float f8) {
        this.f6835f = f8;
    }

    public void setTotalPrice(float f8) {
        this.f6830a = f8;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i8) {
        parcel.writeFloat(this.f6830a);
        parcel.writeString(this.f6831b);
        parcel.writeInt(this.f6832c);
        parcel.writeInt(this.f6833d);
        parcel.writeFloat(this.f6834e);
        parcel.writeFloat(this.f6835f);
    }

    TaxiInfo(Parcel parcel) {
        this.f6830a = parcel.readFloat();
        this.f6831b = parcel.readString();
        this.f6832c = parcel.readInt();
        this.f6833d = parcel.readInt();
        this.f6834e = parcel.readFloat();
        this.f6835f = parcel.readFloat();
    }
}
